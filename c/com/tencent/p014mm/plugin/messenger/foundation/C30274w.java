package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.w */
public enum C30274w implements C38174i<C30273v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81772d;

    /* renamed from: com.tencent.mm.plugin.messenger.foundation.w$a */
    public static final class C30275a {

        /* renamed from: a */
        public static final List<Object> f81773a = null;

        static {
            f81773a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81772d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81772d;
                if (obj == obj2) {
                    obj = new C30273v();
                    this.f81772d = obj;
                }
            }
        }
        return (C30273v) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30275a.f81773a;
        }
        if ("dependencies".equals(str)) {
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
        return "provider " + C30273v.class.getName();
    }
}
