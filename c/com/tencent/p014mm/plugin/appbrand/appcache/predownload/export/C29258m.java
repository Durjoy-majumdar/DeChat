package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.export.C81325i;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.m */
public enum C29258m implements C38174i<C81325i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79942d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.m$a */
    public static final class C29259a {

        /* renamed from: a */
        public static final List<Object> f79943a = null;

        static {
            f79943a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.m$b */
    public static final class C29260b {

        /* renamed from: a */
        public static final List<Object> f79944a = null;

        static {
            f79944a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79942d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79942d;
                if (obj == obj2) {
                    obj = C81325i.f238776d.mo56557a();
                    this.f79942d = obj;
                }
            }
        }
        return (C81325i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C81325i.C29255b.class;
        }
        if ("onProcess".equals(str)) {
            return C29260b.f79944a;
        }
        if ("dependencies".equals(str)) {
            return C29259a.f79943a;
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
        return "provider " + C81325i.class.getName();
    }
}
