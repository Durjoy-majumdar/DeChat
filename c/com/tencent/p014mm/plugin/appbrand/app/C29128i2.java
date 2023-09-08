package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.i2 */
public enum C29128i2 implements C38174i<C29122h2> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79715d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.i2$a */
    public static final class C29129a {

        /* renamed from: a */
        public static final List<Object> f79716a = null;

        static {
            f79716a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79715d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79715d;
                if (obj == obj2) {
                    obj = new C29122h2();
                    this.f79715d = obj;
                }
            }
        }
        return (C29122h2) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29129a.f79716a;
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
        return "provider " + C29122h2.class.getName();
    }
}
