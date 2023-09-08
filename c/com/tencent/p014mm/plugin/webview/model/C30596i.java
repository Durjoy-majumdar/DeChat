package com.tencent.p014mm.plugin.webview.model;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.webview.model.i */
public enum C30596i implements C38174i<C6034h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82403d;

    public Object get() {
        Object obj = this.f82403d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82403d;
                if (obj == obj2) {
                    obj = new C6034h();
                    this.f82403d = obj;
                }
            }
        }
        return (C6034h) obj;
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
        return Objects.equals(obj, 2);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C6034h.class.getName();
    }
}
