package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.n */
public enum C29435n implements C38174i<C29434m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80261d;

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.n$a */
    public static final class C29436a {

        /* renamed from: a */
        public static final List<Object> f80262a = null;

        static {
            f80262a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.n$b */
    public static final class C29437b {

        /* renamed from: a */
        public static final List<Object> f80263a = null;

        static {
            f80263a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80261d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80261d;
                if (obj == obj2) {
                    obj = new C29434m();
                    this.f80261d = obj;
                }
            }
        }
        return (C29434m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29436a.f80262a;
        }
        if ("onProcess".equals(str)) {
            return C29437b.f80263a;
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
        return "provider " + C29434m.class.getName();
    }
}
