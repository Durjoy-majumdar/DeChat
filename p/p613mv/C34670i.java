package p613mv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: mv.i */
public enum C34670i implements C38174i<C76810h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93223d;

    public Object get() {
        Object obj = this.f93223d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93223d;
                if (obj == obj2) {
                    obj = new C76810h();
                    this.f93223d = obj;
                }
            }
        }
        return (C76810h) obj;
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
        return "provider " + C76810h.class.getName();
    }
}
