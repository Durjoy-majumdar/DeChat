package com.tencent.p014mm.app;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.app.k1 */
public enum C28679k1 implements C38174i<C67650j1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78662d;

    public Object get() {
        Object obj = this.f78662d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78662d;
                if (obj == obj2) {
                    obj = new C67650j1();
                    this.f78662d = obj;
                }
            }
        }
        return (C67650j1) obj;
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
        return "provider " + C67650j1.class.getName();
    }
}
