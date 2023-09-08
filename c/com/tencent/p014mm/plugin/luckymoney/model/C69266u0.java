package com.tencent.p014mm.plugin.luckymoney.model;

import a70.C112760b;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C57537n;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import ob0.C117747y;
import ob0.C35142u;
import ob0.C47350c;
import te3.C48908bu3;
import te3.C51297su;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.u0 */
public class C69266u0 extends IStaticListener<CheckResUpdateCacheFileEvent> implements C35142u {

    /* renamed from: d */
    public static final String f199336d = (C112760b.m154225d() + "luckymoney/");

    /* renamed from: B */
    public static String m81634B(int i, int i2) {
        return m81636q(i) + "detail_video_" + i2 + ".mp4";
    }

    /* renamed from: d */
    public static String m81635d(int i) {
        return f199336d + "" + i + "/";
    }

    /* renamed from: q */
    public static String m81636q(int i) {
        return m81635d(i) + "story/";
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r9) {
        /*
            r8 = this;
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r9 = (com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent) r9
            boolean r0 = f40.C86709a0.m107522a()
            r1 = 0
            if (r0 != 0) goto L_0x000b
            goto L_0x00b4
        L_0x000b:
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r0 = r9.f78743d
            int r0 = r0.f78744a
            r2 = 58
            r3 = 991(0x3df, float:1.389E-42)
            r4 = 2
            r5 = 3
            java.lang.String r6 = "MicroMsg.LuckyMoneyEnvelopeResUpdateListener"
            r7 = 1
            if (r0 != r2) goto L_0x007e
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r0 = r9.f78743d
            int r0 = r0.f78745b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r7] = r0
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r0 = r9.f78743d
            java.lang.String r0 = r0.f78746c
            r2[r4] = r0
            java.lang.String r0 = "luckyMoney resource file update, type: %s, subType: %s, filePath: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r2)
            f40.a0 r0 = f40.C86709a0.m107528h()
            f40.e r0 = r0.f251728e
            if (r0 == 0) goto L_0x004a
            boolean r0 = r0.f251764o
            if (r0 != r7) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r0 != 0) goto L_0x006f
            java.lang.Object[] r0 = new java.lang.Object[r5]
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r2 = r9.f78743d
            int r2 = r2.f78744a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r2 = r9.f78743d
            int r2 = r2.f78745b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r7] = r2
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r9 = r9.f78743d
            java.lang.String r9 = r9.f78746c
            r0[r4] = r9
            java.lang.String r9 = "[-] kernel extension was not invoked, skip this time. type: %s, subType: %s, filePath: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r9, r0)
            goto L_0x00b4
        L_0x006f:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0.mo175911u(r3, r1)
            com.tencent.mm.plugin.luckymoney.model.r0 r0 = new com.tencent.mm.plugin.luckymoney.model.r0
            r0.<init>(r8, r9)
            java.lang.String r2 = "lucky_money_envelope_resource_checker"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r0, r2)
        L_0x007e:
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r0 = r9.f78743d
            int r0 = r0.f78744a
            r2 = 104(0x68, float:1.46E-43)
            if (r0 != r2) goto L_0x00b4
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r0 = r9.f78743d
            int r0 = r0.f78745b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r7] = r0
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r0 = r9.f78743d
            java.lang.String r0 = r0.f78746c
            r2[r4] = r0
            java.lang.String r0 = "luckyMoney new year resource file update, type: %s, subType: %s, filePath: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r2)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 21
            r0.mo175911u(r3, r2)
            com.tencent.mm.plugin.luckymoney.model.s0 r0 = new com.tencent.mm.plugin.luckymoney.model.s0
            r0.<init>(r8, r9)
            java.lang.String r9 = "lucky_money_new_year_resource_checker"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r0, r9)
        L_0x00b4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69266u0.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "resourceType.errType:%s，errCode：%s", Integer.valueOf(i), Integer.valueOf(i2));
        if ((yVar instanceof C57537n) && i == 0 && i2 == 0) {
            C51297su suVar = (C51297su) ((C47350c) yVar.getReqResp()).f127056b.f127083a;
            if (!Util.isNullOrNil((List) suVar.f141753d)) {
                for (C48908bu3 next : suVar.f141753d) {
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(next.f131314d);
                    objArr[1] = Util.isNullOrNil((List) next.f131315e) ? "null" : String.valueOf(next.f131315e.size());
                    Log.m105925i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "resType：%d，responses.size()：%s", objArr);
                    if (next.f131314d == 58 && !Util.isNullOrNil((List) next.f131315e)) {
                        Log.m105924i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "real donwload envelope resource");
                        C115669n.INSTANCE.mo175911u(991, 16);
                    }
                    if (next.f131314d == 104 && !Util.isNullOrNil((List) next.f131315e)) {
                        Log.m105924i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "real donwload pag resource");
                        C115669n.INSTANCE.mo175911u(991, 20);
                    }
                }
            }
        }
    }
}
