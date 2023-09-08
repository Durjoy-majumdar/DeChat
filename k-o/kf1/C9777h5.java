package kf1;

import al1.C54129i;
import android.app.Activity;
import android.content.Intent;
import cj1.C54738b1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87413o;
import ls3.C10649f;
import rx3.C13598b0;

/* renamed from: kf1.h5 */
public final class C9777h5 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9808j5 f30303d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9777h5(C9808j5 j5Var) {
        super(1);
        this.f30303d = j5Var;
    }

    public Object invoke(Object obj) {
        C54738b1 b1Var;
        String str = (String) obj;
        C9808j5 j5Var = this.f30303d;
        Log.m105924i("MicroMsg.FinderLiveProfileWidgetJumpEmptyUIC", "goToFinderLive to:" + str);
        FinderLiveService.f159376d.getClass();
        C54129i iVar = FinderLiveService.f159398z;
        if (!(iVar == null || (b1Var = iVar.f151991f) == null)) {
            C10649f fVar = (C10649f) C86312j.m106911c(C10649f.class);
            Activity context = j5Var.getContext();
            if (str == null) {
                str = "";
            }
            String str2 = str;
            Activity context2 = j5Var.getContext();
            fVar.mo10917ze(context, (Intent) null, str2, context2 instanceof MMActivity ? (MMActivity) context2 : null, b1Var, (C10649f.C10650a) null);
        }
        return C13598b0.f38549a;
    }
}
