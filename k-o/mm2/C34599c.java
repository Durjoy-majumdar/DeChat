package mm2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: mm2.c */
public enum C34599c implements C38174i<C34597b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93027d;

    public Object get() {
        Object obj = this.f93027d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93027d;
                if (obj == obj2) {
                    obj = new C34597b();
                    this.f93027d = obj;
                }
            }
        }
        return (C34597b) obj;
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
        return "provider " + C34597b.class.getName();
    }
}
