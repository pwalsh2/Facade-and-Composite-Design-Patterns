/**
 * 
 */
import java.util.*;
/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author pwalsh2
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ListBuilder {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Stack<ListComponent> stack = new Stack<ListComponent>();
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ListComponent listComponent;

	/** 
	* <!-- begin-UML-doc -->
	* <p>ListComposite lc = new ListComposite();</p><p>If(!stack.isEmpty()){tack.top().addChild(lc);} else root= lc;</p><p></p><p>if(parent != null)parent.addChild(lc);</p><p>stack.push(lc);</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void buildOpenBracket() {
		// begin-user-code
		// TODO Auto-generated method stub
		stack.add(new ListComponent(-1));
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>stack.pop();</p>
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void buildCloseBracket() {
		// begin-user-code
		// TODO Auto-generated method stub
		stack.add(new ListComponent(-2));
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>Item item = new Item(number);</p><p>if(!stack.isempty()) stack.top().addChild(item);</p><p>else root = item </p>
	* <!-- end-UML-doc -->
	* @param number
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void buildElement(int number) {
		// begin-user-code
		// TODO Auto-generated method stub
		stack.add(new ListComponent(number));
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <p>return root;</p>
	* <!-- end-UML-doc -->
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public ListComponent getList() {
		// begin-user-code
		// TODO Auto-generated method stub
		while(!stack.empty()){
			
			stack.pop().printValue();
			
		}
		// end-user-code
	}
}