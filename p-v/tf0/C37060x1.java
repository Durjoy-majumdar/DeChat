package tf0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: tf0.x1 */
public enum C37060x1 implements C38174i<C37055w1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98230d;

    public Object get() {
        Object obj = this.f98230d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98230d;
                if (obj == obj2) {
                    obj = new C37055w1();
                    this.f98230d = obj;
                }
            }
        }
        return (C37055w1) obj;
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
        return "provider " + C37055w1.class.getName();
    }
}
