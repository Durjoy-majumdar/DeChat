package com.tencent.p014mm.plugin.biz;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.biz.i */
public enum C29713i implements C38174i<C2077h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80706d;

    /* renamed from: com.tencent.mm.plugin.biz.i$a */
    public static final class C29714a {

        /* renamed from: a */
        public static final List<Object> f80707a = null;

        static {
            f80707a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f80706d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80706d;
                if (obj == obj2) {
                    obj = new C2077h();
                    this.f80706d = obj;
                }
            }
        }
        return (C2077h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29714a.f80707a;
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
        return "provider " + C2077h.class.getName();
    }
}
