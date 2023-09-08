package p730vu;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vu.f */
public enum C37836f implements C38174i<C37835e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100187d;

    public Object get() {
        Object obj = this.f100187d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100187d;
                if (obj == obj2) {
                    obj = new C37835e();
                    this.f100187d = obj;
                }
            }
        }
        return (C37835e) obj;
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
        return Objects.equals(obj, PostSyncTaskEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37835e.class.getName();
    }
}
