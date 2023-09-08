package p692sz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: sz.f */
public enum C36914f implements C38174i<C36913e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97949d;

    public Object get() {
        Object obj = this.f97949d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97949d;
                if (obj == obj2) {
                    obj = new C36913e();
                    this.f97949d = obj;
                }
            }
        }
        return (C36913e) obj;
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
        return "provider " + C36913e.class.getName();
    }
}
