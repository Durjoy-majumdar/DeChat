package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.e */
public enum C29365e implements C38174i<C81470c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80146d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.e$a */
    public static final class C29366a {

        /* renamed from: a */
        public static final List<Object> f80147a = null;

        static {
            f80147a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.e$b */
    public static final class C29367b {

        /* renamed from: a */
        public static final List<Object> f80148a = null;

        static {
            f80148a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80146d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80146d;
                if (obj == obj2) {
                    obj = new C81470c();
                    this.f80146d = obj;
                }
            }
        }
        return (C81470c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29367b.f80148a;
        }
        if ("dependencies".equals(str)) {
            return C29366a.f80147a;
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
        return "provider " + C81470c.class.getName();
    }
}
