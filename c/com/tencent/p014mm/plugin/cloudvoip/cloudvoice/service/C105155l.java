package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.content.Context;
import android.graphics.SurfaceTexture;
import b43.C104034c;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C85148d;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C87412m;
import kotlin.ResultKt;
import n11.C109669c;
import n11.C109670d;
import n11.C109674f;
import org.json.JSONObject;
import p80.C110194c;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l */
public final class C105155l extends C105148h1 implements C85148d.C85149a, C104034c {

    /* renamed from: A */
    public final C0000n0 f312250A = C53930o0.m60554a(C53872d1.f151119c.plus(C53959v2.m60598a((C53973z1) null, 1, (Object) null)));

    /* renamed from: B */
    public final C105153k f312251B;

    /* renamed from: C */
    public C85148d.C85150b f312252C;

    /* renamed from: D */
    public boolean f312253D;

    /* renamed from: E */
    public int f312254E;

    /* renamed from: F */
    public int f312255F;

    /* renamed from: G */
    public int f312256G;

    /* renamed from: H */
    public final boolean f312257H;

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceCameraVideoView$init$1", mo125469f = "OpenVoiceCameraVideoView.kt", mo125470l = {79}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l$a */
    public static final class C105156a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f312258d;

        /* renamed from: e */
        public final /* synthetic */ String f312259e;

        /* renamed from: f */
        public final /* synthetic */ C105155l f312260f;

        /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l$a$a */
        public static final class C105157a implements SurfaceTexture.OnFrameAvailableListener {

            /* renamed from: d */
            public final /* synthetic */ C105155l f312261d;

            /* renamed from: e */
            public final /* synthetic */ C8478d0 f312262e;

            /* renamed from: f */
            public final /* synthetic */ String f312263f;

            /* renamed from: g */
            public final /* synthetic */ C110194c f312264g;

