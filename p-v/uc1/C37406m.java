package uc1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: uc1.m */
public enum C37406m implements C38174i<C14150l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98888d;

    public Object get() {
        Object obj = this.f98888d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98888d;
                if (obj == obj2) {
                    obj = new C14150l();
                    this.f98888d = obj;
                }
            }
        }
        return (C14150l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C14150l.class.getName();
    }
}
