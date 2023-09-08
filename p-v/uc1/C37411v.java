package uc1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: uc1.v */
public enum C37411v implements C38174i<C101996u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98900d;

    public Object get() {
        Object obj = this.f98900d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98900d;
                if (obj == obj2) {
                    obj = new C101996u();
                    this.f98900d = obj;
                }
            }
        }
        return (C101996u) obj;
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
        return "provider " + C101996u.class.getName();
    }
}
