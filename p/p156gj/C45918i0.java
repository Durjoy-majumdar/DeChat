package p156gj;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Method;

/* renamed from: gj.i0 */
public class C45918i0 {

    /* renamed from: a */
    public static Class<?> f123896a;

    /* renamed from: b */
    public static Method f123897b;

    /* renamed from: c */
    public static Method f123898c;

    static {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            f123896a = cls2;
            f123897b = cls2.getDeclaredMethod("get", new Class[]{cls});
            f123898c = f123896a.getDeclaredMethod("getInt", new Class[]{cls, Integer.TYPE});
            f123897b.setAccessible(true);
            f123898c.setAccessible(true);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SystemProperties", e, "", new Object[0]);
        }
    }

    /* renamed from: a */
    public static String m51188a(String str) {
        try {
            return (String) f123897b.invoke((Object) null, new Object[]{str});
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SystemProperties", e, "", new Object[0]);
            return null;
        }
    }
}
