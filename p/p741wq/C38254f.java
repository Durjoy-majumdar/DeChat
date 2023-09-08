package p741wq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wq.f */
public enum C38254f implements C38174i<C102482e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101014d;

    public Object get() {
        Object obj = this.f101014d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101014d;
                if (obj == obj2) {
                    obj = new C102482e();
                    this.f101014d = obj;
                }
            }
        }
        return (C102482e) obj;
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
        return "provider " + C102482e.class.getName();
    }
}
