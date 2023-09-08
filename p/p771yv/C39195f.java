package p771yv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: yv.f */
public enum C39195f implements C38174i<C91588e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105446d;

    public Object get() {
        Object obj = this.f105446d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105446d;
                if (obj == obj2) {
                    obj = new C91588e();
                    this.f105446d = obj;
                }
            }
        }
        return (C91588e) obj;
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
        return "provider " + C91588e.class.getName();
    }
}
