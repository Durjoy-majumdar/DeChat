package uu0;

import android.app.UiModeManager;
import android.content.pm.PackageManager;
import com.tencent.p014mm.autogen.events.AutoNewMessageEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import h81.C32735h;

/* renamed from: uu0.a */
public class C78281a extends IStaticListener<AutoNewMessageEvent> {
    /* renamed from: B */
    public static boolean m94567B() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_auto, 1) == 1;
    }

    /* renamed from: D */
    public static boolean m94568D() {
        return ((UiModeManager) MMApplicationContext.getContext().getSystemService("uimode")).getCurrentModeType() == 3;
    }

    /* renamed from: q */
    public static boolean m94569q() {
        boolean z;
        try {
            MMApplicationContext.getContext().getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 1);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        Log.m105925i("MicroMsg.auto.AutoLogic", "isInstallAutoApp %b", Boolean.valueOf(z));
        return z;
    }

    public boolean callback(IEvent iEvent) {
        AutoNewMessageEvent autoNewMessageEvent = (AutoNewMessageEvent) iEvent;
        if (autoNewMessageEvent instanceof AutoNewMessageEvent) {
            try {
                AutoNewMessageEvent.C67659a aVar = autoNewMessageEvent.f193479d;
                aVar.f193482c = mo108304d(aVar.f193480a, aVar.f193481b);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.auto.AutoLogic", th, "", new Object[0]);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0491 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p918s2.C90116e.C77603e mo108304d(java.lang.String r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r18
            boolean r1 = m94567B()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            boolean r1 = m94568D()
            java.lang.String r3 = "MicroMsg.auto.AutoLogic"
            if (r1 != 0) goto L_0x0018
            java.lang.String r0 = "not open car mode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r2
        L_0x0018:
            boolean r1 = m94569q()
            if (r1 != 0) goto L_0x0024
            java.lang.String r0 = "not install auto app"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return r2
        L_0x0024:
            r7 = 0
            kj2.d r4 = kj2.C117407d.INSTANCE
            r5 = 1496(0x5d8, double:7.39E-321)
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r3 = 32
            android.content.Intent r1 = r1.addFlags(r3)
            java.lang.String r4 = "com.tencent.mm.permission.MM_AUTO_HEARD_MESSAGE"
            android.content.Intent r1 = r1.setAction(r4)
            java.lang.String r4 = "key_username"
            android.content.Intent r1 = r1.putExtra(r4, r0)
            com.tencent.p014mm.sdk.platformtools.BroadcastHelper.setIntentPackageName(r1)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r6 = r18.hashCode()
            r7 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r12 = android.app.PendingIntent.getBroadcast(r5, r6, r1, r7)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.Intent r1 = r1.addFlags(r3)
            java.lang.String r3 = "com.tencent.mm.permission.MM_AUTO_REPLY_MESSAGE"
            android.content.Intent r1 = r1.setAction(r3)
            android.content.Intent r1 = r1.putExtra(r4, r0)
            com.tencent.p014mm.sdk.platformtools.BroadcastHelper.setIntentPackageName(r1)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r4 = r18.hashCode()
            android.app.PendingIntent r11 = android.app.PendingIntent.getBroadcast(r3, r4, r1, r7)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r7 = 1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131821666(0x7f110462, float:1.9276082E38)
            java.lang.String r5 = r1.getString(r3)
            s2.j r1 = new s2.j
            r6 = 0
            r8 = 0
            java.lang.String r4 = "key_voice_reply_text"
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = eb0.C45629t0.m50817d(r0, r2)
            r7 = 10
            if (r6 <= r7) goto L_0x00ab
            r6 = 10
        L_0x00ab:
            eb0.c r8 = eb0.C97625j3.m125812b()
            g62.l r8 = r8.mo105911z()
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            java.util.List r0 = r8.Lx0(r0, r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r6 = r0.size()
            r8 = 1
            int r6 = r6 - r8
            r14 = r3
        L_0x00c2:
            r3 = 0
            if (r6 < 0) goto L_0x0498
            java.lang.Object r4 = r0.get(r6)
            com.tencent.mm.storage.f4 r4 = (com.tencent.p014mm.storage.C72963f4) r4
            java.lang.String r9 = r4.mo108768t()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            r10 = -1
            if (r9 == 0) goto L_0x0133
            java.lang.String r9 = r4.mo108768t()
            java.lang.String r13 = r4.getContent()
            int r13 = eb0.C75604z3.m90848t(r13)
            if (r13 == r10) goto L_0x00f9
            java.lang.String r7 = r4.getContent()
            java.lang.String r7 = r7.substring(r3, r13)
            java.lang.String r7 = r7.trim()
            if (r7 == 0) goto L_0x00f9
            int r13 = r7.length()
            if (r13 <= 0) goto L_0x00f9
            r9 = r7
        L_0x00f9:
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r7 = r7.mo105907v()
            com.tencent.mm.storage.z1 r7 = r7.get(r9)
            java.lang.Class<d62.i> r13 = d62.C75339i.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            d62.i r13 = (d62.C75339i) r13
            java.lang.String r13 = r13.pv0(r7, r9)
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            if (r9 == 0) goto L_0x0134
            java.lang.String r7 = r7.getUsername()
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x0127
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r7 == 0) goto L_0x0134
        L_0x0127:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 2131823645(0x7f110c1d, float:1.9280096E38)
            java.lang.String r13 = r7.getString(r9)
            goto L_0x0134
        L_0x0133:
            r13 = r2
        L_0x0134:
            boolean r7 = r4.mo100979R3()
            r9 = 2
            r3 = 2131833688(0x7f113358, float:1.9300465E38)
            if (r7 == 0) goto L_0x014a
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = r7.getString(r3)
        L_0x0146:
            r2 = 10
            goto L_0x0469
        L_0x014a:
            boolean r7 = r4.mo100993e4()
            if (r7 == 0) goto L_0x0183
            java.lang.String r3 = r4.mo108768t()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            if (r3 == 0) goto L_0x017e
            int r3 = r4.mo108769t2()
            if (r3 == r8) goto L_0x017e
            java.lang.String r3 = r4.getContent()
            int r3 = eb0.C75604z3.m90848t(r3)
            if (r3 == r10) goto L_0x0179
            java.lang.String r7 = r4.getContent()
            int r3 = r3 + 1
            java.lang.String r3 = r7.substring(r3)
            java.lang.String r3 = r3.trim()
            goto L_0x0146
        L_0x0179:
            java.lang.String r3 = r4.getContent()
            goto L_0x0146
        L_0x017e:
            java.lang.String r3 = r4.getContent()
            goto L_0x0146
        L_0x0183:
            boolean r7 = r4.mo100995g4()
            if (r7 == 0) goto L_0x0195
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131833727(0x7f11337f, float:1.9300544E38)
            java.lang.String r3 = r3.getString(r7)
            goto L_0x0146
        L_0x0195:
            boolean r7 = r4.mo100994f4()
            if (r7 == 0) goto L_0x01a7
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131833726(0x7f11337e, float:1.9300542E38)
            java.lang.String r3 = r3.getString(r7)
            goto L_0x0146
        L_0x01a7:
            boolean r7 = r4.mo100989b4()
            if (r7 == 0) goto L_0x01b9
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131833717(0x7f113375, float:1.9300524E38)
            java.lang.String r3 = r3.getString(r7)
            goto L_0x0146
        L_0x01b9:
            boolean r7 = r4.mo101020w3()
            r10 = 2131833668(0x7f113344, float:1.9300425E38)
            r3 = 3
            if (r7 == 0) goto L_0x035a
            java.lang.String r7 = r4.getContent()
            com.tencent.mm.message.l$b r7 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r7, r2)
            if (r7 == 0) goto L_0x0356
            int r2 = r7.f195582i
            if (r2 == r9) goto L_0x0342
            java.lang.String r9 = ""
            if (r2 == r3) goto L_0x0326
            r3 = 4
            if (r2 == r3) goto L_0x030a
            r3 = 5
            if (r2 == r3) goto L_0x02ee
            r3 = 6
            if (r2 == r3) goto L_0x02d2
            r3 = 8
            if (r2 == r3) goto L_0x02b6
            r3 = 10
            if (r2 == r3) goto L_0x029a
            r3 = 13
            if (r2 == r3) goto L_0x027e
            r3 = 24
            if (r2 == r3) goto L_0x0271
            r3 = 15
            if (r2 == r3) goto L_0x0254
            r3 = 16
            if (r2 == r3) goto L_0x023a
            r3 = 19
            if (r2 == r3) goto L_0x021d
            r3 = 20
            if (r2 == r3) goto L_0x0200
            goto L_0x0356
        L_0x0200:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131833663(0x7f11333f, float:1.9300414E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f195570f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r9)
            r16 = 0
            r3[r16] = r7
            java.lang.String r3 = java.lang.String.format(r2, r3)
            goto L_0x0146
        L_0x021d:
            r16 = 0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131833662(0x7f11333e, float:1.9300412E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f195570f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r9)
            r3[r16] = r7
            java.lang.String r3 = java.lang.String.format(r2, r3)
            goto L_0x0146
        L_0x023a:
            r16 = 0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = r2.getString(r10)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f195570f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r9)
            r3[r16] = r7
            java.lang.String r3 = java.lang.String.format(r2, r3)
            goto L_0x0146
        L_0x0254:
            r16 = 0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131833655(0x7f113337, float:1.9300398E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f195570f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r9)
            r3[r16] = r7
            java.lang.String r3 = java.lang.String.format(r2, r3)
            goto L_0x0146
        L_0x0271:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131825823(0x7f11149f, float:1.9284513E38)
            java.lang.String r3 = r2.getString(r3)
            goto L_0x0146
        L_0x027e:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131833659(0x7f11333b, float:1.9300406E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f195570f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r9)
            r10 = 0
            r3[r10] = r7
            java.lang.String r3 = java.lang.String.format(r2, r3)
            goto L_0x0146
        L_0x029a:
            r10 = 0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131833661(0x7f11333d, float:1.930041E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f195570f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r9)
            r3[r10] = r7
            java.lang.String r3 = java.lang.String.format(r2, r3)
            goto L_0x0146
        L_0x02b6:
            r10 = 0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131833669(0x7f113345, float:1.9300427E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f195570f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r9)
            r3[r10] = r7
            java.lang.String r3 = java.lang.String.format(r2, r3)
            goto L_0x0146
        L_0x02d2:
            r10 = 0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131833656(0x7f113338, float:1.93004E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f195570f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r9)
            r3[r10] = r7
            java.lang.String r3 = java.lang.String.format(r2, r3)
            goto L_0x0146
        L_0x02ee:
            r10 = 0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131833657(0x7f113339, float:1.9300402E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f195570f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r9)
            r3[r10] = r7
            java.lang.String r3 = java.lang.String.format(r2, r3)
            goto L_0x0146
        L_0x030a:
            r10 = 0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131833664(0x7f113340, float:1.9300416E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f195570f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r9)
            r3[r10] = r7
            java.lang.String r3 = java.lang.String.format(r2, r3)
            goto L_0x0146
        L_0x0326:
            r10 = 0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131833660(0x7f11333c, float:1.9300408E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r7 = r7.f195570f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r9)
            r3[r10] = r7
            java.lang.String r3 = java.lang.String.format(r2, r3)
            goto L_0x0146
        L_0x0342:
            r10 = 0
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131833688(0x7f113358, float:1.9300465E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.String r3 = java.lang.String.format(r2, r3)
            goto L_0x0146
        L_0x0356:
            r2 = 10
            goto L_0x0423
        L_0x035a:
            r2 = 10
            boolean r7 = r4.mo100973L3()
            if (r7 == 0) goto L_0x03c0
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131833677(0x7f11334d, float:1.9300443E38)
            java.lang.String r3 = r3.getString(r7)
            java.lang.Class<z51.g> r9 = z51.C39315g.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            z51.g r9 = (z51.C39315g) r9
            zc3.a r9 = r9.mo58035cm()
            if (r9 == 0) goto L_0x0469
            java.lang.String r3 = r4.mo108765s2()
            i61.h r9 = (i61.C98602h) r9
            com.tencent.mm.storage.emotion.EmojiInfo r3 = r9.mo137999G(r3)
            if (r3 == 0) goto L_0x03b6
            java.lang.String r10 = r3.getMd5()
            java.lang.String r10 = r9.mo138012T(r10)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 == 0) goto L_0x0396
            goto L_0x03b6
        L_0x0396:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "["
            r7.append(r10)
            java.lang.String r3 = r3.getMd5()
            java.lang.String r3 = r9.mo138012T(r3)
            r7.append(r3)
            java.lang.String r3 = "]"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            goto L_0x0469
        L_0x03b6:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = r3.getString(r7)
            goto L_0x0469
        L_0x03c0:
            boolean r7 = r4.mo100982U3()
            if (r7 == 0) goto L_0x03d3
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131833689(0x7f113359, float:1.9300467E38)
            java.lang.String r3 = r3.getString(r7)
            goto L_0x0469
        L_0x03d3:
            boolean r7 = r4.mo101002k4()
            if (r7 != 0) goto L_0x0425
            boolean r7 = r4.mo101003l4()
            if (r7 == 0) goto L_0x03e0
            goto L_0x0425
        L_0x03e0:
            boolean r3 = r4.mo100975N3()
            if (r3 == 0) goto L_0x040e
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.l r3 = r3.mo105911z()
            java.lang.String r7 = r4.getContent()
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            com.tencent.mm.storage.f4$b r3 = r3.Rv0(r7)
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r7 = r7.getString(r10)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r3 = r3.mo101025b()
            r10 = 0
            r9[r10] = r3
            java.lang.String r3 = java.lang.String.format(r7, r9)
            goto L_0x0469
        L_0x040e:
            int r3 = r4.getType()
            r7 = -1879048186(0xffffffff90000006, float:-2.5243567E-29)
            if (r3 != r7) goto L_0x0423
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131833658(0x7f11333a, float:1.9300404E38)
            java.lang.String r3 = r3.getString(r7)
            goto L_0x0469
        L_0x0423:
            r3 = 0
            goto L_0x0469
        L_0x0425:
            java.lang.String r7 = r4.getContent()
            int r9 = com.tencent.p014mm.storage.C72963f4.f212661I1
            java.lang.String r9 = "voip_content_voice"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x045e
            java.lang.String r7 = r4.getContent()
            com.tencent.mm.autogen.events.VoipEvent r9 = new com.tencent.mm.autogen.events.VoipEvent
            r9.<init>()
            com.tencent.mm.autogen.events.VoipEvent$a r10 = r9.f194019d
            r10.f194022b = r8
            r10.f194021a = r7
            r9.publish()
            com.tencent.mm.autogen.events.VoipEvent$b r7 = r9.f194020e
            int r7 = r7.f194027a
            if (r7 != r3) goto L_0x044e
            r3 = 1
            goto L_0x044f
        L_0x044e:
            r3 = 0
        L_0x044f:
            if (r3 == 0) goto L_0x0452
            goto L_0x045e
        L_0x0452:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131833730(0x7f113382, float:1.930055E38)
            java.lang.String r3 = r3.getString(r7)
            goto L_0x0469
        L_0x045e:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131833735(0x7f113387, float:1.930056E38)
            java.lang.String r3 = r3.getString(r7)
        L_0x0469:
            if (r3 != 0) goto L_0x0476
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131833718(0x7f113376, float:1.9300526E38)
            java.lang.String r3 = r3.getString(r7)
        L_0x0476:
            if (r13 == 0) goto L_0x0486
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r9 = 0
            r7[r9] = r13
            r7[r8] = r3
            java.lang.String r3 = "%s: %s"
            java.lang.String r3 = java.lang.String.format(r3, r7)
        L_0x0486:
            if (r3 == 0) goto L_0x048b
            r5.add(r3)
        L_0x048b:
            if (r6 != 0) goto L_0x0491
            long r14 = r4.getCreateTime()
        L_0x0491:
            int r6 = r6 + -1
            r2 = 0
            r7 = 10
            goto L_0x00c2
        L_0x0498:
            s2.e$d r0 = new s2.e$d
            r0.<init>()
            int r2 = r5.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r5.toArray(r2)
            r9 = r2
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.lang.String[] r13 = new java.lang.String[r8]
            r2 = 0
            r13[r2] = r19
            s2.e$d$a r2 = new s2.e$d$a
            r8 = r2
            r10 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.f226231a = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uu0.C78281a.mo108304d(java.lang.String, java.lang.String):s2.e$e");
    }
}
