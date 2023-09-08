package mb1;

import com.tencent.p014mm.autogen.events.RequestFaceVerifyForPayEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: mb1.g */
public enum C34541g implements C38174i<C10775f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92923d;

    public Object get() {
        Object obj = this.f92923d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92923d;
                if (obj == obj2) {
                    obj = new C10775f();
                    this.f92923d = obj;
                }
            }
        }
        return (C10775f) obj;
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
        return Objects.equals(obj, RequestFaceVerifyForPayEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10775f.class.getName();
    }
}
