package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import go3.C98165b0;
import nj3.C100123u0;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsGalleryUI$$b */
public final /* synthetic */ class SnsGalleryUI$$b implements TouchMediaPreviewLayout.C97275a {

    /* renamed from: a */
    public final /* synthetic */ SnsGalleryUI f278090a;

    public /* synthetic */ SnsGalleryUI$$b(SnsGalleryUI snsGalleryUI) {
        this.f278090a = snsGalleryUI;
    }

    public final void onDoubleTap(float f, float f2) {
        SnsGalleryUI snsGalleryUI = this.f278090a;
        int i = SnsGalleryUI.f278079W;
        snsGalleryUI.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$setTouchLayout$0", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        C101804kv2 f8 = snsGalleryUI.mo132732f8();
        if (f8 == null) {
            SnsMethodCalculate.markEndTimeMs("lambda$setTouchLayout$0", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return;
        }
        if (f8.f298690e == 6) {
            View currentView = snsGalleryUI.f277761o.getCurrentView();
            if (currentView != null) {
                if (!snsGalleryUI.f278084T.getAddTouchView()) {
                    C100123u0 a = C98165b0.f287797a.mo137447a(currentView);
                    if (a != null) {
                        a.setInterceptDetach(true);
                        snsGalleryUI.f278084T.setEnable(true);
                    }
                    if (currentView instanceof OnlineVideoView) {
                        snsGalleryUI.f278084T.mo153908b(((OnlineVideoView) currentView).getRoot());
                    }
                }
                snsGalleryUI.f278084T.mo153913e(f, f2);
            }
        } else {
            snsGalleryUI.f278084T.setEnable(false);
        }
        SnsMethodCalculate.markEndTimeMs("lambda$setTouchLayout$0", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }
}
