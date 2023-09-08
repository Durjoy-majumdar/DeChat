package bc1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: bc1.f */
public enum C28297f implements C38174i<C28296e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77891d;

    public Object get() {
        Object obj = this.f77891d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77891d;
                if (obj == obj2) {
                    obj = new C28296e();
                    this.f77891d = obj;
                }
            }
        }
        return (C28296e) obj;
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
        return "provider " + C28296e.class.getName();
    }
}
