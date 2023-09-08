package p197ls;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ls.f */
public enum C34351f implements C38174i<C10645e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92538d;

    public Object get() {
        Object obj = this.f92538d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92538d;
                if (obj == obj2) {
                    obj = new C10645e();
                    this.f92538d = obj;
                }
            }
        }
        return (C10645e) obj;
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
        return "provider " + C10645e.class.getName();
    }
}
