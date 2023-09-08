package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.wx_extension.C1262l;
import ei3.C31607a;
import f81.C7998c;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.w */
public enum C29169w implements C38174i<C81180q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79794d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.w$a */
    public static final class C29170a {

        /* renamed from: a */
        public static final List<Object> f79795a = null;

        static {
            f79795a = Arrays.asList(new Object[]{C7998c.class, C1262l.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.w$b */
    public static final class C29171b {

        /* renamed from: a */
        public static final List<Object> f79796a = null;

        static {
            f79796a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI, C80625v0.MATCH_SUPPORT});
        }
    }

    public Object get() {
        Object obj = this.f79794d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79794d;
                if (obj == obj2) {
                    obj = new C81180q();
                    this.f79794d = obj;
                }
            }
        }
        return (C81180q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29171b.f79796a;
        }
        if ("dependencies".equals(str)) {
            return C29170a.f79795a;
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
        return "provider " + C81180q.class.getName();
    }
}
