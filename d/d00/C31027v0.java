package d00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d00.v0 */
public enum C31027v0 implements C38174i<C45250u0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83248d;

    public Object get() {
        Object obj = this.f83248d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83248d;
                if (obj == obj2) {
                    obj = new C45250u0();
                    this.f83248d = obj;
                }
            }
        }
        return (C45250u0) obj;
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
        return "provider " + C45250u0.class.getName();
    }
}
