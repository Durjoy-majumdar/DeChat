package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n1 */
public class C95193n1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f276247d;

    /* renamed from: e */
    public final /* synthetic */ C95179m1 f276248e;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n1$a */
    public class C95194a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f276249d;

        public C95194a(Bitmap bitmap) {
            this.f276249d = bitmap;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$3$1");
            C95179m1 m1Var = C95193n1.this.f276248e;
            Bitmap bitmap = this.f276249d;
            m1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            if (bitmap == null) {
                Log.m105920e("AdLandingPagePureImageComponet", "when set image the bmp is null!");
                SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            } else if (m1Var.f276223t == null) {
                Log.m105920e("AdLandingPagePureImageComponet", "when set image the imageView is null!");
                SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            } else if (bitmap.getWidth() == 0) {
                Log.m105920e("AdLandingPagePureImageComponet", "when set image the bmp.getWidth is 0!");
                SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            } else {
                m1Var.f276223t.setImageBitmap(bitmap);
                m1Var.f276224u.setVisibility(8);
                SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$3$1");
        }
    }

    public C95193n1(C95179m1 m1Var, String str) {
        this.f276248e = m1Var;
        this.f276247d = str;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$3");
        try {
            Bitmap decodeFile = BitmapUtil.decodeFile(this.f276247d);
            ((C119157j) C119157j.f356862d).mo183895z(new C95194a(decodeFile));
        } catch (Throwable th) {
            Log.m105920e("AdLandingPagePureImageComponet", "setImageAsync, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$3");
    }
}
