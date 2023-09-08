package p514ez;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ez.c */
public enum C31740c implements C38174i<C31739b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84748d;

    public Object get() {
        Object obj = this.f84748d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84748d;
                if (obj == obj2) {
                    obj = new C31739b();
                    this.f84748d = obj;
                }
            }
        }
        return (C31739b) obj;
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
        return "provider " + C31739b.class.getName();
    }
}
