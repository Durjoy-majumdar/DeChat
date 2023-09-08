package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.modelsimple.i */
public enum C29032i implements C38174i<C29031h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79565d;

    /* renamed from: com.tencent.mm.modelsimple.i$a */
    public static final class C29033a {

        /* renamed from: a */
        public static final List<Object> f79566a = null;

        static {
            f79566a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f79565d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79565d;
                if (obj == obj2) {
                    obj = new C29031h();
                    this.f79565d = obj;
                }
            }
        }
        return (C29031h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29033a.f79566a;
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
        return "provider " + C29031h.class.getName();
    }
}
