package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMTextureView;
import com.tencent.p014mm.plugin.sns.p106ui.C96311x2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import rq2.C63489a;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView */
public class SnsAdCardVideoEndView extends FrameLayout {

    /* renamed from: d */
    public C96311x2 f281455d;

    /* renamed from: e */
    public ImageView f281456e;

    /* renamed from: f */
    public View f281457f;

    /* renamed from: g */
    public TextView f281458g;

    /* renamed from: h */
    public TextView f281459h;

    /* renamed from: i */
    public TextView f281460i;

    /* renamed from: j */
    public View f281461j;

    /* renamed from: n */
    public ImageView f281462n;

    /* renamed from: o */
    public TextView f281463o;

    /* renamed from: p */
    public TextView f281464p;

    /* renamed from: q */
    public ImageView f281465q;

    /* renamed from: r */
    public int f281466r;

    /* renamed from: s */
    public String f281467s = "";

    /* renamed from: t */
    public SnsInfo f281468t = null;

    /* renamed from: u */
    public boolean f281469u = false;

    /* renamed from: v */
    public long f281470v = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView$a */
    public class C96285a implements Animation.AnimationListener {
        public C96285a() {
        }

        public void onAnimationEnd(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView$1");
            SnsAdCardVideoEndView.this.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView$1");
        }

        public void onAnimationRepeat(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView$1");
        }

        public void onAnimationStart(Animation animation) {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView$1");
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView$1");
        }
    }

