package k61;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: k61.h */
public enum C33833h implements C38174i<C33832g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91453d;

    public Object get() {
        Object obj = this.f91453d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91453d;
                if (obj == obj2) {
                    obj = new C33832g();
                    this.f91453d = obj;
                }
            }
        }
        return (C33832g) obj;
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
        return Objects.equals(obj, "NewRecommendEmotion");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33832g.class.getName();
    }
}
