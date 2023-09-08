package uc1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: uc1.o */
public enum C37408o implements C38174i<C37407n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98891d;

    public Object get() {
        Object obj = this.f98891d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98891d;
                if (obj == obj2) {
                    obj = new C37407n();
                    this.f98891d = obj;
                }
            }
        }
        return (C37407n) obj;
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
        return "provider " + C37407n.class.getName();
    }
}
