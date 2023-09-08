package ne1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ne1.u */
public enum C34818u implements C38174i<C11155t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93567d;

    public Object get() {
        Object obj = this.f93567d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93567d;
                if (obj == obj2) {
                    obj = new C11155t();
                    this.f93567d = obj;
                }
            }
        }
        return (C11155t) obj;
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
        return "provider " + C11155t.class.getName();
    }
}
