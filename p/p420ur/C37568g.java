package p420ur;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ur.g */
public enum C37568g implements C38174i<C102073f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99642d;

    public Object get() {
        Object obj = this.f99642d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99642d;
                if (obj == obj2) {
                    obj = new C102073f();
                    this.f99642d = obj;
                }
            }
        }
        return (C102073f) obj;
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
        return "provider " + C102073f.class.getName();
    }
}
