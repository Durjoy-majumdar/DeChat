package com.tencent.p014mm.qqlogin;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WebViewExWindowCloseEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/qqlogin/ChangeQQLoginTypeManager$exWindowCloseEventIListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/WebViewExWindowCloseEvent;", "plugin-account_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.qqlogin.ChangeQQLoginTypeManager$exWindowCloseEventIListener$1 */
public final class ChangeQQLoginTypeManager$exWindowCloseEventIListener$1 extends IListener<WebViewExWindowCloseEvent> {
    public ChangeQQLoginTypeManager$exWindowCloseEventIListener$1(C40008f fVar) {
        super(fVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r13) {
        /*
            r12 = this;
            com.tencent.mm.autogen.events.WebViewExWindowCloseEvent r13 = (com.tencent.p014mm.autogen.events.WebViewExWindowCloseEvent) r13
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r13, r0)
            com.tencent.mm.autogen.events.WebViewExWindowCloseEvent$a r0 = r13.f9610d
            java.lang.String r0 = r0.f9611a
            java.lang.String r1 = "escape_change_qq_login_type"
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = com.tencent.p014mm.qqlogin.ChangeQQLoginTypeManager.f24097c
            java.lang.String r2 = "ChangeQQLoginType_sendmsg"
            boolean r0 = z04.C112550d0.m153801u(r0, r2, r1)
            if (r0 == 0) goto L_0x0025
            com.tencent.mm.qqlogin.ChangeQQLoginTypeManager r0 = com.tencent.p014mm.qqlogin.ChangeQQLoginTypeManager.f24095a
            r0.mo7624b(r13)
            goto L_0x0185
        L_0x0025:
            java.lang.String r0 = com.tencent.p014mm.qqlogin.ChangeQQLoginTypeManager.f24097c
            java.lang.String r2 = "ChangeQQLoginType_kickout"
            boolean r0 = z04.C112550d0.m153801u(r0, r2, r1)
            if (r0 == 0) goto L_0x0180
            com.tencent.p014mm.qqlogin.ChangeQQLoginTypeManager.f24098d = r13
            ye3.l r13 = new ye3.l
            r13.<init>()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r2 = 6
            r3 = 0
            java.lang.Object r0 = r0.mo119684e(r2, r3)
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L_0x004b
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
        L_0x004b:
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r2 = "EnableModAlias"
            int r0 = r0.mo107404b(r2, r1)
            if (r0 == 0) goto L_0x00a4
            boolean r0 = eb0.C75592q0.m90791u()
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = eb0.C75592q0.m90773c()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x00a4
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x00a4
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0 = 2131836046(0x7f113c8e, float:1.9305248E38)
            java.lang.String r3 = r13.getString(r0)
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0 = 2131824491(0x7f110f6b, float:1.9281811E38)
            java.lang.String r5 = r13.getString(r0)
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r6 = r13.getString(r0)
            ye3.m r8 = ye3.C15991m.f43037d
            r4 = 0
            r7 = 1
            r9 = 0
            nj3.C76879j.m92709C(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0185
        L_0x00a4:
            java.lang.String r0 = "MicroMsg.ChangeQQLoginType.LogoutHelper"
            java.lang.String r2 = "reprot: MM_LightPushCloseWechat == OP_LogoutConfirm"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 99
            r6 = 145(0x91, double:7.16E-322)
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            if (r2 == 0) goto L_0x00ce
            ob0.b0 r2 = f40.C86709a0.m107524d()
            com.tencent.mm.network.g r2 = r2.f256809d
            if (r2 == 0) goto L_0x00ce
            ob0.b0 r2 = f40.C86709a0.m107524d()
            com.tencent.mm.network.g r2 = r2.f256809d
            r2.mo55479j0(r1)
        L_0x00ce:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            f40.e r3 = f40.C86709a0.m107523b()
            int r3 = r3.mo121110g()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            java.lang.String r3 = "dklogout User LOGOUT Now uin:%d , clear cookie"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r3, r2)
            com.tencent.mm.autogen.events.FcmUnRegisterEvent r2 = new com.tencent.mm.autogen.events.FcmUnRegisterEvent
            r2.<init>()
            r2.publish()
            java.lang.Class<ru.i> r2 = p680ru.C77570i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ru.i r2 = (p680ru.C77570i) r2
            r2.mo107724bH()
            java.lang.Class<h81.k> r2 = h81.C8496k.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.k r2 = (h81.C8496k) r2
            r2.mo9419s1()
            ob0.b0 r2 = f40.C86709a0.m107524d()
            ye3.n r3 = new ye3.n
            r3.<init>(r13)
            r13.f232232c = r3
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r4 = 255(0xff, float:3.57E-43)
            r2.mo123455a(r4, r3)
            com.tencent.mm.modelsimple.b0 r2 = new com.tencent.mm.modelsimple.b0
            r3 = 2
            r2.<init>(r3)
            r2.f10416f = r3
            ob0.b0 r3 = f40.C86709a0.m107524d()
            r3.mo123460f(r2)
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            ye3.o r5 = new ye3.o
            r5.<init>(r2, r13)
            r3.<init>((android.os.Looper) r4, (com.tencent.p014mm.sdk.platformtools.MTimerHandler.CallBack) r5, (boolean) r1)
            r13.f232233d = r3
            r4 = 12000(0x2ee0, double:5.929E-320)
            r3.startTimer(r4)
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r7 = r3.getString(r4)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 2131821480(0x7f1103a8, float:1.9275704E38)
            java.lang.String r8 = r3.getString(r4)
            r9 = 1
            r10 = 0
            ye3.p r11 = new ye3.p
            r11.<init>(r2, r13)
            qo3.i0 r2 = nj3.C76879j.m92723Q(r6, r7, r8, r9, r10, r11)
            r13.f232235f = r2
            boolean r13 = f40.C86709a0.m107522a()
            if (r13 == 0) goto L_0x017a
            java.lang.Class<ln.i> r13 = p196ln.C76708i.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            ln.i r13 = (p196ln.C76708i) r13
            java.lang.String r2 = eb0.C75592q0.m90789s()
            java.lang.String r13 = r13.mo106845oX(r2, r1)
            eb0.i3 r2 = eb0.C7624i3.f25910c
            r2.mo8754b(r13)
        L_0x017a:
            java.lang.String r13 = "reprot: MM_LightPushCloseWechat == OP_LogoutOutside"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
            goto L_0x0185
        L_0x0180:
            com.tencent.mm.qqlogin.ChangeQQLoginTypeManager r0 = com.tencent.p014mm.qqlogin.ChangeQQLoginTypeManager.f24095a
            r0.mo7624b(r13)
        L_0x0185:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.qqlogin.ChangeQQLoginTypeManager$exWindowCloseEventIListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
