package com.tencent.p014mm.plugin.magicbrush;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.magicbrush.k1 */
public enum C30205k1 implements C38174i<C85273j1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81635d;

    public Object get() {
        Object obj = this.f81635d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81635d;
                if (obj == obj2) {
                    obj = new C85273j1();
                    this.f81635d = obj;
                }
            }
        }
        return (C85273j1) obj;
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
        return "provider " + C85273j1.class.getName();
    }
}
