package com.tencent.p014mm.chatroom.plugin.listener;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RevokeNativeMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.chatroom.plugin.listener.o */
public enum C28898o implements C38174i<C28897n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79312d;

    /* renamed from: com.tencent.mm.chatroom.plugin.listener.o$a */
    public static final class C28899a {

        /* renamed from: a */
        public static final List<Object> f79313a = null;

        static {
            f79313a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79312d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79312d;
                if (obj == obj2) {
                    obj = new C28897n();
                    this.f79312d = obj;
                }
            }
        }
        return (C28897n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28899a.f79313a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, RevokeNativeMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28897n.class.getName();
    }
}
