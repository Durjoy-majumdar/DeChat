package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.o */
public enum C29277o implements C38174i<C81337l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79972d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.o$a */
    public static final class C29278a {

        /* renamed from: a */
        public static final List<Object> f79973a = null;

        static {
            f79973a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.o$b */
    public static final class C29279b {

        /* renamed from: a */
        public static final List<Object> f79974a = null;

        static {
            f79974a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79972d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79972d;
                if (obj == obj2) {
                    obj = new C81337l();
                    this.f79972d = obj;
                }
            }
        }
        return (C81337l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29279b.f79974a;
        }
        if ("dependencies".equals(str)) {
            return C29278a.f79973a;
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
        return "provider " + C81337l.class.getName();
    }
}
