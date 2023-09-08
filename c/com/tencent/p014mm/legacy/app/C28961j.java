package com.tencent.p014mm.legacy.app;

import ei3.C31607a;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.legacy.app.j */
public enum C28961j implements C38174i<C80964i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79433d;

    public Object get() {
        Object obj = this.f79433d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79433d;
                if (obj == obj2) {
                    obj = new C80964i();
                    this.f79433d = obj;
                }
            }
        }
        return (C80964i) obj;
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
        return "provider " + C80964i.class.getName();
    }
}
