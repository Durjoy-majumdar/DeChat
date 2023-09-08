package com.tencent.p014mm.plugin.magicbrush;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.magicbrush.i1 */
public enum C30201i1 implements C38174i<C30197h1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81626d;

    public Object get() {
        Object obj = this.f81626d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81626d;
                if (obj == obj2) {
                    obj = new C30197h1();
                    this.f81626d = obj;
                }
            }
        }
        return (C30197h1) obj;
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
        return "provider " + C30197h1.class.getName();
    }
}
