package com.tencent.p014mm.plugin.game.model.silent_download;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.model.silent_download.e */
public enum C30103e implements C38174i<C42102d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81408d;

    public Object get() {
        Object obj = this.f81408d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81408d;
                if (obj == obj2) {
                    obj = new C42102d();
                    this.f81408d = obj;
                }
            }
        }
        return (C42102d) obj;
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
        return "provider " + C42102d.class.getName();
    }
}
