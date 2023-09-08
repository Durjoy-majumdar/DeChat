package d00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d00.p0 */
public enum C31017p0 implements C38174i<C45249o0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83221d;

    public Object get() {
        Object obj = this.f83221d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83221d;
                if (obj == obj2) {
                    obj = new C45249o0();
                    this.f83221d = obj;
                }
            }
        }
        return (C45249o0) obj;
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
        return "provider " + C45249o0.class.getName();
    }
}
