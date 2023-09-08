package p510ev;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ev.o */
public enum C31718o implements C38174i<C58835n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84697d;

    public Object get() {
        Object obj = this.f84697d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84697d;
                if (obj == obj2) {
                    obj = new C58835n();
                    this.f84697d = obj;
                }
            }
        }
        return (C58835n) obj;
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
        return "provider " + C58835n.class.getName();
    }
}
