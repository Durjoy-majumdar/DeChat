package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.feature.performance.b0 */
public enum C28917b0 implements C38174i<C28916a0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79341d;

    /* renamed from: com.tencent.mm.feature.performance.b0$a */
    public static final class C28918a {

        /* renamed from: a */
        public static final List<Object> f79342a = null;

        static {
            f79342a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79341d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79341d;
                if (obj == obj2) {
                    obj = new C28916a0();
                    this.f79341d = obj;
                }
            }
        }
        return (C28916a0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28918a.f79342a;
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
        return "provider " + C28916a0.class.getName();
    }
}
