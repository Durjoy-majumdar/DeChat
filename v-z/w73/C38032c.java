package w73;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: w73.c */
public enum C38032c implements C38174i<C102358b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100547d;

    public Object get() {
        Object obj = this.f100547d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100547d;
                if (obj == obj2) {
                    obj = new C102358b();
                    this.f100547d = obj;
                }
            }
        }
        return (C102358b) obj;
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
        return "provider " + C102358b.class.getName();
    }
}
