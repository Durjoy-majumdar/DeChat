package p669qw;

import java.util.Collections;
import p261wl.C38174i;
import p669qw.C36105b0;

/* renamed from: qw.d0 */
public enum C36113d0 implements C38174i<C36105b0.C36106a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96236d;

    public Object get() {
        Object obj = this.f96236d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96236d;
                if (obj == obj2) {
                    obj = new C36105b0.C36106a();
                    this.f96236d = obj;
                }
            }
        }
        return (C36105b0.C36106a) obj;
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
        return "provider " + C36105b0.C36106a.class.getName();
    }
}
