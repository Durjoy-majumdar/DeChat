package n12;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: n12.j */
public enum C34734j implements C38174i<C11110i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93388d;

    public Object get() {
        Object obj = this.f93388d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93388d;
                if (obj == obj2) {
                    obj = new C11110i();
                    this.f93388d = obj;
                }
            }
        }
        return (C11110i) obj;
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
        return Objects.equals(obj, "WeChatOut");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11110i.class.getName();
    }
}
