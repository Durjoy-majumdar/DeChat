package p150eo;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: eo.t */
public enum C31642t implements C38174i<C31640s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84532d;

    public Object get() {
        Object obj = this.f84532d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84532d;
                if (obj == obj2) {
                    obj = new C31640s();
                    this.f84532d = obj;
                }
            }
        }
        return (C31640s) obj;
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
        return "provider " + C31640s.class.getName();
    }
}
