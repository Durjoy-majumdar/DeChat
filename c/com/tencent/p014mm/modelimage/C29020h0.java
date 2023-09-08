package com.tencent.p014mm.modelimage;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.modelimage.h0 */
public enum C29020h0 implements C38174i<C92826f0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79537d;

    public Object get() {
        Object obj = this.f79537d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79537d;
                if (obj == obj2) {
                    obj = new C92826f0();
                    this.f79537d = obj;
                }
            }
        }
        return (C92826f0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
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
        return "provider " + C92826f0.class.getName();
    }
}
