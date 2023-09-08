package com.tencent.p014mm.modelavatar;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.modelavatar.v */
public enum C29002v implements C38174i<C68102u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79506d;

    /* renamed from: com.tencent.mm.modelavatar.v$a */
    public static final class C29003a {

        /* renamed from: a */
        public static final List<Object> f79507a = null;

        static {
            f79507a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79506d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79506d;
                if (obj == obj2) {
                    obj = new C68102u();
                    this.f79506d = obj;
                }
            }
        }
        return (C68102u) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29003a.f79507a;
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
        return "provider " + C68102u.class.getName();
    }
}
