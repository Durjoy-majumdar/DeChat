package p510ev;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ev.k */
public enum C31715k implements C38174i<C31714j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84691d;

    public Object get() {
        Object obj = this.f84691d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84691d;
                if (obj == obj2) {
                    obj = new C31714j();
                    this.f84691d = obj;
                }
            }
        }
        return (C31714j) obj;
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
        return "provider " + C31714j.class.getName();
    }
}
