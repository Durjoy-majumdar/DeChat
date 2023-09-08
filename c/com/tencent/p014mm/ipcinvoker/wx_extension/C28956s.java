package com.tencent.p014mm.ipcinvoker.wx_extension;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.s */
public enum C28956s implements C38174i<C1266r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79426d;

    /* renamed from: com.tencent.mm.ipcinvoker.wx_extension.s$a */
    public static final class C28957a {

        /* renamed from: a */
        public static final List<Object> f79427a = null;

        static {
            f79427a = Arrays.asList(new Object[]{C80625v0.MATCH_NOT_PLAIN_PROCESSES});
        }
    }

    public Object get() {
        Object obj = this.f79426d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79426d;
                if (obj == obj2) {
                    obj = new C1266r();
                    this.f79426d = obj;
                }
            }
        }
        return (C1266r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28957a.f79427a;
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
        return "provider " + C1266r.class.getName();
    }
}
