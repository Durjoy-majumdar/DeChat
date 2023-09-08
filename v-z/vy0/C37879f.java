package vy0;

import com.tencent.p014mm.autogen.events.BypNotifyActionEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vy0.f */
public enum C37879f implements C38174i<C37878e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100264d;

    public Object get() {
        Object obj = this.f100264d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100264d;
                if (obj == obj2) {
                    obj = new C37878e();
                    this.f100264d = obj;
                }
            }
        }
        return (C37878e) obj;
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
        return Objects.equals(obj, BypNotifyActionEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37878e.class.getName();
    }
}
