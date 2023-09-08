package com.tencent.p014mm.plugin.magicbrush;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.magicbrush.m1 */
public enum C30209m1 implements C38174i<C4872l1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81644d;

    public Object get() {
        Object obj = this.f81644d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81644d;
                if (obj == obj2) {
                    obj = new C4872l1();
                    this.f81644d = obj;
                }
            }
        }
        return (C4872l1) obj;
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
        return "provider " + C4872l1.class.getName();
    }
}
