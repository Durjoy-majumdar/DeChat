package ww2;

import com.tencent.p014mm.autogen.events.VoiceReminderDeleteRecordMessageEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ww2.b */
public enum C38316b implements C38174i<C78733a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101140d;

    public Object get() {
        Object obj = this.f101140d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101140d;
                if (obj == obj2) {
                    obj = new C78733a();
                    this.f101140d = obj;
                }
            }
        }
        return (C78733a) obj;
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
        return Objects.equals(obj, VoiceReminderDeleteRecordMessageEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78733a.class.getName();
    }
}
