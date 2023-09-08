package p510ev;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ev.i */
public enum C31713i implements C38174i<C97751h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84688d;

    public Object get() {
        Object obj = this.f84688d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84688d;
                if (obj == obj2) {
                    obj = new C97751h();
                    this.f84688d = obj;
                }
            }
        }
        return (C97751h) obj;
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
        return "provider " + C97751h.class.getName();
    }
}
