package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.h */
public enum C29369h implements C38174i<C81488g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80154d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.h$a */
    public static final class C29370a {

        /* renamed from: a */
        public static final List<Object> f80155a = null;

        static {
            f80155a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80154d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80154d;
                if (obj == obj2) {
                    obj = new C81488g();
                    this.f80154d = obj;
                }
            }
        }
        return (C81488g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29370a.f80155a;
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
        return "provider " + C81488g.class.getName();
    }
}
