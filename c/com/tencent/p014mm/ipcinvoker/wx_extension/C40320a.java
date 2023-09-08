package com.tencent.p014mm.ipcinvoker.wx_extension;

import a14.C53916l;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jp3.C46566c;
import jp3.C9486a;
import kotlin.Result;
import kotlin.ResultKt;
import ob0.C47350c;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C49335eu3;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.a */
public final class C40320a implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C40322c<C101820nt3, C49335eu3> f108394a;

    /* renamed from: b */
    public final /* synthetic */ C53916l<C49335eu3> f108395b;

    /* renamed from: c */
    public final /* synthetic */ C46566c<C9486a> f108396c;

    public C40320a(C40322c<C101820nt3, C49335eu3> cVar, C53916l<C49335eu3> lVar, C46566c<C9486a> cVar2) {
        this.f108394a = cVar;
        this.f108395b = lVar;
        this.f108396c = cVar2;
    }

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        C40322c<C101820nt3, C49335eu3> cVar2 = this.f108394a;
        String str2 = "runCgi onTerminate, errType:" + i + ", errCode:" + i2 + ", errMsg:" + str;
        cVar2.getClass();
        C87412m.m108594g(str2, "msg");
        Log.m105924i(cVar2.mo63010b() + "[Cgi][" + cVar2.hashCode() + ']', str2);
        if (i == 0 && i2 == 0) {
            if (this.f108395b.mo74597a()) {
                C53916l<C49335eu3> lVar = this.f108395b;
                C47465a aVar = cVar.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type RESPONSE of com.tencent.mm.ipcinvoker.wx_extension.Cgi.send$lambda-2");
                lVar.resumeWith(Result.m168114constructorimpl((C49335eu3) aVar));
            }
        } else if (this.f108395b.mo74597a()) {
            C53916l<C49335eu3> lVar2 = this.f108395b;
            Result.Companion companion = Result.Companion;
            lVar2.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new C40323d(i, i2, str, this.f108394a))));
        }
        this.f108396c.dead();
    }
}
