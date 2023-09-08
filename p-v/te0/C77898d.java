package te0;

import com.tencent.p014mm.openim.p018ui.dialog.OpenIMConfirmDialogView;
import com.tencent.p014mm.plugin.profile.C70137b;
import com.tencent.p014mm.sdk.platformtools.Log;
import p239sv.C77790f;
import ue0.C78151a;

/* renamed from: te0.d */
public final class C77898d implements C78151a.C78152a {

    /* renamed from: a */
    public final /* synthetic */ OpenIMConfirmDialogView f226956a;

    public C77898d(OpenIMConfirmDialogView openIMConfirmDialogView) {
        this.f226956a = openIMConfirmDialogView;
    }

    /* renamed from: a */
    public void mo108007a(int i) {
        C77790f fVar = this.f226956a.f195844X0;
        if (fVar != null) {
            Log.m105925i("MicroMsg.NewContactWidgetNormal", "confirmDialog onClose exitType:%s", Integer.valueOf(i));
            ((C77894a) ((C70137b) fVar).f202467a).dismiss();
        }
    }
}
