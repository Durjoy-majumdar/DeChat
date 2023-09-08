package nb1;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceAgreementUI;
import com.tencent.p014mm.plugin.flash.permission.FaceFlashPermissionUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C101218e0;

/* renamed from: nb1.n */
public class C11146n implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ FaceAgreementUI f32923a;

    public C11146n(FaceAgreementUI faceAgreementUI) {
        this.f32923a = faceAgreementUI;
    }

    /* renamed from: a */
    public void mo2001a() {
        Log.m105924i("MicroMsg.FaceAgreementUI", "click agree ");
        Intent intent = new Intent(this.f32923a, FaceFlashPermissionUI.class);
        Bundle extras = this.f32923a.getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("needContract", this.f32923a.f12425r);
        this.f32923a.startActivityForResult(intent, 1);
        C115669n.INSTANCE.idkeyStat(917, 65, 1, false);
        this.f32923a.f12424q.mo140680z();
    }
}
