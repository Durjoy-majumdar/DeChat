package com.tencent.p014mm.pluginsdk.model.app;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.pluginsdk.model.app.r */
public enum C30666r implements C38174i<C72689q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82530d;

    public Object get() {
        Object obj = this.f82530d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82530d;
                if (obj == obj2) {
                    obj = new C72689q();
                    this.f82530d = obj;
                }
            }
        }
        return (C72689q) obj;
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
        return Objects.equals(obj, 49);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C72689q.class.getName();
    }
}
