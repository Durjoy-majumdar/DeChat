package l02;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: l02.i */
public enum C34151i implements C38174i<C99275h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92125d;

    public Object get() {
        Object obj = this.f92125d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92125d;
                if (obj == obj2) {
                    obj = new C99275h();
                    this.f92125d = obj;
                }
            }
        }
        return (C99275h) obj;
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
        return "provider " + C99275h.class.getName();
    }
}
