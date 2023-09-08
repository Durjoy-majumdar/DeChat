package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.d0 */
public enum C29498d0 implements C38174i<C68613c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80368d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.d0$a */
    public static final class C29499a {

        /* renamed from: a */
        public static final List<Object> f80369a = null;

        static {
            f80369a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80368d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80368d;
                if (obj == obj2) {
                    obj = new C68613c0();
                    this.f80368d = obj;
                }
            }
        }
        return (C68613c0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29499a.f80369a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CheckResUpdateCacheFileEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C68613c0.class.getName();
    }
}
