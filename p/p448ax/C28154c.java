package p448ax;

import ei3.C31607a;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ax.c */
public enum C28154c implements C38174i<C28153b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77626d;

    public Object get() {
        Object obj = this.f77626d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77626d;
                if (obj == obj2) {
                    obj = new C28153b();
                    this.f77626d = obj;
                }
            }
        }
        return (C28153b) obj;
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
        return Objects.equals(obj, C31607a.f84458d);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28153b.class.getName();
    }
}
