package ic2;

import com.tencent.p014mm.autogen.events.NotifyPushNewTipsEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ic2.c */
public enum C33279c implements C38174i<C76302b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90263d;

    public Object get() {
        Object obj = this.f90263d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90263d;
                if (obj == obj2) {
                    obj = new C76302b();
                    this.f90263d = obj;
                }
            }
        }
        return (C76302b) obj;
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
        return Objects.equals(obj, NotifyPushNewTipsEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76302b.class.getName();
    }
}
