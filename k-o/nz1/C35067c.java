package nz1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: nz1.c */
public enum C35067c implements C38174i<C76983b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94089d;

    public Object get() {
        Object obj = this.f94089d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94089d;
                if (obj == obj2) {
                    obj = new C76983b();
                    this.f94089d = obj;
                }
            }
        }
        return (C76983b) obj;
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
        return "provider " + C76983b.class.getName();
    }
}
