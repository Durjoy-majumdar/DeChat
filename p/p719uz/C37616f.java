package p719uz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: uz.f */
public enum C37616f implements C38174i<C90733e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99741d;

    public Object get() {
        Object obj = this.f99741d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99741d;
                if (obj == obj2) {
                    obj = new C90733e();
                    this.f99741d = obj;
                }
            }
        }
        return (C90733e) obj;
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
        return "provider " + C90733e.class.getName();
    }
}
