package j43;

import com.tencent.p014mm.autogen.events.CheckVoipCSIsStartedEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: j43.b */
public enum C33510b implements C38174i<C87878a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90732d;

    public Object get() {
        Object obj = this.f90732d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90732d;
                if (obj == obj2) {
                    obj = new C87878a();
                    this.f90732d = obj;
                }
            }
        }
        return (C87878a) obj;
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
        return Objects.equals(obj, CheckVoipCSIsStartedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C87878a.class.getName();
    }
}
