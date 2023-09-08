package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.m2 */
public enum C28065m2 implements C38174i<C67098l2> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77408d;

    public Object get() {
        Object obj = this.f77408d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77408d;
                if (obj == obj2) {
                    obj = new C67098l2();
                    this.f77408d = obj;
                }
            }
        }
        return (C67098l2) obj;
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
        return "provider " + C67098l2.class.getName();
    }
}
