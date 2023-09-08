package l00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: l00.c */
public enum C34143c implements C38174i<C76660b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92107d;

    public Object get() {
        Object obj = this.f92107d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92107d;
                if (obj == obj2) {
                    obj = new C76660b();
                    this.f92107d = obj;
                }
            }
        }
        return (C76660b) obj;
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
        return "provider " + C76660b.class.getName();
    }
}
