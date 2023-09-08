package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.exdevice.model.t1 */
public enum C29887t1 implements C38174i<C41166r1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80971d;

    /* renamed from: com.tencent.mm.plugin.exdevice.model.t1$a */
    public static final class C29888a {

        /* renamed from: a */
        public static final List<Object> f80972a = null;

        static {
            f80972a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80971d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80971d;
                if (obj == obj2) {
                    obj = new C41166r1();
                    this.f80971d = obj;
                }
            }
        }
        return (C41166r1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29888a.f80972a;
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
        return "provider " + C41166r1.class.getName();
    }
}
