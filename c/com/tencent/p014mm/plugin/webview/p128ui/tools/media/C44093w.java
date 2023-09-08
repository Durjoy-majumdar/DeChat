package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.net.Uri;
import com.tencent.p014mm.autogen.mmdata.rpt.MPVideoLandingPageEventStruct;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import s90.C48300n;
import te3.C51645v5;
import te3.C51784w5;
import te3.C51925x5;
import te3.C52069y5;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.w */
public class C44093w {

    /* renamed from: k */
    public static final C44094a f119445k = new C44094a((C8480h) null);

    /* renamed from: a */
    public long f119446a = System.currentTimeMillis();

    /* renamed from: b */
    public long f119447b;

    /* renamed from: c */
    public int f119448c;

    /* renamed from: d */
    public int f119449d;

    /* renamed from: e */
    public String f119450e = "";

    /* renamed from: f */
    public int f119451f;

    /* renamed from: g */
    public int f119452g;

    /* renamed from: h */
    public boolean f119453h;

    /* renamed from: i */
    public int f119454i;

    /* renamed from: j */
    public int f119455j;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.w$a */
    public static final class C44094a {

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.w$a$a */
        public static final class C44095a implements C40324j.C40326a {

            /* renamed from: a */
            public static final C44095a f119456a = new C44095a();

            /* renamed from: a */
            public final void mo288a(int i, int i2, String str, C47350c cVar) {
                Log.m105924i("MicroMsg.MpVideoShareReport", "appmsg_report errType " + i + ", errCode " + i2 + ", errMsg " + str);
            }
        }

        public C44094a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo68722a(String str, String str2, LinkedList<C52069y5> linkedList) {
            C52069y5 y5Var = new C52069y5();
            y5Var.f145118d = str;
            y5Var.f145119e = str2;
            linkedList.add(y5Var);
        }

