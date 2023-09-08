package p591ky;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ky.g */
public enum C34119g implements C38174i<C109055f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92052d;

    public Object get() {
        Object obj = this.f92052d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92052d;
                if (obj == obj2) {
                    obj = new C109055f();
                    this.f92052d = obj;
                }
            }
        }
        return (C109055f) obj;
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
        return "provider " + C109055f.class.getName();
    }
}
