package p637ou;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ou.c */
public enum C35310c implements C38174i<C100461b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94592d;

    public Object get() {
        Object obj = this.f94592d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94592d;
                if (obj == obj2) {
                    obj = new C100461b();
                    this.f94592d = obj;
                }
            }
        }
        return (C100461b) obj;
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
        return "provider " + C100461b.class.getName();
    }
}
