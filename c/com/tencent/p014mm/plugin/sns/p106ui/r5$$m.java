package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5$$m */
public class r5$$m {

    /* renamed from: a */
    public View f281076a;

    /* renamed from: b */
    public TextView f281077b;

    /* renamed from: c */
    public TextView f281078c;

    /* renamed from: d */
    public TextView f281079d;

    /* renamed from: e */
    public LinearLayout f281080e;

    /* renamed from: f */
    public ImageView f281081f;

    /* renamed from: g */
    public TextView f281082g;

    /* renamed from: h */
    public LinearLayout f281083h;

    /* renamed from: i */
    public View f281084i;

    /* renamed from: j */
    public LinearLayout f281085j;

    public r5$$m(C96198r5 r5Var) {
    }

    /* renamed from: a */
    public void mo133869a() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$BaseHolder");
        this.f281077b.setVisibility(8);
        this.f281078c.setVisibility(8);
        this.f281079d.setVisibility(8);
        this.f281080e.setVisibility(4);
        this.f281081f.setVisibility(4);
        View view = this.f281084i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$BaseHolder", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$BaseHolder", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f281082g.setVisibility(8);
        this.f281085j.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$BaseHolder");
    }
}
