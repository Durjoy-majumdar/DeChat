package com.tencent.p014mm.app;

import com.tencent.p014mm.autogen.events.MediaLeakEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.app.q0 */
public enum C28692q0 implements C38174i<C104588p0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78688d;

    /* renamed from: com.tencent.mm.app.q0$a */
    public static final class C28693a {

        /* renamed from: a */
        public static final List<Object> f78689a = null;

        static {
            f78689a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f78688d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78688d;
                if (obj == obj2) {
                    obj = new C104588p0();
                    this.f78688d = obj;
                }
            }
        }
        return (C104588p0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28693a.f78689a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, MediaLeakEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C104588p0.class.getName();
    }
}
