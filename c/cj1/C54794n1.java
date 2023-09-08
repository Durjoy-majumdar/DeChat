package cj1;

import android.os.Bundle;
import fj1.C45795b;
import fy3.C32231t;
import fy3.C32232u;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import te3.C49291ej0;

/* renamed from: cj1.n1 */
public final class C54794n1 extends C87413o implements C32232u<Boolean, Boolean, String, Integer, Integer, String, C49291ej0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C45795b f153614d;

    /* renamed from: e */
    public final /* synthetic */ C54795n5 f153615e;

    /* renamed from: f */
    public final /* synthetic */ C54806r1 f153616f;

    /* renamed from: g */
    public final /* synthetic */ C32231t<Boolean, Integer, Integer, String, Bundle, C49291ej0, C13598b0> f153617g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54794n1(C45795b bVar, C54795n5 n5Var, C54806r1 r1Var, C32231t<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super Bundle, ? super C49291ej0, C13598b0> tVar) {
        super(7);
        this.f153614d = bVar;
        this.f153615e = n5Var;
        this.f153616f = r1Var;
        this.f153617g = tVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        String str = (String) obj3;
        int intValue = ((Number) obj4).intValue();
        int intValue2 = ((Number) obj5).intValue();
        String str2 = (String) obj6;
        C49291ej0 ej02 = (C49291ej0) obj7;
        C87412m.m108594g(str, "verifyUrl");
        C87412m.m108594g(str2, "errMsg");
        C87412m.m108594g(ej02, "resp");
        C61926c.m72668M(new C54791m1(booleanValue, intValue2, booleanValue2, str, this.f153614d, this.f153615e, this.f153616f, ej02, this.f153617g, intValue, str2));
        return C13598b0.f38549a;
    }
}
