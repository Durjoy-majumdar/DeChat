package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.sns.ui.LoadingMoreView */
public class LoadingMoreView extends LinearLayout {

    /* renamed from: d */
    public Context f276862d;

    /* renamed from: e */
    public ImageView f276863e;

    /* renamed from: f */
    public LinearLayout f276864f;

    /* renamed from: g */
    public LinearLayout f276865g;

    /* renamed from: h */
    public LinearLayout f276866h;

    /* renamed from: i */
    public TextView f276867i;

    /* renamed from: j */
    public Animation f276868j = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);

    public LoadingMoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f276862d = context;
        mo132181a();
    }

    /* renamed from: a */
    public final void mo132181a() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
        View inflate = LayoutInflater.from(this.f276862d).inflate(C0966R.C0971layout.c3r, this, true);
        this.f276863e = (ImageView) findViewById(C0966R.C0970id.f5740nb);
        this.f276864f = (LinearLayout) inflate.findViewById(C0966R.C0970id.g3g);
        this.f276865g = (LinearLayout) inflate.findViewById(C0966R.C0970id.g39);
        this.f276866h = (LinearLayout) inflate.findViewById(C0966R.C0970id.ifi);
        this.f276867i = (TextView) inflate.findViewById(C0966R.C0970id.ifj);
        this.f276864f.setVisibility(0);
        this.f276865g.setVisibility(8);
        this.f276866h.setVisibility(8);
        this.f276868j.setDuration(1000);
        this.f276868j.setRepeatCount(-1);
        this.f276868j.setInterpolator(new LinearInterpolator());
        this.f276863e.startAnimation(this.f276868j);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
    }

    /* renamed from: b */
    public void mo132182b(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("onIsRecent", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
        this.f276864f.setVisibility(8);
        if (Util.isNullOrNil(str)) {
            this.f276865g.setVisibility(0);
            this.f276866h.setVisibility(8);
        } else {
            this.f276866h.setVisibility(0);
            this.f276865g.setVisibility(8);
            this.f276867i.setText(str);
        }
        SnsMethodCalculate.markEndTimeMs("onIsRecent", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
    }

    public LoadingMoreView(Context context) {
        super(context);
        this.f276862d = context;
        mo132181a();
    }
}
