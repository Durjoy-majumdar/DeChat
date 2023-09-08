package ac3;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ac3.c0 */
public enum C27846c0 implements C38174i<C91989b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76970d;

    public Object get() {
        Object obj = this.f76970d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76970d;
                if (obj == obj2) {
                    obj = new C91989b0();
                    this.f76970d = obj;
                }
            }
        }
        return (C91989b0) obj;
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
        return Objects.equals(obj, CheckResUpdateCacheFileEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C91989b0.class.getName();
    }
}
