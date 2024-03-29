/*
 * generated by Xtext
 */
package org.eclipse.oclinecore.tutorial.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.eclipse.oclinecore.tutorial.xtext.ui.internal.LibraryDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LibraryDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return LibraryDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return LibraryDslActivator.getInstance().getInjector(LibraryDslActivator.ORG_ECLIPSE_OCLINECORE_TUTORIAL_XTEXT_LIBRARYDSL);
	}
	
}
