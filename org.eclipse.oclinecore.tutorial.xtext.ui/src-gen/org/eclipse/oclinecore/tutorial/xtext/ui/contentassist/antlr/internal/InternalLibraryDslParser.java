package org.eclipse.oclinecore.tutorial.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.oclinecore.tutorial.xtext.services.LibraryDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLibraryDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Library'", "'{'", "'}'", "'books'", "','", "'loans'", "'members'", "'Book'", "'copies'", "'Loan'", "'book'", "'member'", "'Member'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLibraryDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLibraryDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLibraryDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g"; }


     
     	private LibraryDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LibraryDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleLibrary"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:60:1: entryRuleLibrary : ruleLibrary EOF ;
    public final void entryRuleLibrary() throws RecognitionException {
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:61:1: ( ruleLibrary EOF )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:62:1: ruleLibrary EOF
            {
             before(grammarAccess.getLibraryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLibrary_in_entryRuleLibrary61);
            ruleLibrary();

            state._fsp--;

             after(grammarAccess.getLibraryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLibrary68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:69:1: ruleLibrary : ( ( rule__Library__Group__0 ) ) ;
    public final void ruleLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:73:2: ( ( ( rule__Library__Group__0 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:74:1: ( ( rule__Library__Group__0 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:74:1: ( ( rule__Library__Group__0 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:75:1: ( rule__Library__Group__0 )
            {
             before(grammarAccess.getLibraryAccess().getGroup()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:76:1: ( rule__Library__Group__0 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:76:2: rule__Library__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__0_in_ruleLibrary94);
            rule__Library__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleEString"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:89:1: ( ruleEString EOF )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString121);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:104:1: ( rule__EString__Alternatives )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString154);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBook"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:116:1: entryRuleBook : ruleBook EOF ;
    public final void entryRuleBook() throws RecognitionException {
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:117:1: ( ruleBook EOF )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:118:1: ruleBook EOF
            {
             before(grammarAccess.getBookRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBook_in_entryRuleBook181);
            ruleBook();

            state._fsp--;

             after(grammarAccess.getBookRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBook188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:125:1: ruleBook : ( ( rule__Book__Group__0 ) ) ;
    public final void ruleBook() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:129:2: ( ( ( rule__Book__Group__0 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:130:1: ( ( rule__Book__Group__0 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:130:1: ( ( rule__Book__Group__0 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:131:1: ( rule__Book__Group__0 )
            {
             before(grammarAccess.getBookAccess().getGroup()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:132:1: ( rule__Book__Group__0 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:132:2: rule__Book__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Book__Group__0_in_ruleBook214);
            rule__Book__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleLoan"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:144:1: entryRuleLoan : ruleLoan EOF ;
    public final void entryRuleLoan() throws RecognitionException {
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:145:1: ( ruleLoan EOF )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:146:1: ruleLoan EOF
            {
             before(grammarAccess.getLoanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLoan_in_entryRuleLoan241);
            ruleLoan();

            state._fsp--;

             after(grammarAccess.getLoanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLoan248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoan"


    // $ANTLR start "ruleLoan"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:153:1: ruleLoan : ( ( rule__Loan__Group__0 ) ) ;
    public final void ruleLoan() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:157:2: ( ( ( rule__Loan__Group__0 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:158:1: ( ( rule__Loan__Group__0 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:158:1: ( ( rule__Loan__Group__0 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:159:1: ( rule__Loan__Group__0 )
            {
             before(grammarAccess.getLoanAccess().getGroup()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:160:1: ( rule__Loan__Group__0 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:160:2: rule__Loan__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__0_in_ruleLoan274);
            rule__Loan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoan"


    // $ANTLR start "entryRuleMember"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:172:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:173:1: ( ruleMember EOF )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:174:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMember_in_entryRuleMember301);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMember308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:181:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:185:2: ( ( ( rule__Member__Group__0 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:186:1: ( ( rule__Member__Group__0 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:186:1: ( ( rule__Member__Group__0 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:187:1: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:188:1: ( rule__Member__Group__0 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:188:2: rule__Member__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Member__Group__0_in_ruleMember334);
            rule__Member__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleEBigInteger"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:200:1: entryRuleEBigInteger : ruleEBigInteger EOF ;
    public final void entryRuleEBigInteger() throws RecognitionException {
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:201:1: ( ruleEBigInteger EOF )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:202:1: ruleEBigInteger EOF
            {
             before(grammarAccess.getEBigIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_entryRuleEBigInteger361);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getEBigIntegerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBigInteger368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBigInteger"


    // $ANTLR start "ruleEBigInteger"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:209:1: ruleEBigInteger : ( ( rule__EBigInteger__Group__0 ) ) ;
    public final void ruleEBigInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:213:2: ( ( ( rule__EBigInteger__Group__0 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:214:1: ( ( rule__EBigInteger__Group__0 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:214:1: ( ( rule__EBigInteger__Group__0 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:215:1: ( rule__EBigInteger__Group__0 )
            {
             before(grammarAccess.getEBigIntegerAccess().getGroup()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:216:1: ( rule__EBigInteger__Group__0 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:216:2: rule__EBigInteger__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigInteger__Group__0_in_ruleEBigInteger394);
            rule__EBigInteger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEBigIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBigInteger"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:228:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:232:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:233:1: ( RULE_STRING )
                    {
                    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:233:1: ( RULE_STRING )
                    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:234:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives430); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:239:6: ( RULE_ID )
                    {
                    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:239:6: ( RULE_ID )
                    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:240:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives447); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Library__Group__0"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:252:1: rule__Library__Group__0 : rule__Library__Group__0__Impl rule__Library__Group__1 ;
    public final void rule__Library__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:256:1: ( rule__Library__Group__0__Impl rule__Library__Group__1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:257:2: rule__Library__Group__0__Impl rule__Library__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__0477);
            rule__Library__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__1_in_rule__Library__Group__0480);
            rule__Library__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__0"


    // $ANTLR start "rule__Library__Group__0__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:264:1: rule__Library__Group__0__Impl : ( () ) ;
    public final void rule__Library__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:268:1: ( ( () ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:269:1: ( () )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:269:1: ( () )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:270:1: ()
            {
             before(grammarAccess.getLibraryAccess().getLibraryAction_0()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:271:1: ()
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:273:1: 
            {
            }

             after(grammarAccess.getLibraryAccess().getLibraryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__0__Impl"


    // $ANTLR start "rule__Library__Group__1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:283:1: rule__Library__Group__1 : rule__Library__Group__1__Impl rule__Library__Group__2 ;
    public final void rule__Library__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:287:1: ( rule__Library__Group__1__Impl rule__Library__Group__2 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:288:2: rule__Library__Group__1__Impl rule__Library__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__1538);
            rule__Library__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__2_in_rule__Library__Group__1541);
            rule__Library__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__1"


    // $ANTLR start "rule__Library__Group__1__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:295:1: rule__Library__Group__1__Impl : ( 'Library' ) ;
    public final void rule__Library__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:299:1: ( ( 'Library' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:300:1: ( 'Library' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:300:1: ( 'Library' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:301:1: 'Library'
            {
             before(grammarAccess.getLibraryAccess().getLibraryKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Library__Group__1__Impl569); 
             after(grammarAccess.getLibraryAccess().getLibraryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__1__Impl"


    // $ANTLR start "rule__Library__Group__2"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:314:1: rule__Library__Group__2 : rule__Library__Group__2__Impl rule__Library__Group__3 ;
    public final void rule__Library__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:318:1: ( rule__Library__Group__2__Impl rule__Library__Group__3 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:319:2: rule__Library__Group__2__Impl rule__Library__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__2600);
            rule__Library__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__3_in_rule__Library__Group__2603);
            rule__Library__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__2"


    // $ANTLR start "rule__Library__Group__2__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:326:1: rule__Library__Group__2__Impl : ( ( rule__Library__NameAssignment_2 ) ) ;
    public final void rule__Library__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:330:1: ( ( ( rule__Library__NameAssignment_2 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:331:1: ( ( rule__Library__NameAssignment_2 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:331:1: ( ( rule__Library__NameAssignment_2 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:332:1: ( rule__Library__NameAssignment_2 )
            {
             before(grammarAccess.getLibraryAccess().getNameAssignment_2()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:333:1: ( rule__Library__NameAssignment_2 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:333:2: rule__Library__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__NameAssignment_2_in_rule__Library__Group__2__Impl630);
            rule__Library__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__2__Impl"


    // $ANTLR start "rule__Library__Group__3"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:343:1: rule__Library__Group__3 : rule__Library__Group__3__Impl rule__Library__Group__4 ;
    public final void rule__Library__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:347:1: ( rule__Library__Group__3__Impl rule__Library__Group__4 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:348:2: rule__Library__Group__3__Impl rule__Library__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__3660);
            rule__Library__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__4_in_rule__Library__Group__3663);
            rule__Library__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__3"


    // $ANTLR start "rule__Library__Group__3__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:355:1: rule__Library__Group__3__Impl : ( '{' ) ;
    public final void rule__Library__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:359:1: ( ( '{' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:360:1: ( '{' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:360:1: ( '{' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:361:1: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Library__Group__3__Impl691); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__3__Impl"


    // $ANTLR start "rule__Library__Group__4"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:374:1: rule__Library__Group__4 : rule__Library__Group__4__Impl rule__Library__Group__5 ;
    public final void rule__Library__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:378:1: ( rule__Library__Group__4__Impl rule__Library__Group__5 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:379:2: rule__Library__Group__4__Impl rule__Library__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__4__Impl_in_rule__Library__Group__4722);
            rule__Library__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__5_in_rule__Library__Group__4725);
            rule__Library__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__4"


    // $ANTLR start "rule__Library__Group__4__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:386:1: rule__Library__Group__4__Impl : ( ( rule__Library__Group_4__0 )? ) ;
    public final void rule__Library__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:390:1: ( ( ( rule__Library__Group_4__0 )? ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:391:1: ( ( rule__Library__Group_4__0 )? )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:391:1: ( ( rule__Library__Group_4__0 )? )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:392:1: ( rule__Library__Group_4__0 )?
            {
             before(grammarAccess.getLibraryAccess().getGroup_4()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:393:1: ( rule__Library__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:393:2: rule__Library__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4__0_in_rule__Library__Group__4__Impl752);
                    rule__Library__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__4__Impl"


    // $ANTLR start "rule__Library__Group__5"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:403:1: rule__Library__Group__5 : rule__Library__Group__5__Impl rule__Library__Group__6 ;
    public final void rule__Library__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:407:1: ( rule__Library__Group__5__Impl rule__Library__Group__6 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:408:2: rule__Library__Group__5__Impl rule__Library__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__5__Impl_in_rule__Library__Group__5783);
            rule__Library__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__6_in_rule__Library__Group__5786);
            rule__Library__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__5"


    // $ANTLR start "rule__Library__Group__5__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:415:1: rule__Library__Group__5__Impl : ( ( rule__Library__Group_5__0 )? ) ;
    public final void rule__Library__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:419:1: ( ( ( rule__Library__Group_5__0 )? ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:420:1: ( ( rule__Library__Group_5__0 )? )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:420:1: ( ( rule__Library__Group_5__0 )? )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:421:1: ( rule__Library__Group_5__0 )?
            {
             before(grammarAccess.getLibraryAccess().getGroup_5()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:422:1: ( rule__Library__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:422:2: rule__Library__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5__0_in_rule__Library__Group__5__Impl813);
                    rule__Library__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__5__Impl"


    // $ANTLR start "rule__Library__Group__6"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:432:1: rule__Library__Group__6 : rule__Library__Group__6__Impl rule__Library__Group__7 ;
    public final void rule__Library__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:436:1: ( rule__Library__Group__6__Impl rule__Library__Group__7 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:437:2: rule__Library__Group__6__Impl rule__Library__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__6__Impl_in_rule__Library__Group__6844);
            rule__Library__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__7_in_rule__Library__Group__6847);
            rule__Library__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__6"


    // $ANTLR start "rule__Library__Group__6__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:444:1: rule__Library__Group__6__Impl : ( ( rule__Library__Group_6__0 )? ) ;
    public final void rule__Library__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:448:1: ( ( ( rule__Library__Group_6__0 )? ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:449:1: ( ( rule__Library__Group_6__0 )? )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:449:1: ( ( rule__Library__Group_6__0 )? )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:450:1: ( rule__Library__Group_6__0 )?
            {
             before(grammarAccess.getLibraryAccess().getGroup_6()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:451:1: ( rule__Library__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:451:2: rule__Library__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6__0_in_rule__Library__Group__6__Impl874);
                    rule__Library__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__6__Impl"


    // $ANTLR start "rule__Library__Group__7"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:461:1: rule__Library__Group__7 : rule__Library__Group__7__Impl ;
    public final void rule__Library__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:465:1: ( rule__Library__Group__7__Impl )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:466:2: rule__Library__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group__7__Impl_in_rule__Library__Group__7905);
            rule__Library__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__7"


    // $ANTLR start "rule__Library__Group__7__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:472:1: rule__Library__Group__7__Impl : ( '}' ) ;
    public final void rule__Library__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:476:1: ( ( '}' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:477:1: ( '}' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:477:1: ( '}' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:478:1: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Library__Group__7__Impl933); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__7__Impl"


    // $ANTLR start "rule__Library__Group_4__0"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:507:1: rule__Library__Group_4__0 : rule__Library__Group_4__0__Impl rule__Library__Group_4__1 ;
    public final void rule__Library__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:511:1: ( rule__Library__Group_4__0__Impl rule__Library__Group_4__1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:512:2: rule__Library__Group_4__0__Impl rule__Library__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4__0__Impl_in_rule__Library__Group_4__0980);
            rule__Library__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4__1_in_rule__Library__Group_4__0983);
            rule__Library__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4__0"


    // $ANTLR start "rule__Library__Group_4__0__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:519:1: rule__Library__Group_4__0__Impl : ( 'books' ) ;
    public final void rule__Library__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:523:1: ( ( 'books' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:524:1: ( 'books' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:524:1: ( 'books' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:525:1: 'books'
            {
             before(grammarAccess.getLibraryAccess().getBooksKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Library__Group_4__0__Impl1011); 
             after(grammarAccess.getLibraryAccess().getBooksKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4__0__Impl"


    // $ANTLR start "rule__Library__Group_4__1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:538:1: rule__Library__Group_4__1 : rule__Library__Group_4__1__Impl rule__Library__Group_4__2 ;
    public final void rule__Library__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:542:1: ( rule__Library__Group_4__1__Impl rule__Library__Group_4__2 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:543:2: rule__Library__Group_4__1__Impl rule__Library__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4__1__Impl_in_rule__Library__Group_4__11042);
            rule__Library__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4__2_in_rule__Library__Group_4__11045);
            rule__Library__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4__1"


    // $ANTLR start "rule__Library__Group_4__1__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:550:1: rule__Library__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Library__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:554:1: ( ( '{' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:555:1: ( '{' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:555:1: ( '{' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:556:1: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Library__Group_4__1__Impl1073); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4__1__Impl"


    // $ANTLR start "rule__Library__Group_4__2"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:569:1: rule__Library__Group_4__2 : rule__Library__Group_4__2__Impl rule__Library__Group_4__3 ;
    public final void rule__Library__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:573:1: ( rule__Library__Group_4__2__Impl rule__Library__Group_4__3 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:574:2: rule__Library__Group_4__2__Impl rule__Library__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4__2__Impl_in_rule__Library__Group_4__21104);
            rule__Library__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4__3_in_rule__Library__Group_4__21107);
            rule__Library__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4__2"


    // $ANTLR start "rule__Library__Group_4__2__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:581:1: rule__Library__Group_4__2__Impl : ( ( rule__Library__BooksAssignment_4_2 ) ) ;
    public final void rule__Library__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:585:1: ( ( ( rule__Library__BooksAssignment_4_2 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:586:1: ( ( rule__Library__BooksAssignment_4_2 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:586:1: ( ( rule__Library__BooksAssignment_4_2 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:587:1: ( rule__Library__BooksAssignment_4_2 )
            {
             before(grammarAccess.getLibraryAccess().getBooksAssignment_4_2()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:588:1: ( rule__Library__BooksAssignment_4_2 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:588:2: rule__Library__BooksAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__BooksAssignment_4_2_in_rule__Library__Group_4__2__Impl1134);
            rule__Library__BooksAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getBooksAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4__2__Impl"


    // $ANTLR start "rule__Library__Group_4__3"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:598:1: rule__Library__Group_4__3 : rule__Library__Group_4__3__Impl rule__Library__Group_4__4 ;
    public final void rule__Library__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:602:1: ( rule__Library__Group_4__3__Impl rule__Library__Group_4__4 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:603:2: rule__Library__Group_4__3__Impl rule__Library__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4__3__Impl_in_rule__Library__Group_4__31164);
            rule__Library__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4__4_in_rule__Library__Group_4__31167);
            rule__Library__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4__3"


    // $ANTLR start "rule__Library__Group_4__3__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:610:1: rule__Library__Group_4__3__Impl : ( ( rule__Library__Group_4_3__0 )* ) ;
    public final void rule__Library__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:614:1: ( ( ( rule__Library__Group_4_3__0 )* ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:615:1: ( ( rule__Library__Group_4_3__0 )* )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:615:1: ( ( rule__Library__Group_4_3__0 )* )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:616:1: ( rule__Library__Group_4_3__0 )*
            {
             before(grammarAccess.getLibraryAccess().getGroup_4_3()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:617:1: ( rule__Library__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:617:2: rule__Library__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4_3__0_in_rule__Library__Group_4__3__Impl1194);
            	    rule__Library__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4__3__Impl"


    // $ANTLR start "rule__Library__Group_4__4"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:627:1: rule__Library__Group_4__4 : rule__Library__Group_4__4__Impl ;
    public final void rule__Library__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:631:1: ( rule__Library__Group_4__4__Impl )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:632:2: rule__Library__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4__4__Impl_in_rule__Library__Group_4__41225);
            rule__Library__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4__4"


    // $ANTLR start "rule__Library__Group_4__4__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:638:1: rule__Library__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Library__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:642:1: ( ( '}' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:643:1: ( '}' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:643:1: ( '}' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:644:1: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Library__Group_4__4__Impl1253); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4__4__Impl"


    // $ANTLR start "rule__Library__Group_4_3__0"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:667:1: rule__Library__Group_4_3__0 : rule__Library__Group_4_3__0__Impl rule__Library__Group_4_3__1 ;
    public final void rule__Library__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:671:1: ( rule__Library__Group_4_3__0__Impl rule__Library__Group_4_3__1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:672:2: rule__Library__Group_4_3__0__Impl rule__Library__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4_3__0__Impl_in_rule__Library__Group_4_3__01294);
            rule__Library__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4_3__1_in_rule__Library__Group_4_3__01297);
            rule__Library__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4_3__0"


    // $ANTLR start "rule__Library__Group_4_3__0__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:679:1: rule__Library__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Library__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:683:1: ( ( ',' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:684:1: ( ',' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:684:1: ( ',' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:685:1: ','
            {
             before(grammarAccess.getLibraryAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Library__Group_4_3__0__Impl1325); 
             after(grammarAccess.getLibraryAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4_3__0__Impl"


    // $ANTLR start "rule__Library__Group_4_3__1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:698:1: rule__Library__Group_4_3__1 : rule__Library__Group_4_3__1__Impl ;
    public final void rule__Library__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:702:1: ( rule__Library__Group_4_3__1__Impl )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:703:2: rule__Library__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_4_3__1__Impl_in_rule__Library__Group_4_3__11356);
            rule__Library__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4_3__1"


    // $ANTLR start "rule__Library__Group_4_3__1__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:709:1: rule__Library__Group_4_3__1__Impl : ( ( rule__Library__BooksAssignment_4_3_1 ) ) ;
    public final void rule__Library__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:713:1: ( ( ( rule__Library__BooksAssignment_4_3_1 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:714:1: ( ( rule__Library__BooksAssignment_4_3_1 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:714:1: ( ( rule__Library__BooksAssignment_4_3_1 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:715:1: ( rule__Library__BooksAssignment_4_3_1 )
            {
             before(grammarAccess.getLibraryAccess().getBooksAssignment_4_3_1()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:716:1: ( rule__Library__BooksAssignment_4_3_1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:716:2: rule__Library__BooksAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__BooksAssignment_4_3_1_in_rule__Library__Group_4_3__1__Impl1383);
            rule__Library__BooksAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getBooksAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_4_3__1__Impl"


    // $ANTLR start "rule__Library__Group_5__0"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:730:1: rule__Library__Group_5__0 : rule__Library__Group_5__0__Impl rule__Library__Group_5__1 ;
    public final void rule__Library__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:734:1: ( rule__Library__Group_5__0__Impl rule__Library__Group_5__1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:735:2: rule__Library__Group_5__0__Impl rule__Library__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5__0__Impl_in_rule__Library__Group_5__01417);
            rule__Library__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5__1_in_rule__Library__Group_5__01420);
            rule__Library__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__0"


    // $ANTLR start "rule__Library__Group_5__0__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:742:1: rule__Library__Group_5__0__Impl : ( 'loans' ) ;
    public final void rule__Library__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:746:1: ( ( 'loans' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:747:1: ( 'loans' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:747:1: ( 'loans' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:748:1: 'loans'
            {
             before(grammarAccess.getLibraryAccess().getLoansKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Library__Group_5__0__Impl1448); 
             after(grammarAccess.getLibraryAccess().getLoansKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__0__Impl"


    // $ANTLR start "rule__Library__Group_5__1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:761:1: rule__Library__Group_5__1 : rule__Library__Group_5__1__Impl rule__Library__Group_5__2 ;
    public final void rule__Library__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:765:1: ( rule__Library__Group_5__1__Impl rule__Library__Group_5__2 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:766:2: rule__Library__Group_5__1__Impl rule__Library__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5__1__Impl_in_rule__Library__Group_5__11479);
            rule__Library__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5__2_in_rule__Library__Group_5__11482);
            rule__Library__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__1"


    // $ANTLR start "rule__Library__Group_5__1__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:773:1: rule__Library__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Library__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:777:1: ( ( '{' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:778:1: ( '{' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:778:1: ( '{' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:779:1: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Library__Group_5__1__Impl1510); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__1__Impl"


    // $ANTLR start "rule__Library__Group_5__2"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:792:1: rule__Library__Group_5__2 : rule__Library__Group_5__2__Impl rule__Library__Group_5__3 ;
    public final void rule__Library__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:796:1: ( rule__Library__Group_5__2__Impl rule__Library__Group_5__3 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:797:2: rule__Library__Group_5__2__Impl rule__Library__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5__2__Impl_in_rule__Library__Group_5__21541);
            rule__Library__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5__3_in_rule__Library__Group_5__21544);
            rule__Library__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__2"


    // $ANTLR start "rule__Library__Group_5__2__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:804:1: rule__Library__Group_5__2__Impl : ( ( rule__Library__LoansAssignment_5_2 ) ) ;
    public final void rule__Library__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:808:1: ( ( ( rule__Library__LoansAssignment_5_2 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:809:1: ( ( rule__Library__LoansAssignment_5_2 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:809:1: ( ( rule__Library__LoansAssignment_5_2 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:810:1: ( rule__Library__LoansAssignment_5_2 )
            {
             before(grammarAccess.getLibraryAccess().getLoansAssignment_5_2()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:811:1: ( rule__Library__LoansAssignment_5_2 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:811:2: rule__Library__LoansAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__LoansAssignment_5_2_in_rule__Library__Group_5__2__Impl1571);
            rule__Library__LoansAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getLoansAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__2__Impl"


    // $ANTLR start "rule__Library__Group_5__3"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:821:1: rule__Library__Group_5__3 : rule__Library__Group_5__3__Impl rule__Library__Group_5__4 ;
    public final void rule__Library__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:825:1: ( rule__Library__Group_5__3__Impl rule__Library__Group_5__4 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:826:2: rule__Library__Group_5__3__Impl rule__Library__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5__3__Impl_in_rule__Library__Group_5__31601);
            rule__Library__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5__4_in_rule__Library__Group_5__31604);
            rule__Library__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__3"


    // $ANTLR start "rule__Library__Group_5__3__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:833:1: rule__Library__Group_5__3__Impl : ( ( rule__Library__Group_5_3__0 )* ) ;
    public final void rule__Library__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:837:1: ( ( ( rule__Library__Group_5_3__0 )* ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:838:1: ( ( rule__Library__Group_5_3__0 )* )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:838:1: ( ( rule__Library__Group_5_3__0 )* )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:839:1: ( rule__Library__Group_5_3__0 )*
            {
             before(grammarAccess.getLibraryAccess().getGroup_5_3()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:840:1: ( rule__Library__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:840:2: rule__Library__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5_3__0_in_rule__Library__Group_5__3__Impl1631);
            	    rule__Library__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__3__Impl"


    // $ANTLR start "rule__Library__Group_5__4"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:850:1: rule__Library__Group_5__4 : rule__Library__Group_5__4__Impl ;
    public final void rule__Library__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:854:1: ( rule__Library__Group_5__4__Impl )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:855:2: rule__Library__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5__4__Impl_in_rule__Library__Group_5__41662);
            rule__Library__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__4"


    // $ANTLR start "rule__Library__Group_5__4__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:861:1: rule__Library__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Library__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:865:1: ( ( '}' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:866:1: ( '}' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:866:1: ( '}' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:867:1: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Library__Group_5__4__Impl1690); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5__4__Impl"


    // $ANTLR start "rule__Library__Group_5_3__0"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:890:1: rule__Library__Group_5_3__0 : rule__Library__Group_5_3__0__Impl rule__Library__Group_5_3__1 ;
    public final void rule__Library__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:894:1: ( rule__Library__Group_5_3__0__Impl rule__Library__Group_5_3__1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:895:2: rule__Library__Group_5_3__0__Impl rule__Library__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5_3__0__Impl_in_rule__Library__Group_5_3__01731);
            rule__Library__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5_3__1_in_rule__Library__Group_5_3__01734);
            rule__Library__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5_3__0"


    // $ANTLR start "rule__Library__Group_5_3__0__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:902:1: rule__Library__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Library__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:906:1: ( ( ',' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:907:1: ( ',' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:907:1: ( ',' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:908:1: ','
            {
             before(grammarAccess.getLibraryAccess().getCommaKeyword_5_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Library__Group_5_3__0__Impl1762); 
             after(grammarAccess.getLibraryAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5_3__0__Impl"


    // $ANTLR start "rule__Library__Group_5_3__1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:921:1: rule__Library__Group_5_3__1 : rule__Library__Group_5_3__1__Impl ;
    public final void rule__Library__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:925:1: ( rule__Library__Group_5_3__1__Impl )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:926:2: rule__Library__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_5_3__1__Impl_in_rule__Library__Group_5_3__11793);
            rule__Library__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5_3__1"


    // $ANTLR start "rule__Library__Group_5_3__1__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:932:1: rule__Library__Group_5_3__1__Impl : ( ( rule__Library__LoansAssignment_5_3_1 ) ) ;
    public final void rule__Library__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:936:1: ( ( ( rule__Library__LoansAssignment_5_3_1 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:937:1: ( ( rule__Library__LoansAssignment_5_3_1 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:937:1: ( ( rule__Library__LoansAssignment_5_3_1 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:938:1: ( rule__Library__LoansAssignment_5_3_1 )
            {
             before(grammarAccess.getLibraryAccess().getLoansAssignment_5_3_1()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:939:1: ( rule__Library__LoansAssignment_5_3_1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:939:2: rule__Library__LoansAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__LoansAssignment_5_3_1_in_rule__Library__Group_5_3__1__Impl1820);
            rule__Library__LoansAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getLoansAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_5_3__1__Impl"


    // $ANTLR start "rule__Library__Group_6__0"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:953:1: rule__Library__Group_6__0 : rule__Library__Group_6__0__Impl rule__Library__Group_6__1 ;
    public final void rule__Library__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:957:1: ( rule__Library__Group_6__0__Impl rule__Library__Group_6__1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:958:2: rule__Library__Group_6__0__Impl rule__Library__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6__0__Impl_in_rule__Library__Group_6__01854);
            rule__Library__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6__1_in_rule__Library__Group_6__01857);
            rule__Library__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6__0"


    // $ANTLR start "rule__Library__Group_6__0__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:965:1: rule__Library__Group_6__0__Impl : ( 'members' ) ;
    public final void rule__Library__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:969:1: ( ( 'members' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:970:1: ( 'members' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:970:1: ( 'members' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:971:1: 'members'
            {
             before(grammarAccess.getLibraryAccess().getMembersKeyword_6_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Library__Group_6__0__Impl1885); 
             after(grammarAccess.getLibraryAccess().getMembersKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6__0__Impl"


    // $ANTLR start "rule__Library__Group_6__1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:984:1: rule__Library__Group_6__1 : rule__Library__Group_6__1__Impl rule__Library__Group_6__2 ;
    public final void rule__Library__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:988:1: ( rule__Library__Group_6__1__Impl rule__Library__Group_6__2 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:989:2: rule__Library__Group_6__1__Impl rule__Library__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6__1__Impl_in_rule__Library__Group_6__11916);
            rule__Library__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6__2_in_rule__Library__Group_6__11919);
            rule__Library__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6__1"


    // $ANTLR start "rule__Library__Group_6__1__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:996:1: rule__Library__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Library__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1000:1: ( ( '{' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1001:1: ( '{' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1001:1: ( '{' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1002:1: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Library__Group_6__1__Impl1947); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6__1__Impl"


    // $ANTLR start "rule__Library__Group_6__2"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1015:1: rule__Library__Group_6__2 : rule__Library__Group_6__2__Impl rule__Library__Group_6__3 ;
    public final void rule__Library__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1019:1: ( rule__Library__Group_6__2__Impl rule__Library__Group_6__3 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1020:2: rule__Library__Group_6__2__Impl rule__Library__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6__2__Impl_in_rule__Library__Group_6__21978);
            rule__Library__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6__3_in_rule__Library__Group_6__21981);
            rule__Library__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6__2"


    // $ANTLR start "rule__Library__Group_6__2__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1027:1: rule__Library__Group_6__2__Impl : ( ( rule__Library__MembersAssignment_6_2 ) ) ;
    public final void rule__Library__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1031:1: ( ( ( rule__Library__MembersAssignment_6_2 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1032:1: ( ( rule__Library__MembersAssignment_6_2 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1032:1: ( ( rule__Library__MembersAssignment_6_2 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1033:1: ( rule__Library__MembersAssignment_6_2 )
            {
             before(grammarAccess.getLibraryAccess().getMembersAssignment_6_2()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1034:1: ( rule__Library__MembersAssignment_6_2 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1034:2: rule__Library__MembersAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__MembersAssignment_6_2_in_rule__Library__Group_6__2__Impl2008);
            rule__Library__MembersAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getMembersAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6__2__Impl"


    // $ANTLR start "rule__Library__Group_6__3"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1044:1: rule__Library__Group_6__3 : rule__Library__Group_6__3__Impl rule__Library__Group_6__4 ;
    public final void rule__Library__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1048:1: ( rule__Library__Group_6__3__Impl rule__Library__Group_6__4 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1049:2: rule__Library__Group_6__3__Impl rule__Library__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6__3__Impl_in_rule__Library__Group_6__32038);
            rule__Library__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6__4_in_rule__Library__Group_6__32041);
            rule__Library__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6__3"


    // $ANTLR start "rule__Library__Group_6__3__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1056:1: rule__Library__Group_6__3__Impl : ( ( rule__Library__Group_6_3__0 )* ) ;
    public final void rule__Library__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1060:1: ( ( ( rule__Library__Group_6_3__0 )* ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1061:1: ( ( rule__Library__Group_6_3__0 )* )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1061:1: ( ( rule__Library__Group_6_3__0 )* )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1062:1: ( rule__Library__Group_6_3__0 )*
            {
             before(grammarAccess.getLibraryAccess().getGroup_6_3()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1063:1: ( rule__Library__Group_6_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1063:2: rule__Library__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6_3__0_in_rule__Library__Group_6__3__Impl2068);
            	    rule__Library__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6__3__Impl"


    // $ANTLR start "rule__Library__Group_6__4"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1073:1: rule__Library__Group_6__4 : rule__Library__Group_6__4__Impl ;
    public final void rule__Library__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1077:1: ( rule__Library__Group_6__4__Impl )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1078:2: rule__Library__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6__4__Impl_in_rule__Library__Group_6__42099);
            rule__Library__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6__4"


    // $ANTLR start "rule__Library__Group_6__4__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1084:1: rule__Library__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Library__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1088:1: ( ( '}' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1089:1: ( '}' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1089:1: ( '}' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1090:1: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Library__Group_6__4__Impl2127); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6__4__Impl"


    // $ANTLR start "rule__Library__Group_6_3__0"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1113:1: rule__Library__Group_6_3__0 : rule__Library__Group_6_3__0__Impl rule__Library__Group_6_3__1 ;
    public final void rule__Library__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1117:1: ( rule__Library__Group_6_3__0__Impl rule__Library__Group_6_3__1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1118:2: rule__Library__Group_6_3__0__Impl rule__Library__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6_3__0__Impl_in_rule__Library__Group_6_3__02168);
            rule__Library__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6_3__1_in_rule__Library__Group_6_3__02171);
            rule__Library__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6_3__0"


    // $ANTLR start "rule__Library__Group_6_3__0__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1125:1: rule__Library__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Library__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1129:1: ( ( ',' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1130:1: ( ',' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1130:1: ( ',' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1131:1: ','
            {
             before(grammarAccess.getLibraryAccess().getCommaKeyword_6_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Library__Group_6_3__0__Impl2199); 
             after(grammarAccess.getLibraryAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6_3__0__Impl"


    // $ANTLR start "rule__Library__Group_6_3__1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1144:1: rule__Library__Group_6_3__1 : rule__Library__Group_6_3__1__Impl ;
    public final void rule__Library__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1148:1: ( rule__Library__Group_6_3__1__Impl )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1149:2: rule__Library__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__Group_6_3__1__Impl_in_rule__Library__Group_6_3__12230);
            rule__Library__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6_3__1"


    // $ANTLR start "rule__Library__Group_6_3__1__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1155:1: rule__Library__Group_6_3__1__Impl : ( ( rule__Library__MembersAssignment_6_3_1 ) ) ;
    public final void rule__Library__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1159:1: ( ( ( rule__Library__MembersAssignment_6_3_1 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1160:1: ( ( rule__Library__MembersAssignment_6_3_1 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1160:1: ( ( rule__Library__MembersAssignment_6_3_1 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1161:1: ( rule__Library__MembersAssignment_6_3_1 )
            {
             before(grammarAccess.getLibraryAccess().getMembersAssignment_6_3_1()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1162:1: ( rule__Library__MembersAssignment_6_3_1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1162:2: rule__Library__MembersAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Library__MembersAssignment_6_3_1_in_rule__Library__Group_6_3__1__Impl2257);
            rule__Library__MembersAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getMembersAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group_6_3__1__Impl"


    // $ANTLR start "rule__Book__Group__0"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1176:1: rule__Book__Group__0 : rule__Book__Group__0__Impl rule__Book__Group__1 ;
    public final void rule__Book__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1180:1: ( rule__Book__Group__0__Impl rule__Book__Group__1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1181:2: rule__Book__Group__0__Impl rule__Book__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Book__Group__0__Impl_in_rule__Book__Group__02291);
            rule__Book__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Book__Group__1_in_rule__Book__Group__02294);
            rule__Book__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__0"


    // $ANTLR start "rule__Book__Group__0__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1188:1: rule__Book__Group__0__Impl : ( 'Book' ) ;
    public final void rule__Book__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1192:1: ( ( 'Book' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1193:1: ( 'Book' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1193:1: ( 'Book' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1194:1: 'Book'
            {
             before(grammarAccess.getBookAccess().getBookKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Book__Group__0__Impl2322); 
             after(grammarAccess.getBookAccess().getBookKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__0__Impl"


    // $ANTLR start "rule__Book__Group__1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1207:1: rule__Book__Group__1 : rule__Book__Group__1__Impl rule__Book__Group__2 ;
    public final void rule__Book__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1211:1: ( rule__Book__Group__1__Impl rule__Book__Group__2 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1212:2: rule__Book__Group__1__Impl rule__Book__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Book__Group__1__Impl_in_rule__Book__Group__12353);
            rule__Book__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Book__Group__2_in_rule__Book__Group__12356);
            rule__Book__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__1"


    // $ANTLR start "rule__Book__Group__1__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1219:1: rule__Book__Group__1__Impl : ( ( rule__Book__NameAssignment_1 ) ) ;
    public final void rule__Book__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1223:1: ( ( ( rule__Book__NameAssignment_1 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1224:1: ( ( rule__Book__NameAssignment_1 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1224:1: ( ( rule__Book__NameAssignment_1 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1225:1: ( rule__Book__NameAssignment_1 )
            {
             before(grammarAccess.getBookAccess().getNameAssignment_1()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1226:1: ( rule__Book__NameAssignment_1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1226:2: rule__Book__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Book__NameAssignment_1_in_rule__Book__Group__1__Impl2383);
            rule__Book__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__1__Impl"


    // $ANTLR start "rule__Book__Group__2"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1236:1: rule__Book__Group__2 : rule__Book__Group__2__Impl rule__Book__Group__3 ;
    public final void rule__Book__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1240:1: ( rule__Book__Group__2__Impl rule__Book__Group__3 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1241:2: rule__Book__Group__2__Impl rule__Book__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Book__Group__2__Impl_in_rule__Book__Group__22413);
            rule__Book__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Book__Group__3_in_rule__Book__Group__22416);
            rule__Book__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__2"


    // $ANTLR start "rule__Book__Group__2__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1248:1: rule__Book__Group__2__Impl : ( '{' ) ;
    public final void rule__Book__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1252:1: ( ( '{' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1253:1: ( '{' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1253:1: ( '{' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1254:1: '{'
            {
             before(grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Book__Group__2__Impl2444); 
             after(grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__2__Impl"


    // $ANTLR start "rule__Book__Group__3"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1267:1: rule__Book__Group__3 : rule__Book__Group__3__Impl rule__Book__Group__4 ;
    public final void rule__Book__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1271:1: ( rule__Book__Group__3__Impl rule__Book__Group__4 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1272:2: rule__Book__Group__3__Impl rule__Book__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Book__Group__3__Impl_in_rule__Book__Group__32475);
            rule__Book__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Book__Group__4_in_rule__Book__Group__32478);
            rule__Book__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__3"


    // $ANTLR start "rule__Book__Group__3__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1279:1: rule__Book__Group__3__Impl : ( 'copies' ) ;
    public final void rule__Book__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1283:1: ( ( 'copies' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1284:1: ( 'copies' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1284:1: ( 'copies' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1285:1: 'copies'
            {
             before(grammarAccess.getBookAccess().getCopiesKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Book__Group__3__Impl2506); 
             after(grammarAccess.getBookAccess().getCopiesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__3__Impl"


    // $ANTLR start "rule__Book__Group__4"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1298:1: rule__Book__Group__4 : rule__Book__Group__4__Impl rule__Book__Group__5 ;
    public final void rule__Book__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1302:1: ( rule__Book__Group__4__Impl rule__Book__Group__5 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1303:2: rule__Book__Group__4__Impl rule__Book__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Book__Group__4__Impl_in_rule__Book__Group__42537);
            rule__Book__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Book__Group__5_in_rule__Book__Group__42540);
            rule__Book__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__4"


    // $ANTLR start "rule__Book__Group__4__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1310:1: rule__Book__Group__4__Impl : ( ( rule__Book__CopiesAssignment_4 ) ) ;
    public final void rule__Book__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1314:1: ( ( ( rule__Book__CopiesAssignment_4 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1315:1: ( ( rule__Book__CopiesAssignment_4 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1315:1: ( ( rule__Book__CopiesAssignment_4 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1316:1: ( rule__Book__CopiesAssignment_4 )
            {
             before(grammarAccess.getBookAccess().getCopiesAssignment_4()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1317:1: ( rule__Book__CopiesAssignment_4 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1317:2: rule__Book__CopiesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Book__CopiesAssignment_4_in_rule__Book__Group__4__Impl2567);
            rule__Book__CopiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getCopiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__4__Impl"


    // $ANTLR start "rule__Book__Group__5"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1327:1: rule__Book__Group__5 : rule__Book__Group__5__Impl ;
    public final void rule__Book__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1331:1: ( rule__Book__Group__5__Impl )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1332:2: rule__Book__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Book__Group__5__Impl_in_rule__Book__Group__52597);
            rule__Book__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__5"


    // $ANTLR start "rule__Book__Group__5__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1338:1: rule__Book__Group__5__Impl : ( '}' ) ;
    public final void rule__Book__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1342:1: ( ( '}' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1343:1: ( '}' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1343:1: ( '}' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1344:1: '}'
            {
             before(grammarAccess.getBookAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Book__Group__5__Impl2625); 
             after(grammarAccess.getBookAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__5__Impl"


    // $ANTLR start "rule__Loan__Group__0"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1369:1: rule__Loan__Group__0 : rule__Loan__Group__0__Impl rule__Loan__Group__1 ;
    public final void rule__Loan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1373:1: ( rule__Loan__Group__0__Impl rule__Loan__Group__1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1374:2: rule__Loan__Group__0__Impl rule__Loan__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__0__Impl_in_rule__Loan__Group__02668);
            rule__Loan__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__1_in_rule__Loan__Group__02671);
            rule__Loan__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__0"


    // $ANTLR start "rule__Loan__Group__0__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1381:1: rule__Loan__Group__0__Impl : ( 'Loan' ) ;
    public final void rule__Loan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1385:1: ( ( 'Loan' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1386:1: ( 'Loan' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1386:1: ( 'Loan' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1387:1: 'Loan'
            {
             before(grammarAccess.getLoanAccess().getLoanKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Loan__Group__0__Impl2699); 
             after(grammarAccess.getLoanAccess().getLoanKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__0__Impl"


    // $ANTLR start "rule__Loan__Group__1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1400:1: rule__Loan__Group__1 : rule__Loan__Group__1__Impl rule__Loan__Group__2 ;
    public final void rule__Loan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1404:1: ( rule__Loan__Group__1__Impl rule__Loan__Group__2 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1405:2: rule__Loan__Group__1__Impl rule__Loan__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__1__Impl_in_rule__Loan__Group__12730);
            rule__Loan__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__2_in_rule__Loan__Group__12733);
            rule__Loan__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__1"


    // $ANTLR start "rule__Loan__Group__1__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1412:1: rule__Loan__Group__1__Impl : ( '{' ) ;
    public final void rule__Loan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1416:1: ( ( '{' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1417:1: ( '{' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1417:1: ( '{' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1418:1: '{'
            {
             before(grammarAccess.getLoanAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Loan__Group__1__Impl2761); 
             after(grammarAccess.getLoanAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__1__Impl"


    // $ANTLR start "rule__Loan__Group__2"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1431:1: rule__Loan__Group__2 : rule__Loan__Group__2__Impl rule__Loan__Group__3 ;
    public final void rule__Loan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1435:1: ( rule__Loan__Group__2__Impl rule__Loan__Group__3 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1436:2: rule__Loan__Group__2__Impl rule__Loan__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__2__Impl_in_rule__Loan__Group__22792);
            rule__Loan__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__3_in_rule__Loan__Group__22795);
            rule__Loan__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__2"


    // $ANTLR start "rule__Loan__Group__2__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1443:1: rule__Loan__Group__2__Impl : ( 'book' ) ;
    public final void rule__Loan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1447:1: ( ( 'book' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1448:1: ( 'book' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1448:1: ( 'book' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1449:1: 'book'
            {
             before(grammarAccess.getLoanAccess().getBookKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Loan__Group__2__Impl2823); 
             after(grammarAccess.getLoanAccess().getBookKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__2__Impl"


    // $ANTLR start "rule__Loan__Group__3"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1462:1: rule__Loan__Group__3 : rule__Loan__Group__3__Impl rule__Loan__Group__4 ;
    public final void rule__Loan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1466:1: ( rule__Loan__Group__3__Impl rule__Loan__Group__4 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1467:2: rule__Loan__Group__3__Impl rule__Loan__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__3__Impl_in_rule__Loan__Group__32854);
            rule__Loan__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__4_in_rule__Loan__Group__32857);
            rule__Loan__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__3"


    // $ANTLR start "rule__Loan__Group__3__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1474:1: rule__Loan__Group__3__Impl : ( ( rule__Loan__BookAssignment_3 ) ) ;
    public final void rule__Loan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1478:1: ( ( ( rule__Loan__BookAssignment_3 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1479:1: ( ( rule__Loan__BookAssignment_3 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1479:1: ( ( rule__Loan__BookAssignment_3 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1480:1: ( rule__Loan__BookAssignment_3 )
            {
             before(grammarAccess.getLoanAccess().getBookAssignment_3()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1481:1: ( rule__Loan__BookAssignment_3 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1481:2: rule__Loan__BookAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Loan__BookAssignment_3_in_rule__Loan__Group__3__Impl2884);
            rule__Loan__BookAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoanAccess().getBookAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__3__Impl"


    // $ANTLR start "rule__Loan__Group__4"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1491:1: rule__Loan__Group__4 : rule__Loan__Group__4__Impl rule__Loan__Group__5 ;
    public final void rule__Loan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1495:1: ( rule__Loan__Group__4__Impl rule__Loan__Group__5 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1496:2: rule__Loan__Group__4__Impl rule__Loan__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__4__Impl_in_rule__Loan__Group__42914);
            rule__Loan__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__5_in_rule__Loan__Group__42917);
            rule__Loan__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__4"


    // $ANTLR start "rule__Loan__Group__4__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1503:1: rule__Loan__Group__4__Impl : ( 'member' ) ;
    public final void rule__Loan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1507:1: ( ( 'member' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1508:1: ( 'member' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1508:1: ( 'member' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1509:1: 'member'
            {
             before(grammarAccess.getLoanAccess().getMemberKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Loan__Group__4__Impl2945); 
             after(grammarAccess.getLoanAccess().getMemberKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__4__Impl"


    // $ANTLR start "rule__Loan__Group__5"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1522:1: rule__Loan__Group__5 : rule__Loan__Group__5__Impl rule__Loan__Group__6 ;
    public final void rule__Loan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1526:1: ( rule__Loan__Group__5__Impl rule__Loan__Group__6 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1527:2: rule__Loan__Group__5__Impl rule__Loan__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__5__Impl_in_rule__Loan__Group__52976);
            rule__Loan__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__6_in_rule__Loan__Group__52979);
            rule__Loan__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__5"


    // $ANTLR start "rule__Loan__Group__5__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1534:1: rule__Loan__Group__5__Impl : ( ( rule__Loan__MemberAssignment_5 ) ) ;
    public final void rule__Loan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1538:1: ( ( ( rule__Loan__MemberAssignment_5 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1539:1: ( ( rule__Loan__MemberAssignment_5 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1539:1: ( ( rule__Loan__MemberAssignment_5 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1540:1: ( rule__Loan__MemberAssignment_5 )
            {
             before(grammarAccess.getLoanAccess().getMemberAssignment_5()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1541:1: ( rule__Loan__MemberAssignment_5 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1541:2: rule__Loan__MemberAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Loan__MemberAssignment_5_in_rule__Loan__Group__5__Impl3006);
            rule__Loan__MemberAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoanAccess().getMemberAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__5__Impl"


    // $ANTLR start "rule__Loan__Group__6"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1551:1: rule__Loan__Group__6 : rule__Loan__Group__6__Impl ;
    public final void rule__Loan__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1555:1: ( rule__Loan__Group__6__Impl )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1556:2: rule__Loan__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Loan__Group__6__Impl_in_rule__Loan__Group__63036);
            rule__Loan__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__6"


    // $ANTLR start "rule__Loan__Group__6__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1562:1: rule__Loan__Group__6__Impl : ( '}' ) ;
    public final void rule__Loan__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1566:1: ( ( '}' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1567:1: ( '}' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1567:1: ( '}' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1568:1: '}'
            {
             before(grammarAccess.getLoanAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Loan__Group__6__Impl3064); 
             after(grammarAccess.getLoanAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__Group__6__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1595:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1599:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1600:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Member__Group__0__Impl_in_rule__Member__Group__03109);
            rule__Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Member__Group__1_in_rule__Member__Group__03112);
            rule__Member__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0"


    // $ANTLR start "rule__Member__Group__0__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1607:1: rule__Member__Group__0__Impl : ( () ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1611:1: ( ( () ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1612:1: ( () )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1612:1: ( () )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1613:1: ()
            {
             before(grammarAccess.getMemberAccess().getMemberAction_0()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1614:1: ()
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1616:1: 
            {
            }

             after(grammarAccess.getMemberAccess().getMemberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0__Impl"


    // $ANTLR start "rule__Member__Group__1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1626:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1630:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1631:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Member__Group__1__Impl_in_rule__Member__Group__13170);
            rule__Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Member__Group__2_in_rule__Member__Group__13173);
            rule__Member__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1"


    // $ANTLR start "rule__Member__Group__1__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1638:1: rule__Member__Group__1__Impl : ( 'Member' ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1642:1: ( ( 'Member' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1643:1: ( 'Member' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1643:1: ( 'Member' )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1644:1: 'Member'
            {
             before(grammarAccess.getMemberAccess().getMemberKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Member__Group__1__Impl3201); 
             after(grammarAccess.getMemberAccess().getMemberKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1__Impl"


    // $ANTLR start "rule__Member__Group__2"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1657:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1661:1: ( rule__Member__Group__2__Impl )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1662:2: rule__Member__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Member__Group__2__Impl_in_rule__Member__Group__23232);
            rule__Member__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2"


    // $ANTLR start "rule__Member__Group__2__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1668:1: rule__Member__Group__2__Impl : ( ( rule__Member__NameAssignment_2 ) ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1672:1: ( ( ( rule__Member__NameAssignment_2 ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1673:1: ( ( rule__Member__NameAssignment_2 ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1673:1: ( ( rule__Member__NameAssignment_2 ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1674:1: ( rule__Member__NameAssignment_2 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_2()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1675:1: ( rule__Member__NameAssignment_2 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1675:2: rule__Member__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Member__NameAssignment_2_in_rule__Member__Group__2__Impl3259);
            rule__Member__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2__Impl"


    // $ANTLR start "rule__EBigInteger__Group__0"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1691:1: rule__EBigInteger__Group__0 : rule__EBigInteger__Group__0__Impl rule__EBigInteger__Group__1 ;
    public final void rule__EBigInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1695:1: ( rule__EBigInteger__Group__0__Impl rule__EBigInteger__Group__1 )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1696:2: rule__EBigInteger__Group__0__Impl rule__EBigInteger__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigInteger__Group__0__Impl_in_rule__EBigInteger__Group__03295);
            rule__EBigInteger__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EBigInteger__Group__1_in_rule__EBigInteger__Group__03298);
            rule__EBigInteger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigInteger__Group__0"


    // $ANTLR start "rule__EBigInteger__Group__0__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1703:1: rule__EBigInteger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EBigInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1707:1: ( ( ( '-' )? ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1708:1: ( ( '-' )? )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1708:1: ( ( '-' )? )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1709:1: ( '-' )?
            {
             before(grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1710:1: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1711:2: '-'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__EBigInteger__Group__0__Impl3327); 

                    }
                    break;

            }

             after(grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigInteger__Group__0__Impl"


    // $ANTLR start "rule__EBigInteger__Group__1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1722:1: rule__EBigInteger__Group__1 : rule__EBigInteger__Group__1__Impl ;
    public final void rule__EBigInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1726:1: ( rule__EBigInteger__Group__1__Impl )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1727:2: rule__EBigInteger__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigInteger__Group__1__Impl_in_rule__EBigInteger__Group__13360);
            rule__EBigInteger__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigInteger__Group__1"


    // $ANTLR start "rule__EBigInteger__Group__1__Impl"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1733:1: rule__EBigInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EBigInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1737:1: ( ( RULE_INT ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1738:1: ( RULE_INT )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1738:1: ( RULE_INT )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1739:1: RULE_INT
            {
             before(grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EBigInteger__Group__1__Impl3387); 
             after(grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigInteger__Group__1__Impl"


    // $ANTLR start "rule__Library__NameAssignment_2"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1755:1: rule__Library__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Library__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1759:1: ( ( ruleEString ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1760:1: ( ruleEString )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1760:1: ( ruleEString )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1761:1: ruleEString
            {
             before(grammarAccess.getLibraryAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Library__NameAssignment_23425);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__NameAssignment_2"


    // $ANTLR start "rule__Library__BooksAssignment_4_2"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1770:1: rule__Library__BooksAssignment_4_2 : ( ruleBook ) ;
    public final void rule__Library__BooksAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1774:1: ( ( ruleBook ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1775:1: ( ruleBook )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1775:1: ( ruleBook )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1776:1: ruleBook
            {
             before(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBook_in_rule__Library__BooksAssignment_4_23456);
            ruleBook();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__BooksAssignment_4_2"


    // $ANTLR start "rule__Library__BooksAssignment_4_3_1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1785:1: rule__Library__BooksAssignment_4_3_1 : ( ruleBook ) ;
    public final void rule__Library__BooksAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1789:1: ( ( ruleBook ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1790:1: ( ruleBook )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1790:1: ( ruleBook )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1791:1: ruleBook
            {
             before(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBook_in_rule__Library__BooksAssignment_4_3_13487);
            ruleBook();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__BooksAssignment_4_3_1"


    // $ANTLR start "rule__Library__LoansAssignment_5_2"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1800:1: rule__Library__LoansAssignment_5_2 : ( ruleLoan ) ;
    public final void rule__Library__LoansAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1804:1: ( ( ruleLoan ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1805:1: ( ruleLoan )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1805:1: ( ruleLoan )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1806:1: ruleLoan
            {
             before(grammarAccess.getLibraryAccess().getLoansLoanParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLoan_in_rule__Library__LoansAssignment_5_23518);
            ruleLoan();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getLoansLoanParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__LoansAssignment_5_2"


    // $ANTLR start "rule__Library__LoansAssignment_5_3_1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1815:1: rule__Library__LoansAssignment_5_3_1 : ( ruleLoan ) ;
    public final void rule__Library__LoansAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1819:1: ( ( ruleLoan ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1820:1: ( ruleLoan )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1820:1: ( ruleLoan )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1821:1: ruleLoan
            {
             before(grammarAccess.getLibraryAccess().getLoansLoanParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLoan_in_rule__Library__LoansAssignment_5_3_13549);
            ruleLoan();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getLoansLoanParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__LoansAssignment_5_3_1"


    // $ANTLR start "rule__Library__MembersAssignment_6_2"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1830:1: rule__Library__MembersAssignment_6_2 : ( ruleMember ) ;
    public final void rule__Library__MembersAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1834:1: ( ( ruleMember ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1835:1: ( ruleMember )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1835:1: ( ruleMember )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1836:1: ruleMember
            {
             before(grammarAccess.getLibraryAccess().getMembersMemberParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMember_in_rule__Library__MembersAssignment_6_23580);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getMembersMemberParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__MembersAssignment_6_2"


    // $ANTLR start "rule__Library__MembersAssignment_6_3_1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1845:1: rule__Library__MembersAssignment_6_3_1 : ( ruleMember ) ;
    public final void rule__Library__MembersAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1849:1: ( ( ruleMember ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1850:1: ( ruleMember )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1850:1: ( ruleMember )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1851:1: ruleMember
            {
             before(grammarAccess.getLibraryAccess().getMembersMemberParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMember_in_rule__Library__MembersAssignment_6_3_13611);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getMembersMemberParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__MembersAssignment_6_3_1"


    // $ANTLR start "rule__Book__NameAssignment_1"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1860:1: rule__Book__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Book__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1864:1: ( ( ruleEString ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1865:1: ( ruleEString )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1865:1: ( ruleEString )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1866:1: ruleEString
            {
             before(grammarAccess.getBookAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Book__NameAssignment_13642);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBookAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__NameAssignment_1"


    // $ANTLR start "rule__Book__CopiesAssignment_4"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1875:1: rule__Book__CopiesAssignment_4 : ( ruleEBigInteger ) ;
    public final void rule__Book__CopiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1879:1: ( ( ruleEBigInteger ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1880:1: ( ruleEBigInteger )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1880:1: ( ruleEBigInteger )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1881:1: ruleEBigInteger
            {
             before(grammarAccess.getBookAccess().getCopiesEBigIntegerParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_rule__Book__CopiesAssignment_43673);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getBookAccess().getCopiesEBigIntegerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__CopiesAssignment_4"


    // $ANTLR start "rule__Loan__BookAssignment_3"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1890:1: rule__Loan__BookAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Loan__BookAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1894:1: ( ( ( ruleEString ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1895:1: ( ( ruleEString ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1895:1: ( ( ruleEString ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1896:1: ( ruleEString )
            {
             before(grammarAccess.getLoanAccess().getBookBookCrossReference_3_0()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1897:1: ( ruleEString )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1898:1: ruleEString
            {
             before(grammarAccess.getLoanAccess().getBookBookEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Loan__BookAssignment_33708);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoanAccess().getBookBookEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLoanAccess().getBookBookCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__BookAssignment_3"


    // $ANTLR start "rule__Loan__MemberAssignment_5"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1909:1: rule__Loan__MemberAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Loan__MemberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1913:1: ( ( ( ruleEString ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1914:1: ( ( ruleEString ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1914:1: ( ( ruleEString ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1915:1: ( ruleEString )
            {
             before(grammarAccess.getLoanAccess().getMemberMemberCrossReference_5_0()); 
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1916:1: ( ruleEString )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1917:1: ruleEString
            {
             before(grammarAccess.getLoanAccess().getMemberMemberEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Loan__MemberAssignment_53747);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoanAccess().getMemberMemberEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getLoanAccess().getMemberMemberCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loan__MemberAssignment_5"


    // $ANTLR start "rule__Member__NameAssignment_2"
    // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1928:1: rule__Member__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Member__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1932:1: ( ( ruleEString ) )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1933:1: ( ruleEString )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1933:1: ( ruleEString )
            // ../org.eclipse.oclinecore.tutorial.xtext.ui/src-gen/org/eclipse/oclinecore/tutorial/xtext/ui/contentassist/antlr/internal/InternalLibraryDsl.g:1934:1: ruleEString
            {
             before(grammarAccess.getMemberAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Member__NameAssignment_23782);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__NameAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleLibrary_in_entryRuleLibrary61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLibrary68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group__0_in_ruleLibrary94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBook_in_entryRuleBook181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBook188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Book__Group__0_in_ruleBook214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoan_in_entryRuleLoan241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLoan248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Loan__Group__0_in_ruleLoan274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMember_in_entryRuleMember301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMember308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Member__Group__0_in_ruleMember334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_entryRuleEBigInteger361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBigInteger368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigInteger__Group__0_in_ruleEBigInteger394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group__0__Impl_in_rule__Library__Group__0477 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Library__Group__1_in_rule__Library__Group__0480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group__1__Impl_in_rule__Library__Group__1538 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Library__Group__2_in_rule__Library__Group__1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Library__Group__1__Impl569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group__2__Impl_in_rule__Library__Group__2600 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Library__Group__3_in_rule__Library__Group__2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__NameAssignment_2_in_rule__Library__Group__2__Impl630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group__3__Impl_in_rule__Library__Group__3660 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__Library__Group__4_in_rule__Library__Group__3663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Library__Group__3__Impl691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group__4__Impl_in_rule__Library__Group__4722 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__Library__Group__5_in_rule__Library__Group__4725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_4__0_in_rule__Library__Group__4__Impl752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group__5__Impl_in_rule__Library__Group__5783 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__Library__Group__6_in_rule__Library__Group__5786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_5__0_in_rule__Library__Group__5__Impl813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group__6__Impl_in_rule__Library__Group__6844 = new BitSet(new long[]{0x0000000000036000L});
        public static final BitSet FOLLOW_rule__Library__Group__7_in_rule__Library__Group__6847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_6__0_in_rule__Library__Group__6__Impl874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group__7__Impl_in_rule__Library__Group__7905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Library__Group__7__Impl933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_4__0__Impl_in_rule__Library__Group_4__0980 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Library__Group_4__1_in_rule__Library__Group_4__0983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Library__Group_4__0__Impl1011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_4__1__Impl_in_rule__Library__Group_4__11042 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Library__Group_4__2_in_rule__Library__Group_4__11045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Library__Group_4__1__Impl1073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_4__2__Impl_in_rule__Library__Group_4__21104 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Library__Group_4__3_in_rule__Library__Group_4__21107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__BooksAssignment_4_2_in_rule__Library__Group_4__2__Impl1134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_4__3__Impl_in_rule__Library__Group_4__31164 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Library__Group_4__4_in_rule__Library__Group_4__31167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_4_3__0_in_rule__Library__Group_4__3__Impl1194 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Library__Group_4__4__Impl_in_rule__Library__Group_4__41225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Library__Group_4__4__Impl1253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_4_3__0__Impl_in_rule__Library__Group_4_3__01294 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Library__Group_4_3__1_in_rule__Library__Group_4_3__01297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Library__Group_4_3__0__Impl1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_4_3__1__Impl_in_rule__Library__Group_4_3__11356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__BooksAssignment_4_3_1_in_rule__Library__Group_4_3__1__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_5__0__Impl_in_rule__Library__Group_5__01417 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Library__Group_5__1_in_rule__Library__Group_5__01420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Library__Group_5__0__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_5__1__Impl_in_rule__Library__Group_5__11479 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Library__Group_5__2_in_rule__Library__Group_5__11482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Library__Group_5__1__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_5__2__Impl_in_rule__Library__Group_5__21541 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Library__Group_5__3_in_rule__Library__Group_5__21544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__LoansAssignment_5_2_in_rule__Library__Group_5__2__Impl1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_5__3__Impl_in_rule__Library__Group_5__31601 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Library__Group_5__4_in_rule__Library__Group_5__31604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_5_3__0_in_rule__Library__Group_5__3__Impl1631 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Library__Group_5__4__Impl_in_rule__Library__Group_5__41662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Library__Group_5__4__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_5_3__0__Impl_in_rule__Library__Group_5_3__01731 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Library__Group_5_3__1_in_rule__Library__Group_5_3__01734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Library__Group_5_3__0__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_5_3__1__Impl_in_rule__Library__Group_5_3__11793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__LoansAssignment_5_3_1_in_rule__Library__Group_5_3__1__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_6__0__Impl_in_rule__Library__Group_6__01854 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Library__Group_6__1_in_rule__Library__Group_6__01857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Library__Group_6__0__Impl1885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_6__1__Impl_in_rule__Library__Group_6__11916 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Library__Group_6__2_in_rule__Library__Group_6__11919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Library__Group_6__1__Impl1947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_6__2__Impl_in_rule__Library__Group_6__21978 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Library__Group_6__3_in_rule__Library__Group_6__21981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__MembersAssignment_6_2_in_rule__Library__Group_6__2__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_6__3__Impl_in_rule__Library__Group_6__32038 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_rule__Library__Group_6__4_in_rule__Library__Group_6__32041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_6_3__0_in_rule__Library__Group_6__3__Impl2068 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Library__Group_6__4__Impl_in_rule__Library__Group_6__42099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Library__Group_6__4__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_6_3__0__Impl_in_rule__Library__Group_6_3__02168 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Library__Group_6_3__1_in_rule__Library__Group_6_3__02171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Library__Group_6_3__0__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__Group_6_3__1__Impl_in_rule__Library__Group_6_3__12230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Library__MembersAssignment_6_3_1_in_rule__Library__Group_6_3__1__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Book__Group__0__Impl_in_rule__Book__Group__02291 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Book__Group__1_in_rule__Book__Group__02294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Book__Group__0__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Book__Group__1__Impl_in_rule__Book__Group__12353 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Book__Group__2_in_rule__Book__Group__12356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Book__NameAssignment_1_in_rule__Book__Group__1__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Book__Group__2__Impl_in_rule__Book__Group__22413 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Book__Group__3_in_rule__Book__Group__22416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Book__Group__2__Impl2444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Book__Group__3__Impl_in_rule__Book__Group__32475 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__Book__Group__4_in_rule__Book__Group__32478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Book__Group__3__Impl2506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Book__Group__4__Impl_in_rule__Book__Group__42537 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Book__Group__5_in_rule__Book__Group__42540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Book__CopiesAssignment_4_in_rule__Book__Group__4__Impl2567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Book__Group__5__Impl_in_rule__Book__Group__52597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Book__Group__5__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Loan__Group__0__Impl_in_rule__Loan__Group__02668 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Loan__Group__1_in_rule__Loan__Group__02671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Loan__Group__0__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Loan__Group__1__Impl_in_rule__Loan__Group__12730 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Loan__Group__2_in_rule__Loan__Group__12733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Loan__Group__1__Impl2761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Loan__Group__2__Impl_in_rule__Loan__Group__22792 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Loan__Group__3_in_rule__Loan__Group__22795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Loan__Group__2__Impl2823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Loan__Group__3__Impl_in_rule__Loan__Group__32854 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Loan__Group__4_in_rule__Loan__Group__32857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Loan__BookAssignment_3_in_rule__Loan__Group__3__Impl2884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Loan__Group__4__Impl_in_rule__Loan__Group__42914 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Loan__Group__5_in_rule__Loan__Group__42917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Loan__Group__4__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Loan__Group__5__Impl_in_rule__Loan__Group__52976 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Loan__Group__6_in_rule__Loan__Group__52979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Loan__MemberAssignment_5_in_rule__Loan__Group__5__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Loan__Group__6__Impl_in_rule__Loan__Group__63036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Loan__Group__6__Impl3064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Member__Group__0__Impl_in_rule__Member__Group__03109 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Member__Group__1_in_rule__Member__Group__03112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Member__Group__1__Impl_in_rule__Member__Group__13170 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Member__Group__2_in_rule__Member__Group__13173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Member__Group__1__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Member__Group__2__Impl_in_rule__Member__Group__23232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Member__NameAssignment_2_in_rule__Member__Group__2__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigInteger__Group__0__Impl_in_rule__EBigInteger__Group__03295 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_rule__EBigInteger__Group__1_in_rule__EBigInteger__Group__03298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__EBigInteger__Group__0__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigInteger__Group__1__Impl_in_rule__EBigInteger__Group__13360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EBigInteger__Group__1__Impl3387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Library__NameAssignment_23425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBook_in_rule__Library__BooksAssignment_4_23456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBook_in_rule__Library__BooksAssignment_4_3_13487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoan_in_rule__Library__LoansAssignment_5_23518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoan_in_rule__Library__LoansAssignment_5_3_13549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMember_in_rule__Library__MembersAssignment_6_23580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMember_in_rule__Library__MembersAssignment_6_3_13611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Book__NameAssignment_13642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_rule__Book__CopiesAssignment_43673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Loan__BookAssignment_33708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Loan__MemberAssignment_53747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Member__NameAssignment_23782 = new BitSet(new long[]{0x0000000000000002L});
    }


}