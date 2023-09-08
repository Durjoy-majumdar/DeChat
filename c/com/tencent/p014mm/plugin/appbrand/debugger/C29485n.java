package com.tencent.p014mm.plugin.appbrand.debugger;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.n */
public enum C29485n implements C38174i<C29483m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80344d;

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.n$a */
    public static final class C29486a {

        /* renamed from: a */
        public static final List<Object> f80345a = null;

        static {
            f80345a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.n$b */
    public static final class C29487b {

        /* renamed from: a */
        public static final List<Object> f80346a = null;

        static {
            f80346a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80344d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80344d;
                if (obj == obj2) {
                    obj = new C29483m();
                    this.f80344d = obj;
                }
            }
        }
        return (C29483m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29487b.f80346a;
        }
        if ("dependencies".equals(str)) {
            return C29486a.f80345a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C29483m.class.getName();
    }
}
