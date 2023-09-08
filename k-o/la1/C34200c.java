package la1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: la1.c */
public enum C34200c implements C38174i<C61258b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92231d;

    public Object get() {
        Object obj = this.f92231d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92231d;
                if (obj == obj2) {
                    obj = new C61258b();
                    this.f92231d = obj;
                }
            }
        }
        return (C61258b) obj;
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
        return "provider " + C61258b.class.getName();
    }
}
