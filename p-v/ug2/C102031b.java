package ug2;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import fh2.C97884j;
import gy3.C87412m;
import nr2.C35014a;
import sx3.C64197v;
import y70.C38971a;

/* renamed from: ug2.b */
public final class C102031b {

    /* renamed from: a */
    public static final C102031b f300466a = new C102031b();

    /* renamed from: a */
    public final void mo141540a(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
        if (C64197v.m75537f(1, 2, 4).contains(Integer.valueOf(recordConfigProvider.f272905F))) {
            if (recordConfigProvider.f272926n == null) {
                recordConfigProvider.f272926n = new SightParams(recordConfigProvider.f272905F, 0).f248452f;
            }
            boolean z = recordConfigProvider.f272912M.getBoolean("key_record_keep_ratio", false);
            VideoTransPara videoTransPara = recordConfigProvider.f272926n;
            if (videoTransPara != null) {
                Log.m105924i("MicroMsg.RecordConfig", "initLogic init SightRecordConfig ");
                if (z) {
                    C97884j.f287164a.mo137210c(videoTransPara, recordConfigProvider.f272905F, false);
                } else {
                    int i = recordConfigProvider.f272905F;
                    if (i == 2) {
                        C97884j.f287164a.mo137210c(videoTransPara, recordConfigProvider.f272905F, !C35014a.f93965a.mo59824a());
                    } else {
                        C97884j.f287164a.mo137210c(videoTransPara, i, true);
                    }
                }
            }
        }
        boolean z2 = !(C97884j.f287168e ? Boolean.valueOf(C97884j.f287164a.mo137209b()) : recordConfigProvider.f272920e).booleanValue();
        C38971a.f104994b = z2;
        Log.m105924i("MicroMsg.Camera.CameraKitConfig", "setTexturePreview:" + z2);
        recordConfigProvider.f272929q = 3;
    }
}
