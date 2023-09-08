package j43;

import com.tencent.p014mm.autogen.events.VoipCSNotifyEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: j43.f */
public enum C33513f implements C38174i<C98904e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90741d;

    public Object get() {
        Object obj = this.f90741d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90741d;
                if (obj == obj2) {
                    obj = new C98904e();
                    this.f90741d = obj;
                }
            }
        }
        return (C98904e) obj;
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
        return Objects.equals(obj, VoipCSNotifyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C98904e.class.getName();
    }
}
