package com.tencent.p014mm.plugin.game.luggage;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.luggage.q */
public enum C30095q implements C38174i<C30093p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81395d;

    /* renamed from: com.tencent.mm.plugin.game.luggage.q$a */
    public static final class C30096a {

        /* renamed from: a */
        public static final List<Object> f81396a = null;

        static {
            f81396a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f81395d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81395d;
                if (obj == obj2) {
                    obj = new C30093p();
                    this.f81395d = obj;
                }
            }
        }
        return (C30093p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30096a.f81396a;
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
        return "provider " + C30093p.class.getName();
    }
}
