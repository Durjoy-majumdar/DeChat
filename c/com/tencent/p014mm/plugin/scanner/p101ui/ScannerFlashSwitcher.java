package com.tencent.p014mm.plugin.scanner.p101ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher */
public class ScannerFlashSwitcher extends LinearLayout {

    /* renamed from: d */
    public ImageView f53784d;

    /* renamed from: e */
    public TextView f53785e;

    /* renamed from: f */
    public boolean f53786f = false;

    /* renamed from: g */
    public boolean f53787g;

    /* renamed from: h */
    public boolean f53788h;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher$a */
    public class C19117a implements ValueAnimator.AnimatorUpdateListener {
        public C19117a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScannerFlashSwitcher.this.f53784d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher$b */
    public class C19118b extends AnimatorListenerAdapter {
        public C19118b() {
        }

        public void onAnimationEnd(Animator animator) {
            ScannerFlashSwitcher.this.f53784d.setAlpha(1.0f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher$c */
    public class C19119c extends AnimatorListenerAdapter {
        public C19119c() {
        }

        public void onAnimationEnd(Animator animator) {
            ScannerFlashSwitcher.this.setVisibility(8);
        }
    }

    public ScannerFlashSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo24461c();
    }

    /* renamed from: a */
    public void mo24459a() {
        Log.m105924i("MicroMsg.ScannerFlashSwitcher", "closeFlashStatus");
        this.f53787g = false;
        this.f53784d.setImageResource(C0966R.raw.scanner_flash_open_normal);
        this.f53785e.setText(C0966R.string.f361232ic3);
    }

    /* renamed from: b */
    public void mo24460b() {
        Log.m105924i("MicroMsg.ScannerFlashSwitcher", "hide");
        setEnabled(false);
        this.f53788h = false;
        this.f53784d.animate().alpha(0.0f).setDuration(500);
        this.f53785e.animate().alpha(0.0f).setDuration(500).setListener(new C19119c());
        this.f53787g = false;
    }

    /* renamed from: c */
    public final void mo24461c() {
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.buk, this, true);
        this.f53784d = (ImageView) findViewById(C0966R.C0970id.e_z);
        this.f53785e = (TextView) findViewById(C0966R.C0970id.e_v);
        this.f53786f = true;
    }

    /* renamed from: d */
    public void mo24462d() {
        Log.m105925i("MicroMsg.ScannerFlashSwitcher", "show, isFirstShow: %s", Boolean.valueOf(this.f53786f));
        this.f53788h = true;
        if (this.f53786f) {
            this.f53784d.setAlpha(0.0f);
            this.f53785e.setAlpha(0.0f);
            setVisibility(0);
            this.f53785e.animate().alpha(1.0f).setListener((Animator.AnimatorListener) null).setDuration(500);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new C19117a());
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(500);
            ofFloat.addListener(new C19118b());
            ofFloat.start();
            this.f53786f = false;
        } else {
            setVisibility(0);
            this.f53785e.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).start();
            this.f53784d.animate().alpha(1.0f).setDuration(500).setListener((Animator.AnimatorListener) null).start();
        }
        setEnabled(true);
    }

    public ScannerFlashSwitcher(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo24461c();
    }
}
