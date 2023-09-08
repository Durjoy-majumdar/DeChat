package d33;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d33.d */
public enum C31060d implements C38174i<C97407c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83313d;

    public Object get() {
        Object obj = this.f83313d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83313d;
                if (obj == obj2) {
                    obj = new C97407c();
                    this.f83313d = obj;
                }
            }
        }
        return (C97407c) obj;
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
        return "provider " + C97407c.class.getName();
    }
}
