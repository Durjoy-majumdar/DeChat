package fz1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fz1.e */
public enum C32240e implements C38174i<C32239d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85657d;

    public Object get() {
        Object obj = this.f85657d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85657d;
                if (obj == obj2) {
                    obj = new C32239d();
                    this.f85657d = obj;
                }
            }
        }
        return (C32239d) obj;
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
        return "provider " + C32239d.class.getName();
    }
}
