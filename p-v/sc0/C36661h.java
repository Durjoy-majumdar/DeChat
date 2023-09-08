package sc0;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: sc0.h */
public enum C36661h implements C38174i<C36660g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97450d;

    public Object get() {
        Object obj = this.f97450d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97450d;
                if (obj == obj2) {
                    obj = new C36660g();
                    this.f97450d = obj;
                }
            }
        }
        return (C36660g) obj;
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
        return Objects.equals(obj, "NewXmlUpgradeAssociateChatRoom") || Objects.equals(obj, "mmchatroombarannouncememt");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36660g.class.getName();
    }
}
