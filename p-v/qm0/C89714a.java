package qm0;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.HashMap;
import kr0.C88267e;

/* renamed from: qm0.a */
public final class C89714a extends C82926s {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "onDumpSecuritySnapshot";

    /* renamed from: i */
    public static final C89715a f258000i = new C89715a((C8480h) null);

    /* renamed from: qm0.a$a */
    public static final class C89715a {
        public C89715a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo124022a(Bitmap bitmap, C88267e eVar, boolean z) {
            C87412m.m108594g(bitmap, "bitmap");
            C87412m.m108594g(eVar, "service");
            try {
                int[] iArr = {bitmap.getWidth(), bitmap.getHeight()};
                ByteBuffer a = C89716c.f258001a.mo124023a(bitmap, false);
                HashMap hashMap = new HashMap(2);
                hashMap.put("buffer", a);
                hashMap.put("shape", iArr);
                C84782s1.m104463d(eVar.getJsRuntime(), hashMap, (C84782s1.C84783a) eVar.mo109671p(C84782s1.C84783a.class));
                C89714a aVar = new C89714a();
                aVar.mo115165o(hashMap);
                aVar.mo115194p(eVar);
                aVar.mo115158h();
            } finally {
                if (z) {
                    try {
                        bitmap.recycle();
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
