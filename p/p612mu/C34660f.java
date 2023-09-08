package p612mu;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: mu.f */
public enum C34660f implements C38174i<C99972e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93198d;

    public Object get() {
        Object obj = this.f93198d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93198d;
                if (obj == obj2) {
                    obj = new C99972e();
                    this.f93198d = obj;
                }
            }
        }
        return (C99972e) obj;
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
        return "provider " + C99972e.class.getName();
    }
}
