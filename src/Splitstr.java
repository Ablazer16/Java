public class Splitstr {
    public static void main(String[] args) {
        String str= "JavaforBCAStudents";
        String[] arrofstr= str.split("for");
        for(String a:arrofstr)
            System.out.println(a);
    }
}
