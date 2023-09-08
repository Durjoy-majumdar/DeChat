package we2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: we2.d */
public enum C38085d implements C38174i<C102432c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100671d;

    public Object get() {
        Object obj = this.f100671d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100671d;
                if (obj == obj2) {
                    obj = new C102432c();
                    this.f100671d = obj;
                }
            }
        }
        return (C102432c) obj;
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
        return "provider " + C102432c.class.getName();
    }
}
