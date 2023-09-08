package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.y */
public enum C29399y implements C38174i<C81531v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80203d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.y$a */
    public static final class C29400a {

        /* renamed from: a */
        public static final List<Object> f80204a = null;

        static {
            f80204a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.y$b */
    public static final class C29401b {

        /* renamed from: a */
        public static final List<Object> f80205a = null;

        static {
            f80205a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f80203d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80203d;
                if (obj == obj2) {
                    obj = new C81531v();
                    this.f80203d = obj;
                }
            }
        }
        return (C81531v) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29401b.f80205a;
        }
        if ("dependencies".equals(str)) {
            return C29400a.f80204a;
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
        return "provider " + C81531v.class.getName();
    }
}
