package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import ud3.C101998d;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView */
public class WalletAwardShakeAnimView extends RelativeLayout {

    /* renamed from: d */
    public View f210712d;

    /* renamed from: e */
    public TextView f210713e;

    /* renamed from: f */
    public C101998d f210714f;

    /* renamed from: g */
    public long f210715g;

    /* renamed from: h */
    public boolean f210716h = false;

    /* renamed from: i */
    public boolean f210717i = false;

    /* renamed from: j */
    public String f210718j;

    /* renamed from: n */
    public int f210719n = 0;

    /* renamed from: o */
    public String f210720o;

    /* renamed from: p */
    public int f210721p = 0;

    /* renamed from: q */
    public ValueAnimator f210722q;

    /* renamed from: r */
    public C72444c f210723r;

    /* renamed from: s */
    public Runnable f210724s = new C72442a();

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView$a */
    public class C72442a implements Runnable {
        public C72442a() {
        }

        public void run() {
            WalletAwardShakeAnimView walletAwardShakeAnimView = WalletAwardShakeAnimView.this;
            Log.m105925i("MicroMsg.WalletAwardShakeAnimView", "delayNotifyClick, isInvokeCallback: %s", Boolean.valueOf(walletAwardShakeAnimView.f210717i));
            if (!walletAwardShakeAnimView.f210717i) {
                if (!Util.isNullOrNil(walletAwardShakeAnimView.f210720o)) {
                    walletAwardShakeAnimView.f210713e.setText(walletAwardShakeAnimView.f210720o);
                } else {
                    walletAwardShakeAnimView.f210713e.setText(walletAwardShakeAnimView.getContext().getString(C0966R.string.l9g));
                }
                int i = walletAwardShakeAnimView.f210721p;
                if (i != 0) {
                    walletAwardShakeAnimView.f210713e.setTextColor(i);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView$b */
    public class C72443b implements ValueAnimator.AnimatorUpdateListener {
        public C72443b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            WalletAwardShakeAnimView.this.f210712d.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletAwardShakeAnimView$c */
    public interface C72444c {
    }

    public WalletAwardShakeAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo99805c();
    }

    /* renamed from: a */
    public void mo99803a() {
        C101998d dVar = this.f210714f;
        if (dVar != null) {
            dVar.mo141498b();
            this.f210714f = null;
        }
        this.f210717i = false;
        this.f210716h = false;
        ValueAnimator valueAnimator = this.f210722q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f210712d.setRotation(0.0f);
        if (!Util.isNullOrNil(this.f210718j)) {
            this.f210713e.setText(this.f210718j);
        } else {
            this.f210713e.setText(getResources().getText(C0966R.string.l9h));
        }
        int i = this.f210719n;
        if (i != 0) {
            this.f210713e.setTextColor(i);
        } else {
            this.f210713e.setTextColor(getResources().getColor(C0966R.color.a_3));
        }
        MMHandlerThread.removeRunnable(this.f210724s);
    }

    /* renamed from: b */
    public final void mo99804b() {
        ValueAnimator valueAnimator = this.f210722q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{-30.0f, 30.0f});
        this.f210722q = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f210722q.setRepeatMode(2);
        this.f210722q.setRepeatCount(-1);
        this.f210722q.setDuration(300);
        this.f210722q.addUpdateListener(new C72443b());
        this.f210722q.start();
    }

    /* renamed from: c */
    public final void mo99805c() {
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.cdi, this);
        findViewById(C0966R.C0970id.a3a).setBackground(getResources().getDrawable(C0966R.raw.wallet_new_shakea_anim_view_bg));
        this.f210712d = findViewById(C0966R.C0970id.jfn);
        this.f210713e = (TextView) findViewById(C0966R.C0970id.jfm);
    }

    public void setAfterHintWording(String str) {
        this.f210720o = str;
    }

    public void setAfterHintWordingColor(int i) {
        this.f210721p = i;
    }

    public void setShakeHintWording(String str) {
        this.f210718j = str;
        this.f210713e.setText(str);
    }

    public void setShakeHintWordingColor(int i) {
        this.f210719n = i;
        this.f210713e.setTextColor(i);
    }

    public void setShakeOrClickCallback(C72444c cVar) {
        this.f210723r = cVar;
    }

    public WalletAwardShakeAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo99805c();
    }
}
