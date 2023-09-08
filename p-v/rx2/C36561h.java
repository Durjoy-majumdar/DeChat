package rx2;

import com.tencent.p014mm.autogen.events.TalkRoomReportMgrEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rx2.h */
public enum C36561h implements C38174i<C36560g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97242d;

    public Object get() {
        Object obj = this.f97242d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97242d;
                if (obj == obj2) {
                    obj = new C36560g();
                    this.f97242d = obj;
                }
            }
        }
        return (C36560g) obj;
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
        return Objects.equals(obj, TalkRoomReportMgrEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36560g.class.getName();
    }
}
