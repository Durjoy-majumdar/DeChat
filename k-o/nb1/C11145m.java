package nb1;

import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceAgreementUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C101218e0;

/* renamed from: nb1.m */
public class C11145m implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ FaceAgreementUI f32922a;

    public C11145m(FaceAgreementUI faceAgreementUI) {
        this.f32922a = faceAgreementUI;
    }

    /* renamed from: a */
    public void mo2001a() {
        Log.m105924i("MicroMsg.FaceAgreementUI", "click disagree ");
        this.f32922a.f12424q.mo140680z();
        C115669n.INSTANCE.idkeyStat(917, 66, 1, false);
    }
}
