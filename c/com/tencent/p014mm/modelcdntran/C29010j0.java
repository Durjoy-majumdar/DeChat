package com.tencent.p014mm.modelcdntran;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.modelcdntran.j0 */
public enum C29010j0 implements C38174i<C92779i0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79515d;

    /* renamed from: com.tencent.mm.modelcdntran.j0$a */
    public static final class C29011a {

        /* renamed from: a */
        public static final List<Object> f79516a = null;

        static {
            f79516a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79515d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79515d;
                if (obj == obj2) {
                    obj = new C92779i0();
                    this.f79515d = obj;
                }
            }
        }
        return (C92779i0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29011a.f79516a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C92779i0.class.getName();
    }
}
