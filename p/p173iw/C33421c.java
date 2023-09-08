package p173iw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: iw.c */
public enum C33421c implements C38174i<C9258b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90555d;

    public Object get() {
        Object obj = this.f90555d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90555d;
                if (obj == obj2) {
                    obj = new C9258b();
                    this.f90555d = obj;
                }
            }
        }
        return (C9258b) obj;
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
        return "provider " + C9258b.class.getName();
    }
}
