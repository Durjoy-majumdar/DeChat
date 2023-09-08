package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import ei3.C31607a;
import f81.C7998c;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.feature.performance.d0 */
public enum C28921d0 implements C38174i<C28920c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79348d;

    /* renamed from: com.tencent.mm.feature.performance.d0$a */
    public static final class C28922a {

        /* renamed from: a */
        public static final List<Object> f79349a = null;

        static {
            f79349a = Arrays.asList(new Object[]{C85597u.class, C7998c.class});
        }
    }

    /* renamed from: com.tencent.mm.feature.performance.d0$b */
    public static final class C28923b {

        /* renamed from: a */
        public static final List<Object> f79350a = null;

        static {
            f79350a = Arrays.asList(new Object[]{C80625v0.MATCH_NOT_PLAIN_NOT_ISOLATED_PROCESSES});
        }
    }

    public Object get() {
        Object obj = this.f79348d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79348d;
                if (obj == obj2) {
                    obj = new C28920c0();
                    this.f79348d = obj;
                }
            }
        }
        return (C28920c0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28923b.f79350a;
        }
        if ("dependencies".equals(str)) {
            return C28922a.f79349a;
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
        return "provider " + C28920c0.class.getName();
    }
}
