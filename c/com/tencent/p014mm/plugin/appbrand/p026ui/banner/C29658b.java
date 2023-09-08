package com.tencent.p014mm.plugin.appbrand.p026ui.banner;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.banner.b */
public enum C29658b implements C38174i<C84492a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80602d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.banner.b$a */
    public static final class C29659a {

        /* renamed from: a */
        public static final List<Object> f80603a = null;

        static {
            f80603a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.banner.b$b */
    public static final class C29660b {

        /* renamed from: a */
        public static final List<Object> f80604a = null;

        static {
            f80604a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80602d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80602d;
                if (obj == obj2) {
                    obj = new C84492a();
                    this.f80602d = obj;
                }
            }
        }
        return (C84492a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29659a.f80603a;
        }
        if ("onProcess".equals(str)) {
            return C29660b.f80604a;
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
        return "provider " + C84492a.class.getName();
    }
}
