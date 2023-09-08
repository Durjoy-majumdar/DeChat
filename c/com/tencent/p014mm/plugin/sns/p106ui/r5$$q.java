package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.QFadeImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAlbumThumbStateIconView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5$$q */
public class r5$$q extends r5$$m {

    /* renamed from: A */
    public TextView f281099A;

    /* renamed from: B */
    public MaskLinearLayout f281100B;

    /* renamed from: C */
    public final /* synthetic */ C96198r5 f281101C;

    /* renamed from: k */
    public MaskImageView f281102k;

    /* renamed from: l */
    public QFadeImageView f281103l;

    /* renamed from: m */
    public QFadeImageView f281104m;

    /* renamed from: n */
    public QFadeImageView f281105n;

    /* renamed from: o */
    public MMNeat7extView f281106o;

    /* renamed from: p */
    public TextView f281107p;

    /* renamed from: q */
    public TextView f281108q;

    /* renamed from: r */
    public TextView f281109r;

    /* renamed from: s */
    public TextView f281110s;

    /* renamed from: t */
    public View f281111t;

    /* renamed from: u */
    public View f281112u;

    /* renamed from: v */
    public SnsAlbumThumbStateIconView f281113v;

    /* renamed from: w */
    public SnsAlbumThumbStateIconView f281114w;

    /* renamed from: x */
    public SnsAlbumThumbStateIconView f281115x;

    /* renamed from: y */
    public TextView f281116y;

    /* renamed from: z */
    public TextView f281117z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r5$$q(C96198r5 r5Var) {
        super(r5Var);
        this.f281101C = r5Var;
    }

    /* renamed from: a */
    public void mo133869a() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$PhotoViewHolder");
        super.mo133869a();
        this.f281102k.setVisibility(8);
        this.f281104m.setVisibility(8);
        this.f281105n.setVisibility(8);
        this.f281106o.setVisibility(8);
        this.f281107p.setVisibility(8);
        this.f281108q.setVisibility(8);
        this.f281109r.setVisibility(8);
        this.f281110s.setVisibility(8);
        View view = this.f281111t;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f281112u;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$PhotoViewHolder", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f281103l.setVisibility(8);
        this.f281113v.setVisibility(8);
        this.f281114w.setVisibility(8);
        this.f281115x.setVisibility(8);
        this.f281116y.setVisibility(8);
        this.f281117z.setVisibility(8);
        this.f281099A.setVisibility(8);
        if (C76577a.m92165p(C96198r5.m123301f(this.f281101C)) > 1.0f) {
            this.f281106o.setMaxLines(2);
        }
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$PhotoViewHolder");
    }
}
