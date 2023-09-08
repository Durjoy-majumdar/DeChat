package com.tencent.p014mm.plugin.p316ai.data.business.trigger;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.i */
public enum C29085i implements C38174i<C29084h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79652d;

    /* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.i$a */
    public static final class C29086a {

        /* renamed from: a */
        public static final List<Object> f79653a = null;

        static {
            f79653a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f79652d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79652d;
                if (obj == obj2) {
                    obj = new C29084h();
                    this.f79652d = obj;
                }
            }
        }
        return (C29084h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C29086a.f79653a;
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
        return "provider " + C29084h.class.getName();
    }
}
