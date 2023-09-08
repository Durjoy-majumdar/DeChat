package jt2;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: jt2.a */
public class C99022a {

    /* renamed from: a */
    public Context f290301a;

    /* renamed from: b */
    public View f290302b;

    /* renamed from: c */
    public ValueAnimator f290303c;

    /* renamed from: d */
    public C99023b f290304d;

    /* renamed from: e */
    public int f290305e;

    /* renamed from: f */
    public int f290306f;

    /* renamed from: g */
    public int f290307g;

    /* renamed from: h */
    public int f290308h;

    /* renamed from: i */
    public int f290309i;

    /* renamed from: j */
    public int f290310j;

    /* renamed from: k */
    public int f290311k;

    /* renamed from: l */
    public int f290312l;

    public C99022a(Activity activity, View view, boolean z) {
        this.f290301a = activity;
        this.f290302b = view;
    }

    /* renamed from: a */
    public void mo138367a(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("putParams", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
        this.f290305e = bundle.getInt("param_thumb_left");
        this.f290306f = bundle.getInt("param_thumb_top");
        this.f290307g = bundle.getInt("param_thumb_width");
        this.f290308h = bundle.getInt("param_thumb_height");
        this.f290312l = bundle.getInt("param_target_width");
        int i = bundle.getInt("param_target_height");
        this.f290311k = i;
        this.f290309i = i - this.f290308h;
        this.f290310j = this.f290312l - this.f290307g;
        Log.m105925i("MicroMsg.SnsAdAnimation", "left=%s, top=%s, width=%s, height=%s, targetW=%s, targetH=%s", Integer.valueOf(this.f290305e), Integer.valueOf(this.f290306f), Integer.valueOf(this.f290307g), Integer.valueOf(this.f290308h), Integer.valueOf(this.f290312l), Integer.valueOf(this.f290311k));
        SnsMethodCalculate.markEndTimeMs("putParams", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
    }

    /* renamed from: b */
    public void mo138368b(long j) {
        SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
        ValueAnimator valueAnimator = this.f290303c;
        if (valueAnimator != null && !valueAnimator.isStarted()) {
            this.f290303c.setStartDelay(j);
            this.f290303c.start();
        }
        SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
    }
}
