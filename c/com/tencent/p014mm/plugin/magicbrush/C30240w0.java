package com.tencent.p014mm.plugin.magicbrush;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.magicbrush.w0 */
public enum C30240w0 implements C38174i<C30237v0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81702d;

    public Object get() {
        Object obj = this.f81702d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81702d;
                if (obj == obj2) {
                    obj = new C30237v0();
                    this.f81702d = obj;
                }
            }
        }
        return (C30237v0) obj;
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
        return "provider " + C30237v0.class.getName();
    }
}
