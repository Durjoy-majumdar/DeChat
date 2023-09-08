package p633on;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: on.i */
public enum C35203i implements C38174i<C110055h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94383d;

    public Object get() {
        Object obj = this.f94383d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94383d;
                if (obj == obj2) {
                    obj = new C110055h();
                    this.f94383d = obj;
                }
            }
        }
        return (C110055h) obj;
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
        return "provider " + C110055h.class.getName();
    }
}
