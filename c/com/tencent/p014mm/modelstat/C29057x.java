package com.tencent.p014mm.modelstat;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.modelstat.x */
public enum C29057x implements C38174i<C29048w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79604d;

    /* renamed from: com.tencent.mm.modelstat.x$a */
    public static final class C29058a {

        /* renamed from: a */
        public static final List<Object> f79605a = null;

        static {
            f79605a = Arrays.asList(new Object[]{C85597u.class});
        }
    }

    /* renamed from: com.tencent.mm.modelstat.x$b */
    public static final class C29059b {

        /* renamed from: a */
        public static final List<Object> f79606a = null;

        static {
            f79606a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79604d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79604d;
                if (obj == obj2) {
                    obj = new C29048w();
                    this.f79604d = obj;
                }
            }
        }
        return (C29048w) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29059b.f79606a;
        }
        if ("dependencies".equals(str)) {
            return C29058a.f79605a;
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
        return "provider " + C29048w.class.getName();
    }
}
