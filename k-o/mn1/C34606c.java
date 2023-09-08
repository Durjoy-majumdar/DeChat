package mn1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: mn1.c */
public enum C34606c implements C38174i<C10939b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93040d;

    public Object get() {
        Object obj = this.f93040d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93040d;
                if (obj == obj2) {
                    obj = new C10939b();
                    this.f93040d = obj;
                }
            }
        }
        return (C10939b) obj;
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
        return "provider " + C10939b.class.getName();
    }
}
