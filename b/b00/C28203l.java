package b00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: b00.l */
public enum C28203l implements C38174i<C28202k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77721d;

    public Object get() {
        Object obj = this.f77721d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77721d;
                if (obj == obj2) {
                    obj = new C28202k();
                    this.f77721d = obj;
                }
            }
        }
        return (C28202k) obj;
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
        return "provider " + C28202k.class.getName();
    }
}
