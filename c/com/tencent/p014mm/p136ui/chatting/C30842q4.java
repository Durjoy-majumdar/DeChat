package com.tencent.p014mm.p136ui.chatting;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.ui.chatting.q4 */
public enum C30842q4 implements C38174i<C30841p4> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82860d;

    public Object get() {
        Object obj = this.f82860d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82860d;
                if (obj == obj2) {
                    obj = new C30841p4();
                    this.f82860d = obj;
                }
            }
        }
        return (C30841p4) obj;
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
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C30841p4.class.getName();
    }
}
