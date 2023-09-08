package uc1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: uc1.q */
public enum C37409q implements C38174i<C65323p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98894d;

    public Object get() {
        Object obj = this.f98894d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98894d;
                if (obj == obj2) {
                    obj = new C65323p();
                    this.f98894d = obj;
                }
            }
        }
        return (C65323p) obj;
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
        return "provider " + C65323p.class.getName();
    }
}
