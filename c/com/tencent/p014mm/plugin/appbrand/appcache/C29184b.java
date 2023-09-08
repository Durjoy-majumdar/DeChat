package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.b */
public enum C29184b implements C38174i<C29177a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79819d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.b$a */
    public static final class C29185a {

        /* renamed from: a */
        public static final List<Object> f79820a = null;

        static {
            f79820a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.b$b */
    public static final class C29186b {

        /* renamed from: a */
        public static final List<Object> f79821a = null;

        static {
            f79821a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79819d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79819d;
                if (obj == obj2) {
                    obj = new C29177a();
                    this.f79819d = obj;
                }
            }
        }
        return (C29177a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29186b.f79821a;
        }
        if ("dependencies".equals(str)) {
            return C29185a.f79820a;
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
        return "provider " + C29177a.class.getName();
    }
}
