package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ps2.C100880k;
import ps2.C100891r;
import qs2.C101255a0;
import qs2.C101294u;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l0 */
public class C95137l0 extends C95295z {

    /* renamed from: s */
    public CircularImageView f276130s;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l0$a */
    public class C95138a implements C100880k.C100881a {
        public C95138a() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp$1");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp$1");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp$1");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp$1");
            try {
                C95137l0.this.mo131666E(BitmapUtil.decodeFile(str));
            } catch (Exception e) {
                Log.m105920e("AdLandingPageCircleImgComp", "%s" + Util.stackTraceToString(e));
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp$1");
        }
    }

    public C95137l0(Context context, C101294u uVar, ViewGroup viewGroup) {
        super(context, uVar, viewGroup);
    }

    /* renamed from: E */
    public boolean mo131666E(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
        if (bitmap == null) {
            Log.m105920e("AdLandingPageCircleImgComp", "when set image the bmp is null!");
            SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
            return false;
        } else if (this.f276130s == null) {
            Log.m105920e("AdLandingPageCircleImgComp", "when set image the img is null!");
            SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
            return false;
        } else if (bitmap.getWidth() == 0) {
            Log.m105920e("AdLandingPageCircleImgComp", "when set image the bmp.getWidth is 0!");
            SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
            return false;
        } else {
            this.f276130s.setImageBitmap(bitmap);
            SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
            return true;
        }
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
        this.f276130s = (CircularImageView) this.f276586n;
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
    }

    /* renamed from: f */
    public View mo67239f() {
        SnsMethodCalculate.markStartTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
        CircularImageView circularImageView = new CircularImageView(this.f276579d, (AttributeSet) null, 0);
        SnsMethodCalculate.markEndTimeMs("customLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
        return circularImageView;
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
        if (this.f276586n == null || this.f276130s == null) {
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
        C101294u uVar = (C101294u) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
        if (uVar == null) {
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
            return;
        }
        C100891r.m132208c(uVar.f296747z, false, uVar.f296496b, 0, new C95138a());
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C101255a0 a0Var = this.f276580e;
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins((int) a0Var.f296499e, (int) a0Var.f296497c, (int) a0Var.f296500f, (int) a0Var.f296498d);
        }
        this.f276586n.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageCircleImgComp");
    }
}
