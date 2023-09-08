package com.tencent.p014mm.modelimage;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.modelimage.s */
public enum C29024s implements C38174i<C68127r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79547d;

    public Object get() {
        Object obj = this.f79547d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79547d;
                if (obj == obj2) {
                    obj = new C68127r();
                    this.f79547d = obj;
                }
            }
        }
        return (C68127r) obj;
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
        return Objects.equals(obj, 3) || Objects.equals(obj, 23);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C68127r.class.getName();
    }
}
