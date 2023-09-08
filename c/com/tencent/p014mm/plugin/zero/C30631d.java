package com.tencent.p014mm.plugin.zero;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.zero.d */
public enum C30631d implements C38174i<C30630c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82452d;

    /* renamed from: com.tencent.mm.plugin.zero.d$a */
    public static final class C30632a {

        /* renamed from: a */
        public static final List<Object> f82453a = null;

        static {
            f82453a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82452d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82452d;
                if (obj == obj2) {
                    obj = new C30630c();
                    this.f82452d = obj;
                }
            }
        }
        return (C30630c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30632a.f82453a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C30630c.class.getName();
    }
}
