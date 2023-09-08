package com.tencent.p014mm.plugin.appbrand.task.preload;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.task.preload.b */
public enum C29653b implements C38174i<AppBrandBatchPreloadController> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80592d;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.b$a */
    public static final class C29654a {

        /* renamed from: a */
        public static final List<Object> f80593a = null;

        static {
            f80593a = Arrays.asList(new Object[]{PluginAppBrand.class, C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.b$b */
    public static final class C29655b {

        /* renamed from: a */
        public static final List<Object> f80594a = null;

        static {
            f80594a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f80592d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80592d;
                if (obj == obj2) {
                    obj = new AppBrandBatchPreloadController();
                    this.f80592d = obj;
                }
            }
        }
        return (AppBrandBatchPreloadController) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29654a.f80593a;
        }
        if ("onProcess".equals(str)) {
            return C29655b.f80594a;
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
        return "provider " + AppBrandBatchPreloadController.class.getName();
    }
}
