package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.ui.conversation.c */
public enum C30851c implements C38174i<C30848b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82877d;

    /* renamed from: com.tencent.mm.ui.conversation.c$a */
    public static final class C30852a {

        /* renamed from: a */
        public static final List<Object> f82878a = null;

        static {
            f82878a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82877d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82877d;
                if (obj == obj2) {
                    obj = new C30848b();
                    this.f82877d = obj;
                }
            }
        }
        return (C30848b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30852a.f82878a;
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
        return "provider " + C30848b.class.getName();
    }
}
