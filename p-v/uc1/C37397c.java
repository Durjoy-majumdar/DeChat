package uc1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: uc1.c */
public enum C37397c implements C38174i<C37395b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98861d;

    public Object get() {
        Object obj = this.f98861d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98861d;
                if (obj == obj2) {
                    obj = new C37395b();
                    this.f98861d = obj;
                }
            }
        }
        return (C37395b) obj;
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
        return "provider " + C37395b.class.getName();
    }
}