        /* renamed from: b */
        public final void mo68723b(C51784w5 w5Var) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = w5Var;
            bVar.f127067b = new C51925x5();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/appmsg/appmsg_report";
            bVar.f127069d = 1870;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), C44095a.f119456a);
        }

        /* renamed from: c */
        public final void mo68724c(int i, LinkedList<C52069y5> linkedList) {
            if (Log.getLogLevel() < 1 && !Util.isNullOrNil((List) linkedList)) {
                StringBuilder sb = new StringBuilder();
                Iterator<C52069y5> it = linkedList.iterator();
                while (it.hasNext()) {
                    C52069y5 next = it.next();
                    sb.append(next.f145118d);
                    sb.append(XVFSFile.PATH_SEPARATOR);
                    sb.append(next.f145119e);
                    sb.append("  ");
                }
                Log.m105926v("MicroMsg.MpVideoShareReport", i + ", " + sb);
            }
        }

        /* renamed from: d */
        public final void mo68725d(int i, int i2, String str, String str2, int i3, int i4) {
            C87412m.m108594g(str, TPReportKeys.Common.COMMON_VID);
            C87412m.m108594g(str2, "url");
            C51784w5 w5Var = new C51784w5();
            C51645v5 v5Var = new C51645v5();
            v5Var.f143301d = 2;
            LinkedList<C52069y5> linkedList = v5Var.f143302e;
            C87412m.m108593f(linkedList, "reportData.item");
            mo68722a("Vid", str, linkedList);
            String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
            LinkedList<C52069y5> linkedList2 = v5Var.f143302e;
            C87412m.m108593f(linkedList2, "reportData.item");
            mo68722a("Network", formatedNetType, linkedList2);
            String valueOf = String.valueOf(i2);
            LinkedList<C52069y5> linkedList3 = v5Var.f143302e;
            C87412m.m108593f(linkedList3, "reportData.item");
            mo68722a("SharePageType", valueOf, linkedList3);
            LinkedList<C52069y5> linkedList4 = v5Var.f143302e;
            C87412m.m108593f(linkedList4, "reportData.item");
            mo68722a("ContentUrl", str2, linkedList4);
            LinkedList<C52069y5> linkedList5 = v5Var.f143302e;
            C87412m.m108593f(linkedList5, "reportData.item");
            mo68722a("#AppMsgUrl#", str2, linkedList5);
            String valueOf2 = String.valueOf(i);
            LinkedList<C52069y5> linkedList6 = v5Var.f143302e;
            C87412m.m108593f(linkedList6, "reportData.item");
            mo68722a("ActionType", valueOf2, linkedList6);
            LinkedList<C52069y5> linkedList7 = v5Var.f143302e;
            C87412m.m108593f(linkedList7, "reportData.item");
            mo68722a("SessionId", "" + i3, linkedList7);
            String valueOf3 = String.valueOf(i4);
            LinkedList<C52069y5> linkedList8 = v5Var.f143302e;
            C87412m.m108593f(linkedList8, "reportData.item");
            mo68722a("EnterId", valueOf3, linkedList8);
            w5Var.f143860d.add(v5Var);
            mo68723b(w5Var);
            LinkedList<C52069y5> linkedList9 = v5Var.f143302e;
            C87412m.m108593f(linkedList9, "reportData.item");
            mo68724c(10380, linkedList9);
        }

        /* renamed from: e */
        public final void mo68726e(int i, String str, String str2, int i2, int i3, int i4, int i5) {
            C87412m.m108594g(str, TPReportKeys.Common.COMMON_VID);
            C87412m.m108594g(str2, "url");
            C51784w5 w5Var = new C51784w5();
            C51645v5 v5Var = new C51645v5();
            v5Var.f143301d = 3;
            LinkedList<C52069y5> linkedList = v5Var.f143302e;
            C87412m.m108593f(linkedList, "reportData.item");
            mo68722a("#AppMsgUrl#", str2, linkedList);
            LinkedList<C52069y5> linkedList2 = v5Var.f143302e;
            C87412m.m108593f(linkedList2, "reportData.item");
            mo68722a("VideoId", str, linkedList2);
            String valueOf = String.valueOf(i2);
            LinkedList<C52069y5> linkedList3 = v5Var.f143302e;
            C87412m.m108593f(linkedList3, "reportData.item");
            mo68722a("Scene", valueOf, linkedList3);
            String valueOf2 = String.valueOf(i3);
            LinkedList<C52069y5> linkedList4 = v5Var.f143302e;
            C87412m.m108593f(linkedList4, "reportData.item");
            mo68722a("SubScene", valueOf2, linkedList4);
            String valueOf3 = String.valueOf(System.currentTimeMillis());
            LinkedList<C52069y5> linkedList5 = v5Var.f143302e;
            C87412m.m108593f(linkedList5, "reportData.item");
            mo68722a("ClientId", valueOf3, linkedList5);
            LinkedList<C52069y5> linkedList6 = v5Var.f143302e;
            C87412m.m108593f(linkedList6, "reportData.item");
            mo68722a("SessionId", "" + i4, linkedList6);
            String valueOf4 = String.valueOf(i5);
            LinkedList<C52069y5> linkedList7 = v5Var.f143302e;
            C87412m.m108593f(linkedList7, "reportData.item");
            mo68722a("EnterId", valueOf4, linkedList7);
            String valueOf5 = String.valueOf(i);
            LinkedList<C52069y5> linkedList8 = v5Var.f143302e;
            C87412m.m108593f(linkedList8, "reportData.item");
            mo68722a("EventType", valueOf5, linkedList8);
            w5Var.f143860d.add(v5Var);
            mo68723b(w5Var);
            LinkedList<C52069y5> linkedList9 = v5Var.f143302e;
            C87412m.m108593f(linkedList9, "reportData.item");
            mo68724c(17537, linkedList9);
        }
    }

    /* renamed from: a */
    public final int mo68720a() {
        int i = this.f119454i;
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 8;
        }
        if (i != 3) {
            return i != 4 ? 3 : 10;
        }
        return 9;
    }

    /* renamed from: b */
    public final void mo68721b(C48300n nVar, int i, int i2, int i3) {
        C48300n nVar2 = nVar;
        int i4 = i;
        if (nVar2 != null && this.f119455j != i4) {
            this.f119455j = i4;
            if (nVar2.f129349z == -1) {
                try {
                    Uri parse = Uri.parse(nVar2.f133366d);
                    nVar2.f129349z = Util.getLong(parse.getQueryParameter("mid"), 0);
                    nVar2.f129341A = Util.getInt(parse.getQueryParameter("idx"), 0);
                } catch (Exception unused) {
                    nVar2.f129349z = 0;
                }
            }
            switch (i4) {
                case 2:
                case 7:
                case 8:
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f119447b += currentTimeMillis - this.f119446a;
                    this.f119446a = currentTimeMillis;
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                    this.f119446a = System.currentTimeMillis();
                    break;
            }
            if (i4 == 3) {
                C44094a aVar = f119445k;
                String str = nVar2.f133368f;
                C87412m.m108593f(str, "videoInfo.videoVid");
                String str2 = nVar2.f133366d;
                C87412m.m108593f(str2, "videoInfo.mpUrl");
                aVar.mo68726e(0, str, str2, 141, this.f119452g, 0, i2);
            } else if (i4 == 4) {
                C44094a aVar2 = f119445k;
                String str3 = nVar2.f133368f;
                C87412m.m108593f(str3, "videoInfo.videoVid");
                String str4 = nVar2.f133366d;
                C87412m.m108593f(str4, "videoInfo.mpUrl");
                aVar2.mo68726e(1, str3, str4, 141, this.f119452g, 0, i2);
            } else if (i4 == 10) {
                C44094a aVar3 = f119445k;
                String str5 = nVar2.f133368f;
                C87412m.m108593f(str5, "videoInfo.videoVid");
                String str6 = nVar2.f133366d;
                C87412m.m108593f(str6, "videoInfo.mpUrl");
                aVar3.mo68726e(2, str5, str6, 141, this.f119452g, 0, i2);
            }
            int h = C92721n.m116880h();
            if (h == 100) {
                h = -1;
            }
            MPVideoLandingPageEventStruct mPVideoLandingPageEventStruct = new MPVideoLandingPageEventStruct();
            mPVideoLandingPageEventStruct.f107972e = mPVideoLandingPageEventStruct.mo86045b("BizUserName", nVar2.f133375p, true);
            mPVideoLandingPageEventStruct.f107978k = (long) i4;
            mPVideoLandingPageEventStruct.f107976i = mPVideoLandingPageEventStruct.mo86045b("VideoId", nVar2.f133368f, true);
            mPVideoLandingPageEventStruct.f107971d = h;
            mPVideoLandingPageEventStruct.f107973f = nVar2.f129349z;
            mPVideoLandingPageEventStruct.f107974g = (long) nVar2.f129341A;
            mPVideoLandingPageEventStruct.f107975h = (long) i2;
            mPVideoLandingPageEventStruct.f107977j = (long) nVar2.f133371i;
            mPVideoLandingPageEventStruct.f107983p = (long) this.f119451f;
            mPVideoLandingPageEventStruct.f107984q = (long) this.f119452g;
            mPVideoLandingPageEventStruct.f107988u = (long) nVar2.f133372j;
            mPVideoLandingPageEventStruct.f107987t = (long) nVar2.f133373n;
            mPVideoLandingPageEventStruct.f107970B = (long) i3;
            if (this.f119447b == 0 && this.f119446a != 0) {
                this.f119447b = System.currentTimeMillis() - this.f119446a;
            }
            mPVideoLandingPageEventStruct.f107980m = this.f119447b;
            mPVideoLandingPageEventStruct.f107982o = (long) this.f119449d;
            mPVideoLandingPageEventStruct.f107979l = System.currentTimeMillis() / ((long) 1000);
            mPVideoLandingPageEventStruct.f107981n = (long) this.f119448c;
            mPVideoLandingPageEventStruct.f107985r = mPVideoLandingPageEventStruct.mo86045b("PlayErrType", this.f119450e, true);
            mPVideoLandingPageEventStruct.f107990w = 2;
            mPVideoLandingPageEventStruct.f107986s = this.f119453h ? 1 : 0;
            mPVideoLandingPageEventStruct.f107991x = 1;
            mPVideoLandingPageEventStruct.mo86054n();
            Log.m105918d("MicroMsg.MpVideoShareReport", "eventType: " + i4);
            if (i4 == 1 || i4 == 2) {
                this.f119447b = 0;
                this.f119446a = System.currentTimeMillis();
                this.f119449d = 0;
            }
        }
    }
}
