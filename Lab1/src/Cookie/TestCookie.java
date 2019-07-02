class TestCookie {
    public static void main(String args[]){
        Cookie c1 = new Cookie();

        Cookie c2 = new Cookie("Rectangle", "Red");

        System.out.println("C1's shape is " + c1.getShape());
        c1.setShape("Circle");
        System.out.println("C1's shape is now " + c1.getShape());
    }
}
