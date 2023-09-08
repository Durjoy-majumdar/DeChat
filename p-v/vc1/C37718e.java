package vc1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: vc1.e */
public enum C37718e implements C38174i<C37717d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99920d;

    public Object get() {
        Object obj = this.f99920d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99920d;
                if (obj == obj2) {
                    obj = new C37717d();
                    this.f99920d = obj;
                }
            }
        }
        return (C37717d) obj;
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
        return "provider " + C37717d.class.getName();
    }
}
