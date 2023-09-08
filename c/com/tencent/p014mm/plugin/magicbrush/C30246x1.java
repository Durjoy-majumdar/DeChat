package com.tencent.p014mm.plugin.magicbrush;

import ei3.C31607a;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.magicbrush.x1 */
public enum C30246x1 implements C38174i<C30241w1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81713d;

    public Object get() {
        Object obj = this.f81713d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81713d;
                if (obj == obj2) {
                    obj = new C30241w1();
                    this.f81713d = obj;
                }
            }
        }
        return (C30241w1) obj;
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
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C30241w1.class.getName();
    }
}
