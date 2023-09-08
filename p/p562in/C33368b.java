package p562in;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: in.b */
public enum C33368b implements C38174i<C33367a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90431d;

    public Object get() {
        Object obj = this.f90431d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90431d;
                if (obj == obj2) {
                    obj = new C33367a();
                    this.f90431d = obj;
                }
            }
        }
        return (C33367a) obj;
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
        return "provider " + C33367a.class.getName();
    }
}
