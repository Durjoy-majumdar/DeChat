package p563ip;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ip.c */
public enum C33380c implements C38174i<C33379b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90451d;

    public Object get() {
        Object obj = this.f90451d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90451d;
                if (obj == obj2) {
                    obj = new C33379b();
                    this.f90451d = obj;
                }
            }
        }
        return (C33379b) obj;
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
        return "provider " + C33379b.class.getName();
    }
}
