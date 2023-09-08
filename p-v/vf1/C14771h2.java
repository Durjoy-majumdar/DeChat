package vf1;

import al1.C54129i;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import cj1.C54738b1;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveDelManagerUI;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ls3.C10649f;
import rx3.C13598b0;

/* renamed from: vf1.h2 */
public final class C14771h2 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveDelManagerUI f40750d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14771h2(FinderLiveDelManagerUI finderLiveDelManagerUI) {
        super(1);
        this.f40750d = finderLiveDelManagerUI;
    }

    public Object invoke(Object obj) {
        C54738b1 b1Var;
        String str = (String) obj;
        FinderLiveDelManagerUI finderLiveDelManagerUI = this.f40750d;
        finderLiveDelManagerUI.getClass();
        Log.m105924i("FinderLiveDelManagerUI", "goToFinderLive to:" + str);
        FinderLiveService.f159376d.getClass();
        C54129i iVar = FinderLiveService.f159398z;
        if (!(iVar == null || (b1Var = iVar.f151991f) == null)) {
            C10649f fVar = (C10649f) C86312j.m106911c(C10649f.class);
            AppCompatActivity context = finderLiveDelManagerUI.getContext();
            C87412m.m108593f(context, "context");
            if (str == null) {
                str = "";
            }
            fVar.mo10917ze(context, (Intent) null, str, finderLiveDelManagerUI, b1Var, (C10649f.C10650a) null);
        }
        return C13598b0.f38549a;
    }
}
