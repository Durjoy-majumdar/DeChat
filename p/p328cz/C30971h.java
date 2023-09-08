package p328cz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cz.h */
public enum C30971h implements C38174i<C58005g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83115d;

    public Object get() {
        Object obj = this.f83115d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83115d;
                if (obj == obj2) {
                    obj = new C58005g();
                    this.f83115d = obj;
                }
            }
        }
        return (C58005g) obj;
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
        return "provider " + C58005g.class.getName();
    }
}
