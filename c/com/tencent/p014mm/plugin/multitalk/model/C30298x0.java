package com.tencent.p014mm.plugin.multitalk.model;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.multitalk.model.x0 */
public enum C30298x0 implements C38174i<C105851w0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81811d;

    /* renamed from: com.tencent.mm.plugin.multitalk.model.x0$a */
    public static final class C30299a {

        /* renamed from: a */
        public static final List<Object> f81812a = null;

        static {
            f81812a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81811d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81811d;
                if (obj == obj2) {
                    obj = new C105851w0();
                    this.f81811d = obj;
                }
            }
        }
        return (C105851w0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30299a.f81812a;
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
        return "provider " + C105851w0.class.getName();
    }
}
