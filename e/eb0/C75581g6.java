package eb0;

import java.util.Map;

/* renamed from: eb0.g6 */
public class C75581g6 {

    /* renamed from: a */
    public Map<String, String> f222035a;

    public C75581g6(Map<String, String> map) {
        this.f222035a = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob0.C35136m.C35139b mo105918a() {
        /*
            r23 = this;
            r0 = r23
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f222035a
            java.lang.String r2 = ".sysmsg.WakenPush.PushContent"
            java.lang.Object r1 = r1.get(r2)
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f222035a
            java.lang.String r3 = ".sysmsg.WakenPush.Jump"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f222035a
            java.lang.String r5 = ".sysmsg.WakenPush.ExpiredTime"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map<java.lang.String, java.lang.String> r5 = r0.f222035a
            java.lang.String r6 = ".sysmsg.WakenPush.Username"
            java.lang.Object r5 = r5.get(r6)
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r13 = 0
            r5[r13] = r10
            r6 = 1
            r5[r6] = r1
            r7 = 2
            r5[r7] = r4
            java.lang.String r4 = "MicroMsg.WakenPushMsgExtension"
            java.lang.String r7 = "dzmonster[xml parse of wakenpush,pushContent:%s, jump:%s, expiredTime %s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r7, r5)
            java.lang.Class<lc3.b> r5 = lc3.C10485b.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            lc3.b r5 = (lc3.C10485b) r5
            pj.f r5 = r5.vh0()
            java.lang.String r7 = "WakenPushDeepLinkBitSet"
            java.lang.String r5 = r5.mo107405c(r7)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r13] = r5
            java.lang.String r8 = "dzmonster[config of WakenPushDeepLinkBitSet:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r8, r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r8 = 0
            if (r7 != 0) goto L_0x0066
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r8)
        L_0x0066:
            java.lang.Class<ln.i> r5 = p196ln.C76708i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ln.i r5 = (p196ln.C76708i) r5
            android.graphics.Bitmap r11 = r5.N50(r12)
            eb0.u2 r5 = eb0.C97625j3.m125816f()
            r7 = -1
            r14 = 0
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r15 == 0) goto L_0x0084
            java.lang.String r6 = "dzmonster:dealDeepLink[url is null]"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)
            goto L_0x00b5
        L_0x0084:
            r15 = 4
            long r17 = r8 & r15
            int r19 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r19 != 0) goto L_0x0098
            java.lang.String r15 = "weixin://dl/moments"
            boolean r15 = r1.startsWith(r15)
            if (r15 == 0) goto L_0x0098
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            goto L_0x00b7
        L_0x0098:
            r15 = 262144(0x40000, double:1.295163E-318)
            long r8 = r8 & r15
            int r17 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x00ac
            java.lang.String r8 = "weixin://dl/recommendation"
            boolean r8 = r1.startsWith(r8)
            if (r8 == 0) goto L_0x00ac
            java.lang.String r4 = "com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI"
            goto L_0x00b7
        L_0x00ac:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r13] = r1
            java.lang.String r8 = "dzmonster:dealDeepLink[unable to deal with the deep link:%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r8, r6)
        L_0x00b5:
            java.lang.String r4 = "com.tencent.mm.ui.LauncherUI"
        L_0x00b7:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6.setClassName(r8, r4)
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r6.setFlags(r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f222035a
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "LauncherUI.Show.Update.DialogMsg"
            r6.putExtra(r4, r2)
            java.lang.String r2 = "weixin://dl/update_newest_version"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00eb
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f222035a
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "LauncherUI.Show.Update.Url"
            r6.putExtra(r2, r1)
        L_0x00eb:
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 405(0x195, double:2.0E-321)
            r18 = 32
            r20 = 1
            r22 = 1
            r15.idkeyStat(r16, r18, r20, r22)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.util.UUID r2 = java.util.UUID.randomUUID()
            int r2 = r2.hashCode()
            r3 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r1, r2, r6, r3)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131821604(0x7f110424, float:1.9275956E38)
            java.lang.String r8 = r2.getString(r3)
            com.tencent.mm.booter.notification.MMNotification r5 = (com.tencent.p014mm.booter.notification.MMNotification) r5
            r4 = 0
            r5.getClass()
            com.tencent.mm.booter.notification.k r2 = com.tencent.p014mm.booter.notification.C67845k.C67847b.f194757a
            com.tencent.mm.booter.notification.j r2 = r2.f194756a
            com.tencent.mm.booter.notification.f r3 = r2.f194754a
            r5 = r7
            r6 = r14
            r7 = r1
            r9 = r10
            android.app.Notification r1 = r3.mo93226c(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r2 = r1.flags
            r2 = r2 | 16
            r1.flags = r2
            eb0.u2 r2 = eb0.C97625j3.m125816f()
            com.tencent.mm.booter.notification.MMNotification r2 = (com.tencent.p014mm.booter.notification.MMNotification) r2
            r2.mo93214k(r1, r13)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75581g6.mo105918a():ob0.m$b");
    }
}
