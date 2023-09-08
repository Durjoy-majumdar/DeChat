package com.tencent.p014mm.sns_compose.page;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import androidx.paging.compose.C54222c;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import lh3.C99474g;
import p004b0.C103941f;
import p004b0.C103953l0;
import p175j0.C108504h;
import rx3.C13598b0;
import um0.C22657f;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.sns_compose.page.o */
public final class C57584o extends C87413o implements C32230s<C103941f, Integer, C99474g, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0000n0 f164888d;

    /* renamed from: e */
    public final /* synthetic */ C57589s f164889e;

    /* renamed from: f */
    public final /* synthetic */ C103953l0 f164890f;

    /* renamed from: g */
    public final /* synthetic */ C54222c<C99474g> f164891g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57584o(C0000n0 n0Var, C57589s sVar, C103953l0 l0Var, C54222c<C99474g> cVar) {
        super(5);
        this.f164888d = n0Var;
        this.f164889e = sVar;
        this.f164890f = l0Var;
        this.f164891g = cVar;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int intValue = ((Number) obj2).intValue();
        C99474g gVar = (C99474g) obj3;
        C108504h hVar = (C108504h) obj4;
        int intValue2 = ((Number) obj5).intValue();
        C87412m.m108594g((C103941f) obj, "$this$itemsIndexed");
        Log.m105926v("MicroMsg.WithFriendsPage", "itemsIndexed: " + intValue);
        if (gVar != null) {
            C0000n0 n0Var = this.f164888d;
            C57589s sVar = this.f164889e;
            C103953l0 l0Var = this.f164890f;
            C54222c<C99474g> cVar = this.f164891g;
            C53895h.m60464b(n0Var, (C66212f) null, (C53934p0) null, new C57583n(gVar, gVar, (C15601d<? super C57583n>) null), 3, (Object) null);
            LifecycleScope lifecycleScope = sVar.f164904d;
            C87412m.m108591d(lifecycleScope);
            C106620k.m143962a(sVar, l0Var, intValue, gVar, cVar, lifecycleScope, hVar, 266248 | ((intValue2 << 3) & C22657f.CTRL_INDEX) | 32768);
        }
        return C13598b0.f38549a;
    }
}
