package i32;

import com.tencent.p014mm.autogen.events.WalletReceiveLuckyMoneyAppMsgEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: i32.i */
public enum C33200i implements C38174i<C76283h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90094d;

    public Object get() {
        Object obj = this.f90094d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90094d;
                if (obj == obj2) {
                    obj = new C76283h();
                    this.f90094d = obj;
                }
            }
        }
        return (C76283h) obj;
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
        return Objects.equals(obj, WalletReceiveLuckyMoneyAppMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76283h.class.getName();
    }
}
