package p517fa;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fa.f */
public enum C31972f implements C38174i<C31971e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85148d;

    public Object get() {
        Object obj = this.f85148d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85148d;
                if (obj == obj2) {
                    obj = new C31971e();
                    this.f85148d = obj;
                }
            }
        }
        return (C31971e) obj;
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
        return "provider " + C31971e.class.getName();
    }
}
