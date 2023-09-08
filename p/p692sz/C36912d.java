package p692sz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: sz.d */
public enum C36912d implements C38174i<C101711c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97946d;

    public Object get() {
        Object obj = this.f97946d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97946d;
                if (obj == obj2) {
                    obj = new C101711c();
                    this.f97946d = obj;
                }
            }
        }
        return (C101711c) obj;
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
        return "provider " + C101711c.class.getName();
    }
}
