package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5$$r */
public class r5$$r extends r5$$m {

    /* renamed from: k */
    public MaskImageView f281118k;

    /* renamed from: l */
    public MaskLinearLayout f281119l;

    /* renamed from: m */
    public MMNeat7extView f281120m;

    /* renamed from: n */
    public View f281121n;

    /* renamed from: o */
    public SnsAlbumThumbStateIconView f281122o;

    /* renamed from: p */
    public final /* synthetic */ C96198r5 f281123p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r5$$r(C96198r5 r5Var) {
        super(r5Var);
        this.f281123p = r5Var;
    }

    /* renamed from: a */
    public void mo133869a() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SightViewHolder");
        super.mo133869a();
        this.f281118k.setVisibility(8);
        this.f281120m.setVisibility(8);
        this.f281122o.setVisibility(8);
        View view = this.f281121n;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SightViewHolder", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$SightViewHolder", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (C76577a.m92165p(C96198r5.m123301f(this.f281123p)) > 1.0f) {
            this.f281120m.setMaxLines(2);
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$SightViewHolder");
    }
}
