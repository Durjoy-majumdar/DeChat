package p484cx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cx.n */
public enum C30945n implements C38174i<C30944m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83058d;

    public Object get() {
        Object obj = this.f83058d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83058d;
                if (obj == obj2) {
                    obj = new C30944m();
                    this.f83058d = obj;
                }
            }
        }
        return (C30944m) obj;
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
        return "provider " + C30944m.class.getName();
    }
}
