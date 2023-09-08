package ww2;

import com.tencent.p014mm.autogen.events.VoiceReminderRemindEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ww2.g */
public enum C38320g implements C38174i<C78734f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101152d;

    public Object get() {
        Object obj = this.f101152d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101152d;
                if (obj == obj2) {
                    obj = new C78734f();
                    this.f101152d = obj;
                }
            }
        }
        return (C78734f) obj;
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
        return Objects.equals(obj, VoiceReminderRemindEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78734f.class.getName();
    }
}
