package p677rm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rm.r */
public enum C36367r implements C38174i<C36366q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96778d;

    public Object get() {
        Object obj = this.f96778d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96778d;
                if (obj == obj2) {
                    obj = new C36366q();
                    this.f96778d = obj;
                }
            }
        }
        return (C36366q) obj;
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
        return "provider " + C36366q.class.getName();
    }
}
