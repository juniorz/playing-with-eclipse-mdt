/**
 */
package tutorial;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tutorial.Loan#getBook <em>Book</em>}</li>
 *   <li>{@link tutorial.Loan#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see tutorial.TutorialPackage#getLoan()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Loan extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Book</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Book</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book</em>' reference.
	 * @see #setBook(Book)
	 * @see tutorial.TutorialPackage#getLoan_Book()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Book getBook();

	/**
	 * Sets the value of the '{@link tutorial.Loan#getBook <em>Book</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book</em>' reference.
	 * @see #getBook()
	 * @generated
	 */
	void setBook(Book value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(Member)
	 * @see tutorial.TutorialPackage#getLoan_Member()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Member getMember();

	/**
	 * Sets the value of the '{@link tutorial.Loan#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(Member value);

} // Loan
