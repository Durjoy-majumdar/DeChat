package p238st;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: st.h */
public enum C36800h implements C38174i<C13780g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97725d;

    public Object get() {
        Object obj = this.f97725d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97725d;
                if (obj == obj2) {
                    obj = new C13780g();
                    this.f97725d = obj;
                }
            }
        }
        return (C13780g) obj;
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
        return "provider " + C13780g.class.getName();
    }
}
