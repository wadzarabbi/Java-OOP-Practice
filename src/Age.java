class Age {

    private int ummol;

    public Age(int ummol) {
        this.ummol = ummol;
    }

    // Method to display the message based on age
    public void checkAge() {
        if (ummol > 25) {
            System.out.println("Biyabas bato na");
        } else if (ummol < 20) {
            System.out.println("Subol/Budjang pa");
        } else {
            System.out.println("Sung na mabalos");
        }
    }

    // Setter method to set the value of ummol
    public void setNumber(int ummol) {
        this.ummol = ummol;
    }

    // Getter method to retrieve the value of ummol
    public int getNumber() {
        return ummol;
    }

}
