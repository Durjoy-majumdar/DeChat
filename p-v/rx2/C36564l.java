package rx2;

import com.tencent.p014mm.autogen.events.TalkRoomeStatusBarHideEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rx2.l */
public enum C36564l implements C38174i<C36563k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97248d;

    public Object get() {
        Object obj = this.f97248d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97248d;
                if (obj == obj2) {
                    obj = new C36563k();
                    this.f97248d = obj;
                }
            }
        }
        return (C36563k) obj;
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
        return Objects.equals(obj, TalkRoomeStatusBarHideEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36563k.class.getName();
    }
}
