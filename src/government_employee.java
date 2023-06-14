public class government_employee extends employee {
    String type;

    government_employee(String type) {
        this.type = type;
        System.out.println("I am a "+type + " government employee");
    }
}

