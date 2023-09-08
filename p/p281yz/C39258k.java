package p281yz;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yz.k */
public enum C39258k implements C38174i<C16081j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105616d;

    public Object get() {
        Object obj = this.f105616d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105616d;
                if (obj == obj2) {
                    obj = new C16081j();
                    this.f105616d = obj;
                }
            }
        }
        return (C16081j) obj;
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
        return Objects.equals(obj, "paymsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C16081j.class.getName();
    }
}
