package p752xo;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xo.b */
public enum C38780b implements C38174i<C38776a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104597d;

    public Object get() {
        Object obj = this.f104597d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104597d;
                if (obj == obj2) {
                    obj = new C38776a();
                    this.f104597d = obj;
                }
            }
        }
        return (C38776a) obj;
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
        return "provider " + C38776a.class.getName();
    }
}
