package com.tencent.p014mm.plugin.game.commlib;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.commlib.g */
public enum C30077g implements C38174i<C30076f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81354d;

    /* renamed from: com.tencent.mm.plugin.game.commlib.g$a */
    public static final class C30078a {

        /* renamed from: a */
        public static final List<Object> f81355a = null;

        static {
            f81355a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81354d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81354d;
                if (obj == obj2) {
                    obj = new C30076f();
                    this.f81354d = obj;
                }
            }
        }
        return (C30076f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30078a.f81355a;
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
        return "provider " + C30076f.class.getName();
    }
}
