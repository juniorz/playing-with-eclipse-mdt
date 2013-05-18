package org.eclipse.oclinecore.tutorial.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.oclinecore.tutorial.xtext.services.LibraryDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLibraryDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Library'", "'{'", "'books'", "','", "'}'", "'loans'", "'members'", "'Book'", "'copies'", "'Loan'", "'book'", "'member'", "'Member'", "'-'"
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
    public String getGrammarFileName() { return "../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g"; }



     	private LibraryDslGrammarAccess grammarAccess;
     	
        public InternalLibraryDslParser(TokenStream input, LibraryDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Library";	
       	}
       	
       	@Override
       	protected LibraryDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLibrary"
    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:67:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:68:2: (iv_ruleLibrary= ruleLibrary EOF )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:69:2: iv_ruleLibrary= ruleLibrary EOF
            {
             newCompositeNode(grammarAccess.getLibraryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLibrary_in_entryRuleLibrary75);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;

             current =iv_ruleLibrary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLibrary85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:76:1: ruleLibrary returns [EObject current=null] : ( () otherlv_1= 'Library' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}' )? (otherlv_10= 'loans' otherlv_11= '{' ( (lv_loans_12_0= ruleLoan ) ) (otherlv_13= ',' ( (lv_loans_14_0= ruleLoan ) ) )* otherlv_15= '}' )? (otherlv_16= 'members' otherlv_17= '{' ( (lv_members_18_0= ruleMember ) ) (otherlv_19= ',' ( (lv_members_20_0= ruleMember ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_books_6_0 = null;

        EObject lv_books_8_0 = null;

        EObject lv_loans_12_0 = null;

        EObject lv_loans_14_0 = null;

        EObject lv_members_18_0 = null;

        EObject lv_members_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:79:28: ( ( () otherlv_1= 'Library' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}' )? (otherlv_10= 'loans' otherlv_11= '{' ( (lv_loans_12_0= ruleLoan ) ) (otherlv_13= ',' ( (lv_loans_14_0= ruleLoan ) ) )* otherlv_15= '}' )? (otherlv_16= 'members' otherlv_17= '{' ( (lv_members_18_0= ruleMember ) ) (otherlv_19= ',' ( (lv_members_20_0= ruleMember ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:80:1: ( () otherlv_1= 'Library' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}' )? (otherlv_10= 'loans' otherlv_11= '{' ( (lv_loans_12_0= ruleLoan ) ) (otherlv_13= ',' ( (lv_loans_14_0= ruleLoan ) ) )* otherlv_15= '}' )? (otherlv_16= 'members' otherlv_17= '{' ( (lv_members_18_0= ruleMember ) ) (otherlv_19= ',' ( (lv_members_20_0= ruleMember ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:80:1: ( () otherlv_1= 'Library' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}' )? (otherlv_10= 'loans' otherlv_11= '{' ( (lv_loans_12_0= ruleLoan ) ) (otherlv_13= ',' ( (lv_loans_14_0= ruleLoan ) ) )* otherlv_15= '}' )? (otherlv_16= 'members' otherlv_17= '{' ( (lv_members_18_0= ruleMember ) ) (otherlv_19= ',' ( (lv_members_20_0= ruleMember ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:80:2: () otherlv_1= 'Library' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}' )? (otherlv_10= 'loans' otherlv_11= '{' ( (lv_loans_12_0= ruleLoan ) ) (otherlv_13= ',' ( (lv_loans_14_0= ruleLoan ) ) )* otherlv_15= '}' )? (otherlv_16= 'members' otherlv_17= '{' ( (lv_members_18_0= ruleMember ) ) (otherlv_19= ',' ( (lv_members_20_0= ruleMember ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:80:2: ()
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLibraryAccess().getLibraryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleLibrary131); 

                	newLeafNode(otherlv_1, grammarAccess.getLibraryAccess().getLibraryKeyword_1());
                
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:90:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:91:1: (lv_name_2_0= ruleEString )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:91:1: (lv_name_2_0= ruleEString )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:92:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLibraryAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLibrary152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLibraryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLibrary164); 

                	newLeafNode(otherlv_3, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:112:1: (otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:112:3: otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleLibrary177); 

                        	newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getBooksKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLibrary189); 

                        	newLeafNode(otherlv_5, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:120:1: ( (lv_books_6_0= ruleBook ) )
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:121:1: (lv_books_6_0= ruleBook )
                    {
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:121:1: (lv_books_6_0= ruleBook )
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:122:3: lv_books_6_0= ruleBook
                    {
                     
                    	        newCompositeNode(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBook_in_ruleLibrary210);
                    lv_books_6_0=ruleBook();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	        }
                           		add(
                           			current, 
                           			"books",
                            		lv_books_6_0, 
                            		"Book");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:138:2: (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:138:4: otherlv_7= ',' ( (lv_books_8_0= ruleBook ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLibrary223); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getLibraryAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:142:1: ( (lv_books_8_0= ruleBook ) )
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:143:1: (lv_books_8_0= ruleBook )
                    	    {
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:143:1: (lv_books_8_0= ruleBook )
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:144:3: lv_books_8_0= ruleBook
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBook_in_ruleLibrary244);
                    	    lv_books_8_0=ruleBook();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"books",
                    	            		lv_books_8_0, 
                    	            		"Book");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLibrary258); 

                        	newLeafNode(otherlv_9, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:164:3: (otherlv_10= 'loans' otherlv_11= '{' ( (lv_loans_12_0= ruleLoan ) ) (otherlv_13= ',' ( (lv_loans_14_0= ruleLoan ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:164:5: otherlv_10= 'loans' otherlv_11= '{' ( (lv_loans_12_0= ruleLoan ) ) (otherlv_13= ',' ( (lv_loans_14_0= ruleLoan ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLibrary273); 

                        	newLeafNode(otherlv_10, grammarAccess.getLibraryAccess().getLoansKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLibrary285); 

                        	newLeafNode(otherlv_11, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:172:1: ( (lv_loans_12_0= ruleLoan ) )
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:173:1: (lv_loans_12_0= ruleLoan )
                    {
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:173:1: (lv_loans_12_0= ruleLoan )
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:174:3: lv_loans_12_0= ruleLoan
                    {
                     
                    	        newCompositeNode(grammarAccess.getLibraryAccess().getLoansLoanParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLoan_in_ruleLibrary306);
                    lv_loans_12_0=ruleLoan();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	        }
                           		add(
                           			current, 
                           			"loans",
                            		lv_loans_12_0, 
                            		"Loan");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:190:2: (otherlv_13= ',' ( (lv_loans_14_0= ruleLoan ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:190:4: otherlv_13= ',' ( (lv_loans_14_0= ruleLoan ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLibrary319); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getLibraryAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:194:1: ( (lv_loans_14_0= ruleLoan ) )
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:195:1: (lv_loans_14_0= ruleLoan )
                    	    {
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:195:1: (lv_loans_14_0= ruleLoan )
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:196:3: lv_loans_14_0= ruleLoan
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLibraryAccess().getLoansLoanParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleLoan_in_ruleLibrary340);
                    	    lv_loans_14_0=ruleLoan();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"loans",
                    	            		lv_loans_14_0, 
                    	            		"Loan");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLibrary354); 

                        	newLeafNode(otherlv_15, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:216:3: (otherlv_16= 'members' otherlv_17= '{' ( (lv_members_18_0= ruleMember ) ) (otherlv_19= ',' ( (lv_members_20_0= ruleMember ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:216:5: otherlv_16= 'members' otherlv_17= '{' ( (lv_members_18_0= ruleMember ) ) (otherlv_19= ',' ( (lv_members_20_0= ruleMember ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLibrary369); 

                        	newLeafNode(otherlv_16, grammarAccess.getLibraryAccess().getMembersKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLibrary381); 

                        	newLeafNode(otherlv_17, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:224:1: ( (lv_members_18_0= ruleMember ) )
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:225:1: (lv_members_18_0= ruleMember )
                    {
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:225:1: (lv_members_18_0= ruleMember )
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:226:3: lv_members_18_0= ruleMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getLibraryAccess().getMembersMemberParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleMember_in_ruleLibrary402);
                    lv_members_18_0=ruleMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	        }
                           		add(
                           			current, 
                           			"members",
                            		lv_members_18_0, 
                            		"Member");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:242:2: (otherlv_19= ',' ( (lv_members_20_0= ruleMember ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:242:4: otherlv_19= ',' ( (lv_members_20_0= ruleMember ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLibrary415); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getLibraryAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:246:1: ( (lv_members_20_0= ruleMember ) )
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:247:1: (lv_members_20_0= ruleMember )
                    	    {
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:247:1: (lv_members_20_0= ruleMember )
                    	    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:248:3: lv_members_20_0= ruleMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLibraryAccess().getMembersMemberParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleMember_in_ruleLibrary436);
                    	    lv_members_20_0=ruleMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"members",
                    	            		lv_members_20_0, 
                    	            		"Member");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLibrary450); 

                        	newLeafNode(otherlv_21, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLibrary464); 

                	newLeafNode(otherlv_22, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleEString"
    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:280:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:281:2: (iv_ruleEString= ruleEString EOF )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:282:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString501);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString512); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:289:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:292:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:293:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:293:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:293:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString552); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:301:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString578); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleBook"
    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:316:1: entryRuleBook returns [EObject current=null] : iv_ruleBook= ruleBook EOF ;
    public final EObject entryRuleBook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBook = null;


        try {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:317:2: (iv_ruleBook= ruleBook EOF )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:318:2: iv_ruleBook= ruleBook EOF
            {
             newCompositeNode(grammarAccess.getBookRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBook_in_entryRuleBook623);
            iv_ruleBook=ruleBook();

            state._fsp--;

             current =iv_ruleBook; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBook633); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:325:1: ruleBook returns [EObject current=null] : (otherlv_0= 'Book' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'copies' ( (lv_copies_4_0= ruleEBigInteger ) ) otherlv_5= '}' ) ;
    public final EObject ruleBook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_copies_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:328:28: ( (otherlv_0= 'Book' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'copies' ( (lv_copies_4_0= ruleEBigInteger ) ) otherlv_5= '}' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:329:1: (otherlv_0= 'Book' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'copies' ( (lv_copies_4_0= ruleEBigInteger ) ) otherlv_5= '}' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:329:1: (otherlv_0= 'Book' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'copies' ( (lv_copies_4_0= ruleEBigInteger ) ) otherlv_5= '}' )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:329:3: otherlv_0= 'Book' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'copies' ( (lv_copies_4_0= ruleEBigInteger ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBook670); 

                	newLeafNode(otherlv_0, grammarAccess.getBookAccess().getBookKeyword_0());
                
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:333:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:334:1: (lv_name_1_0= ruleEString )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:334:1: (lv_name_1_0= ruleEString )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:335:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBookAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBook691);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBookRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBook703); 

                	newLeafNode(otherlv_2, grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBook715); 

                	newLeafNode(otherlv_3, grammarAccess.getBookAccess().getCopiesKeyword_3());
                
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:359:1: ( (lv_copies_4_0= ruleEBigInteger ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:360:1: (lv_copies_4_0= ruleEBigInteger )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:360:1: (lv_copies_4_0= ruleEBigInteger )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:361:3: lv_copies_4_0= ruleEBigInteger
            {
             
            	        newCompositeNode(grammarAccess.getBookAccess().getCopiesEBigIntegerParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_ruleBook736);
            lv_copies_4_0=ruleEBigInteger();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBookRule());
            	        }
                   		set(
                   			current, 
                   			"copies",
                    		lv_copies_4_0, 
                    		"EBigInteger");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBook748); 

                	newLeafNode(otherlv_5, grammarAccess.getBookAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleLoan"
    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:389:1: entryRuleLoan returns [EObject current=null] : iv_ruleLoan= ruleLoan EOF ;
    public final EObject entryRuleLoan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoan = null;


        try {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:390:2: (iv_ruleLoan= ruleLoan EOF )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:391:2: iv_ruleLoan= ruleLoan EOF
            {
             newCompositeNode(grammarAccess.getLoanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLoan_in_entryRuleLoan784);
            iv_ruleLoan=ruleLoan();

            state._fsp--;

             current =iv_ruleLoan; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLoan794); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoan"


    // $ANTLR start "ruleLoan"
    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:398:1: ruleLoan returns [EObject current=null] : (otherlv_0= 'Loan' otherlv_1= '{' otherlv_2= 'book' ( ( ruleEString ) ) otherlv_4= 'member' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleLoan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:401:28: ( (otherlv_0= 'Loan' otherlv_1= '{' otherlv_2= 'book' ( ( ruleEString ) ) otherlv_4= 'member' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:402:1: (otherlv_0= 'Loan' otherlv_1= '{' otherlv_2= 'book' ( ( ruleEString ) ) otherlv_4= 'member' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:402:1: (otherlv_0= 'Loan' otherlv_1= '{' otherlv_2= 'book' ( ( ruleEString ) ) otherlv_4= 'member' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:402:3: otherlv_0= 'Loan' otherlv_1= '{' otherlv_2= 'book' ( ( ruleEString ) ) otherlv_4= 'member' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLoan831); 

                	newLeafNode(otherlv_0, grammarAccess.getLoanAccess().getLoanKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLoan843); 

                	newLeafNode(otherlv_1, grammarAccess.getLoanAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLoan855); 

                	newLeafNode(otherlv_2, grammarAccess.getLoanAccess().getBookKeyword_2());
                
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:414:1: ( ( ruleEString ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:415:1: ( ruleEString )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:415:1: ( ruleEString )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:416:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLoanRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLoanAccess().getBookBookCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLoan878);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLoan890); 

                	newLeafNode(otherlv_4, grammarAccess.getLoanAccess().getMemberKeyword_4());
                
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:433:1: ( ( ruleEString ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:434:1: ( ruleEString )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:434:1: ( ruleEString )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:435:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLoanRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLoanAccess().getMemberMemberCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLoan913);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLoan925); 

                	newLeafNode(otherlv_6, grammarAccess.getLoanAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoan"


    // $ANTLR start "entryRuleMember"
    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:460:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:461:2: (iv_ruleMember= ruleMember EOF )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:462:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMember_in_entryRuleMember961);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMember971); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:469:1: ruleMember returns [EObject current=null] : ( () otherlv_1= 'Member' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:472:28: ( ( () otherlv_1= 'Member' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:473:1: ( () otherlv_1= 'Member' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:473:1: ( () otherlv_1= 'Member' ( (lv_name_2_0= ruleEString ) ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:473:2: () otherlv_1= 'Member' ( (lv_name_2_0= ruleEString ) )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:473:2: ()
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:474:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMemberAccess().getMemberAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMember1017); 

                	newLeafNode(otherlv_1, grammarAccess.getMemberAccess().getMemberKeyword_1());
                
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:483:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:484:1: (lv_name_2_0= ruleEString )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:484:1: (lv_name_2_0= ruleEString )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:485:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMemberAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMember1038);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMemberRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleEBigInteger"
    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:509:1: entryRuleEBigInteger returns [String current=null] : iv_ruleEBigInteger= ruleEBigInteger EOF ;
    public final String entryRuleEBigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigInteger = null;


        try {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:510:2: (iv_ruleEBigInteger= ruleEBigInteger EOF )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:511:2: iv_ruleEBigInteger= ruleEBigInteger EOF
            {
             newCompositeNode(grammarAccess.getEBigIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigInteger_in_entryRuleEBigInteger1075);
            iv_ruleEBigInteger=ruleEBigInteger();

            state._fsp--;

             current =iv_ruleEBigInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBigInteger1086); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBigInteger"


    // $ANTLR start "ruleEBigInteger"
    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:518:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:521:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:522:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:522:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:522:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:522:2: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.oclinecore.tutorial.xtext/src-gen/org/eclipse/oclinecore/tutorial/xtext/parser/antlr/internal/InternalLibraryDsl.g:523:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEBigInteger1125); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEBigInteger1142); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBigInteger"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleLibrary_in_entryRuleLibrary75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLibrary85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleLibrary131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLibrary152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLibrary164 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_13_in_ruleLibrary177 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLibrary189 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleBook_in_ruleLibrary210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleLibrary223 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleBook_in_ruleLibrary244 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleLibrary258 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_16_in_ruleLibrary273 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLibrary285 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleLoan_in_ruleLibrary306 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleLibrary319 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleLoan_in_ruleLibrary340 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleLibrary354 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleLibrary369 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLibrary381 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleMember_in_ruleLibrary402 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleLibrary415 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleMember_in_ruleLibrary436 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleLibrary450 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLibrary464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBook_in_entryRuleBook623 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBook633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleBook670 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBook691 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBook703 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBook715 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_ruleBook736 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBook748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLoan_in_entryRuleLoan784 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLoan794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleLoan831 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLoan843 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleLoan855 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLoan878 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleLoan890 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLoan913 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLoan925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMember_in_entryRuleMember961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMember971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleMember1017 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMember1038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigInteger_in_entryRuleEBigInteger1075 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBigInteger1086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEBigInteger1125 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEBigInteger1142 = new BitSet(new long[]{0x0000000000000002L});
    }


}