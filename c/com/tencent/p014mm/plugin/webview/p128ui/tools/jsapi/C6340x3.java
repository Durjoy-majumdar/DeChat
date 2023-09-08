package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import t83.C13851h1;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.webview.ui.tools.jsapi.PrivateCommonApiHandler$doPrivateChangeQQLoginType$1", mo125469f = "PrivateCommonApiHandler.kt", mo125470l = {112}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.x3 */
public final class C6340x3 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f23229d;

    /* renamed from: e */
    public final /* synthetic */ String f23230e;

    /* renamed from: f */
    public final /* synthetic */ C6203a4 f23231f;

    /* renamed from: g */
    public final /* synthetic */ C13851h1 f23232g;

    /* renamed from: h */
    public final /* synthetic */ String f23233h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6340x3(String str, C6203a4 a4Var, C13851h1 h1Var, String str2, C15601d<? super C6340x3> dVar) {
        super(2, dVar);
        this.f23230e = str;
        this.f23231f = a4Var;
        this.f23232g = h1Var;
        this.f23233h = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C6340x3(this.f23230e, this.f23231f, this.f23232g, this.f23233h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C6340x3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r11 = r18
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r11.f23229d
            java.lang.String r12 = "errContent"
            java.lang.String r13 = "err_msg"
            java.lang.String r15 = ""
            r10 = 0
            r9 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 != r9) goto L_0x001f
            kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ d -> 0x001a }
            r14 = 0
            r17 = 1
            goto L_0x0090
        L_0x001a:
            r0 = move-exception
            r14 = 0
            r17 = 1
            goto L_0x004b
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r19)
            com.tencent.mm.modelsimple.e r1 = com.tencent.p014mm.modelsimple.C1303e.f10418a     // Catch:{ d -> 0x001a }
            java.lang.String r4 = r11.f23230e     // Catch:{ d -> 0x001a }
            r11.f23229d = r9     // Catch:{ d -> 0x001a }
            r2 = 1
            java.lang.String r7 = ""
            r8 = 4
            te3.qv3 r16 = new te3.qv3     // Catch:{ d -> 0x001a }
            r16.<init>()     // Catch:{ d -> 0x001a }
            r3 = r4
            r5 = r7
            r6 = r7
            r17 = 1
            r9 = r16
            r14 = 0
            r10 = r18
            java.lang.Object r1 = r1.mo1224b(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ d -> 0x004a }
            if (r1 != r0) goto L_0x0090
            return r0
        L_0x004a:
            r0 = move-exception
        L_0x004b:
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.String r2 = "MicroMsg.PrivateCommonApiHandler"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r15, r1)
            java.lang.String r0 = r0.f35059g
            ei.a r0 = p148ei.C7660a.m7782a(r0)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.a4 r1 = r11.f23231f
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r1 = r1.f22901a
            t83.h1 r2 = r11.f23232g
            r3 = 2
            rx3.l[] r4 = new rx3.C13604l[r3]
            rx3.l r3 = new rx3.l
            java.lang.String r5 = "fail"
            r3.<init>(r13, r5)
            r4[r14] = r3
            rx3.l r3 = new rx3.l
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r0.f26001b
            goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            if (r0 != 0) goto L_0x0082
            android.content.Context r0 = r1.f22697d
            r5 = 2131821478(0x7f1103a6, float:1.92757E38)
            java.lang.String r0 = r0.getString(r5)
            java.lang.String r5 = "msgHandler.context.getSt….app_err_system_busy_tip)"
            gy3.C87412m.m108593f(r0, r5)
        L_0x0082:
            r3.<init>(r12, r0)
            r4[r17] = r3
            java.util.Map r0 = sx3.C90364q0.m113147f(r4)
            java.lang.String r3 = "changeQQLoginType:fail"
            r1.mo7210k5(r2, r3, r0)
        L_0x0090:
            java.lang.String r0 = r11.f23233h
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00b0
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LAST_LOGIN_USERNAME_STRING
            java.lang.String r2 = r11.f23233h
            r0.mo119677K(r1, r2)
            eb0.i3 r0 = eb0.C7624i3.f25910c
            java.lang.String r1 = r11.f23233h
            java.lang.String r2 = "login_user_name"
            r0.mo8756d(r2, r1)
        L_0x00b0:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.a4 r0 = r11.f23231f
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = r0.f22901a
            t83.h1 r1 = r11.f23232g
            r2 = 2
            rx3.l[] r2 = new rx3.C13604l[r2]
            rx3.l r3 = new rx3.l
            java.lang.String r4 = "ok"
            r3.<init>(r13, r4)
            r2[r14] = r3
            rx3.l r3 = new rx3.l
            r3.<init>(r12, r15)
            r2[r17] = r3
            java.util.Map r2 = sx3.C90364q0.m113147f(r2)
            r0.mo7210k5(r1, r4, r2)
            java.lang.Class<zl.k> r0 = p286zl.C16293k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            zl.k r0 = (p286zl.C16293k) r0
            r0.mo14654YI()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6340x3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
