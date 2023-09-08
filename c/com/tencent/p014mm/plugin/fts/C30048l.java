package com.tencent.p014mm.plugin.fts;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.fts.l */
public enum C30048l implements C38174i<PluginFTS> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81304d;

    /* renamed from: com.tencent.mm.plugin.fts.l$a */
    public static final class C30049a {

        /* renamed from: a */
        public static final List<Object> f81305a = null;

        static {
            f81305a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81304d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81304d;
                if (obj == obj2) {
                    obj = new PluginFTS();
                    this.f81304d = obj;
                }
            }
        }
        return (PluginFTS) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30049a.f81305a;
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
        return "provider " + PluginFTS.class.getName();
    }
}
