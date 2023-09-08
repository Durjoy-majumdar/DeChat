package ek0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ek0.c */
public enum C31610c implements C38174i<C116776a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84467d;

    public Object get() {
        Object obj = this.f84467d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84467d;
                if (obj == obj2) {
                    obj = new C116776a();
                    this.f84467d = obj;
                }
            }
        }
        return (C116776a) obj;
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
        return "provider " + C116776a.class.getName();
    }
}
