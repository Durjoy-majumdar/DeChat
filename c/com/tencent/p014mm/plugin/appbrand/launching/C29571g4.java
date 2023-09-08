package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.g4 */
public enum C29571g4 implements C38174i<C83322f4> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80491d;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.g4$a */
    public static final class C29572a {

        /* renamed from: a */
        public static final List<Object> f80492a = null;

        static {
            f80492a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80491d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80491d;
                if (obj == obj2) {
                    obj = new C83322f4();
                    this.f80491d = obj;
                }
            }
        }
        return (C83322f4) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29572a.f80492a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, StartAppBrandUIFromOuterEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C83322f4.class.getName();
    }
}
