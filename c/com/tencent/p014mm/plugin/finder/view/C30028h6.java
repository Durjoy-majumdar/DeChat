package com.tencent.p014mm.plugin.finder.view;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.finder.view.h6 */
public enum C30028h6 implements C38174i<C56664y5> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81270d;

    public Object get() {
        Object obj = this.f81270d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81270d;
                if (obj == obj2) {
                    obj = new C56664y5();
                    this.f81270d = obj;
                }
            }
        }
        return (C56664y5) obj;
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
        return "provider " + C56664y5.class.getName();
    }
}
