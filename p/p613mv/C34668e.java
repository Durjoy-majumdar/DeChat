package p613mv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: mv.e */
public enum C34668e implements C38174i<C117581d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93217d;

    public Object get() {
        Object obj = this.f93217d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93217d;
                if (obj == obj2) {
                    obj = new C117581d();
                    this.f93217d = obj;
                }
            }
        }
        return (C117581d) obj;
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
        return "provider " + C117581d.class.getName();
    }
}
