package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.o2 */
public enum C29155o2 implements C38174i<C81179n2> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79768d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.o2$a */
    public static final class C29156a {

        /* renamed from: a */
        public static final List<Object> f79769a = null;

        static {
            f79769a = Arrays.asList(new Object[]{PluginAppBrand.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.o2$b */
    public static final class C29157b {

        /* renamed from: a */
        public static final List<Object> f79770a = null;

        static {
            f79770a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79768d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79768d;
                if (obj == obj2) {
                    obj = new C81179n2();
                    this.f79768d = obj;
                }
            }
        }
        return (C81179n2) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C29156a.f79769a;
        }
        if ("onProcess".equals(str)) {
            return C29157b.f79770a;
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
        return "provider " + C81179n2.class.getName();
    }
}
