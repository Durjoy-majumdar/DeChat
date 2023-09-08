package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.g */
public enum C29422g implements C38174i<AppBrandBackgroundFetchDataStorageIPC> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80242d;

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.g$a */
    public static final class C29423a {

        /* renamed from: a */
        public static final List<Object> f80243a = null;

        static {
            f80243a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.g$b */
    public static final class C29424b {

        /* renamed from: a */
        public static final List<Object> f80244a = null;

        static {
            f80244a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f80242d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80242d;
                if (obj == obj2) {
                    obj = new AppBrandBackgroundFetchDataStorageIPC();
                    this.f80242d = obj;
                }
            }
        }
        return (AppBrandBackgroundFetchDataStorageIPC) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29423a.f80243a;
        }
        if ("onProcess".equals(str)) {
            return C29424b.f80244a;
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
        return "provider " + AppBrandBackgroundFetchDataStorageIPC.class.getName();
    }
}
