package pn1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pn1.h */
public enum C35575h implements C38174i<C62409g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95117d;

    public Object get() {
        Object obj = this.f95117d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95117d;
                if (obj == obj2) {
                    obj = new C62409g();
                    this.f95117d = obj;
                }
            }
        }
        return (C62409g) obj;
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
        return Objects.equals(obj, "FinderPromotion");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C62409g.class.getName();
    }
}