            public C105157a(C105155l lVar, C8478d0 d0Var, String str, C110194c cVar) {
                this.f312261d = lVar;
                this.f312262e = d0Var;
                this.f312263f = str;
                this.f312264g = cVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
                if (r1.f312262e.f27483d == 2) goto L_0x0036;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onFrameAvailable(android.graphics.SurfaceTexture r19) {
                /*
                    r18 = this;
                    r1 = r18
                    com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l r0 = r1.f312261d
                    int r2 = r0.f312255F
                    r3 = 0
                    r4 = 1
                    if (r2 <= 0) goto L_0x00b3
                    int r2 = r0.f312256G
                    if (r2 <= 0) goto L_0x00b3
                    android.content.res.Resources r0 = r0.getResources()
                    android.content.res.Configuration r0 = r0.getConfiguration()
                    int r0 = r0.orientation
                    r2 = 270(0x10e, float:3.78E-43)
                    r5 = 2
                    if (r0 != r5) goto L_0x0039
                    com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l r0 = r1.f312261d
                    int r0 = r0.f312254E
                    if (r0 == r5) goto L_0x0032
                    r6 = 4
                    if (r0 == r6) goto L_0x002d
                    gy3.d0 r0 = r1.f312262e
                    int r0 = r0.f27483d
                    if (r0 != r5) goto L_0x003a
                    goto L_0x0036
                L_0x002d:
                    gy3.d0 r0 = r1.f312262e
                    r0.f27483d = r6
                    goto L_0x003a
                L_0x0032:
                    gy3.d0 r0 = r1.f312262e
                    r0.f27483d = r5
                L_0x0036:
                    r2 = 90
                    goto L_0x003a
                L_0x0039:
                    r2 = 0
                L_0x003a:
                    com.tencent.mm.plugin.cloudvoip.cloudvoice.service.l r0 = r1.f312261d
                    com.tencent.mm.plugin.cloudvoip.cloudvoice.service.k r6 = r0.f312251B
                    int r6 = r6.f308679t
                    int r10 = r6 + r2
                    int r2 = r10 / 90
                    r2 = r2 & r4
                    if (r2 == r4) goto L_0x004f
                    int r6 = r0.f312210w
                    if (r6 != r5) goto L_0x004c
                    goto L_0x004f
                L_0x004c:
                    int r6 = r0.f312256G
                    goto L_0x0051
                L_0x004f:
                    int r6 = r0.f312255F
                L_0x0051:
                    r8 = r6
                    if (r2 == r4) goto L_0x005c
                    int r2 = r0.f312210w
                    if (r2 != r5) goto L_0x0059
                    goto L_0x005c
                L_0x0059:
                    int r2 = r0.f312255F
                    goto L_0x005e
                L_0x005c:
                    int r2 = r0.f312256G
                L_0x005e:
                    r9 = r2
                    com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r2 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.INSTANCE
                    n11.d r2 = r2.f312361U
                    java.lang.String r15 = r1.f312263f
                    boolean r0 = r0.f312253D
                    p80.c r5 = r1.f312264g
                    r2.getClass()
                    java.lang.String r6 = "userName"
                    gy3.C87412m.m108594g(r15, r6)
                    java.lang.String r6 = "texture"
                    gy3.C87412m.m108594g(r5, r6)
                    r11.b r2 = r2.f328296a
                    if (r2 == 0) goto L_0x00b3
                    rx3.g r2 = r2.f330387o
                    rx3.n r2 = (rx3.C36570n) r2
                    java.lang.Object r2 = r2.getValue()
                    q11.g r2 = (q11.C110337g) r2
                    if (r2 == 0) goto L_0x00b3
                    s11.b$d r6 = new s11.b$d
                    r16 = 0
                    x11.e r17 = new x11.e
                    r12 = 0
                    r13 = 16
                    r14 = 0
                    r7 = r17
                    r11 = r0
                    r7.<init>(r8, r9, r10, r11, r12, r13, r14)
                    r11 = r6
                    r12 = r5
                    r13 = r0
                    r14 = r16
                    r16 = r17
                    r11.<init>(r12, r13, r14, r15, r16)
                    c14.h<IN> r0 = r2.f330067f
                    c14.c r0 = (c14.C54614c) r0
                    boolean r0 = r0.mo75535h()
                    if (r0 != 0) goto L_0x00b3
                    c14.h<IN> r0 = r2.f330067f
                    c14.c r0 = (c14.C54614c) r0
                    r0.mo75539t(r6)
                L_0x00b3:
                    kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x00bf }
                    r19.updateTexImage()     // Catch:{ all -> 0x00bf }
                    rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00bf }
                    java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x00bf }
                    goto L_0x00ca
                L_0x00bf:
                    r0 = move-exception
                    kotlin.Result$Companion r2 = kotlin.Result.Companion
                    java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
                    java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
                L_0x00ca:
                    java.lang.Throwable r0 = kotlin.Result.m168117exceptionOrNullimpl(r0)
                    if (r0 == 0) goto L_0x00dc
                    java.lang.Object[] r2 = new java.lang.Object[r4]
                    r2[r3] = r0
                    java.lang.String r0 = "MicroMsg.OpenVoiceCameraVideoView"
                    java.lang.String r3 = "updateTexImage error"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r2)
                L_0x00dc:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105155l.C105156a.C105157a.onFrameAvailable(android.graphics.SurfaceTexture):void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105156a(String str, C105155l lVar, C15601d<? super C105156a> dVar) {
            super(2, dVar);
            this.f312259e = str;
            this.f312260f = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105156a(this.f312259e, this.f312260f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105156a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f312258d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109670d dVar = C105181w.INSTANCE.f312361U;
                String str = this.f312259e;
                this.f312258d = 1;
                obj = dVar.mo160896b(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13604l lVar = (C13604l) obj;
            SurfaceTexture surfaceTexture = (SurfaceTexture) lVar.f38556e;
            C8478d0 d0Var = new C8478d0();
            d0Var.f27483d = 2;
            surfaceTexture.setOnFrameAvailableListener(new C105157a(this.f312260f, d0Var, this.f312259e, (C110194c) lVar.f38555d));
            C105153k kVar = this.f312260f.f312251B;
            kVar.f308677r = surfaceTexture;
            kVar.f308678s = true;
            kVar.mo145980h();
            return C13598b0.f38549a;
        }
    }

    public C105155l(Context context, C109669c cVar, JSONObject jSONObject, int i, int i2) {
        super(context, cVar, jSONObject);
        this.f312251B = new C105153k(i, i2);
        this.f312257H = true;
    }

    /* renamed from: D */
    public /* synthetic */ void mo145645D(int i) {
    }

    /* renamed from: E */
    public final boolean mo149476E(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("config");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("camera", "back");
            Log.m105924i("MicroMsg.OpenVoiceCameraVideoView", "camera:" + optString);
            if (C87412m.m108589b(optString, "back")) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6.f312251B.f308679t == 90) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        if (r6.f312251B.f308679t == 90) goto L_0x0052;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo145646I(byte[] r7, long r8, int r10, int r11, int r12, int r13, double r14) {
        /*
            r6 = this;
            java.lang.String r8 = "pBuffer"
            gy3.C87412m.m108594g(r7, r8)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w r8 = com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w.INSTANCE
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.f1 r9 = r8.f312378h
            monitor-enter(r9)
            boolean r13 = r9.f312170c     // Catch:{ all -> 0x0061 }
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            if (r13 != 0) goto L_0x0011
            return
        L_0x0011:
            int r9 = r6.f312255F
            if (r9 != r10) goto L_0x0019
            int r9 = r6.f312256G
            if (r9 == r11) goto L_0x002c
        L_0x0019:
            r6.f312255F = r10
            r6.f312256G = r11
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.d$b r9 = r6.f312252C
            if (r9 == 0) goto L_0x002c
            int r13 = r6.getSameLayerSurfaceWidth()
            int r14 = r6.getSameLayerSurfaceHeight()
            r9.mo118174d(r13, r14)
        L_0x002c:
            int r9 = r6.f312254E
            if (r9 == 0) goto L_0x0050
            r13 = 1
            r14 = 90
            if (r9 == r13) goto L_0x0046
            r13 = 2
            if (r9 == r13) goto L_0x0043
            r13 = 3
            if (r9 == r13) goto L_0x003c
            goto L_0x0050
        L_0x003c:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.k r9 = r6.f312251B
            int r9 = r9.f308679t
            if (r9 != r14) goto L_0x0052
            goto L_0x004d
        L_0x0043:
            int r12 = r12 + 512
            goto L_0x004d
        L_0x0046:
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.k r9 = r6.f312251B
            int r9 = r9.f308679t
            if (r9 != r14) goto L_0x004d
            goto L_0x0052
        L_0x004d:
            int r12 = r12 + 1024
            goto L_0x0052
        L_0x0050:
            int r12 = r12 + 512
        L_0x0052:
            r2 = r12
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0 r9 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.o0
            r0 = r9
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.mo149500g(r9)
            return
        L_0x0061:
            r7 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0061 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105155l.mo145646I(byte[], long, int, int, int, int, double):void");
    }

    /* renamed from: c */
    public void mo145647c(int i) {
        C109674f.m148993a(i, this.f312251B.f308666d);
        this.f312254E = i;
        C85148d.C85150b bVar = this.f312252C;
        if (bVar != null) {
            bVar.mo118174d(getSameLayerSurfaceWidth(), getSameLayerSurfaceHeight());
        }
    }

    /* renamed from: k */
    public /* synthetic */ void mo145648k() {
    }

    /* renamed from: p */
    public void mo149438p() {
        Log.m105924i("MicroMsg.OpenVoiceCameraVideoView", "uint, viewId:" + getViewId() + ", openId:" + getOpenId() + ", memberId:" + getMemberId());
        this.f312251B.mo145981i();
        this.f312251B.getClass();
    }

    /* renamed from: r */
    public void mo149439r(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        if (this.f312257H) {
            Log.m105924i("MicroMsg.OpenVoiceCameraVideoView", "update, viewId:" + getViewId() + ", openId:" + getOpenId() + ", memberId:" + getMemberId() + ", data:" + jSONObject);
            boolean E = mo149476E(jSONObject);
            if (E != this.f312253D) {
                this.f312253D = E;
                this.f312251B.mo145975a();
            }
        }
    }

    public void setSameLayerCallback(C85148d.C85150b bVar) {
        this.f312252C = bVar;
    }

    /* renamed from: t */
    public /* synthetic */ void mo145649t(int i, int i2) {
    }

    /* renamed from: v */
    public void mo149440v(JSONObject jSONObject) {
        C87412m.m108594g(jSONObject, "data");
        Log.m105924i("MicroMsg.OpenVoiceCameraVideoView", "init: " + jSONObject);
        this.f312198h = jSONObject.optInt("viewId");
        this.f312253D = mo149476E(jSONObject);
        String optString = jSONObject.optString(V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, "fill");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != 3143043) {
                if (hashCode != 94852023) {
                    if (hashCode == 951526612 && optString.equals("contain")) {
                        this.f312210w = 1;
                    }
                } else if (optString.equals("cover")) {
                    this.f312210w = 2;
                }
            } else if (optString.equals("fill")) {
                this.f312210w = 0;
            }
        }
        this.f312251B.mo145977e(this, this.f312253D);
        C53895h.m60466d(this.f312250A, (C66212f) null, (C53934p0) null, new C105156a(getMemberId() + "_video", this, (C15601d<? super C105156a>) null), 3, (Object) null);
    }

    /* renamed from: w */
    public boolean mo149441w() {
        return false;
    }

    /* renamed from: y */
    public boolean mo149442y() {
        return false;
    }
}
