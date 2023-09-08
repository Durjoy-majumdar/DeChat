package on3;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: on3.h */
public enum C35234h implements C38174i<C77026g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94443d;

    public Object get() {
        Object obj = this.f94443d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94443d;
                if (obj == obj2) {
                    obj = new C77026g();
                    this.f94443d = obj;
                }
            }
        }
        return (C77026g) obj;
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
        return Objects.equals(obj, "mmchatroomtopmsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77026g.class.getName();
    }
}
