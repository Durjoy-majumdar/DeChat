package p786zy;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: zy.c */
public enum C39473c implements C38174i<C39472b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f106008d;

    public Object get() {
        Object obj = this.f106008d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f106008d;
                if (obj == obj2) {
                    obj = new C39472b();
                    this.f106008d = obj;
                }
            }
        }
        return (C39472b) obj;
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
        return "provider " + C39472b.class.getName();
    }
}
