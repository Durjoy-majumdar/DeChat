package com.tencent.p014mm.booter.notification;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.booter.notification.e */
public enum C28873e implements C38174i<C28872d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79271d;

    /* renamed from: com.tencent.mm.booter.notification.e$a */
    public static final class C28874a {

        /* renamed from: a */
        public static final List<Object> f79272a = null;

        static {
            f79272a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f79271d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79271d;
                if (obj == obj2) {
                    obj = new C28872d();
                    this.f79271d = obj;
                }
            }
        }
        return (C28872d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28874a.f79272a;
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
        return "provider " + C28872d.class.getName();
    }
}
