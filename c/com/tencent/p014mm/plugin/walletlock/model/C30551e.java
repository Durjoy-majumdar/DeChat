package com.tencent.p014mm.plugin.walletlock.model;

import com.tencent.p014mm.autogen.events.StartWalletLockUIEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.walletlock.model.e */
public enum C30551e implements C38174i<C72594d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82310d;

    public Object get() {
        Object obj = this.f82310d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82310d;
                if (obj == obj2) {
                    obj = new C72594d();
                    this.f82310d = obj;
                }
            }
        }
        return (C72594d) obj;
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
        return Objects.equals(obj, StartWalletLockUIEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C72594d.class.getName();
    }
}
