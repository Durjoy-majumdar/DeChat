package p528fu;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fu.b */
public enum C32169b implements C38174i<C97986a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85525d;

    public Object get() {
        Object obj = this.f85525d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85525d;
                if (obj == obj2) {
                    obj = new C97986a();
                    this.f85525d = obj;
                }
            }
        }
        return (C97986a) obj;
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
        return "provider " + C97986a.class.getName();
    }
}
