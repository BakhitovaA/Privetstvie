import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ALEX on 22.09.2014.
 */
public class OneMetodPrivetstvie {
    public static void main(String[] args) {
        String [] names = {"Леша","Настя","Маша","Даша"};
        String [] privet = new String[names.length];
        for (int i=0; i<names.length; i=i+1) {
            privet [i] = "Привет, " + names[i]+"!";
            System.out.println(privet[i]);
        }
    }
}
