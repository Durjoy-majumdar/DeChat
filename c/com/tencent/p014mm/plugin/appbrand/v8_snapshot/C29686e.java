package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.e */
public enum C29686e implements C38174i<C84836d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80647d;

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.e$a */
    public static final class C29687a {

        /* renamed from: a */
        public static final List<Object> f80648a = null;

        static {
            f80648a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f80647d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80647d;
                if (obj == obj2) {
                    obj = new C84836d();
                    this.f80647d = obj;
                }
            }
        }
        return (C84836d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29687a.f80648a;
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
        return "provider " + C84836d.class.getName();
    }
}
