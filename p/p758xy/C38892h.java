package p758xy;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xy.h */
public enum C38892h implements C38174i<C79009g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104829d;

    public Object get() {
        Object obj = this.f104829d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104829d;
                if (obj == obj2) {
                    obj = new C79009g();
                    this.f104829d = obj;
                }
            }
        }
        return (C79009g) obj;
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
        return "provider " + C79009g.class.getName();
    }
}
