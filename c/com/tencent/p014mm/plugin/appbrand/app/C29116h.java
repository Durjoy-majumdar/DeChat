package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C29114g;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.h */
public enum C29116h implements C38174i<C81156f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79697d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.h$a */
    public static final class C29117a {

        /* renamed from: a */
        public static final List<Object> f79698a = null;

        static {
            f79698a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.h$b */
    public static final class C29118b {

        /* renamed from: a */
        public static final List<Object> f79699a = null;

        static {
            f79699a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f79697d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79697d;
                if (obj == obj2) {
                    C29114g.f79694a.getClass();
                    obj = C81156f.f238464d;
                    this.f79697d = obj;
                }
            }
        }
        return (C81156f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C29114g.C29115a.class;
        }
        if ("dependencies".equals(str)) {
            return C29117a.f79698a;
        }
        if ("onProcess".equals(str)) {
            return C29118b.f79699a;
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
        return "provider " + C81156f.class.getName();
    }
}
