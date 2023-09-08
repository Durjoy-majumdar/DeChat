package com.tencent.p014mm.plugin.biz;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.biz.b */
public enum C29708b implements C38174i<C68761a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80693d;

    /* renamed from: com.tencent.mm.plugin.biz.b$a */
    public static final class C29709a {

        /* renamed from: a */
        public static final List<Object> f80694a = null;

        static {
            f80694a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80693d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80693d;
                if (obj == obj2) {
                    obj = new C68761a();
                    this.f80693d = obj;
                }
            }
        }
        return (C68761a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29709a.f80694a;
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
        return "provider " + C68761a.class.getName();
    }
}
