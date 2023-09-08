package p776zm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: zm.h */
public enum C39390h implements C38174i<C39389g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105836d;

    public Object get() {
        Object obj = this.f105836d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105836d;
                if (obj == obj2) {
                    obj = new C39389g();
                    this.f105836d = obj;
                }
            }
        }
        return (C39389g) obj;
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
        return "provider " + C39389g.class.getName();
    }
}
