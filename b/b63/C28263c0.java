package b63;

import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: b63.c0 */
public enum C28263c0 implements C38174i<C28262b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77829d;

    public Object get() {
        Object obj = this.f77829d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77829d;
                if (obj == obj2) {
                    obj = new C28262b0();
                    this.f77829d = obj;
                }
            }
        }
        return (C28262b0) obj;
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
        return Objects.equals(obj, WalletGetBulletinEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28262b0.class.getName();
    }
}
