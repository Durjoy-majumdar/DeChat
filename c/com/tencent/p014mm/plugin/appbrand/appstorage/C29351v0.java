package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.v0 */
public enum C29351v0 implements C38174i<C29347u0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80116d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.v0$a */
    public static final class C29352a {

        /* renamed from: a */
        public static final List<Object> f80117a = null;

        static {
            f80117a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.v0$b */
    public static final class C29353b {

        /* renamed from: a */
        public static final List<Object> f80118a = null;

        static {
            f80118a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80116d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80116d;
                if (obj == obj2) {
                    obj = new C29347u0();
                    this.f80116d = obj;
                }
            }
        }
        return (C29347u0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29352a.f80117a;
        }
        if ("onProcess".equals(str)) {
            return C29353b.f80118a;
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
        return "provider " + C29347u0.class.getName();
    }
}
