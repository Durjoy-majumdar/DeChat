package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsGalleryUI$$a */
public final /* synthetic */ class SnsGalleryUI$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsGalleryUI f278087d;

    /* renamed from: e */
    public final /* synthetic */ String f278088e;

    /* renamed from: f */
    public final /* synthetic */ List f278089f;

    public /* synthetic */ SnsGalleryUI$$a(SnsGalleryUI snsGalleryUI, String str, List list) {
        this.f278087d = snsGalleryUI;
        this.f278088e = str;
        this.f278089f = list;
    }

    public final void run() {
        SnsGalleryUI snsGalleryUI = this.f278087d;
        String str = this.f278088e;
        List list = this.f278089f;
        int i = SnsGalleryUI.f278079W;
        snsGalleryUI.getClass();
        SnsMethodCalculate.markStartTimeMs("lambda$dispatchCodeScanned$1", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        if (snsGalleryUI.f278086V == null) {
            SnsMethodCalculate.markEndTimeMs("lambda$dispatchCodeScanned$1", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return;
        }
        Iterator it = new ArrayList(snsGalleryUI.f278086V).iterator();
        while (it.hasNext()) {
            ((SnsGalleryUI$$i) it.next()).mo126114s(str, list);
        }
        SnsMethodCalculate.markEndTimeMs("lambda$dispatchCodeScanned$1", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }
}
