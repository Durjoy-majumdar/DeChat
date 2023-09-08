package v22;

import com.tencent.p014mm.autogen.events.FetchStreetViewUrlEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: v22.m */
public enum C37657m implements C38174i<C37656l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99818d;

    public Object get() {
        Object obj = this.f99818d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99818d;
                if (obj == obj2) {
                    obj = new C37656l();
                    this.f99818d = obj;
                }
            }
        }
        return (C37656l) obj;
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
        return Objects.equals(obj, FetchStreetViewUrlEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37656l.class.getName();
    }
}
