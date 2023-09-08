package com.tencent.p014mm.pluginsdk.model;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.pluginsdk.model.y */
public enum C30686y implements C38174i<C72713x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82574d;

    public Object get() {
        Object obj = this.f82574d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82574d;
                if (obj == obj2) {
                    obj = new C72713x();
                    this.f82574d = obj;
                }
            }
        }
        return (C72713x) obj;
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
        return Objects.equals(obj, 47);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C72713x.class.getName();
    }
}
