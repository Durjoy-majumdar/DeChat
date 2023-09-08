package p780zs;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: zs.c */
public enum C39443c implements C38174i<C103068b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105947d;

    public Object get() {
        Object obj = this.f105947d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105947d;
                if (obj == obj2) {
                    obj = new C103068b();
                    this.f105947d = obj;
                }
            }
        }
        return (C103068b) obj;
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
        return "provider " + C103068b.class.getName();
    }
}
