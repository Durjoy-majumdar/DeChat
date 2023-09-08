package com.tencent.p014mm.plugin.zero;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.zero.q */
public enum C30645q implements C38174i<C115861p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82481d;

    /* renamed from: com.tencent.mm.plugin.zero.q$a */
    public static final class C30646a {

        /* renamed from: a */
        public static final List<Object> f82482a = null;

        static {
            f82482a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82481d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82481d;
                if (obj == obj2) {
                    obj = new C115861p();
                    this.f82481d = obj;
                }
            }
        }
        return (C115861p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30646a.f82482a;
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
        return "provider " + C115861p.class.getName();
    }
}
