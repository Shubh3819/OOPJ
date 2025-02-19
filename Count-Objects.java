class CountObjects{

    public static int count = 0;
    public CountObjects() {
        count++;
    }
    public static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {
        CountObjects obj1 = new CountObjects();
        CountObjects obj2 = new CountObjects();
        CountObjects obj3 = new CountObjects();
		
        CountObjects.displayCount();
    }
}
