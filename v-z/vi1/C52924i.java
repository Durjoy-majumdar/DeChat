package vi1;

import a14.C0000n0;
import al1.C39611s;
import android.content.Context;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import fy3.C32227p;
import kotlin.ResultKt;
import nj3.C76912y0;
import q40.C12040d;
import rx3.C13598b0;
import te3.C48920bx0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.micintercom.plugin.FinderLiveMicIntercomPlugin$closeAudienceMic$1", mo125469f = "FinderLiveMicIntercomPlugin.kt", mo125470l = {77, 210, 217}, mo125471m = "invokeSuspend")
/* renamed from: vi1.i */
public final class C52924i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f147765d;

    /* renamed from: e */
    public int f147766e;

    /* renamed from: f */
    public final /* synthetic */ C52931n f147767f;

    /* renamed from: g */
    public final /* synthetic */ boolean f147768g;

    /* renamed from: h */
    public final /* synthetic */ C39611s f147769h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.micintercom.plugin.FinderLiveMicIntercomPlugin$closeAudienceMic$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveMicIntercomPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: vi1.i$a */
    public static final class C52925a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f147770d;

        /* renamed from: e */
        public final /* synthetic */ boolean f147771e;

        /* renamed from: f */
        public final /* synthetic */ C52931n f147772f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52925a(C0287e eVar, C15601d dVar, boolean z, C52931n nVar) {
            super(2, dVar);
            this.f147770d = eVar;
            this.f147771e = z;
            this.f147772f = nVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C52925a(this.f147770d, dVar, this.f147771e, this.f147772f);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C52925a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C12040d dVar = ((C0280a) ((C0281b) this.f147770d).f843b).f841a;
            if (dVar != null && this.f147771e) {
                Context context = this.f147772f.f166287d.getContext();
                C76912y0.m92768g(context, "操作失败: " + dVar.f35058f);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.micintercom.plugin.FinderLiveMicIntercomPlugin$closeAudienceMic$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveMicIntercomPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: vi1.i$b */
    public static final class C52926b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f147773d;

        /* renamed from: e */
        public final /* synthetic */ boolean f147774e;

        /* renamed from: f */
        public final /* synthetic */ C52931n f147775f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52926b(C0287e eVar, C15601d dVar, boolean z, C52931n nVar) {
            super(2, dVar);
            this.f147773d = eVar;
            this.f147774e = z;
            this.f147775f = nVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C52926b(this.f147773d, dVar, this.f147774e, this.f147775f);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C52926b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C48920bx0 bx02 = (C48920bx0) ((C0288f) this.f147773d).f855b;
            if (this.f147774e) {
                C76912y0.m92768g(this.f147775f.f166287d.getContext(), "操作成功");
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52924i(C52931n nVar, boolean z, C39611s sVar, C15601d<? super C52924i> dVar) {
        super(2, dVar);
        this.f147767f = nVar;
        this.f147768g = z;
        this.f147769h = sVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C52924i(this.f147767f, this.f147768g, this.f147769h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C52924i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r11.f147766e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r5) goto L_0x0029
            if (r1 == r4) goto L_0x0021
            if (r1 != r3) goto L_0x0019
            java.lang.Object r0 = r11.f147765d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x009f
        L_0x0019:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0021:
            java.lang.Object r1 = r11.f147765d
            bi1.e r1 = (bi1.C0287e) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x007f
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x005c
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r12)
            vi1.n r12 = r11.f147767f
            ui1.a r12 = r12.f147783q
            ui1.e$a r1 = new ui1.e$a
            boolean r6 = r11.f147768g
            if (r6 == 0) goto L_0x003c
            r6 = 1
            goto L_0x003d
        L_0x003c:
            r6 = 4
        L_0x003d:
            al1.s r7 = r11.f147769h
            java.lang.String r8 = r7.f106357a
            java.lang.String r9 = r7.f106359c
            java.lang.String r10 = ""
            if (r9 != 0) goto L_0x0048
            r9 = r10
        L_0x0048:
            java.lang.String r7 = r7.f106361e
            if (r7 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r10 = r7
        L_0x004e:
            r1.<init>(r6, r8, r9, r10)
            r11.f147766e = r5
            ui1.e r12 = (ui1.C52581e) r12
            java.lang.Object r12 = r12.mo73542a(r1, r11)
            if (r12 != r0) goto L_0x005c
            return r0
        L_0x005c:
            r1 = r12
            bi1.e r1 = (bi1.C0287e) r1
            boolean r12 = r11.f147768g
            vi1.n r5 = r11.f147767f
            boolean r6 = r1 instanceof bi1.C0288f
            if (r6 == 0) goto L_0x007f
            wx3.f r6 = r1.f854a
            if (r6 != 0) goto L_0x006f
            wx3.f r6 = r11.getContext()
        L_0x006f:
            vi1.i$b r7 = new vi1.i$b
            r7.<init>(r1, r2, r12, r5)
            r11.f147765d = r1
            r11.f147766e = r4
            java.lang.Object r12 = a14.C53895h.m60469g(r6, r7, r11)
            if (r12 != r0) goto L_0x007f
            return r0
        L_0x007f:
            boolean r12 = r11.f147768g
            vi1.n r4 = r11.f147767f
            boolean r5 = r1 instanceof bi1.C0281b
            if (r5 == 0) goto L_0x009f
            wx3.f r5 = r1.f854a
            if (r5 != 0) goto L_0x008f
            wx3.f r5 = r11.getContext()
        L_0x008f:
            vi1.i$a r6 = new vi1.i$a
            r6.<init>(r1, r2, r12, r4)
            r11.f147765d = r1
            r11.f147766e = r3
            java.lang.Object r12 = a14.C53895h.m60469g(r5, r6, r11)
            if (r12 != r0) goto L_0x009f
            return r0
        L_0x009f:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vi1.C52924i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
