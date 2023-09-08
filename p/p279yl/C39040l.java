package p279yl;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: yl.l */
public enum C39040l implements C38174i<C16036k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105110d;

    public Object get() {
        Object obj = this.f105110d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105110d;
                if (obj == obj2) {
                    obj = new C16036k();
                    this.f105110d = obj;
                }
            }
        }
        return (C16036k) obj;
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
        return "provider " + C16036k.class.getName();
    }
}
