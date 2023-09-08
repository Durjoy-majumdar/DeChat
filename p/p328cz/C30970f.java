package p328cz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cz.f */
public enum C30970f implements C38174i<C58004e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83112d;

    public Object get() {
        Object obj = this.f83112d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83112d;
                if (obj == obj2) {
                    obj = new C58004e();
                    this.f83112d = obj;
                }
            }
        }
        return (C58004e) obj;
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
        return "provider " + C58004e.class.getName();
    }
}
