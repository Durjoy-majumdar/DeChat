package ha3;

import com.tencent.p014mm.autogen.events.ScanQrcodeExtDeviceLoginEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ha3.e */
public enum C32756e implements C38174i<C32755d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89156d;

    public Object get() {
        Object obj = this.f89156d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89156d;
                if (obj == obj2) {
                    obj = new C32755d();
                    this.f89156d = obj;
                }
            }
        }
        return (C32755d) obj;
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
        return Objects.equals(obj, ScanQrcodeExtDeviceLoginEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32755d.class.getName();
    }
}
