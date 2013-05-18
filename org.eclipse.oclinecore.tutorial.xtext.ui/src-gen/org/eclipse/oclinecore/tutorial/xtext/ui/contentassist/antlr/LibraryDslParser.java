/*
* generated by Xtext
*/
package org.eclipse.oclinecore.tutorial.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.oclinecore.tutorial.xtext.services.LibraryDslGrammarAccess;

public class LibraryDslParser extends AbstractContentAssistParser {
	
	@Inject
	private LibraryDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.oclinecore.tutorial.xtext.ui.contentassist.antlr.internal.InternalLibraryDslParser createParser() {
		org.eclipse.oclinecore.tutorial.xtext.ui.contentassist.antlr.internal.InternalLibraryDslParser result = new org.eclipse.oclinecore.tutorial.xtext.ui.contentassist.antlr.internal.InternalLibraryDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getLibraryAccess().getGroup(), "rule__Library__Group__0");
					put(grammarAccess.getLibraryAccess().getGroup_4(), "rule__Library__Group_4__0");
					put(grammarAccess.getLibraryAccess().getGroup_4_3(), "rule__Library__Group_4_3__0");
					put(grammarAccess.getLibraryAccess().getGroup_5(), "rule__Library__Group_5__0");
					put(grammarAccess.getLibraryAccess().getGroup_5_3(), "rule__Library__Group_5_3__0");
					put(grammarAccess.getLibraryAccess().getGroup_6(), "rule__Library__Group_6__0");
					put(grammarAccess.getLibraryAccess().getGroup_6_3(), "rule__Library__Group_6_3__0");
					put(grammarAccess.getBookAccess().getGroup(), "rule__Book__Group__0");
					put(grammarAccess.getLoanAccess().getGroup(), "rule__Loan__Group__0");
					put(grammarAccess.getMemberAccess().getGroup(), "rule__Member__Group__0");
					put(grammarAccess.getEBigIntegerAccess().getGroup(), "rule__EBigInteger__Group__0");
					put(grammarAccess.getLibraryAccess().getNameAssignment_2(), "rule__Library__NameAssignment_2");
					put(grammarAccess.getLibraryAccess().getBooksAssignment_4_2(), "rule__Library__BooksAssignment_4_2");
					put(grammarAccess.getLibraryAccess().getBooksAssignment_4_3_1(), "rule__Library__BooksAssignment_4_3_1");
					put(grammarAccess.getLibraryAccess().getLoansAssignment_5_2(), "rule__Library__LoansAssignment_5_2");
					put(grammarAccess.getLibraryAccess().getLoansAssignment_5_3_1(), "rule__Library__LoansAssignment_5_3_1");
					put(grammarAccess.getLibraryAccess().getMembersAssignment_6_2(), "rule__Library__MembersAssignment_6_2");
					put(grammarAccess.getLibraryAccess().getMembersAssignment_6_3_1(), "rule__Library__MembersAssignment_6_3_1");
					put(grammarAccess.getBookAccess().getNameAssignment_1(), "rule__Book__NameAssignment_1");
					put(grammarAccess.getBookAccess().getCopiesAssignment_4(), "rule__Book__CopiesAssignment_4");
					put(grammarAccess.getLoanAccess().getBookAssignment_3(), "rule__Loan__BookAssignment_3");
					put(grammarAccess.getLoanAccess().getMemberAssignment_5(), "rule__Loan__MemberAssignment_5");
					put(grammarAccess.getMemberAccess().getNameAssignment_2(), "rule__Member__NameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.oclinecore.tutorial.xtext.ui.contentassist.antlr.internal.InternalLibraryDslParser typedParser = (org.eclipse.oclinecore.tutorial.xtext.ui.contentassist.antlr.internal.InternalLibraryDslParser) parser;
			typedParser.entryRuleLibrary();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LibraryDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LibraryDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
