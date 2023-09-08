package com.tencent.p014mm.plugin.sns.p104ad.widget.countdown;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import rq2.C101426m;
import rq2.C101432s;
import xq2.C102715a;
import xq2.C102718c;
import xq2.C102719d;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout */
public class CountDownTimerLayout extends LinearLayout implements C0124r, C102718c {

    /* renamed from: d */
    public TextView f274356d;

    /* renamed from: e */
    public TextView f274357e;

    /* renamed from: f */
    public TextView f274358f;

    /* renamed from: g */
    public TextView f274359g;

    /* renamed from: h */
    public TextView f274360h;

    /* renamed from: i */
    public boolean f274361i = true;

    /* renamed from: j */
    public long f274362j = -1;

    /* renamed from: n */
    public C102715a f274363n;

    public CountDownTimerLayout(Context context) {
        super(context);
        mo130507b(context);
    }

    private void setDateTime(C101426m.C101427a aVar) {
        SnsMethodCalculate.markStartTimeMs("setDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        if (aVar == null) {
            Log.m105928w("SnsAd.CountDownTimerLayout", "the date time is null!!");
            SnsMethodCalculate.markEndTimeMs("setDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            return;
        }
        if (aVar.f297075a > 0) {
            C101432s.m133132n(this.f274357e, true);
            C101432s.m133132n(this.f274356d, true);
            mo130508c(this.f274357e, String.valueOf(aVar.f297075a));
        } else {
            C101432s.m133132n(this.f274357e, false);
            C101432s.m133132n(this.f274356d, false);
        }
        mo130508c(this.f274358f, C101426m.m133103a(aVar.f297076b));
        mo130508c(this.f274359g, C101426m.m133103a(aVar.f297077c));
        mo130508c(this.f274360h, C101426m.m133103a(aVar.f297078d));
        SnsMethodCalculate.markEndTimeMs("setDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    /* renamed from: a */
    public void mo130506a(long j, C101426m.C101427a aVar) {
        SnsMethodCalculate.markStartTimeMs("onCountDownTimeChanged", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        try {
            this.f274362j = j;
            SnsMethodCalculate.markStartTimeMs("isAlive", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            boolean isAttachedToWindow = isAttachedToWindow();
            SnsMethodCalculate.markEndTimeMs("isAlive", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            if (isAttachedToWindow && this.f274361i) {
                setDateTime(aVar);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onCountDownTimeChanged", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    /* renamed from: b */
    public void mo130507b(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        try {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.c1z, this);
            this.f274363n = new C102715a(this);
            this.f274356d = (TextView) findViewById(C0966R.C0970id.jok);
            this.f274357e = (TextView) findViewById(C0966R.C0970id.joj);
            this.f274358f = (TextView) findViewById(C0966R.C0970id.jol);
            this.f274359g = (TextView) findViewById(C0966R.C0970id.jom);
            this.f274360h = (TextView) findViewById(C0966R.C0970id.jon);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    /* renamed from: c */
    public final void mo130508c(TextView textView, String str) {
        SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        if (textView != null) {
            textView.setText(str);
        }
        SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    public final void doPause(C0125s sVar) {
        SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        try {
            Log.m105918d("SnsAd.CountDownTimerLayout", "the doPause is called");
            this.f274361i = false;
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void doResume(C0125s sVar) {
        SnsMethodCalculate.markStartTimeMs("doResume", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        try {
            Log.m105918d("SnsAd.CountDownTimerLayout", "the doResume is called");
            this.f274361i = true;
            SnsMethodCalculate.markStartTimeMs("resumeDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            if (this.f274361i) {
                SnsMethodCalculate.markStartTimeMs("isAlive", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
                boolean isAttachedToWindow = isAttachedToWindow();
                SnsMethodCalculate.markEndTimeMs("isAlive", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
                if (isAttachedToWindow) {
                    long j = this.f274362j;
                    if (j >= 0) {
                        SnsMethodCalculate.markStartTimeMs("toDateTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
                        C101426m.C101427a d = C101426m.m133106d(j, (C101426m.C101427a) null);
                        SnsMethodCalculate.markEndTimeMs("toDateTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
                        setDateTime(d);
                    }
                    SnsMethodCalculate.markEndTimeMs("resumeDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
                    SnsMethodCalculate.markEndTimeMs("doResume", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
                }
            }
            SnsMethodCalculate.markEndTimeMs("resumeDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("doResume", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    public C102719d getCountDownVM() {
        SnsMethodCalculate.markStartTimeMs("getCountDownVM", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        SnsMethodCalculate.markEndTimeMs("getCountDownVM", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        return null;
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        super.onAttachedToWindow();
        try {
            Context context = getContext();
            if (context instanceof FragmentActivity) {
                ((FragmentActivity) context).getLifecycle().addObserver(this);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        super.onDetachedFromWindow();
        try {
            Context context = getContext();
            if (context instanceof FragmentActivity) {
                ((FragmentActivity) context).getLifecycle().removeObserver(this);
            }
            C102719d countDownVM = getCountDownVM();
            C102715a aVar = this.f274363n;
            if (aVar != null) {
                aVar.mo142514b(countDownVM);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    public CountDownTimerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo130507b(context);
    }

    public CountDownTimerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo130507b(context);
    }

    public CountDownTimerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo130507b(context);
    }
}
