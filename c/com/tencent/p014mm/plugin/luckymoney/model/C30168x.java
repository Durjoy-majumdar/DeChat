package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.C2CNYPredownloadVoiceEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.x */
public enum C30168x implements C38174i<C69270w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81554d;

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.x$a */
    public static final class C30169a {

        /* renamed from: a */
        public static final List<Object> f81555a = null;

        static {
            f81555a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81554d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81554d;
                if (obj == obj2) {
                    obj = new C69270w();
                    this.f81554d = obj;
                }
            }
        }
        return (C69270w) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C30169a.f81555a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C2CNYPredownloadVoiceEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C69270w.class.getName();
    }
}
