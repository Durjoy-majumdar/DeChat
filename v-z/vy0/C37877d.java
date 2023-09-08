package vy0;

import com.tencent.p014mm.autogen.events.BypNotifyEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vy0.d */
public enum C37877d implements C38174i<C37876c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100260d;

    public Object get() {
        Object obj = this.f100260d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100260d;
                if (obj == obj2) {
                    obj = new C37876c();
                    this.f100260d = obj;
                }
            }
        }
        return (C37876c) obj;
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
        return Objects.equals(obj, BypNotifyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37876c.class.getName();
    }
}
