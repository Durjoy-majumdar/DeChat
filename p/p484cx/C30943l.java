package p484cx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cx.l */
public enum C30943l implements C38174i<C57995k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83055d;

    public Object get() {
        Object obj = this.f83055d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83055d;
                if (obj == obj2) {
                    obj = new C57995k();
                    this.f83055d = obj;
                }
            }
        }
        return (C57995k) obj;
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
        return "provider " + C57995k.class.getName();
    }
}
