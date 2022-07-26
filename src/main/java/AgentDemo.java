import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.instrument.Instrumentation;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/7/25 17:51
 */

public class AgentDemo {
    public static void agentmain(String agentArgs, Instrumentation inst) throws IOException {
        Class[] classes = inst.getAllLoadedClasses();
        FileOutputStream fileOutputStream = new FileOutputStream(new File("/tmp/classesInfo"));
        for (Class aClass : classes) {
            String result = "class ==> " + aClass.getName() + "\n\t" + "Modifiable ==> " + (inst.isModifiableClass(aClass) ? "true" : "false") + "\n";
//            System.out.println(result);
            fileOutputStream.write(result.getBytes());
        }
        fileOutputStream.close();
    }
}
