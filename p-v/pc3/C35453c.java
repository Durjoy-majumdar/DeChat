package pc3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: pc3.c */
public enum C35453c implements C38174i<C35452b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94866d;

    public Object get() {
        Object obj = this.f94866d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94866d;
                if (obj == obj2) {
                    obj = new C35452b();
                    this.f94866d = obj;
                }
            }
        }
        return (C35452b) obj;
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
        return "provider " + C35452b.class.getName();
    }
}
