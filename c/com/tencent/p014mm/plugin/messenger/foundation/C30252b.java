package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.b */
public enum C30252b implements C38174i<C30251a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81726d;

    /* renamed from: com.tencent.mm.plugin.messenger.foundation.b$a */
    public static final class C30253a {

        /* renamed from: a */
        public static final List<Object> f81727a = null;

        static {
            f81727a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81726d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81726d;
                if (obj == obj2) {
                    obj = new C30251a();
                    this.f81726d = obj;
                }
            }
        }
        return (C30251a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30253a.f81727a;
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
        return "provider " + C30251a.class.getName();
    }
}
