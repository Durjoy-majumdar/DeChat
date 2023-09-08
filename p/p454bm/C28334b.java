package p454bm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: bm.b */
public enum C28334b implements C38174i<C39823a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77960d;

    public Object get() {
        Object obj = this.f77960d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77960d;
                if (obj == obj2) {
                    obj = new C39823a();
                    this.f77960d = obj;
                }
            }
        }
        return (C39823a) obj;
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
        return "provider " + C39823a.class.getName();
    }
}
