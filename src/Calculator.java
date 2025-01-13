class Calculator {
    
    private int num1;
    private int num2;
    private int num3;

    int addition() {
        return this.num1 + this.num2 * this.num3;
    }
    
    int subtract() {
        return this.num1 - this.num2 * this.num3;
    }
  
    int division() {
        return this.num1 / this.num2 + this.num3;
    }
  
    int multiplication() {
        return this.num1 * this.num2 / this.num3;
    }
    
    void setNumber(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
}
