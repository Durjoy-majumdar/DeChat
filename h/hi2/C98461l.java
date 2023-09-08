package hi2;

import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p159gw.C98250h;

/* renamed from: hi2.l */
public final class C98461l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CaptureDataManager.CaptureVideoNormalModel f288794d;

    public C98461l(CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
        this.f288794d = captureVideoNormalModel;
    }

    public final void run() {
        String exportVideoPath = AndroidMediaUtil.getExportVideoPath("mp4");
        ((C98250h) C86312j.m106911c(C98250h.class)).O00(MMApplicationContext.getContext(), this.f288794d.f272894e, exportVideoPath);
        Log.m105924i("MicroMsg.MediaFileUtil", "handleRemuxVideo save video" + this.f288794d.f272894e + " exist:" + C86013q1.m106450k(this.f288794d.f272894e) + " to:" + exportVideoPath);
        AndroidMediaUtil.refreshMediaScanner(exportVideoPath, MMApplicationContext.getContext());
    }
}
