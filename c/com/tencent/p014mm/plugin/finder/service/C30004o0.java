package com.tencent.p014mm.plugin.finder.service;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.finder.service.o0 */
public enum C30004o0 implements C38174i<C30000n0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81217d;

    /* renamed from: com.tencent.mm.plugin.finder.service.o0$a */
    public static final class C30005a {

        /* renamed from: a */
        public static final List<Object> f81218a = null;

        static {
            f81218a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81217d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81217d;
                if (obj == obj2) {
                    obj = new C30000n0();
                    this.f81217d = obj;
                }
            }
        }
        return (C30000n0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30005a.f81218a;
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
        return "provider " + C30000n0.class.getName();
    }
}
