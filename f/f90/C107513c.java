package f90;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import i90.C108423a;
import rx3.C13598b0;
import s80.C110777a;
import y80.C112397a;
import y80.C66557b;

/* renamed from: f90.c */
public final class C107513c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C107509b f321670d;

    /* renamed from: e */
    public final /* synthetic */ SurfaceTexture f321671e;

    /* renamed from: f */
    public final /* synthetic */ Float f321672f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f321673g;

    public C107513c(C107509b bVar, SurfaceTexture surfaceTexture, Float f, C32226l<? super Boolean, C13598b0> lVar) {
        this.f321670d = bVar;
        this.f321671e = surfaceTexture;
        this.f321672f = f;
        this.f321673g = lVar;
    }

    public final void run() {
        C107515e eVar;
        this.f321670d.f321660t = Util.currentTicks();
        C107509b bVar = this.f321670d;
        bVar.mo157934g("StartPreviewTimeStamp", Long.valueOf(bVar.f321660t));
        C107509b bVar2 = this.f321670d;
        bVar2.f321642b.mo143188z(this.f321671e, bVar2.f321641a.mo128017d(), this.f321672f, this.f321670d.f321641a.getResolutionLimit());
        if (!((C112397a) this.f321670d.f321642b).mo164109B() && !this.f321670d.f321641a.mo128017d()) {
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markGpuCropFailed");
            C115669n.INSTANCE.mo175913w(985, 10, 1);
        }
        C32226l<Boolean, C13598b0> lVar = this.f321673g;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(((C112397a) this.f321670d.f321642b).mo164109B()));
        }
        C107509b bVar3 = this.f321670d;
        bVar3.getClass();
        long currentTicks = Util.currentTicks();
        bVar3.mo157934g("PreviewSuccessTImeStamp", Long.valueOf(currentTicks));
        bVar3.mo157934g("CameraFirstFrameCost", Long.valueOf(currentTicks - bVar3.f321660t));
        C66557b m = bVar3.f321642b.mo143174m();
        Log.m105924i("MicroMsg.CameraPreviewContainer", "afterStartPreview, cameraConfig:" + m);
        if (m != null) {
            bVar3.f321641a.getCameraPreviewView().mo148310m(m);
            bVar3.mo157928a();
            bVar3.mo157929b(m);
            VideoTransPara videoTransPara = bVar3.f321641a.getVideoTransPara();
            C110777a aVar = bVar3.f321662v;
            boolean z = true;
            if ((aVar == null ? true : aVar instanceof C107515e) && (eVar = (C107515e) aVar) != null) {
                int i = videoTransPara.f267166d;
                int i2 = videoTransPara.f267167e;
                boolean z2 = bVar3.f321659s;
                eVar.f321683w = i;
                eVar.f321684x = i2;
                eVar.f321685y = z2;
                Log.m105924i("MicroMsg.Media.AbsSurfaceRenderer", "setOutputTextureInfo size:[" + i + ", " + i2 + "], outputMirror:" + eVar.f321685y);
            }
            if (!bVar3.f321658r) {
                C108423a aVar2 = bVar3.f321656p;
                if (bVar3.f321646f || !bVar3.f321641a.mo128018f()) {
                    z = false;
                }
                aVar2.mo158966a(z, m);
            }
        }
    }
}
