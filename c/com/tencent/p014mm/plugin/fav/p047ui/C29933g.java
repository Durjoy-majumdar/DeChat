package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.fav.ui.g */
public enum C29933g implements C38174i<C93592f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f81078d;

    public Object get() {
        Object obj = this.f81078d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f81078d;
                if (obj == obj2) {
                    obj = new C93592f();
                    this.f81078d = obj;
                }
            }
        }
        return (C93592f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, DoFavoriteEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C93592f.class.getName();
    }
}
