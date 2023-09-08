package v20;

import com.tencent.xweb.file.XVFSFile;

/* renamed from: v20.d */
public class C37646d {
    /* renamed from: a */
    public static final String m41473a(String str, String str2) {
        if (!str.contains(XVFSFile.PATH_SEPARATOR) && str.length() >= 1) {
            return str;
        }
        String[] split = str.split(XVFSFile.PATH_SEPARATOR);
        String str3 = split[0];
        return (str3 == null || str3.length() <= 0) ? str2 : split[0];
    }
}
