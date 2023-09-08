package com.tencent.p014mm.plugin.webview.modeltools;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44108o0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import e00.C45517q0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashMap;
import nj3.C76879j;
import p447aw.C103918d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.q */
public final class C43758q implements C45517q0 {

    /* renamed from: a */
    public final HashMap<String, Boolean> f118237a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<String, Boolean> f118238b = new HashMap<>();

    /* renamed from: c */
    public final C13601g f118239c = C36568h.m40985a(C30602a.f82418d);

    /* renamed from: d */
    public final C13601g f118240d = C36568h.m40985a(C30603b.f82419d);

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.q$a */
    public static final class C30602a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C30602a f82418d = new C30602a();

        public C30602a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_location_permission_expire_hour, 24));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.q$b */
    public static final class C30603b extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C30603b f82419d = new C30603b();

        public C30603b() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("WebPermissionStorage");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.webview.modeltools.WebViewPermissionRequestHelper$onGeolocationPermissionsShowPrompt$1", mo125469f = "WebViewPermissionRequestHelper.kt", mo125470l = {76, 90}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.webview.modeltools.q$c */
    public static final class C43759c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f118241d;

        /* renamed from: e */
        public final /* synthetic */ Context f118242e;

        /* renamed from: f */
        public final /* synthetic */ C43758q f118243f;

        /* renamed from: g */
        public final /* synthetic */ String f118244g;

        /* renamed from: h */
        public final /* synthetic */ String f118245h;

        /* renamed from: i */
        public final /* synthetic */ GeolocationPermissions.Callback f118246i;

        /* renamed from: j */
        public final /* synthetic */ String f118247j;

        /* renamed from: n */
        public final /* synthetic */ int f118248n;

        /* renamed from: o */
        public final /* synthetic */ String f118249o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43759c(Context context, C43758q qVar, String str, String str2, GeolocationPermissions.Callback callback, String str3, int i, String str4, C15601d<? super C43759c> dVar) {
            super(2, dVar);
            this.f118242e = context;
            this.f118243f = qVar;
            this.f118244g = str;
            this.f118245h = str2;
            this.f118246i = callback;
            this.f118247j = str3;
            this.f118248n = i;
            this.f118249o = str4;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C43759c(this.f118242e, this.f118243f, this.f118244g, this.f118245h, this.f118246i, this.f118247j, this.f118248n, this.f118249o, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C43759c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x013a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0159  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0165  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f118241d
                java.lang.String r3 = "context.getString(R.stri…location_msg_new, origin)"
                r4 = 2131840269(0x7f114d0d, float:1.9313813E38)
                r8 = 5
                r9 = 4
                r10 = 3
                r11 = 9
                java.lang.String r13 = "android.permission.ACCESS_FINE_LOCATION"
                r14 = 2
                r15 = 1
                r12 = 0
                if (r2 == 0) goto L_0x0030
                if (r2 == r15) goto L_0x002a
                if (r2 != r14) goto L_0x0022
                kotlin.ResultKt.throwOnFailure(r17)
                r2 = r17
                goto L_0x013b
            L_0x0022:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002a:
                kotlin.ResultKt.throwOnFailure(r17)
                r2 = r17
                goto L_0x005d
            L_0x0030:
                kotlin.ResultKt.throwOnFailure(r17)
                java.lang.Class<aw.d> r2 = p447aw.C103918d.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                aw.d r2 = (p447aw.C103918d) r2
                android.content.Context r5 = r0.f118242e
                boolean r2 = r2.Lb0(r5, r13)
                if (r2 == 0) goto L_0x00c6
                com.tencent.mm.plugin.webview.modeltools.q r2 = r0.f118243f
                android.content.Context r5 = r0.f118242e
                java.lang.Object[] r6 = new java.lang.Object[r15]
                java.lang.String r7 = r0.f118244g
                r6[r12] = r7
                java.lang.String r6 = r5.getString(r4, r6)
                gy3.C87412m.m108593f(r6, r3)
                r0.f118241d = r15
                java.lang.Object r2 = com.tencent.p014mm.plugin.webview.modeltools.C43758q.m47606b(r2, r5, r6, r0)
                if (r2 != r1) goto L_0x005d
                return r1
            L_0x005d:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x00c6
                com.tencent.mm.plugin.webview.modeltools.q r1 = r0.f118243f
                java.lang.String r2 = r0.f118245h
                java.lang.String r3 = r0.f118244g
                android.webkit.GeolocationPermissions$Callback r4 = r0.f118246i
                r1.mo68066c(r12, r2, r3, r4)
                com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r2 = new java.lang.Object[r11]
                java.lang.String r3 = r0.f118247j
                com.tencent.mm.sdk.platformtools.QueueWorkerThread r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.f121005a
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r3)
                r2[r12] = r3
                java.lang.String r3 = r0.f118245h
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r3)
                r2[r15] = r3
                int r3 = r0.f118248n
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r3)
                r2[r14] = r4
                java.lang.String r3 = r0.f118249o
                r2[r10] = r3
                int r3 = com.tencent.p014mm.plugin.webview.model.C43704h2.m47539g()
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r3)
                r2[r9] = r4
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r14)
                r2[r8] = r3
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r12)
                r4 = 6
                r2[r4] = r3
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r12)
                r4 = 7
                r2[r4] = r3
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r12)
                r4 = 8
                r2[r4] = r3
                r3 = 14340(0x3804, float:2.0095E-41)
                r1.mo160131h(r3, r2)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            L_0x00c6:
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r5 = new java.lang.Object[r11]
                java.lang.String r6 = r0.f118247j
                com.tencent.mm.sdk.platformtools.QueueWorkerThread r7 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.f121005a
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r6)
                r5[r12] = r6
                java.lang.String r6 = r0.f118245h
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r6)
                r5[r15] = r6
                int r6 = r0.f118248n
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r6)
                r5[r14] = r7
                java.lang.String r6 = r0.f118249o
                r5[r10] = r6
                int r6 = com.tencent.p014mm.plugin.webview.model.C43704h2.m47539g()
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r6)
                r5[r9] = r7
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r15)
                r5[r8] = r6
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r12)
                r7 = 6
                r5[r7] = r6
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r12)
                r7 = 7
                r5[r7] = r6
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r12)
                r7 = 8
                r5[r7] = r6
                r6 = 14340(0x3804, float:2.0095E-41)
                r2.mo160131h(r6, r5)
                java.lang.String[] r2 = new java.lang.String[]{r13}
                java.util.ArrayList r2 = sx3.C64197v.m75534c(r2)
                com.tencent.mm.plugin.webview.modeltools.q r5 = r0.f118243f
                android.content.Context r6 = r0.f118242e
                java.lang.Object[] r7 = new java.lang.Object[r15]
                java.lang.String r8 = r0.f118244g
                r7[r12] = r8
                java.lang.String r4 = r6.getString(r4, r7)
                gy3.C87412m.m108593f(r4, r3)
                r0.f118241d = r14
                java.lang.Object r2 = com.tencent.p014mm.plugin.webview.modeltools.C43758q.m47605a(r5, r6, r2, r4, r0)
                if (r2 != r1) goto L_0x013b
                return r1
            L_0x013b:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r1 = r2.booleanValue()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onGeolocationPermissionsShowPrompt isGrant = "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.WebViewPermissionRequestHelper"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                if (r1 == 0) goto L_0x0165
                com.tencent.mm.plugin.webview.modeltools.q r1 = r0.f118243f
                java.lang.String r2 = r0.f118245h
                java.lang.String r3 = r0.f118244g
                android.webkit.GeolocationPermissions$Callback r4 = r0.f118246i
                r1.mo68066c(r15, r2, r3, r4)
                goto L_0x0170
            L_0x0165:
                com.tencent.mm.plugin.webview.modeltools.q r1 = r0.f118243f
                java.lang.String r2 = r0.f118245h
                java.lang.String r3 = r0.f118244g
                android.webkit.GeolocationPermissions$Callback r4 = r0.f118246i
                r1.mo68066c(r12, r2, r3, r4)
            L_0x0170:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.modeltools.C43758q.C43759c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final Object m47605a(C43758q qVar, Context context, ArrayList arrayList, String str, C15601d dVar) {
        qVar.getClass();
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C6082s sVar = new C6082s(hVar);
        Object[] array = arrayList.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        ((C103918d) C86312j.m106911c(C103918d.class)).mo125777Uh(context, 0, sVar, (String[]) array, "", "", str);
        return hVar.mo90314b();
    }

    /* renamed from: b */
    public static final Object m47606b(C43758q qVar, Context context, String str, C15601d dVar) {
        qVar.getClass();
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C76879j.m92717K(context, false, "", str, context.getString(C0966R.string.a8h), context.getString(C0966R.string.a8i), new C6083t(hVar), new C6084u(hVar));
        return hVar.mo90314b();
    }

    /* renamed from: c */
    public final void mo68066c(boolean z, String str, String str2, GeolocationPermissions.Callback callback) {
        if (callback != null) {
            callback.invoke(str2, z, false);
        }
        if (str != null) {
            String m = C44108o0.f119483d.mo68739m(str);
            this.f118237a.put(m, Boolean.valueOf(z));
            mo68069f().encode(mo68068e(m), z);
        }
    }

    /* renamed from: d */
    public final void mo68067d(PermissionRequest permissionRequest, String str, boolean z, boolean z2) {
        if (z) {
            permissionRequest.grant(permissionRequest.getResources());
        } else {
            permissionRequest.deny();
        }
        if (z2) {
            this.f118238b.put(mo68070g(permissionRequest, str), Boolean.valueOf(z));
        }
    }

    /* renamed from: e */
    public final String mo68068e(String str) {
        C87412m.m108594g(str, "<this>");
        return "##allow##" + str;
    }

    /* renamed from: f */
    public final MultiProcessMMKV mo68069f() {
        return (MultiProcessMMKV) ((C36570n) this.f118240d).getValue();
    }

    /* renamed from: g */
    public final String mo68070g(PermissionRequest permissionRequest, String str) {
        String[] resources = permissionRequest.getResources();
        C87412m.m108593f(resources, "request.resources");
        String str2 = "";
        for (String str3 : resources) {
            if (!(str2 == null || C112551y.m153811k(str2))) {
                str2 = str2 + '-';
            }
            str2 = str2 + str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str != null ? C44108o0.f119483d.mo68739m(str) : null);
        sb.append('-');
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: h */
    public void mo68071h(Context context, String str, String str2, int i, String str3, String str4, GeolocationPermissions.Callback callback) {
        String str5 = str;
        String str6 = str4;
        GeolocationPermissions.Callback callback2 = callback;
        C87412m.m108594g(context, "context");
        Log.m105925i("MicroMsg.WebViewPermissionRequestHelper", "onGeolocationPermissionsShowPrompt, origin = %s", str6);
        if (str5 == null || C112551y.m153811k(str)) {
            if (callback2 != null) {
                callback2.invoke(str6, false, false);
            }
            Log.m105924i("MicroMsg.WebViewPermissionRequestHelper", "onGeolocationPermissionsShowPrompt, url is null");
            return;
        }
        String m = C44108o0.f119483d.mo68739m(str5);
        if (this.f118237a.containsKey(m)) {
            Boolean bool = this.f118237a.get(m);
            if (bool == null) {
                bool = Boolean.TRUE;
            }
            boolean booleanValue = bool.booleanValue();
            Log.m105924i("MicroMsg.WebViewPermissionRequestHelper", "onGeolocationPermissionsShowPrompt use cache, allow = " + booleanValue);
            if (callback2 != null) {
                callback2.invoke(str6, booleanValue, false);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long decodeLong = mo68069f().decodeLong(m, 0);
        if (Math.abs(currentTimeMillis - decodeLong) < ((long) ((Number) ((C36570n) this.f118239c).getValue()).intValue()) * 3600000 && mo68069f().containsKey(mo68068e(m))) {
            boolean decodeBool = mo68069f().decodeBool(mo68068e(m), true);
            Log.m105924i("MicroMsg.WebViewPermissionRequestHelper", "onGeolocationPermissionsShowPrompt less than " + ((Number) ((C36570n) this.f118239c).getValue()).intValue() + " hour(lastShowTime=" + decodeLong + ", allow=" + decodeBool + "), do not show alert.");
            if (decodeBool) {
                mo68066c(decodeBool, str5, str6, callback2);
                return;
            }
        }
        mo68069f().encode(m, currentTimeMillis);
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C43759c(context, this, str4, str, callback, str2, i, str3, (C15601d<? super C43759c>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo68072i(android.webkit.PermissionRequest r18, android.content.Context r19, java.lang.String r20) {
        /*
            r17 = this;
            r9 = r17
            r6 = r18
            r3 = r19
            r7 = r20
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "MicroMsg.WebViewPermissionRequestHelper"
            java.lang.String r1 = "onPermissionRequest"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            if (r6 != 0) goto L_0x0017
            return
        L_0x0017:
            java.lang.String[] r1 = r18.getResources()
            java.lang.String r2 = "android.webkit.resource.PROTECTED_MEDIA_ID"
            java.lang.String r4 = "android.webkit.resource.VIDEO_CAPTURE"
            java.lang.String r5 = "android.webkit.resource.AUDIO_CAPTURE"
            r8 = 1
            r10 = 0
            if (r1 == 0) goto L_0x005c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r12 = r1.length
            r13 = 0
        L_0x002c:
            if (r13 >= r12) goto L_0x004e
            r14 = r1[r13]
            boolean r15 = r14.equals(r5)
            if (r15 != 0) goto L_0x0045
            boolean r15 = r14.equals(r4)
            if (r15 != 0) goto L_0x0045
            boolean r15 = r14.equals(r2)
            if (r15 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r15 = 0
            goto L_0x0046
        L_0x0045:
            r15 = 1
        L_0x0046:
            if (r15 == 0) goto L_0x004b
            r11.add(r14)
        L_0x004b:
            int r13 = r13 + 1
            goto L_0x002c
        L_0x004e:
            java.lang.String[] r1 = new java.lang.String[r10]
            java.lang.Object[] r1 = r11.toArray(r1)
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r1, r11)
            java.lang.String[] r1 = (java.lang.String[]) r1
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            r11 = r1
            if (r11 == 0) goto L_0x006b
            int r1 = r11.length
            if (r1 != 0) goto L_0x0065
            r1 = 1
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            if (r1 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r1 = 0
            goto L_0x006c
        L_0x006b:
            r1 = 1
        L_0x006c:
            if (r1 == 0) goto L_0x0072
            r18.deny()
            return
        L_0x0072:
            java.lang.String r1 = r9.mo68070g(r6, r7)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r12 = r9.f118238b
            boolean r12 = r12.containsKey(r1)
            if (r12 == 0) goto L_0x00a6
            java.util.HashMap<java.lang.String, java.lang.Boolean> r2 = r9.f118238b
            java.lang.Object r1 = r2.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto L_0x008a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L_0x008a:
            boolean r1 = r1.booleanValue()
            r9.mo68067d(r6, r7, r1, r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onPermissionRequest use cache "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x00a6:
            gy3.f0 r12 = new gy3.f0
            r12.<init>()
            java.lang.String r1 = ""
            r12.f27484d = r1
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            boolean r13 = sx3.C110823p.m151009y(r11, r4)
            if (r13 != 0) goto L_0x00db
            boolean r13 = sx3.C110823p.m151009y(r11, r5)
            if (r13 == 0) goto L_0x00c1
            goto L_0x00db
        L_0x00c1:
            boolean r1 = sx3.C110823p.m151009y(r11, r2)
            if (r1 == 0) goto L_0x00d1
            r9.mo68067d(r6, r7, r8, r8)
            java.lang.String r1 = "showPermissionAlert grant PROTECTED_MEDIA_ID"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x016f
        L_0x00d1:
            r18.deny()
            java.lang.String r1 = "showPermissionAlert not support permission"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x016f
        L_0x00db:
            boolean r0 = sx3.C110823p.m151009y(r11, r4)
            java.lang.String r2 = "android.permission.CAMERA"
            java.lang.String r13 = "android.permission.RECORD_AUDIO"
            java.lang.String r14 = "{\n                permis…toString())\n            }"
            if (r0 == 0) goto L_0x010b
            boolean r0 = sx3.C110823p.m151009y(r11, r5)
            if (r0 == 0) goto L_0x010b
            java.lang.String[] r0 = new java.lang.String[]{r2, r13}
            r1.f27484d = r0
            r0 = 2131840253(0x7f114cfd, float:1.931378E38)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            android.net.Uri r4 = r18.getOrigin()
            java.lang.String r4 = r4.toString()
            r2[r10] = r4
            java.lang.String r0 = r3.getString(r0, r2)
            gy3.C87412m.m108593f(r0, r14)
            goto L_0x014a
        L_0x010b:
            boolean r0 = sx3.C110823p.m151009y(r11, r4)
            if (r0 == 0) goto L_0x012e
            java.lang.String[] r0 = new java.lang.String[]{r2}
            r1.f27484d = r0
            r0 = 2131840255(0x7f114cff, float:1.9313785E38)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            android.net.Uri r4 = r18.getOrigin()
            java.lang.String r4 = r4.toString()
            r2[r10] = r4
            java.lang.String r0 = r3.getString(r0, r2)
            gy3.C87412m.m108593f(r0, r14)
            goto L_0x014a
        L_0x012e:
            java.lang.String[] r0 = new java.lang.String[]{r13}
            r1.f27484d = r0
            r0 = 2131840257(0x7f114d01, float:1.9313789E38)
            java.lang.Object[] r2 = new java.lang.Object[r8]
            android.net.Uri r4 = r18.getOrigin()
            java.lang.String r4 = r4.toString()
            r2[r10] = r4
            java.lang.String r0 = r3.getString(r0, r2)
            gy3.C87412m.m108593f(r0, r14)
        L_0x014a:
            r12.f27484d = r0
            a14.n0 r10 = a14.C53930o0.m60555b()
            r13 = 0
            r14 = 0
            com.tencent.mm.plugin.webview.modeltools.r r15 = new com.tencent.mm.plugin.webview.modeltools.r
            r16 = 0
            r8 = 0
            r0 = r15
            r2 = r11
            r3 = r19
            r4 = r17
            r5 = r12
            r6 = r18
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = 3
            r2 = r10
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r16
            a14.C53895h.m60466d(r2, r3, r4, r5, r6, r7)
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.modeltools.C43758q.mo68072i(android.webkit.PermissionRequest, android.content.Context, java.lang.String):void");
    }
}
