package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.q */
public enum C30267q implements C38174i<C30266p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81758d;

    /* renamed from: com.tencent.mm.plugin.messenger.foundation.q$a */
    public static final class C30268a {

        /* renamed from: a */
        public static final List<Object> f81759a = null;

        static {
            f81759a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81758d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81758d;
                if (obj == obj2) {
                    obj = new C30266p();
                    this.f81758d = obj;
                }
            }
        }
        return (C30266p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30268a.f81759a;
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
        return "provider " + C30266p.class.getName();
    }
}
