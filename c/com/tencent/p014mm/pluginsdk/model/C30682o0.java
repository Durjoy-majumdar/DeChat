package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.pluginsdk.model.o0 */
public enum C30682o0 implements C38174i<C96788n0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82568d;

    /* renamed from: com.tencent.mm.pluginsdk.model.o0$a */
    public static final class C30683a {

        /* renamed from: a */
        public static final List<Object> f82569a = null;

        static {
            f82569a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f82568d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82568d;
                if (obj == obj2) {
                    obj = new C96788n0();
                    this.f82568d = obj;
                }
            }
        }
        return (C96788n0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30683a.f82569a;
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
        return "provider " + C96788n0.class.getName();
    }
}
