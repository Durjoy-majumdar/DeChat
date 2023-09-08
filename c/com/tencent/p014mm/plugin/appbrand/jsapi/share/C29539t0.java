package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.message.OnAppBrandAppMessageRetransmitEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.t0 */
public enum C29539t0 implements C38174i<C82990s0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80436d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.t0$a */
    public static final class C29540a {

        /* renamed from: a */
        public static final List<Object> f80437a = null;

        static {
            f80437a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80436d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80436d;
                if (obj == obj2) {
                    obj = new C82990s0();
                    this.f80436d = obj;
                }
            }
        }
        return (C82990s0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29540a.f80437a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, OnAppBrandAppMessageRetransmitEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C82990s0.class.getName();
    }
}
