package uc1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: uc1.a0 */
public enum C37394a0 implements C38174i<C101997z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98857d;

    public Object get() {
        Object obj = this.f98857d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98857d;
                if (obj == obj2) {
                    obj = new C101997z();
                    this.f98857d = obj;
                }
            }
        }
        return (C101997z) obj;
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
        return "provider " + C101997z.class.getName();
    }
}
