package p510ev;

import android.app.Activity;
import android.text.TextUtils;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import la2.C99358f;
import p529fv.C59330q;
import p749xh.C102658n6;
import ra2.C101365a;
import ua2.C101991b;

@C86522b
/* renamed from: ev.r */
public final class C97752r extends C86301e implements C59330q {
    /* renamed from: HN */
    public void mo84435HN(Activity activity, boolean z, boolean z2) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        int i = !z ? 5892 : 5888;
        if (!z2) {
            i |= 2;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(i);
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().setStatusBarColor(0);
        activity.getWindow().setNavigationBarColor(0);
        activity.getWindow().setFormat(-3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0206  */
    /* renamed from: LI */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo84436LI(android.content.Context r18, qc0.C101106m r19, te3.C64488kb1 r20, com.tencent.p014mm.pluginsdk.model.app.C44580q1 r21) {
        /*
            r17 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r5 = r21
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r1, r3)
            ma2.k0 r3 = ma2.C99811k0.f292499a
            java.lang.Class<ym.l> r4 = p763ym.C79138l.class
            r7 = 7
            r6 = 2
            r8 = 4
            java.lang.String r9 = "MusicUIUtil"
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "doJumpToApp wrapper is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            r7 = -1
            goto L_0x0339
        L_0x0020:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            int r11 = r0.f295959d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 0
            r10[r12] = r11
            java.lang.String r11 = r0.f295968p
            r13 = 1
            r10[r13] = r11
            java.lang.String r11 = r0.f295972t
            r10[r6] = r11
            java.lang.String r11 = r0.f295948I
            r14 = 3
            r10[r14] = r11
            java.lang.String r11 = "doJumpToApp MusicType:%d, SongWebUrl:%s, AppId:%s, srcUsername:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r10)
            di3.d r10 = di3.C86312j.m106911c(r4)
            ym.l r10 = (p763ym.C79138l) r10
            java.lang.String r11 = r0.f295972t
            com.tencent.mm.pluginsdk.model.app.j r10 = r10.getAppInfo(r11)
            if (r10 == 0) goto L_0x0059
            java.lang.Object[] r11 = new java.lang.Object[r13]
            java.lang.String r15 = r10.field_packageName
            r11[r12] = r15
            java.lang.String r15 = "packageName:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r15, r11)
            goto L_0x005e
        L_0x0059:
            java.lang.String r11 = "appInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r11)
        L_0x005e:
            int r11 = r0.f295959d
            r15 = 11
            java.lang.String r16 = ""
            if (r11 != r15) goto L_0x00a0
            com.tencent.mm.autogen.events.FetchAppBrandInfoForMusicEvent r0 = new com.tencent.mm.autogen.events.FetchAppBrandInfoForMusicEvent
            r0.<init>()
            r0.publish()
            com.tencent.mm.autogen.events.FetchAppBrandInfoForMusicEvent$a r0 = r0.f236206d
            java.lang.String r1 = r0.f236207a
            java.lang.String r2 = r0.f236209c
            java.lang.String r3 = r0.f236208b
            int r0 = r0.f236210d
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r16 = r2
        L_0x0081:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r12] = r1
            r2[r13] = r16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r2[r6] = r4
            r2[r14] = r3
            java.lang.String r4 = "from app brand, appId:%s, brandName:%s, pkgType:%d, appUserName:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r4, r2)
            java.lang.String r2 = "launch app brand Application"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            ma2.C99812l0.m130302g(r1, r3, r0)
            r7 = 4
            goto L_0x0339
        L_0x00a0:
            java.lang.String r8 = r0.f295972t
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x00c1
            java.lang.String r8 = r0.f295972t
            java.lang.String r11 = "wx485a97c844086dc9"
            boolean r8 = gy3.C87412m.m108589b(r8, r11)
            if (r8 == 0) goto L_0x00c1
            java.lang.String r2 = "launch qq music Application"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            android.app.Activity r1 = (android.app.Activity) r1
            ma2.C99812l0.m130297b(r0, r1)
            r7 = 5
            goto L_0x0339
        L_0x00c1:
            java.lang.String r8 = r0.f295972t
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r11 = "wx5aa333606550dfd5"
            if (r8 != 0) goto L_0x029a
            if (r10 == 0) goto L_0x029a
            java.lang.String r8 = r10.field_packageName
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x029a
            di3.d r8 = di3.C86312j.m106911c(r4)
            ym.l r8 = (p763ym.C79138l) r8
            java.lang.String r14 = r0.f295972t
            boolean r8 = r8.Tb0(r1, r14)
            if (r8 == 0) goto L_0x029a
            java.lang.String r8 = r0.f295972t
            int r14 = ma2.C99812l0.f292500a
            boolean r8 = gy3.C87412m.m108589b(r11, r8)
            if (r8 == 0) goto L_0x0211
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 10910(0x2a9e, float:1.5288E-41)
            java.lang.String r10 = "4"
            r2.kvStat(r8, r10)
            java.lang.String r2 = r0.f295968p
            java.lang.String r8 = za2.C102987e.m136178f(r2)
            if (r8 != 0) goto L_0x0101
            r8 = r16
        L_0x0101:
            java.lang.String r2 = za2.C102987e.m136179g(r2)
            if (r2 != 0) goto L_0x0109
            r2 = r16
        L_0x0109:
            int r10 = r8.length()
            if (r10 <= 0) goto L_0x0111
            r10 = 1
            goto L_0x0112
        L_0x0111:
            r10 = 0
        L_0x0112:
            if (r10 != 0) goto L_0x0124
            int r10 = r2.length()
            if (r10 <= 0) goto L_0x011c
            r10 = 1
            goto L_0x011d
        L_0x011c:
            r10 = 0
        L_0x011d:
            if (r10 == 0) goto L_0x0120
            goto L_0x0124
        L_0x0120:
            java.lang.String r2 = "qqmusic://qq.com/ui/jumpTab?p=%7B%22page%22%3A%221%22%7D&source=https%3a%2f%2fi.y.qq.com%2fv8%2fplaysong.html%3fADTAG%3dhz_weixin"
            goto L_0x0143
        L_0x0124:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "qqmusic://qq.com/media/playSonglist?p=%7b%22song%22%3a%5b%7b%22type%22%3a%220%22%2c%22songid%22%3a%22"
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = "%22%2c%22songmid%22%3a%22"
            r10.append(r8)
            r10.append(r2)
            java.lang.String r2 = "%22%7d%5d%2c%22action%22%3a%22play%22%7d&source=https%3a%2f%2fi.y.qq.com%2fv8%2fplaysong.html%3fADTAG%3dhz_weixin"
            r10.append(r2)
            java.lang.String r2 = r10.toString()
        L_0x0143:
            java.lang.Object[] r8 = new java.lang.Object[r13]
            r8[r12] = r2
            java.lang.String r10 = "launchQQMusic qqMusicActionUrl: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r8)
            android.net.Uri r8 = android.net.Uri.parse(r2)
            if (r8 != 0) goto L_0x015f
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r4[r12] = r2
            java.lang.String r2 = "launchQQMusic parse qq music action url fail, url %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r2, r4)
            goto L_0x0202
        L_0x015f:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r10 = "android.intent.action.VIEW"
            r2.<init>(r10, r8)
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r8)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isIntentAvailable(r1, r2, r12)
            if (r8 == 0) goto L_0x0202
            di3.d r8 = di3.C86312j.m106911c(r4)
            ym.l r8 = (p763ym.C79138l) r8
            di3.d r4 = di3.C86312j.m106911c(r4)
            ym.l r4 = (p763ym.C79138l) r4
            java.lang.String r10 = r0.f295972t
            com.tencent.mm.pluginsdk.model.app.j r4 = r4.getAppInfo(r10)
            java.lang.String r4 = r8.mo74011hv(r1, r4)
            if (r4 != 0) goto L_0x018a
            goto L_0x018c
        L_0x018a:
            r16 = r4
        L_0x018c:
            int r4 = r16.length()
            if (r4 <= 0) goto L_0x0194
            r4 = 1
            goto L_0x0195
        L_0x0194:
            r4 = 0
        L_0x0195:
            if (r4 == 0) goto L_0x01a3
            r4 = 2131831852(0x7f112c2c, float:1.9296741E38)
            java.lang.Object[] r8 = new java.lang.Object[r13]
            r8[r12] = r16
            java.lang.String r4 = r1.getString(r4, r8)
            goto L_0x01aa
        L_0x01a3:
            r4 = 2131831851(0x7f112c2b, float:1.929674E38)
            java.lang.String r4 = r1.getString(r4)
        L_0x01aa:
            java.lang.String r8 = "if (appName.isNotEmpty()…d_app_tips)\n            }"
            gy3.C87412m.m108593f(r4, r8)
            qo3.q r8 = new qo3.q
            r8.<init>(r1)
            r8.mo107595g(r4)
            r4 = 2131831849(0x7f112c29, float:1.9296735E38)
            java.lang.String r4 = r1.getString(r4)
            r8.mo107602n(r4)
            r4 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r4 = r1.getString(r4)
            r8.mo107598j(r4)
            ma2.h0 r4 = new ma2.h0
            r4.<init>(r1, r2, r5)
            r8.mo107600l(r4)
            ma2.i0 r2 = new ma2.i0
            r2.<init>(r5)
            r8.mo107597i(r2)
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            boolean r2 = gy3.C87412m.m108589b(r2, r4)
            if (r2 == 0) goto L_0x01ed
            r8.mo107603o()
            goto L_0x0201
        L_0x01ed:
            gu3.d r2 = gu3.C107917d.m146213b()
            gu3.g r4 = gu3.C107917d.f323121j
            r2.f323124b = r4
            ma2.j0 r4 = new ma2.j0
            r4.<init>(r8)
            gu3.d r2 = r2.mo158345f(r4)
            r2.mo158346g()
        L_0x0201:
            r12 = 1
        L_0x0202:
            if (r12 == 0) goto L_0x0206
            goto L_0x0339
        L_0x0206:
            java.lang.String r2 = "jumpToApp launch QQMusic failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r2)
            r3.mo139168b(r1, r0)
            goto L_0x0338
        L_0x0211:
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.String r6 = r10.field_packageName
            r3[r12] = r6
            java.lang.String r6 = "launch third party app, package name:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r3)
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject r3 = new com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject
            r3.<init>()
            java.lang.String r6 = r0.f295968p
            r3.musicUrl = r6
            java.lang.String r6 = r0.f295966n
            r3.musicDataUrl = r6
            if (r2 == 0) goto L_0x0230
            java.lang.String r6 = r2.f183917t
            if (r6 != 0) goto L_0x0232
        L_0x0230:
            r6 = r16
        L_0x0232:
            java.lang.String r6 = java.net.URLDecoder.decode(r6)
            r3.identification = r6
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r6 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r6.<init>(r3)
            r3 = 638064131(0x26081603, float:4.721431E-16)
            r6.sdkVer = r3
            if (r2 == 0) goto L_0x024b
            java.lang.String r2 = r2.f183916s
            if (r2 != 0) goto L_0x0249
            goto L_0x024b
        L_0x0249:
            r16 = r2
        L_0x024b:
            java.lang.String r2 = java.net.URLDecoder.decode(r16)
            r6.messageExt = r2
            gy3.f0 r2 = new gy3.f0
            r2.<init>()
            java.lang.Class<ox.b> r3 = p640ox.C77049b.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ox.b r3 = (p640ox.C77049b) r3
            java.lang.Class<te3.w23> r8 = te3.C64793w23.class
            pe3.a r3 = r3.Wi0(r1, r7, r8)
            te3.w23 r3 = (te3.C64793w23) r3
            if (r3 == 0) goto L_0x027e
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r3 = r3.f186034e
            java.lang.String r9 = "current_page_biz_info"
            r8.putString(r9, r3)
            java.lang.String r3 = "current_page_source_info"
            java.lang.String r9 = "music_operation_webview"
            r8.putString(r3, r9)
            r2.f27484d = r8
        L_0x027e:
            di3.d r3 = di3.C86312j.m106911c(r4)
            ym.l r3 = (p763ym.C79138l) r3
            java.lang.String r4 = r0.f295972t
            r8 = 0
            T r0 = r2.f27484d
            r9 = r0
            android.os.Bundle r9 = (android.os.Bundle) r9
            r0 = r3
            r1 = r18
            r2 = r4
            r3 = r6
            r4 = r8
            r5 = r21
            r6 = r9
            r0.mo74010gu(r1, r2, r3, r4, r5, r6)
            goto L_0x0339
        L_0x029a:
            java.lang.String r4 = r0.f295948I
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r5 = 0
            if (r4 != 0) goto L_0x02c9
            java.lang.String r2 = r0.f295968p
            if (r2 != 0) goto L_0x02a9
            java.lang.String r2 = r0.f295966n
        L_0x02a9:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r12] = r2
            java.lang.String r3 = "launch biz H5 url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = "rawUrl"
            r0.putExtra(r3, r2)
            java.lang.String r2 = "webview"
            java.lang.String r3 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r1, r2, r3, r0, r5)
            r7 = 6
            goto L_0x0339
        L_0x02c9:
            if (r2 == 0) goto L_0x02ce
            java.lang.String r4 = r2.f183920w
            goto L_0x02cf
        L_0x02ce:
            r4 = r5
        L_0x02cf:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x02e8
            java.lang.String r4 = "use androdiDownloadUrl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            java.lang.String r0 = r0.f295972t
            if (r2 == 0) goto L_0x02e1
            java.lang.String r5 = r2.f183920w
        L_0x02e1:
            gy3.C87412m.m108591d(r5)
            r3.mo139170d(r1, r0, r5)
            goto L_0x0338
        L_0x02e8:
            java.lang.String r2 = r0.f295972t
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0327
            java.lang.String r2 = r0.f295972t
            boolean r2 = gy3.C87412m.m108589b(r11, r2)
            if (r2 == 0) goto L_0x02fd
            java.lang.String r2 = "https://y.qq.com/m/download/index.html?channelId=2005000732"
        L_0x02fa:
            r16 = r2
            goto L_0x0327
        L_0x02fd:
            java.lang.String r2 = r0.f295972t
            java.lang.String r4 = "wx8dd6ecd81906fd84"
            boolean r2 = gy3.C87412m.m108589b(r4, r2)
            if (r2 == 0) goto L_0x030b
            java.lang.String r2 = "https://a.app.qq.com/o/simple.jsp?pkgname=com.netease.cloudmusic"
            goto L_0x02fa
        L_0x030b:
            java.lang.String r2 = r0.f295972t
            java.lang.String r4 = "wx79f2c4418704b4f8"
            boolean r2 = gy3.C87412m.m108589b(r4, r2)
            if (r2 == 0) goto L_0x0319
            java.lang.String r2 = "https://a.app.qq.com/o/simple.jsp?pkgname=com.kugou.android"
            goto L_0x02fa
        L_0x0319:
            java.lang.String r2 = r0.f295972t
            java.lang.String r4 = "wxc305711a2a7ad71c"
            boolean r2 = gy3.C87412m.m108589b(r4, r2)
            if (r2 == 0) goto L_0x0327
            java.lang.String r2 = "https://a.app.qq.com/o/simple.jsp?pkgname=cn.kuwo.player"
            goto L_0x02fa
        L_0x0327:
            r2 = r16
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 != 0) goto L_0x0335
            java.lang.String r0 = r0.f295972t
            r3.mo139170d(r1, r0, r2)
            goto L_0x0338
        L_0x0335:
            r3.mo139168b(r1, r0)
        L_0x0338:
            r7 = 2
        L_0x0339:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p510ev.C97752r.mo84436LI(android.content.Context, qc0.m, te3.kb1, com.tencent.mm.pluginsdk.model.app.q1):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if ((r17.length() == 0) != false) goto L_0x002d;
     */
    /* renamed from: VL */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo84437VL(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, qc0.C101106m r21, te3.C64488kb1 r22, com.tencent.p014mm.pluginsdk.model.app.C44580q1 r23) {
        /*
            r15 = this;
            r0 = r16
            r1 = r17
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.String r5 = "context"
            gy3.C87412m.m108594g(r0, r5)
            java.lang.String r5 = "wrapper"
            gy3.C87412m.m108594g(r2, r5)
            ma2.k0 r5 = ma2.C99811k0.f292499a
            java.lang.Class<ym.l> r6 = p763ym.C79138l.class
            java.lang.String r7 = "wx5aa333606550dfd5"
            java.lang.String r8 = "MusicUIUtil"
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L_0x002d
            int r11 = r17.length()
            if (r11 != 0) goto L_0x002a
            r11 = 1
            goto L_0x002b
        L_0x002a:
            r11 = 0
        L_0x002b:
            if (r11 == 0) goto L_0x0042
        L_0x002d:
            java.lang.String r11 = r2.f295972t
            boolean r11 = gy3.C87412m.m108589b(r7, r11)
            if (r11 == 0) goto L_0x0042
            java.lang.String r0 = "token is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            if (r4 == 0) goto L_0x0214
            r4.mo1579a(r9, r9)
            goto L_0x0214
        L_0x0042:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r12 = r2.f295972t
            r11[r9] = r12
            java.lang.String r12 = "AppId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r12, r11)
            di3.d r11 = di3.C86312j.m106911c(r6)
            ym.l r11 = (p763ym.C79138l) r11
            java.lang.String r12 = r2.f295972t
            boolean r11 = r11.Tb0(r0, r12)
            r12 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r13 = ""
            if (r11 != 0) goto L_0x00ef
            di3.d r1 = di3.C86312j.m106911c(r6)
            ym.l r1 = (p763ym.C79138l) r1
            di3.d r5 = di3.C86312j.m106911c(r6)
            ym.l r5 = (p763ym.C79138l) r5
            java.lang.String r6 = r2.f295972t
            com.tencent.mm.pluginsdk.model.app.j r5 = r5.getAppInfo(r6)
            java.lang.String r1 = r1.mo74011hv(r0, r5)
            if (r1 != 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r13 = r1
        L_0x007a:
            int r1 = r13.length()
            if (r1 <= 0) goto L_0x0082
            r1 = 1
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            if (r1 == 0) goto L_0x0091
            r1 = 2131831852(0x7f112c2c, float:1.9296741E38)
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r9] = r13
            java.lang.String r1 = r0.getString(r1, r5)
            goto L_0x0098
        L_0x0091:
            r1 = 2131831851(0x7f112c2b, float:1.929674E38)
            java.lang.String r1 = r0.getString(r1)
        L_0x0098:
            java.lang.String r5 = "if (appName.isNotEmpty()…d_app_tips)\n            }"
            gy3.C87412m.m108593f(r1, r5)
            qo3.q r5 = new qo3.q
            r5.<init>(r0)
            r5.mo107595g(r1)
            r1 = 2131831849(0x7f112c29, float:1.9296735E38)
            java.lang.String r1 = r0.getString(r1)
            r5.mo107602n(r1)
            java.lang.String r1 = r0.getString(r12)
            r5.mo107598j(r1)
            ma2.b0 r1 = new ma2.b0
            r1.<init>(r0, r2, r3, r4)
            r5.mo107600l(r1)
            ma2.c0 r0 = new ma2.c0
            r0.<init>(r4)
            r5.mo107597i(r0)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 == 0) goto L_0x00d9
            r5.mo107603o()
            goto L_0x0214
        L_0x00d9:
            gu3.d r0 = gu3.C107917d.m146213b()
            gu3.g r1 = gu3.C107917d.f323121j
            r0.f323124b = r1
            ma2.d0 r1 = new ma2.d0
            r1.<init>(r5)
            gu3.d r0 = r0.mo158345f(r1)
            r0.mo158346g()
            goto L_0x0214
        L_0x00ef:
            boolean r11 = android.text.TextUtils.isEmpty(r18)
            if (r11 != 0) goto L_0x0103
            boolean r11 = android.text.TextUtils.isEmpty(r19)
            if (r11 != 0) goto L_0x0103
            boolean r11 = android.text.TextUtils.isEmpty(r20)
            if (r11 != 0) goto L_0x0103
            r11 = 1
            goto L_0x0104
        L_0x0103:
            r11 = 0
        L_0x0104:
            java.lang.String r14 = r2.f295972t
            boolean r7 = gy3.C87412m.m108589b(r7, r14)
            if (r7 == 0) goto L_0x0129
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r14 = "qqmusic://qq.com/other/wxpurchase?wx_membership_ticket="
            r7.append(r14)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r7[r9] = r1
            java.lang.String r14 = "launchQQMusic qqMusicActionUrl: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r14, r7)
            goto L_0x0130
        L_0x0129:
            if (r11 == 0) goto L_0x020b
            gy3.C87412m.m108591d(r18)
            r1 = r18
        L_0x0130:
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r7[r9] = r1
            java.lang.String r14 = "launchMusic launchScheme: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r14, r7)
            android.net.Uri r7 = android.net.Uri.parse(r1)
            if (r7 != 0) goto L_0x0151
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r1
            java.lang.String r1 = "launchMusic parse music scheme action url fail, url %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r1, r0)
            if (r4 == 0) goto L_0x0214
            r4.mo1579a(r9, r9)
            goto L_0x0214
        L_0x0151:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r14 = "android.intent.action.VIEW"
            r1.<init>(r14, r7)
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isIntentAvailable(r0, r1, r9)
            if (r7 == 0) goto L_0x0201
            di3.d r3 = di3.C86312j.m106911c(r6)
            ym.l r3 = (p763ym.C79138l) r3
            di3.d r5 = di3.C86312j.m106911c(r6)
            ym.l r5 = (p763ym.C79138l) r5
            java.lang.String r2 = r2.f295972t
            com.tencent.mm.pluginsdk.model.app.j r2 = r5.getAppInfo(r2)
            java.lang.String r2 = r3.mo74011hv(r0, r2)
            if (r2 != 0) goto L_0x017c
            r2 = r13
        L_0x017c:
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0184
            r3 = 1
            goto L_0x0185
        L_0x0184:
            r3 = 0
        L_0x0185:
            r5 = 2131831853(0x7f112c2d, float:1.9296743E38)
            if (r3 == 0) goto L_0x0193
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r3[r9] = r2
            java.lang.String r2 = r0.getString(r5, r3)
            goto L_0x019b
        L_0x0193:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r2[r9] = r13
            java.lang.String r2 = r0.getString(r5, r2)
        L_0x019b:
            java.lang.String r3 = "if (appName.isNotEmpty()…p_tips, \"\")\n            }"
            gy3.C87412m.m108593f(r2, r3)
            r3 = 2131831850(0x7f112c2a, float:1.9296737E38)
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r5 = "context.getString(com.te…h_3rd_app_confirm_to_pay)"
            gy3.C87412m.m108593f(r3, r5)
            if (r11 == 0) goto L_0x01b8
            gy3.C87412m.m108591d(r19)
            gy3.C87412m.m108591d(r20)
            r2 = r19
            r3 = r20
        L_0x01b8:
            qo3.q r5 = new qo3.q
            r5.<init>(r0)
            r5.mo107595g(r2)
            r5.mo107602n(r3)
            java.lang.String r2 = r0.getString(r12)
            r5.mo107598j(r2)
            ma2.e0 r2 = new ma2.e0
            r2.<init>(r0, r1, r4)
            r5.mo107600l(r2)
            ma2.f0 r0 = new ma2.f0
            r0.<init>(r4)
            r5.mo107597i(r0)
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 == 0) goto L_0x01ec
            r5.mo107603o()
            goto L_0x0214
        L_0x01ec:
            gu3.d r0 = gu3.C107917d.m146213b()
            gu3.g r1 = gu3.C107917d.f323121j
            r0.f323124b = r1
            ma2.g0 r1 = new ma2.g0
            r1.<init>(r5)
            gu3.d r0 = r0.mo158345f(r1)
            r0.mo158346g()
            goto L_0x0214
        L_0x0201:
            java.lang.String r1 = "isIntentAvailable fail, launchMusic doJumpToAppSongPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            r5.mo139167a(r0, r2, r3, r4)
            goto L_0x0214
        L_0x020b:
            java.lang.String r1 = "launchMusic doJumpToAppSongPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            r5.mo139167a(r0, r2, r3, r4)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p510ev.C97752r.mo84437VL(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, qc0.m, te3.kb1, com.tencent.mm.pluginsdk.model.app.q1):void");
    }

    /* renamed from: bp */
    public C102658n6 mo84438bp(Activity activity) {
        String str;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Class cls = C99358f.class;
        C101365a U = ((C99358f) C101991b.m134284b(cls)).mo138809U();
        if (U != null) {
            return U;
        }
        if (activity.getIntent().hasExtra("db_music_id")) {
            str = activity.getIntent().getStringExtra("db_music_id");
            C87412m.m108591d(str);
        } else {
            str = "";
        }
        return !TextUtils.isEmpty(str) ? ((C99358f) C101991b.m134284b(cls)).mo138815i0(str) : U;
    }
}
