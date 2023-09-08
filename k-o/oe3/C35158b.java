package oe3;

import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import dw1.C31315a;
import dw1.C31318e;
import java.util.HashMap;
import rx3.C13598b0;

/* renamed from: oe3.b */
public final class C35158b {

    /* renamed from: a */
    public static final HashMap<Integer, C31318e> f94288a;

    /* renamed from: b */
    public static final C31315a f94289b = new C31315a();

    /* renamed from: c */
    public static final HashMap<String, C31315a> f94290c;

    static {
        HashMap<String, C31315a> hashMap;
        HashMap<Integer, C31318e> hashMap2 = new HashMap<>();
        f94288a = hashMap2;
        HashMap<String, C31315a> hashMap3 = new HashMap<>();
        f94290c = hashMap3;
        Integer valueOf = Integer.valueOf(NativeBitmapStruct.GLFormat.GL_RGB);
        C35156a aVar = new C35156a();
        synchronized (hashMap2) {
            hashMap = null;
            if ((hashMap2.containsKey(valueOf) ^ true ? hashMap2 : null) != null) {
                hashMap2.put(valueOf, aVar);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        C35156a aVar2 = new C35156a();
        synchronized (hashMap3) {
            if (!hashMap3.containsKey("/cgi-bin/micromsg-bin/findergetlivetips")) {
                hashMap = hashMap3;
            }
            if (hashMap != null) {
                hashMap3.put("/cgi-bin/micromsg-bin/findergetlivetips", aVar2);
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
    }
}
