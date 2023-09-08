package com.tencent.p014mm.plugin.webview.modeltools;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.n */
public enum C30600n implements C38174i<C6080m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82416d;

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.n$a */
    public static final class C30601a {

        /* renamed from: a */
        public static final List<Object> f82417a = null;

        static {
            f82417a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f82416d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82416d;
                if (obj == obj2) {
                    obj = new C6080m();
                    this.f82416d = obj;
                }
            }
        }
        return (C6080m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30601a.f82417a;
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
        return "provider " + C6080m.class.getName();
    }
}
