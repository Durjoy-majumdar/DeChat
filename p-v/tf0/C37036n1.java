package tf0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: tf0.n1 */
public enum C37036n1 implements C38174i<C37034m1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98187d;

    public Object get() {
        Object obj = this.f98187d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98187d;
                if (obj == obj2) {
                    obj = new C37034m1();
                    this.f98187d = obj;
                }
            }
        }
        return (C37034m1) obj;
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
        return "provider " + C37034m1.class.getName();
    }
}
