/**
 */
package tutorial.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import tutorial.Book;
import tutorial.Library;
import tutorial.Loan;
import tutorial.Member;
import tutorial.TutorialPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tutorial.impl.LibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link tutorial.impl.LibraryImpl#getBooks <em>Books</em>}</li>
 *   <li>{@link tutorial.impl.LibraryImpl#getLoans <em>Loans</em>}</li>
 *   <li>{@link tutorial.impl.LibraryImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryImpl extends CDOObjectImpl implements Library {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TutorialPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(TutorialPackage.Literals.LIBRARY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(TutorialPackage.Literals.LIBRARY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Book> getBooks() {
		return (EList<Book>)eGet(TutorialPackage.Literals.LIBRARY__BOOKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Loan> getLoans() {
		return (EList<Loan>)eGet(TutorialPackage.Literals.LIBRARY__LOANS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Member> getMembers() {
		return (EList<Member>)eGet(TutorialPackage.Literals.LIBRARY__MEMBERS, true);
	}

} //LibraryImpl
