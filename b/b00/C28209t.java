package b00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: b00.t */
public enum C28209t implements C38174i<C39687s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77733d;

    public Object get() {
        Object obj = this.f77733d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77733d;
                if (obj == obj2) {
                    obj = new C39687s();
                    this.f77733d = obj;
                }
            }
        }
        return (C39687s) obj;
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
        return "provider " + C39687s.class.getName();
    }
}
