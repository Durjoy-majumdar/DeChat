package ac3;

import com.tencent.p014mm.autogen.events.CheckResUpdatePreOperationEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ac3.w */
public enum C27869w implements C38174i<C27867v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77016d;

    public Object get() {
        Object obj = this.f77016d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77016d;
                if (obj == obj2) {
                    obj = new C27867v();
                    this.f77016d = obj;
                }
            }
        }
        return (C27867v) obj;
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
        return Objects.equals(obj, CheckResUpdatePreOperationEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27867v.class.getName();
    }
}
