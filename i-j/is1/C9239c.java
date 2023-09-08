package is1;

import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import er1.C58739j4;
import f40.C86709a0;
import gg1.C32444a;
import gy3.C87412m;
import p151er.C7775q;
import p564iq.C87790d;

@C86522b
/* renamed from: is1.c */
public final class C9239c extends C86301e implements C7775q {
    /* renamed from: Xp */
    public void mo8886Xp() {
        if (!C86709a0.m107522a()) {
            int i = FinderLiveOnliveWidget.f17843F;
            Log.m105920e("Finder.LiveOnliveWidget", "loadPagLib account is not ready");
            return;
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1279, 200, 1);
        ((C87790d) C86312j.m106911c(C87790d.class)).mo122034R0("pag");
        nVar.mo175913w(1279, 201, 1);
    }

    public boolean isInstalled(String str) {
        C87412m.m108594g(str, "module");
        return ((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(str);
    }

    public void tryLoadLibrary() {
        Class cls = C7775q.class;
        if (C32444a.f86056G.mo60266n().intValue() == 0) {
            C58739j4 j4Var = C58739j4.f168176a;
            int i = FinderLiveOnliveWidget.f17843F;
            j4Var.mo83714i0("Finder.LiveOnliveWidget");
            return;
        }
        int i2 = FinderLiveOnliveWidget.f17843F;
        Log.m105924i("Finder.LiveOnliveWidget", "tryLoadLibrary pag start " + ChannelUtil.isGPVersion());
        if (!ChannelUtil.isGPVersion()) {
            ((C7775q) C86312j.m106911c(cls)).mo8886Xp();
        } else if (((C7775q) C86312j.m106911c(cls)).isInstalled("xlab")) {
            ((C7775q) C86312j.m106911c(cls)).mo8886Xp();
        }
        Log.m105924i("Finder.LiveOnliveWidget", "tryLoadLibrary pag end");
    }
}
