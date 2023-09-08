package ta1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ta1.b */
public enum C36987b implements C38174i<C36983a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98079d;

    public Object get() {
        Object obj = this.f98079d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98079d;
                if (obj == obj2) {
                    obj = new C36983a();
                    this.f98079d = obj;
                }
            }
        }
        return (C36983a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
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
        return "provider " + C36983a.class.getName();
    }
}
