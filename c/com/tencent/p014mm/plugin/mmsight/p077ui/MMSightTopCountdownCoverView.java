package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView */
public class MMSightTopCountdownCoverView extends FrameLayout {

    /* renamed from: d */
    public final MMHandler f115175d = new MMHandler(Looper.getMainLooper());

    /* renamed from: e */
    public final View f115176e;

    /* renamed from: f */
    public final ImageView f115177f;

    /* renamed from: g */
    public final TextView f115178g;

    /* renamed from: h */
    public final TextView f115179h;

    /* renamed from: i */
    public long f115180i;

    /* renamed from: j */
    public long f115181j;

    /* renamed from: n */
    public final Runnable f115182n = new C42571a();

    /* renamed from: o */
    public final Runnable f115183o = new C42572b();

    /* renamed from: p */
    public final ObjectAnimator f115184p;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView$a */
    public class C42571a implements Runnable {
        public C42571a() {
        }

        public void run() {
            MMSightTopCountdownCoverView mMSightTopCountdownCoverView = MMSightTopCountdownCoverView.this;
            View view = mMSightTopCountdownCoverView.f115176e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView", "switchToAlmostEndState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView", "switchToAlmostEndState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mMSightTopCountdownCoverView.f115179h.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mMSightTopCountdownCoverView.f115178g.getLayoutParams();
            layoutParams.removeRule(13);
            layoutParams.addRule(14);
            layoutParams.addRule(2, mMSightTopCountdownCoverView.f115176e.getId());
            mMSightTopCountdownCoverView.requestLayout();
            mMSightTopCountdownCoverView.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightTopCountdownCoverView$b */
    public class C42572b implements Runnable {
        public C42572b() {
        }

        public void run() {
            MMSightTopCountdownCoverView mMSightTopCountdownCoverView = MMSightTopCountdownCoverView.this;
            long j = (mMSightTopCountdownCoverView.f115181j - 400) - mMSightTopCountdownCoverView.f115180i;
            TimeUnit timeUnit = TimeUnit.MINUTES;
            MMSightTopCountdownCoverView.this.f115178g.setText(String.format(Locale.US, "%02d:%02d", new Object[]{Long.valueOf(j / timeUnit.toMillis(1)), Long.valueOf(Math.max(Math.round(((double) (j % timeUnit.toMillis(1))) / ((double) TimeUnit.SECONDS.toMillis(1))), 0))}));
            MMSightTopCountdownCoverView.this.f115175d.postDelayed(this, 1000);
            MMSightTopCountdownCoverView.this.f115180i += 1000;
        }
    }

    public MMSightTopCountdownCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bfx, this, true);
        this.f115176e = findViewById(C0966R.C0970id.ayh);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.bu5);
        this.f115177f = imageView;
        this.f115178g = (TextView) findViewById(C0966R.C0970id.bu6);
        this.f115179h = (TextView) findViewById(C0966R.C0970id.f357802bu2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{1.0f, 0.0f, 1.0f});
        this.f115184p = ofFloat;
        ofFloat.setDuration(2000);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        setBackgroundColor(Color.argb(Math.round(127.5f), 0, 0, 0));
        mo66661a();
        setVisibility(4);
    }

    /* renamed from: a */
    public void mo66661a() {
        Context context = getContext();
        if (context instanceof Activity) {
            Rect m = C85875k4.m106194m((Activity) context);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            if (m != null) {
                paddingTop += m.top;
            }
            setPadding(paddingLeft, paddingTop, getPaddingRight(), getPaddingBottom());
        }
    }

    /* renamed from: b */
    public void mo66662b() {
        if (this.f115181j > 0) {
            this.f115175d.removeCallbacks(this.f115183o);
            this.f115175d.removeCallbacks(this.f115182n);
            this.f115184p.cancel();
            this.f115177f.setAlpha(1.0f);
            this.f115178g.setText(String.format(Locale.US, "%02d:%02d", new Object[]{0, 0}));
            this.f115181j = 0;
            this.f115180i = 0;
        }
        setVisibility(4);
    }

    /* renamed from: c */
    public void mo66663c(long j) {
        setVisibility(0);
        this.f115180i = 0;
        long j2 = 1000 * j;
        this.f115181j = j2;
        this.f115175d.removeCallbacks(this.f115183o);
        this.f115175d.removeCallbacks(this.f115182n);
        View view = this.f115176e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView", "switchToNormalState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView", "switchToNormalState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f115179h.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f115178g.getLayoutParams();
        layoutParams.removeRule(2);
        layoutParams.addRule(13);
        requestLayout();
        invalidate();
        this.f115184p.start();
        ((C42572b) this.f115183o).run();
        this.f115175d.postDelayed(this.f115182n, Math.max(0, j2 - FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f115175d.removeCallbacks(this.f115183o);
        this.f115175d.removeCallbacks(this.f115182n);
        this.f115184p.cancel();
    }

    public MMSightTopCountdownCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bfx, this, true);
        this.f115176e = findViewById(C0966R.C0970id.ayh);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.bu5);
        this.f115177f = imageView;
        this.f115178g = (TextView) findViewById(C0966R.C0970id.bu6);
        this.f115179h = (TextView) findViewById(C0966R.C0970id.f357802bu2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "alpha", new float[]{1.0f, 0.0f, 1.0f});
        this.f115184p = ofFloat;
        ofFloat.setDuration(2000);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        setBackgroundColor(Color.argb(Math.round(127.5f), 0, 0, 0));
        mo66661a();
        setVisibility(4);
    }
}
