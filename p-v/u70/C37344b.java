package u70;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: u70.b */
public enum C37344b implements C38174i<C111132a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98743d;

    public Object get() {
        Object obj = this.f98743d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98743d;
                if (obj == obj2) {
                    obj = new C111132a();
                    this.f98743d = obj;
                }
            }
        }
        return (C111132a) obj;
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
        return "provider " + C111132a.class.getName();
    }
}
