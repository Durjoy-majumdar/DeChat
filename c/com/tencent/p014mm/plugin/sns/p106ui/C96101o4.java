package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.ScaleGestureDetector;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import go3.C98165b0;
import nj3.C100123u0;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.plugin.sns.ui.o4 */
public class C96101o4 implements TouchMediaPreviewLayout.C97277c {

    /* renamed from: d */
    public final /* synthetic */ SnsGalleryUI f280681d;

    public C96101o4(SnsGalleryUI snsGalleryUI) {
        this.f280681d = snsGalleryUI;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        SnsMethodCalculate.markStartTimeMs("onScale", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        SnsMethodCalculate.markEndTimeMs("onScale", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        SnsMethodCalculate.markStartTimeMs("onScaleBegin", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        SnsGalleryUI snsGalleryUI = this.f280681d;
        int i = SnsGalleryUI.f278079W;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        C101804kv2 f8 = snsGalleryUI.mo132732f8();
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        if (f8 == null) {
            SnsMethodCalculate.markEndTimeMs("onScaleBegin", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
            return true;
        }
        if (f8.f298690e == 6) {
            View currentView = this.f280681d.f277761o.getCurrentView();
            if (currentView != null) {
                C100123u0 a = C98165b0.f287797a.mo137447a(currentView);
                if (a != null) {
                    a.setInterceptDetach(true);
                    SnsGalleryUI snsGalleryUI2 = this.f280681d;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    TouchMediaPreviewLayout touchMediaPreviewLayout = snsGalleryUI2.f278084T;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    touchMediaPreviewLayout.setEnable(true);
                }
                if (currentView instanceof OnlineVideoView) {
                    SnsGalleryUI snsGalleryUI3 = this.f280681d;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    TouchMediaPreviewLayout touchMediaPreviewLayout2 = snsGalleryUI3.f278084T;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    touchMediaPreviewLayout2.mo153908b(((OnlineVideoView) currentView).getRoot());
                }
            }
        } else {
            SnsGalleryUI snsGalleryUI4 = this.f280681d;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            TouchMediaPreviewLayout touchMediaPreviewLayout3 = snsGalleryUI4.f278084T;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            touchMediaPreviewLayout3.setEnable(false);
        }
        SnsMethodCalculate.markEndTimeMs("onScaleBegin", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        View currentView;
        C100123u0 a;
        SnsMethodCalculate.markStartTimeMs("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
        SnsGalleryUI snsGalleryUI = this.f280681d;
        int i = SnsGalleryUI.f278079W;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        C101804kv2 f8 = snsGalleryUI.mo132732f8();
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        if (f8 == null) {
            SnsMethodCalculate.markEndTimeMs("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
            return;
        }
        if (!(f8.f298690e != 6 || (currentView = this.f280681d.f277761o.getCurrentView()) == null || (a = C98165b0.f287797a.mo137447a(currentView)) == null)) {
            a.setInterceptDetach(false);
        }
        SnsMethodCalculate.markEndTimeMs("onScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$5");
    }
}
