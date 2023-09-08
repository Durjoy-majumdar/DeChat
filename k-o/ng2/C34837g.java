package ng2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ng2.g */
public enum C34837g implements C38174i<C34836f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93600d;

    public Object get() {
        Object obj = this.f93600d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93600d;
                if (obj == obj2) {
                    obj = new C34836f();
                    this.f93600d = obj;
                }
            }
        }
        return (C34836f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
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
        return "provider " + C34836f.class.getName();
    }
}
