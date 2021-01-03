import java.util.*;
public class text2 {
    public static void main(String[] args) {
        //保存输入信息到set中
        Set<Student> stuSet = saveStudentInfo();
        //遍历set
        Iterator<Student> it = stuSet.iterator();
        while (it.hasNext()) {
            String info = it.next().toString();
            System.out.println(info);
        }
    }
    private static Set<Student> saveStudentInfo() {
        Scanner input = new Scanner(System.in);
        // 保存学生信息的TreeSet集合对象
        Set<Student> stuSet = new TreeSet<Student>();
        while (true) {
            // 输入提示
            System.out.println("请输入学生信息:(学号#姓名#年龄)");
            String inputData = input.nextLine();
            // 判断是否退出 inputData.equals("exit")
            if ("exit".equals(inputData)) {
                break;
            }
            // 将用户输入的学生信息分割为String[]
            String[] info = inputData.split("#");
            // 将输入信息封装到Student对象中
            Student stu = new Student(Integer.parseInt(info[0]), info[1],Integer.parseInt(info[2]));
            // 将学生对象加入集合
            stuSet.add(stu);
        }
        return stuSet;
    }
}
