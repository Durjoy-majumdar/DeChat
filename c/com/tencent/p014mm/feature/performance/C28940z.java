package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.feature.performance.z */
public enum C28940z implements C38174i<C80864q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79395d;

    /* renamed from: com.tencent.mm.feature.performance.z$a */
    public static final class C28941a {

        /* renamed from: a */
        public static final List<Object> f79396a = null;

        static {
            f79396a = Arrays.asList(new Object[]{C28920c0.class});
        }
    }

    /* renamed from: com.tencent.mm.feature.performance.z$b */
    public static final class C28942b {

        /* renamed from: a */
        public static final List<Object> f79397a = null;

        static {
            f79397a = Arrays.asList(new Object[]{C80625v0.MATCH_NOT_PLAIN_NOT_ISOLATED_PROCESSES});
        }
    }

    public Object get() {
        Object obj = this.f79395d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79395d;
                if (obj == obj2) {
                    obj = new C80864q();
                    this.f79395d = obj;
                }
            }
        }
        return (C80864q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28942b.f79397a;
        }
        if ("dependencies".equals(str)) {
            return C28941a.f79396a;
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
        return "provider " + C80864q.class.getName();
    }
}
