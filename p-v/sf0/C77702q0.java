package sf0;

import com.tencent.xweb.file.XVFSFile;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: sf0.q0 */
public final class C77702q0 {

    /* renamed from: a */
    public static final /* synthetic */ int f226484a = 0;

    /* renamed from: sf0.q0$a */
    public static class C77703a {
        public String toString() {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace == null || stackTrace.length < 4) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 3; i < stackTrace.length; i++) {
                if (stackTrace[i].getClassName().contains("com.tencent.mm")) {
                    sb.append("[");
                    sb.append(stackTrace[i].getClassName().substring(15));
                    sb.append(XVFSFile.PATH_SEPARATOR);
                    sb.append(stackTrace[i].getMethodName());
                    sb.append("(" + stackTrace[i].getLineNumber() + ")]");
                }
            }
            return sb.toString();
        }
    }

    static {
        TimeZone.getTimeZone("GMT");
    }

    /* renamed from: a */
    public static String m93718a(long j) {
        if ((j >> 20) > 0) {
            return "" + (((float) Math.round((((float) j) * 10.0f) / 1048576.0f)) / 10.0f) + "MB";
        } else if ((j >> 9) > 0) {
            return "" + (((float) Math.round((((float) j) * 10.0f) / 1024.0f)) / 10.0f) + "KB";
        } else {
            return "" + j + "B";
        }
    }

    /* renamed from: b */
    public static boolean m93719b(String str) {
        return str == null || str.length() <= 0;
    }

    /* renamed from: c */
    public static List<String> m93720c(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int groupCount = matcher.groupCount();
        ArrayList arrayList = new ArrayList();
        if (!matcher.find()) {
            return arrayList;
        }
        for (int i = 1; i <= groupCount; i++) {
            arrayList.add(matcher.group(i));
        }
        return arrayList;
    }
}
