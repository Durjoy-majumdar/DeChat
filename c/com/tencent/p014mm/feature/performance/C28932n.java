package com.tencent.p014mm.feature.performance;

import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;
import p448ax.C28153b;

/* renamed from: com.tencent.mm.feature.performance.n */
public enum C28932n implements C38174i<C80862m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79377d;

    /* renamed from: com.tencent.mm.feature.performance.n$a */
    public static final class C28933a {

        /* renamed from: a */
        public static final List<Object> f79378a = null;

        static {
            f79378a = Arrays.asList(new Object[]{C28153b.class});
        }
    }

    public Object get() {
        Object obj = this.f79377d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79377d;
                if (obj == obj2) {
                    obj = new C80862m();
                    this.f79377d = obj;
                }
            }
        }
        return (C80862m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C28933a.f79378a;
        }
        if ("onProcess".equals(str)) {
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
        return "provider " + C80862m.class.getName();
    }
}
