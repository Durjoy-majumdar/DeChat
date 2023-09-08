package d33;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d33.f */
public enum C31061f implements C38174i<C7167e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83316d;

    public Object get() {
        Object obj = this.f83316d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83316d;
                if (obj == obj2) {
                    obj = new C7167e();
                    this.f83316d = obj;
                }
            }
        }
        return (C7167e) obj;
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
        return "provider " + C7167e.class.getName();
    }
}
