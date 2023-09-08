package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.c0 */
public enum C29101c0 implements C38174i<C81194z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79677d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.c0$a */
    public static final class C29102a {

        /* renamed from: a */
        public static final List<Object> f79678a = null;

        static {
            f79678a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79677d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79677d;
                if (obj == obj2) {
                    obj = C81194z.f238510d;
                    this.f79677d = obj;
                }
            }
        }
        return (C81194z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C29099b0.class;
        }
        if ("onProcess".equals(str)) {
            return C29102a.f79678a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C81194z.class.getName();
    }
}
