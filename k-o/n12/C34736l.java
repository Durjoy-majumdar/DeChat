package n12;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: n12.l */
public enum C34736l implements C38174i<C34735k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93391d;

    public Object get() {
        Object obj = this.f93391d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93391d;
                if (obj == obj2) {
                    obj = new C34735k();
                    this.f93391d = obj;
                }
            }
        }
        return (C34735k) obj;
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
        return Objects.equals(obj, "WeChatOutMsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34735k.class.getName();
    }
}
