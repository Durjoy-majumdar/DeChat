package p689su;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: su.c */
public enum C36830c implements C38174i<C36828b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97786d;

    public Object get() {
        Object obj = this.f97786d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97786d;
                if (obj == obj2) {
                    obj = new C36828b();
                    this.f97786d = obj;
                }
            }
        }
        return (C36828b) obj;
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
        return "provider " + C36828b.class.getName();
    }
}
