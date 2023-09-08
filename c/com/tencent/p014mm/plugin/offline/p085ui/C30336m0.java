package com.tencent.p014mm.plugin.offline.p085ui;

import com.tencent.p014mm.autogen.events.SyncOfflineTokenEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.offline.ui.m0 */
public enum C30336m0 implements C38174i<C30335l0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81881d;

    public Object get() {
        Object obj = this.f81881d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81881d;
                if (obj == obj2) {
                    obj = new C30335l0();
                    this.f81881d = obj;
                }
            }
        }
        return (C30335l0) obj;
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
        return Objects.equals(obj, SyncOfflineTokenEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C30335l0.class.getName();
    }
}
