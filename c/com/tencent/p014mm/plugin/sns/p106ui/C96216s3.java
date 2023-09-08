package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.scanner.C42912n;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsBaseGalleryUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.s3 */
public class C96216s3 implements MultiCodeMaskView.C42884a {

    /* renamed from: a */
    public final /* synthetic */ SnsInfo f281163a;

    /* renamed from: b */
    public final /* synthetic */ String f281164b;

    /* renamed from: c */
    public final /* synthetic */ SnsBaseGalleryUI.C95474c f281165c;

    public C96216s3(SnsBaseGalleryUI.C95474c cVar, SnsInfo snsInfo, String str) {
        this.f281165c = cVar;
        this.f281163a = snsInfo;
        this.f281164b = str;
    }

    /* renamed from: a */
    public void mo64868a(ArrayList<ImageQBarDataBean> arrayList) {
        SnsMethodCalculate.markStartTimeMs("onCancelSelect", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2$1");
        SnsInfoFlip snsInfoFlip = SnsBaseGalleryUI.this.f277761o;
        if (snsInfoFlip != null) {
            C42912n.f116194a.mo67103a(snsInfoFlip.f276778F.longValue(), 3, arrayList, (ImageQBarDataBean) null, SnsBaseGalleryUI.this.f277761o.f276779G.longValue(), 1, 6);
        }
        SnsMethodCalculate.markEndTimeMs("onCancelSelect", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2$1");
    }

    /* renamed from: b */
    public void mo64869b(ArrayList<ImageQBarDataBean> arrayList, ImageQBarDataBean imageQBarDataBean, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onSelectQBarCode", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2$1");
        SnsInfoFlip snsInfoFlip = SnsBaseGalleryUI.this.f277761o;
        if (snsInfoFlip != null) {
            snsInfoFlip.mo132136f(imageQBarDataBean, this.f281163a, this.f281164b);
        }
        int i = z ? 1 : 2;
        SnsInfoFlip snsInfoFlip2 = SnsBaseGalleryUI.this.f277761o;
        if (snsInfoFlip2 != null) {
            C42912n.f116194a.mo67103a(snsInfoFlip2.f276778F.longValue(), i, arrayList, imageQBarDataBean, SnsBaseGalleryUI.this.f277761o.f276779G.longValue(), 1, 6);
        }
        SnsMethodCalculate.markEndTimeMs("onSelectQBarCode", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$2$1");
    }
}
