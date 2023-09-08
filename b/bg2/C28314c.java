package bg2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: bg2.c */
public enum C28314c implements C38174i<C28313b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77920d;

    public Object get() {
        Object obj = this.f77920d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77920d;
                if (obj == obj2) {
                    obj = new C28313b();
                    this.f77920d = obj;
                }
            }
        }
        return (C28313b) obj;
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
        return "provider " + C28313b.class.getName();
    }
}
