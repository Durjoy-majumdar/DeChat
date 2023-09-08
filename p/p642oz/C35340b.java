package p642oz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: oz.b */
public enum C35340b implements C38174i<C89303a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94649d;

    public Object get() {
        Object obj = this.f94649d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94649d;
                if (obj == obj2) {
                    obj = new C89303a();
                    this.f94649d = obj;
                }
            }
        }
        return (C89303a) obj;
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
        return "provider " + C89303a.class.getName();
    }
}
