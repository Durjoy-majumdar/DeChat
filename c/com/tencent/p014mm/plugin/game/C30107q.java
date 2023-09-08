package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.q */
public enum C30107q implements C38174i<C42151p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81418d;

    /* renamed from: com.tencent.mm.plugin.game.q$a */
    public static final class C30108a {

        /* renamed from: a */
        public static final List<Object> f81419a = null;

        static {
            f81419a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81418d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81418d;
                if (obj == obj2) {
                    obj = new C42151p();
                    this.f81418d = obj;
                }
            }
        }
        return (C42151p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30108a.f81419a;
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
        return "provider " + C42151p.class.getName();
    }
}
