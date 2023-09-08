package com.tencent.p014mm.plugin.fav.p047ui;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.fav.ui.j0 */
public enum C29937j0 implements C38174i<C93661i0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81085d;

    public Object get() {
        Object obj = this.f81085d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81085d;
                if (obj == obj2) {
                    obj = new C93661i0();
                    this.f81085d = obj;
                }
            }
        }
        return (C93661i0) obj;
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
        return "provider " + C93661i0.class.getName();
    }
}
