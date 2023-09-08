package ec2;

import com.tencent.p014mm.autogen.events.MyLifeAroundPreloadEvent;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ec2.g */
public enum C31560g implements C38174i<C31559f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84358d;

    public Object get() {
        Object obj = this.f84358d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84358d;
                if (obj == obj2) {
                    obj = new C31559f();
                    this.f84358d = obj;
                }
            }
        }
        return (C31559f) obj;
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
        return Objects.equals(obj, MyLifeAroundPreloadEvent.class) || Objects.equals(obj, PostSyncTaskEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31559f.class.getName();
    }
}
