
public class Students {

    private int id, age;
    private long contact;
    private String name, gender, course, mname, lname;

    public Students(int id, String name, String mname, String lname, String gender, int age, String course, long contact) {

        this.id = id;
        this.name = name;
        this.mname = mname;
        this.lname = lname;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.contact = contact;
    }

    public int getId() {

        return this.id;

    }

    public String getName() {

        return this.name;

    }

    public String getMName() {

        return this.mname;

    }

    public String getLName() {

        return this.lname;

    }

    public String getGender() {
        return this.gender;

    }

    public long getAge() {

        return this.age;

    }

    public String getCourse() {

        return this.course;

    }

    public long getContact() {

        return this.contact;

    }

}