package p612mu;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: mu.d */
public enum C34659d implements C38174i<C99971c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93195d;

    public Object get() {
        Object obj = this.f93195d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93195d;
                if (obj == obj2) {
                    obj = new C99971c();
                    this.f93195d = obj;
                }
            }
        }
        return (C99971c) obj;
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
        return "provider " + C99971c.class.getName();
    }
}
