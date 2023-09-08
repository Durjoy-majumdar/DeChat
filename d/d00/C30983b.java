package d00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d00.b */
public enum C30983b implements C38174i<C45245a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83140d;

    public Object get() {
        Object obj = this.f83140d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83140d;
                if (obj == obj2) {
                    obj = new C45245a();
                    this.f83140d = obj;
                }
            }
        }
        return (C45245a) obj;
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
        return "provider " + C45245a.class.getName();
    }
}
