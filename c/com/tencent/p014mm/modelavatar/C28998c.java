package com.tencent.p014mm.modelavatar;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.modelavatar.c */
public enum C28998c implements C38174i<C28997b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79496d;

    /* renamed from: com.tencent.mm.modelavatar.c$a */
    public static final class C28999a {

        /* renamed from: a */
        public static final List<Object> f79497a = null;

        static {
            f79497a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79496d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79496d;
                if (obj == obj2) {
                    obj = new C28997b();
                    this.f79496d = obj;
                }
            }
        }
        return (C28997b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28999a.f79497a;
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
        return "provider " + C28997b.class.getName();
    }
}
