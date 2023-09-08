package com.tencent.p014mm.plugin.sns.p106ui;

import android.graphics.PointF;
import com.tencent.p014mm.plugin.scanner.C42912n;
import com.tencent.p014mm.plugin.scanner.C94467l;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsBaseGalleryUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.n0 */
public class C96078n0 implements C94467l {

    /* renamed from: a */
    public final /* synthetic */ SnsInfo f280561a;

    /* renamed from: b */
    public final /* synthetic */ String f280562b;

    /* renamed from: c */
    public final /* synthetic */ FlipView f280563c;

    public C96078n0(FlipView flipView, SnsInfo snsInfo, String str) {
        this.f280563c = flipView;
        this.f280561a = snsInfo;
        this.f280562b = str;
    }

    /* renamed from: a */
    public void mo64853a(ArrayList<PointF> arrayList, ArrayList<ImageQBarDataBean> arrayList2, ArrayList<ImageQBarDataBean> arrayList3) {
        boolean z;
        ArrayList<PointF> arrayList4 = arrayList;
        ArrayList<ImageQBarDataBean> arrayList5 = arrayList2;
        ArrayList<ImageQBarDataBean> arrayList6 = arrayList3;
        SnsMethodCalculate.markStartTimeMs("showMultiCodeView", "com.tencent.mm.plugin.sns.ui.FlipView$7");
        C42912n nVar = C42912n.f116194a;
        nVar.mo67105c(this.f280563c.f276778F.longValue(), this.f280563c.f276808y.size(), arrayList.size(), 1, "");
        if (arrayList.size() > 1) {
            long longValue = this.f280563c.f276778F.longValue();
            long longValue2 = this.f280563c.f276779G.longValue();
            z = true;
            nVar.mo67103a(longValue, 11, arrayList3, (ImageQBarDataBean) null, longValue2, 1, 6);
        } else {
            z = true;
        }
        FlipView flipView = this.f280563c;
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.FlipView");
        FlipView$$o flipView$$o = flipView.f276777E;
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (flipView$$o != null) {
            FlipView flipView2 = this.f280563c;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.FlipView");
            FlipView$$o flipView$$o2 = flipView2.f276777E;
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.FlipView");
            SnsInfo snsInfo = this.f280561a;
            String str = this.f280562b;
            SnsBaseGalleryUI.C95474c cVar = (SnsBaseGalleryUI.C95474c) flipView$$o2;
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onMultiCodeViewShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2");
            SnsBaseGalleryUI snsBaseGalleryUI = SnsBaseGalleryUI.this;
            MultiCodeMaskView multiCodeMaskView = snsBaseGalleryUI.f277766t;
            if (multiCodeMaskView != null) {
                SnsInfoFlip snsInfoFlip = snsBaseGalleryUI.f277761o;
                if (snsInfoFlip != null) {
                    multiCodeMaskView.mo67040c(arrayList6, arrayList4, arrayList5, snsInfoFlip.getMeasuredHeight());
                } else {
                    multiCodeMaskView.mo67040c(arrayList6, arrayList4, arrayList5, multiCodeMaskView.getRootView().getMeasuredHeight());
                }
                SnsBaseGalleryUI.this.f277766t.setMMultiCodeMaskViewListener(new C96216s3(cVar, snsInfo, str));
                SnsMethodCalculate.markEndTimeMs("onMultiCodeViewShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2");
            } else {
                SnsMethodCalculate.markEndTimeMs("onMultiCodeViewShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2");
                z = false;
            }
            if (z) {
                SnsMethodCalculate.markEndTimeMs("showMultiCodeView", "com.tencent.mm.plugin.sns.ui.FlipView$7");
                return;
            }
        }
        if (!arrayList2.isEmpty()) {
            this.f280563c.mo132136f(arrayList5.get(0), this.f280561a, this.f280562b);
        } else {
            FlipView flipView3 = this.f280563c;
            flipView3.mo132136f(flipView3.f276808y.get(0), this.f280561a, this.f280562b);
        }
        SnsMethodCalculate.markEndTimeMs("showMultiCodeView", "com.tencent.mm.plugin.sns.ui.FlipView$7");
    }

    /* renamed from: b */
    public void mo64854b(ImageQBarDataBean imageQBarDataBean, ArrayList<ImageQBarDataBean> arrayList) {
        SnsMethodCalculate.markStartTimeMs("handleOutsideCode", "com.tencent.mm.plugin.sns.ui.FlipView$7");
        ImageQBarDataBean imageQBarDataBean2 = imageQBarDataBean;
        this.f280563c.mo132136f(imageQBarDataBean2, this.f280561a, this.f280562b);
        C42912n nVar = C42912n.f116194a;
        nVar.mo67105c(this.f280563c.f276778F.longValue(), arrayList.size(), 0, 1, "");
        nVar.mo67103a(this.f280563c.f276778F.longValue(), 1, arrayList, imageQBarDataBean2, this.f280563c.f276779G.longValue(), 1, 6);
        SnsMethodCalculate.markEndTimeMs("handleOutsideCode", "com.tencent.mm.plugin.sns.ui.FlipView$7");
    }
}