    public SnsAdCardVideoEndView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.c4i, this);
        this.f281456e = (ImageView) findViewById(C0966R.C0970id.gos);
        this.f281457f = findViewById(C0966R.C0970id.kz5);
        this.f281458g = (TextView) findViewById(C0966R.C0970id.kz7);
        this.f281459h = (TextView) findViewById(C0966R.C0970id.kz4);
        this.f281460i = (TextView) findViewById(C0966R.C0970id.kz6);
        this.f281461j = findViewById(C0966R.C0970id.f6b);
        this.f281462n = (ImageView) findViewById(C0966R.C0970id.f6a);
        this.f281463o = (TextView) findViewById(C0966R.C0970id.f6_);
        this.f281464p = (TextView) findViewById(C0966R.C0970id.f6c);
        this.f281465q = (ImageView) findViewById(C0966R.C0970id.bv7);
        this.f281456e.setBackgroundColor(Color.parseColor("#7f000000"));
        C102260r.m134856Y(this.f281458g, C0966R.dimen.anv);
        C102260r.m134856Y(this.f281459h, C0966R.dimen.ans);
        C102260r.m134856Y(this.f281460i, C0966R.dimen.anu);
        C102260r.m134856Y(this.f281463o, C0966R.dimen.ant);
        C102260r.m134856Y(this.f281464p, C0966R.dimen.anu);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    /* renamed from: e */
    public static void m123450e(SnsInfo snsInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("reportVideoEndViewClick", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        if (snsInfo == null) {
            Log.m105920e("SnsAdCardVideoEndView", "reportVideoEndViewClick snsInfo==null, scene=" + i);
            SnsMethodCalculate.markEndTimeMs("reportVideoEndViewClick", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("clickCount", 1);
            jSONObject2.put("type", 4);
            String nullAsNil = Util.nullAsNil(snsInfo.getUxinfo());
            jSONObject.put("extInfo", jSONObject2);
            jSONObject.put("uxinfo", nullAsNil);
            jSONObject.put("snsid", snsInfo.field_snsId);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
            String jSONObject3 = jSONObject.toString();
            C102260r.m134858a("17539", jSONObject3);
            Log.m105924i("SnsAdCardVideoEndView", "reportVideoEndViewClick 17539, content=" + jSONObject3);
        } catch (Exception e) {
            Log.m105920e("SnsAdCardVideoEndView", "reportVideoEndViewClick exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportVideoEndViewClick", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    /* renamed from: a */
    public boolean mo134009a(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("checkSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        String snsId = snsInfo.getSnsId();
        if (TextUtils.isEmpty(this.f281467s) || !this.f281467s.equals(snsId)) {
            Log.m105924i("SnsAdCardVideoEndView", "checkSnsId changed, old=" + this.f281467s + ", new=" + snsId);
            this.f281470v = 0;
            mo134011c(false);
            this.f281467s = snsId;
            this.f281468t = snsInfo;
            this.f281469u = false;
            setBackgroundDrawable((Drawable) null);
            SnsMethodCalculate.markEndTimeMs("checkSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("checkSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        return false;
    }

    /* renamed from: b */
    public final void mo134010b() {
        SnsMethodCalculate.markStartTimeMs("doReportExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        if (!(this.f281468t == null || this.f281455d == null || this.f281470v <= 0)) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f281470v;
            float f = (float) (currentTimeMillis - j);
            int i = this.f281455d.f281634e;
            if (f > ((float) i)) {
                f = (float) i;
            }
            SnsInfo snsInfo = this.f281468t;
            float f2 = f / 1000.0f;
            SnsMethodCalculate.markStartTimeMs("reportVideoEndViewExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            if (snsInfo == null) {
                Log.m105920e("SnsAdCardVideoEndView", "reportVideoEndViewExpouse snsInfo==null");
                SnsMethodCalculate.markEndTimeMs("reportVideoEndViewExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            } else {
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("exposureDuration", (double) f2);
                    jSONObject2.put("startTimestamp", j);
                    jSONObject2.put("type", 5);
                    String nullAsNil = Util.nullAsNil(snsInfo.getUxinfo());
                    jSONObject.put("extInfo", jSONObject2);
                    jSONObject.put("uxinfo", nullAsNil);
                    jSONObject.put("snsid", snsInfo.field_snsId);
                    jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f281466r);
                    String jSONObject3 = jSONObject.toString();
                    C102260r.m134858a("17539", jSONObject3);
                    Log.m105924i("SnsAdCardVideoEndView", "reportVideoEndViewExpouse 17539, content=" + jSONObject3);
                } catch (Exception e) {
                    Log.m105920e("SnsAdCardVideoEndView", "reportVideoEndViewExpouse exp:" + e.toString());
                }
                SnsMethodCalculate.markEndTimeMs("reportVideoEndViewExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            }
            this.f281470v = 0;
        }
        SnsMethodCalculate.markEndTimeMs("doReportExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    /* renamed from: c */
    public void mo134011c(boolean z) {
        SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        Log.m105924i("SnsAdCardVideoEndView", "hide, anim=" + z);
        if (getVisibility() == 0) {
            mo134010b();
        }
        if (!z) {
            setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(250);
        alphaAnimation.setAnimationListener(new C96285a());
        startAnimation(alphaAnimation);
        SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    /* renamed from: d */
    public void mo134012d() {
        SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        C96311x2 x2Var = this.f281455d;
        if (x2Var == null) {
            SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        if (!TextUtils.isEmpty(x2Var.f281630a)) {
            this.f281458g.setText(this.f281455d.f281630a);
            this.f281459h.setText(this.f281455d.f281632c);
            this.f281460i.setText(this.f281455d.f281633d);
            View view = this.f281457f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f281461j;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f281463o.setText(this.f281455d.f281632c);
            this.f281464p.setText(this.f281455d.f281633d);
            if (!TextUtils.isEmpty(this.f281455d.f281631b)) {
                C63489a.m74826a(this.f281455d.f281631b, this.f281462n);
            }
            View view5 = this.f281457f;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f281461j;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!TextUtils.isEmpty(this.f281455d.f281635f)) {
            this.f281465q.setVisibility(0);
            C63489a.m74826a(this.f281455d.f281635f, this.f281465q);
        } else {
            this.f281465q.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    /* renamed from: f */
    public void mo134013f(boolean z) {
        SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        Log.m105924i("SnsAdCardVideoEndView", "show, anim=" + z);
        this.f281470v = System.currentTimeMillis();
        if (!z) {
            setVisibility(0);
            SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setStartOffset(100);
        alphaAnimation.setDuration(300);
        setVisibility(0);
        startAnimation(alphaAnimation);
        SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            Log.m105924i("SnsAdCardVideoEndView", "onAttachedToWindow");
        }
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        super.onDetachedFromWindow();
        if (getVisibility() == 0) {
            Log.m105924i("SnsAdCardVideoEndView", "onDetachedFromWindow");
            mo134010b();
        }
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public void setBlurBkg(View view) {
        SnsMethodCalculate.markStartTimeMs("setBlurBkg", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        try {
            if (this.f281469u) {
                SnsMethodCalculate.markEndTimeMs("setBlurBkg", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Bitmap bitmap = view instanceof MMTextureView ? ((MMTextureView) view).getBitmap() : view instanceof com.tencent.p014mm.plugin.thumbplayer.view.MMTextureView ? ((com.tencent.p014mm.plugin.thumbplayer.view.MMTextureView) view).getBitmap() : BitmapUtil.getBitmapFromView(view);
            long currentTimeMillis2 = System.currentTimeMillis();
            int width = bitmap.getWidth() / 5;
            int height = bitmap.getHeight() / 5;
            Bitmap fastblur = BitmapUtil.fastblur(Bitmap.createScaledBitmap(bitmap, width, height, false), 20);
            long currentTimeMillis3 = System.currentTimeMillis();
            setBackgroundDrawable(new BitmapDrawable(fastblur));
            this.f281469u = true;
            Log.m105924i("SnsAdCardVideoEndView", "setBlurBkg, totalCost=" + (currentTimeMillis3 - currentTimeMillis) + ", captureCost=" + (currentTimeMillis2 - currentTimeMillis) + ", blurCost=" + (currentTimeMillis3 - currentTimeMillis2) + ", w=" + width + ", h=" + height);
            SnsMethodCalculate.markEndTimeMs("setBlurBkg", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        } catch (Throwable th) {
            Log.m105920e("SnsAdCardVideoEndView", "setBlurBkg, exp=" + th.toString());
            this.f281469u = false;
        }
    }
}
