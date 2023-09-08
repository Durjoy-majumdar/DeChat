package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONException;
import org.json.JSONObject;
import ps2.C100880k;
import ps2.C100891r;
import qs2.C101255a0;
import qs2.C101294u;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j */
public class C95126j extends C95295z {

    /* renamed from: s */
    public ImageView f276074s;

    /* renamed from: t */
    public ProgressBar f276075t;

    /* renamed from: u */
    public boolean f276076u = true;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j$a */
    public class C95127a implements C100880k.C100881a {
        public C95127a() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp$1");
            C95126j jVar = C95126j.this;
            jVar.getClass();
            SnsMethodCalculate.markStartTimeMs("stopLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            jVar.f276075t.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("stopLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp$1");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp$1");
            C95126j jVar = C95126j.this;
            jVar.getClass();
            SnsMethodCalculate.markStartTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            jVar.f276075t.setVisibility(0);
            SnsMethodCalculate.markEndTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp$1");
            try {
                C95126j jVar = C95126j.this;
                jVar.getClass();
                SnsMethodCalculate.markStartTimeMs("stopLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
                jVar.f276075t.setVisibility(8);
                SnsMethodCalculate.markEndTimeMs("stopLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
                C95126j.this.mo131647G(BitmapUtil.decodeFile(str));
            } catch (Exception e) {
                Log.m105920e("AdLandingImageComp", "%s" + Util.stackTraceToString(e));
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp$1");
        }
    }

    public C95126j(Context context, ViewGroup viewGroup) {
        super(context, (C101255a0) null, viewGroup);
    }

    /* renamed from: E */
    public final C101294u mo131646E() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
        C101294u uVar = (C101294u) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
        return uVar;
    }

    /* renamed from: G */
    public boolean mo131647G(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
        if (bitmap == null) {
            Log.m105920e("AdLandingImageComp", "when set image the bmp is null!");
            SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            return false;
        } else if (this.f276074s == null) {
            Log.m105920e("AdLandingImageComp", "when set image the imageView is null!");
            SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            return false;
        } else if (bitmap.getWidth() == 0) {
            Log.m105920e("AdLandingImageComp", "when set image the bmp.getWidth is 0!");
            SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            return false;
        } else {
            this.f276074s.setImageBitmap(bitmap);
            this.f276075t.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            return true;
        }
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
        View view = this.f276586n;
        this.f276074s = (ImageView) view.findViewById(C0966R.C0970id.jql);
        this.f276075t = (ProgressBar) view.findViewById(C0966R.C0970id.i89);
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
        if (this.f276586n == null || this.f276074s == null || this.f276075t == null) {
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
        } else if (mo131646E() == null) {
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
        } else {
            float f = mo131646E().f296497c;
            float f2 = mo131646E().f296498d;
            float f3 = mo131646E().f296499e;
            float f4 = mo131646E().f296500f;
            String str = mo131646E().f296747z;
            float f5 = mo131646E().f296508n;
            float f6 = mo131646E().f296507m;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f276074s.getLayoutParams();
            layoutParams.width = (int) f6;
            layoutParams.height = (int) f5;
            this.f276074s.setLayoutParams(layoutParams);
            this.f276076u = false;
            SnsMethodCalculate.markStartTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            this.f276075t.setVisibility(0);
            SnsMethodCalculate.markEndTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            C100891r.m132208c(str, false, mo131646E().f296496b, 0, new C95127a());
            this.f276586n.setPadding((int) f3, (int) f, (int) f4, (int) f2);
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
        }
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
        return C0966R.C0971layout.c1a;
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            return false;
        }
        try {
            if (!this.f276076u) {
                String mD5String = MD5Util.getMD5String(mo131646E().f296747z);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("urlMd5", mD5String);
                jSONObject2.put("needDownload", 1);
                jSONObject.put("imgUrlInfo", jSONObject2);
            }
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            return true;
        } catch (JSONException e) {
            Log.printErrStackTrace("AdLandingImageComp", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingImageComp");
            return false;
        }
    }
}
