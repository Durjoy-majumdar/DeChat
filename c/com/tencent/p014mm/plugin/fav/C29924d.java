package com.tencent.p014mm.plugin.fav;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.fav.d */
public enum C29924d implements C38174i<C93396c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81052d;

    public Object get() {
        Object obj = this.f81052d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81052d;
                if (obj == obj2) {
                    obj = new C93396c();
                    this.f81052d = obj;
                }
            }
        }
        return (C93396c) obj;
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
        return Objects.equals(obj, "uploadfavitem") || Objects.equals(obj, "resendfavitem");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C93396c.class.getName();
    }
}
