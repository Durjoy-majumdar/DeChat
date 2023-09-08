package p1118h4;

import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: h4.a */
public final class C108057a {

    /* renamed from: a */
    public static long f323574a;

    /* renamed from: b */
    public static Method f323575b;

    /* renamed from: a */
    public static boolean m146362a() {
        try {
            if (f323575b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f323575b == null) {
                f323574a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f323575b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f323575b.invoke((Object) null, new Object[]{Long.valueOf(f323574a)})).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
