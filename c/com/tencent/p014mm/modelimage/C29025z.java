package com.tencent.p014mm.modelimage;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.modelimage.z */
public enum C29025z implements C38174i<C92857y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79550d;

    /* renamed from: com.tencent.mm.modelimage.z$a */
    public static final class C29026a {

        /* renamed from: a */
        public static final List<Object> f79551a = null;

        static {
            f79551a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79550d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79550d;
                if (obj == obj2) {
                    obj = new C92857y();
                    this.f79550d = obj;
                }
            }
        }
        return (C92857y) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29026a.f79551a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "local_cdn_img_cache");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C92857y.class.getName();
    }
}
