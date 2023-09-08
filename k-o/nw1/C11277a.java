package nw1;

import android.os.Debug;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p723vf.C90773a;

/* renamed from: nw1.a */
public final class C11277a {

    /* renamed from: a */
    public static final C11277a f33206a = new C11277a();

    /* renamed from: a */
    public final void mo11333a(int i) {
        Log.m105924i("ImageCropReport", "inc: " + i);
        C115669n.INSTANCE.mo175913w(1361, (long) i, 1);
    }

    /* renamed from: b */
    public final void mo11334b(int i) {
        Debug.MemoryInfo b = C90773a.m113836b(MMApplicationContext.getContext());
        if (b != null) {
            int i2 = b.nativePss;
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1361, (long) i, (long) i2);
            nVar.mo175913w(1361, (long) (i + 1), (long) b.dalvikPss);
        }
    }
}
