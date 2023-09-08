package p669qw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qw.d */
public enum C36112d implements C38174i<C36110c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96233d;

    public Object get() {
        Object obj = this.f96233d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96233d;
                if (obj == obj2) {
                    obj = new C36110c();
                    this.f96233d = obj;
                }
            }
        }
        return (C36110c) obj;
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
        return "provider " + C36110c.class.getName();
    }
}
