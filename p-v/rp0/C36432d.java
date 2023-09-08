package rp0;

import a14.C53916l;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Result;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89132b;
import ob0.C89137b0;
import pe3.C47465a;
import te3.C50115kd2;

/* renamed from: rp0.d */
public final class C36432d implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C36433e f96936d;

    /* renamed from: e */
    public final /* synthetic */ C53916l<C89132b.C89134c<C50115kd2>> f96937e;

    public C36432d(C36433e eVar, C53916l<? super C89132b.C89134c<C50115kd2>> lVar) {
        this.f96936d = eVar;
        this.f96937e = lVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (C87412m.m108589b(this.f96936d, yVar)) {
            C89137b0 b0Var = C86709a0.m107529k().f251779b;
            this.f96936d.getClass();
            b0Var.mo123470p(1893, this);
            C53916l<C89132b.C89134c<C50115kd2>> lVar = this.f96937e;
            Result.Companion companion = Result.Companion;
            C47465a aVar = this.f96936d.f96939e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetWxaOrderInfoResp");
            lVar.resumeWith(Result.m168114constructorimpl(C89132b.C89134c.m111401a(i, i2, str, (C50115kd2) aVar, yVar, (C89132b) null)));
        }
    }
}
