package p569ix;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ix.c */
public enum C33424c implements C38174i<C33423b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90561d;

    public Object get() {
        Object obj = this.f90561d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90561d;
                if (obj == obj2) {
                    obj = new C33423b();
                    this.f90561d = obj;
                }
            }
        }
        return (C33423b) obj;
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
        return "provider " + C33423b.class.getName();
    }
}
