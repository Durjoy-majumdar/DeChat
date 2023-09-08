package ne1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ne1.a0 */
public enum C34788a0 implements C38174i<C47238z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93477d;

    public Object get() {
        Object obj = this.f93477d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93477d;
                if (obj == obj2) {
                    obj = new C47238z();
                    this.f93477d = obj;
                }
            }
        }
        return (C47238z) obj;
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
        return "provider " + C47238z.class.getName();
    }
}
