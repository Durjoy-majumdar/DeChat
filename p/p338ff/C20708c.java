package p338ff;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ff.c */
public enum C20708c {
    ;
    

    /* renamed from: f */
    public static Map<Integer, C20708c> f58557f;

    /* renamed from: d */
    public int f58559d;

    /* renamed from: e */
    public int f58560e;

    /* access modifiers changed from: public */
    static {
        int i;
        f58557f = new HashMap();
        for (C20708c cVar : values()) {
            ((HashMap) f58557f).put(Integer.valueOf(cVar.f58559d), cVar);
        }
    }

    /* access modifiers changed from: public */
    C20708c(int i, int i2) {
        this.f58559d = i;
        this.f58560e = i2;
    }

    /* renamed from: a */
    public static C20708c m22681a(int i) {
        return (C20708c) ((HashMap) f58557f).get(Integer.valueOf(i));
    }
}
