package com.tencent.p014mm.plugin.zero;

import ei3.C31607a;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.zero.x */
public enum C30649x implements C38174i<C85597u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82493d;

    public Object get() {
        Object obj = this.f82493d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82493d;
                if (obj == obj2) {
                    obj = new C85597u();
                    this.f82493d = obj;
                }
            }
        }
        return (C85597u) obj;
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
        return "provider " + C85597u.class.getName();
    }
}
