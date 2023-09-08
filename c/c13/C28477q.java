package c13;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: c13.q */
public enum C28477q implements C38174i<C79917p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78280d;

    public Object get() {
        Object obj = this.f78280d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78280d;
                if (obj == obj2) {
                    obj = new C79917p();
                    this.f78280d = obj;
                }
            }
        }
        return (C79917p) obj;
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
        return "provider " + C79917p.class.getName();
    }
}
