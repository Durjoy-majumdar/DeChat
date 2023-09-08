package com.tencent.p014mm.plugin.multitask;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.multitask.t */
public enum C30311t implements C38174i<C105923s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81835d;

    /* renamed from: com.tencent.mm.plugin.multitask.t$a */
    public static final class C30312a {

        /* renamed from: a */
        public static final List<Object> f81836a = null;

        static {
            f81836a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f81835d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81835d;
                if (obj == obj2) {
                    obj = new C105923s();
                    this.f81835d = obj;
                }
            }
        }
        return (C105923s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30312a.f81836a;
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
        return "provider " + C105923s.class.getName();
    }
}
