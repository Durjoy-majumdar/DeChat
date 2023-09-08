package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.m1 */
public enum C29149m1 implements C38174i<C81152d1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79757d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.m1$a */
    public static final class C29150a {

        /* renamed from: a */
        public static final List<Object> f79758a = null;

        static {
            f79758a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.m1$b */
    public static final class C29151b {

        /* renamed from: a */
        public static final List<Object> f79759a = null;

        static {
            f79759a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79757d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79757d;
                if (obj == obj2) {
                    obj = new C81152d1();
                    this.f79757d = obj;
                }
            }
        }
        return (C81152d1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29151b.f79759a;
        }
        if ("dependencies".equals(str)) {
            return C29150a.f79758a;
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
        return "provider " + C81152d1.class.getName();
    }
}
