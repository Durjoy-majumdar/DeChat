package com.tencent.p014mm.plugin.expansions;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.expansions.t */
public enum C29893t implements C38174i<PluginExpansions> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80980d;

    /* renamed from: com.tencent.mm.plugin.expansions.t$a */
    public static final class C29894a {

        /* renamed from: a */
        public static final List<Object> f80981a = null;

        static {
            f80981a = Arrays.asList(new Object[]{C80625v0.MATCH_NOT_PLAIN_PROCESSES});
        }
    }

    public Object get() {
        Object obj = this.f80980d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80980d;
                if (obj == obj2) {
                    obj = new PluginExpansions();
                    this.f80980d = obj;
                }
            }
        }
        return (PluginExpansions) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C29894a.f80981a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + PluginExpansions.class.getName();
    }
}
