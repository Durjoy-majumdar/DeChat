package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.h */
public enum C29689h implements C38174i<C29688g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80651d;

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.h$a */
    public static final class C29690a {

        /* renamed from: a */
        public static final List<Object> f80652a = null;

        static {
            f80652a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f80651d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80651d;
                if (obj == obj2) {
                    obj = new C29688g();
                    this.f80651d = obj;
                }
            }
        }
        return (C29688g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29690a.f80652a;
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
        return "provider " + C29688g.class.getName();
    }
}
