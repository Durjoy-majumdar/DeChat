package com.tencent.p014mm.plugin.magicbrush;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.magicbrush.u0 */
public enum C30232u0 implements C38174i<C85283t0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81691d;

    /* renamed from: com.tencent.mm.plugin.magicbrush.u0$a */
    public static final class C30233a {

        /* renamed from: a */
        public static final List<Object> f81692a = null;

        static {
            f81692a = Arrays.asList(new Object[]{C30211n0.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.u0$b */
    public static final class C30234b {

        /* renamed from: a */
        public static final List<Object> f81693a = null;

        static {
            f81693a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1});
        }
    }

    public Object get() {
        Object obj = this.f81691d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81691d;
                if (obj == obj2) {
                    obj = new C85283t0();
                    this.f81691d = obj;
                }
            }
        }
        return (C85283t0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C30233a.f81692a;
        }
        if ("onProcess".equals(str)) {
            return C30234b.f81693a;
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
        return "provider " + C85283t0.class.getName();
    }
}
