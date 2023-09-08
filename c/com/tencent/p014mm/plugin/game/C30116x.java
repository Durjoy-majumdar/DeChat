package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.x */
public enum C30116x implements C38174i<C42396v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81431d;

    /* renamed from: com.tencent.mm.plugin.game.x$a */
    public static final class C30117a {

        /* renamed from: a */
        public static final List<Object> f81432a = null;

        static {
            f81432a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f81431d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81431d;
                if (obj == obj2) {
                    obj = new C42396v();
                    this.f81431d = obj;
                }
            }
        }
        return (C42396v) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30117a.f81432a;
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
        return "provider " + C42396v.class.getName();
    }
}
