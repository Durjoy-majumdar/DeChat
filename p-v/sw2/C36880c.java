package sw2;

import com.tencent.p014mm.autogen.events.ExtTranslateVoiceEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: sw2.c */
public enum C36880c implements C38174i<C77795b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97887d;

    public Object get() {
        Object obj = this.f97887d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97887d;
                if (obj == obj2) {
                    obj = new C77795b();
                    this.f97887d = obj;
                }
            }
        }
        return (C77795b) obj;
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
        return Objects.equals(obj, ExtTranslateVoiceEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77795b.class.getName();
    }
}
