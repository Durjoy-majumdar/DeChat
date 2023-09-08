package p461bw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: bw.c */
public enum C28428c implements C38174i<C92325b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78169d;

    public Object get() {
        Object obj = this.f78169d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78169d;
                if (obj == obj2) {
                    obj = new C92325b();
                    this.f78169d = obj;
                }
            }
        }
        return (C92325b) obj;
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
        return "provider " + C92325b.class.getName();
    }
}
