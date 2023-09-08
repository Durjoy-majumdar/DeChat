package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.x2c.X2CTextView;
import de3.C75360c0;
import de3.C75375u;
import di3.C86312j;
import he0.C76158j;
import p629ny.C76979h;
import p773yy.C79168k;
import qy2.C63347a;
import vr2.C102243e;

/* renamed from: com.tencent.mm.plugin.sns.ui.AsyncTextView */
public class AsyncTextView extends X2CTextView implements Runnable {

    /* renamed from: g */
    public Context f206065g;

    /* renamed from: h */
    public String f206066h;

    /* renamed from: i */
    public String f206067i;

    /* renamed from: j */
    public boolean f206068j;

    /* renamed from: n */
    public String f206069n;

    /* renamed from: o */
    public C75360c0.C75361a f206070o;

    /* renamed from: p */
    public int f206071p;

    /* renamed from: q */
    public C40294d f206072q = null;

    /* renamed from: r */
    public int f206073r = 0;

    /* renamed from: s */
    public boolean f206074s = false;

    public AsyncTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo97918a(context);
    }

    /* renamed from: a */
    public final void mo97918a(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        this.f206065g = context;
        this.f206073r = C74942w4.m89784a(context, 14);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    /* renamed from: b */
    public void mo97919b(String str, String str2, C75360c0.C75361a aVar, boolean z, String str3, int i, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("setContent", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        this.f206067i = str;
        this.f206066h = str2;
        this.f206071p = i;
        this.f206068j = z;
        this.f206069n = str3;
        this.f206070o = aVar;
        run();
        SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    public int getBaseline() {
        SnsMethodCalculate.markStartTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        try {
            int baseline = super.getBaseline();
            SnsMethodCalculate.markEndTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
            return baseline;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
            return -1;
        }
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.AsyncTextView", th, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        try {
            super.onMeasure(i, i2);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    public boolean onPreDraw() {
        SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        try {
            boolean onPreDraw = super.onPreDraw();
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
            return onPreDraw;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
            return true;
        }
    }

    public void run() {
        int i;
        int i2;
        Class cls = C76158j.class;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        int i3 = 2;
        if (getTag() instanceof String) {
            String str = (String) getTag();
            if (!Util.isNullOrNil(str, this.f206067i) && !this.f206068j && str.equals(this.f206067i) && !this.f206074s) {
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
                return;
            }
        }
        C40294d dVar = this.f206072q;
        if (dVar == null || !C72996z1.m85843n5(dVar.getUsername()) || !"3552365301".equals(this.f206072q.mo73980x2())) {
            i2 = 0;
            i = 0;
        } else {
            i2 = this.f206066h.length();
            String str2 = " @" + ((C76158j) C86312j.m106911c(cls)).mo106373wo(this.f206072q.mo73980x2(), this.f206072q.mo73976t2());
            this.f206066h += str2;
            i = str2.length() + i2;
        }
        if (this.f206071p == 10) {
            i3 = 3;
        }
        C75360c0 c0Var = new C75360c0(this.f206065g, new C102243e(this.f206068j, this.f206067i, this.f206069n, 1), this.f206070o, i3);
        C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(C76979h.class)).Eb0(getContext(), this.f206066h, getTextSize(), i3));
        uVar.mo105704a(c0Var, this.f206066h, 33);
        if (this.f206072q != null && i2 != i && i > i2 && i2 >= 0) {
            uVar.mo105705b(((C76158j) C86312j.m106911c(cls)).mo106367cY(this.f206065g, this.f206072q.mo73980x2(), this.f206073r, C0966R.color.BW_0_Alpha_0_5), i2, i, 33);
        }
        setText(uVar, TextView.BufferType.SPANNABLE);
        ((C79168k) C86312j.m106911c(C79168k.class)).mo74130ns(this, this.f206067i, C63347a.C47892c.SNS_FEED, C63347a.C47893d.OUTLINED);
        setTag(this.f206067i);
        this.f206074s = false;
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    public void setContactInfo(C40294d dVar) {
        SnsMethodCalculate.markStartTimeMs("setContactInfo", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        this.f206072q = dVar;
        SnsMethodCalculate.markEndTimeMs("setContactInfo", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    public AsyncTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo97918a(context);
    }

    public AsyncTextView(Context context) {
        super(context);
        mo97918a(context);
    }
}
