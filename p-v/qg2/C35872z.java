package qg2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qg2.z */
public enum C35872z implements C38174i<C101179y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95734d;

    public Object get() {
        Object obj = this.f95734d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95734d;
                if (obj == obj2) {
                    obj = new C101179y();
                    this.f95734d = obj;
                }
            }
        }
        return (C101179y) obj;
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
        return "provider " + C101179y.class.getName();
    }
}
