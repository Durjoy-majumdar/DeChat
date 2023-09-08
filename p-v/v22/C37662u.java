package v22;

import com.tencent.p014mm.autogen.events.ResumeOrPauseTrackRoomEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: v22.u */
public enum C37662u implements C38174i<C118640t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99830d;

    public Object get() {
        Object obj = this.f99830d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99830d;
                if (obj == obj2) {
                    obj = new C118640t();
                    this.f99830d = obj;
                }
            }
        }
        return (C118640t) obj;
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
        return Objects.equals(obj, ResumeOrPauseTrackRoomEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C118640t.class.getName();
    }
}
