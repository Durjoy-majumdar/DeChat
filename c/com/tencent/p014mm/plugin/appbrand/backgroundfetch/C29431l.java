package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.l */
public enum C29431l implements C38174i<AppBrandBackgroundFetchDataTokenStorageIPC> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80255d;

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.l$a */
    public static final class C29432a {

        /* renamed from: a */
        public static final List<Object> f80256a = null;

        static {
            f80256a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.l$b */
    public static final class C29433b {

        /* renamed from: a */
        public static final List<Object> f80257a = null;

        static {
            f80257a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f80255d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80255d;
                if (obj == obj2) {
                    obj = new AppBrandBackgroundFetchDataTokenStorageIPC();
                    this.f80255d = obj;
                }
            }
        }
        return (AppBrandBackgroundFetchDataTokenStorageIPC) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29432a.f80256a;
        }
        if ("onProcess".equals(str)) {
            return C29433b.f80257a;
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
        return "provider " + AppBrandBackgroundFetchDataTokenStorageIPC.class.getName();
    }
}
