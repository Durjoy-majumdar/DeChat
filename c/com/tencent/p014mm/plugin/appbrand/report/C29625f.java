package com.tencent.p014mm.plugin.appbrand.report;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.report.f */
public enum C29625f implements C38174i<C29624e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80556d;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.f$a */
    public static final class C29626a {

        /* renamed from: a */
        public static final List<Object> f80557a = null;

        static {
            f80557a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.f$b */
    public static final class C29627b {

        /* renamed from: a */
        public static final List<Object> f80558a = null;

        static {
            f80558a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80556d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80556d;
                if (obj == obj2) {
                    obj = new C29624e();
                    this.f80556d = obj;
                }
            }
        }
        return (C29624e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29627b.f80558a;
        }
        if ("dependencies".equals(str)) {
            return C29626a.f80557a;
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
        return "provider " + C29624e.class.getName();
    }
}
