package com.tencent.p014mm.plugin.game;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.game.u */
public enum C30112u implements C38174i<C30111t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81426d;

    /* renamed from: com.tencent.mm.plugin.game.u$a */
    public static final class C30113a {

        /* renamed from: a */
        public static final List<Object> f81427a = null;

        static {
            f81427a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81426d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81426d;
                if (obj == obj2) {
                    obj = new C30111t();
                    this.f81426d = obj;
                }
            }
        }
        return (C30111t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30113a.f81427a;
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
        return "provider " + C30111t.class.getName();
    }
}
