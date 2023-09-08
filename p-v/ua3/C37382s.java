package ua3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ua3.s */
public enum C37382s implements C38174i<C101994r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98826d;

    public Object get() {
        Object obj = this.f98826d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98826d;
                if (obj == obj2) {
                    obj = new C101994r();
                    this.f98826d = obj;
                }
            }
        }
        return (C101994r) obj;
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
        return "provider " + C101994r.class.getName();
    }
}
