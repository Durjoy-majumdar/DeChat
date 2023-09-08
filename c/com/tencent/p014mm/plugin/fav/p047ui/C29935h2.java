package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.fav.ui.h2 */
public enum C29935h2 implements C38174i<C93605g2> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81081d;

    /* renamed from: com.tencent.mm.plugin.fav.ui.h2$a */
    public static final class C29936a {

        /* renamed from: a */
        public static final List<Object> f81082a = null;

        static {
            f81082a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81081d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81081d;
                if (obj == obj2) {
                    obj = new C93605g2();
                    this.f81081d = obj;
                }
            }
        }
        return (C93605g2) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29936a.f81082a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C93605g2.class.getName();
    }
}
