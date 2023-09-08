package wa3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wa3.d */
public enum C38042d implements C38174i<C102364c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100571d;

    public Object get() {
        Object obj = this.f100571d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100571d;
                if (obj == obj2) {
                    obj = new C102364c();
                    this.f100571d = obj;
                }
            }
        }
        return (C102364c) obj;
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
        return "provider " + C102364c.class.getName();
    }
}
