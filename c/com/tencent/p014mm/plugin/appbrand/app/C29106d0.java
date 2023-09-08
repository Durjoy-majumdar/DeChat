package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.plugin.appbrand.app.C81194z;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.appbrand.app.d0 */
public enum C29106d0 implements C38174i<C81194z.C29175c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79686d;

    /* renamed from: com.tencent.mm.plugin.appbrand.app.d0$a */
    public static final class C29107a {

        /* renamed from: a */
        public static final List<Object> f79687a = null;

        static {
            f79687a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79686d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79686d;
                if (obj == obj2) {
                    obj = new C81194z.C29175c();
                    this.f79686d = obj;
                }
            }
        }
        return (C81194z.C29175c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29107a.f79687a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ExptChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C81194z.C29175c.class.getName();
    }
}
