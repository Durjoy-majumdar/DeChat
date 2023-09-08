package com.tencent.p014mm.plugin.game;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.j */
public enum C30086j implements C38174i<C41875i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81374d;

    public Object get() {
        Object obj = this.f81374d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81374d;
                if (obj == obj2) {
                    obj = new C41875i();
                    this.f81374d = obj;
                }
            }
        }
        return (C41875i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C41875i.class.getName();
    }
}
