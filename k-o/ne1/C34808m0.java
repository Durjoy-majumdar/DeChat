package ne1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ne1.m0 */
public enum C34808m0 implements C38174i<C11153l0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93537d;

    public Object get() {
        Object obj = this.f93537d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93537d;
                if (obj == obj2) {
                    obj = new C11153l0();
                    this.f93537d = obj;
                }
            }
        }
        return (C11153l0) obj;
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
        return "provider " + C11153l0.class.getName();
    }
}
