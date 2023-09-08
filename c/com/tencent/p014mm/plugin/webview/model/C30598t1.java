package com.tencent.p014mm.plugin.webview.model;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.webview.model.t1 */
public enum C30598t1 implements C38174i<C6058s1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82410d;

    public Object get() {
        Object obj = this.f82410d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82410d;
                if (obj == obj2) {
                    obj = new C6058s1();
                    this.f82410d = obj;
                }
            }
        }
        return (C6058s1) obj;
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
        return Objects.equals(obj, 4);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C6058s1.class.getName();
    }
}
