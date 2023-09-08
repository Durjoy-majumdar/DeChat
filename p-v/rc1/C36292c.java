package rc1;

import com.tencent.p014mm.autogen.events.FavInitConfirmDialogContentEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rc1.c */
public enum C36292c implements C38174i<C101370b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96629d;

    public Object get() {
        Object obj = this.f96629d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96629d;
                if (obj == obj2) {
                    obj = new C101370b();
                    this.f96629d = obj;
                }
            }
        }
        return (C101370b) obj;
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
        return Objects.equals(obj, FavInitConfirmDialogContentEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C101370b.class.getName();
    }
}
