package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u */
public class C94678u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f273976d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f273977e;

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u$a */
    public class C94679a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f273978d;

        public C94679a(Bitmap bitmap) {
            this.f273978d = bitmap;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$7$1");
            Bitmap bitmap = this.f273978d;
            if (bitmap != null && !bitmap.isRecycled()) {
                C94678u.this.f273977e.setImageBitmap(this.f273978d);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(C94678u.this.f273977e, "alpha", new float[]{0.5f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.start();
                Log.m105924i("AdLandingHBCardComponent", "loadAvatarByUserName end, userName=" + C94678u.this.f273976d + ", w=" + this.f273978d.getWidth() + ", h=" + this.f273978d.getHeight());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$7$1");
        }
    }

    public C94678u(AdLandingHBCardComponent adLandingHBCardComponent, String str, ImageView imageView) {
        this.f273976d = str;
        this.f273977e = imageView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$7");
        Bitmap avatarByUserName = AdLandingPagesProxy.getInstance().getAvatarByUserName(this.f273976d, false);
        ((C119157j) C119157j.f356862d).mo183895z(new C94679a(avatarByUserName));
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$7");
    }
}
