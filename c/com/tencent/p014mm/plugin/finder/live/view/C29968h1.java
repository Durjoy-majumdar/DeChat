package com.tencent.p014mm.plugin.finder.live.view;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.finder.live.view.h1 */
public enum C29968h1 implements C38174i<C56059g1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81137d;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.h1$a */
    public static final class C29969a {

        /* renamed from: a */
        public static final List<Object> f81138a = null;

        static {
            f81138a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81137d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81137d;
                if (obj == obj2) {
                    obj = new C56059g1();
                    this.f81137d = obj;
                }
            }
        }
        return (C56059g1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29969a.f81138a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 21);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C56059g1.class.getName();
    }
}
