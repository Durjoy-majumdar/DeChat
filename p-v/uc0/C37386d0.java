package uc0;

import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: uc0.d0 */
public enum C37386d0 implements C38174i<C14148c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98835d;

    public Object get() {
        Object obj = this.f98835d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98835d;
                if (obj == obj2) {
                    obj = new C14148c0();
                    this.f98835d = obj;
                }
            }
        }
        return (C14148c0) obj;
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
        return "provider " + C14148c0.class.getName();
    }
}
