/**
 */
package tutorial.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tutorial.Loan;
import tutorial.TutorialFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Loan</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoanTest extends TestCase {

	/**
	 * The fixture for this Loan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Loan fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoanTest.class);
	}

	/**
	 * Constructs a new Loan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoanTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Loan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Loan fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Loan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Loan getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TutorialFactory.eINSTANCE.createLoan());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LoanTest
