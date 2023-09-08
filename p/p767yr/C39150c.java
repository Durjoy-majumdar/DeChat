package p767yr;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yr.c */
public enum C39150c implements C38174i<C66694b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105369d;

    public Object get() {
        Object obj = this.f105369d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105369d;
                if (obj == obj2) {
                    obj = new C66694b();
                    this.f105369d = obj;
                }
            }
        }
        return (C66694b) obj;
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
        return Objects.equals(obj, "mmsearch_fts_reddot");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C66694b.class.getName();
    }
}
