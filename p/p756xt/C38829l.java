package p756xt;

import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xt.l */
public enum C38829l implements C38174i<C38828k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104693d;

    public Object get() {
        Object obj = this.f104693d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104693d;
                if (obj == obj2) {
                    obj = new C38828k();
                    this.f104693d = obj;
                }
            }
        }
        return (C38828k) obj;
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
        return Objects.equals(obj, RevokeMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38828k.class.getName();
    }
}
