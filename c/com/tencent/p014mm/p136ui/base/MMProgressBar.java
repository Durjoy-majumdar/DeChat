package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.traceroute.p115ui.NetworkDiagnoseUI;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.ui.base.MMProgressBar */
public class MMProgressBar extends LinearLayout {

    /* renamed from: d */
    public int f249927d = 100;

    /* renamed from: e */
    public int f249928e = 0;

    /* renamed from: f */
    public int f249929f = 0;

    /* renamed from: g */
    public TextView f249930g;

    /* renamed from: h */
    public TextView f249931h;

    /* renamed from: i */
    public C85814b f249932i;

    /* renamed from: j */
    public MTimerHandler f249933j = new MTimerHandler(new C85813a(), false);

    /* renamed from: com.tencent.mm.ui.base.MMProgressBar$a */
    public class C85813a implements MTimerHandler.CallBack {
        public C85813a() {
        }

        public boolean onTimerExpired() {
            MMProgressBar mMProgressBar = MMProgressBar.this;
            int i = mMProgressBar.f249929f;
            int i2 = mMProgressBar.f249928e;
            int i3 = i - i2;
            if (i3 <= 0) {
                return false;
            }
            int i4 = (int) (((double) i3) * 0.6d);
            if (i4 <= 0) {
                i4 = 1;
            }
            int i5 = i2 + i4;
            mMProgressBar.f249928e = i5;
            MMProgressBar.m106033a(mMProgressBar, i5);
            MMProgressBar mMProgressBar2 = MMProgressBar.this;
            MTimerHandler mTimerHandler = mMProgressBar2.f249933j;
            int i6 = mMProgressBar2.f249927d;
            mTimerHandler.startTimer((long) (((i6 - i3) * 40) / i6));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMProgressBar$b */
    public interface C85814b {
    }

    public MMProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), C0966R.C0971layout.bfc, this);
        this.f249930g = (TextView) findViewById(C0966R.C0970id.gvg);
        this.f249931h = (TextView) findViewById(C0966R.C0970id.gvh);
    }

    /* renamed from: a */
    public static void m106033a(MMProgressBar mMProgressBar, int i) {
        mMProgressBar.f249930g.setWidth(mMProgressBar.getProgressLength());
        C85814b bVar = mMProgressBar.f249932i;
        if (bVar != null) {
            NetworkDiagnoseUI.C85495c cVar = (NetworkDiagnoseUI.C85495c) bVar;
            if (i < 5) {
                NetworkDiagnoseUI networkDiagnoseUI = NetworkDiagnoseUI.this;
                networkDiagnoseUI.f249153h.setText(networkDiagnoseUI.getString(C0966R.string.bjk));
            } else if (i < 5 || i >= 95) {
                NetworkDiagnoseUI networkDiagnoseUI2 = NetworkDiagnoseUI.this;
                networkDiagnoseUI2.f249153h.setText(networkDiagnoseUI2.getString(C0966R.string.k7w));
            } else {
                NetworkDiagnoseUI networkDiagnoseUI3 = NetworkDiagnoseUI.this;
                networkDiagnoseUI3.f249153h.setText(networkDiagnoseUI3.getString(C0966R.string.fet));
            }
        }
    }

    private int getProgressLength() {
        int width = (getWidth() * this.f249928e) / this.f249927d;
        return width < BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 20.0f) ? BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 20.0f) : width;
    }

    public int getMax() {
        return this.f249927d;
    }

    public int getProgress() {
        return this.f249929f;
    }

    public void setAutoProgress(boolean z) {
        if (z) {
            this.f249933j.startTimer(40);
        } else {
            this.f249933j.stopTimer();
        }
    }

    public void setMax(int i) {
        this.f249927d = i;
    }

    public void setOnProgressChangedListener(C85814b bVar) {
        this.f249932i = bVar;
    }

    public void setProgress(int i) {
        int i2 = this.f249927d;
        if (i > i2) {
            i = i2;
        }
        this.f249929f = i;
        if (this.f249933j.stopped()) {
            setAutoProgress(true);
        }
    }

    public void setTips(CharSequence charSequence) {
        this.f249931h.setText(charSequence);
    }
}
