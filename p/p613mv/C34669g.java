package p613mv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: mv.g */
public enum C34669g implements C38174i<C76809f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93220d;

    public Object get() {
        Object obj = this.f93220d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93220d;
                if (obj == obj2) {
                    obj = new C76809f();
                    this.f93220d = obj;
                }
            }
        }
        return (C76809f) obj;
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
        return "provider " + C76809f.class.getName();
    }
}
