package n12;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: n12.f */
public enum C34732f implements C38174i<C11104e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93382d;

    public Object get() {
        Object obj = this.f93382d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93382d;
                if (obj == obj2) {
                    obj = new C11104e();
                    this.f93382d = obj;
                }
            }
        }
        return (C11104e) obj;
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
        return "provider " + C11104e.class.getName();
    }
}
