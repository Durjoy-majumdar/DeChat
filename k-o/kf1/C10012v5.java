package kf1;

import bl3.C39818r;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import fy3.C32224a;
import gy3.C87413o;
import jq3.C9493c;
import o40.C61926c;
import os1.C62168u;
import rx3.C13598b0;

/* renamed from: kf1.v5 */
public final class C10012v5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C2829n f30707d;

    /* renamed from: e */
    public final /* synthetic */ long f30708e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10012v5(C2829n nVar, long j) {
        super(0);
        this.f30707d = nVar;
        this.f30708e = j;
    }

    public Object invoke() {
        C9493c cVar = (C9493c) this.f30707d.mo2931f().f173503E;
        long itemId = cVar != null ? cVar.getItemId() : 0;
        Log.m105924i("FinderLongVideoShareContract", "[checkSeek] video feedId=" + C61926c.m72691p(itemId) + " seekTime=" + this.f30708e);
        ((C62168u) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class)).mo87219c3(itemId);
        Object obj = this.f30707d.mo2931f().f173503E;
        C55018j0 j0Var = obj instanceof C55018j0 ? (C55018j0) obj : null;
        if (j0Var != null) {
            j0Var.f154481f = true;
        }
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) this.f30707d.mo2931f().mo85812D(C0966R.C0970id.d7a);
        if (finderVideoLayout != null) {
            FinderVideoLayout.m65079J(finderVideoLayout, this.f30708e, 3, 0.0f, false, (ITPPlayerListener.IOnSeekCompleteListener) null, 28, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
