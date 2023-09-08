package p174iz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: iz.l */
public enum C33458l implements C38174i<C9267k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90637d;

    public Object get() {
        Object obj = this.f90637d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90637d;
                if (obj == obj2) {
                    obj = new C9267k();
                    this.f90637d = obj;
                }
            }
        }
        return (C9267k) obj;
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
        return "provider " + C9267k.class.getName();
    }
}
