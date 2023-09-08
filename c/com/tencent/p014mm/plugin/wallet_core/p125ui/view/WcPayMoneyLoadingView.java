package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.robinhood.ticker.TickerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import kg3.C76577a;
import tb3.C77881d;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView */
public class WcPayMoneyLoadingView extends FrameLayout implements C0124r {

    /* renamed from: d */
    public TickerView f210801d;

    /* renamed from: e */
    public ProgressBar f210802e;

    /* renamed from: f */
    public String f210803f = "";

    /* renamed from: g */
    public String f210804g;

    /* renamed from: h */
    public boolean f210805h = false;

    /* renamed from: i */
    public Runnable f210806i = new C72461a();

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView$a */
    public class C72461a implements Runnable {
        public C72461a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.WcPayMoneyLoadingView", "show loading pb");
            WcPayMoneyLoadingView.this.f210802e.setVisibility(0);
            WcPayMoneyLoadingView.this.f210805h = true;
        }
    }

    public WcPayMoneyLoadingView(Context context) {
        super(context);
        mo99853b();
    }

    /* renamed from: a */
    public void mo99852a() {
        setVisibility(8);
        ProgressBar progressBar = this.f210802e;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        removeCallbacks(this.f210806i);
    }

    /* renamed from: b */
    public final void mo99853b() {
        View.inflate(getContext(), C0966R.C0971layout.bgl, this);
        TickerView tickerView = (TickerView) findViewById(C0966R.C0970id.gua);
        this.f210801d = tickerView;
        tickerView.setCharacterLists("0123456789");
    }

    /* renamed from: c */
    public final void mo99854c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C77881d.f226917k, i, 0);
        float dimension = obtainStyledAttributes.getDimension(0, 15.0f);
        int color = obtainStyledAttributes.getColor(1, -16777216);
        int integer = obtainStyledAttributes.getInteger(3, 4);
        obtainStyledAttributes.getInteger(2, 0);
        obtainStyledAttributes.recycle();
        setTextSize(dimension);
        setTextColor(color);
        setTypeface(C75228t.m90274w(getContext(), integer));
    }

    /* renamed from: d */
    public void mo99855d() {
        Log.m105918d("MicroMsg.WcPayMoneyLoadingView", "reset money");
        this.f210804g = null;
    }

    /* renamed from: e */
    public void mo99856e(String str, boolean z, boolean z2) {
        if (str != null) {
            if (z2) {
                this.f210805h = true;
            }
            if (Util.isNullOrNil(this.f210804g)) {
                setFirstMoney(str);
                if (z) {
                    removeCallbacks(this.f210806i);
                    return;
                }
                return;
            }
            setNewMoney(str);
        }
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onActivityDestroy() {
        removeCallbacks(this.f210806i);
    }

    public void setAnimationDuration(long j) {
        this.f210801d.setAnimationDuration(j);
    }

    public void setFirstMoney(String str) {
        Log.m105919d("MicroMsg.WcPayMoneyLoadingView", "set last money: %s", str);
        this.f210804g = str;
        if (!Util.isNullOrNil(str)) {
            TickerView tickerView = this.f210801d;
            tickerView.mo147097d(this.f210803f + str, false);
        }
        postDelayed(this.f210806i, 500);
    }

    public void setLoadingPb(ProgressBar progressBar) {
        this.f210802e = progressBar;
    }

    public void setMoney(String str) {
        mo99856e(str, false, false);
    }

    public void setNewMoney(String str) {
        boolean z = false;
        Log.m105919d("MicroMsg.WcPayMoneyLoadingView", "set new money: %s", str);
        removeCallbacks(this.f210806i);
        this.f210802e.setVisibility(8);
        if (this.f210804g.length() != str.length()) {
            this.f210801d.setAnimationDuration(800);
        } else {
            this.f210801d.setAnimationDuration(500);
        }
        if (Util.getDouble(str, 0.0d) > Util.getDouble(this.f210804g, 0.0d)) {
            this.f210801d.setPreferredScrollingDirection(TickerView.C67446c.DOWN);
        } else {
            this.f210801d.setPreferredScrollingDirection(TickerView.C67446c.UP);
        }
        boolean z2 = this.f210805h;
        if (!Util.isNullOrNil(this.f210804g)) {
            z = z2;
        }
        TickerView tickerView = this.f210801d;
        tickerView.mo147097d(this.f210803f + str, z);
    }

    public void setPrefixSymbol(String str) {
        this.f210803f = str;
    }

    public void setProgressBarStyle(int i) {
        if (i == 0) {
            this.f210802e.setIndeterminateDrawable(getResources().getDrawable(C0966R.C0969drawable.f357317an2));
        } else {
            this.f210802e.setIndeterminateDrawable(getResources().getDrawable(C0966R.C0969drawable.amz));
        }
    }

    public void setTextColor(int i) {
        this.f210801d.setTextColor(i);
    }

    public void setTextSize(float f) {
        float p = C76577a.m92165p(MMApplicationContext.getContext());
        if (C85875k4.m106153J(p, C76577a.m92169t(MMApplicationContext.getContext())) || C85875k4.m106153J(p, C76577a.m92170u(MMApplicationContext.getContext()))) {
            p = C76577a.m92168s(MMApplicationContext.getContext());
        }
        this.f210801d.setTextSize(f * p);
    }

    public void setTextSizeNotScaled(float f) {
        this.f210801d.setTextSize(f);
    }

    public void setTypeface(Typeface typeface) {
        this.f210801d.setTypeface(typeface);
    }

    public WcPayMoneyLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo99853b();
        mo99854c(attributeSet, -1);
    }

    public WcPayMoneyLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo99853b();
        mo99854c(attributeSet, i);
    }
}
