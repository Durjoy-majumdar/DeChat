package p833zk;

import android.net.Uri;
import com.tencent.p014mm.autogen.mmdata.rpt.AbnormalEmoticonClientReportStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j61.C60778e;
import j61.C98908g;
import java.util.LinkedList;
import lc3.C10485b;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;
import sx3.C110823p;
import sx3.C26236u;
import te3.C101800k70;
import te3.C51365ta;
import u61.C101964h;
import z04.C112550d0;
import z51.C39315g;

/* renamed from: zk.g */
public final class C103045g implements C11385n {

    /* renamed from: d */
    public final EmojiInfo f304030d;

    /* renamed from: e */
    public final C32227p<Boolean, C103044f, C13598b0> f304031e;

    /* renamed from: f */
    public final String f304032f = "MicroMsg.EmojiFetcherConfigRetriever";

    /* renamed from: g */
    public final C98908g f304033g;

    /* renamed from: zk.g$a */
    public static final class C103046a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C103045g f304034d;

        /* renamed from: e */
        public final /* synthetic */ C103044f f304035e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C103046a(C103045g gVar, C103044f fVar) {
            super(0);
            this.f304034d = gVar;
            this.f304035e = fVar;
        }

        public Object invoke() {
            this.f304034d.f304031e.invoke(Boolean.TRUE, this.f304035e);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (mo142755b(r7.f304026b) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C103045g(com.tencent.p014mm.storage.emotion.EmojiInfo r7, fy3.C32227p<? super java.lang.Boolean, ? super p833zk.C103044f, rx3.C13598b0> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "emojiInfo"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "callback"
            gy3.C87412m.m108594g(r8, r0)
            r6.<init>()
            r6.f304030d = r7
            r6.f304031e = r8
            java.lang.String r0 = "MicroMsg.EmojiFetcherConfigRetriever"
            r6.f304032f = r0
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.lang.String r2 = r7.getMd5()
            r1.add(r2)
            j61.g r2 = new j61.g
            r3 = 0
            r2.<init>(r1, r3)
            r6.f304033g = r2
            zk.f r7 = r6.mo142754a(r7)
            java.lang.String r1 = r7.f304026b
            int r1 = r1.length()
            r4 = 1
            if (r1 != 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            java.lang.String r5 = "config retriever: db url is empty"
            if (r1 == 0) goto L_0x0042
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
        L_0x0040:
            r3 = 1
            goto L_0x004b
        L_0x0042:
            java.lang.String r1 = r7.f304026b
            boolean r1 = r6.mo142755b(r1)
            if (r1 == 0) goto L_0x004b
            goto L_0x0040
        L_0x004b:
            if (r3 != 0) goto L_0x0053
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.invoke(r0, r7)
            goto L_0x0071
        L_0x0053:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            r7 = 9
            r0 = 1
            v51.C102148e.m134580a(r7, r0)
            f40.g r7 = f40.C86709a0.m107529k()
            ob0.b0 r7 = r7.f251779b
            r8 = 697(0x2b9, float:9.77E-43)
            r7.mo123455a(r8, r6)
            f40.g r7 = f40.C86709a0.m107529k()
            ob0.b0 r7 = r7.f251779b
            r7.mo123460f(r2)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p833zk.C103045g.<init>(com.tencent.mm.storage.emotion.EmojiInfo, fy3.p):void");
    }

    /* renamed from: a */
    public final C103044f mo142754a(EmojiInfo emojiInfo) {
        int i;
        String str;
        String str2;
        String str3 = emojiInfo.mo62640K1() + "_temp";
        boolean z = true;
        if (C103048i.m136280b(emojiInfo)) {
            Log.m105924i(this.f304032f, "createFetcherConfig: " + emojiInfo.getMd5() + " use wxam");
            String str4 = emojiInfo.field_externUrl;
            C87412m.m108593f(str4, "emojiInfo.field_externUrl");
            str = str4;
            i = 2;
        } else if (C103048i.m136279a(emojiInfo)) {
            Log.m105924i(this.f304032f, "createFetcherConfig: " + emojiInfo.getMd5() + " use encrypt");
            String str5 = emojiInfo.field_encrypturl;
            C87412m.m108593f(str5, "emojiInfo.field_encrypturl");
            str = str5;
            i = 1;
        } else {
            if (!Util.isNullOrNil(emojiInfo.field_cdnUrl)) {
                Log.m105924i(this.f304032f, "createFetcherConfig: " + emojiInfo.getMd5() + " use cdn url");
                str2 = emojiInfo.field_cdnUrl;
                C87412m.m108593f(str2, "emojiInfo.field_cdnUrl");
            } else {
                if (Util.isNullOrNil(emojiInfo.field_tpurl) || Util.isNullOrNil(emojiInfo.field_aeskey)) {
                    z = false;
                }
                if (z) {
                    Log.m105924i(this.f304032f, "createFetcherConfig: " + emojiInfo.getMd5() + " use tp url");
                    String str6 = emojiInfo.field_tpurl;
                    C87412m.m108593f(str6, "emojiInfo.field_tpurl");
                    str = str6;
                    i = 3;
                } else {
                    str2 = "";
                }
            }
            str = str2;
            i = 0;
        }
        String str7 = emojiInfo.field_tpauthkey;
        return new C103044f(emojiInfo, str, str3, str7 == null ? "" : str7, i);
    }

    /* renamed from: b */
    public final boolean mo142755b(String str) {
        StringBuilder sb;
        String str2;
        String str3;
        boolean z;
        String str4 = str;
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("EmojiUpdateUrlDomain");
        String[] split = Util.isNullOrNil(c) ? null : c.split(",");
        try {
            String host = Uri.parse(str).getHost();
            if (split == null || !C110823p.m151009y(split, host)) {
                return false;
            }
            String str5 = this.f304032f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("config retriever: blocked host:");
            sb4.append(host);
            sb4.append(", list:");
            StringBuilder sb5 = sb4;
            sb5.append(C110823p.m150987M(split, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null));
            Log.m105924i(str5, sb5.toString());
            return true;
        } catch (Exception e) {
            String str6 = this.f304032f;
            StringBuilder sb6 = new StringBuilder();
            sb6.append("isUrlBlocked: error ");
            sb6.append(e);
            sb6.append("; url ");
            sb6.append(str4);
            sb6.append(", list:");
            if (split != null) {
                sb = sb6;
                str3 = str6;
                str2 = C110823p.m150987M(split, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null);
            } else {
                sb = sb6;
                str3 = str6;
                str2 = null;
            }
            sb.append(str2);
            Log.m105924i(str3, sb.toString());
            if (split != null) {
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    String str7 = split[i];
                    C87412m.m108593f(str7, LocaleUtil.ITALIAN);
                    if (C112550d0.m153803w(str4, str7, false, 2, (Object) null)) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        int type = yVar.getType();
        String str2 = this.f304032f;
        Log.m105924i(str2, "onSceneEnd: " + i + ", " + i2 + ", " + type);
        if (type == 697 && C87412m.m108589b(yVar, this.f304033g)) {
            C86709a0.m107529k().f251779b.mo123470p(697, this);
            C51365ta B0 = this.f304033g.mo71832B0();
            LinkedList<C101800k70> linkedList = B0 != null ? B0.f142064g : null;
            boolean z = false;
            if (linkedList == null || linkedList.isEmpty()) {
                if (i == 0 && i2 == 0) {
                    Log.m105924i(this.f304032f, "onSceneEnd: response list is empty");
                    C115669n.INSTANCE.mo175912v(164, 11);
                    AbnormalEmoticonClientReportStruct abnormalEmoticonClientReportStruct = new AbnormalEmoticonClientReportStruct();
                    abnormalEmoticonClientReportStruct.f154915d = abnormalEmoticonClientReportStruct.mo86045b("Md5", this.f304030d.getMd5(), true);
                    abnormalEmoticonClientReportStruct.f154916e = 5;
                    abnormalEmoticonClientReportStruct.mo86054n();
                    if ((((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_emoji_sync_test, 0) & 4) > 0 && C101964h.m134227i(this.f304030d)) {
                        C86709a0.m107529k().f251779b.mo123460f(new C60778e(0, 2, C26236u.m33719b(this.f304030d.getMd5())));
                        C30790w2.m39221h().mo57717d().mo142037LL(C26236u.m33719b(this.f304030d.getMd5()), 0);
                    }
                }
                this.f304031e.invoke(Boolean.FALSE, null);
                return;
            }
            EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(this.f304030d.getMd5());
            if (TO == null) {
                TO = this.f304030d;
            }
            C101964h.m134219a(B0.f142064g.get(0), TO);
            C101964h.m134219a(B0.f142064g.get(0), this.f304030d);
            C103044f a = mo142754a(TO);
            if (a.f304026b.length() > 0) {
                z = true;
            }
            if (z) {
                if (mo142755b(a.f304026b)) {
                    AbnormalEmoticonClientReportStruct abnormalEmoticonClientReportStruct2 = new AbnormalEmoticonClientReportStruct();
                    abnormalEmoticonClientReportStruct2.f154915d = abnormalEmoticonClientReportStruct2.mo86045b("Md5", this.f304030d.getMd5(), true);
                    abnormalEmoticonClientReportStruct2.f154916e = 4;
                    abnormalEmoticonClientReportStruct2.mo86054n();
                }
                ((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138019f(TO);
                C61926c.m72657B("EmojiFetcherConfigRetriever_onSceneEnd", true, new C103046a(this, a));
                return;
            }
            this.f304031e.invoke(Boolean.FALSE, null);
        }
    }
}
