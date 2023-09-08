package dd2;

import com.tencent.p014mm.autogen.events.ResendAllFailSnsMsgEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dd2.v */
public enum C31158v implements C38174i<C31157u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83523d;

    public Object get() {
        Object obj = this.f83523d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83523d;
                if (obj == obj2) {
                    obj = new C31157u();
                    this.f83523d = obj;
                }
            }
        }
        return (C31157u) obj;
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
        return Objects.equals(obj, ResendAllFailSnsMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31157u.class.getName();
    }
}
