package p367nq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: nq.f */
public enum C35002f implements C38174i<C21690e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93943d;

    public Object get() {
        Object obj = this.f93943d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93943d;
                if (obj == obj2) {
                    obj = new C21690e();
                    this.f93943d = obj;
                }
            }
        }
        return (C21690e) obj;
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
        return "provider " + C21690e.class.getName();
    }
}
