package com.tencent.p014mm.plugin.magicbrush;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.magicbrush.c1 */
public enum C30181c1 implements C38174i<C30176b1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81588d;

    public Object get() {
        Object obj = this.f81588d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81588d;
                if (obj == obj2) {
                    obj = new C30176b1();
                    this.f81588d = obj;
                }
            }
        }
        return (C30176b1) obj;
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
        return "provider " + C30176b1.class.getName();
    }
}
