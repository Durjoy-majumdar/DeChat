package dt3;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1574a3;
import ct3.C86134a;
import ct3.C86139c;
import java.lang.reflect.Method;

/* renamed from: dt3.h */
public class C86404h implements C86134a {

    /* renamed from: c */
    public static Object f251184c;

    /* renamed from: d */
    public static Class<?> f251185d;

    /* renamed from: a */
    public int f251186a = -1;

    /* renamed from: b */
    public String f251187b = "";

    /* renamed from: a */
    public synchronized C86139c mo120551a(Context context) {
        this.f251186a = 0;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f251185d = cls;
            try {
                f251184c = cls.newInstance();
                try {
                    Method method = f251185d.getMethod(C1574a3.NAME, new Class[]{Context.class});
                    Object obj = f251184c;
                    if (!(obj == null || method == null)) {
                        try {
                            Object invoke = method.invoke(obj, new Object[]{context});
                            if (invoke != null) {
                                this.f251187b = (String) invoke;
                            } else {
                                this.f251186a = -305;
                            }
                        } catch (Throwable unused) {
                            this.f251186a = -306;
                        }
                    }
                } catch (Throwable unused2) {
                    return C86139c.m106651a(-304);
                }
            } catch (InstantiationException unused3) {
                return C86139c.m106651a(-302);
            } catch (IllegalAccessException unused4) {
                return C86139c.m106651a(-303);
            }
        } catch (Throwable unused5) {
            return C86139c.m106651a(-301);
        }
        return new C86139c(this.f251187b, this.f251186a);
    }
}
