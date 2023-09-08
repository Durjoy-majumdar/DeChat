package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1574a3;
import java.lang.reflect.Method;

/* renamed from: com.tencent.tmsqmsp.oaid2.n0 */
public class C116471n0 implements C116443b {

    /* renamed from: b */
    public static Class f349403b;

    /* renamed from: c */
    public static Object f349404c;

    /* renamed from: d */
    public static Method f349405d;

    /* renamed from: e */
    public static Method f349406e;

    /* renamed from: a */
    public Context f349407a;

    public C116471n0() {
        try {
            C116445c.m164140c("xm start");
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f349403b = cls;
            f349404c = cls.newInstance();
            f349405d = f349403b.getMethod(C1574a3.NAME, new Class[]{Context.class});
            f349406e = f349403b.getMethod("getAAID", new Class[]{Context.class});
        } catch (Exception e) {
            C116445c.m164138a("xm reflect exception!".concat(String.valueOf(e)));
        }
    }

    /* renamed from: a */
    public void mo120388a(Context context, IVendorCallback iVendorCallback) {
        this.f349407a = context;
    }

    /* renamed from: d */
    public String mo120389d() {
        Method method;
        Object obj = f349404c;
        if (obj == null || (method = f349406e) == null) {
            return null;
        }
        return mo179918a(this.f349407a, obj, method);
    }

    /* renamed from: e */
    public boolean mo120390e() {
        return (f349403b == null || f349404c == null) ? false : true;
    }

    /* renamed from: j */
    public void mo120391j() {
    }

    /* renamed from: k */
    public boolean mo120392k() {
        return true;
    }

    /* renamed from: l */
    public void mo120393l() {
    }

    /* renamed from: a */
    public String mo120387a() {
        Method method;
        Object obj = f349404c;
        if (obj == null || (method = f349405d) == null) {
            return null;
        }
        return mo179918a(this.f349407a, obj, method);
    }

    /* renamed from: a */
    public final String mo179918a(Context context, Object obj, Method method) {
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, new Object[]{context});
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
