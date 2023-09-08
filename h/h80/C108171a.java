package h80;

import android.util.SparseArray;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: h80.a */
public final class C108171a {

    /* renamed from: a */
    public static final C108171a f323903a = new C108171a();

    /* renamed from: b */
    public static final SparseArray<CameraReportStruct> f323904b = new SparseArray<>();

    /* renamed from: a */
    public final CameraReportStruct mo158577a(int i) {
        return f323904b.get(i);
    }

    /* renamed from: b */
    public final void mo158578b(int i, boolean z) {
        CameraReportStruct a = mo158577a(i);
        if (a != null) {
            a.f310088g = z ? 1 : 0;
        }
    }

    /* renamed from: c */
    public final void mo158579c(int i, int i2) {
        Log.m105924i("MicroMsg.CameraKitReport", "markFallbackToReadPixel sessionId:" + i + ", status: " + i2);
        CameraReportStruct a = mo158577a(i);
        if (a != null) {
            a.f310075R = i2;
        }
    }
}
