package cb2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cb2.f */
public enum C28528f implements C38174i<C28527e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78371d;

    public Object get() {
        Object obj = this.f78371d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78371d;
                if (obj == obj2) {
                    obj = new C28527e();
                    this.f78371d = obj;
                }
            }
        }
        return (C28527e) obj;
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
        return "provider " + C28527e.class.getName();
    }
}
