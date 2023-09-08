package p764yn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: yn.f */
public enum C39081f implements C38174i<C39080e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105203d;

    public Object get() {
        Object obj = this.f105203d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105203d;
                if (obj == obj2) {
                    obj = new C39080e();
                    this.f105203d = obj;
                }
            }
        }
        return (C39080e) obj;
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
        return "provider " + C39080e.class.getName();
    }
}
