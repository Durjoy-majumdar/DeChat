package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.C2CNYPredownloadImgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.u */
public enum C30164u implements C38174i<C69264t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81546d;

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.u$a */
    public static final class C30165a {

        /* renamed from: a */
        public static final List<Object> f81547a = null;

        static {
            f81547a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f81546d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81546d;
                if (obj == obj2) {
                    obj = new C69264t();
                    this.f81546d = obj;
                }
            }
        }
        return (C69264t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C30165a.f81547a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C2CNYPredownloadImgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C69264t.class.getName();
    }
}
