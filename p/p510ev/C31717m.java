package p510ev;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ev.m */
public enum C31717m implements C38174i<C31716l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84694d;

    public Object get() {
        Object obj = this.f84694d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84694d;
                if (obj == obj2) {
                    obj = new C31716l();
                    this.f84694d = obj;
                }
            }
        }
        return (C31716l) obj;
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
        return "provider " + C31716l.class.getName();
    }
}
