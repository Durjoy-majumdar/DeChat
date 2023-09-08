package p208np;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: np.d */
public enum C34955d implements C38174i<C47292c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93836d;

    public Object get() {
        Object obj = this.f93836d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93836d;
                if (obj == obj2) {
                    obj = new C47292c();
                    this.f93836d = obj;
                }
            }
        }
        return (C47292c) obj;
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
        return "provider " + C47292c.class.getName();
    }
}
