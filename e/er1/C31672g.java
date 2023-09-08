package er1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: er1.g */
public enum C31672g implements C38174i<C58684b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84604d;

    public Object get() {
        Object obj = this.f84604d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84604d;
                if (obj == obj2) {
                    obj = new C58684b();
                    this.f84604d = obj;
                }
            }
        }
        return (C58684b) obj;
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
        return "provider " + C58684b.class.getName();
    }
}
