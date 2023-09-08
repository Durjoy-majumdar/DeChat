package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.v0 */
public enum C29682v0 implements C38174i<C29681u0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80639d;

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.v0$a */
    public static final class C29683a {

        /* renamed from: a */
        public static final List<Object> f80640a = null;

        static {
            f80640a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.v0$b */
    public static final class C29684b {

        /* renamed from: a */
        public static final List<Object> f80641a = null;

        static {
            f80641a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80639d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80639d;
                if (obj == obj2) {
                    obj = new C29681u0();
                    this.f80639d = obj;
                }
            }
        }
        return (C29681u0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29683a.f80640a;
        }
        if ("onProcess".equals(str)) {
            return C29684b.f80641a;
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
        return "provider " + C29681u0.class.getName();
    }
}
