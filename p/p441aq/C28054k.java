package p441aq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: aq.k */
public enum C28054k implements C38174i<C28052j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77383d;

    public Object get() {
        Object obj = this.f77383d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77383d;
                if (obj == obj2) {
                    obj = new C28052j();
                    this.f77383d = obj;
                }
            }
        }
        return (C28052j) obj;
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
        return "provider " + C28052j.class.getName();
    }
}
