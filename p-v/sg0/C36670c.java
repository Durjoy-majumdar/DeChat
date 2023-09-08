package sg0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: sg0.c */
public enum C36670c implements C38174i<C13675b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97463d;

    public Object get() {
        Object obj = this.f97463d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97463d;
                if (obj == obj2) {
                    obj = new C13675b();
                    this.f97463d = obj;
                }
            }
        }
        return (C13675b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
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
        return "provider " + C13675b.class.getName();
    }
}
