package com.tencent.p014mm.plugin.game;

import android.content.Context;
import sw1.C48478n;

/* renamed from: com.tencent.mm.plugin.game.l$$g */
public class l$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C48478n.C13793h f112843d;

    /* renamed from: e */
    public final /* synthetic */ C48478n.C48481f f112844e;

    /* renamed from: f */
    public final /* synthetic */ Context f112845f;

    public l$$g(C41877l lVar, C48478n.C13793h hVar, C48478n.C48481f fVar, Context context) {
        this.f112843d = hVar;
        this.f112844e = fVar;
        this.f112845f = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            ly1.w0 r0 = new ly1.w0
            r0.<init>()
            sw1.n$h r1 = r9.f112843d
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x000e
        L_0x000b:
            r0 = r3
            goto L_0x00a9
        L_0x000e:
            java.lang.String r4 = "gameCenterVideos"
            java.lang.String r4 = com.tencent.p014mm.vfs.VFSStrategy.m163776d(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r6 = r1.f38919c
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            java.lang.String r7 = "MicroMsg.MiniGameVideoProcessor"
            if (r6 != 0) goto L_0x003a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "gamelog.saveToGameCenterLocal, GameExternalService, file not exist path= "
            r0.append(r4)
            java.lang.String r1 = r1.f38919c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            goto L_0x000b
        L_0x003a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = java.io.File.separator
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = r1.f38917a
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x007b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = r1.f38917a
            r8.append(r6)
            r8.append(r4)
            java.lang.String r6 = r8.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "gamelog.saveToGameCenterLocal, GameExternalService, parentPath = "
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r4)
        L_0x007b:
            f40.e r4 = f40.C86709a0.m107523b()
            java.lang.String r4 = r4.mo121111i()
            java.lang.String r7 = "account().uinString"
            gy3.C87412m.m108593f(r4, r7)
            vx1.a r1 = r0.mo72119a(r1, r6, r4)
            if (r1 != 0) goto L_0x0090
            goto L_0x000b
        L_0x0090:
            r5.add(r1)
            java.lang.Class<sw1.q> r4 = sw1.C48484q.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            sw1.q r4 = (sw1.C48484q) r4
            vx1.b r4 = r4.mo66103Jx()
            vx1.c r4 = (vx1.C53039c) r4
            r4.mo73748qq(r5)
            r0.mo72120b(r5, r2)
            java.lang.String r0 = r1.field_fileId
        L_0x00a9:
            if (r0 != 0) goto L_0x00b5
            sw1.n$f r0 = r9.f112844e
            if (r0 == 0) goto L_0x00dc
            java.lang.String r1 = "videoId is null save local failed"
            r0.mo6931a(r1)
            goto L_0x00dc
        L_0x00b5:
            sw1.n$f r1 = r9.f112844e
            jy1.C46586d.f125494a = r1
            android.content.Context r1 = r9.f112845f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "https://game.weixin.qq.com/cgi-bin/h5/static/appcenter/publish.html?wechat_pkgid=appcenter_publish&MiniGamePublish=1&needDelAfterPost=1&ssid=30&s_uia=1004&s_pid=1&s_cid="
            r4.append(r5)
            sw1.n$h r5 = r9.f112843d
            java.lang.String r5 = r5.f38917a
            r4.append(r5)
            java.lang.String r5 = "&videoId="
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r4 = -1
            com.tencent.p014mm.plugin.game.commlib.util.C41874g.m45398b(r1, r0, r4, r2, r3)
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.l$$g.run():void");
    }
}
