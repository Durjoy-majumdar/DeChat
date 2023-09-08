package kf1;

import cm1.C0735h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: kf1.na */
public final class C9880na extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C9720fa f30473d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9880na(C9720fa faVar) {
        super(0);
        this.f30473d = faVar;
    }

    public Object invoke() {
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
        int j2 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
        int j3 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
        int j4 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
        Log.m105924i("Finder.TimelineLbsPresenter", "refreshMsgNotify commentCnt " + j + ", likeCnt " + j2 + " objectLikeLikeCnt " + j3 + " objectRecommendLikeCnt " + j4);
        C0735h hVar = this.f30473d.f30157q;
        hVar.f1753d = j + j2 + j3 + j4;
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_AVATAR_STRING_SYNC, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        hVar.f1757h = (String) f;
        C61926c.m72668M(new C9862ma(this.f30473d));
        return C13598b0.f38549a;
    }
}
