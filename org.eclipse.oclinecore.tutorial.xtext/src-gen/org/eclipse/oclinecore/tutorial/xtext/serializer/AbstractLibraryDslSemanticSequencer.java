package org.eclipse.oclinecore.tutorial.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.oclinecore.tutorial.xtext.services.LibraryDslGrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import tutorial.Book;
import tutorial.Library;
import tutorial.Loan;
import tutorial.Member;
import tutorial.TutorialPackage;

@SuppressWarnings("all")
public abstract class AbstractLibraryDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LibraryDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TutorialPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TutorialPackage.BOOK:
				if(context == grammarAccess.getBookRule()) {
					sequence_Book(context, (Book) semanticObject); 
					return; 
				}
				else break;
			case TutorialPackage.LIBRARY:
				if(context == grammarAccess.getLibraryRule()) {
					sequence_Library(context, (Library) semanticObject); 
					return; 
				}
				else break;
			case TutorialPackage.LOAN:
				if(context == grammarAccess.getLoanRule()) {
					sequence_Loan(context, (Loan) semanticObject); 
					return; 
				}
				else break;
			case TutorialPackage.MEMBER:
				if(context == grammarAccess.getMemberRule()) {
					sequence_Member(context, (Member) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString copies=EBigInteger)
	 */
	protected void sequence_Book(EObject context, Book semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (books+=Book books+=Book*)? (loans+=Loan loans+=Loan*)? (members+=Member members+=Member*)?)
	 */
	protected void sequence_Library(EObject context, Library semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (book=[Book|EString] member=[Member|EString])
	 */
	protected void sequence_Loan(EObject context, Loan semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, TutorialPackage.Literals.LOAN__BOOK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TutorialPackage.Literals.LOAN__BOOK));
			if(transientValues.isValueTransient((EObject)semanticObject, TutorialPackage.Literals.LOAN__MEMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, TutorialPackage.Literals.LOAN__MEMBER));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getLoanAccess().getBookBookEStringParserRuleCall_3_0_1(), semanticObject.getBook());
		feeder.accept(grammarAccess.getLoanAccess().getMemberMemberEStringParserRuleCall_5_0_1(), semanticObject.getMember());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Member(EObject context, Member semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
}
