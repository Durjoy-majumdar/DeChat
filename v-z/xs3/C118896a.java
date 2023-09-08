package xs3;

import ft3.C116895f;
import java.io.File;
import java.io.IOException;
import ys3.C118989a;

/* renamed from: xs3.a */
public class C118896a {
    /* renamed from: a */
    public static boolean m167638a(String str) {
        if (!new File(str).exists()) {
            return true;
        }
        try {
            boolean a = C118989a.m167751a(str);
            if (!a) {
                C116895f.m164890b("BootScriptChecker found no-elf file : " + str);
            }
            return a;
        } catch (IOException e) {
            C116895f.m164893e(e);
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m167639b(String str) {
        File file = new File(str);
        if (!file.exists() || file.length() > 51200) {
            return true;
        }
        try {
            String str2 = new String(C118989a.m167752b(file.getAbsolutePath()));
            boolean contains = str2.contains("applypatch ");
            C116895f.m164891c("RiskScanner", "BootScriptChecker script (" + str + ") content : \n" + str2);
            if (!contains) {
                C116895f.m164890b("BootScriptChecker found unofficial file : " + str);
            }
            return contains;
        } catch (Exception e) {
            C116895f.m164893e(e);
            return true;
        }
    }
}
