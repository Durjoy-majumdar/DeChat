package p418rx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rx.b */
public enum C36540b implements C38174i<C77577a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97192d;

    public Object get() {
        Object obj = this.f97192d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97192d;
                if (obj == obj2) {
                    obj = new C77577a();
                    this.f97192d = obj;
                }
            }
        }
        return (C77577a) obj;
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
        return "provider " + C77577a.class.getName();
    }
}
