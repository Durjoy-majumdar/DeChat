package on3;

import com.tencent.p014mm.autogen.events.RevokeNativeMsgEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: on3.l */
public enum C35238l implements C38174i<C35237k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94449d;

    public Object get() {
        Object obj = this.f94449d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94449d;
                if (obj == obj2) {
                    obj = new C35237k();
                    this.f94449d = obj;
                }
            }
        }
        return (C35237k) obj;
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
        return Objects.equals(obj, RevokeNativeMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35237k.class.getName();
    }
}
