package com.tencent.p014mm.chatroom.plugin.listener;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.NotifyGroupTodoEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.chatroom.plugin.listener.j */
public enum C28890j implements C38174i<C67856i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79300d;

    /* renamed from: com.tencent.mm.chatroom.plugin.listener.j$a */
    public static final class C28891a {

        /* renamed from: a */
        public static final List<Object> f79301a = null;

        static {
            f79301a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f79300d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79300d;
                if (obj == obj2) {
                    obj = new C67856i();
                    this.f79300d = obj;
                }
            }
        }
        return (C67856i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28891a.f79301a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, NotifyGroupTodoEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C67856i.class.getName();
    }
}
