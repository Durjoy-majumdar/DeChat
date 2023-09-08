package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.pluginsdk.model.app.c0 */
public enum C30657c0 implements C38174i<C30656b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82510d;

    /* renamed from: com.tencent.mm.pluginsdk.model.app.c0$a */
    public static final class C30658a {

        /* renamed from: a */
        public static final List<Object> f82511a = null;

        static {
            f82511a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82510d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82510d;
                if (obj == obj2) {
                    obj = new C30656b0();
                    this.f82510d = obj;
                }
            }
        }
        return (C30656b0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30658a.f82511a;
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
        return "provider " + C30656b0.class.getName();
    }
}
