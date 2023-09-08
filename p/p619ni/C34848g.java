package p619ni;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ni.g */
public enum C34848g implements C38174i<C34846f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93625d;

    public Object get() {
        Object obj = this.f93625d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93625d;
                if (obj == obj2) {
                    obj = new C34846f();
                    this.f93625d = obj;
                }
            }
        }
        return (C34846f) obj;
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
        return Objects.equals(obj, "IMUnionRoom2AssociateRoom");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34846f.class.getName();
    }
}
