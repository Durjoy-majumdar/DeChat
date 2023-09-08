package sk3;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import p157gk.C59481e;
import p157gk.C59491j;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiImageUIC$startIdentify$1", mo125469f = "FTSMultiImageUIC.kt", mo125470l = {165, 172, 175, 177}, mo125471m = "invokeSuspend")
/* renamed from: sk3.r */
public final class C64006r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181453d;

    /* renamed from: e */
    public final /* synthetic */ C63995m f181454e;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiImageUIC$startIdentify$1$1", mo125469f = "FTSMultiImageUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sk3.r$a */
    public static final class C64007a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C63995m f181455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64007a(C63995m mVar, C15601d<? super C64007a> dVar) {
            super(2, dVar);
            this.f181455d = mVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64007a(this.f181455d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64007a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C59481e eVar = C59491j.f169998c;
            if (eVar == null) {
                return null;
            }
            eVar.mo84579a(this.f181455d.getActivity());
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiImageUIC$startIdentify$1$2", mo125469f = "FTSMultiImageUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sk3.r$b */
    public static final class C64008b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C63995m f181456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64008b(C63995m mVar, C15601d<? super C64008b> dVar) {
            super(2, dVar);
            this.f181456d = mVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64008b(this.f181456d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64008b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C59481e eVar = C59491j.f169998c;
            if (eVar != null) {
                eVar.mo84579a(this.f181456d.getActivity());
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64006r(C63995m mVar, C15601d<? super C64006r> dVar) {
        super(2, dVar);
        this.f181454e = mVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64006r(this.f181454e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64006r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0115 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f181453d
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            java.lang.String r6 = "MicroMsg.FTSMultiImageUIC"
            r7 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r7) goto L_0x002c
            if (r1 == r5) goto L_0x0027
            if (r1 == r4) goto L_0x0022
            if (r1 != r3) goto L_0x001a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0116
        L_0x001a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0102
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00c2
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00ab
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r11)
            fk3.b r11 = fk3.C97886b.f287172a
            sk3.m r1 = r10.f181454e
            java.lang.String r1 = r1.f181428f
            r11.mo137235v(r1)
            java.lang.String r1 = ""
            fk3.C97886b.f287174c = r1
            sk3.m r1 = r10.f181454e
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
            sk3.m r8 = r10.f181454e
            androidx.appcompat.app.AppCompatActivity r8 = r8.getActivity()
            int r8 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r8)
            int r1 = kg3.C76577a.m92152c(r1, r8)
            fk3.C97886b.f287175d = r1
            p157gk.C59492k.f169999a = r11
            java.lang.Class<ug.o0> r11 = p248ug.C65347o0.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            ug.o0 r11 = (p248ug.C65347o0) r11
            sk3.m r1 = r10.f181454e
            java.lang.String r1 = r1.f181428f
            r11.mo89077gs(r1)
            sk3.m r11 = r10.f181454e
            r11.getClass()
            gk.e r11 = p157gk.C59491j.f169998c
            r1 = 0
            if (r11 == 0) goto L_0x0075
            boolean r11 = r11.f169965e
            goto L_0x0076
        L_0x0075:
            r11 = 0
        L_0x0076:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getManagerIsDoingWork >> "
            r8.append(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            if (r11 == 0) goto L_0x00ae
            java.lang.String r11 = "startIdentify >> but is doing work"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)
            sk3.m r11 = r10.f181454e
            r11.mo88767j3()
            a14.h0 r11 = a14.C53872d1.f151117a
            a14.k2 r11 = f14.C58901s.f168555a
            sk3.r$a r1 = new sk3.r$a
            sk3.m r3 = r10.f181454e
            r1.<init>(r3, r2)
            r10.f181453d = r7
            java.lang.Object r11 = a14.C53895h.m60469g(r11, r1, r10)
            if (r11 != r0) goto L_0x00ab
            return r0
        L_0x00ab:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        L_0x00ae:
            sk3.m r11 = r10.f181454e
            r11.f181437r = r7
            r10.f181453d = r5
            a14.h0 r5 = a14.C53872d1.f151119c
            sk3.l r7 = new sk3.l
            r7.<init>(r11, r1, r2)
            java.lang.Object r11 = a14.C53895h.m60469g(r5, r7, r10)
            if (r11 != r0) goto L_0x00c2
            return r0
        L_0x00c2:
            rx3.l r11 = (rx3.C13604l) r11
            A r1 = r11.f38555d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            B r11 = r11.f38556e
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            sk3.m r5 = r10.f181454e
            r5.mo88767j3()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "get result >> "
            r5.append(r7)
            int r7 = r1.size()
            r5.append(r7)
            java.lang.String r7 = ", "
            r5.append(r7)
            int r7 = r11.size()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            gk.e r5 = p157gk.C59491j.f169998c
            if (r5 == 0) goto L_0x0102
            r10.f181453d = r4
            java.lang.Object r11 = r5.mo84581c(r1, r11, r10)
            if (r11 != r0) goto L_0x0102
            return r0
        L_0x0102:
            a14.h0 r11 = a14.C53872d1.f151117a
            a14.k2 r11 = f14.C58901s.f168555a
            sk3.r$b r1 = new sk3.r$b
            sk3.m r4 = r10.f181454e
            r1.<init>(r4, r2)
            r10.f181453d = r3
            java.lang.Object r11 = a14.C53895h.m60469g(r11, r1, r10)
            if (r11 != r0) goto L_0x0116
            return r0
        L_0x0116:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sk3.C64006r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
