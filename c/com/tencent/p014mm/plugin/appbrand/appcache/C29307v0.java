package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.appcache.C29303u0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.v0 */
public enum C29307v0 implements C38174i<C81354t0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80026d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.v0$a */
    public static final class C29308a {

        /* renamed from: a */
        public static final List<Object> f80027a = null;

        static {
            f80027a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80026d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80026d;
                if (obj == obj2) {
                    C29303u0.f80018a.getClass();
                    obj = C81354t0.f238835d;
                    this.f80026d = obj;
                }
            }
        }
        return (C81354t0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C29303u0.C29304a.class;
        }
        if ("onProcess".equals(str)) {
            return C29308a.f80027a;
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
        return "provider " + C81354t0.class.getName();
    }
}
