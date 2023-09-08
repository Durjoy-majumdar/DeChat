package p524fq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fq.c */
public enum C32158c implements C38174i<C45805b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85482d;

    public Object get() {
        Object obj = this.f85482d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85482d;
                if (obj == obj2) {
                    obj = new C45805b();
                    this.f85482d = obj;
                }
            }
        }
        return (C45805b) obj;
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
        return "provider " + C45805b.class.getName();
    }
}
