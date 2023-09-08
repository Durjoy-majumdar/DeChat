package p456bp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: bp.b */
public enum C28358b implements C38174i<C39826a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78010d;

    public Object get() {
        Object obj = this.f78010d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78010d;
                if (obj == obj2) {
                    obj = new C39826a();
                    this.f78010d = obj;
                }
            }
        }
        return (C39826a) obj;
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
        return "provider " + C39826a.class.getName();
    }
}
