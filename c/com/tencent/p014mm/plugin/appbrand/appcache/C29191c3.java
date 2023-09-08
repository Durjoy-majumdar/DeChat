package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.c3 */
public enum C29191c3 implements C38174i<C29187b3> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79831d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.c3$a */
    public static final class C29192a {

        /* renamed from: a */
        public static final List<Object> f79832a = null;

        static {
            f79832a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.c3$b */
    public static final class C29193b {

        /* renamed from: a */
        public static final List<Object> f79833a = null;

        static {
            f79833a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79831d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79831d;
                if (obj == obj2) {
                    obj = new C29187b3();
                    this.f79831d = obj;
                }
            }
        }
        return (C29187b3) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29193b.f79833a;
        }
        if ("dependencies".equals(str)) {
            return C29192a.f79832a;
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
        return "provider " + C29187b3.class.getName();
    }
}
