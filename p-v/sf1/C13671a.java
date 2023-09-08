package sf1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import df1.C7322a;
import di3.C86312j;
import dp1.C58417y0;
import gy3.C87412m;
import ht1.C60172g4;
import java.util.Arrays;
import ke3.C88144b;
import kj2.C117407d;
import o40.C61926c;
import rs1.C13442s8;
import te3.C50124kf1;
import te3.C51384te1;

/* renamed from: sf1.a */
public final class C13671a {

    /* renamed from: a */
    public static final C13671a f38718a = new C13671a();

    /* renamed from: b */
    public static void m12975b(C13671a aVar, Context context, BaseFinderFeed baseFinderFeed, long j, int i, int i2, Object obj) {
        C7322a b;
        C51384te1 te12;
        Context context2 = context;
        long j2 = (i2 & 4) != 0 ? 0 : j;
        int i3 = (i2 & 8) != 0 ? 58 : i;
        aVar.getClass();
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(baseFinderFeed, "item");
        long itemId = baseFinderFeed.getItemId();
        C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
        C13442s8 f = aVar2.mo12873f(context2);
        int i4 = f != null ? f.f38096i : 0;
        C117407d.INSTANCE.idkeyStat(1278, 8, 1, false);
        String format = String.format(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmo) + "/security/readtemplate?t=weixin_report/w_type&scene=%s&wechat_real_lang=%s&content_ID=%s&commentscene=%s", Arrays.copyOf(new Object[]{Integer.valueOf(i3), LocaleUtil.getApplicationLanguage(), C61926c.m72691p(itemId), Integer.valueOf(i4)}, 4));
        C87412m.m108593f(format, "format(format, *args)");
        if (j2 != 0) {
            format = String.format(format + "&comment_ID=%s", Arrays.copyOf(new Object[]{C61926c.m72691p(j2)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
        }
        C50124kf1 kf12 = baseFinderFeed.mo3513o().getFeedObject().object_extend;
        Long valueOf = (kf12 == null || (te12 = kf12.f136749h) == null) ? null : Long.valueOf(te12.f142157e);
        if (valueOf != null) {
            format = String.format(format + "&ad_aid=%s", Arrays.copyOf(new Object[]{C61926c.m72691p(valueOf.longValue())}, 1));
            C87412m.m108593f(format, "format(format, *args)");
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", format);
        C88144b.m109791i(context2, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ex0(itemId);
        C13442s8 f2 = aVar2.mo12873f(context2);
        if (f2 != null && (b = C60172g4.C60173a.m70190b(f2, 0, 1, (Object) null)) != null) {
            b.mo8766a(new C7322a.C7323a(17, itemId));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        r11 = r11.f136749h;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m12976c(sf1.C13671a r4, android.content.Context r5, long r6, java.lang.String r8, java.lang.Long r9, int r10, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r11, int r12, java.lang.Object r13) {
        /*
            r13 = r12 & 8
            r0 = 0
            if (r13 == 0) goto L_0x0006
            r9 = r0
        L_0x0006:
            r13 = r12 & 16
            if (r13 == 0) goto L_0x000c
            r10 = 62
        L_0x000c:
            r12 = r12 & 32
            if (r12 == 0) goto L_0x0011
            r11 = r0
        L_0x0011:
            r4.getClass()
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r5, r4)
            java.lang.String r4 = "username"
            gy3.C87412m.m108594g(r8, r4)
            r4 = 4
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13 = 0
            r12[r13] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            r1 = 1
            r12[r1] = r10
            r10 = 2
            r12[r10] = r8
            if (r9 == 0) goto L_0x003b
            java.lang.String r10 = r9.toString()
            if (r10 != 0) goto L_0x003d
        L_0x003b:
            java.lang.String r10 = ""
        L_0x003d:
            r2 = 3
            r12[r2] = r10
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r12, r4)
            java.lang.String r10 = "https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&liveid=%s&liveidentityid=%s&msgId=%s"
            java.lang.String r4 = java.lang.String.format(r10, r4)
            java.lang.String r10 = "format(format, *args)"
            gy3.C87412m.m108593f(r4, r10)
            if (r11 == 0) goto L_0x0093
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()
            te3.kf1 r11 = r11.object_extend
            if (r11 == 0) goto L_0x0068
            te3.te1 r11 = r11.f136749h
            if (r11 == 0) goto L_0x0068
            long r11 = r11.f142157e
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            goto L_0x0069
        L_0x0068:
            r11 = r0
        L_0x0069:
            if (r11 == 0) goto L_0x0093
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            java.lang.String r4 = "&ad_aid=%s"
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            long r2 = r11.longValue()
            java.lang.String r11 = o40.C61926c.m72691p(r2)
            r12[r13] = r11
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r12, r1)
            java.lang.String r4 = java.lang.String.format(r4, r11)
            gy3.C87412m.m108593f(r4, r10)
        L_0x0093:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "liveExpose liveId:"
            r10.append(r11)
            r10.append(r6)
            java.lang.String r6 = ",username:"
            r10.append(r6)
            r10.append(r8)
            java.lang.String r6 = ",commentSeq:"
            r10.append(r6)
            r10.append(r9)
            java.lang.String r6 = " url: "
            r10.append(r6)
            r10.append(r4)
            java.lang.String r6 = r10.toString()
            java.lang.String r7 = "FinderExposeLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r7 = "showShare"
            r6.putExtra(r7, r13)
            java.lang.String r7 = "rawUrl"
            r6.putExtra(r7, r4)
            java.lang.String r4 = "webview"
            java.lang.String r7 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r5, r4, r7, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sf1.C13671a.m12976c(sf1.a, android.content.Context, long, java.lang.String, java.lang.Long, int, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, java.lang.Object):void");
    }

    /* renamed from: a */
    public final void mo13058a(Context context, long j, long j2, int i) {
        C7322a b;
        Context context2 = context;
        long j3 = j;
        C87412m.m108594g(context, "context");
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(context);
        int i2 = f != null ? f.f38096i : 0;
        C117407d.INSTANCE.idkeyStat(1278, 8, 1, false);
        String format = String.format(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmo) + "/security/readtemplate?t=weixin_report/w_type&scene=%s&wechat_real_lang=%s&content_ID=%s&comment_ID=%s&commentscene=%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), LocaleUtil.getApplicationLanguage(), C61926c.m72691p(j), C61926c.m72691p(j2), Integer.valueOf(i2)}, 5));
        C87412m.m108593f(format, "format(format, *args)");
        Intent intent = new Intent();
        intent.putExtra("rawUrl", format);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ex0(j3);
        C13442s8 f2 = aVar.mo12873f(context);
        if (f2 != null && (b = C60172g4.C60173a.m70190b(f2, 0, 1, (Object) null)) != null) {
            b.mo8766a(new C7322a.C7323a(17, j3));
        }
    }
}
