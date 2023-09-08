package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.j2 */
public enum C29132j2 implements C38174i<C81161g2> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79724d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.j2$a */
    public static final class C29133a {

        /* renamed from: a */
        public static final List<Object> f79725a = null;

        static {
            f79725a = Arrays.asList(new Object[]{C29122h2.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.j2$b */
    public static final class C29134b {

        /* renamed from: a */
        public static final List<Object> f79726a = null;

        static {
            f79726a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79724d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79724d;
                if (obj == obj2) {
                    obj = new C81161g2();
                    this.f79724d = obj;
                }
            }
        }
        return (C81161g2) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29134b.f79726a;
        }
        if ("dependencies".equals(str)) {
            return C29133a.f79725a;
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
        return "provider " + C81161g2.class.getName();
    }
}
