package com.tencent.p014mm.chatroom.plugin.listener;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.chatroom.plugin.listener.q */
public enum C28901q implements C38174i<C28900p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79316d;

    /* renamed from: com.tencent.mm.chatroom.plugin.listener.q$a */
    public static final class C28902a {

        /* renamed from: a */
        public static final List<Object> f79317a = null;

        static {
            f79317a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79316d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79316d;
                if (obj == obj2) {
                    obj = new C28900p();
                    this.f79316d = obj;
                }
            }
        }
        return (C28900p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28902a.f79317a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, RevokeMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28900p.class.getName();
    }
}
