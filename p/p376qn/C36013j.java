package p376qn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qn.j */
public enum C36013j implements C38174i<C36012i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96018d;

    public Object get() {
        Object obj = this.f96018d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96018d;
                if (obj == obj2) {
                    obj = new C36012i();
                    this.f96018d = obj;
                }
            }
        }
        return (C36012i) obj;
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
        return "provider " + C36012i.class.getName();
    }
}
