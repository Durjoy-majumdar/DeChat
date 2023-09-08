package p281yz;

import com.tencent.p014mm.autogen.events.RequestEnterWalletEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yz.m */
public enum C39259m implements C38174i<C16083l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105619d;

    public Object get() {
        Object obj = this.f105619d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105619d;
                if (obj == obj2) {
                    obj = new C16083l();
                    this.f105619d = obj;
                }
            }
        }
        return (C16083l) obj;
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
        return Objects.equals(obj, RequestEnterWalletEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C16083l.class.getName();
    }
}
