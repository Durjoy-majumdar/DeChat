package com.tencent.p014mm.plugin.normsg;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import jc3.C87948i;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.normsg.d */
public enum C30319d implements C38174i<C115632c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81851d;

    /* renamed from: com.tencent.mm.plugin.normsg.d$a */
    public static final class C30320a {

        /* renamed from: a */
        public static final List<Object> f81852a = null;

        static {
            f81852a = Arrays.asList(new Object[]{C87948i.class});
        }
    }

    /* renamed from: com.tencent.mm.plugin.normsg.d$b */
    public static final class C30321b {

        /* renamed from: a */
        public static final List<Object> f81853a = null;

        static {
            f81853a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI});
        }
    }

    public Object get() {
        Object obj = this.f81851d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81851d;
                if (obj == obj2) {
                    obj = new C115632c();
                    this.f81851d = obj;
                }
            }
        }
        return (C115632c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C30320a.f81852a;
        }
        if ("onProcess".equals(str)) {
            return C30321b.f81853a;
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
        return "provider " + C115632c.class.getName();
    }
}
