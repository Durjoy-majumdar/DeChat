package p437am;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: am.c */
public enum C27920c implements C38174i<C27919b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77118d;

    public Object get() {
        Object obj = this.f77118d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77118d;
                if (obj == obj2) {
                    obj = new C27919b();
                    this.f77118d = obj;
                }
            }
        }
        return (C27919b) obj;
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
        return "provider " + C27919b.class.getName();
    }
}
