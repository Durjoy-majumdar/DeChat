package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.u */
public enum C30271u implements C38174i<C69843t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81767d;

    /* renamed from: com.tencent.mm.plugin.messenger.foundation.u$a */
    public static final class C30272a {

        /* renamed from: a */
        public static final List<Object> f81768a = null;

        static {
            f81768a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81767d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81767d;
                if (obj == obj2) {
                    obj = new C69843t();
                    this.f81767d = obj;
                }
            }
        }
        return (C69843t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30272a.f81768a;
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
        return "provider " + C69843t.class.getName();
    }
}
