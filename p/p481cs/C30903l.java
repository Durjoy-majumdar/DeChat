package p481cs;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cs.l */
public enum C30903l implements C38174i<C57986k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82964d;

    public Object get() {
        Object obj = this.f82964d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82964d;
                if (obj == obj2) {
                    obj = new C57986k();
                    this.f82964d = obj;
                }
            }
        }
        return (C57986k) obj;
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
        return "provider " + C57986k.class.getName();
    }
}
