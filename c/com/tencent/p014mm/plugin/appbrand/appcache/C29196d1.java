package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.d1 */
public enum C29196d1 implements C38174i<C81236c1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79840d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.d1$a */
    public static final class C29197a {

        /* renamed from: a */
        public static final List<Object> f79841a = null;

        static {
            f79841a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.d1$b */
    public static final class C29198b {

        /* renamed from: a */
        public static final List<Object> f79842a = null;

        static {
            f79842a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79840d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79840d;
                if (obj == obj2) {
                    obj = C81236c1.vx0();
                    this.f79840d = obj;
                }
            }
        }
        return (C81236c1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C81236c1.class;
        }
        if ("onProcess".equals(str)) {
            return C29198b.f79842a;
        }
        if ("dependencies".equals(str)) {
            return C29197a.f79841a;
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
        return "provider " + C81236c1.class.getName();
    }
}
