package p236sn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: sn.l */
public enum C36731l implements C38174i<C27670k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97574d;

    public Object get() {
        Object obj = this.f97574d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97574d;
                if (obj == obj2) {
                    obj = new C27670k();
                    this.f97574d = obj;
                }
            }
        }
        return (C27670k) obj;
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
        return "provider " + C27670k.class.getName();
    }
}
