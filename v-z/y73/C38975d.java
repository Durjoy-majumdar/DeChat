package y73;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: y73.d */
public enum C38975d implements C38174i<C23278c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105014d;

    public Object get() {
        Object obj = this.f105014d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105014d;
                if (obj == obj2) {
                    obj = new C23278c();
                    this.f105014d = obj;
                }
            }
        }
        return (C23278c) obj;
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
        return Objects.equals(obj, "mmsearch_reddot_new");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C23278c.class.getName();
    }
}
