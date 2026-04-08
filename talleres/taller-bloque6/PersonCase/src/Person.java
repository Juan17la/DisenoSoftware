public abstract class Person {
    
    private String name;
    private String address;
    private String email;
    
    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = setEmail(email);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email){
        if(email.contains("@") && email.contains(".")){
            this.email = email;
            return email;
        } else {
            throw new RuntimeException("this is not valid");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
