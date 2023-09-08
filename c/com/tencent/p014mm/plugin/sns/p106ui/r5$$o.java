package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5$$o */
public class r5$$o extends r5$$m {

    /* renamed from: k */
    public MMNeat7extView f281092k;

    /* renamed from: l */
    public TagImageView f281093l;

    /* renamed from: m */
    public TextView f281094m;

    /* renamed from: n */
    public ImageView f281095n;

    /* renamed from: o */
    public TextView f281096o;

    /* renamed from: p */
    public TextView f281097p;

    /* renamed from: q */
    public View f281098q;

    public r5$$o(C96198r5 r5Var) {
        super(r5Var);
    }

    /* renamed from: a */
    public void mo133869a() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$NormalViewHolder");
        super.mo133869a();
        this.f281092k.setVisibility(8);
        this.f281093l.setVisibility(8);
        TextView textView = this.f281094m;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.f281095n.setVisibility(8);
        this.f281096o.setVisibility(8);
        this.f281097p.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$NormalViewHolder");
    }
}
