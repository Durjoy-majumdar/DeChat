package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.i */
public enum C30493i implements C38174i<C30491h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82170d;

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.i$a */
    public static final class C30494a {

        /* renamed from: a */
        public static final List<Object> f82171a = null;

        static {
            f82171a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82170d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82170d;
                if (obj == obj2) {
                    obj = new C30491h();
                    this.f82170d = obj;
                }
            }
        }
        return (C30491h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C30494a.f82171a;
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
        return "provider " + C30491h.class.getName();
    }
}
