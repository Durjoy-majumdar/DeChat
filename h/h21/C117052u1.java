package h21;

import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI;
import hp3.C87581a;
import ob0.C89132b;
import te3.C118466sp;

/* renamed from: h21.u1 */
public class C117052u1 implements C87581a<Object, C89132b.C89134c<C118466sp>> {

    /* renamed from: a */
    public final /* synthetic */ WalletCollectQrCodeUI f350727a;

    public C117052u1(WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f350727a = walletCollectQrCodeUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r13) {
        /*
            r12 = this;
            ob0.b$c r13 = (ob0.C89132b.C89134c) r13
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r13.f256793a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r13.f256794b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "MicroMsg.WalletCollectQrCodeUI"
            java.lang.String r4 = "CgiGetQrcode cgiBack.errType:%s，cgiBack.errCode：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r0 = r12.f350727a
            boolean r0 = r0.isFinishing()
            r4 = 0
            if (r0 != 0) goto L_0x01f2
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r0 = r12.f350727a
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L_0x01f2
            T r0 = r13.f256796d
            if (r0 != 0) goto L_0x0035
            goto L_0x01f2
        L_0x0035:
            int r5 = r13.f256793a
            if (r5 != 0) goto L_0x01e1
            int r5 = r13.f256794b
            if (r5 != 0) goto L_0x01e1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            te3.sp r0 = (te3.C118466sp) r0
            int r0 = r0.f354373d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r2] = r0
            java.lang.String r0 = "CgiGetQrcode cgiBack.resp.retcode : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r5)
            T r0 = r13.f256796d
            te3.sp r0 = (te3.C118466sp) r0
            int r5 = r0.f354373d
            if (r5 != 0) goto L_0x0184
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r13 = r12.f350727a
            e21.y0$b r13 = r13.f345689e
            java.lang.Class<ub3.b> r1 = ub3.C78144b.class
            java.lang.String r5 = "MicroMsg.WalletCollectQrCodeLogic"
            java.lang.String r6 = "[setPersonalConfig]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.lang.String r6 = " "
            if (r0 == 0) goto L_0x0099
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x007b }
            byte[] r8 = r0.toByteArray()     // Catch:{ IOException -> 0x007b }
            java.lang.String r9 = "ISO-8859-1"
            r7.<init>(r8, r9)     // Catch:{ IOException -> 0x007b }
            java.lang.String r6 = "setConfig success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ IOException -> 0x0079 }
            goto L_0x0098
        L_0x0079:
            r6 = move-exception
            goto L_0x007f
        L_0x007b:
            r7 = move-exception
            r11 = r7
            r7 = r6
            r6 = r11
        L_0x007f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "save config exp, "
            r8.append(r9)
            java.lang.String r6 = r6.getLocalizedMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
        L_0x0098:
            r6 = r7
        L_0x0099:
            di3.d r5 = di3.C86312j.m106911c(r1)
            ub3.b r5 = (ub3.C78144b) r5
            com.tencent.mm.wallet_core.model.q0 r5 = r5.mo107980OI()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WX_PAY_COLLECT_QRCODE_CONFIG_STRING_SYNC
            r5.mo119993e(r7, r6)
            di3.d r1 = di3.C86312j.m106911c(r1)
            ub3.b r1 = (ub3.C78144b) r1
            com.tencent.mm.wallet_core.model.q0 r1 = r1.mo107980OI()
            r1.mo119990a(r3)
            e21.C116673y0.m164541a(r13, r0, r4)
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r13 = r12.f350727a
            r13.getClass()
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 327731(0x50033, float:4.59249E-40)
            java.lang.String r4 = "0"
            java.lang.Object r0 = r0.mo119684e(r1, r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0135
            qo3.q r0 = new qo3.q
            androidx.appcompat.app.AppCompatActivity r4 = r13.getContext()
            r0.<init>(r4)
            r13.f345675F = r0
            android.content.res.Resources r4 = r13.getResources()
            r5 = 2131823888(0x7f110d10, float:1.9280588E38)
            java.lang.String r4 = r4.getString(r5)
            r0.mo107606r(r4)
            qo3.q r0 = r13.f345675F
            android.content.res.Resources r4 = r13.getResources()
            int r5 = com.tencent.p014mm.wallet_core.model.C45121z0.m49961a()
            java.lang.String r4 = r4.getString(r5)
            r0.mo107595g(r4)
            r0.mo107589a(r3)
            r4 = 2131838772(0x7f114734, float:1.9310777E38)
            r0.mo107601m(r4)
            h21.b1 r4 = new h21.b1
            r4.<init>(r13)
            r0.mo107600l(r4)
            r0.mo107603o()
            f40.C86709a0.m107528h()
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            java.lang.String r0 = "1"
            r13.mo119676J(r1, r0)
            f40.C86709a0.m107528h()
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            r13.mo119681a(r3)
        L_0x0135:
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r13 = r12.f350727a
            e21.y0$b r0 = r13.f345689e
            java.lang.String r1 = r0.f349839F
            java.lang.String r0 = r0.f349840G
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x0158
            android.widget.TextView r4 = r13.f345695n
            r4.setText(r1)
            android.widget.TextView r1 = r13.f345695n
            h21.z0 r4 = new h21.z0
            r4.<init>(r13, r0)
            r1.setOnClickListener(r4)
            android.widget.LinearLayout r13 = r13.f345694j
            r13.setVisibility(r2)
            goto L_0x015f
        L_0x0158:
            android.widget.LinearLayout r13 = r13.f345694j
            r0 = 8
            r13.setVisibility(r0)
        L_0x015f:
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r13 = r12.f350727a
            e21.y0$b r0 = r13.f345689e
            te3.vi r0 = r0.f349841H
            r13.mo175144i8(r0)
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r13 = r12.f350727a
            r13.mo175147l8(r2)
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r13 = r12.f350727a
            r13.mo175161y8(r3)
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r13 = r12.f350727a
            e21.y0$b r13 = r13.f345689e
            long r0 = java.lang.System.currentTimeMillis()
            r13.f349837D = r0
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r13 = r12.f350727a
            e21.y0$c r13 = r13.f345691g
            e21.C116648v0.m164518d(r13)
            goto L_0x01f0
        L_0x0184:
            r4 = 416(0x1a0, float:5.83E-43)
            if (r5 != r4) goto L_0x01d1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            te3.dn3 r0 = r0.f354374e
            if (r0 != 0) goto L_0x018f
            goto L_0x0190
        L_0x018f:
            r3 = 0
        L_0x0190:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r4[r2] = r0
            java.lang.String r0 = "realNameInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r4)
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r0 = r12.f350727a
            android.view.ViewGroup r0 = r0.f345693i
            r1 = 4
            r0.setVisibility(r1)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r0 = "realname_verify_process_jump_activity"
            java.lang.String r1 = ".ui.WalletCollectQrCodeUI"
            r5.putString(r0, r1)
            java.lang.String r0 = "realname_verify_process_jump_plugin"
            java.lang.String r1 = "collect"
            r5.putString(r0, r1)
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r2 = r12.f350727a
            T r13 = r13.f256796d
            te3.sp r13 = (te3.C118466sp) r13
            int r3 = r13.f354373d
            te3.dn3 r4 = r13.f354374e
            r6 = 1
            h21.t1 r7 = new h21.t1
            r7.<init>(r12)
            r8 = 0
            r9 = 1010(0x3f2, float:1.415E-42)
            r10 = 2
            a63.C67008a.m79170e(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x01f0
        L_0x01d1:
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r0 = r12.f350727a
            e21.y0$c r1 = r0.f345691g
            e21.y0$b r2 = r0.f345689e
            java.lang.String r13 = r13.f256795c
            androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
            e21.C116648v0.m164519e(r1, r2, r13, r0)
            goto L_0x01f0
        L_0x01e1:
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI r0 = r12.f350727a
            e21.y0$c r1 = r0.f345691g
            e21.y0$b r2 = r0.f345689e
            java.lang.String r13 = r13.f256795c
            androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
            e21.C116648v0.m164519e(r1, r2, r13, r0)
        L_0x01f0:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
        L_0x01f2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h21.C117052u1.call(java.lang.Object):java.lang.Object");
    }
}
