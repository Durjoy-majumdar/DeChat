package p622no;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: no.b */
public enum C34943b implements C38174i<C34942a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93803d;

    public Object get() {
        Object obj = this.f93803d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93803d;
                if (obj == obj2) {
                    obj = new C34942a();
                    this.f93803d = obj;
                }
            }
        }
        return (C34942a) obj;
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
        return "provider " + C34942a.class.getName();
    }
}
