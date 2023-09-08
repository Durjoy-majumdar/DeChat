package com.tencent.p014mm.plugin.ball.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import aw0.C103926n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ball.p1099ui.C105060a0;
import com.tencent.p014mm.plugin.ball.p1099ui.C105062b0;
import com.tencent.p014mm.sdk.platformtools.Log;
import hi3.C87515a;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.ball.view.FloatIndicatorView */
public class FloatIndicatorView extends FrameLayout {

    /* renamed from: d */
    public ImageView f312025d;

    /* renamed from: e */
    public ImageView f312026e;

    /* renamed from: f */
    public TextView f312027f;

    /* renamed from: g */
    public C105104a f312028g;

    /* renamed from: com.tencent.mm.plugin.ball.view.FloatIndicatorView$a */
    public interface C105104a {
    }

    public FloatIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo149356a(int i) {
        if (i >= 5) {
            Log.m105925i("MicroMsg.FloatIndicatorView", "onFloatBallInfoCountChanged, float ball full, count:%s", Integer.valueOf(i));
            this.f312027f.setText(C0966R.string.eve);
            this.f312027f.setTextColor(C111105a.m151500b(getContext(), C0966R.color.f3463tw));
            this.f312025d.setImageResource(C0966R.C0969drawable.f4501eb);
            this.f312026e.setImageDrawable(C87515a.m108835e(getResources(), C0966R.raw.float_indicator_full_icon, 0.0f));
            return;
        }
        Log.m105925i("MicroMsg.FloatIndicatorView", "onFloatBallInfoCountChanged, float ball not full, count:%s", Integer.valueOf(i));
        this.f312027f.setText(C0966R.string.caj);
        this.f312027f.setTextColor(C111105a.m151500b(getContext(), C0966R.color.f3464tx));
        this.f312025d.setImageResource(C0966R.C0969drawable.f4502ec);
        this.f312026e.setImageDrawable(C87515a.m108835e(getResources(), C0966R.raw.float_indicator_icon, 0.0f));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C105104a aVar = this.f312028g;
        if (aVar != null && configuration != null) {
            boolean z = configuration.orientation == 2;
            C105060a0 a0Var = (C105060a0) aVar;
            a0Var.getClass();
            Log.m105925i("MicroMsg.FloatIndicatorController", "onOrientationChanged, isLandscape:%s", Boolean.valueOf(z));
            a0Var.f311829a.mo149214b(z);
            C105062b0 b0Var = a0Var.f311829a;
            FrameLayout.LayoutParams layoutParams = b0Var.f311835e;
            layoutParams.bottomMargin = b0Var.f311834d;
            layoutParams.rightMargin = b0Var.f311833c;
            b0Var.f311832b.setLayoutParams(layoutParams);
            Log.m105925i("MicroMsg.FloatIndicatorController", "onOrientationChanged layoutParams, right:%s, bottom:%s", Integer.valueOf(a0Var.f311829a.f311835e.rightMargin), Integer.valueOf(a0Var.f311829a.f311835e.bottomMargin));
        }
    }

    public void setOnOrientationChangedListener(C105104a aVar) {
        this.f312028g = aVar;
    }

    public FloatIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, C0966R.C0971layout.b4_, this);
        this.f312025d = (ImageView) findViewById(C0966R.C0970id.a3b);
        this.f312026e = (ImageView) findViewById(C0966R.C0970id.f6l);
        this.f312027f = (TextView) findViewById(C0966R.C0970id.f6m);
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        float f = C103926n.f307297g;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f312025d, "scaleX", new float[]{f, 1.0f});
        ofFloat.setDuration(200);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f312025d, "scaleY", new float[]{f, 1.0f});
        ofFloat2.setDuration(200);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f312025d, "scaleX", new float[]{1.0f, f});
        ofFloat3.setDuration(200);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f312025d, "scaleY", new float[]{1.0f, f});
        ofFloat4.setDuration(200);
        animatorSet2.playTogether(new Animator[]{ofFloat3, ofFloat4});
    }
}
