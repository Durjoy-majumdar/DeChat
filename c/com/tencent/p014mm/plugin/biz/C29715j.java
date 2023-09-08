package com.tencent.p014mm.plugin.biz;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.biz.j */
public enum C29715j implements C38174i<C55579f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80710d;

    /* renamed from: com.tencent.mm.plugin.biz.j$a */
    public static final class C29716a {

        /* renamed from: a */
        public static final List<Object> f80711a = null;

        static {
            f80711a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f80710d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80710d;
                if (obj == obj2) {
                    obj = new C55579f();
                    this.f80710d = obj;
                }
            }
        }
        return (C55579f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29716a.f80711a;
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
        return "provider " + C55579f.class.getName();
    }
}
