package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.e */
public enum C29449e implements C38174i<C29446d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80286d;

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.e$a */
    public static final class C29450a {

        /* renamed from: a */
        public static final List<Object> f80287a = null;

        static {
            f80287a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.e$b */
    public static final class C29451b {

        /* renamed from: a */
        public static final List<Object> f80288a = null;

        static {
            f80288a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f80286d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80286d;
                if (obj == obj2) {
                    obj = new C29446d();
                    this.f80286d = obj;
                }
            }
        }
        return (C29446d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29450a.f80287a;
        }
        if ("onProcess".equals(str)) {
            return C29451b.f80288a;
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
        return "provider " + C29446d.class.getName();
    }
}
