package d00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d00.h1 */
public enum C31003h1 implements C38174i<C30999g1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83185d;

    public Object get() {
        Object obj = this.f83185d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83185d;
                if (obj == obj2) {
                    obj = new C30999g1();
                    this.f83185d = obj;
                }
            }
        }
        return (C30999g1) obj;
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
        return "provider " + C30999g1.class.getName();
    }
}
