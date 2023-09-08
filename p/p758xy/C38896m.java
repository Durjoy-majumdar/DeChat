package p758xy;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xy.m */
public enum C38896m implements C38174i<C53469l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104839d;

    public Object get() {
        Object obj = this.f104839d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104839d;
                if (obj == obj2) {
                    obj = new C53469l();
                    this.f104839d = obj;
                }
            }
        }
        return (C53469l) obj;
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
        return "provider " + C53469l.class.getName();
    }
}
