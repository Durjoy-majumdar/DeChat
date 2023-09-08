package com.tencent.p014mm.plugin.magicbrush;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.magicbrush.y0 */
public enum C30248y0 implements C38174i<C30244x0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81719d;

    public Object get() {
        Object obj = this.f81719d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81719d;
                if (obj == obj2) {
                    obj = new C30244x0();
                    this.f81719d = obj;
                }
            }
        }
        return (C30244x0) obj;
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
        return "provider " + C30244x0.class.getName();
    }
}
