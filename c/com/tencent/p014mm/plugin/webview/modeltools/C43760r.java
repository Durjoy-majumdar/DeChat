package com.tencent.p014mm.plugin.webview.modeltools;

import a14.C0000n0;
import android.content.Context;
import android.webkit.PermissionRequest;
import fy3.C32227p;
import gy3.C8479f0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.webview.modeltools.WebViewPermissionRequestHelper$showPermissionAlert$1", mo125469f = "WebViewPermissionRequestHelper.kt", mo125470l = {235, 254}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.webview.modeltools.r */
public final class C43760r extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f118250d;

    /* renamed from: e */
    public Object f118251e;

    /* renamed from: f */
    public Object f118252f;

    /* renamed from: g */
    public int f118253g;

    /* renamed from: h */
    public final /* synthetic */ C8479f0<String[]> f118254h;

    /* renamed from: i */
    public final /* synthetic */ String[] f118255i;

    /* renamed from: j */
    public final /* synthetic */ Context f118256j;

    /* renamed from: n */
    public final /* synthetic */ C43758q f118257n;

    /* renamed from: o */
    public final /* synthetic */ C8479f0<String> f118258o;

    /* renamed from: p */
    public final /* synthetic */ PermissionRequest f118259p;

    /* renamed from: q */
    public final /* synthetic */ String f118260q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43760r(C8479f0<String[]> f0Var, String[] strArr, Context context, C43758q qVar, C8479f0<String> f0Var2, PermissionRequest permissionRequest, String str, C15601d<? super C43760r> dVar) {
        super(2, dVar);
        this.f118254h = f0Var;
        this.f118255i = strArr;
        this.f118256j = context;
        this.f118257n = qVar;
        this.f118258o = f0Var2;
        this.f118259p = permissionRequest;
        this.f118260q = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C43760r(this.f118254h, this.f118255i, this.f118256j, this.f118257n, this.f118258o, this.f118259p, this.f118260q, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C43760r) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r12.f118253g
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x002c
            if (r2 == r4) goto L_0x001c
            if (r2 != r5) goto L_0x0014
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00dd
        L_0x0014:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001c:
            java.lang.Object r2 = r12.f118252f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r12.f118251e
            android.webkit.PermissionRequest r6 = (android.webkit.PermissionRequest) r6
            java.lang.Object r7 = r12.f118250d
            com.tencent.mm.plugin.webview.modeltools.q r7 = (com.tencent.p014mm.plugin.webview.modeltools.C43758q) r7
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0069
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r13)
            gy3.f0<java.lang.String[]> r13 = r12.f118254h
            T r13 = r13.f27484d
            java.lang.String[] r13 = (java.lang.String[]) r13
            if (r13 == 0) goto L_0x007e
            android.content.Context r2 = r12.f118256j
            com.tencent.mm.plugin.webview.modeltools.q r7 = r12.f118257n
            gy3.f0<java.lang.String> r6 = r12.f118258o
            android.webkit.PermissionRequest r8 = r12.f118259p
            java.lang.String r9 = r12.f118260q
            di3.d r10 = di3.C86312j.m106911c(r0)
            aw.d r10 = (p447aw.C103918d) r10
            int r11 = r13.length
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r11)
            java.lang.String[] r13 = (java.lang.String[]) r13
            boolean r13 = r10.Gd0(r2, r13)
            if (r13 == 0) goto L_0x007e
            T r13 = r6.f27484d
            java.lang.String r13 = (java.lang.String) r13
            r12.f118250d = r7
            r12.f118251e = r8
            r12.f118252f = r9
            r12.f118253g = r4
            java.lang.Object r13 = com.tencent.p014mm.plugin.webview.modeltools.C43758q.m47606b(r7, r2, r13, r12)
            if (r13 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r6 = r8
            r2 = r9
        L_0x0069:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x007e
            java.lang.String r13 = "MicroMsg.WebViewPermissionRequestHelper"
            java.lang.String r0 = "onPermissionRequest cancel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            r7.mo68067d(r6, r2, r3, r4)
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        L_0x007e:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String[] r2 = r12.f118255i
            java.lang.String r6 = "android.webkit.resource.AUDIO_CAPTURE"
            boolean r2 = sx3.C110823p.m151009y(r2, r6)
            if (r2 == 0) goto L_0x00a0
            di3.d r2 = di3.C86312j.m106911c(r0)
            aw.d r2 = (p447aw.C103918d) r2
            android.content.Context r6 = r12.f118256j
            java.lang.String r7 = "android.permission.RECORD_AUDIO"
            boolean r2 = r2.Lb0(r6, r7)
            if (r2 != 0) goto L_0x00a0
            r13.add(r7)
        L_0x00a0:
            java.lang.String[] r2 = r12.f118255i
            java.lang.String r6 = "android.webkit.resource.VIDEO_CAPTURE"
            boolean r2 = sx3.C110823p.m151009y(r2, r6)
            if (r2 == 0) goto L_0x00bd
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            android.content.Context r2 = r12.f118256j
            java.lang.String r6 = "android.permission.CAMERA"
            boolean r0 = r0.Lb0(r2, r6)
            if (r0 != 0) goto L_0x00bd
            r13.add(r6)
        L_0x00bd:
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x00f9
            com.tencent.mm.plugin.webview.modeltools.q r0 = r12.f118257n
            android.content.Context r2 = r12.f118256j
            gy3.f0<java.lang.String> r6 = r12.f118258o
            T r6 = r6.f27484d
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            r12.f118250d = r7
            r12.f118251e = r7
            r12.f118252f = r7
            r12.f118253g = r5
            java.lang.Object r13 = com.tencent.p014mm.plugin.webview.modeltools.C43758q.m47605a(r0, r2, r13, r6, r12)
            if (r13 != r1) goto L_0x00dd
            return r1
        L_0x00dd:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x00ef
            com.tencent.mm.plugin.webview.modeltools.q r13 = r12.f118257n
            android.webkit.PermissionRequest r0 = r12.f118259p
            java.lang.String r1 = r12.f118260q
            r13.mo68067d(r0, r1, r4, r4)
            goto L_0x0102
        L_0x00ef:
            com.tencent.mm.plugin.webview.modeltools.q r13 = r12.f118257n
            android.webkit.PermissionRequest r0 = r12.f118259p
            java.lang.String r1 = r12.f118260q
            r13.mo68067d(r0, r1, r3, r4)
            goto L_0x0102
        L_0x00f9:
            com.tencent.mm.plugin.webview.modeltools.q r13 = r12.f118257n
            android.webkit.PermissionRequest r0 = r12.f118259p
            java.lang.String r1 = r12.f118260q
            r13.mo68067d(r0, r1, r4, r4)
        L_0x0102:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.modeltools.C43760r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
