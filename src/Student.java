class Student implements Comparable<Student>{
    private Integer num;
    private String name;
    private Integer age;
    public Student(int num,String name,int age){
        this.num=num;
        this.name=name;
        this.age=age;
    }
    public int compareTo(Student stu) {
        return this.age-stu.age;
    }
    public String toString() {
        return "Student [age=" + age + ", name=" + name +
                ", num=" + num + "]";
    }
}