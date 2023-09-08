package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import ps2.C100880k;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.d */
public class C95277d implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ ContentFragment f276532a;

    public C95277d(ContentFragment contentFragment) {
        this.f276532a = contentFragment;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$6");
        Log.m105918d("ContentFragment", "onDownloadError nextBtn");
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$6");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$6");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$6");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$6");
        Log.m105918d("ContentFragment", "onDownloaded nextBtn");
        ContentFragment contentFragment = this.f276532a;
        ImageView imageView = ContentFragment.m121305M(contentFragment).f276524d;
        SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        contentFragment.getClass();
        SnsMethodCalculate.markStartTimeMs("setPageDownIcon", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        Bitmap decodeFile = BitmapUtil.decodeFile(str);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (Float.compare(contentFragment.f276500i.f296736b, 0.0f) > 0) {
            layoutParams.width = (int) contentFragment.f276500i.f296736b;
        } else {
            layoutParams.width = -1;
        }
        if (Float.compare(contentFragment.f276500i.f296737c, 0.0f) > 0) {
            layoutParams.height = (int) contentFragment.f276500i.f296737c;
        } else {
            layoutParams.height = -2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) contentFragment.f276500i.f296738d;
        }
        imageView.setImageBitmap(decodeFile);
        SnsMethodCalculate.markEndTimeMs("setPageDownIcon", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        this.f276532a.mo131814Z();
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$6");
    }
}
