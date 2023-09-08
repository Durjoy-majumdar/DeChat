package hl1;

import a14.C0000n0;
import cj1.C54795n5;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32227p;
import kotlin.ResultKt;
import qj1.C12738xf;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.visitor.FinderLiveVisitorEndUIC$onLiveEnd$2", mo125469f = "FinderLiveVisitorEndUIC.kt", mo125470l = {308, 170}, mo125471m = "invokeSuspend")
/* renamed from: hl1.a */
public final class C59944a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f171063d;

    /* renamed from: e */
    public Object f171064e;

    /* renamed from: f */
    public int f171065f;

    /* renamed from: g */
    public final /* synthetic */ C59974g f171066g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.visitor.FinderLiveVisitorEndUIC$onLiveEnd$2$1", mo125469f = "FinderLiveVisitorEndUIC.kt", mo125470l = {166}, mo125471m = "invokeSuspend")
    /* renamed from: hl1.a$a */
    public static final class C8540a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f27603d;

        /* renamed from: e */
        public final /* synthetic */ C59974g f27604e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8540a(C59974g gVar, C15601d<? super C8540a> dVar) {
            super(2, dVar);
            this.f27604e = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C8540a(this.f27604e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C8540a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            FinderAuthInfo finderAuthInfo;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f27603d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C12738xf xfVar = this.f27604e.f171121i;
                if (xfVar != null) {
                    this.f27603d = 1;
                    Class cls = C54991o.class;
                    xfVar.f36512y.setBackgroundColor(xfVar.f166287d.getContext().getResources().getColor(C0966R.color.f3421s_));
                    FinderAuthInfo finderAuthInfo2 = null;
                    C58969q b = ((C54991o) xfVar.mo87696x0(cls)).f154345o != null ? C58961d.f168673a.mo84155b(((C54991o) xfVar.mo87696x0(cls)).f154345o) : null;
                    if (!Util.isNullOrNil(b != null ? b.mo84172g0() : null)) {
                        String str = (b == null || (finderAuthInfo = b.field_authInfo) == null) ? null : finderAuthInfo.authProfession;
                        int i2 = ((C54991o) xfVar.mo87696x0(cls)).f154247R0;
                        if (b != null) {
                            finderAuthInfo2 = b.field_authInfo;
                        }
                        xfVar.mo12279b1(str, i2, finderAuthInfo2);
                        obj2 = xfVar.mo12284h1(b != null ? b.mo84172g0() : "", ((C54991o) xfVar.mo87696x0(cls)).f154345o, this);
                        if (obj2 != aVar) {
                            obj2 = C13598b0.f38549a;
                        }
                    } else {
                        Log.m105924i("Finder.LiveVisitorAfterPlugin", "update bg fail,contact is null!");
                        C54795n5 D0 = xfVar.mo14476D0();
                        if (D0 != null) {
                            D0.mo75710N(((C54991o) xfVar.mo87696x0(cls)).f154345o);
                        }
                        xfVar.f36512y.setVisibility(8);
                        xfVar.f36495J.setVisibility(0);
                        obj2 = C13598b0.f38549a;
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C12738xf xfVar2 = this.f27604e.f171121i;
            if (xfVar2 != null) {
                xfVar2.mo12278a1();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59944a(C59974g gVar, C15601d<? super C59944a> dVar) {
        super(2, dVar);
        this.f171066g = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59944a(this.f171066g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59944a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: k14.d} */
    /* JADX WARNING: type inference failed for: r3v3, types: [k14.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r12.f171065f
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x002c
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r0 = r12.f171063d
            k14.c r0 = (k14.C99088c) r0
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x0015 }
            goto L_0x0060
        L_0x0015:
            r13 = move-exception
            goto L_0x006c
        L_0x0017:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001f:
            java.lang.Object r1 = r12.f171064e
            hl1.g r1 = (hl1.C59974g) r1
            java.lang.Object r3 = r12.f171063d
            k14.c r3 = (k14.C99088c) r3
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r3
            goto L_0x0052
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r13)
            hl1.g r13 = r12.f171066g
            com.tencent.mm.sdk.coroutines.LifecycleScope r5 = r13.f171122j
            r6 = 0
            r7 = 0
            hl1.a$a r8 = new hl1.a$a
            r8.<init>(r13, r4)
            r9 = 3
            r10 = 0
            a14.C53895h.m60466d(r5, r6, r7, r8, r9, r10)
            hl1.g r1 = r12.f171066g
            k14.c r13 = r1.f171123n
            r12.f171063d = r13
            r12.f171064e = r1
            r12.f171065f = r3
            k14.d r13 = (k14.C60942d) r13
            java.lang.Object r3 = r13.mo85908b(r4, r12)
            if (r3 != r0) goto L_0x0052
            return r0
        L_0x0052:
            r12.f171063d = r13     // Catch:{ all -> 0x0068 }
            r12.f171064e = r4     // Catch:{ all -> 0x0068 }
            r12.f171065f = r2     // Catch:{ all -> 0x0068 }
            java.lang.Object r1 = hl1.C59974g.m69854n(r1, r12)     // Catch:{ all -> 0x0068 }
            if (r1 != r0) goto L_0x005f
            return r0
        L_0x005f:
            r0 = r13
        L_0x0060:
            rx3.b0 r13 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0015 }
            r0.mo85909c(r4)
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        L_0x0068:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
        L_0x006c:
            r0.mo85909c(r4)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59944a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
