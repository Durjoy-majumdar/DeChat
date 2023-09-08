package com.tencent.p014mm.plugin.appbrand.backgroundfetch;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.i */
public enum C29426i implements C38174i<C29425h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80248d;

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.i$a */
    public static final class C29427a {

        /* renamed from: a */
        public static final List<Object> f80249a = null;

        static {
            f80249a = Arrays.asList(new Object[]{C81161g2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundfetch.i$b */
    public static final class C29428b {

        /* renamed from: a */
        public static final List<Object> f80250a = null;

        static {
            f80250a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80248d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80248d;
                if (obj == obj2) {
                    obj = new C29425h();
                    this.f80248d = obj;
                }
            }
        }
        return (C29425h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29428b.f80250a;
        }
        if ("dependencies".equals(str)) {
            return C29427a.f80249a;
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
        return "provider " + C29425h.class.getName();
    }
}
