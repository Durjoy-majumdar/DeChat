package a83;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a83.l */
public enum C27828l implements C38174i<C27827k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76938d;

    public Object get() {
        Object obj = this.f76938d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76938d;
                if (obj == obj2) {
                    obj = new C27827k();
                    this.f76938d = obj;
                }
            }
        }
        return (C27827k) obj;
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
        return "provider " + C27827k.class.getName();
    }
}
