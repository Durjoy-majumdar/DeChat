package d80;

import fy3.C32226l;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camerax.CameraXImpl$bindCameraUseCases$2", mo125469f = "CameraXImpl.kt", mo125470l = {199, 202}, mo125471m = "invokeSuspend")
/* renamed from: d80.c */
public final class C107022c extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f320399d;

    /* renamed from: e */
    public Object f320400e;

    /* renamed from: f */
    public Object f320401f;

    /* renamed from: g */
    public Object f320402g;

    /* renamed from: h */
    public int f320403h;

    /* renamed from: i */
    public int f320404i;

    /* renamed from: j */
    public final /* synthetic */ C107007b f320405j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107022c(C107007b bVar, C15601d<? super C107022c> dVar) {
        super(1, dVar);
        this.f320405j = bVar;
    }

    public final C15601d<C13598b0> create(C15601d<?> dVar) {
        return new C107022c(this.f320405j, dVar);
    }

    public Object invoke(Object obj) {
        return ((C107022c) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r14.f320404i
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 0
            java.lang.String r6 = "MicroMsg.Camera.CameraXImpl"
            if (r1 == 0) goto L_0x0042
            if (r1 == r4) goto L_0x002f
            if (r1 != r2) goto L_0x0027
            int r0 = r14.f320403h
            java.lang.Object r1 = r14.f320402g
            d80.b r1 = (d80.C107007b) r1
            java.lang.Object r7 = r14.f320401f
            androidx.camera.core.CameraSelector r7 = (androidx.camera.core.CameraSelector) r7
            java.lang.Object r8 = r14.f320400e
            androidx.camera.lifecycle.ProcessCameraProvider r8 = (androidx.camera.lifecycle.ProcessCameraProvider) r8
            java.lang.Object r9 = r14.f320399d
            androidx.lifecycle.s r9 = (androidx.lifecycle.C0125s) r9
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00fd
        L_0x0027:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x002f:
            int r1 = r14.f320403h
            java.lang.Object r7 = r14.f320401f
            androidx.camera.core.CameraSelector r7 = (androidx.camera.core.CameraSelector) r7
            java.lang.Object r8 = r14.f320400e
            androidx.camera.lifecycle.ProcessCameraProvider r8 = (androidx.camera.lifecycle.ProcessCameraProvider) r8
            java.lang.Object r9 = r14.f320399d
            androidx.lifecycle.s r9 = (androidx.lifecycle.C0125s) r9
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00db
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.String r15 = "bindCameraUseCases start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
            d80.b r15 = r14.f320405j
            android.util.Size r1 = d80.C107007b.f320329C
            androidx.lifecycle.s r1 = r15.f304627f
            if (r1 != 0) goto L_0x0055
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        L_0x0055:
            androidx.camera.lifecycle.ProcessCameraProvider r15 = r15.f320333r
            if (r15 != 0) goto L_0x005c
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        L_0x005c:
            androidx.camera.core.CameraSelector$Builder r7 = new androidx.camera.core.CameraSelector$Builder
            r7.<init>()
            d80.b r8 = r14.f320405j
            e80.c r9 = r8.f304631j
            boolean r9 = r9.f320908c
            r8.getClass()
            androidx.camera.core.CameraSelector$Builder r7 = r7.requireLensFacing(r9)
            androidx.camera.core.CameraSelector r7 = r7.build()
            java.lang.String r8 = "Builder().requireLensFac…(getLensFacing()).build()"
            gy3.C87412m.m108593f(r7, r8)
            bp3.p r8 = bp3.C79758p.f233760a
            bp3.f r9 = bp3.C104160f.RepairerConfig_Camerax_Extension_Int
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            java.lang.Object r8 = r8.mo109878a(r9, r10)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Int"
            gy3.C87412m.m108592e(r8, r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.String r9 = "MicroMsg.Camera.CameraKitConfig"
            r10 = 3
            r11 = 5
            r12 = 4
            if (r8 == r4) goto L_0x00bf
            if (r8 == r2) goto L_0x00b8
            if (r8 == r10) goto L_0x00b2
            if (r8 == r12) goto L_0x00ab
            if (r8 == r11) goto L_0x00a4
            java.lang.String r8 = "getCameraxExtensionMode NONE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            r10 = 0
            goto L_0x00c5
        L_0x00a4:
            java.lang.String r8 = "getCameraxExtensionMode AUTO"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            r10 = 5
            goto L_0x00c5
        L_0x00ab:
            java.lang.String r8 = "getCameraxExtensionMode FACE_RETOUCH"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            r10 = 4
            goto L_0x00c5
        L_0x00b2:
            java.lang.String r8 = "getCameraxExtensionMode NIGHT"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            goto L_0x00c5
        L_0x00b8:
            java.lang.String r8 = "getCameraxExtensionMode HDR"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            r10 = 2
            goto L_0x00c5
        L_0x00bf:
            java.lang.String r8 = "getCameraxExtensionMode BOKEH"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            r10 = 1
        L_0x00c5:
            d80.b r8 = r14.f320405j
            r14.f320399d = r1
            r14.f320400e = r15
            r14.f320401f = r7
            r14.f320403h = r10
            r14.f320404i = r4
            java.lang.Object r8 = d80.C107007b.m144815I(r8, r7, r14)
            if (r8 != r0) goto L_0x00d8
            return r0
        L_0x00d8:
            r8 = r15
            r9 = r1
            r1 = r10
        L_0x00db:
            if (r1 <= 0) goto L_0x0196
            d80.b r15 = r14.f320405j
            androidx.camera.extensions.ExtensionsManager r10 = r15.f320334s
            if (r10 != 0) goto L_0x010c
            z8.f<androidx.camera.extensions.ExtensionsManager> r10 = r15.f320336u
            if (r10 == 0) goto L_0x0104
            r14.f320399d = r9
            r14.f320400e = r8
            r14.f320401f = r7
            r14.f320402g = r15
            r14.f320403h = r1
            r14.f320404i = r2
            java.lang.Object r10 = p202m2.C109472d.m148692a(r10, r14)
            if (r10 != r0) goto L_0x00fa
            return r0
        L_0x00fa:
            r0 = r1
            r1 = r15
            r15 = r10
        L_0x00fd:
            androidx.camera.extensions.ExtensionsManager r15 = (androidx.camera.extensions.ExtensionsManager) r15
            r13 = r0
            r0 = r15
            r15 = r1
            r1 = r13
            goto L_0x0105
        L_0x0104:
            r0 = r3
        L_0x0105:
            r15.f320334s = r0
            java.lang.String r15 = "buildCameraUsage await extensionsManager init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
        L_0x010c:
            d80.b r15 = r14.f320405j
            androidx.camera.extensions.ExtensionsManager r15 = r15.f320334s
            if (r15 == 0) goto L_0x011a
            boolean r15 = r15.isExtensionAvailable(r7, r1)
            if (r15 != r4) goto L_0x011a
            r15 = 1
            goto L_0x011b
        L_0x011a:
            r15 = 0
        L_0x011b:
            if (r15 == 0) goto L_0x0142
            d80.b r15 = r14.f320405j
            androidx.camera.extensions.ExtensionsManager r15 = r15.f320334s
            gy3.C87412m.m108591d(r15)
            androidx.camera.core.CameraSelector r7 = r15.getExtensionEnabledCameraSelector(r7, r1)
            java.lang.String r15 = "extensionsManager!!.getE…aSelector, extensionMode)"
            gy3.C87412m.m108593f(r7, r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "use extensionsManager Mode:"
            r15.append(r0)
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
            goto L_0x0196
        L_0x0142:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "extension:"
            r15.append(r0)
            r15.append(r1)
            java.lang.String r0 = " not support"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
            v70.a r15 = v70.C111386a.f333469a
            boolean r15 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r15 != 0) goto L_0x016e
            boolean r15 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r15 != 0) goto L_0x016e
            boolean r15 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r15 == 0) goto L_0x016c
            goto L_0x016e
        L_0x016c:
            r15 = 0
            goto L_0x016f
        L_0x016e:
            r15 = 1
        L_0x016f:
            if (r15 == 0) goto L_0x0196
            d80.b r15 = r14.f320405j
            android.content.Context r15 = r15.f304626e
            if (r15 == 0) goto L_0x0190
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "暂不支持:"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.widget.Toast r15 = nj3.C76912y0.makeText((android.content.Context) r15, (java.lang.CharSequence) r0, (int) r4)
            r15.show()
            goto L_0x0196
        L_0x0190:
            java.lang.String r15 = "context"
            gy3.C87412m.m108603p(r15)
            throw r3
        L_0x0196:
            r8.unbindAll()
            d80.b r15 = r14.f320405j     // Catch:{ Exception -> 0x01d2 }
            androidx.camera.core.UseCase[] r0 = new androidx.camera.core.UseCase[r2]     // Catch:{ Exception -> 0x01d2 }
            androidx.camera.core.Preview r1 = r15.f320338w     // Catch:{ Exception -> 0x01d2 }
            r0[r5] = r1     // Catch:{ Exception -> 0x01d2 }
            androidx.camera.core.ImageCapture r1 = r15.f320337v     // Catch:{ Exception -> 0x01d2 }
            r0[r4] = r1     // Catch:{ Exception -> 0x01d2 }
            androidx.camera.core.Camera r0 = r8.bindToLifecycle((androidx.lifecycle.C0125s) r9, (androidx.camera.core.CameraSelector) r7, (androidx.camera.core.UseCase[]) r0)     // Catch:{ Exception -> 0x01d2 }
            r15.f320339x = r0     // Catch:{ Exception -> 0x01d2 }
            d80.b r15 = r14.f320405j     // Catch:{ Exception -> 0x01d2 }
            androidx.camera.core.Camera r15 = r15.f320339x     // Catch:{ Exception -> 0x01d2 }
            if (r15 == 0) goto L_0x01c2
            androidx.camera.core.CameraInfo r15 = r15.getCameraInfo()     // Catch:{ Exception -> 0x01d2 }
            if (r15 == 0) goto L_0x01c2
            androidx.lifecycle.LiveData r15 = r15.getCameraState()     // Catch:{ Exception -> 0x01d2 }
            if (r15 == 0) goto L_0x01c2
            d80.b r0 = r14.f320405j     // Catch:{ Exception -> 0x01d2 }
            r15.observe(r9, r0)     // Catch:{ Exception -> 0x01d2 }
        L_0x01c2:
            d80.b r15 = r14.f320405j     // Catch:{ Exception -> 0x01d2 }
            d80.a r0 = r15.f320341z     // Catch:{ Exception -> 0x01d2 }
            androidx.camera.core.Camera r15 = r15.f320339x     // Catch:{ Exception -> 0x01d2 }
            d80.b r1 = r14.f320405j     // Catch:{ Exception -> 0x01d2 }
            e80.b r2 = r1.f304630i     // Catch:{ Exception -> 0x01d2 }
            int r1 = r1.f304625d     // Catch:{ Exception -> 0x01d2 }
            r0.mo157449a(r15, r2, r1)     // Catch:{ Exception -> 0x01d2 }
            goto L_0x01e7
        L_0x01d2:
            r15 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Use case binding failed:"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r15)
        L_0x01e7:
            java.lang.String r15 = "bindCameraUseCases finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: d80.C107022c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
