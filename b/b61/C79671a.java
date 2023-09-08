package b61;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.network.C81038d0;
import com.tencent.p014mm.network.C92871c0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import f40.C86709a0;
import ic0.C21068c;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import jc0.C21210b;
import p1070zf.C91681d;
import p823sg.C77710q;
import qe3.C89625d;

/* renamed from: b61.a */
public class C79671a implements C21068c {

    /* renamed from: b61.a$a */
    public static class C79672a {
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00d4  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static jc0.C21210b m96785a(java.lang.String r26, com.tencent.p014mm.network.C81035d.C81037b r27) {
            /*
                com.tencent.mm.network.c0 r1 = m96786b(r26, r27)
                long r2 = java.lang.System.currentTimeMillis()
                r0 = r1
                com.tencent.mm.network.d0 r0 = (com.tencent.p014mm.network.C81038d0) r0
                int r4 = r0.mo112916a()
                r5 = 302(0x12e, float:4.23E-43)
                r6 = 1
                r7 = 0
                java.lang.String r8 = "MicroMsg.emoji.EmojiDownloader.DefaultHttpClientFactory"
                if (r4 != r5) goto L_0x0044
                java.lang.String r5 = "302 redirect: %s"
                java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0039 }
                r9[r7] = r26     // Catch:{ Exception -> 0x0039 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r9)     // Catch:{ Exception -> 0x0039 }
                java.lang.String r5 = "location"
                java.lang.String r0 = r0.mo112922f(r5)     // Catch:{ Exception -> 0x0039 }
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0039 }
                if (r5 != 0) goto L_0x0044
                com.tencent.mm.network.d$b r5 = new com.tencent.mm.network.d$b     // Catch:{ Exception -> 0x0039 }
                r5.<init>(r0)     // Catch:{ Exception -> 0x0039 }
                com.tencent.mm.network.c0 r0 = m96786b(r0, r5)     // Catch:{ Exception -> 0x0037 }
                r1 = r0
                goto L_0x0046
            L_0x0037:
                r0 = move-exception
                goto L_0x003c
            L_0x0039:
                r0 = move-exception
                r5 = r27
            L_0x003c:
                java.lang.Object[] r9 = new java.lang.Object[r7]
                java.lang.String r10 = "httpURLConnectionGet 302 redirect"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r10, r9)
                goto L_0x0046
            L_0x0044:
                r5 = r27
            L_0x0046:
                int r0 = com.tencent.p014mm.network.C81035d.m98960a(r1)
                r9 = 0
                if (r0 == 0) goto L_0x00d4
                com.tencent.mm.network.d0 r1 = (com.tencent.p014mm.network.C81038d0) r1
                int r0 = r1.mo112916a()
                r1 = 5
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r7] = r26
                java.lang.String r2 = r5.f238040c
                r1[r6] = r2
                r3 = 2
                r1[r3] = r2
                r2 = 3
                int r3 = r5.f238041d
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                r2 = 4
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                r1[r2] = r3
                java.lang.String r2 = "checkHttpConnection failed! url:%s urlIP:%s dnsServerIP:%s dnsType:%d retCode:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r2, r1)
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L_0x00b3
                switch(r0) {
                    case 502: goto L_0x00a5;
                    case 503: goto L_0x0097;
                    case 504: goto L_0x0089;
                    default: goto L_0x007b;
                }
            L_0x007b:
                com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r11 = 315(0x13b, double:1.556E-321)
                r13 = 12
                r15 = 1
                r17 = 0
                r10.idkeyStat(r11, r13, r15, r17)
                goto L_0x00c0
            L_0x0089:
                com.tencent.mm.plugin.report.service.n r18 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r19 = 315(0x13b, double:1.556E-321)
                r21 = 11
                r23 = 1
                r25 = 0
                r18.idkeyStat(r19, r21, r23, r25)
                goto L_0x00c0
            L_0x0097:
                com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r11 = 315(0x13b, double:1.556E-321)
                r13 = 10
                r15 = 1
                r17 = 0
                r10.idkeyStat(r11, r13, r15, r17)
                goto L_0x00c0
            L_0x00a5:
                com.tencent.mm.plugin.report.service.n r18 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r19 = 315(0x13b, double:1.556E-321)
                r21 = 9
                r23 = 1
                r25 = 0
                r18.idkeyStat(r19, r21, r23, r25)
                goto L_0x00c0
            L_0x00b3:
                com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r11 = 315(0x13b, double:1.556E-321)
                r13 = 8
                r15 = 1
                r17 = 0
                r10.idkeyStat(r11, r13, r15, r17)
            L_0x00c0:
                int r0 = r5.f238041d
                java.lang.String r1 = r5.f238040c
                if (r0 != r6) goto L_0x00d3
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r0)
                if (r0 == 0) goto L_0x00d3
                com.tencent.p014mm.network.C81035d.m98966g(r1)
            L_0x00d3:
                return r9
            L_0x00d4:
                com.tencent.mm.network.d0 r1 = (com.tencent.p014mm.network.C81038d0) r1
                java.io.InputStream r0 = r1.getInputStream()
                if (r0 != 0) goto L_0x00e6
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r0[r7] = r26
                java.lang.String r1 = "getInputStream failed. url:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r1, r0)
                return r9
            L_0x00e6:
                java.lang.String r1 = r1.getContentType()
                byte[] r0 = com.tencent.p014mm.modelimage.loader.impr.C81002e.m98906d(r0, r7)
                long r5 = java.lang.System.currentTimeMillis()
                long r5 = r5 - r2
                r2 = 200(0xc8, float:2.8E-43)
                if (r4 != r2) goto L_0x011f
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r10 = 1195(0x4ab, double:5.904E-321)
                r12 = 99
                r16 = 0
                r9 = r2
                r14 = r5
                r9.idkeyStat(r10, r12, r14, r16)
                r12 = 97
                r14 = 1
                r9.idkeyStat(r10, r12, r14, r16)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "cronet request time "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            L_0x011f:
                jc0.b r2 = new jc0.b
                r2.<init>(r0, r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: b61.C79671a.C79672a.m96785a(java.lang.String, com.tencent.mm.network.d$b):jc0.b");
        }

        /* renamed from: b */
        public static C92871c0 m96786b(String str, C81035d.C81037b bVar) {
            String str2;
            C81038d0 e = C81035d.m98964e(str, (C81035d.C81037b) null);
            e.f238062r = C91681d.CTRL_INDEX;
            e.f238063s = true;
            C115669n.INSTANCE.idkeyStat(1195, 96, 1, false);
            if (!MMApplicationContext.isMMProcess() || !C86709a0.m107522a()) {
                str2 = "";
            } else {
                str2 = String.format(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/?version=%d&uin=%s&nettype=%d&signal=%d", new Object[]{Integer.valueOf(C89625d.f257841g), C77710q.m93738a(C86709a0.m107523b().mo121110g()), Integer.valueOf(NetStatusUtil.getNetTypeForStat(MMApplicationContext.getContext())), Integer.valueOf(ConnectivityCompat.Companion.getCompatMixStrength())});
            }
            Log.m105919d("MicroMsg.emoji.EmojiDownloader.DefaultHttpClientFactory", "referer %s ", str2);
            e.f238053i = "GET";
            e.mo112921e("referer", str2);
            e.f238049e = 15000;
            e.f238050f = 20000;
            return e;
        }
    }

    /* renamed from: a */
    public C21210b mo32789a(String str) {
        int i;
        ProtocolException protocolException;
        String str2;
        InterruptedException interruptedException;
        String str3;
        UnknownHostException unknownHostException;
        String str4;
        SSLHandshakeException sSLHandshakeException;
        String str5;
        SocketException socketException;
        String str6;
        SocketTimeoutException socketTimeoutException;
        String str7;
        IOException iOException;
        String str8;
        Exception exc;
        String str9;
        String str10 = str;
        String str11 = "";
        try {
            C81035d.C81037b bVar = new C81035d.C81037b(str10);
            String str12 = !Util.isNullOrNil(bVar.f238040c) ? bVar.f238040c : str11;
            try {
                str11 = bVar.f238040c;
                i = bVar.f238041d;
            } catch (ProtocolException e) {
                e = e;
                i = 0;
                String str13 = str12;
                protocolException = e;
                str2 = str11;
                str11 = str13;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str2, Integer.valueOf(i), Util.stackTraceToString(protocolException));
                C115669n.INSTANCE.idkeyStat(315, 7, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (InterruptedException e2) {
                e = e2;
                i = 0;
                String str14 = str12;
                interruptedException = e;
                str3 = str11;
                str11 = str14;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str3, Integer.valueOf(i), Util.stackTraceToString(interruptedException));
                C115669n.INSTANCE.idkeyStat(315, 0, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (UnknownHostException e3) {
                e = e3;
                i = 0;
                String str15 = str12;
                unknownHostException = e;
                str4 = str11;
                str11 = str15;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str4, Integer.valueOf(i), Util.stackTraceToString(unknownHostException));
                C115669n.INSTANCE.idkeyStat(315, 1, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (SSLHandshakeException e4) {
                e = e4;
                i = 0;
                String str16 = str12;
                sSLHandshakeException = e;
                str5 = str11;
                str11 = str16;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str5, Integer.valueOf(i), Util.stackTraceToString(sSLHandshakeException));
                C115669n.INSTANCE.idkeyStat(315, 2, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (SocketException e5) {
                e = e5;
                i = 0;
                String str17 = str12;
                socketException = e;
                str6 = str11;
                str11 = str17;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str6, Integer.valueOf(i), Util.stackTraceToString(socketException));
                C115669n.INSTANCE.idkeyStat(315, 3, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (SocketTimeoutException e6) {
                e = e6;
                i = 0;
                String str18 = str12;
                socketTimeoutException = e;
                str7 = str11;
                str11 = str18;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str7, Integer.valueOf(i), Util.stackTraceToString(socketTimeoutException));
                C115669n.INSTANCE.idkeyStat(315, 4, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (IOException e7) {
                e = e7;
                i = 0;
                String str19 = str12;
                iOException = e;
                str8 = str11;
                str11 = str19;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str8, Integer.valueOf(i), Util.stackTraceToString(iOException));
                C115669n.INSTANCE.idkeyStat(315, 5, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (Exception e8) {
                e = e8;
                i = 0;
                String str20 = str12;
                exc = e;
                str9 = str11;
                str11 = str20;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str9, Integer.valueOf(i), Util.stackTraceToString(exc));
                C115669n.INSTANCE.idkeyStat(315, 6, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            }
            try {
                return C79672a.m96785a(str10, bVar);
            } catch (ProtocolException e9) {
                e = e9;
                String str132 = str12;
                protocolException = e;
                str2 = str11;
                str11 = str132;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str2, Integer.valueOf(i), Util.stackTraceToString(protocolException));
                C115669n.INSTANCE.idkeyStat(315, 7, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (InterruptedException e15) {
                e = e15;
                String str142 = str12;
                interruptedException = e;
                str3 = str11;
                str11 = str142;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str3, Integer.valueOf(i), Util.stackTraceToString(interruptedException));
                C115669n.INSTANCE.idkeyStat(315, 0, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (UnknownHostException e16) {
                e = e16;
                String str152 = str12;
                unknownHostException = e;
                str4 = str11;
                str11 = str152;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str4, Integer.valueOf(i), Util.stackTraceToString(unknownHostException));
                C115669n.INSTANCE.idkeyStat(315, 1, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (SSLHandshakeException e17) {
                e = e17;
                String str162 = str12;
                sSLHandshakeException = e;
                str5 = str11;
                str11 = str162;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str5, Integer.valueOf(i), Util.stackTraceToString(sSLHandshakeException));
                C115669n.INSTANCE.idkeyStat(315, 2, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (SocketException e18) {
                e = e18;
                String str172 = str12;
                socketException = e;
                str6 = str11;
                str11 = str172;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str6, Integer.valueOf(i), Util.stackTraceToString(socketException));
                C115669n.INSTANCE.idkeyStat(315, 3, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (SocketTimeoutException e19) {
                e = e19;
                String str182 = str12;
                socketTimeoutException = e;
                str7 = str11;
                str11 = str182;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str7, Integer.valueOf(i), Util.stackTraceToString(socketTimeoutException));
                C115669n.INSTANCE.idkeyStat(315, 4, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (IOException e25) {
                e = e25;
                String str192 = str12;
                iOException = e;
                str8 = str11;
                str11 = str192;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str8, Integer.valueOf(i), Util.stackTraceToString(iOException));
                C115669n.INSTANCE.idkeyStat(315, 5, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            } catch (Exception e26) {
                e = e26;
                String str202 = str12;
                exc = e;
                str9 = str11;
                str11 = str202;
                Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str9, Integer.valueOf(i), Util.stackTraceToString(exc));
                C115669n.INSTANCE.idkeyStat(315, 6, 1, false);
                C81035d.m98966g(str11);
                return new C21210b((byte[]) null, (String) null);
            }
        } catch (ProtocolException e27) {
            protocolException = e27;
            str2 = str11;
            i = 0;
            Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str2, Integer.valueOf(i), Util.stackTraceToString(protocolException));
            C115669n.INSTANCE.idkeyStat(315, 7, 1, false);
            if (i == 1 && NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                C81035d.m98966g(str11);
            }
            return new C21210b((byte[]) null, (String) null);
        } catch (InterruptedException e28) {
            interruptedException = e28;
            str3 = str11;
            i = 0;
            Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str3, Integer.valueOf(i), Util.stackTraceToString(interruptedException));
            C115669n.INSTANCE.idkeyStat(315, 0, 1, false);
            C81035d.m98966g(str11);
            return new C21210b((byte[]) null, (String) null);
        } catch (UnknownHostException e29) {
            unknownHostException = e29;
            str4 = str11;
            i = 0;
            Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str4, Integer.valueOf(i), Util.stackTraceToString(unknownHostException));
            C115669n.INSTANCE.idkeyStat(315, 1, 1, false);
            C81035d.m98966g(str11);
            return new C21210b((byte[]) null, (String) null);
        } catch (SSLHandshakeException e35) {
            sSLHandshakeException = e35;
            str5 = str11;
            i = 0;
            Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str5, Integer.valueOf(i), Util.stackTraceToString(sSLHandshakeException));
            C115669n.INSTANCE.idkeyStat(315, 2, 1, false);
            C81035d.m98966g(str11);
            return new C21210b((byte[]) null, (String) null);
        } catch (SocketException e36) {
            socketException = e36;
            str6 = str11;
            i = 0;
            Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str6, Integer.valueOf(i), Util.stackTraceToString(socketException));
            C115669n.INSTANCE.idkeyStat(315, 3, 1, false);
            C81035d.m98966g(str11);
            return new C21210b((byte[]) null, (String) null);
        } catch (SocketTimeoutException e37) {
            socketTimeoutException = e37;
            str7 = str11;
            i = 0;
            Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str7, Integer.valueOf(i), Util.stackTraceToString(socketTimeoutException));
            C115669n.INSTANCE.idkeyStat(315, 4, 1, false);
            C81035d.m98966g(str11);
            return new C21210b((byte[]) null, (String) null);
        } catch (IOException e38) {
            iOException = e38;
            str8 = str11;
            i = 0;
            Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str8, Integer.valueOf(i), Util.stackTraceToString(iOException));
            C115669n.INSTANCE.idkeyStat(315, 5, 1, false);
            C81035d.m98966g(str11);
            return new C21210b((byte[]) null, (String) null);
        } catch (Exception e39) {
            exc = e39;
            str9 = str11;
            i = 0;
            Log.m105921e("MicroMsg.emoji.EmojiDownloader", "[cpan] get image data failed. url:%s urlIP:%s dnsServerIP:%s dnsType:%d Exception:%s", str10, str11, str9, Integer.valueOf(i), Util.stackTraceToString(exc));
            C115669n.INSTANCE.idkeyStat(315, 6, 1, false);
            C81035d.m98966g(str11);
            return new C21210b((byte[]) null, (String) null);
        }
    }
}
