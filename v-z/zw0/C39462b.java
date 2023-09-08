package zw0;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: zw0.b */
public enum C39462b implements C38174i<C39461a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105983d;

    public Object get() {
        Object obj = this.f105983d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105983d;
                if (obj == obj2) {
                    obj = new C39461a();
                    this.f105983d = obj;
                }
            }
        }
        return (C39461a) obj;
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
        return "provider " + C39461a.class.getName();
    }
}
