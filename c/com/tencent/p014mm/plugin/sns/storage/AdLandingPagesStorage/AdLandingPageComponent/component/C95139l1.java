package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ps2.C100880k;
import ps2.C100891r;
import qs2.C101265f0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l1 */
public class C95139l1 extends C95295z {

    /* renamed from: s */
    public TextView f276132s;

    /* renamed from: t */
    public RelativeLayout f276133t;

    /* renamed from: u */
    public ImageView f276134u;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l1$a */
    public class C95140a implements C100880k.C100881a {
        public C95140a() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent$1");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent$1");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent$1");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent$1");
            try {
                Bitmap decodeFile = BitmapUtil.decodeFile(str);
                C95139l1 l1Var = C95139l1.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
                ImageView imageView = l1Var.f276134u;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
                imageView.setImageBitmap(decodeFile);
                C95139l1 l1Var2 = C95139l1.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
                TextView textView = l1Var2.f276132s;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
                float E = C95139l1.m121052E(l1Var2, textView);
                C95139l1 l1Var3 = C95139l1.this;
                float applyDimension = (l1Var3.f276580e.f296501g - E) - TypedValue.applyDimension(1, 3.0f, l1Var3.f276579d.getResources().getDisplayMetrics());
                C95139l1 l1Var4 = C95139l1.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
                C101265f0 G = l1Var4.mo131667G();
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
                int i = (int) (applyDimension - (G.f296590B * applyDimension));
                C95139l1 l1Var5 = C95139l1.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
                ImageView imageView2 = l1Var5.f276134u;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
                int i2 = layoutParams.leftMargin;
                layoutParams.setMargins(i2, layoutParams.topMargin, i, i2);
                C95139l1 l1Var6 = C95139l1.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
                ImageView imageView3 = l1Var6.f276134u;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
                imageView3.setLayoutParams(layoutParams);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageProcessBarComponent", "%s" + Util.stackTraceToString(e));
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent$1");
        }
    }

    public C95139l1(Context context, C101265f0 f0Var, ViewGroup viewGroup) {
        super(context, f0Var, viewGroup);
        this.f276580e = f0Var;
    }

    /* renamed from: E */
    public static float m121052E(C95139l1 l1Var, TextView textView) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        l1Var.getClass();
        SnsMethodCalculate.markStartTimeMs("measureTextWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        Paint paint = new Paint();
        String charSequence = textView.getText().toString();
        paint.setTextSize(textView.getTextSize());
        float measureText = paint.measureText(charSequence, 0, charSequence.length());
        SnsMethodCalculate.markEndTimeMs("measureTextWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        return measureText;
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        super.mo124360B();
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        super.mo67235C();
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        super.mo124361D();
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
    }

    /* renamed from: G */
    public final C101265f0 mo131667G() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        C101265f0 f0Var = (C101265f0) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        return f0Var;
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        View view = this.f276586n;
        view.setBackgroundColor(this.f276581f);
        this.f276132s = (TextView) view.findViewById(C0966R.C0970id.jq4);
        this.f276133t = (RelativeLayout) view.findViewById(C0966R.C0970id.f359236jq2);
        this.f276134u = (ImageView) view.findViewById(C0966R.C0970id.f359237jq3);
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        this.f276132s.setText(mo131667G().f296593z);
        this.f276132s.setTextSize(0, mo131667G().f296589A);
        if (mo131667G().f296592D != null && mo131667G().f296592D.length() > 0) {
            this.f276133t.setBackgroundColor(Color.parseColor(mo131667G().f296592D));
        }
        C100891r.m132208c(mo131667G().f296591C, false, mo131667G().f296496b, 0, new C95140a());
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageProcessBarComponent");
        return C0966R.C0971layout.c1e;
    }
}
