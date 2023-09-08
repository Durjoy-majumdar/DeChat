package hd3;

import com.tencent.p014mm.autogen.events.AppBrandSendAppMsgEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hd3.b */
public enum C32852b implements C38174i<C87483a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89335d;

    public Object get() {
        Object obj = this.f89335d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89335d;
                if (obj == obj2) {
                    obj = new C87483a();
                    this.f89335d = obj;
                }
            }
        }
        return (C87483a) obj;
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
        return Objects.equals(obj, AppBrandSendAppMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C87483a.class.getName();
    }
}
