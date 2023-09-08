package p208np;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: np.b */
public enum C34954b implements C38174i<C11244a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93833d;

    public Object get() {
        Object obj = this.f93833d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93833d;
                if (obj == obj2) {
                    obj = new C11244a();
                    this.f93833d = obj;
                }
            }
        }
        return (C11244a) obj;
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
        return "provider " + C11244a.class.getName();
    }
}
