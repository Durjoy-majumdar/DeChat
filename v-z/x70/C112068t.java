package x70;

import android.util.SparseArray;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraReportStruct;
import com.tencent.p014mm.media.camera.CameraSupportInfo;
import gy3.C87412m;
import h80.C108171a;
import v70.C111386a;
import y70.C38971a;

/* renamed from: x70.t */
public abstract class C112068t extends C112047f {

    /* renamed from: r */
    public static int f335493r;

    public C112068t() {
        C108171a aVar = C108171a.f323903a;
        int i = this.f335419d;
        int i2 = f335493r;
        f335493r = i2 + 1;
        SparseArray<CameraReportStruct> sparseArray = C108171a.f323904b;
        if (sparseArray.get(i) == null) {
            sparseArray.put(i, new CameraReportStruct());
        }
        CameraReportStruct cameraReportStruct = sparseArray.get(i);
        C87412m.m108593f(cameraReportStruct, "reportMap[sessionId]");
        CameraReportStruct cameraReportStruct2 = cameraReportStruct;
        cameraReportStruct2.f310094m = System.currentTimeMillis();
        C38971a aVar2 = C38971a.f104993a;
        cameraReportStruct2.f310085d = aVar2.mo61854b();
        cameraReportStruct2.f310086e = aVar2.mo61856d(true) ? 2 : 1;
        cameraReportStruct2.f310087f = aVar2.mo61853a();
        cameraReportStruct2.f310103v = aVar2.mo61855c() ? 1 : 0;
        CameraSupportInfo cameraSupportInfo = C111386a.f333471c;
        cameraReportStruct2.f310063F = cameraReportStruct2.mo86045b("FrontCameraId", cameraSupportInfo.f79443d, true);
        cameraReportStruct2.f310064G = cameraReportStruct2.mo86045b("FrontCameraSupportLevel", cameraSupportInfo.f79446g, true);
        CameraSupportInfo cameraSupportInfo2 = C111386a.f333472d;
        cameraReportStruct2.f310065H = cameraReportStruct2.mo86045b("BackCameraId", cameraSupportInfo2.f79443d, true);
        cameraReportStruct2.f310066I = cameraReportStruct2.mo86045b("BackCameraSupportLevel", cameraSupportInfo2.f79446g, true);
        cameraReportStruct2.f310067J = i2;
    }
}
