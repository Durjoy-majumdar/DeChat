package p647po;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: po.f */
public enum C35589f implements C38174i<C62410e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95150d;

    public Object get() {
        Object obj = this.f95150d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95150d;
                if (obj == obj2) {
                    obj = new C62410e();
                    this.f95150d = obj;
                }
            }
        }
        return (C62410e) obj;
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
        return "provider " + C62410e.class.getName();
    }
}
