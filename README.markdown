## Tools

* Eclipse Juno  
  Version: 4.2.2  
  Build id: M20130204-1200
* Eclipse Modeling Framework Runtime and Tools  
  Version: 2.8.3.v20130125-0826  
  Build id: R201301250826
* Xtext SDK  
  Version: 2.4.1.v201304180855
* OCL (Object Constraint Language)  
  Version: 3.2.2.v20130128-1158  
  Build id: M201301281158

## Experiment

This is the Library example (from the [OCLInEcore
tutorial](http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.ocl.doc%2Fhelp%2FTutorials.html&cp=49_3_0&anchor=OCLinEcoreTutorial))

It consists of:

* An Ecore metamodel (the Library model).
* OCL contraints via OCLInEcore annotations.
* Textual concrete syntax (and editor) via Xtext.

## Caveats

**OCLInEcore validations**
* Change your `genmodel` properties to include `Operation Reflection = true`.

**Custom messages for OCL validations**

* Make YourModelValidator extend from `OCLinEcoreEObjectValidator` (and not
  `EObjectValidator`).
* Add

        @Override
        public void configure(Binder binder) {
          super.configure(binder);
          binder.bindConstant().annotatedWith(Names.named(org.eclipse.xtext.validation.CompositeEValidator.USE_EOBJECT_VALIDATOR)).to(false);
        }

    to `YourDslRuntimeModule`.
* Add the proper dependency (`org.eclipse.ocl.examples.xtext.oclinecore`) on every plugin.

## Problem

The following `My.library` file should fail (one copy and two loans):

    Library "Foo" {
      books{
        Book "b1" {
          copies 1
        }
      }
      
      loans {
        Loan {
          book b1
          member m1
        },

        Loan {
          book b1
          member m1
        }
      }
      
      members {
        Member "m1"
      }

    }

But the changes above have broken the validator:

    org.eclipse.xtext.validation.CompositeEValidator  - Error executing EValidator
    java.lang.ClassCastException: org.eclipse.emf.common.util.BasicEList cannot be cast to org.eclipse.emf.ecore.util.InternalEList
      at org.eclipse.emf.internal.cdo.CDOObjectImpl$CDOStoreSettingsImpl.isSet(CDOObjectImpl.java:1278)
      at org.eclipse.emf.internal.cdo.CDOObjectImpl.eDynamicIsSet(CDOObjectImpl.java:575)
      at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eIsSet(BasicEObjectImpl.java:1253)
      at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eIsSet(BasicEObjectImpl.java:1237)
      at org.eclipse.emf.ecore.util.EContentsEList$FeatureIteratorImpl.hasNext(EContentsEList.java:401)
      at org.eclipse.emf.ecore.util.EObjectValidator.validate_EveryReferenceIsContained(EObjectValidator.java:782)
      at tutorial.util.TutorialValidator.validateBook(TutorialValidator.java:122)
      at tutorial.util.TutorialValidator.validate(TutorialValidator.java:94)
      at org.eclipse.emf.ecore.util.EObjectValidator.validate(EObjectValidator.java:324)
      at org.eclipse.xtext.validation.CompositeEValidator.validate(CompositeEValidator.java:127)
      at org.eclipse.emf.ecore.util.Diagnostician.validate(Diagnostician.java:159)
      at org.eclipse.emf.ecore.util.Diagnostician.validate(Diagnostician.java:137)
      at org.eclipse.xtext.validation.CancelableDiagnostician.validate(CancelableDiagnostician.java:36)
      at org.eclipse.emf.ecore.util.Diagnostician.doValidateContents(Diagnostician.java:174)
      at org.eclipse.xtext.validation.CancelableDiagnostician.doValidateContents(CancelableDiagnostician.java:48)
      at org.eclipse.emf.ecore.util.Diagnostician.validate(Diagnostician.java:162)
      at org.eclipse.emf.ecore.util.Diagnostician.validate(Diagnostician.java:137)
      at org.eclipse.xtext.validation.CancelableDiagnostician.validate(CancelableDiagnostician.java:36)
      at org.eclipse.emf.ecore.util.Diagnostician.validate(Diagnostician.java:120)
      at org.eclipse.xtext.validation.ResourceValidatorImpl.validate(ResourceValidatorImpl.java:140)
      at org.eclipse.xtext.validation.ResourceValidatorImpl.validate(ResourceValidatorImpl.java:118)
      at org.eclipse.xtext.validation.ResourceValidatorImpl.validate(ResourceValidatorImpl.java:98)
      at org.eclipse.xtext.ui.validation.DefaultResourceUIValidatorExtension.addMarkers(DefaultResourceUIValidatorExtension.java:60)
      at org.eclipse.xtext.ui.validation.DefaultResourceUIValidatorExtension.updateValidationMarkers(DefaultResourceUIValidatorExtension.java:45)
      at org.eclipse.xtext.builder.builderState.MarkerUpdaterImpl.processDelta(MarkerUpdaterImpl.java:72)
      at org.eclipse.xtext.builder.builderState.MarkerUpdaterImpl.updateMarkers(MarkerUpdaterImpl.java:57)
      at org.eclipse.xtext.builder.builderState.AbstractBuilderState.updateMarkers(AbstractBuilderState.java:73)
      at org.eclipse.xtext.builder.clustering.ClusteringBuilderState.doUpdate(ClusteringBuilderState.java:259)
      at org.eclipse.xtext.builder.builderState.AbstractBuilderState.update(AbstractBuilderState.java:104)
      at org.eclipse.xtext.builder.impl.XtextBuilder.doBuild(XtextBuilder.java:168)
      at org.eclipse.xtext.builder.impl.XtextBuilder.incrementalBuild(XtextBuilder.java:146)
      at org.eclipse.xtext.builder.impl.XtextBuilder.build(XtextBuilder.java:95)
      at org.eclipse.core.internal.events.BuildManager$2.run(BuildManager.java:726)
      at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
      at org.eclipse.core.internal.events.BuildManager.basicBuild(BuildManager.java:199)
      at org.eclipse.core.internal.events.BuildManager.basicBuild(BuildManager.java:239)
      at org.eclipse.core.internal.events.BuildManager$1.run(BuildManager.java:292)
      at org.eclipse.core.runtime.SafeRunner.run(SafeRunner.java:42)
      at org.eclipse.core.internal.events.BuildManager.basicBuild(BuildManager.java:295)
      at org.eclipse.core.internal.events.BuildManager.basicBuildLoop(BuildManager.java:351)
      at org.eclipse.core.internal.events.BuildManager.build(BuildManager.java:374)
      at org.eclipse.core.internal.events.AutoBuildJob.doBuild(AutoBuildJob.java:143)
      at org.eclipse.core.internal.events.AutoBuildJob.run(AutoBuildJob.java:241)
      at org.eclipse.core.internal.jobs.Worker.run(Worker.java:53)

If I remove only the overridden method, I still have the error, but the validation
works (with no custom message)

    The 'SufficientCopies' constraint is violated on
    'tutorial.impl.BookImpl@120307ac{platform:/resource/foo/My.library#//@books.0}'

## References:

* http://www.slideshare.net/EdWillink/enrich-your-models-with-ocl
* http://www.eclipse.org/forums/index.php/mv/msg/209565/672370/#msg_672370
* http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.ocl.doc%2Fhelp%2FIntegration.html&cp=42_1_7_1&anchor=Integration-Messages.
* http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.ocl.doc%2Fhelp%2FPivotProgrammersGuide.html&anchor=OCLinEcoreEObjectValidator

