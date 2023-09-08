package com.tencent.p014mm.plugin.appbrand.debugger;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.r */
public enum C29489r implements C38174i<C81741q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80349d;

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.r$a */
    public static final class C29490a {

        /* renamed from: a */
        public static final List<Object> f80350a = null;

        static {
            f80350a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80349d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80349d;
                if (obj == obj2) {
                    obj = new C81741q();
                    this.f80349d = obj;
                }
            }
        }
        return (C81741q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29490a.f80350a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "DebugAppCodeUpdated");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C81741q.class.getName();
    }
}
