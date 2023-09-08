package ha3;

import com.tencent.p014mm.autogen.events.ScanQrcodeExtDeviceLoginEvent;
import fa3.C31984g;
import ob0.C11385n;

/* renamed from: ha3.c */
public class C59808c implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C31984g f170713d;

    /* renamed from: e */
    public final /* synthetic */ ScanQrcodeExtDeviceLoginEvent f170714e;

    public C59808c(C32755d dVar, C31984g gVar, ScanQrcodeExtDeviceLoginEvent scanQrcodeExtDeviceLoginEvent) {
        this.f170713d = gVar;
        this.f170714e = scanQrcodeExtDeviceLoginEvent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0123, code lost:
        if (r8 != null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0133, code lost:
        if (r8 != null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0135, code lost:
        r8.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r25, int r26, java.lang.String r27, ob0.C117747y r28) {
        /*
            r24 = this;
            r1 = r24
            r0 = r26
            ob0.b0 r2 = eb0.C97625j3.m125815e()
            r3 = 971(0x3cb, float:1.36E-42)
            r2.mo123470p(r3, r1)
            fa3.g r2 = r1.f170713d
            ob0.c r2 = r2.f85168e
            ob0.c$d r2 = r2.f127056b
            pe3.a r2 = r2.f127083a
            te3.sa0 r2 = (te3.C64706sa0) r2
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r26)
            r6 = 0
            r4[r6] = r5
            r5 = 1
            r4[r5] = r27
            java.lang.String r7 = "ScanQrcodeExtDeviceLoginListener"
            java.lang.String r8 = "errCode:%d,errMsg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r8, r4)
            java.lang.String r4 = ""
            java.lang.String r8 = "intent.key.content.string"
            java.lang.String r9 = "intent.key.title.string"
            java.lang.String r10 = "intent.key.ok.string"
            java.lang.String r11 = "intent.key.icon.type"
            java.lang.String r12 = "intent.key.type"
            java.lang.String r13 = "intent.key.login.url"
            r14 = 0
            if (r25 != 0) goto L_0x0142
            if (r0 != 0) goto L_0x0142
            te3.va0 r0 = r2.f185391d
            if (r0 == 0) goto L_0x0204
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent r0 = r1.f170714e
            com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent$a r0 = r0.f78966d
            java.lang.String r0 = r0.f78967a
            r15.putExtra(r13, r0)
            r15.putExtra(r12, r6)
            te3.va0 r0 = r2.f185391d
            int r0 = r0.f185853d
            r15.putExtra(r11, r0)
            te3.va0 r0 = r2.f185391d
            java.lang.String r0 = r0.f185855f
            r15.putExtra(r10, r0)
            te3.va0 r0 = r2.f185391d
            java.lang.String r0 = r0.f185856g
            java.lang.String r10 = "intent.key.cancel.string"
            r15.putExtra(r10, r0)
            te3.va0 r0 = r2.f185391d
            java.lang.String r0 = r0.f185854e
            r15.putExtra(r9, r0)
            te3.va0 r0 = r2.f185391d
            java.lang.String r0 = r0.f185861o
            r15.putExtra(r8, r0)
            int r0 = r2.f185395h
            java.lang.String r8 = "intent.key.login.client.version"
            r15.putExtra(r8, r0)
            int r0 = r2.f185396i
            java.lang.String r8 = "intent.key.function.control"
            r15.putExtra(r8, r0)
            te3.va0 r0 = r2.f185391d
            java.lang.String r0 = r0.f185862p
            java.lang.String r8 = "intent.key.usage.link"
            r15.putExtra(r8, r0)
            te3.va0 r0 = r2.f185391d
            int r0 = r0.f185864r
            java.lang.String r8 = "intent.key.multi.device.tips.type"
            r15.putExtra(r8, r0)
            te3.va0 r0 = r2.f185391d
            java.lang.String r0 = r0.f185865s
            java.lang.String r8 = "intent.key.multi.device.tips.string"
            r15.putExtra(r8, r0)
            java.lang.String r0 = r2.f185397j
            java.lang.String r8 = "intent.key.auto.login.switch.tip.string"
            r15.putExtra(r8, r0)
            boolean r0 = r2.f185398n
            java.lang.String r8 = "intent.key.need.show.syncmsg.btn"
            r15.putExtra(r8, r0)
            te3.va0 r0 = r2.f185391d
            java.lang.String r0 = r0.f185863q
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x00c5
            bp3.p r0 = bp3.C79758p.f233760a
            bp3.f r8 = bp3.C104160f.RepairerConfig_Login_ExDeviceLoginSpam_String
            java.lang.String r0 = r0.mo109884g(r8, r4)
            te3.va0 r4 = r2.f185391d
            r4.f185863q = r0
        L_0x00c5:
            te3.va0 r0 = r2.f185391d
            java.lang.String r0 = r0.f185863q
            java.lang.String r4 = "intent.key.spam.url"
            r15.putExtra(r4, r0)
            te3.va0 r0 = r2.f185391d
            java.lang.String r4 = r0.f185854e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            eb0.c r8 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x012a, all -> 0x0128 }
            com.tencent.mm.storage.v3 r8 = r8.mo105908w()     // Catch:{ Exception -> 0x012a, all -> 0x0128 }
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r9 = p922vj.C78420a.f229768m1     // Catch:{ Exception -> 0x012a, all -> 0x0128 }
            com.tencent.mm.storage.i2 r8 = (com.tencent.p014mm.storage.C44660i2) r8     // Catch:{ Exception -> 0x012a, all -> 0x0128 }
            android.database.Cursor r8 = r8.mo69745P(r5, r14, r14, r5)     // Catch:{ Exception -> 0x012a, all -> 0x0128 }
            if (r8 == 0) goto L_0x011a
            int r9 = r8.getCount()     // Catch:{ Exception -> 0x0126 }
            te3.va0 r2 = r2.f185391d     // Catch:{ Exception -> 0x0126 }
            int r2 = r2.f185857h     // Catch:{ Exception -> 0x0126 }
            if (r9 >= r2) goto L_0x00f7
            int r2 = r8.getCount()     // Catch:{ Exception -> 0x0126 }
        L_0x00f7:
            java.lang.String r9 = "username"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ Exception -> 0x0126 }
            r10 = 0
        L_0x00ff:
            if (r10 >= r2) goto L_0x011a
            boolean r11 = r8.moveToPosition(r10)     // Catch:{ Exception -> 0x0126 }
            if (r11 == 0) goto L_0x0117
            java.lang.String r11 = r8.getString(r9)     // Catch:{ Exception -> 0x0126 }
            r0.append(r11)     // Catch:{ Exception -> 0x0126 }
            int r11 = r2 + -1
            if (r10 >= r11) goto L_0x0117
            java.lang.String r11 = ","
            r0.append(r11)     // Catch:{ Exception -> 0x0126 }
        L_0x0117:
            int r10 = r10 + 1
            goto L_0x00ff
        L_0x011a:
            java.lang.String r2 = "intent.key.ok.session.list"
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0126 }
            r15.putExtra(r2, r0)     // Catch:{ Exception -> 0x0126 }
            if (r8 == 0) goto L_0x0206
            goto L_0x0135
        L_0x0126:
            r0 = move-exception
            goto L_0x012c
        L_0x0128:
            r0 = move-exception
            goto L_0x013c
        L_0x012a:
            r0 = move-exception
            r8 = r14
        L_0x012c:
            java.lang.String r2 = "[oneliang]get session list error."
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x013a }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r2, r9)     // Catch:{ all -> 0x013a }
            if (r8 == 0) goto L_0x0206
        L_0x0135:
            r8.close()
            goto L_0x0206
        L_0x013a:
            r0 = move-exception
            r14 = r8
        L_0x013c:
            if (r14 == 0) goto L_0x0141
            r14.close()
        L_0x0141:
            throw r0
        L_0x0142:
            r7 = -1
            if (r0 != r7) goto L_0x01cb
            te3.pa0 r0 = r2.f185392e
            if (r0 == 0) goto L_0x0204
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r27)
            if (r0 != 0) goto L_0x0199
            ei.a r0 = p148ei.C7660a.m7782a(r27)
            if (r0 == 0) goto L_0x0199
            int r15 = r0.f26002c
            r3 = 4
            if (r15 != r3) goto L_0x0199
            ei.f r3 = r0.f26004e
            if (r3 == 0) goto L_0x0199
            int r3 = r3.f26012d
            if (r3 != r5) goto L_0x0199
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = r0.f26003d
            java.lang.String r6 = r0.f26001b
            ei.f r7 = r0.f26004e
            java.lang.String r8 = r7.f26014f
            java.lang.String r7 = r7.f26009a
            ha3.c$$a r7 = new ha3.c$$a
            r7.<init>(r0)
            if (r2 == 0) goto L_0x0198
            qo3.q r0 = new qo3.q
            r0.<init>(r2)
            if (r3 != 0) goto L_0x017f
            r3 = r4
        L_0x017f:
            r0.mo107606r(r3)
            if (r6 != 0) goto L_0x0185
            r6 = r4
        L_0x0185:
            r0.mo107595g(r6)
            if (r8 != 0) goto L_0x018b
            goto L_0x018c
        L_0x018b:
            r4 = r8
        L_0x018c:
            r0.mo107602n(r4)
            r0.mo107589a(r5)
            r0.mo107590b(r7)
            r0.mo107603o()
        L_0x0198:
            return
        L_0x0199:
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent r0 = r1.f170714e
            com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent$a r0 = r0.f78966d
            java.lang.String r0 = r0.f78967a
            r15.putExtra(r13, r0)
            r15.putExtra(r12, r7)
            te3.pa0 r0 = r2.f185392e
            java.lang.String r0 = r0.f184800f
            r15.putExtra(r9, r0)
            te3.pa0 r0 = r2.f185392e
            int r0 = r0.f184798d
            r15.putExtra(r11, r0)
            te3.pa0 r0 = r2.f185392e
            java.lang.String r0 = r0.f184801g
            r15.putExtra(r10, r0)
            te3.pa0 r0 = r2.f185392e
            java.lang.String r0 = r0.f184799e
            r15.putExtra(r8, r0)
            te3.pa0 r0 = r2.f185392e
            java.lang.String r4 = r0.f184799e
            goto L_0x0206
        L_0x01cb:
            r3 = -2
            if (r0 != r3) goto L_0x0204
            te3.qa0 r0 = r2.f185393f
            if (r0 == 0) goto L_0x0204
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent r0 = r1.f170714e
            com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent$a r0 = r0.f78966d
            java.lang.String r0 = r0.f78967a
            r15.putExtra(r13, r0)
            r15.putExtra(r12, r3)
            te3.qa0 r0 = r2.f185393f
            java.lang.String r0 = r0.f184987g
            r15.putExtra(r9, r0)
            te3.qa0 r0 = r2.f185393f
            int r0 = r0.f184984d
            r15.putExtra(r11, r0)
            te3.qa0 r0 = r2.f185393f
            java.lang.String r0 = r0.f184986f
            r15.putExtra(r10, r0)
            te3.qa0 r0 = r2.f185393f
            java.lang.String r0 = r0.f184985e
            r15.putExtra(r8, r0)
            te3.qa0 r0 = r2.f185393f
            java.lang.String r4 = r0.f184985e
            goto L_0x0206
        L_0x0204:
            r4 = r14
            r15 = r4
        L_0x0206:
            if (r15 == 0) goto L_0x02b7
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r15.setFlags(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Class<com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI> r2 = com.tencent.p014mm.plugin.webwx.p129ui.ExtDeviceWXLoginUI.class
            r15.setClass(r0, r2)
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r15)
            java.lang.Object[] r17 = r0.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/webwx/model/listener/ScanQrcodeExtDeviceLoginListener$1"
            java.lang.String r19 = "onSceneEnd"
            java.lang.String r20 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r21 = "Undefined"
            java.lang.String r22 = "startActivity"
            java.lang.String r23 = "(Landroid/content/Intent;)V"
            r16 = r7
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r0 = r0.mo10231a(r6)
            android.content.Intent r0 = (android.content.Intent) r0
            r7.startActivity(r0)
            java.lang.String r8 = "com/tencent/mm/plugin/webwx/model/listener/ScanQrcodeExtDeviceLoginListener$1"
            java.lang.String r9 = "onSceneEnd"
            java.lang.String r10 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r15)
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r0.setFlags(r2)
            com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent r2 = r1.f170714e
            com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent$a r2 = r2.f78966d
            int r2 = r2.f78968b
            if (r2 != r5) goto L_0x02b7
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r6, r0, r3)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            s2.e$c r3 = new s2.e$c
            java.lang.String r6 = "reminder_channel_id"
            r3.<init>(r2, r6)
            r3.mo124390o(r14)
            long r6 = java.lang.System.currentTimeMillis()
            android.app.Notification r2 = r3.f258814z
            r2.when = r6
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131821604(0x7f110424, float:1.9275956E38)
            java.lang.String r2 = r2.getString(r6)
            r3.mo124383h(r2)
            r3.mo124382g(r4)
            r3.f258795g = r0
            android.app.Notification r0 = r3.mo124378b()
            r2 = 2131233736(0x7f080bc8, float:1.8083618E38)
            r0.icon = r2
            int r2 = r0.flags
            r2 = r2 | 16
            r0.flags = r2
            r2 = 2
            android.net.Uri r2 = android.media.RingtoneManager.getDefaultUri(r2)
            r0.sound = r2
            eb0.u2 r2 = eb0.C97625j3.m125816f()
            r3 = 38
            com.tencent.mm.booter.notification.MMNotification r2 = (com.tencent.p014mm.booter.notification.MMNotification) r2
            r2.mo93215l(r3, r0, r5)
        L_0x02b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ha3.C59808c.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
