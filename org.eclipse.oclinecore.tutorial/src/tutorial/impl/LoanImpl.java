/**
 */
package tutorial.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import tutorial.Book;
import tutorial.Loan;
import tutorial.Member;
import tutorial.TutorialPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tutorial.impl.LoanImpl#getBook <em>Book</em>}</li>
 *   <li>{@link tutorial.impl.LoanImpl#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoanImpl extends CDOObjectImpl implements Loan {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TutorialPackage.Literals.LOAN;
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
	public Book getBook() {
		return (Book)eGet(TutorialPackage.Literals.LOAN__BOOK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBook(Book newBook) {
		eSet(TutorialPackage.Literals.LOAN__BOOK, newBook);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member getMember() {
		return (Member)eGet(TutorialPackage.Literals.LOAN__MEMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(Member newMember) {
		eSet(TutorialPackage.Literals.LOAN__MEMBER, newMember);
	}

} //LoanImpl
