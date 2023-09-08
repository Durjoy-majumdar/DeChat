package com.tencent.p014mm.plugin.sns.p104ad.widget.living;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import vr2.C102260r;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout */
public class LivingStatusLayout extends LinearLayout implements C111847h {

    /* renamed from: d */
    public TextView f21122d;

    /* renamed from: e */
    public ImageView f21123e;

    public LivingStatusLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        super.onFinishInflate();
        try {
            this.f21122d = (TextView) findViewById(C0966R.C0970id.f5554i8);
            this.f21122d.setTextSize(0, C102260r.m134886z(C0966R.dimen.f4319k7));
            this.f21123e = (ImageView) findViewById(C0966R.C0970id.f5553i7);
            this.f21123e.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.sns_ad_finder_live_logo, -1));
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
    }

    public void setLiveStatus(int i) {
        String str;
        int i2;
        SnsMethodCalculate.markStartTimeMs("setLiveStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        TextView textView = this.f21122d;
        SnsMethodCalculate.markStartTimeMs("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        int i3 = i & 127;
        if (i3 == 3) {
            str = getContext().getString(C0966R.string.j_p);
            SnsMethodCalculate.markEndTimeMs("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        } else if (i3 == 1) {
            str = getContext().getString(C0966R.string.j_q);
            SnsMethodCalculate.markEndTimeMs("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        } else if (i3 == 2) {
            str = getContext().getString(C0966R.string.mds);
            SnsMethodCalculate.markEndTimeMs("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        } else {
            SnsMethodCalculate.markEndTimeMs("getStatusContent", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
            str = "";
        }
        textView.setText(str);
        SnsMethodCalculate.markStartTimeMs("getStatusBackgroundResourceId", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        if (i3 == 2 || i3 == 1) {
            i2 = C0966R.C0969drawable.f4398bi;
            SnsMethodCalculate.markEndTimeMs("getStatusBackgroundResourceId", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        } else {
            i2 = C0966R.C0969drawable.f4399bj;
            SnsMethodCalculate.markEndTimeMs("getStatusBackgroundResourceId", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
        }
        setBackgroundResource(i2);
        SnsMethodCalculate.markEndTimeMs("setLiveStatus", "com.tencent.mm.plugin.sns.ad.widget.living.LivingStatusLayout");
    }

    public LivingStatusLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
