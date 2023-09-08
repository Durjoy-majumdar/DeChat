package p620nm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: nm.d */
public enum C34870d implements C38174i<C34869c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93666d;

    public Object get() {
        Object obj = this.f93666d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93666d;
                if (obj == obj2) {
                    obj = new C34869c();
                    this.f93666d = obj;
                }
            }
        }
        return (C34869c) obj;
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
        return "provider " + C34869c.class.getName();
    }
}
