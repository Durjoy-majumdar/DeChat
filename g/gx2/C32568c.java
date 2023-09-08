package gx2;

import com.tencent.p014mm.autogen.events.WxaPkgDownloadCompleteNotifyEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gx2.c */
public enum C32568c implements C38174i<C32567b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86460d;

    public Object get() {
        Object obj = this.f86460d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86460d;
                if (obj == obj2) {
                    obj = new C32567b();
                    this.f86460d = obj;
                }
            }
        }
        return (C32567b) obj;
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
        return Objects.equals(obj, WxaPkgDownloadCompleteNotifyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32567b.class.getName();
    }
}
