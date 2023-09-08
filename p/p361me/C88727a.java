package p361me;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: me.a */
public final class C88727a {

    /* renamed from: a */
    public static String f256088a;

    /* renamed from: a */
    public static String m110690a(Throwable th) {
        StackTraceElement[] stackTrace;
        if (th == null || (stackTrace = th.getStackTrace()) == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList(stackTrace.length);
        for (int i = 0; i < stackTrace.length; i++) {
            String className = stackTrace[i].getClassName();
            if (!className.contains("libcore.io") && !className.contains("com.tencent.matrix.iocanary") && !className.contains("java.io") && !className.contains("dalvik.system") && !className.contains("android.os")) {
                arrayList.add(stackTrace[i]);
            }
        }
        if (arrayList.size() > 10 && f256088a != null) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                if (!((StackTraceElement) listIterator.previous()).getClassName().contains(f256088a)) {
                    listIterator.remove();
                }
                if (arrayList.size() <= 10) {
                    break;
                }
            }
        }
        StringBuffer stringBuffer = new StringBuffer(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append((StackTraceElement) it.next());
            stringBuffer.append(10);
        }
        return stringBuffer.toString();
    }
}
