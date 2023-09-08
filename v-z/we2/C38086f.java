package we2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: we2.f */
public enum C38086f implements C38174i<C102433e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100674d;

    public Object get() {
        Object obj = this.f100674d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100674d;
                if (obj == obj2) {
                    obj = new C102433e();
                    this.f100674d = obj;
                }
            }
        }
        return (C102433e) obj;
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
        return "provider " + C102433e.class.getName();
    }
}
