package hd3;

import com.tencent.p014mm.autogen.events.FinderSendMsgEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hd3.l */
public enum C32861l implements C38174i<C8509k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89356d;

    public Object get() {
        Object obj = this.f89356d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89356d;
                if (obj == obj2) {
                    obj = new C8509k();
                    this.f89356d = obj;
                }
            }
        }
        return (C8509k) obj;
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
        return Objects.equals(obj, FinderSendMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C8509k.class.getName();
    }
}
