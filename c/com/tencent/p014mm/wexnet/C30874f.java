package com.tencent.p014mm.wexnet;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.wexnet.f */
public enum C30874f implements C38174i<C75244e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82909d;

    /* renamed from: com.tencent.mm.wexnet.f$a */
    public static final class C30875a {

        /* renamed from: a */
        public static final List<Object> f82910a = null;

        static {
            f82910a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82909d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82909d;
                if (obj == obj2) {
                    obj = new C75244e();
                    this.f82909d = obj;
                }
            }
        }
        return (C75244e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C30875a.f82910a;
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
        return "provider " + C75244e.class.getName();
    }
}
