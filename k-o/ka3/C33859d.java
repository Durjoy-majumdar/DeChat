package ka3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ka3.d */
public enum C33859d implements C38174i<C60986c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91506d;

    public Object get() {
        Object obj = this.f91506d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91506d;
                if (obj == obj2) {
                    obj = new C60986c();
                    this.f91506d = obj;
                }
            }
        }
        return (C60986c) obj;
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
        return "provider " + C60986c.class.getName();
    }
}
