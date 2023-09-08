package ha3;

import com.tencent.p014mm.autogen.events.ScanQrcodeKidsWatchLoginEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ha3.g */
public enum C32758g implements C38174i<C32757f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89159d;

    public Object get() {
        Object obj = this.f89159d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89159d;
                if (obj == obj2) {
                    obj = new C32757f();
                    this.f89159d = obj;
                }
            }
        }
        return (C32757f) obj;
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
        return Objects.equals(obj, ScanQrcodeKidsWatchLoginEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32757f.class.getName();
    }
}
