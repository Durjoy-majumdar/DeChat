package p351jq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: jq.g */
public enum C33627g implements C38174i<C117363f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91014d;

    public Object get() {
        Object obj = this.f91014d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91014d;
                if (obj == obj2) {
                    obj = new C117363f();
                    this.f91014d = obj;
                }
            }
        }
        return (C117363f) obj;
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
        return "provider " + C117363f.class.getName();
    }
}
