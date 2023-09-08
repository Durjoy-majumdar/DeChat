package p622no;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: no.k */
public enum C34950k implements C38174i<C100141j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93824d;

    public Object get() {
        Object obj = this.f93824d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93824d;
                if (obj == obj2) {
                    obj = new C100141j();
                    this.f93824d = obj;
                }
            }
        }
        return (C100141j) obj;
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
        return "provider " + C100141j.class.getName();
    }
}
