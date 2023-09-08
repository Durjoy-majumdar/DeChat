package com.tencent.p014mm.plugin.scanner;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.scanner.a0 */
public enum C30370a0 implements C38174i<C71030z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81944d;

    /* renamed from: com.tencent.mm.plugin.scanner.a0$a */
    public static final class C30371a {

        /* renamed from: a */
        public static final List<Object> f81945a = null;

        static {
            f81945a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81944d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81944d;
                if (obj == obj2) {
                    obj = new C71030z();
                    this.f81944d = obj;
                }
            }
        }
        return (C71030z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30371a.f81945a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C71030z.class.getName();
    }
}
