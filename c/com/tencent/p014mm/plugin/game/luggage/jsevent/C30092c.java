package com.tencent.p014mm.plugin.game.luggage.jsevent;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsevent.c */
public enum C30092c implements C38174i<C4561b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81390d;

    public Object get() {
        Object obj = this.f81390d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81390d;
                if (obj == obj2) {
                    obj = new C4561b();
                    this.f81390d = obj;
                }
            }
        }
        return (C4561b) obj;
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
        return "provider " + C4561b.class.getName();
    }
}
