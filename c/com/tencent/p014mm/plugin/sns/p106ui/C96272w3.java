package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.List;
import tk2.C101904b;

/* renamed from: com.tencent.mm.plugin.sns.ui.w3 */
public class C96272w3 implements FlipView$$n {

    /* renamed from: a */
    public final /* synthetic */ SnsBaseGalleryUI f281338a;

    public C96272w3(SnsBaseGalleryUI snsBaseGalleryUI) {
        this.f281338a = snsBaseGalleryUI;
    }

    /* renamed from: a */
    public void mo132169a() {
        SnsMethodCalculate.markStartTimeMs("onMenuDismiss", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$9");
        SnsBaseGalleryUI.m121910H7(this.f281338a).reset();
        SnsMethodCalculate.markEndTimeMs("onMenuDismiss", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$9");
    }

    /* renamed from: b */
    public void mo132170b(List<Integer> list) {
        SnsMethodCalculate.markStartTimeMs("onMenuShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$9");
        if (list != null && list.contains(1011)) {
            C101904b H7 = SnsBaseGalleryUI.m121910H7(this.f281338a);
            int R7 = this.f281338a.mo132589R7();
            SnsBaseGalleryUI snsBaseGalleryUI = this.f281338a;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            int i = snsBaseGalleryUI.f277765s;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            H7.mo10651a(2, R7, i);
        }
        SnsMethodCalculate.markEndTimeMs("onMenuShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$9");
    }
}
