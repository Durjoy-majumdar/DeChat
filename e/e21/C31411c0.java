package e21;

import com.tencent.p014mm.autogen.events.CollectRcvVoiceEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: e21.c0 */
public enum C31411c0 implements C38174i<C116660y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84079d;

    public Object get() {
        Object obj = this.f84079d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84079d;
                if (obj == obj2) {
                    obj = new C116660y();
                    this.f84079d = obj;
                }
            }
        }
        return (C116660y) obj;
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
        return Objects.equals(obj, CollectRcvVoiceEvent.class) || Objects.equals(obj, 1384) || Objects.equals(obj, 1317);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C116660y.class.getName();
    }
}
