package p589kt;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kt.f */
public enum C34032f implements C38174i<C46742e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91852d;

    public Object get() {
        Object obj = this.f91852d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91852d;
                if (obj == obj2) {
                    obj = new C46742e();
                    this.f91852d = obj;
                }
            }
        }
        return (C46742e) obj;
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
        return "provider " + C46742e.class.getName();
    }
}
