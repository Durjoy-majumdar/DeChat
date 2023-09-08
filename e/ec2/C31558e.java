package ec2;

import com.tencent.p014mm.autogen.events.LbsVerifyMessageCreateFromVoiceEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ec2.e */
public enum C31558e implements C38174i<C75605d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84355d;

    public Object get() {
        Object obj = this.f84355d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84355d;
                if (obj == obj2) {
                    obj = new C75605d();
                    this.f84355d = obj;
                }
            }
        }
        return (C75605d) obj;
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
        return Objects.equals(obj, LbsVerifyMessageCreateFromVoiceEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75605d.class.getName();
    }
}
