package p174iz;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: iz.j */
public enum C33457j implements C38174i<C33456i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90634d;

    public Object get() {
        Object obj = this.f90634d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90634d;
                if (obj == obj2) {
                    obj = new C33456i();
                    this.f90634d = obj;
                }
            }
        }
        return (C33456i) obj;
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
        return Objects.equals(obj, 8);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33456i.class.getName();
    }
}
