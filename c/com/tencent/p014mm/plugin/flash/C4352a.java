package com.tencent.p014mm.plugin.flash;

import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.flash.view.FaceFlashReflectMask;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.flash.a */
public class C4352a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105349l f18910d;

    /* renamed from: e */
    public final /* synthetic */ FaceFlashPreviewLayout f18911e;

    public C4352a(FaceFlashPreviewLayout faceFlashPreviewLayout, C105349l lVar) {
        this.f18911e = faceFlashPreviewLayout;
        this.f18910d = lVar;
    }

    public void run() {
        int i;
        int i2;
        this.f18911e.f18858d.setVisibility(0);
        int min = Math.min(C75044y4.m89990b(this.f18911e.getContext()).x, C75044y4.m89990b(this.f18911e.getContext()).y);
        if (C75044y4.m89990b(this.f18911e.getContext()).x > C75044y4.m89990b(this.f18911e.getContext()).y) {
            i2 = (int) (((float) min) * FaceFlashReflectMask.f19057q * 2.0f);
            i = (int) (((float) i2) * this.f18910d.mo149954b());
        } else {
            i = (int) (((float) min) * FaceFlashReflectMask.f19057q * 2.0f);
            i2 = (int) (((float) i) * this.f18910d.mo149954b());
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f18911e.f18861g.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        int i3 = (i2 - i) / 2;
        if (i3 < 0) {
            i3 = 0;
        }
        layoutParams.topMargin = C76577a.m92157h(this.f18911e.getContext(), C0966R.dimen.a58) - i3;
        this.f18911e.f18861g.setLayoutParams(layoutParams);
        this.f18911e.f18862h.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f18911e.f18865n.getLayoutParams();
        layoutParams2.topMargin = (C76577a.m92157h(this.f18911e.getContext(), C0966R.dimen.a58) + (Math.min(i, i2) / 2)) - (this.f18911e.f18865n.getHeight() / 2);
        this.f18911e.f18865n.setLayoutParams(layoutParams2);
        FaceFlashPreviewLayout faceFlashPreviewLayout = this.f18911e;
        if (faceFlashPreviewLayout.f18874w != YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) faceFlashPreviewLayout.f18867p.getLayoutParams();
            float f = (float) ((int) (((float) min) * FaceFlashReflectMask.f19057q * 2.0f));
            int i4 = (int) (0.85f * f);
            layoutParams3.width = i4;
            layoutParams3.height = i4;
            layoutParams3.topMargin = C76577a.m92157h(this.f18911e.getContext(), C0966R.dimen.a58) + (((int) (f * 0.14999998f)) / 2);
            this.f18911e.f18867p.setLayoutParams(layoutParams3);
            this.f18911e.f18867p.setVisibility(0);
        }
    }
}
