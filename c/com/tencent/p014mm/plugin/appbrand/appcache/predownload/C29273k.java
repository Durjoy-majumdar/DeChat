package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C29271j;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.k */
public enum C29273k implements C38174i<PreDownloadServiceExportAnyProcess> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79965d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.k$a */
    public static final class C29274a {

        /* renamed from: a */
        public static final List<Object> f79966a = null;

        static {
            f79966a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.k$b */
    public static final class C29275b {

        /* renamed from: a */
        public static final List<Object> f79967a = null;

        static {
            f79967a = Arrays.asList(new Object[]{C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f79965d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79965d;
                if (obj == obj2) {
                    C29271j.f79962a.getClass();
                    obj = PreDownloadServiceExportAnyProcess.f238736d;
                    this.f79965d = obj;
                }
            }
        }
        return (PreDownloadServiceExportAnyProcess) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C29271j.C29272a.class;
        }
        if ("dependencies".equals(str)) {
            return C29274a.f79966a;
        }
        if ("onProcess".equals(str)) {
            return C29275b.f79967a;
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
        return "provider " + PreDownloadServiceExportAnyProcess.class.getName();
    }
}
