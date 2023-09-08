package cb2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cb2.h */
public enum C28529h implements C38174i<C0443g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78374d;

    public Object get() {
        Object obj = this.f78374d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78374d;
                if (obj == obj2) {
                    obj = new C0443g();
                    this.f78374d = obj;
                }
            }
        }
        return (C0443g) obj;
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
        return "provider " + C0443g.class.getName();
    }
}
