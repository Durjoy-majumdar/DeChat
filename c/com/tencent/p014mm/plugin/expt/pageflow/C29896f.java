package com.tencent.p014mm.plugin.expt.pageflow;

import ei3.C31607a;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.expt.pageflow.f */
public enum C29896f implements C38174i<MMPageFlowService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80987d;

    public Object get() {
        Object obj = this.f80987d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80987d;
                if (obj == obj2) {
                    obj = new MMPageFlowService();
                    this.f80987d = obj;
                }
            }
        }
        return (MMPageFlowService) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + MMPageFlowService.class.getName();
    }
}
