package p510ev;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ev.q */
public enum C31719q implements C38174i<C58836p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84700d;

    public Object get() {
        Object obj = this.f84700d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84700d;
                if (obj == obj2) {
                    obj = new C58836p();
                    this.f84700d = obj;
                }
            }
        }
        return (C58836p) obj;
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
        return "provider " + C58836p.class.getName();
    }
}
