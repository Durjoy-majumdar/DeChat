package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5$$n */
public class r5$$n extends r5$$m {

    /* renamed from: k */
    public MMNeat7extView f281086k;

    /* renamed from: l */
    public MMRoundCornerImageView f281087l;

    /* renamed from: m */
    public WeImageView f281088m;

    /* renamed from: n */
    public TextView f281089n;

    /* renamed from: o */
    public TextView f281090o;

    /* renamed from: p */
    public View f281091p;

    public r5$$n(C96198r5 r5Var) {
        super(r5Var);
    }

    /* renamed from: a */
    public void mo133869a() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$MusicMVViewHolder");
        super.mo133869a();
        this.f281086k.setVisibility(8);
        this.f281089n.setVisibility(8);
        this.f281090o.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$MusicMVViewHolder");
    }
}
