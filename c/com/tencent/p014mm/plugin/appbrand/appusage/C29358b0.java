package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.b0 */
public enum C29358b0 implements C38174i<C81545z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80131d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.b0$a */
    public static final class C29359a {

        /* renamed from: a */
        public static final List<Object> f80132a = null;

        static {
            f80132a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.b0$b */
    public static final class C29360b {

        /* renamed from: a */
        public static final List<Object> f80133a = null;

        static {
            f80133a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80131d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80131d;
                if (obj == obj2) {
                    obj = new C81545z();
                    this.f80131d = obj;
                }
            }
        }
        return (C81545z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29360b.f80133a;
        }
        if ("dependencies".equals(str)) {
            return C29359a.f80132a;
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
        return "provider " + C81545z.class.getName();
    }
}
