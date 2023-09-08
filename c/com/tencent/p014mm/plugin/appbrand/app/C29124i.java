package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.i */
public enum C29124i implements C38174i<AppBrandMixExportLogicService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79707d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.i$a */
    public static final class C29125a {

        /* renamed from: a */
        public static final List<Object> f79708a = null;

        static {
            f79708a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.i$b */
    public static final class C29126b {

        /* renamed from: a */
        public static final List<Object> f79709a = null;

        static {
            f79709a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79707d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79707d;
                if (obj == obj2) {
                    obj = new AppBrandMixExportLogicService();
                    this.f79707d = obj;
                }
            }
        }
        return (AppBrandMixExportLogicService) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29126b.f79709a;
        }
        if ("dependencies".equals(str)) {
            return C29125a.f79708a;
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
        return "provider " + AppBrandMixExportLogicService.class.getName();
    }
}
