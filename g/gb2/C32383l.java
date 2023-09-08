package gb2;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gb2.l */
public enum C32383l implements C38174i<C32382k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85923d;

    public Object get() {
        Object obj = this.f85923d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85923d;
                if (obj == obj2) {
                    obj = new C32382k();
                    this.f85923d = obj;
                }
            }
        }
        return (C32382k) obj;
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
        return "provider " + C32382k.class.getName();
    }
}
