package b80;

import android.hardware.Camera;
import android.util.Range;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import h80.C108171a;
import p156gj.C107831f;
import p156gj.C107848z;

/* renamed from: b80.b */
public final class C104038b {

    /* renamed from: a */
    public C107831f f307682a;

    /* renamed from: b */
    public Camera.Parameters f307683b;

    /* renamed from: c */
    public int f307684c;

    /* renamed from: d */
    public int f307685d;

    /* renamed from: e */
    public int f307686e;

    /* renamed from: f */
    public int f307687f;

    /* renamed from: g */
    public Range<Integer> f307688g;

    /* renamed from: h */
    public int f307689h;

    /* renamed from: a */
    public final void mo145651a(int i) {
        Camera.Parameters parameters = this.f307683b;
        if (parameters != null) {
            parameters.setExposureCompensation(i);
        }
        try {
            C107831f fVar = this.f307682a;
            C107848z zVar = fVar != null ? fVar.f322839a : null;
            if (zVar != null) {
                zVar.mo158262f(this.f307683b);
            }
            CameraReportStruct a = C108171a.f323903a.mo158577a(this.f307689h);
            if (a != null) {
                a.f310083Z = (long) 1;
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.Camera1ExpoHelper", "enLargeExpo is error " + i);
            CameraReportStruct a2 = C108171a.f323903a.mo158577a(this.f307689h);
            if (a2 != null) {
                a2.f310083Z = (long) 2;
            }
        }
    }
}
