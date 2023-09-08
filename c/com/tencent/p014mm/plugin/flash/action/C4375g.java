package com.tencent.p014mm.plugin.flash.action;

import au1.C0222b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.flash.C105349l;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.flash.action.g */
public class C4375g implements C105349l.C4396e {

    /* renamed from: a */
    public final /* synthetic */ FaceFlashActionPreviewLayout f19001a;

    public C4375g(FaceFlashActionPreviewLayout faceFlashActionPreviewLayout) {
        this.f19001a = faceFlashActionPreviewLayout;
    }

    /* renamed from: a */
    public void mo5233a(Boolean bool, C105349l lVar) {
        if (!bool.booleanValue()) {
            Log.m105920e("MicroMsg.FaceFlashActionPreviewLayout", "onResume startPreview open camera failed");
            C0222b.m173l("openCamera", -1);
            C0222b.m163b().f9686B = 1;
            FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f19001a;
            faceFlashActionPreviewLayout.f18937r.mo5278O7(faceFlashActionPreviewLayout.mo5248b(90038, C76577a.m92166q(faceFlashActionPreviewLayout.getContext(), C0966R.string.fq_)));
        }
    }
}
