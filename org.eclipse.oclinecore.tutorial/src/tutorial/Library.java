/**
 */
package tutorial;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tutorial.Library#getName <em>Name</em>}</li>
 *   <li>{@link tutorial.Library#getBooks <em>Books</em>}</li>
 *   <li>{@link tutorial.Library#getLoans <em>Loans</em>}</li>
 *   <li>{@link tutorial.Library#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see tutorial.TutorialPackage#getLibrary()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Library extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tutorial.TutorialPackage#getLibrary_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tutorial.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Books</b></em>' containment reference list.
	 * The list contents are of type {@link tutorial.Book}.
	 * It is bidirectional and its opposite is '{@link tutorial.Book#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' containment reference list.
	 * @see tutorial.TutorialPackage#getLibrary_Books()
	 * @see tutorial.Book#getLibrary
	 * @model opposite="library" containment="true" ordered="false"
	 * @generated
	 */
	EList<Book> getBooks();

	/**
	 * Returns the value of the '<em><b>Loans</b></em>' containment reference list.
	 * The list contents are of type {@link tutorial.Loan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loans</em>' containment reference list.
	 * @see tutorial.TutorialPackage#getLibrary_Loans()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Loan> getLoans();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link tutorial.Member}.
	 * It is bidirectional and its opposite is '{@link tutorial.Member#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see tutorial.TutorialPackage#getLibrary_Members()
	 * @see tutorial.Member#getLibrary
	 * @model opposite="library" containment="true" ordered="false"
	 * @generated
	 */
	EList<Member> getMembers();

} // Library
