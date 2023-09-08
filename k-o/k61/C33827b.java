package k61;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: k61.b */
public enum C33827b implements C38174i<C99104a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91443d;

    public Object get() {
        Object obj = this.f91443d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91443d;
                if (obj == obj2) {
                    obj = new C99104a();
                    this.f91443d = obj;
                }
            }
        }
        return (C99104a) obj;
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
        return Objects.equals(obj, "EmojiBackup") || Objects.equals(obj, "EmotionBackup") || Objects.equals(obj, "SelfieEmojiBackup");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C99104a.class.getName();
    }
}
