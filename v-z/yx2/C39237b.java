package yx2;

import com.tencent.p014mm.autogen.events.AggressiveCleanCacheEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yx2.b */
public enum C39237b implements C38174i<C39236a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105556d;

    public Object get() {
        Object obj = this.f105556d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105556d;
                if (obj == obj2) {
                    obj = new C39236a();
                    this.f105556d = obj;
                }
            }
        }
        return (C39236a) obj;
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
        return "provider " + C39236a.class.getName();
    }
}
