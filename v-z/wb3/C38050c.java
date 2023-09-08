package wb3;

import com.tencent.p014mm.autogen.events.OnSoterInitializedEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wb3.c */
public enum C38050c implements C38174i<C78522b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100591d;

    public Object get() {
        Object obj = this.f100591d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100591d;
                if (obj == obj2) {
                    obj = new C78522b();
                    this.f100591d = obj;
                }
            }
        }
        return (C78522b) obj;
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
        return Objects.equals(obj, OnSoterInitializedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78522b.class.getName();
    }
}
