package p633on;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: on.m */
public enum C35207m implements C38174i<C100368l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94390d;

    public Object get() {
        Object obj = this.f94390d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94390d;
                if (obj == obj2) {
                    obj = new C100368l();
                    this.f94390d = obj;
                }
            }
        }
        return (C100368l) obj;
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
        return "provider " + C100368l.class.getName();
    }
}
