package cw2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: cw2.l */
public enum C30931l implements C38174i<StoryCore> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83024d;

    /* renamed from: cw2.l$a */
    public static final class C30932a {

        /* renamed from: a */
        public static final List<Object> f83025a = null;

        static {
            f83025a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83024d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83024d;
                if (obj == obj2) {
                    obj = new StoryCore();
                    this.f83024d = obj;
                }
            }
        }
        return (StoryCore) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C30932a.f83025a;
        }
        if ("dependencies".equals(str)) {
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
        return "provider " + StoryCore.class.getName();
    }
}
