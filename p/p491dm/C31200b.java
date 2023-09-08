package p491dm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: dm.b */
public enum C31200b implements C38174i<C31199a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83608d;

    public Object get() {
        Object obj = this.f83608d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83608d;
                if (obj == obj2) {
                    obj = new C31199a();
                    this.f83608d = obj;
                }
            }
        }
        return (C31199a) obj;
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
        return "provider " + C31199a.class.getName();
    }
}
