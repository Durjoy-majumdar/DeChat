package p438an;

import com.tencent.p014mm.autogen.events.GetAppSettingEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: an.c */
public enum C27932c implements C38174i<C67068b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77149d;

    public Object get() {
        Object obj = this.f77149d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77149d;
                if (obj == obj2) {
                    obj = new C67068b();
                    this.f77149d = obj;
                }
            }
        }
        return (C67068b) obj;
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
        return Objects.equals(obj, GetAppSettingEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C67068b.class.getName();
    }
}
