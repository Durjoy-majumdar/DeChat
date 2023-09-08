package nu1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: nu1.c */
public enum C35029c implements C38174i<C61904b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94000d;

    public Object get() {
        Object obj = this.f94000d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94000d;
                if (obj == obj2) {
                    obj = new C61904b();
                    this.f94000d = obj;
                }
            }
        }
        return (C61904b) obj;
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
        return "provider " + C61904b.class.getName();
    }
}
