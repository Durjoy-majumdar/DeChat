package com.tencent.p014mm.plugin.fts.logic;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.fts.logic.i */
public enum C30054i implements C38174i<C93929h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81313d;

    /* renamed from: com.tencent.mm.plugin.fts.logic.i$a */
    public static final class C30055a {

        /* renamed from: a */
        public static final List<Object> f81314a = null;

        static {
            f81314a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81313d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81313d;
                if (obj == obj2) {
                    obj = new C93929h();
                    this.f81313d = obj;
                }
            }
        }
        return (C93929h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30055a.f81314a;
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
        return "provider " + C93929h.class.getName();
    }
}
