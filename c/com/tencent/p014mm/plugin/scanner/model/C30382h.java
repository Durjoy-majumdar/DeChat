package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.autogen.events.CancelDealQBarStrEvent;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.ReleaseDealQBarStrEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.scanner.model.h */
public enum C30382h implements C38174i<ExternRequestDealQBarStrHandler> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81978d;

    public Object get() {
        Object obj = this.f81978d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81978d;
                if (obj == obj2) {
                    obj = new ExternRequestDealQBarStrHandler();
                    this.f81978d = obj;
                }
            }
        }
        return (ExternRequestDealQBarStrHandler) obj;
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
        return Objects.equals(obj, DealQBarStrEvent.class) || Objects.equals(obj, CancelDealQBarStrEvent.class) || Objects.equals(obj, ReleaseDealQBarStrEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + ExternRequestDealQBarStrHandler.class.getName();
    }
}
