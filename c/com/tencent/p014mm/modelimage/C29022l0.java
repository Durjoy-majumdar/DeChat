package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.modelimage.l0 */
public enum C29022l0 implements C38174i<C92837k0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79543d;

    /* renamed from: com.tencent.mm.modelimage.l0$a */
    public static final class C29023a {

        /* renamed from: a */
        public static final List<Object> f79544a = null;

        static {
            f79544a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79543d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79543d;
                if (obj == obj2) {
                    obj = new C92837k0();
                    this.f79543d = obj;
                }
            }
        }
        return (C92837k0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29023a.f79544a;
        }
        if ("dependencies".equals(str)) {
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
        return "provider " + C92837k0.class.getName();
    }
}
