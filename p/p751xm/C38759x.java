package p751xm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xm.x */
public enum C38759x implements C38174i<C53376w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104563d;

    public Object get() {
        Object obj = this.f104563d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104563d;
                if (obj == obj2) {
                    obj = new C53376w();
                    this.f104563d = obj;
                }
            }
        }
        return (C53376w) obj;
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
        return "provider " + C53376w.class.getName();
    }
}
