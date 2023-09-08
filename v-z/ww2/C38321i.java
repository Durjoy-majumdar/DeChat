package ww2;

import com.tencent.p014mm.autogen.events.ResendVoiceRemindMsgEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ww2.i */
public enum C38321i implements C38174i<C78735h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101155d;

    public Object get() {
        Object obj = this.f101155d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101155d;
                if (obj == obj2) {
                    obj = new C78735h();
                    this.f101155d = obj;
                }
            }
        }
        return (C78735h) obj;
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
        return Objects.equals(obj, ResendVoiceRemindMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78735h.class.getName();
    }
}
