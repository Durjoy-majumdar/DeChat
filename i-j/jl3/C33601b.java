package jl3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: jl3.b */
public enum C33601b implements C38174i<C33600a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90940d;

    public Object get() {
        Object obj = this.f90940d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90940d;
                if (obj == obj2) {
                    obj = new C33600a();
                    this.f90940d = obj;
                }
            }
        }
        return (C33600a) obj;
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
        return "provider " + C33600a.class.getName();
    }
}
