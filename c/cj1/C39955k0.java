package cj1;

import a14.C53916l;
import al1.C0079b;
import cj1.C54820t;
import cl1.C55001u;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import fy3.C32230s;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import kotlin.Result;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C51372tb1;

/* renamed from: cj1.k0 */
public final class C39955k0 extends C87413o implements C32230s<Boolean, Integer, Integer, String, C51372tb1, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54820t f107102d;

    /* renamed from: e */
    public final /* synthetic */ C53916l<C54820t.C39956a> f107103e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39955k0(C54820t tVar, C53916l<? super C54820t.C39956a> lVar) {
        super(5);
        this.f107102d = tVar;
        this.f107103e = lVar;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        C0079b bVar;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        String str2 = (String) obj4;
        C51372tb1 tb12 = (C51372tb1) obj5;
        C87412m.m108594g(str2, "errMsg");
        if (booleanValue) {
            C54820t tVar = this.f107102d;
            C87412m.m108592e(tb12, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderManualCloseLiveResp");
            tVar.getClass();
            Class cls = C55001u.class;
            str = str2;
            bVar = new C0079b(tb12.f142090d, tb12.f142091e, tb12.f142098o, tb12.f142093g, C62042e.f176370a.mo87096m0(((C55001u) tVar.mo75777m0(cls)).f154420q), tb12.f142094h, tb12.f142095i, ((C55001u) tVar.mo75777m0(cls)).f154420q.f182377T0, tb12.f142096j, (LinkedList) null, tb12.f142097n, (FinderJumpInfo) null, tb12.f142099p, (FinderJumpInfo) null, 10752, (C8480h) null);
        } else {
            str = str2;
            bVar = null;
        }
        C53916l<C54820t.C39956a> lVar = this.f107103e;
        Result.Companion companion = Result.Companion;
        lVar.resumeWith(Result.m168114constructorimpl(new C54820t.C39956a(booleanValue, intValue, intValue2, str, bVar)));
        return C13598b0.f38549a;
    }
}
