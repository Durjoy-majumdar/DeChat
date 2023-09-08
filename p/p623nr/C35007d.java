package p623nr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: nr.d */
public enum C35007d implements C38174i<C47293c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93955d;

    public Object get() {
        Object obj = this.f93955d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93955d;
                if (obj == obj2) {
                    obj = new C47293c();
                    this.f93955d = obj;
                }
            }
        }
        return (C47293c) obj;
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
        return "provider " + C47293c.class.getName();
    }
}
