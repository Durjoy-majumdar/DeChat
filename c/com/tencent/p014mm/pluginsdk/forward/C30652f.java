package com.tencent.p014mm.pluginsdk.forward;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.pluginsdk.forward.f */
public enum C30652f implements C38174i<C72671b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82502d;

    /* renamed from: com.tencent.mm.pluginsdk.forward.f$a */
    public static final class C30653a {

        /* renamed from: a */
        public static final List<Object> f82503a = null;

        static {
            f82503a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f82502d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82502d;
                if (obj == obj2) {
                    obj = new C72671b();
                    this.f82502d = obj;
                }
            }
        }
        return (C72671b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30653a.f82503a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C72671b.class.getName();
    }
}
