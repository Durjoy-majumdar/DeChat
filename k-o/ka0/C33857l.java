package ka0;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ka0.l */
public enum C33857l implements C38174i<C33856k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91500d;

    public Object get() {
        Object obj = this.f91500d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91500d;
                if (obj == obj2) {
                    obj = new C33856k();
                    this.f91500d = obj;
                }
            }
        }
        return (C33856k) obj;
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
        return "provider " + C33856k.class.getName();
    }
}
