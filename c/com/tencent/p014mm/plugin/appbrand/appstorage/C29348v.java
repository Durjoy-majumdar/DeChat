package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.v */
public enum C29348v implements C38174i<C81460u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80111d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.v$a */
    public static final class C29349a {

        /* renamed from: a */
        public static final List<Object> f80112a = null;

        static {
            f80112a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.v$b */
    public static final class C29350b {

        /* renamed from: a */
        public static final List<Object> f80113a = null;

        static {
            f80113a = Arrays.asList(new Object[]{C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f80111d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80111d;
                if (obj == obj2) {
                    obj = new C81460u();
                    this.f80111d = obj;
                }
            }
        }
        return (C81460u) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29349a.f80112a;
        }
        if ("onProcess".equals(str)) {
            return C29350b.f80113a;
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
        return "provider " + C81460u.class.getName();
    }
}
