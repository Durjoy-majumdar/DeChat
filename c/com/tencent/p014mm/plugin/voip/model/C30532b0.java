package com.tencent.p014mm.plugin.voip.model;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.voip.model.b0 */
public enum C30532b0 implements C38174i<C106331a0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82255d;

    public Object get() {
        Object obj = this.f82255d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82255d;
                if (obj == obj2) {
                    obj = new C106331a0();
                    this.f82255d = obj;
                }
            }
        }
        return (C106331a0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 50);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C106331a0.class.getName();
    }
}
