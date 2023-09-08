package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.k */
public enum C29135k implements C38174i<C29130j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79729d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.k$a */
    public static final class C29136a {

        /* renamed from: a */
        public static final List<Object> f79730a = null;

        static {
            f79730a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.k$b */
    public static final class C29137b {

        /* renamed from: a */
        public static final List<Object> f79731a = null;

        static {
            f79731a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79729d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79729d;
                if (obj == obj2) {
                    obj = new C29130j();
                    this.f79729d = obj;
                }
            }
        }
        return (C29130j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29136a.f79730a;
        }
        if ("onProcess".equals(str)) {
            return C29137b.f79731a;
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
        return "provider " + C29130j.class.getName();
    }
}
