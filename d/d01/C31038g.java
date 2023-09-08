package d01;

import com.tencent.p014mm.autogen.events.ScanQrcodeLiveScreenCastAuthorizationEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: d01.g */
public enum C31038g implements C38174i<C58009f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83272d;

    public Object get() {
        Object obj = this.f83272d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83272d;
                if (obj == obj2) {
                    obj = new C58009f();
                    this.f83272d = obj;
                }
            }
        }
        return (C58009f) obj;
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
        return Objects.equals(obj, ScanQrcodeLiveScreenCastAuthorizationEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C58009f.class.getName();
    }
}
