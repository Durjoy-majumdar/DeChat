package p376qn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qn.h */
public enum C36011h implements C38174i<C47871g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96015d;

    public Object get() {
        Object obj = this.f96015d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96015d;
                if (obj == obj2) {
                    obj = new C47871g();
                    this.f96015d = obj;
                }
            }
        }
        return (C47871g) obj;
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
        return "provider " + C47871g.class.getName();
    }
}
