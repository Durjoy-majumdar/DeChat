package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.s */
public enum C30269s implements C38174i<C69842r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81762d;

    /* renamed from: com.tencent.mm.plugin.messenger.foundation.s$a */
    public static final class C30270a {

        /* renamed from: a */
        public static final List<Object> f81763a = null;

        static {
            f81763a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81762d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81762d;
                if (obj == obj2) {
                    obj = new C69842r();
                    this.f81762d = obj;
                }
            }
        }
        return (C69842r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30270a.f81763a;
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
        return "provider " + C69842r.class.getName();
    }
}
