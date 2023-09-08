package h22;

import com.tencent.p014mm.autogen.events.AggressiveCleanCacheEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: h22.b */
public enum C32674b implements C38174i<C32673a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86696d;

    public Object get() {
        Object obj = this.f86696d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86696d;
                if (obj == obj2) {
                    obj = new C32673a();
                    this.f86696d = obj;
                }
            }
        }
        return (C32673a) obj;
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
        return Objects.equals(obj, AggressiveCleanCacheEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32673a.class.getName();
    }
}
