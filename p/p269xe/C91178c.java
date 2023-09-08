package p269xe;

import android.os.Process;
import android.text.TextUtils;
import com.tencent.wxperf.thread.ThreadInspect;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p329d3.C58104c;

/* renamed from: xe.c */
public final class C91178c {
    /* renamed from: a */
    public static String m114428a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String[] split = str.split("\n");
        int i = 0;
        while (i < split.length && i < 30) {
            sb.append(sb.length() == 0 ? "" : ";");
            sb.append(split[i]);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static C58104c<String, String> m114429b(int i) {
        String str;
        String str2 = "";
        try {
            if (i == Process.myPid()) {
                str = "unwind_err: skip ui thread";
            } else if (ThreadInspect.init()) {
                String jUnwindR = ThreadInspect.jUnwindR(i);
                if (!TextUtils.isEmpty(jUnwindR)) {
                    str = m114428a(jUnwindR);
                    str2 = m114430c(jUnwindR);
                } else {
                    String localCurrentThread = i == Process.myTid() ? ThreadInspect.getLocalCurrentThread() : ThreadInspect.getLocalThread(i);
                    if (TextUtils.isEmpty(localCurrentThread)) {
                        str = "unwind_err: empty";
                    } else {
                        String a = m114428a(localCurrentThread);
                        str2 = m114431d(localCurrentThread);
                        str = a;
                    }
                }
            } else {
                str = "unwind_err: init fail";
            }
        } catch (Throwable th) {
            str = "unwind_err: " + th.getMessage();
        }
        return new C58104c<>(str, str2);
    }

    /* renamed from: c */
    public static String m114430c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String trim : str.split("\n")) {
            String trim2 = trim.trim();
            if (!trim2.startsWith("com.tencent.wxperf.thread.ThreadInspect") && !trim2.startsWith("at com.tencent.wxperf.thread.ThreadInspect")) {
                sb.append(sb.length() == 0 ? "" : ";");
                sb.append(trim2);
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m114431d(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        List asList = Arrays.asList(new String[]{"tencent", "hilive"});
        int i = 0;
        for (String str2 : str.split("\n")) {
            if (i >= 10) {
                break;
            }
            Iterator it = asList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str2.contains((String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                int i2 = -1;
                int length = str2.length();
                if (str2.contains("/lib")) {
                    i2 = str2.lastIndexOf("/lib") + 4;
                } else if (str2.contains(" (")) {
                    i2 = str2.lastIndexOf(" (") + 2;
                }
                if (str2.contains("+")) {
                    length = str2.lastIndexOf("+");
                }
                if (i2 >= 0 && i2 < length) {
                    String trim = str2.substring(i2, length).trim();
                    if (!TextUtils.isEmpty(trim) && (!trim.endsWith(".so") || !sb.toString().endsWith(trim))) {
                        sb.append(sb.length() == 0 ? "" : ";");
                        sb.append(trim);
                        i++;
                    }
                }
            }
        }
        return sb.toString();
    }
}
