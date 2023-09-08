package pn1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pn1.l */
public enum C35579l implements C38174i<C35578k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95123d;

    public Object get() {
        Object obj = this.f95123d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95123d;
                if (obj == obj2) {
                    obj = new C35578k();
                    this.f95123d = obj;
                }
            }
        }
        return (C35578k) obj;
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
        return Objects.equals(obj, "FinderHotWordsJumpMsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35578k.class.getName();
    }
}
