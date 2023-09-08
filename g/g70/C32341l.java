package g70;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: g70.l */
public enum C32341l implements C38174i<C32339j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85836d;

    public Object get() {
        Object obj = this.f85836d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85836d;
                if (obj == obj2) {
                    obj = new C32339j();
                    this.f85836d = obj;
                }
            }
        }
        return (C32339j) obj;
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
        return "provider " + C32339j.class.getName();
    }
}
