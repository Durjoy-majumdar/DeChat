package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.e3 */
public enum C29209e3 implements C38174i<C29199d3> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79857d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.e3$a */
    public static final class C29210a {

        /* renamed from: a */
        public static final List<Object> f79858a = null;

        static {
            f79858a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79857d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79857d;
                if (obj == obj2) {
                    obj = new C29199d3();
                    this.f79857d = obj;
                }
            }
        }
        return (C29199d3) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29210a.f79858a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "AppBrandNotify") || Objects.equals(obj, "AppPublicLibraryNotify") || Objects.equals(obj, "mmbizwxaconfig") || Objects.equals(obj, "ForceOpenAppNotify") || Objects.equals(obj, "AppBrandForceKill") || Objects.equals(obj, "AppBrandTestUpdateWxaUsageListNotify");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C29199d3.class.getName();
    }
}
