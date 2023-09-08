package od2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: od2.c */
public enum C35150c implements C38174i<C35148b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94271d;

    public Object get() {
        Object obj = this.f94271d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94271d;
                if (obj == obj2) {
                    obj = new C35148b();
                    this.f94271d = obj;
                }
            }
        }
        return (C35148b) obj;
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
        return "provider " + C35148b.class.getName();
    }
}
