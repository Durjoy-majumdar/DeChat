package p709um;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: um.z */
public enum C37511z implements C38174i<C90703y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99099d;

    public Object get() {
        Object obj = this.f99099d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99099d;
                if (obj == obj2) {
                    obj = new C90703y();
                    this.f99099d = obj;
                }
            }
        }
        return (C90703y) obj;
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
        return "provider " + C90703y.class.getName();
    }
}
