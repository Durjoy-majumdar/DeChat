package com.tencent.p014mm.model.newabtest;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.model.newabtest.f */
public enum C28991f implements C38174i<C28984e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79488d;

    /* renamed from: com.tencent.mm.model.newabtest.f$a */
    public static final class C28992a {

        /* renamed from: a */
        public static final List<Object> f79489a = null;

        static {
            f79489a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f79488d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79488d;
                if (obj == obj2) {
                    obj = new C28984e();
                    this.f79488d = obj;
                }
            }
        }
        return (C28984e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28992a.f79489a;
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
        return "provider " + C28984e.class.getName();
    }
}
