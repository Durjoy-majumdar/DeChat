package xk1;

import a14.C0000n0;
import android.os.Bundle;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import fy3.C32227p;
import fy3.C32231t;
import gy3.C87413o;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C49291ej0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderGameLivePostUIC$startMiniGameLive$4", mo125469f = "FinderGameLivePostUIC.kt", mo125470l = {814}, mo125471m = "invokeSuspend")
/* renamed from: xk1.j0 */
public final class C53360j0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f150162d;

    /* renamed from: e */
    public final /* synthetic */ C66355w f150163e;

    /* renamed from: xk1.j0$a */
    public static final class C53361a extends C87413o implements C32231t<Boolean, Integer, Integer, String, Bundle, C49291ej0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66355w f150164d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53361a(C66355w wVar) {
            super(6);
            this.f150164d = wVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: te3.ay0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: te3.ay0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: te3.ay0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: te3.ay0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: te3.ay0} */
        /* JADX WARNING: type inference failed for: r10v9, types: [java.lang.String] */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x00b9, code lost:
            r0 = ((cl1.C55001u) r0.mo71262a(cl1.C55001u.class)).f154420q;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo14122L(java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
            /*
                r13 = this;
                r1 = r13
                r0 = r14
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r2 = r15
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r3 = r16
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                r4 = r17
                java.lang.String r4 = (java.lang.String) r4
                r5 = r18
                android.os.Bundle r5 = (android.os.Bundle) r5
                r6 = r19
                te3.ej0 r6 = (te3.C49291ej0) r6
                java.lang.Class<xk1.m> r7 = xk1.C66331m.class
                xk1.w r8 = r1.f150164d
                java.lang.String r8 = r8.f191025d
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "postExternalLive success:"
                r9.append(r10)
                r9.append(r0)
                java.lang.String r10 = " errCode:"
                r9.append(r10)
                r9.append(r2)
                java.lang.String r10 = " errType:"
                r9.append(r10)
                r9.append(r3)
                java.lang.String r10 = " errMsg:"
                r9.append(r10)
                r9.append(r4)
                java.lang.String r10 = " extInfo:"
                r9.append(r10)
                r9.append(r5)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
                bl3.r r8 = bl3.C39818r.f106831a
                xk1.w r9 = r1.f150164d
                android.app.Activity r9 = r9.getContext()
                bl3.r$a r9 = r8.mo62443b(r9)
                androidx.lifecycle.i0 r9 = r9.mo75002a(r7)
                xk1.m r9 = (xk1.C66331m) r9
                com.tencent.mm.plugin.finder.live.view.i r9 = r9.mo90443d3()
                ci1.a r9 = r9.getSecurityDataScope()
                r10 = 0
                r11 = 1
                a14.C53930o0.m60558e(r9, r10, r11, r10)
                r9 = 0
                if (r0 == 0) goto L_0x00e9
                xk1.w r0 = r1.f150164d
                r0.f191024K = r9
                r0.f191023J = r11
                androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
                bl3.r$a r0 = r8.mo62444c(r0)
                androidx.lifecycle.i0 r0 = r0.mo75002a(r7)
                java.lang.String r2 = "UICProvider.of(activity)…stContextUIC::class.java)"
                gy3.C87412m.m108593f(r0, r2)
                xk1.m r0 = (xk1.C66331m) r0
                java.lang.Class<kz1.m> r0 = kz1.C46828m.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                r2 = r0
                kz1.m r2 = (kz1.C46828m) r2
                xk1.w r0 = r1.f150164d
                android.app.Activity r3 = r0.getContext()
                xk1.w r0 = r1.f150164d
                java.lang.String r4 = r0.f191039u
                int r5 = r0.f191044z
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                boolean r0 = r0.f191014A
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                fj1.b r0 = fj1.C45795b.f123698n
                if (r0 == 0) goto L_0x00c8
                java.lang.Class<cl1.u> r8 = cl1.C55001u.class
                androidx.lifecycle.i0 r0 = r0.mo71262a(r8)
                cl1.u r0 = (cl1.C55001u) r0
                te3.c21 r0 = r0.f154420q
                if (r0 == 0) goto L_0x00c8
                long r10 = r0.f182392d
                goto L_0x00ca
            L_0x00c8:
                r10 = 0
            L_0x00ca:
                java.lang.Long r8 = java.lang.Long.valueOf(r10)
                r2.mo72034dg(r3, r4, r5, r6, r7, r8)
                xk1.w r0 = r1.f150164d
                boolean r2 = r0.f191014A
                if (r2 == 0) goto L_0x028d
                androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
                r0.finish()
                xk1.w r0 = r1.f150164d
                androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
                r0.overridePendingTransition(r9, r9)
                goto L_0x028d
            L_0x00e9:
                xk1.w r0 = r1.f150164d
                android.view.View r0 = r0.mo90462k3()
                r0.setEnabled(r11)
                xk1.w r7 = r1.f150164d
                java.lang.String r0 = r7.f191025d
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r12 = "handleStartMiniGameLiveFail: errCode:"
                r8.append(r12)
                r8.append(r2)
                java.lang.String r12 = ", errType:"
                r8.append(r12)
                r8.append(r3)
                java.lang.String r12 = ", errMsg:"
                r8.append(r12)
                r8.append(r4)
                java.lang.String r4 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
                java.lang.String r4 = ""
                r0 = -200008(0xfffffffffffcf2b8, float:NaN)
                if (r2 != r0) goto L_0x01a3
                if (r5 == 0) goto L_0x0129
                java.lang.String r0 = "EXT_INFO_KEY_REAL_NAME_URL"
                java.lang.String r10 = r5.getString(r0, r4)
            L_0x0129:
                if (r10 != 0) goto L_0x012c
                goto L_0x012d
            L_0x012c:
                r4 = r10
            L_0x012d:
                java.lang.String r0 = r7.f191025d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "handleStartMiniGameLiveFail: realnameUrl"
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                int r0 = r4.length()
                if (r0 <= 0) goto L_0x014b
                r0 = 1
                goto L_0x014c
            L_0x014b:
                r0 = 0
            L_0x014c:
                if (r0 == 0) goto L_0x0187
                java.lang.String r0 = r7.f191025d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "gotoFaceVerify "
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r2 = "LIVE_HELP_TYPE"
                r0.putExtra(r2, r11)
                java.lang.String r2 = "FACE_VERIFY_URL"
                r0.putExtra(r2, r4)
                androidx.appcompat.app.AppCompatActivity r2 = r7.getActivity()
                java.lang.Class<com.tencent.mm.plugin.finder.ui.FinderLivePostHelperUI> r3 = com.tencent.p014mm.plugin.finder.p056ui.FinderLivePostHelperUI.class
                r0.setClass(r2, r3)
                androidx.appcompat.app.AppCompatActivity r2 = r7.getActivity()
                r3 = 10000(0x2710, float:1.4013E-41)
                r2.startActivityForResult(r0, r3)
                goto L_0x0289
            L_0x0187:
                androidx.appcompat.app.AppCompatActivity r0 = r7.getActivity()
                androidx.appcompat.app.AppCompatActivity r2 = r7.getActivity()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131828214(0x7f111df6, float:1.9289363E38)
                java.lang.String r2 = r2.getString(r3)
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r9)
                r0.show()
                goto L_0x0289
            L_0x01a3:
                if (r5 == 0) goto L_0x01c2
                java.lang.String r0 = "EXT_INFO_KEY_ERROR_PAGE"
                byte[] r0 = r5.getByteArray(r0)
                if (r0 == 0) goto L_0x01c2
                te3.ay0 r5 = new te3.ay0
                r5.<init>()
                r5.parseFrom(r0)     // Catch:{ Exception -> 0x01b7 }
                r10 = r5
                goto L_0x01c2
            L_0x01b7:
                r0 = move-exception
                r5 = r0
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r0[r9] = r5
                java.lang.String r5 = "safeParser"
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r4, r0)
            L_0x01c2:
                ot1.a r0 = ot1.C11767a.f34453a
                boolean r0 = r0.mo11665g(r3, r2, r10)
                if (r0 == 0) goto L_0x01cc
                goto L_0x0289
            L_0x01cc:
                r0 = -200196(0xfffffffffffcf1fc, float:NaN)
                if (r2 == r0) goto L_0x0280
                r0 = -100038(0xfffffffffffe793a, float:NaN)
                if (r2 == r0) goto L_0x0278
                r0 = 2131826157(0x7f1115ed, float:1.928519E38)
                switch(r2) {
                    case -200018: goto L_0x0260;
                    case -200017: goto L_0x0260;
                    default: goto L_0x01dc;
                }
            L_0x01dc:
                switch(r2) {
                    case -200013: goto L_0x0260;
                    case -200012: goto L_0x0245;
                    case -200011: goto L_0x0245;
                    case -200010: goto L_0x022a;
                    case -200009: goto L_0x020f;
                    default: goto L_0x01df;
                }
            L_0x01df:
                android.app.Activity r3 = r7.getContext()
                android.app.Activity r4 = r7.getContext()
                android.content.res.Resources r4 = r4.getResources()
                java.lang.String r0 = r4.getString(r0)
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r3, (java.lang.CharSequence) r0, (int) r9)
                r0.show()
                java.lang.String r0 = r7.f191025d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "unknown errCode:"
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                goto L_0x0289
            L_0x020f:
                android.app.Activity r0 = r7.getContext()
                android.app.Activity r2 = r7.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131826158(0x7f1115ee, float:1.9285192E38)
                java.lang.String r2 = r2.getString(r3)
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r9)
                r0.show()
                goto L_0x0289
            L_0x022a:
                android.app.Activity r0 = r7.getContext()
                android.app.Activity r2 = r7.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131826981(0x7f111925, float:1.9286862E38)
                java.lang.String r2 = r2.getString(r3)
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r9)
                r0.show()
                goto L_0x0289
            L_0x0245:
                android.app.Activity r0 = r7.getContext()
                android.app.Activity r2 = r7.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131827297(0x7f111a61, float:1.9287503E38)
                java.lang.String r2 = r2.getString(r3)
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r9)
                r0.show()
                goto L_0x0289
            L_0x0260:
                android.app.Activity r2 = r7.getContext()
                android.app.Activity r3 = r7.getContext()
                android.content.res.Resources r3 = r3.getResources()
                java.lang.String r0 = r3.getString(r0)
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r2, (java.lang.CharSequence) r0, (int) r9)
                r0.show()
                goto L_0x0289
            L_0x0278:
                java.lang.String r0 = r7.f191025d
                java.lang.String r2 = "handleStartMiniGameLiveFail: errCode = LiveSvrErrCode.MM_LIVE_ERR_LIVE_CLOSED"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                goto L_0x0289
            L_0x0280:
                if (r6 == 0) goto L_0x0289
                te3.fj0 r0 = r6.f132955i
                if (r0 == 0) goto L_0x0289
                r7.mo90463l3(r0)
            L_0x0289:
                xk1.w r0 = r1.f150164d
                r0.f191024K = r11
            L_0x028d:
                xk1.w r0 = r1.f150164d
                er1.i5 r0 = r0.f191021H
                if (r0 == 0) goto L_0x0296
                r0.mo8913b()
            L_0x0296:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: xk1.C53360j0.C53361a.mo14122L(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53360j0(C66355w wVar, C15601d<? super C53360j0> dVar) {
        super(2, dVar);
        this.f150163e = wVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C53360j0(this.f150163e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C53360j0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f150162d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            C66355w wVar = this.f150163e;
            boolean z = wVar.f191014A;
            C53361a aVar2 = new C53361a(wVar);
            this.f150162d = 1;
            if (finderLiveService.mo77602C(z, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
