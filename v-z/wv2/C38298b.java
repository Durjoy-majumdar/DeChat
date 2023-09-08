package wv2;

import com.tencent.p014mm.plugin.story.PluginStory;
import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wv2.b */
public enum C38298b implements C38174i<PluginStory> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101104d;

    public Object get() {
        Object obj = this.f101104d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101104d;
                if (obj == obj2) {
                    obj = new PluginStory();
                    this.f101104d = obj;
                }
            }
        }
        return (PluginStory) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + PluginStory.class.getName();
    }
}
