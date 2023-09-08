package com.tencent.p014mm.plugin.game.commlib;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.commlib.i */
public enum C30079i implements C38174i<C41855h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81358d;

    /* renamed from: com.tencent.mm.plugin.game.commlib.i$a */
    public static final class C30080a {

        /* renamed from: a */
        public static final List<Object> f81359a = null;

        static {
            f81359a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f81358d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81358d;
                if (obj == obj2) {
                    obj = new C41855h();
                    this.f81358d = obj;
                }
            }
        }
        return (C41855h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30080a.f81359a;
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
        return "provider " + C41855h.class.getName();
    }
}
