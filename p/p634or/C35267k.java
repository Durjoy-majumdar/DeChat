package p634or;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: or.k */
public enum C35267k implements C38174i<C117883g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94508d;

    public Object get() {
        Object obj = this.f94508d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94508d;
                if (obj == obj2) {
                    obj = new C117883g();
                    this.f94508d = obj;
                }
            }
        }
        return (C117883g) obj;
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
        return "provider " + C117883g.class.getName();
    }
}
