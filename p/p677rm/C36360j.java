package p677rm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rm.j */
public enum C36360j implements C38174i<C90007i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96766d;

    public Object get() {
        Object obj = this.f96766d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96766d;
                if (obj == obj2) {
                    obj = new C90007i();
                    this.f96766d = obj;
                }
            }
        }
        return (C90007i) obj;
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
        return "provider " + C90007i.class.getName();
    }
}
