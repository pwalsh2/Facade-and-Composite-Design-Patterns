/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pwalsh2
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ListComponent {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/

	public Item temp = null;

	public ListComponent(int value){
		
		this.temp = new Item(value);

	}
	public void printValue() {
		// begin-user-code
		// TODO Auto-generated method stub
		if(this.temp.value == -1){
			System.out.print(")");
		}
		else if(this.temp.value == -2){
			System.out.print("(");
		}
		else{
			this.temp.printValue();
		}

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param index
	* @param child
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addChild(int index, ListComponent child) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param index
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void removeChild(int index) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param index
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public ListComponent getChild(int index) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int numberOfChildren() {
		// begin-user-code
		// TODO Auto-generated method stub
		return 0;
		// end-user-code
	}
}