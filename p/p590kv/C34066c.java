package p590kv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kv.c */
public enum C34066c implements C38174i<C76635b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91934d;

    public Object get() {
        Object obj = this.f91934d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91934d;
                if (obj == obj2) {
                    obj = new C76635b();
                    this.f91934d = obj;
                }
            }
        }
        return (C76635b) obj;
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
        return "provider " + C76635b.class.getName();
    }
}
