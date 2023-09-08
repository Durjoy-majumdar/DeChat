package p568iv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: iv.d */
public enum C33416d implements C38174i<C60632c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90544d;

    public Object get() {
        Object obj = this.f90544d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90544d;
                if (obj == obj2) {
                    obj = new C60632c();
                    this.f90544d = obj;
                }
            }
        }
        return (C60632c) obj;
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
        return "provider " + C60632c.class.getName();
    }
}
