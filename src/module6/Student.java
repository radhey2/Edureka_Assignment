package module6;

public class Student {

    public String id;
    public String name;
    public String std;
    public String gender;
    public String marks;
    public String address;

    public Student() {

    }

    public Student(String i, String name, String std, String gender, String d, String address) {
        this.id = i;
        this.name = name;
        this.std = std;
        this.gender = gender;
        this.marks = d;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [address=" + address + ", gender=" + gender + ", id=" + id + ", marks=" + marks + ", name="
                + name + ", std=" + std + "]";
    }

}