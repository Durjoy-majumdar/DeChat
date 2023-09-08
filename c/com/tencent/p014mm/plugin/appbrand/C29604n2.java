package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.C1940m2;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.n2 */
public enum C29604n2 implements C38174i<C1940m2> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80533d;

    /* renamed from: com.tencent.mm.plugin.appbrand.n2$a */
    public static final class C29605a {

        /* renamed from: a */
        public static final List<Object> f80534a = null;

        static {
            f80534a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.n2$b */
    public static final class C29606b {

        /* renamed from: a */
        public static final List<Object> f80535a = null;

        static {
            f80535a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80533d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80533d;
                if (obj == obj2) {
                    obj = C1940m2.C1941a.f11819a;
                    this.f80533d = obj;
                }
            }
        }
        return (C1940m2) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C1940m2.class;
        }
        if ("onProcess".equals(str)) {
            return C29606b.f80535a;
        }
        if ("dependencies".equals(str)) {
            return C29605a.f80534a;
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
        return "provider " + C1940m2.class.getName();
    }
}
