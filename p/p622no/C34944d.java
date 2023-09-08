package p622no;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: no.d */
public enum C34944d implements C38174i<C47291c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93806d;

    public Object get() {
        Object obj = this.f93806d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93806d;
                if (obj == obj2) {
                    obj = new C47291c();
                    this.f93806d = obj;
                }
            }
        }
        return (C47291c) obj;
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
        return "provider " + C47291c.class.getName();
    }
}
