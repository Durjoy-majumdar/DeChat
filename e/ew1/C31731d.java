package ew1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ew1.d */
public enum C31731d implements C38174i<C58850c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84724d;

    public Object get() {
        Object obj = this.f84724d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84724d;
                if (obj == obj2) {
                    obj = new C58850c();
                    this.f84724d = obj;
                }
            }
        }
        return (C58850c) obj;
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
        return "provider " + C58850c.class.getName();
    }
}
