
public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
	public Calculator() {
		
	}
	
	public void setOperandOne(double num) {
		this.operandOne = num;
	}
	public double getOperandOne() {
		return operandOne;
	}

	public void setOperation(String operation) {
		if(operation == "+" || operation == "-" || operation == "/" || operation == "*") {
			this.operation = operation;
		}else {
			System.out.println("error");
		}
	}
	public String getOperation() {
		return operation;
	}

	public void setOperandTwo(double num2) {
		this.operandTwo = num2;
	}
	public double getOperandTwo() {
		return operandTwo;
	}

	public void performOperation() {
		if(getOperation() == "+") {
			this.result = getOperandOne() + getOperandTwo();
			
		}else if(getOperation() == "-"){
			this.result = getOperandOne() - getOperandTwo();
		}
		else if(getOperation() == "*"){
			this.result = getOperandOne() * getOperandTwo();
		}
		else if(getOperation() == "/"){
			this.result = getOperandOne() / getOperandTwo();
		}
		else {
			System.out.println("error");
		}
	}

	public double getResults() {
		return this.result;
	}


}
