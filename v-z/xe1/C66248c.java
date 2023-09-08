package xe1;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.WeWatermarkDet;
import di3.C86312j;
import q00.C62571i;

/* renamed from: xe1.c */
public final class C66248c {

    /* renamed from: a */
    public static final C66248c f190305a = new C66248c();

    /* renamed from: b */
    public static long f190306b;

    /* renamed from: a */
    public final boolean mo90342a() {
        long j;
        if (f190306b == 0) {
            Class cls = C62571i.class;
            String a = ((C62571i) C86312j.m106911c(cls)).mo87567IR().mo11889a("MODEL_OSD");
            String a2 = ((C62571i) C86312j.m106911c(cls)).mo87567IR().mo11889a("MODEL_OSD_FEATURES");
            if (!(a == null || a.length() == 0)) {
                if (!(a2 == null || a2.length() == 0)) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    f190306b = WeWatermarkDet.nInit(a, a2);
                    j = SystemClock.uptimeMillis() - uptimeMillis;
                    Log.m105924i("Finder.WatermarkDetCore", "[init] initTime:" + j + ", modelPath:" + a + " watermarkPath:" + a2);
                }
            }
            j = 0;
            Log.m105924i("Finder.WatermarkDetCore", "[init] initTime:" + j + ", modelPath:" + a + " watermarkPath:" + a2);
        }
        return f190306b != 0;
    }
}
