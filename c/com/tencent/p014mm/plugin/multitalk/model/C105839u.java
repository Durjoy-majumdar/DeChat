package com.tencent.p014mm.plugin.multitalk.model;

import a14.C0000n0;
import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import i82.C108409g;
import j82.C108656b;
import k82.C108957b;
import k82.C108963c;
import kotlin.Result;
import kotlin.ResultKt;
import p80.C110194c;
import p82.C110201e;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

@C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.model.MultiTalkCameraManager$startCaptureRenderer$1", mo125469f = "MultiTalkCameraManager.kt", mo125470l = {106}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.multitalk.model.u */
public final class C105839u extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f314784d;

    /* renamed from: e */
    public /* synthetic */ Object f314785e;

    /* renamed from: f */
    public final /* synthetic */ C105825p f314786f;

    /* renamed from: g */
    public final /* synthetic */ boolean f314787g;

    /* renamed from: com.tencent.mm.plugin.multitalk.model.u$a */
    public static final class C105840a implements SurfaceTexture.OnFrameAvailableListener {

        /* renamed from: d */
        public final /* synthetic */ C105825p f314788d;

        public C105840a(C105825p pVar) {
            this.f314788d = pVar;
        }

        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            Object obj;
            C105811k0 k0Var;
            boolean z;
            C105783b0 n;
            C108409g<C108957b, C108963c> a;
            this.f314788d.f314747i = Util.currentTicks();
            if (this.f314788d.f314752q.getWidth() == 0 || this.f314788d.f314752q.getHeight() == 0) {
                Log.m105928w("MicroMsg.MultiTalkCameraManager", "size is zero, drop frame");
            } else {
                C105825p pVar = this.f314788d;
                C110194c cVar = pVar.f314751p;
                if (!(cVar == null || (k0Var = pVar.f314748j) == null)) {
                    if (!C105851w0.zx0().mo150683y()) {
                        pVar.mo150813i(true);
                    } else if (pVar.f314753r) {
                        if (!C105851w0.zx0().mo150625B()) {
                            ((C119157j) C119157j.f356862d).mo183895z(new C105837t());
                        }
                        z = true;
                        if (z && (n = C105851w0.zx0().mo150671n()) != null) {
                            String s = C75592q0.m90789s();
                            C87412m.m108593f(s, "getUsernameFromUserInfo()");
                            boolean z2 = k0Var.f314633a;
                            int width = pVar.f314752q.getWidth();
                            int height = pVar.f314752q.getHeight();
                            int i = k0Var.f314649q;
                            C108656b bVar = n.f314573a;
                            if (!(bVar == null || (a = bVar.mo159679a()) == null)) {
                                boolean z3 = n.f314575c;
                                C110201e eVar = new C110201e(width, height, i, z2, false, 16, (C8480h) null);
                                C108957b.C108961d dVar = r5;
                                C108957b.C108961d dVar2 = new C108957b.C108961d(cVar, z2, z3, s, eVar);
                                a.mo158936a(dVar);
                            }
                        }
                    }
                    z = false;
                    String s2 = C75592q0.m90789s();
                    C87412m.m108593f(s2, "getUsernameFromUserInfo()");
                    boolean z25 = k0Var.f314633a;
                    int width2 = pVar.f314752q.getWidth();
                    int height2 = pVar.f314752q.getHeight();
                    int i2 = k0Var.f314649q;
                    C108656b bVar2 = n.f314573a;
                    boolean z34 = n.f314575c;
                    C110201e eVar2 = new C110201e(width2, height2, i2, z25, false, 16, (C8480h) null);
                    C108957b.C108961d dVar3 = dVar2;
                    C108957b.C108961d dVar22 = new C108957b.C108961d(cVar, z25, z34, s2, eVar2);
                    a.mo158936a(dVar3);
                }
            }
            try {
                Result.Companion companion = Result.Companion;
                surfaceTexture.updateTexImage();
                obj = Result.m168114constructorimpl(C13598b0.f38549a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
            Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
            if (r0 != null) {
                Log.m105921e("MicroMsg.MultiTalkCameraManager", "updateTexImage error", r0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105839u(C105825p pVar, boolean z, C15601d<? super C105839u> dVar) {
        super(2, dVar);
        this.f314786f = pVar;
        this.f314787g = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C105839u uVar = new C105839u(this.f314786f, this.f314787g, dVar);
        uVar.f314785e = obj;
        return uVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C105839u) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r3.f314784d
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            java.lang.Object r0 = r3.f314785e
            a14.n0 r0 = (a14.C0000n0) r0
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x0035
        L_0x0011:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x0019:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.Object r4 = r3.f314785e
            a14.n0 r4 = (a14.C0000n0) r4
            com.tencent.mm.plugin.multitalk.model.MultiTalkManager r1 = com.tencent.p014mm.plugin.multitalk.model.C105851w0.zx0()
            com.tencent.mm.plugin.multitalk.model.b0 r1 = r1.mo150671n()
            if (r1 == 0) goto L_0x0055
            r3.f314785e = r4
            r3.f314784d = r2
            java.lang.Object r4 = r1.mo150722d(r3)
            if (r4 != r0) goto L_0x0035
            return r0
        L_0x0035:
            rx3.l r4 = (rx3.C13604l) r4
            if (r4 == 0) goto L_0x0055
            com.tencent.mm.plugin.multitalk.model.p r0 = r3.f314786f
            A r1 = r4.f38555d
            p80.c r1 = (p80.C110194c) r1
            r0.f314751p = r1
            B r4 = r4.f38556e
            r1 = r4
            android.graphics.SurfaceTexture r1 = (android.graphics.SurfaceTexture) r1
            r0.f314750o = r1
            android.graphics.SurfaceTexture r4 = (android.graphics.SurfaceTexture) r4
            com.tencent.mm.plugin.multitalk.model.u$a r1 = new com.tencent.mm.plugin.multitalk.model.u$a
            r1.<init>(r0)
            r4.setOnFrameAvailableListener(r1)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x0056
        L_0x0055:
            r4 = 0
        L_0x0056:
            if (r4 != 0) goto L_0x005f
            java.lang.String r4 = "MicroMsg.MultiTalkCameraManager"
            java.lang.String r0 = "startCaptureRenderer: camera texture is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x005f:
            com.tencent.mm.plugin.multitalk.model.p r4 = r3.f314786f
            r4.mo150812g()
            boolean r4 = r3.f314787g
            if (r4 == 0) goto L_0x0071
            com.tencent.mm.app.AppForegroundDelegate r4 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            com.tencent.mm.plugin.multitalk.model.p r0 = r3.f314786f
            com.tencent.mm.app.c0 r0 = r0.f314754s
            r4.mo174209b(r0)
        L_0x0071:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitalk.model.C105839u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
