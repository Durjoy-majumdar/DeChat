package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.q */
public enum C29267q implements C38174i<C81331p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79956d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.q$a */
    public static final class C29268a {

        /* renamed from: a */
        public static final List<Object> f79957a = null;

        static {
            f79957a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.q$b */
    public static final class C29269b {

        /* renamed from: a */
        public static final List<Object> f79958a = null;

        static {
            f79958a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79956d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79956d;
                if (obj == obj2) {
                    obj = new C81331p();
                    this.f79956d = obj;
                }
            }
        }
        return (C81331p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29269b.f79958a;
        }
        if ("dependencies".equals(str)) {
            return C29268a.f79957a;
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
        return "provider " + C81331p.class.getName();
    }
}
