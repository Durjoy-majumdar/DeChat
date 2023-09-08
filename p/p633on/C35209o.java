package p633on;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: on.o */
public enum C35209o implements C38174i<C35208n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94393d;

    public Object get() {
        Object obj = this.f94393d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94393d;
                if (obj == obj2) {
                    obj = new C35208n();
                    this.f94393d = obj;
                }
            }
        }
        return (C35208n) obj;
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
        return "provider " + C35208n.class.getName();
    }
}
