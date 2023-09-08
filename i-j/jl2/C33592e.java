package jl2;

import com.tencent.p014mm.autogen.events.DecodeQRCodeInImageSyncEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jl2.e */
public enum C33592e implements C38174i<C98949d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90919d;

    public Object get() {
        Object obj = this.f90919d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90919d;
                if (obj == obj2) {
                    obj = new C98949d();
                    this.f90919d = obj;
                }
            }
        }
        return (C98949d) obj;
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
        return Objects.equals(obj, DecodeQRCodeInImageSyncEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C98949d.class.getName();
    }
}
