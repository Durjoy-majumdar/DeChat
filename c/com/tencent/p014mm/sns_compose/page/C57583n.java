package com.tencent.p014mm.sns_compose.page;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C87412m;
import i21.C60242i;
import k21.C60960c;
import kotlin.ResultKt;
import lh3.C99474g;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.sns_compose.page.WithFriendsPageKt$WithFriendsPage$1$1$1$3$1$1", mo125469f = "WithFriendsPage.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.sns_compose.page.n */
public final class C57583n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C99474g f164886d;

    /* renamed from: e */
    public final /* synthetic */ C99474g f164887e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57583n(C99474g gVar, C99474g gVar2, C15601d<? super C57583n> dVar) {
        super(2, dVar);
        this.f164886d = gVar;
        this.f164887e = gVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C57583n(this.f164886d, this.f164887e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C57583n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        C60960c.C60961a aVar = C60960c.f173618a;
        String str = this.f164886d.f291655d;
        C60242i iVar = C60242i.UNREPEAT;
        aVar.mo85927k("MomentsTogetherHistoryBrowsing", "withFriendFeedCount", str, iVar);
        C99474g gVar = this.f164886d;
        if ((gVar.f291662k & 32) > 0) {
            aVar.mo85927k("MomentsTogetherHistoryBrowsing", "withFriendExtraFeedCount", gVar.f291655d, iVar);
        }
        C87412m.m108594g(this.f164887e.f291655d, "snsId");
        aVar.mo85930n("MomentsTogetherHistoryBrowsing", "withFriendDetailAction", C61926c.m72691p(0), "0,0,0,0,0", C60242i.DEFAULT);
        return C13598b0.f38549a;
    }
}
