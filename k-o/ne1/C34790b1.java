package ne1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ne1.b1 */
public enum C34790b1 implements C38174i<C47228a1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93483d;

    public Object get() {
        Object obj = this.f93483d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93483d;
                if (obj == obj2) {
                    obj = new C47228a1();
                    this.f93483d = obj;
                }
            }
        }
        return (C47228a1) obj;
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
        return "provider " + C47228a1.class.getName();
    }
}
