package p1020pa;

import android.text.TextUtils;
import java.io.File;
import p1005ma.C88718b;

/* renamed from: pa.d */
public class C89327d {
    /* renamed from: a */
    public static boolean m111648a(String str) {
        if (TextUtils.isEmpty(str)) {
            C88718b.m110682d("WxaLiteApp.FileUtil", "deleteFolder fail. path is null.", new Object[0]);
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m111648a(file2.getPath());
                } else {
                    file2.delete();
                }
            }
        }
        file.delete();
        return true;
    }
}
