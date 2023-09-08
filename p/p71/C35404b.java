package p71;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: p71.b */
public enum C35404b implements C38174i<C35394a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94754d;

    public Object get() {
        Object obj = this.f94754d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94754d;
                if (obj == obj2) {
                    obj = new C35394a();
                    this.f94754d = obj;
                }
            }
        }
        return (C35394a) obj;
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
        return "provider " + C35394a.class.getName();
    }
}
