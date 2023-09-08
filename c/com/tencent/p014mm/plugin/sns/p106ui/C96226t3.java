package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import tk2.C101903a;

/* renamed from: com.tencent.mm.plugin.sns.ui.t3 */
public class C96226t3 implements MMViewPager.C19704d {

    /* renamed from: a */
    public final /* synthetic */ SnsBaseGalleryUI f281184a;

    public C96226t3(SnsBaseGalleryUI snsBaseGalleryUI) {
        this.f281184a = snsBaseGalleryUI;
    }

    /* renamed from: a */
    public boolean mo26054a(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onDoubleClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$6");
        SnsBaseGalleryUI snsBaseGalleryUI = this.f281184a;
        int i = SnsBaseGalleryUI.f277739N;
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        C101903a aVar = snsBaseGalleryUI.f277746G;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (aVar != null) {
            SnsBaseGalleryUI snsBaseGalleryUI2 = this.f281184a;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            C101903a aVar2 = snsBaseGalleryUI2.f277746G;
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            boolean onDoubleTap = aVar2.onDoubleTap(motionEvent);
            SnsMethodCalculate.markEndTimeMs("onDoubleClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$6");
            return onDoubleTap;
        }
        SnsMethodCalculate.markEndTimeMs("onDoubleClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$6");
        return false;
    }
}
