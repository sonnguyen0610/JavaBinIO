package Ex;

import java.io.Serializable;

public class Person implements Serializable {//so hoa thanh mang byte de luu tap tin
    private static final long serialVersionUID = 1L; //Sd ghi/ đọc bằng object thì phải có cái này
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ex.Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
