package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.g0 */
public enum C30489g0 implements C38174i<C30487f0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82164d;

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.g0$a */
    public static final class C30490a {

        /* renamed from: a */
        public static final List<Object> f82165a = null;

        static {
            f82165a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f82164d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82164d;
                if (obj == obj2) {
                    obj = new C30487f0();
                    this.f82164d = obj;
                }
            }
        }
        return (C30487f0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C30490a.f82165a;
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
        return "provider " + C30487f0.class.getName();
    }
}
