package d00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d00.f1 */
public enum C30996f1 implements C38174i<C45248e1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83172d;

    public Object get() {
        Object obj = this.f83172d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83172d;
                if (obj == obj2) {
                    obj = new C45248e1();
                    this.f83172d = obj;
                }
            }
        }
        return (C45248e1) obj;
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
        return "provider " + C45248e1.class.getName();
    }
}
