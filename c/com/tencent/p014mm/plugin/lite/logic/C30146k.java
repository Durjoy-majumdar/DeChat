package com.tencent.p014mm.plugin.lite.logic;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.lite.logic.k */
public enum C30146k implements C38174i<C115484j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81494d;

    /* renamed from: com.tencent.mm.plugin.lite.logic.k$a */
    public static final class C30147a {

        /* renamed from: a */
        public static final List<Object> f81495a = null;

        static {
            f81495a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81494d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81494d;
                if (obj == obj2) {
                    obj = new C115484j();
                    this.f81494d = obj;
                }
            }
        }
        return (C115484j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C30147a.f81495a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetA8KeyRedirectEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C115484j.class.getName();
    }
}
