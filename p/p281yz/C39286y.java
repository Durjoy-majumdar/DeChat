package p281yz;

import com.tencent.p014mm.autogen.events.WalletQueryHbStatusEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yz.y */
public enum C39286y implements C38174i<C79181x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105642d;

    public Object get() {
        Object obj = this.f105642d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105642d;
                if (obj == obj2) {
                    obj = new C79181x();
                    this.f105642d = obj;
                }
            }
        }
        return (C79181x) obj;
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
        return Objects.equals(obj, WalletQueryHbStatusEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C79181x.class.getName();
    }
}
