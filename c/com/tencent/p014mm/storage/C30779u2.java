package com.tencent.p014mm.storage;

import com.tencent.p014mm.storage.C30781v2;
import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.storage.u2 */
public enum C30779u2 implements C38174i<C30777t2> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82761d;

    public Object get() {
        Object obj = this.f82761d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82761d;
                if (obj == obj2) {
                    C30781v2.f82765a.getClass();
                    obj = C30777t2.f82756d;
                    this.f82761d = obj;
                }
            }
        }
        return (C30777t2) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C30781v2.C30782a.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
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
        return "provider " + C30777t2.class.getName();
    }
}
