package p153fw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fw.l */
public enum C32191l implements C38174i<C8214k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85580d;

    public Object get() {
        Object obj = this.f85580d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85580d;
                if (obj == obj2) {
                    obj = new C8214k();
                    this.f85580d = obj;
                }
            }
        }
        return (C8214k) obj;
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
        return "provider " + C8214k.class.getName();
    }
}
