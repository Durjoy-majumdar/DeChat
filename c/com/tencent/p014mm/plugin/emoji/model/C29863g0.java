package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WearDownloadEmojiEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.emoji.model.g0 */
public enum C29863g0 implements C38174i<C41044f0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f80916d;

    /* renamed from: com.tencent.mm.plugin.emoji.model.g0$a */
    public static final class C29864a {

        /* renamed from: a */
        public static final List<Object> f80917a = null;

        static {
            f80917a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f80916d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f80916d;
                if (obj == obj2) {
                    obj = new C41044f0();
                    this.f80916d = obj;
                }
            }
        }
        return (C41044f0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C29864a.f80917a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WearDownloadEmojiEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C41044f0.class.getName();
    }
}
