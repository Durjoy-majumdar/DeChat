package p587kn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kn.f */
public enum C33946f implements C38174i<C117408e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91670d;

    public Object get() {
        Object obj = this.f91670d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91670d;
                if (obj == obj2) {
                    obj = new C117408e();
                    this.f91670d = obj;
                }
            }
        }
        return (C117408e) obj;
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
        return "provider " + C117408e.class.getName();
    }
}
