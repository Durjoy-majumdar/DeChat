package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C29250g;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.h */
public enum C29252h implements C38174i<WxaPkgDownloaderExportServiceIPC> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79934d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.h$a */
    public static final class C29253a {

        /* renamed from: a */
        public static final List<Object> f79935a = null;

        static {
            f79935a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.h$b */
    public static final class C29254b {

        /* renamed from: a */
        public static final List<Object> f79936a = null;

        static {
            f79936a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f79934d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79934d;
                if (obj == obj2) {
                    C29250g.f79931a.getClass();
                    obj = WxaPkgDownloaderExportServiceIPC.f79901d;
                    this.f79934d = obj;
                }
            }
        }
        return (WxaPkgDownloaderExportServiceIPC) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C29250g.C29251a.class;
        }
        if ("dependencies".equals(str)) {
            return C29253a.f79935a;
        }
        if ("onProcess".equals(str)) {
            return C29254b.f79936a;
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
        return "provider " + WxaPkgDownloaderExportServiceIPC.class.getName();
    }
}
