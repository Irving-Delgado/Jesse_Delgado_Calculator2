
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator result = new Calculator();
		
		
	result.setOperandOne(10.5);
	result.setOperation("*");
	result.setOperandTwo(5.2);
	result.performOperation();
	System.out.println(result.getResults());

	}

}
