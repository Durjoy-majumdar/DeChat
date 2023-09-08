package p153fw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fw.f */
public enum C32186f implements C38174i<C98049e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85565d;

    public Object get() {
        Object obj = this.f85565d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85565d;
                if (obj == obj2) {
                    obj = new C98049e();
                    this.f85565d = obj;
                }
            }
        }
        return (C98049e) obj;
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
        return "provider " + C98049e.class.getName();
    }
}
