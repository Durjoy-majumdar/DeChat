package com.tencent.p014mm.plugin.websearch;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.websearch.s */
public enum C30565s implements C38174i<C30562r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82340d;

    /* renamed from: com.tencent.mm.plugin.websearch.s$a */
    public static final class C30566a {

        /* renamed from: a */
        public static final List<Object> f82341a = null;

        static {
            f82341a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82340d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82340d;
                if (obj == obj2) {
                    obj = new C30562r();
                    this.f82340d = obj;
                }
            }
        }
        return (C30562r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30566a.f82341a;
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
        return "provider " + C30562r.class.getName();
    }
}
