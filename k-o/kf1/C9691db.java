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

/* renamed from: kf1.db */
public final class C9691db extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10029wa f30097d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9691db(C10029wa waVar) {
        super(0);
        this.f30097d = waVar;
    }

    public Object invoke() {
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
        int j2 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
        int j3 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
        int j4 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
        int j5 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC, 0);
        int j6 = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
        Log.m105924i("Finder.TimelineMachinePresenter", "refreshMsgNotify commentCnt " + j + ", likeCnt " + j2 + " objectLikeLikeCnt " + j3 + " objectRecommendLikeCnt " + j4 + " friendRecommendCnt：" + j6);
        C0735h hVar = this.f30097d.f30746u;
        hVar.f1753d = j + j2 + j3 + j4 + j5 + j6;
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_AVATAR_STRING_SYNC, "");
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
        hVar.f1757h = (String) f;
        C61926c.m72668M(new C9680cb(this.f30097d));
        return C13598b0.f38549a;
    }
}
