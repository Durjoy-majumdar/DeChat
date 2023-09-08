package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C29261n;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.o */
public enum C29263o implements C38174i<WxaPkgStorageExportServiceIPC> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79948d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.o$a */
    public static final class C29264a {

        /* renamed from: a */
        public static final List<Object> f79949a = null;

        static {
            f79949a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.o$b */
    public static final class C29265b {

        /* renamed from: a */
        public static final List<Object> f79950a = null;

        static {
            f79950a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f79948d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79948d;
                if (obj == obj2) {
                    C29261n.f79945a.getClass();
                    obj = WxaPkgStorageExportServiceIPC.f238767d;
                    this.f79948d = obj;
                }
            }
        }
        return (WxaPkgStorageExportServiceIPC) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C29261n.C29262a.class;
        }
        if ("dependencies".equals(str)) {
            return C29264a.f79949a;
        }
        if ("onProcess".equals(str)) {
            return C29265b.f79950a;
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
        return "provider " + WxaPkgStorageExportServiceIPC.class.getName();
    }
}
