package b00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: b00.j */
public enum C28201j implements C38174i<C23640i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77718d;

    public Object get() {
        Object obj = this.f77718d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77718d;
                if (obj == obj2) {
                    obj = new C23640i();
                    this.f77718d = obj;
                }
            }
        }
        return (C23640i) obj;
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
        return "provider " + C23640i.class.getName();
    }
}
