package com.tencent.p014mm.plugin.appbrand.jsruntime;

import a70.C112760b;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.h0 */
public class C29552h0 {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.h0$a */
    public static final class C1916a implements C80916r<IPCVoid, IPCString> {
        private C1916a() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            String str = C86709a0.m107535s().f251807e;
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            return new IPCString(str + "appbrand/jscache");
        }
    }

    /* renamed from: a */
    public static String m38798a() {
        String b = m38799b();
        C86013q1.m106461v(b);
        return b;
    }

    /* renamed from: b */
    public static String m38799b() {
        String str;
        synchronized (C112760b.class) {
            str = C112760b.m154225d() + "appbrand/jscache/";
        }
        return str;
    }

    /* renamed from: c */
    public static String m38800c() {
        String str;
        synchronized (C112760b.class) {
            str = C112760b.m154225d() + "appbrand/snapshotjscache/";
        }
        return str;
    }
}
