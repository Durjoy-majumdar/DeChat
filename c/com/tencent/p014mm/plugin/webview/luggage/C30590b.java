package com.tencent.p014mm.plugin.webview.luggage;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.webview.luggage.b */
public enum C30590b implements C38174i<C5870a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82388d;

    public Object get() {
        Object obj = this.f82388d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82388d;
                if (obj == obj2) {
                    obj = new C5870a();
                    this.f82388d = obj;
                }
            }
        }
        return (C5870a) obj;
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
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C5870a.class.getName();
    }
}
