package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.i4 */
public enum C29577i4 implements C38174i<C83331h4> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80504d;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.i4$a */
    public static final class C29578a {

        /* renamed from: a */
        public static final List<Object> f80505a = null;

        static {
            f80505a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.i4$b */
    public static final class C29579b {

        /* renamed from: a */
        public static final List<Object> f80506a = null;

        static {
            f80506a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f80504d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80504d;
                if (obj == obj2) {
                    obj = new C83331h4();
                    this.f80504d = obj;
                }
            }
        }
        return (C83331h4) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29578a.f80505a;
        }
        if ("onProcess".equals(str)) {
            return C29579b.f80506a;
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
        return "provider " + C83331h4.class.getName();
    }
}
