package p634or;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: or.b */
public enum C35260b implements C38174i<C110060a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94491d;

    public Object get() {
        Object obj = this.f94491d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94491d;
                if (obj == obj2) {
                    obj = new C110060a();
                    this.f94491d = obj;
                }
            }
        }
        return (C110060a) obj;
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
        return "provider " + C110060a.class.getName();
    }
}
