package com.tencent.p014mm.plugin.comm;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.comm.i */
public enum C29830i implements C38174i<C29829h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80854d;

    /* renamed from: com.tencent.mm.plugin.comm.i$a */
    public static final class C29831a {

        /* renamed from: a */
        public static final List<Object> f80855a = null;

        static {
            f80855a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f80854d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80854d;
                if (obj == obj2) {
                    obj = new C29829h();
                    this.f80854d = obj;
                }
            }
        }
        return (C29829h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29831a.f80855a;
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
        return "provider " + C29829h.class.getName();
    }
}
