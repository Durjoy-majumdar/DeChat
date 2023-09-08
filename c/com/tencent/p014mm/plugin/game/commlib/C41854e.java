package com.tencent.p014mm.plugin.game.commlib;

import android.os.Build;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p168i6.C8850b;
import py1.C47582g;
import py1.C47675t1;
import sw1.C48477m;

/* renamed from: com.tencent.mm.plugin.game.commlib.e */
public class C41854e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f112799d;

    /* renamed from: e */
    public final C47350c f112800e;

    public C41854e(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C47675t1();
        bVar.f127067b = new GetGameCenterGlobalSettingResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/getgamecenterglobalsetting";
        bVar.f127069d = 1311;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f112800e = a;
        C47675t1 t1Var = (C47675t1) a.f127055a.f127080a;
        t1Var.f128017d = LocaleUtil.getApplicationLanguage();
        String I30 = C48477m.C13789a.m13091a().I30();
        t1Var.f128018e = Util.isNullOrNil(I30) ? Util.getSimCountryCode(MMApplicationContext.getContext()) : I30;
        t1Var.f128019f = ChannelUtil.channelId;
        C47582g gVar = new C47582g();
        t1Var.f128020g = gVar;
        gVar.f127701d = Build.VERSION.SDK_INT;
        gVar.f127702e = C8850b.m8679b(MMApplicationContext.getContext());
        t1Var.f128021h = i;
        Log.m105925i("MicroMsg.NetSceneGetGameGlobalConfig", "lang=%s, country=%s, releaseChannel=%s, osVersion = %d, deviceLevel = %d, scene:%d", t1Var.f128017d, t1Var.f128018e, Integer.valueOf(t1Var.f128019f), Integer.valueOf(t1Var.f128020g.f127701d), Integer.valueOf(t1Var.f128020g.f127702e), Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f112799d = nVar;
        return dispatch(gVar, this.f112800e, this);
    }

    public int getType() {
        return 1311;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c6 A[SYNTHETIC, Splitter:B:28:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f6 A[LOOP:1: B:39:0x00f0->B:41:0x00f6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r4, int r5, int r6, java.lang.String r7, com.tencent.p014mm.network.C114799u r8, byte[] r9) {
        /*
            r3 = this;
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "errType = "
            r4.append(r9)
            r4.append(r5)
            java.lang.String r9 = ", errCode = "
            r4.append(r9)
            r4.append(r6)
            java.lang.String r9 = ", errMsg = "
            r4.append(r9)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = "MicroMsg.NetSceneGetGameGlobalConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            if (r5 != 0) goto L_0x013d
            if (r6 == 0) goto L_0x002c
            goto L_0x013d
        L_0x002c:
            ob0.c r8 = (ob0.C47350c) r8
            ob0.c$d r4 = r8.f127056b
            pe3.a r4 = r4.f127083a
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r4 = (com.tencent.p014mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse) r4
            if (r4 != 0) goto L_0x003c
            ob0.n r4 = r3.f112799d
            r4.onSceneEnd(r5, r6, r7, r3)
            return
        L_0x003c:
            java.lang.String r8 = "game_mmkv"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r8)
            if (r8 == 0) goto L_0x004b
            java.lang.String r0 = "auto_run_switch"
            java.lang.String r1 = ""
            r8.encode((java.lang.String) r0, (java.lang.String) r1)
        L_0x004b:
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r1 = 0
            org.json.JSONObject r2 = o40.C61937h.m72709h(r4)
            r0[r1] = r2
            java.lang.String r1 = "GameGlobalConfig Response:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
            boolean r9 = com.tencent.p014mm.pluginsdk.model.C44594n1.m49046b()
            r8 = r8 ^ r9
            com.tencent.p014mm.plugin.game.commlib.C41853c.f112797a = r4
            py1.d0 r9 = r4.downloaderApp
            if (r9 == 0) goto L_0x007c
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_DOWNLOADER_APP_HIDDEN_BOOLEAN_SYNC
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r1 = com.tencent.p014mm.plugin.game.commlib.C41853c.f112797a
            py1.d0 r1 = r1.downloaderApp
            boolean r1 = r1.f127632d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r9.mo119677K(r0, r1)
        L_0x007c:
            com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1
            java.lang.String r0 = com.tencent.p014mm.plugin.game.commlib.util.C41872f.m45394d()
            r9.<init>((java.lang.String) r0)
            boolean r0 = r9.mo119967g()
            if (r0 == 0) goto L_0x0091
            boolean r0 = r9.mo119977o()
            if (r0 != 0) goto L_0x0094
        L_0x0091:
            r9.mo119987x()
        L_0x0094:
            r9 = 0
            byte[] r4 = r4.toByteArray()     // Catch:{ IOException -> 0x00a8 }
            com.tencent.mm.vfs.s1 r0 = new com.tencent.mm.vfs.s1     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r1 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45369c()     // Catch:{ IOException -> 0x00a8 }
            r0.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x00a8 }
            r0.write(r4)     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00c4
        L_0x00a6:
            r4 = move-exception
            goto L_0x00aa
        L_0x00a8:
            r4 = move-exception
            r0 = r9
        L_0x00aa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "saveConfig2File: "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "MicroMsg.GameConfigManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r4)
        L_0x00c4:
            if (r0 == 0) goto L_0x00cb
            r0.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00cb
        L_0x00ca:
        L_0x00cb:
            java.lang.Class<com.tencent.mm.plugin.game.commlib.j$a> r4 = com.tencent.p014mm.plugin.game.commlib.C41857j.C41858a.class
            if (r8 == 0) goto L_0x00e5
            java.util.LinkedList<java.lang.String> r8 = com.tencent.p014mm.plugin.game.commlib.C41857j.f112802a
            java.util.Iterator r8 = r8.iterator()
        L_0x00d5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.p014mm.ipcinvoker.C80907o.m98781d(r0, r9, r4, r9)
            goto L_0x00d5
        L_0x00e5:
            java.lang.String r8 = com.tencent.p014mm.plugin.game.commlib.C41857j.f112803b
            com.tencent.p014mm.ipcinvoker.C80907o.m98781d(r8, r9, r4, r9)
        L_0x00ea:
            java.util.LinkedList<tx1.c> r4 = tx1.C37297b.f98665a
            java.util.Iterator r4 = r4.iterator()
        L_0x00f0:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0100
            java.lang.Object r8 = r4.next()
            tx1.c r8 = (tx1.C52381c) r8
            r8.mo73383C3()
            goto L_0x00f0
        L_0x0100:
            java.lang.Class<tx1.d> r4 = tx1.C37298d.class
            wl.d r4 = p261wl.C38166b.m41759f(r4)
            wl.b$a r4 = (p261wl.C38166b.C38167a) r4
            wl.b$a$b r8 = new wl.b$a$b
            wl.d<T> r9 = r4.f100837d
            java.lang.Iterable r9 = r9.all()
            java.util.Iterator r9 = r9.iterator()
            r8.<init>(r4, r9)
        L_0x0117:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0137
            java.lang.Object r4 = r8.next()
            wl.i r4 = (p261wl.C38174i) r4
            android.app.Application r9 = p261wl.C38166b.f100836c
            boolean r9 = p261wl.C38166b.m41757d(r9, r4)
            if (r9 == 0) goto L_0x0117
            java.lang.Object r4 = r4.get()
            wl.f r4 = (p261wl.C15510f) r4
            tx1.d r4 = (tx1.C37298d) r4
            r4.mo61029C3()
            goto L_0x0117
        L_0x0137:
            ob0.n r4 = r3.f112799d
            r4.onSceneEnd(r5, r6, r7, r3)
            return
        L_0x013d:
            ob0.n r4 = r3.f112799d
            r4.onSceneEnd(r5, r6, r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.commlib.C41854e.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
