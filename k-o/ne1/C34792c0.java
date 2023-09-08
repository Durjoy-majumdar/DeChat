package ne1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ne1.c0 */
public enum C34792c0 implements C38174i<C47229b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93489d;

    public Object get() {
        Object obj = this.f93489d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93489d;
                if (obj == obj2) {
                    obj = new C47229b0();
                    this.f93489d = obj;
                }
            }
        }
        return (C47229b0) obj;
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
        return "provider " + C47229b0.class.getName();
    }
}
