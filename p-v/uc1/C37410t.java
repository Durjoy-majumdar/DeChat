package uc1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: uc1.t */
public enum C37410t implements C38174i<C65324s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98897d;

    public Object get() {
        Object obj = this.f98897d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98897d;
                if (obj == obj2) {
                    obj = new C65324s();
                    this.f98897d = obj;
                }
            }
        }
        return (C65324s) obj;
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
        return "provider " + C65324s.class.getName();
    }
}
