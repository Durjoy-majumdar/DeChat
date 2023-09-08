package ak1;

import ak1.C54067f0;
import ak1.C54095l;
import al1.C54127h;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.RecyclerView;
import c30.C104289g;
import cj1.C54738b1;
import cl1.C0654b;
import cl1.C55001u;
import cm1.C0712b0;
import cm1.C0773s0;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderFaceVerifyStreamStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveNearbyStartLiveLogStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveOverPageReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveResultStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveStreamStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderNoticeLiveStreamStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveRecordRelatedStruct;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.file.XVFSFile;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C86301e;
import di3.C86312j;
import eb0.C45628s0;
import ei3.C86522b;
import er1.C58744l;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60200t1;
import ht1.C8777j5;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ns3.C11266d;
import ok1.C62042e;
import op3.C117878c;
import op3.C117882j;
import org.json.JSONObject;
import p185kq.C10383h;
import p185kq.C61130g;
import p185kq.C61131i;
import p206nj.C117627q;
import p217oq.C11719g;
import p217oq.C62120e;
import p565ir.C60606n;
import p700tq.C64995b;
import rx3.C13604l;
import s50.C63699b;
import sx3.C110823p;
import sx3.C64197v;
import sx3.C90364q0;
import t91.C64208c;
import te3.C49098d51;
import te3.C49712hj1;
import te3.C64273c21;
import um0.C22657f;
import w50.C65929d;
import z04.C112551y;
import z04.C119027c;
import z91.C23462b;

@C86522b
/* renamed from: ak1.o */
public final class C54108o extends C86301e implements C8777j5 {

    /* renamed from: h */
    public static final C54067f0 f151869h = new C54067f0();

    /* renamed from: i */
    public static final C54059a f151870i = new C54059a();

    /* renamed from: j */
    public static final C54089h f151871j = new C54089h();

    /* renamed from: n */
    public static final C54062b f151872n = new C54062b();

    /* renamed from: d */
    public final int f151873d = -100;

    /* renamed from: e */
    public boolean f151874e;

    /* renamed from: f */
    public boolean f151875f;

    /* renamed from: g */
    public final List<Integer> f151876g = C64197v.m75537f(1001, 1002, 1003);

    /* renamed from: ak1.o$a */
    public static final class C27908a {

        /* renamed from: a */
        public final int f77086a;

        /* renamed from: b */
        public final int f77087b;

        /* renamed from: c */
        public final String f77088c;

        public C27908a(int i, int i2, String str) {
            this.f77086a = i;
            this.f77087b = i2;
            this.f77088c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27908a)) {
                return false;
            }
            C27908a aVar = (C27908a) obj;
            return this.f77086a == aVar.f77086a && this.f77087b == aVar.f77087b && C87412m.m108589b(this.f77088c, aVar.f77088c);
        }

        public int hashCode() {
            int i = ((this.f77086a * 31) + this.f77087b) * 31;
            String str = this.f77088c;
            return i + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CgiErrorInfo(errType=" + this.f77086a + ", errCode=" + this.f77087b + ", errMsg=" + this.f77088c + ')';
        }
    }

    public static void Sx0(C54108o oVar, C54067f0.C39609d0 d0Var, int i, C27908a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        oVar.getClass();
        C87412m.m108594g(d0Var, "type");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", d0Var.f106352d);
        if (i > 0) {
            jSONObject.put("money", i);
        }
        if (aVar != null) {
            jSONObject.put("errortype", aVar.f77086a);
            jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, aVar.f77087b);
            jSONObject.put("errormsg", aVar.f77088c);
        }
        C8777j5.C8778a.m8605f(oVar, C0073g0.MODIFY_PAY_GAME_TEAM, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    public static /* synthetic */ void Ux0(C54108o oVar, int i, int i2, long j, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j = 0;
        }
        oVar.Tx0(i, i2, j, (i4 & 8) != 0 ? 0 : i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = r2.f97362a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String Ax0() {
        /*
            r6 = this;
            ak1.f0 r0 = f151869h
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            s50.a r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159390t
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x001c
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = r2.f97362a
            if (r2 == 0) goto L_0x001c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x001d
        L_0x001c:
            r2 = r3
        L_0x001d:
            if (r2 != 0) goto L_0x0021
            r2 = 0
            goto L_0x0025
        L_0x0021:
            int r2 = r2.intValue()
        L_0x0025:
            r0.f151459h = r2
            r1.getClass()
            s50.a r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159390t
            if (r2 == 0) goto L_0x003e
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = r2.f97362a
            if (r2 == 0) goto L_0x003e
            r5 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x003f
        L_0x003e:
            r2 = r3
        L_0x003f:
            if (r2 != 0) goto L_0x0043
            r2 = 0
            goto L_0x0047
        L_0x0043:
            int r2 = r2.intValue()
        L_0x0047:
            r0.f151461i = r2
            r1.getClass()
            s50.a r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159390t
            if (r2 == 0) goto L_0x0060
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = r2.f97362a
            if (r2 == 0) goto L_0x0060
            r5 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x0061
        L_0x0060:
            r2 = r3
        L_0x0061:
            if (r2 != 0) goto L_0x0065
            r2 = 0
            goto L_0x0069
        L_0x0065:
            int r2 = r2.intValue()
        L_0x0069:
            r0.f151463j = r2
            r1.getClass()
            s50.a r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159390t
            if (r2 == 0) goto L_0x0082
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = r2.f97362a
            if (r2 == 0) goto L_0x0082
            r5 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x0083
        L_0x0082:
            r2 = r3
        L_0x0083:
            if (r2 != 0) goto L_0x0087
            r2 = 0
            goto L_0x008b
        L_0x0087:
            int r2 = r2.intValue()
        L_0x008b:
            r0.f151465k = r2
            r1.getClass()
            s50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159390t
            if (r1 == 0) goto L_0x00a4
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r1 = r1.f97362a
            if (r1 == 0) goto L_0x00a4
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            r3 = r1
            java.lang.Integer r3 = (java.lang.Integer) r3
        L_0x00a4:
            if (r3 != 0) goto L_0x00a7
            goto L_0x00ab
        L_0x00a7:
            int r4 = r3.intValue()
        L_0x00ab:
            r0.f151467l = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.f151459h
            r1.append(r2)
            r2 = 59
            r1.append(r2)
            int r3 = r0.f151461i
            r1.append(r3)
            r1.append(r2)
            int r3 = r0.f151463j
            r1.append(r3)
            r1.append(r2)
            int r3 = r0.f151465k
            r1.append(r3)
            r1.append(r2)
            int r0 = r0.f151467l
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54108o.Ax0():java.lang.String");
    }

    public final void Bx0(long j, String str) {
        C87412m.m108594g(str, "commentscene");
        ((C61130g) C86312j.m106911c(C61130g.class)).mo33246ry(str);
        C54067f0 f0Var = f151869h;
        f0Var.getClass();
        f0Var.f151445a = str;
        f0Var.f151447b = j;
    }

    /* renamed from: CB */
    public void mo9597CB(C54064b0 b0Var) {
        C54064b0 b0Var2 = b0Var;
        C87412m.m108594g(b0Var2, "enterData");
        Bx0(b0Var2.f151402d, b0Var2.f151405g);
        C54067f0 f0Var = f151869h;
        f0Var.mo74763m(b0Var2.f151404f, "");
        C54059a aVar = f151870i;
        aVar.getClass();
        Class cls = C54108o.class;
        Class cls2 = C60200t1.class;
        Class cls3 = C10383h.class;
        FinderLiveEntranceLogStruct finderLiveEntranceLogStruct = new FinderLiveEntranceLogStruct();
        ((C54108o) C86312j.m106911c(cls)).Cx0(finderLiveEntranceLogStruct, b0Var2.f151401c);
        finderLiveEntranceLogStruct.mo76259w(((C10383h) C86312j.m106911c(cls3)).mo10700XQ(b0Var2.f151399a));
        finderLiveEntranceLogStruct.f155516e = b0Var2.f151400b;
        finderLiveEntranceLogStruct.mo76260x(((C10383h) C86312j.m106911c(cls3)).mo10700XQ(b0Var2.f151400b));
        finderLiveEntranceLogStruct.f155520i = b0Var2.f151404f.f151625d;
        finderLiveEntranceLogStruct.mo76257u(b0Var2.f151405g);
        finderLiveEntranceLogStruct.f155522k = b0Var2.f151402d;
        finderLiveEntranceLogStruct.f155523l = b0Var2.f151406h;
        finderLiveEntranceLogStruct.f155524m = b0Var2.f151407i;
        finderLiveEntranceLogStruct.mo76262z(b0Var2.f151408j);
        finderLiveEntranceLogStruct.f155532u = finderLiveEntranceLogStruct.mo86045b("SnsFeedId", b0Var2.f151409k, true);
        finderLiveEntranceLogStruct.f155527p = b0Var2.f151403e;
        finderLiveEntranceLogStruct.mo76256t(((C10383h) C86312j.m106911c(cls3)).mo10698S0());
        finderLiveEntranceLogStruct.mo76258v(b0Var2.f151416r.length() == 0 ? ((C10383h) C86312j.m106911c(cls3)).mo10696E() : C45628s0.m50749N(b0Var2.f151416r) ? ((C60200t1) C86312j.m106911c(cls2)).mo76802R1(31, 2, 65) : C72996z1.m85820U5(b0Var2.f151416r) ? ((C60200t1) C86312j.m106911c(cls2)).mo76802R1(3, 2, 65) : ((C60200t1) C86312j.m106911c(cls2)).mo76802R1(2, 2, 65));
        finderLiveEntranceLogStruct.mo76255s(C112551y.m153816p(aVar.mo74733b(b0Var2.f151415q, b0Var2.f151416r), ",", ";", false, 4, (Object) null));
        if (!C112551y.m153820t(b0Var2.f151405g, "temp_", false, 2, (Object) null)) {
            long j = b0Var2.f151399a;
            String str = finderLiveEntranceLogStruct.f155521j;
            C87412m.m108593f(str, "struct.commentScene");
            finderLiveEntranceLogStruct.mo76261y(aVar.mo74732a(j, Long.parseLong(str)));
        } else if (C87412m.m108589b(finderLiveEntranceLogStruct.f155521j, "temp_2")) {
            ((C54108o) C86312j.m106911c(cls)).getClass();
            finderLiveEntranceLogStruct.mo76261y(f0Var.f151423E);
        } else {
            finderLiveEntranceLogStruct.mo76261y(b0Var2.f151405g);
        }
        finderLiveEntranceLogStruct.f155533v = b0Var2.f151410l;
        finderLiveEntranceLogStruct.f155534w = (long) b0Var2.f151411m.f151689d;
        if (C87412m.m108589b(finderLiveEntranceLogStruct.f155521j, "61") || C87412m.m108589b(((C61131i) C86312j.m106911c(C61131i.class)).mo86084Y7(), "123")) {
            finderLiveEntranceLogStruct.f155535x = finderLiveEntranceLogStruct.mo86045b("SnsSessionID", TextUtils.isEmpty(C64208c.f181965o) ? ((C23462b) ((C10383h) C86312j.m106911c(cls3)).mo10693DZ()).mo36920d() : C64208c.f181965o, true);
        }
        finderLiveEntranceLogStruct.mo86054n();
        String str2 = aVar.f151376a;
        Log.m105924i(str2, "report21053OnClickOnShare, struct=\nfeedId=" + finderLiveEntranceLogStruct.f155517f + "\nliveId=" + finderLiveEntranceLogStruct.f155531t + "\nuserName=" + finderLiveEntranceLogStruct.f155515d + "\nisPrivate=" + finderLiveEntranceLogStruct.f155529r + "\nsessionID=" + finderLiveEntranceLogStruct.f155518g + "\nactionTS=" + finderLiveEntranceLogStruct.f155519h + "\naction=" + finderLiveEntranceLogStruct.f155520i + "\ncommentScene=" + finderLiveEntranceLogStruct.f155521j + "\nindex=" + finderLiveEntranceLogStruct.f155522k + "\nenterStatus=" + finderLiveEntranceLogStruct.f155523l + "\ncontextId=" + finderLiveEntranceLogStruct.f155526o + "\nonlineNum=" + finderLiveEntranceLogStruct.f155527p + "\nclickTabContextId=" + finderLiveEntranceLogStruct.f155528q + "\nsessionBuffer=" + finderLiveEntranceLogStruct.f155530s + "\nshareType=" + finderLiveEntranceLogStruct.f155524m + "\nshareUserName=" + finderLiveEntranceLogStruct.f155525n + "\nenterSessionId=" + finderLiveEntranceLogStruct.f155533v + "\nenterIconType=" + finderLiveEntranceLogStruct.f155534w + "\nsnsSessionID=" + finderLiveEntranceLogStruct.f155535x + "\nsnsFeedId=" + finderLiveEntranceLogStruct.f155532u);
    }

    /* renamed from: Cc */
    public void mo9598Cc(BaseFinderFeed baseFinderFeed, C54067f0.C54078q qVar, String str, String str2) {
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C87412m.m108594g(baseFinderFeed2, "feed");
        C87412m.m108594g(qVar, "actionType");
        C87412m.m108594g(str, "commentscene");
        C87412m.m108594g(str2, "chnlExtra");
        long itemId = baseFinderFeed.getItemId();
        String XQ = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(itemId);
        C54095l.C54096a aVar = C54095l.f151788x;
        C117878c<Long, Integer, Boolean> a = aVar.mo74779a(baseFinderFeed2);
        String userName = baseFinderFeed.mo3513o().getUserName();
        C87412m.m108593f(XQ, "feedId");
        Object a2 = a.mo182596a(0);
        C87412m.m108593f(a2, "tuple3.`$1`()");
        long longValue = ((Number) a2).longValue();
        Object a3 = a.mo182596a(1);
        C87412m.m108593f(a3, "tuple3.`$2`()");
        int intValue = ((Number) a3).intValue();
        String b = aVar.mo74780b(baseFinderFeed2);
        C54095l.C0078b bVar = C54095l.C0078b.ING;
        Object a4 = a.mo182596a(2);
        C87412m.m108593f(a4, "tuple3.`$3`()");
        C54095l lVar = r0;
        C54095l lVar2 = new C54095l(baseFinderFeed, userName, 0, XQ, itemId, longValue, qVar, str, intValue, b, bVar, true, ((Boolean) a4).booleanValue(), 0, (String) null, (String) null, str2, (String) null, 0, (String) null, 0, 0, 0, 8314880, (C8480h) null);
        f151870i.mo74736e(lVar);
    }

    public final void Cx0(FinderLiveEntranceLogStruct finderLiveEntranceLogStruct, String str) {
        C87412m.m108594g(finderLiveEntranceLogStruct, "struct");
        finderLiveEntranceLogStruct.f155515d = finderLiveEntranceLogStruct.mo86045b("UserName", str == null ? "" : str, true);
        C54067f0 f0Var = f151869h;
        finderLiveEntranceLogStruct.f155529r = (long) f0Var.mo74762l(str);
        finderLiveEntranceLogStruct.f155518g = finderLiveEntranceLogStruct.mo86045b("SessionID", f0Var.mo74758h(), true);
        finderLiveEntranceLogStruct.f155519h = System.currentTimeMillis();
        finderLiveEntranceLogStruct.f155514A = finderLiveEntranceLogStruct.mo86045b("switch_extra", ((C60606n) C86312j.m106911c(C60606n.class)).tx0(), true);
    }

    public final String Dx0() {
        char c;
        C54067f0 f0Var = f151869h;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C63699b bVar = FinderLiveService.f159393w;
        String str = bVar != null ? bVar.f180567b : null;
        f0Var.getClass();
        C54067f0.C54080r rVar = C54067f0.C54080r.ORIGINAL_FILM;
        C65929d dVar = C65929d.f189535a;
        StringBuilder sb = new StringBuilder();
        String str2 = C65929d.f189536b;
        sb.append(str2);
        sb.append("/ziran");
        if (C87412m.m108589b(str, sb.toString())) {
            c = 0;
        } else {
            if (C87412m.m108589b(str, str2 + "/baixi")) {
                c = 1;
            } else {
                if (C87412m.m108589b(str, str2 + "/qiuri")) {
                    c = 7;
                } else {
                    if (C87412m.m108589b(str, str2 + "/meishi")) {
                        c = 8;
                    } else {
                        if (C87412m.m108589b(str, str2 + "/fanchaleng")) {
                            c = 9;
                        } else {
                            if (C87412m.m108589b(str, str2 + "/yuanqi")) {
                                c = 2;
                            } else {
                                if (C87412m.m108589b(str, str2 + "/fennen")) {
                                    c = 3;
                                } else {
                                    if (C87412m.m108589b(str, str2 + "/qingche")) {
                                        c = 4;
                                    } else {
                                        if (C87412m.m108589b(str, str2 + "/luori")) {
                                            c = 5;
                                        } else {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(str2);
                                            sb4.append("/shensui");
                                            c = C87412m.m108589b(str, sb4.toString()) ? (char) 6 : 65535;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        switch (c) {
            case 0:
                rVar = C54067f0.C54080r.DEFAULT;
                break;
            case 1:
                rVar = C54067f0.C54080r.BAIXI;
                break;
            case 2:
                rVar = C54067f0.C54080r.YUANQI;
                break;
            case 3:
                rVar = C54067f0.C54080r.FENNEN;
                break;
            case 4:
                rVar = C54067f0.C54080r.QINGCHE;
                break;
            case 5:
                rVar = C54067f0.C54080r.LUORI;
                break;
            case 6:
                rVar = C54067f0.C54080r.SHENSUI;
                break;
            case 7:
                rVar = C54067f0.C54080r.QIURI;
                break;
            case 8:
                rVar = C54067f0.C54080r.MEISHI;
                break;
            case 9:
                rVar = C54067f0.C54080r.FANCHALENG;
                break;
        }
        f0Var.f151469m = rVar.f151648d;
        finderLiveService.getClass();
        C63699b bVar2 = FinderLiveService.f159393w;
        f0Var.f151470n = bVar2 != null ? bVar2.f180568c : 0;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", f0Var.f151469m);
        jSONObject.put("result", f0Var.f151470n);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        return C112551y.m153814n(jSONObject2, ",", ";", false);
    }

    public final Map<String, String> Ex0(C54067f0.C0062l lVar) {
        C87412m.m108594g(lVar, "status");
        return C90364q0.m113148g(new C13604l("anchor_status", String.valueOf(lVar.f155d)));
    }

    public final void Fx0(C54127h hVar, C54738b1 b1Var, int i, long j) {
        C49098d51 d512;
        Class cls = C55001u.class;
        C54067f0 f0Var = f151869h;
        if (!f0Var.f151446a0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            JSONObject jSONObject = new JSONObject();
            if (hVar == null || ((C55001u) hVar.f151978e.mo71262a(cls)).f154420q.f182392d <= 0) {
                if ((b1Var != null ? b1Var.f153412a : null) == null) {
                    int K5 = ((C11719g) C86312j.m106911c(C11719g.class)).mo11558K5();
                    if (K5 <= 0) {
                        jSONObject.put("type", 1);
                    } else if (currentTimeMillis < K5) {
                        jSONObject.put("type", 2);
                    } else {
                        jSONObject.put("type", 1);
                    }
                } else {
                    if (currentTimeMillis < ((b1Var == null || (d512 = b1Var.f153412a) == null) ? 0 : d512.f132118d)) {
                        jSONObject.put("type", 2);
                    } else {
                        jSONObject.put("type", 1);
                    }
                }
            } else {
                jSONObject.put("type", 3);
                jSONObject.put("liveid", ((C55001u) hVar.f151978e.mo71262a(cls)).f154420q.f182392d);
            }
            if (!(i == 0 || j == 0)) {
                jSONObject.put("entrance_type", i);
                jSONObject.put("entrance_id", j);
            }
            C8777j5.C8778a.m8600a(this, 3, jSONObject.toString(), (String) null, 4, (Object) null);
            ay0(C54067f0.C54077p.LIVE_EXIT_NOTHING);
            by0(C54067f0.C54073k.LIVE_COVER_DEFAULT);
            f0Var.f151434P = System.currentTimeMillis();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Gx0(ak1.C54067f0.C54077p r12) {
        /*
            r11 = this;
            java.lang.String r0 = "type"
            gy3.C87412m.m108594g(r12, r0)
            com.tencent.mm.autogen.mmdata.rpt.FinderStartLiveResultStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.FinderStartLiveResultStruct
            r0.<init>()
            ak1.f0 r1 = f151869h
            java.lang.String r2 = r1.mo74756f()
            java.lang.String r3 = "FinderUsrname"
            r4 = 1
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)
            r0.f156084d = r2
            java.lang.String r2 = r1.mo74759i()
            java.lang.String r3 = "FinderWxAppInfo"
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)
            r0.f156085e = r2
            int r2 = r1.mo74761k()
            r0.f156086f = r2
            java.lang.String r2 = r1.mo74758h()
            java.lang.String r3 = "FinderSessionId"
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)
            r0.f156087g = r2
            long r2 = java.lang.System.currentTimeMillis()
            r0.f156088h = r2
            java.lang.String r5 = "ActionTimeMs"
            r0.mo86046c(r5, r2)
            long r2 = r12.f151609d
            r0.f156099s = r2
            zc1.b r2 = zc1.C66785b.f191882e
            r3 = 0
            r5 = 0
            bd1.b r2 = zc1.C66783a.C66784a.m78800c(r2, r3, r4, r5)
            if (r2 == 0) goto L_0x0058
            te3.dr2 r2 = r2.mo75251m2()
            int r2 = r2.f132484A
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            long r6 = (long) r2
            r0.f156089i = r6
            k50.a r2 = k50.C60971a.C60973b.f173670a
            m50.b r2 = r2.mo85945b()
            int r2 = r2.f174704a
            r6 = 2
            if (r2 != 0) goto L_0x0069
            r2 = 2
            goto L_0x006a
        L_0x0069:
            r2 = 1
        L_0x006a:
            long r7 = (long) r2
            r0.f156090j = r7
            long r7 = r1.f151434P
            r0.f156091k = r7
            java.lang.String r2 = "EnterUITimeMs"
            r0.mo86046c(r2, r7)
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r0.f156091k
            long r7 = r7 - r9
            r0.f156092l = r7
            java.lang.String r2 = "StayTimeMs"
            r0.mo86046c(r2, r7)
            long r7 = r1.f151435Q
            r0.f156094n = r7
            org.json.JSONObject r2 = r1.f151436R
            if (r2 == 0) goto L_0x009b
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x009b
            java.lang.String r7 = ","
            java.lang.String r8 = ";"
            java.lang.String r2 = z04.C112551y.m153814n(r2, r7, r8, r3)
            goto L_0x009d
        L_0x009b:
            java.lang.String r2 = ""
        L_0x009d:
            r1.f151436R = r5
            java.lang.String r7 = "PoiJson"
            java.lang.String r2 = r0.mo86045b(r7, r2, r4)
            r0.f156095o = r2
            java.lang.String r2 = r1.f151438T
            if (r2 == 0) goto L_0x00b4
            java.lang.String r7 = ","
            java.lang.String r8 = ";"
            java.lang.String r2 = z04.C112551y.m153814n(r2, r7, r8, r3)
            goto L_0x00b6
        L_0x00b4:
            java.lang.String r2 = ""
        L_0x00b6:
            r1.f151438T = r5
            java.lang.String r7 = "Description"
            java.lang.String r2 = r0.mo86045b(r7, r2, r4)
            r0.f156096p = r2
            int r2 = r1.f151439U
            long r7 = (long) r2
            r0.f156093m = r7
            java.lang.String r2 = ""
            java.lang.String r7 = "ShopWindowId"
            java.lang.String r2 = r0.mo86045b(r7, r2, r4)
            r0.f156102v = r2
            java.lang.String r2 = ""
            java.lang.String r7 = "GoodsListJson"
            java.lang.String r2 = r0.mo86045b(r7, r2, r4)
            r0.f156101u = r2
            java.util.LinkedList<java.lang.Long> r1 = r1.f151454e0
            java.util.Iterator r1 = r1.iterator()
        L_0x00df:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x010e
            java.lang.Object r2 = r1.next()
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r0.f156101u
            r7.append(r8)
            long r8 = r2.longValue()
            r7.append(r8)
            r2 = 35
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r7 = "GoodsListJson"
            java.lang.String r2 = r0.mo86045b(r7, r2, r4)
            r0.f156101u = r2
            goto L_0x00df
        L_0x010e:
            java.lang.String r1 = r0.f156101u
            java.lang.String r2 = "struct.goodsListJson"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = "#"
            boolean r1 = z04.C112551y.m153808h(r1, r2, r3, r6, r5)
            if (r1 == 0) goto L_0x013f
            java.lang.String r1 = r0.f156101u
            java.lang.String r2 = "struct.goodsListJson"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = r0.f156101u
            int r2 = r2.length()
            int r2 = r2 - r4
            java.lang.String r1 = r1.substring(r3, r2)
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = "GoodsListJson"
            java.lang.String r1 = r0.mo86045b(r2, r1, r4)
            r0.f156101u = r1
        L_0x013f:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            ak1.f0 r2 = f151869h     // Catch:{ all -> 0x0174 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r5 = r2.f151462i0     // Catch:{ all -> 0x0174 }
            monitor-enter(r5)     // Catch:{ all -> 0x0174 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r2.f151462i0     // Catch:{ all -> 0x0171 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0171 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0171 }
        L_0x0153:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x0171 }
            if (r7 == 0) goto L_0x016d
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0171 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x0171 }
            java.lang.Object r8 = r7.getKey()     // Catch:{ all -> 0x0171 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0171 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0171 }
            r1.put(r8, r7)     // Catch:{ all -> 0x0171 }
            goto L_0x0153
        L_0x016d:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0171 }
            monitor-exit(r5)     // Catch:{ all -> 0x0174 }
            goto L_0x0175
        L_0x0171:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0174 }
            throw r2     // Catch:{ all -> 0x0174 }
        L_0x0174:
        L_0x0175:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "chnlExtraJson.toString()"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = ","
            java.lang.String r5 = ";"
            java.lang.String r1 = z04.C112551y.m153814n(r1, r2, r5, r3)
            java.lang.String r2 = "ChnlExtra"
            java.lang.String r1 = r0.mo86045b(r2, r1, r4)
            r0.f156083I = r1
            int r12 = r12.ordinal()
            r1 = 0
            if (r12 == 0) goto L_0x021f
            if (r12 == r4) goto L_0x01f6
            if (r12 == r6) goto L_0x01d1
            r5 = 3
            if (r12 == r5) goto L_0x019f
            goto L_0x0243
        L_0x019f:
            java.lang.String r12 = "0"
            java.lang.String r5 = "LiveId"
            java.lang.String r12 = r0.mo86045b(r5, r12, r4)
            r0.f156097q = r12
            java.lang.String r12 = "0"
            java.lang.String r5 = "FeedId"
            java.lang.String r12 = r0.mo86045b(r5, r12, r4)
            r0.f156098r = r12
            java.lang.String r12 = "0"
            java.lang.String r5 = "ErrorCode"
            java.lang.String r12 = r0.mo86045b(r5, r12, r4)
            r0.f156100t = r12
            ak1.f0 r12 = f151869h
            java.lang.String r5 = ""
            r12.getClass()
            r12.f151420B = r5
            java.lang.String r5 = ""
            r12.f151421C = r5
            ak1.f0$n0 r5 = ak1.C54067f0.C0067n0.PUBLIC
            r12.f151424F = r5
            r12.f151425G = r1
            goto L_0x0243
        L_0x01d1:
            java.lang.String r12 = "0"
            java.lang.String r5 = "LiveId"
            java.lang.String r12 = r0.mo86045b(r5, r12, r4)
            r0.f156097q = r12
            java.lang.String r12 = "0"
            java.lang.String r5 = "FeedId"
            java.lang.String r12 = r0.mo86045b(r5, r12, r4)
            r0.f156098r = r12
            ak1.f0 r12 = f151869h
            int r12 = r12.f151437S
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r5 = "ErrorCode"
            java.lang.String r12 = r0.mo86045b(r5, r12, r4)
            r0.f156100t = r12
            goto L_0x0243
        L_0x01f6:
            ak1.f0 r12 = f151869h
            java.lang.String r5 = r12.mo74753c()
            java.lang.String r6 = "LiveId"
            java.lang.String r5 = r0.mo86045b(r6, r5, r4)
            r0.f156097q = r5
            java.lang.String r5 = r12.mo74752b()
            java.lang.String r6 = "FeedId"
            java.lang.String r5 = r0.mo86045b(r6, r5, r4)
            r0.f156098r = r5
            int r12 = r12.f151437S
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r5 = "ErrorCode"
            java.lang.String r12 = r0.mo86045b(r5, r12, r4)
            r0.f156100t = r12
            goto L_0x0243
        L_0x021f:
            ak1.f0 r12 = f151869h
            java.lang.String r5 = r12.mo74753c()
            java.lang.String r6 = "LiveId"
            java.lang.String r5 = r0.mo86045b(r6, r5, r4)
            r0.f156097q = r5
            java.lang.String r12 = r12.mo74752b()
            java.lang.String r5 = "FeedId"
            java.lang.String r12 = r0.mo86045b(r5, r12, r4)
            r0.f156098r = r12
            java.lang.String r12 = "0"
            java.lang.String r5 = "ErrorCode"
            java.lang.String r12 = r0.mo86045b(r5, r12, r4)
            r0.f156100t = r12
        L_0x0243:
            java.lang.String r12 = r11.Ax0()
            java.lang.String r5 = "RetouchResult"
            java.lang.String r12 = r0.mo86045b(r5, r12, r4)
            r0.f156104x = r12
            java.lang.String r12 = r11.Dx0()
            java.lang.String r5 = "FiltersResult"
            java.lang.String r12 = r0.mo86045b(r5, r12, r4)
            r0.f156105y = r12
            ak1.f0 r12 = f151869h
            ak1.f0$z r5 = r12.f151477u
            int r5 = r5.f151744d
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "ConnectSwitch"
            java.lang.String r5 = r0.mo86045b(r6, r5, r4)
            r0.f156076B = r5
            ak1.f0$l0 r5 = r12.f151460h0
            int r5 = r5.f162d
            long r5 = (long) r5
            r0.f156103w = r5
            java.lang.String r5 = r12.f151420B
            java.lang.String r6 = "UTF-8"
            java.lang.String r5 = p206nj.C117627q.m165909b(r5, r6)
            java.lang.String r6 = "Tag"
            java.lang.String r5 = r0.mo86045b(r6, r5, r4)
            r0.f156106z = r5
            java.lang.String r5 = r12.f151421C
            java.lang.String r6 = "UTF-8"
            java.lang.String r5 = p206nj.C117627q.m165909b(r5, r6)
            java.lang.String r6 = "SubTag"
            java.lang.String r5 = r0.mo86045b(r6, r5, r4)
            r0.f156075A = r5
            ak1.f0$n0 r5 = r12.f151424F
            int r6 = r5.f338d
            long r6 = (long) r6
            r0.f156077C = r6
            ak1.f0$n0 r6 = ak1.C54067f0.C0067n0.NUMBER_TO_SEE
            if (r5 != r6) goto L_0x02a1
            long r1 = r12.f151425G
        L_0x02a1:
            r0.f156078D = r1
            cj1.a$a r1 = cj1.C54730a.C54731a.f153381a
            java.lang.String r1 = r1.mo75621a()
            java.lang.String r2 = "BeautyResult"
            java.lang.String r1 = r0.mo86045b(r2, r1, r4)
            r0.f156079E = r1
            cj1.g6$a r1 = cj1.C54763g6.C54764a.f153488a
            java.lang.String r1 = r1.mo75669a(r3)
            java.lang.String r2 = "MeizhuangResult"
            java.lang.String r1 = r0.mo86045b(r2, r1, r4)
            r0.f156082H = r1
            r0.mo86054n()
            java.lang.String r1 = "HABBYGE-MALI.HellLiveReport"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "report21024: chnl_extra:"
            r2.append(r3)
            java.lang.String r3 = r0.f156083I
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.String r1 = "HABBYGE-MALI.HellLiveReport"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "report21024: finderUsrname="
            r2.append(r3)
            java.lang.String r3 = r0.f156084d
            r2.append(r3)
            java.lang.String r3 = ", finderWxAppInfo="
            r2.append(r3)
            java.lang.String r3 = r0.f156085e
            r2.append(r3)
            java.lang.String r3 = ", isPrivate="
            r2.append(r3)
            int r3 = r0.f156086f
            r2.append(r3)
            java.lang.String r3 = ", finderSessionId="
            r2.append(r3)
            java.lang.String r3 = r0.f156087g
            r2.append(r3)
            java.lang.String r3 = ", actionTimeMs="
            r2.append(r3)
            long r3 = r0.f156088h
            r2.append(r3)
            java.lang.String r3 = ", exitType="
            r2.append(r3)
            long r3 = r0.f156099s
            r2.append(r3)
            java.lang.String r3 = ", fansCount="
            r2.append(r3)
            long r3 = r0.f156089i
            r2.append(r3)
            java.lang.String r3 = ", cameraStatus="
            r2.append(r3)
            long r3 = r0.f156090j
            r2.append(r3)
            java.lang.String r3 = ", enterUITimeMs="
            r2.append(r3)
            long r3 = r0.f156091k
            r2.append(r3)
            java.lang.String r3 = ", stayTimeMs="
            r2.append(r3)
            long r3 = r0.f156092l
            r2.append(r3)
            java.lang.String r3 = ", coverType="
            r2.append(r3)
            long r3 = r0.f156093m
            r2.append(r3)
            java.lang.String r3 = ", ruleType="
            r2.append(r3)
            long r3 = r0.f156094n
            r2.append(r3)
            java.lang.String r3 = ", poiJson="
            r2.append(r3)
            java.lang.String r3 = r0.f156095o
            r2.append(r3)
            java.lang.String r3 = ", description="
            r2.append(r3)
            java.lang.String r3 = r0.f156096p
            r2.append(r3)
            java.lang.String r3 = ", liveId="
            r2.append(r3)
            java.lang.String r3 = r0.f156097q
            r2.append(r3)
            java.lang.String r3 = ", feedId="
            r2.append(r3)
            java.lang.String r3 = r0.f156098r
            r2.append(r3)
            java.lang.String r3 = ", errorCode="
            r2.append(r3)
            java.lang.String r3 = r0.f156100t
            r2.append(r3)
            java.lang.String r3 = ", goodsListJson="
            r2.append(r3)
            java.lang.String r3 = r0.f156101u
            r2.append(r3)
            java.lang.String r3 = ", retouchResult="
            r2.append(r3)
            java.lang.String r3 = r0.f156104x
            r2.append(r3)
            java.lang.String r3 = ", filtersResult="
            r2.append(r3)
            java.lang.String r3 = r0.f156105y
            r2.append(r3)
            java.lang.String r3 = ", connectSwitch="
            r2.append(r3)
            java.lang.String r3 = r0.f156076B
            r2.append(r3)
            java.lang.String r3 = ", sourceScene="
            r2.append(r3)
            long r3 = r0.f156103w
            r2.append(r3)
            java.lang.String r3 = ", tag="
            r2.append(r3)
            java.lang.String r3 = r12.f151420B
            r2.append(r3)
            java.lang.String r3 = ", subTag="
            r2.append(r3)
            java.lang.String r12 = r12.f151421C
            r2.append(r12)
            java.lang.String r12 = ", visibleRange="
            r2.append(r12)
            long r3 = r0.f156077C
            r2.append(r3)
            java.lang.String r12 = ", beautyResult="
            r2.append(r12)
            java.lang.String r12 = r0.f156079E
            r2.append(r12)
            java.lang.String r12 = ", shopWindowId="
            r2.append(r12)
            java.lang.String r12 = r0.f156102v
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54108o.Gx0(ak1.f0$p):void");
    }

    public final void Hx0(long j, long j2, String str, long j3, long j4, C54067f0.C54078q qVar, String str2, long j5, long j6, C54067f0.C54083s0 s0Var, String str3, String str4, String str5) {
        Class cls = C62120e.class;
        C87412m.m108594g(qVar, "actionType");
        C87412m.m108594g(str2, "commentscene");
        C87412m.m108594g(s0Var, "enterType");
        C87412m.m108594g(str4, "clickSubTabContextId");
        C87412m.m108594g(str5, "chnlExtra");
        if (TextUtils.isEmpty(str2)) {
            String e = ((C23462b) ((C10383h) C86312j.m106911c(C10383h.class)).mo10693DZ()).mo36921e();
            if (((C62120e) C86312j.m106911c(cls)).tu0(e)) {
                String str6 = str == null ? "" : str;
                long SC = (long) ((C62120e) C86312j.m106911c(cls)).mo33957SC(e);
                String str7 = C64208c.f181958h;
                String str8 = str7 == null ? "" : str7;
                String str9 = C64208c.f181959i;
                C54064b0 b0Var = r3;
                C54064b0 b0Var2 = new C54064b0(j, j2, str6, 0, j4, qVar, "temp_6", j5, SC, str8, str9 == null ? "" : str9, j6, s0Var, (String) null, (String) null, str4, str5, (String) null, 155648, (C8480h) null);
                wx0(b0Var);
                return;
            }
            return;
        }
        wx0(new C54064b0(j, j2, str == null ? "" : str, j3, j4, qVar, str2, j5, -1, "", "", j6, s0Var, str3 == null ? "" : str3, (String) null, str4, str5, (String) null, 147456, (C8480h) null));
    }

    /* renamed from: I3 */
    public void mo9599I3(int i, int i2, long j, Map<String, ? extends Object> map) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        jSONObject.put("entrance_type", i2);
        jSONObject.put("entrance_id", j);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        }
        Log.m105924i("HABBYGE-MALI.HellLiveReport", "#report21017ForAnchorLivePath " + jSONObject);
        C8777j5.C8778a.m8600a(this, 36, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: IK */
    public void mo9600IK(View view, Object obj, C64208c.C64210b bVar, int i, int i2, C54067f0.C54078q qVar, String str, C0075i iVar, boolean z) {
        boolean z2;
        View view2 = view;
        Object obj2 = obj;
        C54067f0.C54078q qVar2 = qVar;
        String str2 = str;
        C0075i iVar2 = iVar;
        C87412m.m108594g(bVar, "visibleState");
        C87412m.m108594g(qVar2, "actionType");
        C87412m.m108594g(str2, "commentscene");
        C87412m.m108594g(iVar2, "event");
        C54059a aVar = f151870i;
        aVar.getClass();
        C54092k kVar = aVar.f151378c;
        kVar.getClass();
        if (C110823p.m151009y(kVar.f151779l, str2)) {
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            kVar.mo74770a();
                            kVar.f151776i = false;
                        } else if (ordinal == 4) {
                            kVar.f151773f.clear();
                        }
                    } else if (z) {
                        kVar.mo74771b();
                        kVar.f151776i = true;
                    }
                } else if (kVar.f151776i) {
                    kVar.mo74770a();
                    kVar.f151776i = false;
                }
            } else if (!kVar.f151776i) {
                kVar.mo74771b();
                kVar.f151776i = true;
            }
            if (C87412m.m108589b(str2, "61")) {
                str2 = "temp_6";
                z2 = true;
            } else {
                z2 = false;
            }
            C0075i iVar3 = C0075i.EVENT_ON_RESUME;
            C0075i iVar4 = C0075i.EVENT_ON_PAUSE;
            kVar.f151777j = qVar2;
            kVar.f151778k = str2;
            if (z2) {
                Class cls = C64995b.class;
                if (iVar2 == iVar4) {
                    ((C64995b) C86312j.m106911c(cls)).pn0(kVar.f151785r);
                    kVar.f151783p = true;
                } else if (iVar2 == iVar3) {
                    kVar.f151783p = false;
                    ((C64995b) C86312j.m106911c(cls)).Cv0(kVar.f151785r);
                }
                if (!kVar.f151783p) {
                    ((C64995b) C86312j.m106911c(cls)).mo89152kT(view, obj2, i, i2);
                    return;
                }
                return;
            }
            int i3 = i;
            int i4 = i2;
            if (iVar2 == iVar4) {
                Method method = kVar.f151782o;
                if (method != null) {
                    method.invoke((Object) null, new Object[]{kVar.f151784q});
                    kVar.f151783p = true;
                } else {
                    C87412m.m108603p("unregister_method");
                    throw null;
                }
            } else if (iVar2 == iVar3) {
                kVar.f151783p = false;
                Method method2 = kVar.f151781n;
                if (method2 != null) {
                    method2.invoke((Object) null, new Object[]{kVar.f151784q});
                } else {
                    C87412m.m108603p("register_method");
                    throw null;
                }
            }
            if (!kVar.f151783p) {
                Method method3 = kVar.f151780m;
                if (method3 != null) {
                    method3.invoke((Object) null, new Object[]{view2, obj2, Integer.valueOf(i), Integer.valueOf(i2)});
                    return;
                }
                C87412m.m108603p("monitor_method");
                throw null;
            }
        }
    }

    public final void Ix0(RecyclerView recyclerView, C54067f0.C54078q qVar, String str, C0075i iVar, int i, int i2) {
        String str2;
        C0075i iVar2;
        String str3 = str;
        C0075i iVar3 = iVar;
        int i3 = i;
        int i4 = i2;
        C0075i iVar4 = C0075i.EVENT_ON_PAUSE;
        Class cls = C11266d.class;
        Class cls2 = C10383h.class;
        C87412m.m108594g(qVar, "actionType");
        C87412m.m108594g(str3, "commentscene");
        C87412m.m108594g(iVar3, "event");
        if (C87412m.m108589b(str3, "80") || C87412m.m108589b(str3, "94")) {
            C64208c.C64209a aVar = C64208c.f181951a;
            str2 = C64208c.f181952b ? "80" : "94";
        } else {
            str2 = str3;
        }
        C0075i iVar5 = C0075i.EVENT_ON_RESUME;
        if (iVar3 == iVar5) {
            f151869h.getClass();
        }
        ((C10383h) C86312j.m106911c(cls2)).mo10697OK(((C11266d) C86312j.m106911c(cls)).mo9187Uy().getContextId());
        ((C10383h) C86312j.m106911c(cls2)).rn0(((C11266d) C86312j.m106911c(cls)).mo9187Uy().mo10844b());
        if (i3 != -1 || !this.f151876g.contains(Integer.valueOf(i2))) {
            int i5 = this.f151873d;
            if (i3 != i5 && i4 != i5) {
                C64208c.f181966p = i4;
                if (i3 == 1001) {
                    iVar2 = iVar4;
                } else if (i4 == 1001) {
                    iVar2 = iVar5;
                } else {
                    return;
                }
            } else if ((iVar3 != iVar5 && iVar3 != iVar4) || C64208c.f181966p == 1001) {
                iVar2 = iVar3;
            } else {
                return;
            }
            f151870i.mo74734c(recyclerView, qVar, str2, iVar2, 0, -1, 0);
            return;
        }
        C64208c.f181966p = i4;
    }

    /* renamed from: JK */
    public void mo9601JK(C54067f0.C0064m mVar, Map<String, String> map, String str, String str2, String str3) {
        Class cls = C10383h.class;
        C87412m.m108594g(mVar, "elementId");
        C87412m.m108594g(map, "eidUdfKVMap");
        FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new FinderBroadcastEidClickStruct();
        finderBroadcastEidClickStruct.f9725d = Util.nowMilliSecond();
        finderBroadcastEidClickStruct.mo1017x(f151869h.f151426H);
        finderBroadcastEidClickStruct.mo1012s("");
        finderBroadcastEidClickStruct.mo1011E("");
        finderBroadcastEidClickStruct.mo1008B("");
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderBroadcastEidClickStruct.mo1019z(Wb);
        if (str == null && (str = ((C10383h) C86312j.m106911c(cls)).mo10696E()) == null) {
            str = "";
        }
        finderBroadcastEidClickStruct.mo1014u(str);
        if (str2 == null) {
            str2 = ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK();
        }
        finderBroadcastEidClickStruct.mo1013t(str2);
        String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
        if (S0 == null) {
            S0 = "";
        }
        finderBroadcastEidClickStruct.mo1010D(S0);
        finderBroadcastEidClickStruct.mo1007A("");
        finderBroadcastEidClickStruct.mo1018y("");
        finderBroadcastEidClickStruct.mo1015v(mVar.f248d);
        finderBroadcastEidClickStruct.mo1016w(xx0(map));
        finderBroadcastEidClickStruct.f9739r = finderBroadcastEidClickStruct.mo86045b("session_buffer", str3, true);
        finderBroadcastEidClickStruct.mo1009C(((C60606n) C86312j.m106911c(C60606n.class)).tx0());
        finderBroadcastEidClickStruct.mo86054n();
    }

    public final void Jx0(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        if (i == 2) {
            jSONObject.put("times", i2);
        }
        C8777j5.C8778a.m8605f(this, C0073g0.ANCHOR_PAUSE_LIVE, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: Jz */
    public void mo9602Jz(C54067f0.C0066n nVar, Map<String, String> map) {
        Class cls = C10383h.class;
        C87412m.m108594g(nVar, "elementId");
        C87412m.m108594g(map, "eidUdfKVMap");
        FinderBroadcastEidExposeStruct finderBroadcastEidExposeStruct = new FinderBroadcastEidExposeStruct();
        finderBroadcastEidExposeStruct.f9740d = Util.nowMilliSecond();
        finderBroadcastEidExposeStruct.f9741e = finderBroadcastEidExposeStruct.mo86045b("finderusername", f151869h.f151426H, true);
        finderBroadcastEidExposeStruct.f9742f = finderBroadcastEidExposeStruct.mo86045b("chnl_extra", "", true);
        finderBroadcastEidExposeStruct.f9743g = finderBroadcastEidExposeStruct.mo86045b("tab_id", "", true);
        finderBroadcastEidExposeStruct.f9744h = finderBroadcastEidExposeStruct.mo86045b("sub_tab_id", "", true);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderBroadcastEidExposeStruct.f9745i = finderBroadcastEidExposeStruct.mo86045b("sessionid", Wb, true);
        String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
        if (E == null) {
            E = "";
        }
        finderBroadcastEidExposeStruct.f9746j = finderBroadcastEidExposeStruct.mo86045b("contextid", E, true);
        finderBroadcastEidExposeStruct.f9747k = finderBroadcastEidExposeStruct.mo86045b("commentscene", ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK(), true);
        String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
        if (S0 == null) {
            S0 = "";
        }
        finderBroadcastEidExposeStruct.f9748l = finderBroadcastEidExposeStruct.mo86045b("TabContextID", S0, true);
        finderBroadcastEidExposeStruct.f9749m = finderBroadcastEidExposeStruct.mo86045b("SubTabContextID", "", true);
        finderBroadcastEidExposeStruct.f9750n = finderBroadcastEidExposeStruct.mo86045b("pg_udf_kv", "", true);
        finderBroadcastEidExposeStruct.f9751o = finderBroadcastEidExposeStruct.mo86045b("ref_commentscene", "", true);
        finderBroadcastEidExposeStruct.f9752p = finderBroadcastEidExposeStruct.mo86045b("eid", nVar.f334d, true);
        finderBroadcastEidExposeStruct.f9753q = finderBroadcastEidExposeStruct.mo86045b("eld_udf_kv", xx0(map), true);
        finderBroadcastEidExposeStruct.f9754r = finderBroadcastEidExposeStruct.mo86045b("switch_extra", ((C60606n) C86312j.m106911c(C60606n.class)).tx0(), true);
        finderBroadcastEidExposeStruct.mo86054n();
    }

    /* renamed from: Kf */
    public void mo9603Kf(BaseFinderFeed baseFinderFeed, long j, C54067f0.C54078q qVar, String str, String str2) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(qVar, "actionType");
        C87412m.m108594g(str, "commentscene");
        C87412m.m108594g(str2, "chnlExtra");
        long itemId = baseFinderFeed.getItemId();
        C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
        long j2 = liveInfo != null ? liveInfo.f182392d : 0;
        String userName = baseFinderFeed.mo3513o().getUserName();
        C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
        vx0(new C54061a0(itemId, j2, userName, j, liveInfo2 != null ? (long) liveInfo2.f182393e : -1, qVar, str, 0, (String) null, (String) null, 0, (String) null, (String) null, str2, 8064, (C8480h) null));
    }

    public final void Kx0(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        jSONObject.putOpt("result", str);
        C8777j5.C8778a.m8605f(this, C0073g0.ANCHOR_BATTLE, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    public final void Lx0(int i) {
        C8777j5.C8778a.m8605f(this, C0073g0.COMMENT_OPTION, String.valueOf(i), (String) null, 4, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Mx0(ak1.C54067f0.C0051c r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "type"
            gy3.C87412m.m108594g(r12, r0)
            int r1 = r12.ordinal()
            r2 = 1
            if (r1 == 0) goto L_0x0109
            r3 = 5
            if (r1 == r3) goto L_0x0102
            r3 = 6
            if (r1 == r3) goto L_0x001e
            r3 = 7
            if (r1 == r3) goto L_0x0018
            goto L_0x010d
        L_0x0018:
            ak1.f0 r1 = f151869h
            r1.f151457g = r2
            goto L_0x010d
        L_0x001e:
            if (r13 == 0) goto L_0x0101
            java.lang.String r1 = "@"
            java.lang.String[] r4 = new java.lang.String[]{r1}     // Catch:{ Exception -> 0x00e6 }
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r13
            java.util.List r1 = z04.C112550d0.m153785U(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00e6 }
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00e6 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x00e6 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x00e6 }
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r1 = ";"
            java.lang.String[] r6 = new java.lang.String[]{r1}     // Catch:{ Exception -> 0x00e6 }
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r1 = z04.C112550d0.m153785U(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00e6 }
            r5 = 2131827788(0x7f111c4c, float:1.9288499E38)
            r6 = 3
            r7 = 2
            if (r4 == r2) goto L_0x008a
            if (r4 == r7) goto L_0x007e
            if (r4 == r6) goto L_0x0072
            r3 = 4
            if (r4 == r3) goto L_0x0066
            android.content.res.Resources r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r3 = r3.getString(r5)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00a5
        L_0x0066:
            android.content.res.Resources r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()     // Catch:{ Exception -> 0x00e6 }
            r4 = 2131827791(0x7f111c4f, float:1.9288505E38)
            java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00a5
        L_0x0072:
            android.content.res.Resources r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()     // Catch:{ Exception -> 0x00e6 }
            r4 = 2131827793(0x7f111c51, float:1.9288509E38)
            java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00a5
        L_0x007e:
            android.content.res.Resources r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()     // Catch:{ Exception -> 0x00e6 }
            r4 = 2131827862(0x7f111c96, float:1.9288649E38)
            java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00a5
        L_0x008a:
            java.lang.Object r4 = r1.get(r3)     // Catch:{ Exception -> 0x00e6 }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x00e6 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00e6 }
            if (r4 == 0) goto L_0x009f
            android.content.res.Resources r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r3 = r3.getString(r5)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00a5
        L_0x009f:
            java.lang.Object r3 = r1.get(r3)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00e6 }
        L_0x00a5:
            java.lang.String r4 = "if (lotteryType == Const…chooser_type_any_comment)"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x00e6 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e6 }
            r4.<init>()     // Catch:{ Exception -> 0x00e6 }
            r4.append(r3)     // Catch:{ Exception -> 0x00e6 }
            r3 = 59
            r4.append(r3)     // Catch:{ Exception -> 0x00e6 }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00e6 }
            r4.append(r2)     // Catch:{ Exception -> 0x00e6 }
            r4.append(r3)     // Catch:{ Exception -> 0x00e6 }
            java.lang.Object r2 = r1.get(r7)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00e6 }
            r4.append(r2)     // Catch:{ Exception -> 0x00e6 }
            r4.append(r3)     // Catch:{ Exception -> 0x00e6 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00e6 }
            r4.append(r1)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x00e6 }
            ak1.f0 r2 = f151869h     // Catch:{ Exception -> 0x00e6 }
            long r3 = r2.f151453e     // Catch:{ Exception -> 0x00e6 }
            r5 = 1
            long r3 = r3 + r5
            r2.f151453e = r3     // Catch:{ Exception -> 0x00e6 }
            goto L_0x010e
        L_0x00e6:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "START_LOTTERY_SUCCESS crash: "
            r13.append(r0)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.String r13 = "HABBYGE-MALI.HellLiveReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r12)
        L_0x0101:
            return
        L_0x0102:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L_0x010d
            return
        L_0x0109:
            ak1.f0 r1 = f151869h
            r1.f151455f = r2
        L_0x010d:
            r1 = 0
        L_0x010e:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            int r12 = r12.f98d
            r2.put(r0, r12)
            if (r1 != 0) goto L_0x011f
            if (r13 != 0) goto L_0x0120
            java.lang.String r13 = ""
            goto L_0x0120
        L_0x011f:
            r13 = r1
        L_0x0120:
            java.lang.String r12 = "result"
            r2.put(r12, r13)
            ak1.g0 r4 = ak1.C0073g0.LIVE_ANCHOR_LOTTERY
            java.lang.String r5 = r2.toString()
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r11
            ht1.C8777j5.C8778a.m8605f(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54108o.Mx0(ak1.f0$c, java.lang.String):void");
    }

    public final void Nx0() {
        String str;
        C54067f0 f0Var = f151869h;
        long j = f0Var.f151443Y.f151827d;
        if (j > 0) {
            FinderLiveResultStruct finderLiveResultStruct = new FinderLiveResultStruct();
            finderLiveResultStruct.f155646d = finderLiveResultStruct.mo86045b("FinderUsrname", f0Var.mo74756f(), true);
            finderLiveResultStruct.f155647e = finderLiveResultStruct.mo86045b("FinderWxAppInfo", f0Var.mo74759i(), true);
            finderLiveResultStruct.f155648f = f0Var.mo74761k();
            finderLiveResultStruct.f155649g = finderLiveResultStruct.mo86045b("FinderSessionId", f0Var.mo74758h(), true);
            long currentTimeMillis = System.currentTimeMillis();
            finderLiveResultStruct.f155650h = currentTimeMillis;
            finderLiveResultStruct.mo86046c("ActionTimeMs", currentTimeMillis);
            C54099m0 m0Var = f0Var.f151443Y;
            finderLiveResultStruct.f155658p = m0Var.f151831h;
            finderLiveResultStruct.f155659q = m0Var.f151832i;
            finderLiveResultStruct.f155660r = m0Var.f151833j;
            finderLiveResultStruct.f155656n = m0Var.f151830g;
            String str2 = m0Var.f151824a;
            if (TextUtils.isEmpty(str2) || C87412m.m108589b(str2, "0") || C87412m.m108589b(str2, "-1")) {
                str2 = f0Var.mo74753c();
            }
            finderLiveResultStruct.f155651i = finderLiveResultStruct.mo86045b("LiveId", str2, true);
            String str3 = f0Var.f151443Y.f151825b;
            if (TextUtils.isEmpty(str3) || C87412m.m108589b(str3, "0") || C87412m.m108589b(str3, "-1")) {
                str3 = f0Var.mo74752b();
            }
            finderLiveResultStruct.f155652j = finderLiveResultStruct.mo86045b("FeedId", str3, true);
            finderLiveResultStruct.f155653k = finderLiveResultStruct.mo86045b("Description", TextUtils.isEmpty(f0Var.f151443Y.f151826c) ? f0Var.mo74754d() : f0Var.f151443Y.f151826c, true);
            finderLiveResultStruct.f155654l = j;
            finderLiveResultStruct.mo86046c("LiveStartTimeMs", j);
            long j2 = f0Var.f151443Y.f151828e;
            finderLiveResultStruct.f155655m = j2;
            finderLiveResultStruct.mo86046c("LiveEndTimeMs", j2);
            C54099m0 m0Var2 = f0Var.f151443Y;
            finderLiveResultStruct.f155657o = m0Var2.f151829f;
            finderLiveResultStruct.f155661s = m0Var2.f151834k;
            finderLiveResultStruct.f155662t = m0Var2.f151835l;
            finderLiveResultStruct.f155663u = m0Var2.f151836m;
            finderLiveResultStruct.f155664v = m0Var2.f151837n;
            finderLiveResultStruct.f155665w = m0Var2.f151838o;
            finderLiveResultStruct.f155666x = m0Var2.f151839p;
            finderLiveResultStruct.f155667y = m0Var2.f151840q;
            finderLiveResultStruct.f155668z = m0Var2.f151841r;
            finderLiveResultStruct.f155626A = m0Var2.f151842s;
            finderLiveResultStruct.f155627B = m0Var2.f151843t;
            finderLiveResultStruct.f155628C = m0Var2.f151844u;
            if (m0Var2.f151845v.isEmpty()) {
                str = "";
            } else {
                str = "";
                for (Map.Entry next : f0Var.f151443Y.f151845v.entrySet()) {
                    Iterator it = ((LinkedList) next.getValue()).iterator();
                    long j3 = 0;
                    while (it.hasNext()) {
                        C54118z zVar = (C54118z) it.next();
                        if (zVar.f151965b) {
                            j3 += zVar.f151964a;
                        }
                    }
                    str = str + ((Number) next.getKey()).longValue() + XVFSFile.PATH_SEPARATOR_CHAR + j3 + '#';
                }
                if (C112551y.m153808h(str, "#", false, 2, (Object) null)) {
                    str = str.substring(0, str.length() - 1);
                    C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
            finderLiveResultStruct.f155629D = finderLiveResultStruct.mo86045b("PromoteGoodsJson", str, true);
            C54067f0 f0Var2 = f151869h;
            finderLiveResultStruct.f155630E = (long) f0Var2.f151443Y.f151845v.size();
            finderLiveResultStruct.f155631F = finderLiveResultStruct.mo86045b("ShopWindowId", f0Var2.f151443Y.f151848y, true);
            C54099m0 m0Var3 = f0Var2.f151443Y;
            finderLiveResultStruct.f155632G = m0Var3.f151846w;
            finderLiveResultStruct.f155635J = m0Var3.f151847x;
            finderLiveResultStruct.f155634I = f0Var2.f151453e;
            finderLiveResultStruct.f155633H = (long) f0Var2.f151460h0.f162d;
            finderLiveResultStruct.f155636K = (long) f0Var2.f151471o;
            finderLiveResultStruct.f155638M = finderLiveResultStruct.mo86045b("Tag", C117627q.m165909b(f0Var2.f151420B, "UTF-8"), true);
            finderLiveResultStruct.f155639N = finderLiveResultStruct.mo86045b("SubTag", C117627q.m165909b(f0Var2.f151421C, "UTF-8"), true);
            if (f0Var2.f151472p.isEmpty()) {
                finderLiveResultStruct.f155637L = finderLiveResultStruct.mo86045b("ConnectDuration", "", true);
            } else {
                Iterator<C117878c<C54067f0.C54068a0, Long, Boolean>> it4 = f0Var2.f151472p.iterator();
                String str4 = "";
                while (it4.hasNext()) {
                    C117878c next2 = it4.next();
                    Object a = next2.mo182596a(2);
                    C87412m.m108593f(a, "tuple.`$3`()");
                    if (((Boolean) a).booleanValue()) {
                        str4 = str4 + ((C54067f0.C54068a0) next2.mo182596a(0)).f151487d + '|' + next2.mo182596a(1) + ';';
                    }
                }
                if (!C87412m.m108589b(str4, "")) {
                    str4 = str4.substring(0, str4.length() - 1);
                    C87412m.m108593f(str4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                finderLiveResultStruct.f155637L = finderLiveResultStruct.mo86045b("ConnectDuration", str4, true);
            }
            C54067f0 f0Var3 = f151869h;
            if (f0Var3.f151474r.isEmpty()) {
                finderLiveResultStruct.f155641P = finderLiveResultStruct.mo86045b("MicWithAnchor", "", true);
            } else {
                Iterator<C117878c<String, Long, Boolean>> it5 = f0Var3.f151474r.iterator();
                String str5 = "";
                while (it5.hasNext()) {
                    C117878c next3 = it5.next();
                    Object a2 = next3.mo182596a(2);
                    C87412m.m108593f(a2, "tuple.`$3`()");
                    if (((Boolean) a2).booleanValue()) {
                        str5 = str5 + ((String) next3.mo182596a(0)) + '|' + next3.mo182596a(1) + ';';
                    }
                }
                if (!C87412m.m108589b(str5, "")) {
                    str5 = str5.substring(0, str5.length() - 1);
                    C87412m.m108593f(str5, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                finderLiveResultStruct.f155641P = finderLiveResultStruct.mo86045b("MicWithAnchor", str5, true);
            }
            C54067f0 f0Var4 = f151869h;
            finderLiveResultStruct.f155640O = (long) f0Var4.f151479w.f151723d;
            C54067f0.C0067n0 n0Var = f0Var4.f151424F;
            finderLiveResultStruct.f155642Q = (long) n0Var.f338d;
            finderLiveResultStruct.f155644S = n0Var == C54067f0.C0067n0.NUMBER_TO_SEE ? f0Var4.f151425G : 0;
            finderLiveResultStruct.f155643R = (long) C64208c.f181957g;
            String eVar = f0Var4.f151468l0.toString();
            C87412m.m108593f(eVar, "getConfig().screenShareHistory.toString()");
            finderLiveResultStruct.f155645T = finderLiveResultStruct.mo86045b("PresentationJson", C112551y.m153814n(eVar, ",", ";", false), true);
            finderLiveResultStruct.mo86054n();
            C54099m0 m0Var4 = f0Var4.f151443Y;
            m0Var4.f151824a = "";
            m0Var4.f151825b = "";
            m0Var4.f151826c = "";
            m0Var4.f151827d = 0;
            m0Var4.f151828e = 0;
            m0Var4.f151830g = 0;
            m0Var4.f151829f = 0;
            m0Var4.f151831h = 0;
            m0Var4.f151832i = 0;
            m0Var4.f151833j = 0;
            m0Var4.f151834k = 0;
            m0Var4.f151835l = 0;
            m0Var4.f151836m = 0;
            m0Var4.f151837n = 0;
            m0Var4.f151838o = 0;
            m0Var4.f151839p = 0;
            m0Var4.f151840q = 0;
            m0Var4.f151841r = 0;
            m0Var4.f151842s = 0;
            m0Var4.f151843t = 0;
            m0Var4.f151844u = 0;
            m0Var4.f151848y = "";
            m0Var4.f151846w = 0;
            m0Var4.f151847x = 0;
            m0Var4.f151845v.clear();
            f0Var4.f151440V = 0;
            f0Var4.f151441W = 0;
            f0Var4.f151442X = 0;
            f0Var4.f151444Z = false;
            f0Var4.f151446a0 = false;
            f0Var4.f151448b0 = false;
            f0Var4.f151450c0 = false;
            f0Var4.f151452d0 = false;
            f0Var4.f151471o = 0;
            f0Var4.f151472p.clear();
            f0Var4.f151473q = false;
            f0Var4.f151474r.clear();
            f0Var4.f151454e0.clear();
            f0Var4.f151453e = 0;
            f0Var4.f151455f = false;
            f0Var4.f151457g = false;
            f0Var4.f151420B = "";
            f0Var4.f151421C = "";
            f0Var4.f151424F = C54067f0.C0067n0.PUBLIC;
            f0Var4.f151425G = 0;
            f0Var4.f151479w = C54067f0.C54086x.NO;
            C64208c.f181957g = 0;
            Log.m105924i("HABBYGE-MALI.HellLiveReport", "report21056: finderUsrname=" + finderLiveResultStruct.f155646d + ", finderWxAppInfo=" + finderLiveResultStruct.f155647e + ", isPrivate=" + finderLiveResultStruct.f155648f + ", finderSessionId=" + finderLiveResultStruct.f155649g + ", actionTimeMs=" + finderLiveResultStruct.f155650h + ", audienceCount=" + finderLiveResultStruct.f155658p + ", likeCount=" + finderLiveResultStruct.f155659q + ", newFansNum=" + finderLiveResultStruct.f155660r + ", liveDurationSeconds=" + finderLiveResultStruct.f155656n + ", liveId=" + finderLiveResultStruct.f155651i + ", feedId=" + finderLiveResultStruct.f155652j + ", description=" + finderLiveResultStruct.f155653k + ", liveStartTimeMs=" + finderLiveResultStruct.f155654l + ", liveEndTimeMs=" + finderLiveResultStruct.f155655m + ", oriFansCount=" + finderLiveResultStruct.f155657o + ", errorCode=" + finderLiveResultStruct.f155661s + ", floatingCount=" + finderLiveResultStruct.f155662t + ", shareSnsCount=" + finderLiveResultStruct.f155663u + ", shareSessionCount=" + finderLiveResultStruct.f155664v + ", exchangeCameraCount=" + finderLiveResultStruct.f155665w + ", complainCount=" + finderLiveResultStruct.f155666x + ", allCommentCloseCount=" + finderLiveResultStruct.f155667y + ", allCommentOpenCount=" + finderLiveResultStruct.f155668z + ", personalCommentCloseCount=" + finderLiveResultStruct.f155626A + ", personalCommentOpenCount=" + finderLiveResultStruct.f155627B + ", kickOutCount=" + finderLiveResultStruct.f155628C + ", promoteGoodsJson=" + finderLiveResultStruct.f155629D + ", promoteGoodsCount=" + finderLiveResultStruct.f155630E + ", shopWindowId=" + finderLiveResultStruct.f155631F + ", nudgeCount=" + finderLiveResultStruct.f155635J + ", lotteryCount=" + finderLiveResultStruct.f155634I + ", connectCount=" + finderLiveResultStruct.f155636K + ", connectDuration=" + finderLiveResultStruct.f155637L + ", micWithAnchor=" + finderLiveResultStruct.f155641P + ", sourceScene=" + finderLiveResultStruct.f155633H + ", isGift=" + finderLiveResultStruct.f155640O + ", tag=" + f0Var4.f151420B + ", subTag=" + f0Var4.f151421C + ", visibleRange=" + finderLiveResultStruct.f155642Q + ", topComment=" + finderLiveResultStruct.f155632G + ", presentationJson=" + finderLiveResultStruct.f155645T);
        }
    }

    public final void Ox0(C54067f0.C54069c0 c0Var, String str) {
        C87412m.m108594g(c0Var, "actionType");
        if (((C10383h) C86312j.m106911c(C10383h.class)).mo10694Dq(str)) {
            FinderFaceVerifyStreamStruct finderFaceVerifyStreamStruct = new FinderFaceVerifyStreamStruct();
            finderFaceVerifyStreamStruct.f155214d = finderFaceVerifyStreamStruct.mo86045b("FinderUsrname", str == null ? "" : str, true);
            C54067f0 f0Var = f151869h;
            finderFaceVerifyStreamStruct.f155215e = finderFaceVerifyStreamStruct.mo86045b("FinderWxAppInfo", f0Var.mo74759i(), true);
            finderFaceVerifyStreamStruct.f155216f = f0Var.mo74762l(str);
            finderFaceVerifyStreamStruct.f155217g = finderFaceVerifyStreamStruct.mo86045b("FinderSessionId", f0Var.mo74758h(), true);
            long currentTimeMillis = System.currentTimeMillis();
            finderFaceVerifyStreamStruct.f155218h = currentTimeMillis;
            finderFaceVerifyStreamStruct.mo86046c("ActionTimeMs", currentTimeMillis);
            finderFaceVerifyStreamStruct.f155219i = c0Var.f151493d;
            finderFaceVerifyStreamStruct.mo86054n();
            Log.m105924i("HABBYGE-MALI.HellLiveReport", "report21113: finderUsrname=" + finderFaceVerifyStreamStruct.f155214d + ", finderWxAppInfo=" + finderFaceVerifyStreamStruct.f155215e + ", isPrivate=" + finderFaceVerifyStreamStruct.f155216f + ", finderSessionId=" + finderFaceVerifyStreamStruct.f155217g + ", actionTimeMs=" + finderFaceVerifyStreamStruct.f155218h + ", actionJson=" + finderFaceVerifyStreamStruct.f155219i);
        }
    }

    /* renamed from: Pw */
    public void mo9604Pw(C0712b0 b0Var, String str, long j, C54067f0.C54078q qVar, String str2) {
        C0712b0 b0Var2 = b0Var;
        C87412m.m108594g(qVar, "actionType");
        C87412m.m108594g(str2, "commentscene");
        if (b0Var2 == null) {
            vx0(new C54061a0(0, 0, str == null ? "" : str, j, -1, qVar, str2, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 16256, (C8480h) null));
            return;
        }
        FinderObject finderObject = b0Var2.f1709d;
        long j2 = finderObject.f164794id;
        C64273c21 c212 = finderObject.liveInfo;
        long j3 = c212 != null ? c212.f182392d : 0;
        String str3 = finderObject.username;
        C54061a0 a0Var = r3;
        C54061a0 a0Var2 = new C54061a0(j2, j3, str3 == null ? "" : str3, j, c212 != null ? (long) c212.f182393e : -1, qVar, str2, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 16256, (C8480h) null);
        vx0(a0Var);
    }

    public final void Px0(C54067f0.C0049b bVar, String str) {
        C87412m.m108594g(bVar, "action");
        C87412m.m108594g(str, "actionResult");
        long currentTimeMillis = System.currentTimeMillis();
        int ordinal = bVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                f151869h.f151481y = false;
            }
        } else if (C87412m.m108589b(str, String.valueOf(2))) {
            C64208c.f181963m = String.valueOf(f151869h.f151480x);
            C64208c.f181964n = currentTimeMillis;
        } else if (C87412m.m108589b(str, String.valueOf(1))) {
            f151869h.f151481y = true;
        } else if (C87412m.m108589b(str, String.valueOf(3)) && !f151869h.f151481y) {
            return;
        }
        FinderLiveOverPageReportStruct finderLiveOverPageReportStruct = new FinderLiveOverPageReportStruct();
        finderLiveOverPageReportStruct.f155564d = (long) bVar.f67d;
        finderLiveOverPageReportStruct.f155565e = finderLiveOverPageReportStruct.mo86045b("ActionResult", C112551y.m153814n(str, ",", ";", false), true);
        finderLiveOverPageReportStruct.f155566f = currentTimeMillis;
        finderLiveOverPageReportStruct.mo86046c("ActionTimeMs", currentTimeMillis);
        finderLiveOverPageReportStruct.f155567g = finderLiveOverPageReportStruct.mo86045b("SessionId", String.valueOf(f151869h.f151480x), true);
        finderLiveOverPageReportStruct.mo86054n();
        Log.m105924i("HABBYGE-MALI.HellLiveReport", "report21919: actionType=" + finderLiveOverPageReportStruct.f155564d + ", actionResult=" + finderLiveOverPageReportStruct.f155565e + ", actionTimeMs=" + finderLiveOverPageReportStruct.f155566f + ", sessionId=" + finderLiveOverPageReportStruct.f155567g);
    }

    public final void Qx0(C54067f0.C0058h hVar) {
        C87412m.m108594g(hVar, "action");
        Log.m105928w("HABBYGE-MALI.HellLiveReport", "report21919OnVest, action: " + hVar.name());
        if (hVar != C54067f0.C0058h.UNDEFINE) {
            Px0(C54067f0.C0049b.SEE_GIFT_LIST, String.valueOf(hVar.f136d));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r1 = r1.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Rx0(java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, ? extends java.lang.Object> r13) {
        /*
            r10 = this;
            java.lang.String r0 = "viewId"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "eventId"
            gy3.C87412m.m108594g(r12, r0)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            c50.b r1 = r0.mo77626b()
            r2 = 0
            if (r1 == 0) goto L_0x001d
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x001d
            boolean r1 = r1.mo82885g()
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            java.lang.Class<ak1.w> r3 = ak1.C54116w.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ak1.w r3 = (ak1.C54116w) r3
            java.lang.Class<kq.h> r4 = p185kq.C10383h.class
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x002f
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.f151953r
            goto L_0x008c
        L_0x002f:
            r1 = 4
            rx3.l[] r1 = new rx3.C13604l[r1]
            java.lang.String r3 = r3.f151939f
            java.lang.String r7 = ""
            if (r3 != 0) goto L_0x0039
            r3 = r7
        L_0x0039:
            rx3.l r8 = new rx3.l
            java.lang.String r9 = "finder_usnername"
            r8.<init>(r9, r3)
            r1[r2] = r8
            di3.d r3 = di3.C86312j.m106911c(r4)
            kq.h r3 = (p185kq.C10383h) r3
            java.lang.String r3 = r3.mo10696E()
            if (r3 != 0) goto L_0x004f
            r3 = r7
        L_0x004f:
            rx3.l r8 = new rx3.l
            java.lang.String r9 = "finder_context_id"
            r8.<init>(r9, r3)
            r1[r6] = r8
            di3.d r3 = di3.C86312j.m106911c(r4)
            kq.h r3 = (p185kq.C10383h) r3
            java.lang.String r3 = r3.mo10698S0()
            if (r3 != 0) goto L_0x0065
            r3 = r7
        L_0x0065:
            rx3.l r4 = new rx3.l
            java.lang.String r8 = "finder_tab_context_id"
            r4.<init>(r8, r3)
            r1[r5] = r4
            r3 = 3
            java.lang.Class<h81.i> r4 = h81.C59774i.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.i r4 = (h81.C59774i) r4
            java.lang.String r4 = r4.mo84751Wb()
            if (r4 != 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r7 = r4
        L_0x007f:
            rx3.l r4 = new rx3.l
            java.lang.String r8 = "behaviour_session_id"
            r4.<init>(r8, r7)
            r1[r3] = r4
            java.util.Map r1 = sx3.C90364q0.m113148g(r1)
        L_0x008c:
            java.lang.String r3 = "view_id"
            r1.put(r3, r11)
            c50.b r11 = r0.mo77626b()
            if (r11 == 0) goto L_0x00a3
            d50.i r11 = r11.f172989A
            if (r11 == 0) goto L_0x00a3
            boolean r11 = r11.mo82885g()
            if (r11 != r6) goto L_0x00a3
            r2 = 1
        L_0x00a3:
            if (r2 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r5 = 1
        L_0x00a7:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = "set_stage"
            r1.put(r0, r11)
            if (r13 == 0) goto L_0x00b6
            r1.putAll(r13)
        L_0x00b6:
            java.lang.Class<l31.e> r11 = l31.C61212e.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            l31.e r11 = (l31.C61212e) r11
            r13 = 25561(0x63d9, float:3.5819E-41)
            r11.mo86168ix(r12, r1, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54108o.Rx0(java.lang.String, java.lang.String, java.util.Map):void");
    }

    public void Tt0(C58744l lVar, C49712hj1 hj12) {
        C54089h hVar = f151871j;
        C54059a aVar = f151870i;
        C54067f0 f0Var = f151869h;
        hVar.getClass();
        C87412m.m108594g(aVar, "m21053Reporter");
        C87412m.m108594g(f0Var, "config");
        if (lVar != null && lVar.f168206d != null && !C87412m.m108589b("temp_9", String.valueOf(f0Var.f151419A))) {
            FeedData feedData = lVar.f168206d;
            long feedId = feedData != null ? feedData.getFeedId() : 0;
            if (hVar.f151745a != feedId) {
                hVar.f151745a = feedId;
                if (lVar.f168207e != 9) {
                    FeedData feedData2 = lVar.f168206d;
                    boolean z = false;
                    if (!(feedData2 != null && feedData2.getLiveId() == 0)) {
                        FeedData feedData3 = lVar.f168206d;
                        if (feedData3 != null && feedData3.getLiveStatus() == 1) {
                            z = true;
                        }
                        if (z) {
                            aVar.mo74737f(C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, lVar.f168208f, String.valueOf(f0Var.f151419A), lVar.f168206d, hj12);
                        }
                    }
                }
            }
        }
    }

    public final void Tx0(int i, int i2, long j, int i3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        if (i2 == 0) {
            jSONObject.put("result", 1);
        } else if (i2 == 1) {
            jSONObject.put("result", 2);
        } else if (i2 > 0) {
            jSONObject.put("result", i2);
        }
        if (j > 0) {
            jSONObject.put("product", j);
        }
        if (((long) i3) > 0) {
            jSONObject.put("total_during", i3);
        }
        C8777j5.C8778a.m8605f(this, C0073g0.PRODUCT_RECORD_ACTION, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: UI */
    public void mo9606UI() {
        f151871j.f151745a = 0;
    }

    /* renamed from: Uk */
    public void mo9607Uk(BaseFinderFeed baseFinderFeed, long j, C54067f0.C54078q qVar, String str, String str2, String str3, String str4) {
        String str5;
        FinderItem o;
        C64273c21 liveInfo;
        FinderItem o2;
        FinderItem o3;
        C64273c21 liveInfo2;
        C87412m.m108594g(qVar, "actionType");
        C87412m.m108594g(str, "commentscene");
        C87412m.m108594g(str2, "clickTabContextId");
        C87412m.m108594g(str3, "clickSubTabContextId");
        C87412m.m108594g(str4, "chnlExtra");
        long j2 = 0;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0;
        if (!(baseFinderFeed == null || (o3 = baseFinderFeed.mo3513o()) == null || (liveInfo2 = o3.getLiveInfo()) == null)) {
            j2 = liveInfo2.f182392d;
        }
        long j3 = j2;
        if (baseFinderFeed == null || (o2 = baseFinderFeed.mo3513o()) == null || (str5 = o2.getUserName()) == null) {
            str5 = "";
        }
        vx0(new C54061a0(itemId, j3, str5, j, (baseFinderFeed == null || (o = baseFinderFeed.mo3513o()) == null || (liveInfo = o.getLiveInfo()) == null) ? -1 : (long) liveInfo.f182393e, qVar, str, 0, (String) null, (String) null, 0, str2, str3, str4, 1920, (C8480h) null));
    }

    public final void Vx0(String str, long j, String str2, boolean z) {
        Log.m105924i("HABBYGE-MALI.HellLiveReport", "reportDeviceStatus liveId:" + str + " liveScene:" + j + " finderNickname:" + str2 + " isAnchor:" + z);
        C54062b bVar = f151872n;
        bVar.f151394a = str;
        bVar.f151395b = j;
        bVar.f151396c = str2;
        bVar.f151397d.stopTimer();
        if (z) {
            bVar.f151397d.startTimer(0, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        } else {
            bVar.f151397d.startTimer(0, 120000);
        }
    }

    public void Wx0(int i, int i2, int i3, String str) {
        C87412m.m108594g(str, "audienceFinderUsername");
        C104289g gVar = new C104289g();
        boolean z = false;
        int i4 = 3;
        int i5 = i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 3 : 2 : 1;
        if (!(i3 == 0 || i3 == 1)) {
            i4 = i3 != 2 ? i3 != 3 ? 0 : 1 : 2;
        }
        gVar.mo145967r("result", Integer.valueOf(i));
        gVar.mo145967r(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, Integer.valueOf(i5));
        gVar.mo145967r("type", Integer.valueOf(i4));
        if (str.length() == 0) {
            z = true;
        }
        if (!z) {
            gVar.mo145967r("audience_finder_username", str);
        }
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "JSONObject().apply {\n   …   }\n        }.toString()");
        C8777j5.C8778a.m8605f(this, C0073g0.PROFILE_HALF_SCREEN, gVar2, (String) null, 4, (Object) null);
    }

    public final void Xx0(C54067f0.C54087y yVar, String str, int i, int i2) {
        C54067f0.C54068a0 a0Var = C54067f0.C54068a0.VIDEO;
        C54067f0.C54068a0 a0Var2 = C54067f0.C54068a0.AUDIO;
        C87412m.m108594g(yVar, "linkOp");
        int ordinal = yVar.ordinal();
        if (ordinal == 1) {
            C54067f0 f0Var = f151869h;
            f0Var.f151471o++;
            f0Var.f151472p.add(C117882j.m166285d(a0Var2, Long.valueOf(System.currentTimeMillis()), Boolean.FALSE));
        } else if (ordinal == 2) {
            C54067f0 f0Var2 = f151869h;
            f0Var2.f151471o++;
            f0Var2.f151472p.add(C117882j.m166285d(a0Var, Long.valueOf(System.currentTimeMillis()), Boolean.FALSE));
        } else if (ordinal == 3) {
            C54067f0 f0Var3 = f151869h;
            if (!f0Var3.f151476t) {
                zx0(a0Var2);
                return;
            } else {
                f0Var3.f151476t = false;
                zx0(a0Var2);
            }
        } else if (ordinal != 4) {
            switch (ordinal) {
                case 10:
                    if (str != null) {
                        C54067f0 f0Var4 = f151869h;
                        f0Var4.f151473q = true;
                        f0Var4.f151474r.add(C117882j.m166285d(str, Long.valueOf(System.currentTimeMillis()), Boolean.FALSE));
                        break;
                    } else {
                        return;
                    }
                case 11:
                    if (f151869h.f151473q) {
                        yx0();
                        return;
                    }
                    break;
                case 12:
                    yx0();
                    return;
            }
        } else {
            C54067f0 f0Var5 = f151869h;
            if (f0Var5.f151478v) {
                zx0(a0Var);
                f0Var5.f151478v = false;
                return;
            }
            zx0(a0Var);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", yVar.f151740d);
        if (str == null) {
            str = "";
        }
        jSONObject.put("result", str);
        jSONObject.put("MicType", i);
        jSONObject.put("InviteType", i2);
        C8777j5.C8778a.m8605f(this, C0073g0.LINKMIC_OP, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    public final void Yx0(String str) {
        C8777j5.C8778a.m8605f(this, C0073g0.PRODUCT_SET_RECOMMEND, str, (String) null, 4, (Object) null);
    }

    public final void Zx0(C54067f0.C0059h0 h0Var) {
        C87412m.m108594g(h0Var, "action");
        Log.m105928w("HABBYGE-MALI.HellLiveReport", "reportVest, action: " + h0Var.name());
        int ordinal = h0Var.ordinal();
        if ((ordinal != 7 && ordinal != 8 && ordinal != 9) || this.f151875f || f151869h.f151481y) {
            C54067f0 f0Var = f151869h;
            if (f0Var.f151481y) {
                f0Var.getClass();
                int ordinal2 = h0Var.ordinal();
                Qx0(ordinal2 != 3 ? ordinal2 != 4 ? ordinal2 != 5 ? ordinal2 != 6 ? ordinal2 != 10 ? C54067f0.C0058h.UNDEFINE : C54067f0.C0058h.CLICK_ENTER_USER_PROFILE : C54067f0.C0058h.CLICK_FOLLOW_USER : C54067f0.C0058h.CLICK_PRIVATE_MSG_USER : C54067f0.C0058h.EXPOSE_USER_FINDER_HALF_BOARD : C54067f0.C0058h.CLICK_LIST_ITEM_USER);
                return;
            }
            C8777j5.C8778a.m8605f(this, C0073g0.SEE_GIFT_LIST, String.valueOf(h0Var.f146d), (String) null, 4, (Object) null);
        }
    }

    /* renamed from: aH */
    public void mo9608aH(C54067f0.C0050b0 b0Var, String str, String str2) {
        C87412m.m108594g(b0Var, "actionType");
        C87412m.m108594g(str2, "description");
        if (b0Var == C54067f0.C0050b0.LIVE_CANCEL_BOOK) {
            ((C11719g) C86312j.m106911c(C11719g.class)).dv0(0);
        }
        FinderNoticeLiveStreamStruct finderNoticeLiveStreamStruct = new FinderNoticeLiveStreamStruct();
        C54067f0 f0Var = f151869h;
        finderNoticeLiveStreamStruct.f155739d = finderNoticeLiveStreamStruct.mo86045b("FinderUsrname", f0Var.mo74756f(), true);
        finderNoticeLiveStreamStruct.f155740e = finderNoticeLiveStreamStruct.mo86045b("FinderWxAppInfo", f0Var.mo74759i(), true);
        finderNoticeLiveStreamStruct.f155741f = f0Var.mo74761k();
        finderNoticeLiveStreamStruct.f155742g = finderNoticeLiveStreamStruct.mo86045b("FinderSessionId", f0Var.mo74758h(), true);
        long currentTimeMillis = System.currentTimeMillis();
        finderNoticeLiveStreamStruct.f155743h = currentTimeMillis;
        finderNoticeLiveStreamStruct.mo86046c("ActionTimeMs", currentTimeMillis);
        finderNoticeLiveStreamStruct.f155744i = b0Var.f79d;
        finderNoticeLiveStreamStruct.f155745j = finderNoticeLiveStreamStruct.mo86045b("ActionJson", str != null ? C112551y.m153814n(str, ",", ";", false) : "", true);
        finderNoticeLiveStreamStruct.f155746k = (long) f0Var.f151464j0.f105d;
        finderNoticeLiveStreamStruct.f155748m = 1;
        byte[] bytes = str2.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        finderNoticeLiveStreamStruct.f155747l = finderNoticeLiveStreamStruct.mo86045b("Description", Base64.encodeToString(bytes, 0), true);
        finderNoticeLiveStreamStruct.mo86054n();
        Log.m105924i("HABBYGE-MALI.HellLiveReport", "report21106: finderUsrname=" + finderNoticeLiveStreamStruct.f155739d + ", finderWxAppInfo=" + finderNoticeLiveStreamStruct.f155740e + ", isPrivate=" + finderNoticeLiveStreamStruct.f155741f + ", finderSessionId=" + finderNoticeLiveStreamStruct.f155742g + ", actionTimeMs=" + finderNoticeLiveStreamStruct.f155743h + ", actionType=" + finderNoticeLiveStreamStruct.f155744i + ", sourceScene=" + finderNoticeLiveStreamStruct.f155746k + ", actionJson=" + finderNoticeLiveStreamStruct.f155745j);
    }

    /* renamed from: ap */
    public void mo9609ap(C54067f0.C0054e0 e0Var) {
        Class cls = C11266d.class;
        C87412m.m108594g(e0Var, "action");
        int ordinal = e0Var.ordinal();
        if (ordinal == 0) {
            this.f151874e = false;
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                this.f151874e = true;
                C54067f0 f0Var = f151869h;
                C54067f0.C0063l0 l0Var = C54067f0.C0063l0.NEARBY_LIVE;
                f0Var.getClass();
                f0Var.f151460h0 = l0Var;
            }
        } else if (this.f151874e) {
            this.f151874e = false;
            return;
        }
        FinderLiveNearbyStartLiveLogStruct finderLiveNearbyStartLiveLogStruct = new FinderLiveNearbyStartLiveLogStruct();
        finderLiveNearbyStartLiveLogStruct.f155543e = System.currentTimeMillis();
        finderLiveNearbyStartLiveLogStruct.f155544f = (long) e0Var.f110d;
        finderLiveNearbyStartLiveLogStruct.f155542d = (long) f151869h.f151458g0.f123d;
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderLiveNearbyStartLiveLogStruct.f155547i = finderLiveNearbyStartLiveLogStruct.mo86045b("Session_Id", Wb, true);
        finderLiveNearbyStartLiveLogStruct.f155545g = finderLiveNearbyStartLiveLogStruct.mo86045b("ContextID", ((C11266d) C86312j.m106911c(cls)).mo9187Uy().getContextId(), true);
        finderLiveNearbyStartLiveLogStruct.f155546h = finderLiveNearbyStartLiveLogStruct.mo86045b("ClickTabContextId", ((C11266d) C86312j.m106911c(cls)).mo9187Uy().mo10844b(), true);
        finderLiveNearbyStartLiveLogStruct.mo86054n();
        Log.m105924i("HABBYGE-MALI.HellLiveReport", "report21631: actionTS=" + finderLiveNearbyStartLiveLogStruct.f155543e + ", pageType=" + finderLiveNearbyStartLiveLogStruct.f155542d + ", action=" + finderLiveNearbyStartLiveLogStruct.f155544f + ", clickid=" + 0 + ", session_Id=" + finderLiveNearbyStartLiveLogStruct.f155547i + ", contextID=" + finderLiveNearbyStartLiveLogStruct.f155545g + ", clickTabContextId=" + finderLiveNearbyStartLiveLogStruct.f155546h);
    }

    public final void ay0(C54067f0.C54077p pVar) {
        C87412m.m108594g(pVar, "exitType");
        C54067f0 f0Var = f151869h;
        f0Var.getClass();
        f0Var.f151433O = pVar;
    }

    public final void by0(C54067f0.C54073k kVar) {
        C87412m.m108594g(kVar, "coverType");
        f151869h.f151439U = kVar.f151511d;
    }

    /* renamed from: ca */
    public void mo9610ca(BaseFinderFeed baseFinderFeed, long j, String str) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(str, "commentscene");
        C54067f0.C54078q qVar = baseFinderFeed.mo75c() == 9 ? C54067f0.C54078q.LIVE_AUDIENCE_CLICK_FEED_CARD_AVATAR_LIVING : C54067f0.C54078q.LIVE_AUDIENCE_CLICK_FEED_CARD_AVATAR;
        long itemId = baseFinderFeed.getItemId();
        C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
        long j2 = liveInfo != null ? liveInfo.f182392d : 0;
        String userName = baseFinderFeed.mo3513o().getUserName();
        C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
        vx0(new C54061a0(itemId, j2, userName, j, liveInfo2 != null ? (long) liveInfo2.f182393e : -1, qVar, str, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 16256, (C8480h) null));
    }

    public final void cy0(String str) {
        C87412m.m108594g(str, "enterJsonstr");
        try {
            int optInt = new JSONObject(str).optInt("entericontype");
            C54067f0.C54083s0 s0Var = C54067f0.C54083s0.CLICK_JSAPI_HEJI_ENTER_LIVE_ROOM;
            if (optInt == 1001) {
                C54067f0 f0Var = f151869h;
                f0Var.getClass();
                f0Var.f151432N = s0Var;
            }
        } catch (Exception e) {
            Log.m105920e("HABBYGE-MALI.HellLiveReport", "setEnterType error:" + e.getMessage());
        }
    }

    public final void dy0(int i) {
        f151869h.f151437S = i;
    }

    /* renamed from: fM */
    public void mo9611fM(RecyclerView recyclerView, C54067f0.C54078q qVar, String str, C0075i iVar, int i, long j, int i2) {
        String str2 = str;
        C87412m.m108594g(qVar, "actionType");
        C87412m.m108594g(str, "commentscene");
        C87412m.m108594g(iVar, "event");
        String rG = mo9617rG(str);
        f151870i.mo74734c(recyclerView, qVar, rG, iVar, i, j, i2);
    }

    public void g80(C54067f0.C0064m mVar, Map<String, String> map, String str) {
        Class cls = C10383h.class;
        C87412m.m108594g(mVar, "elementId");
        C87412m.m108594g(map, "eidUdfKVMap");
        FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new FinderBroadcastEidClickStruct();
        finderBroadcastEidClickStruct.f9725d = Util.nowMilliSecond();
        finderBroadcastEidClickStruct.mo1017x(f151869h.f151426H);
        finderBroadcastEidClickStruct.mo1012s("");
        finderBroadcastEidClickStruct.mo1011E("");
        finderBroadcastEidClickStruct.mo1008B("");
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderBroadcastEidClickStruct.mo1019z(Wb);
        if (str == null && (str = ((C10383h) C86312j.m106911c(cls)).mo10696E()) == null) {
            str = "";
        }
        finderBroadcastEidClickStruct.mo1014u(str);
        finderBroadcastEidClickStruct.mo1013t(((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK());
        String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
        if (S0 == null) {
            S0 = "";
        }
        finderBroadcastEidClickStruct.mo1010D(S0);
        finderBroadcastEidClickStruct.mo1007A("");
        finderBroadcastEidClickStruct.mo1018y("");
        finderBroadcastEidClickStruct.mo1015v(mVar.f248d);
        finderBroadcastEidClickStruct.mo1016w(xx0(map));
        finderBroadcastEidClickStruct.mo1009C(((C60606n) C86312j.m106911c(C60606n.class)).tx0());
        finderBroadcastEidClickStruct.mo86054n();
    }

    public C54067f0 getConfig() {
        return f151869h;
    }

    public void hg0(String str, String str2) {
        C87412m.m108594g(str, "event");
        C87412m.m108594g(str2, "paramsJson");
        LiveRecordRelatedStruct liveRecordRelatedStruct = new LiveRecordRelatedStruct();
        liveRecordRelatedStruct.f156449d = liveRecordRelatedStruct.mo86045b("Event", str, true);
        liveRecordRelatedStruct.f156450e = liveRecordRelatedStruct.mo86045b("Params", C112551y.m153814n(str2, ",", ";", false), true);
        liveRecordRelatedStruct.mo86054n();
    }

    public void lb0(C54067f0.C0066n nVar, Map<String, String> map, String str, String str2, String str3) {
        Class cls = C10383h.class;
        C87412m.m108594g(nVar, "elementId");
        C87412m.m108594g(map, "eidUdfKVMap");
        FinderBroadcastEidExposeStruct finderBroadcastEidExposeStruct = new FinderBroadcastEidExposeStruct();
        finderBroadcastEidExposeStruct.f9740d = Util.nowMilliSecond();
        finderBroadcastEidExposeStruct.f9741e = finderBroadcastEidExposeStruct.mo86045b("finderusername", f151869h.f151426H, true);
        finderBroadcastEidExposeStruct.f9742f = finderBroadcastEidExposeStruct.mo86045b("chnl_extra", "", true);
        finderBroadcastEidExposeStruct.f9743g = finderBroadcastEidExposeStruct.mo86045b("tab_id", "", true);
        finderBroadcastEidExposeStruct.f9744h = finderBroadcastEidExposeStruct.mo86045b("sub_tab_id", "", true);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderBroadcastEidExposeStruct.f9745i = finderBroadcastEidExposeStruct.mo86045b("sessionid", Wb, true);
        if (str == null && (str = ((C10383h) C86312j.m106911c(cls)).mo10696E()) == null) {
            str = "";
        }
        finderBroadcastEidExposeStruct.f9746j = finderBroadcastEidExposeStruct.mo86045b("contextid", str, true);
        if (str2 == null) {
            str2 = ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK();
        }
        finderBroadcastEidExposeStruct.f9747k = finderBroadcastEidExposeStruct.mo86045b("commentscene", str2, true);
        String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
        if (S0 == null) {
            S0 = "";
        }
        finderBroadcastEidExposeStruct.f9748l = finderBroadcastEidExposeStruct.mo86045b("TabContextID", S0, true);
        finderBroadcastEidExposeStruct.f9749m = finderBroadcastEidExposeStruct.mo86045b("SubTabContextID", "", true);
        finderBroadcastEidExposeStruct.f9750n = finderBroadcastEidExposeStruct.mo86045b("pg_udf_kv", "", true);
        finderBroadcastEidExposeStruct.f9751o = finderBroadcastEidExposeStruct.mo86045b("ref_commentscene", "", true);
        finderBroadcastEidExposeStruct.f9752p = finderBroadcastEidExposeStruct.mo86045b("eid", nVar.f334d, true);
        finderBroadcastEidExposeStruct.f9753q = finderBroadcastEidExposeStruct.mo86045b("eld_udf_kv", xx0(map), true);
        if (str3 == null) {
            str3 = "";
        }
        finderBroadcastEidExposeStruct.f9755s = finderBroadcastEidExposeStruct.mo86045b("session_buffer", str3, true);
        finderBroadcastEidExposeStruct.f9754r = finderBroadcastEidExposeStruct.mo86045b("switch_extra", ((C60606n) C86312j.m106911c(C60606n.class)).tx0(), true);
        finderBroadcastEidExposeStruct.mo86054n();
    }

    public void oj0(long j, long j2, String str, long j3, long j4, C54067f0.C54078q qVar, String str2, String str3, int i) {
        String str4 = str2;
        C87412m.m108594g(qVar, "actionType");
        C87412m.m108594g(str4, "commentscene");
        C87412m.m108594g(str3, "chnlExtra");
        if (C87412m.m108589b(str4, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY)) {
            str4 = "temp_12";
        } else if (C87412m.m108589b(str4, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN)) {
            str4 = "temp_11";
        } else if (C87412m.m108589b(str4, "7")) {
            str4 = "temp_14";
        } else if (!C87412m.m108589b(str4, "9")) {
            if (C87412m.m108589b(str4, "15")) {
                str4 = "temp_13";
            } else if (C87412m.m108589b(str4, PayuSecureEncrypt.ENCRYPT_VERSION_HASH)) {
                str4 = "temp_20";
            }
        }
        vx0(new C54061a0(j, j2, str == null ? "" : str, j3, j4, qVar, str4, 0, (String) null, (String) null, i, "", "", str3, C22657f.CTRL_INDEX, (C8480h) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r1.equals("102") == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (r1.equals("101") == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return "25";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r1.equals("999") == false) goto L_0x006b;
     */
    /* renamed from: rG */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo9617rG(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "commentscene"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "25"
            boolean r1 = gy3.C87412m.m108589b(r4, r0)
            if (r1 == 0) goto L_0x006d
            java.lang.Class<kq.h> r1 = p185kq.C10383h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kq.h r1 = (p185kq.C10383h) r1
            kq.l r1 = r1.mo10693DZ()
            z91.b r1 = (z91.C23462b) r1
            java.lang.String r1 = r1.mo36921e()
            if (r1 == 0) goto L_0x006d
            java.lang.Class<oq.e> r2 = p217oq.C62120e.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            oq.e r2 = (p217oq.C62120e) r2
            boolean r2 = r2.tu0(r1)
            if (r2 != 0) goto L_0x006d
            int r4 = r1.hashCode()
            switch(r4) {
                case 48626: goto L_0x0060;
                case 48627: goto L_0x0057;
                case 48690: goto L_0x004b;
                case 48780: goto L_0x0040;
                case 56601: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x006b
        L_0x0037:
            java.lang.String r4 = "999"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0069
            goto L_0x006b
        L_0x0040:
            java.lang.String r4 = "150"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x006b
            java.lang.String r4 = "15"
            goto L_0x006d
        L_0x004b:
            java.lang.String r4 = "123"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0054
            goto L_0x006b
        L_0x0054:
            java.lang.String r4 = "38"
            goto L_0x006d
        L_0x0057:
            java.lang.String r4 = "102"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0069
            goto L_0x006b
        L_0x0060:
            java.lang.String r4 = "101"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r4 = r0
            goto L_0x006d
        L_0x006b:
            java.lang.String r4 = "39"
        L_0x006d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54108o.mo9617rG(java.lang.String):java.lang.String");
    }

    public void tw0(long j, String str, String str2) {
        if (j == 2) {
            C54067f0 f0Var = f151869h;
            C54067f0.C0063l0 l0Var = f0Var.f151422D;
            C87412m.m108594g(l0Var, "<set-?>");
            f0Var.f151460h0 = l0Var;
        }
        FinderLiveStreamStruct finderLiveStreamStruct = new FinderLiveStreamStruct();
        C54067f0 f0Var2 = f151869h;
        finderLiveStreamStruct.f155694d = finderLiveStreamStruct.mo86045b("FinderUsrname", f0Var2.mo74756f(), true);
        finderLiveStreamStruct.f155695e = finderLiveStreamStruct.mo86045b("FinderWxAppInfo", f0Var2.mo74759i(), true);
        finderLiveStreamStruct.f155696f = f0Var2.mo74761k();
        finderLiveStreamStruct.f155697g = finderLiveStreamStruct.mo86045b("FinderSessionId", f0Var2.mo74758h(), true);
        long currentTimeMillis = System.currentTimeMillis();
        finderLiveStreamStruct.f155698h = currentTimeMillis;
        finderLiveStreamStruct.mo86046c("ActionTimeMs", currentTimeMillis);
        if (j == 15) {
            C54067f0.C54088z zVar = C54067f0.C54088z.OPEN;
            if (C87412m.m108589b(str, String.valueOf(1))) {
                f0Var2.f151477u = zVar;
            } else {
                C54067f0.C54088z zVar2 = C54067f0.C54088z.CLOSE;
                if (C87412m.m108589b(str, String.valueOf(2))) {
                    f0Var2.f151477u = zVar2;
                }
            }
        }
        finderLiveStreamStruct.f155699i = j;
        finderLiveStreamStruct.mo76264s(str != null ? C112551y.m153814n(str, ",", ";", false) : "");
        finderLiveStreamStruct.f155701k = (long) f0Var2.f151460h0.f162d;
        finderLiveStreamStruct.f155703m = finderLiveStreamStruct.mo86045b("Params", str2, true);
        finderLiveStreamStruct.mo86054n();
        Log.m105924i("HABBYGE-MALI.HellLiveReport", "report21017: finderUsrname=" + finderLiveStreamStruct.f155694d + ", finderWxAppInfo=" + finderLiveStreamStruct.f155695e + ", isPrivate=" + finderLiveStreamStruct.f155696f + ", finderSessionId=" + finderLiveStreamStruct.f155697g + ", actionTimeMs=" + finderLiveStreamStruct.f155698h + ", actionType=" + finderLiveStreamStruct.f155699i + ", sourceScene=" + finderLiveStreamStruct.f155701k + ", actionJson=" + finderLiveStreamStruct.f155700j + ", params=" + finderLiveStreamStruct.f155703m);
    }

    public final void vx0(C54061a0 a0Var) {
        C54061a0 a0Var2 = a0Var;
        Bx0(a0Var2.f151383d, a0Var2.f151386g);
        C54067f0 f0Var = f151869h;
        f0Var.mo74763m(a0Var2.f151385f, a0Var2.f151386g);
        C54059a aVar = f151870i;
        aVar.getClass();
        Class cls = C54108o.class;
        Class cls2 = C10383h.class;
        FinderLiveEntranceLogStruct finderLiveEntranceLogStruct = new FinderLiveEntranceLogStruct();
        ((C54108o) C86312j.m106911c(cls)).Cx0(finderLiveEntranceLogStruct, a0Var2.f151382c);
        finderLiveEntranceLogStruct.mo76259w(((C10383h) C86312j.m106911c(cls2)).mo10700XQ(a0Var2.f151380a));
        finderLiveEntranceLogStruct.f155516e = a0Var2.f151381b;
        finderLiveEntranceLogStruct.mo76260x(((C10383h) C86312j.m106911c(cls2)).mo10700XQ(a0Var2.f151381b));
        finderLiveEntranceLogStruct.f155520i = a0Var2.f151385f.f151625d;
        finderLiveEntranceLogStruct.mo76257u(a0Var2.f151386g);
        finderLiveEntranceLogStruct.f155522k = a0Var2.f151383d;
        finderLiveEntranceLogStruct.f155523l = 0;
        finderLiveEntranceLogStruct.f155524m = a0Var2.f151387h;
        finderLiveEntranceLogStruct.mo76262z(a0Var2.f151388i);
        finderLiveEntranceLogStruct.f155532u = finderLiveEntranceLogStruct.mo86045b("SnsFeedId", a0Var2.f151389j, true);
        finderLiveEntranceLogStruct.mo76258v(((C10383h) C86312j.m106911c(cls2)).mo10696E());
        finderLiveEntranceLogStruct.f155527p = a0Var2.f151384e;
        finderLiveEntranceLogStruct.mo76256t(((C10383h) C86312j.m106911c(cls2)).mo10698S0());
        finderLiveEntranceLogStruct.f155537z = finderLiveEntranceLogStruct.mo86045b("ClickSubTabContextId", a0Var2.f151392m, true);
        if (!C112551y.m153820t(a0Var2.f151386g, "temp_", false, 2, (Object) null)) {
            String str = finderLiveEntranceLogStruct.f155521j;
            String str2 = str == null || str.length() == 0 ? "0" : finderLiveEntranceLogStruct.f155521j;
            long j = a0Var2.f151380a;
            C87412m.m108593f(str2, "commentScene");
            finderLiveEntranceLogStruct.mo76261y(aVar.mo74732a(j, Long.parseLong(str2)));
        } else if (C87412m.m108589b(finderLiveEntranceLogStruct.f155521j, "temp_2")) {
            ((C54108o) C86312j.m106911c(cls)).getClass();
            finderLiveEntranceLogStruct.mo76261y(f0Var.f151423E);
        } else {
            finderLiveEntranceLogStruct.mo76261y(a0Var2.f151386g);
        }
        int ordinal = a0Var2.f151385f.ordinal();
        if (ordinal == 6 || ordinal == 10) {
            String str3 = a0Var2.f151393n;
            String str4 = str3.length() > 0 ? str3 : null;
            JSONObject jSONObject = str4 != null ? new JSONObject(str4) : new JSONObject("{}");
            long unsignedLong = Util.getUnsignedLong(jSONObject.optString("from_feed_id"), 0);
            Util.safeParseInt(jSONObject.optString("from_comment_scene"), 0);
            String b = C0773s0.f1815b.mo714a().mo713b(unsignedLong, a0Var2.f151393n);
            if (b == null) {
                b = "";
            }
            a0Var2.f151393n = b;
        }
        finderLiveEntranceLogStruct.mo76255s(C112551y.m153816p(a0Var2.f151393n, ",", ";", false, 4, (Object) null));
        if (C87412m.m108589b(finderLiveEntranceLogStruct.f155521j, "61") || C87412m.m108589b(((C61131i) C86312j.m106911c(C61131i.class)).mo86084Y7(), "123")) {
            finderLiveEntranceLogStruct.f155535x = finderLiveEntranceLogStruct.mo86045b("SnsSessionID", TextUtils.isEmpty(C64208c.f181965o) ? ((C23462b) ((C10383h) C86312j.m106911c(cls2)).mo10693DZ()).mo36920d() : C64208c.f181965o, true);
        }
        finderLiveEntranceLogStruct.mo86054n();
        String str5 = aVar.f151376a;
        Log.m105924i(str5, "report21053OnClick, struct=\nfeedId=" + finderLiveEntranceLogStruct.f155517f + "\nliveId=" + finderLiveEntranceLogStruct.f155531t + "\nuserName=" + finderLiveEntranceLogStruct.f155515d + "\nisPrivate=" + finderLiveEntranceLogStruct.f155529r + "\nsessionID=" + finderLiveEntranceLogStruct.f155518g + "\nactionTS=" + finderLiveEntranceLogStruct.f155519h + "\naction=" + finderLiveEntranceLogStruct.f155520i + "\ncommentScene=" + finderLiveEntranceLogStruct.f155521j + "\nindex=" + finderLiveEntranceLogStruct.f155522k + "\nenterStatus=" + finderLiveEntranceLogStruct.f155523l + "\ncontextId=" + finderLiveEntranceLogStruct.f155526o + "\nonlineNum=" + finderLiveEntranceLogStruct.f155527p + "\nclickTabContextId=" + finderLiveEntranceLogStruct.f155528q + "\nclickSubTabContextId=" + finderLiveEntranceLogStruct.f155537z + "\nchnl_extra=" + finderLiveEntranceLogStruct.f155536y + "\nsessionBuffer=" + finderLiveEntranceLogStruct.f155530s + "\nenterSessionId=" + finderLiveEntranceLogStruct.f155533v + "\nenterIconType=" + finderLiveEntranceLogStruct.f155534w + "\nsnsSessionID=" + finderLiveEntranceLogStruct.f155535x + "\nshareType=" + finderLiveEntranceLogStruct.f155524m + "\nshareUserName=" + finderLiveEntranceLogStruct.f155525n + "\nsnsFeedId=" + finderLiveEntranceLogStruct.f155532u);
    }

    /* renamed from: wD */
    public void mo9619wD(C0073g0 g0Var, String str, String str2) {
        C87412m.m108594g(g0Var, "actionType");
        if (C62042e.f176370a.mo87027N0()) {
            long currentTimeMillis = System.currentTimeMillis();
            int ordinal = g0Var.ordinal();
            if (ordinal == 0) {
                C54067f0 f0Var = f151869h;
                f0Var.f151480x = currentTimeMillis;
                f0Var.f151443Y.f151827d = currentTimeMillis;
            } else if (ordinal != 2) {
                if (ordinal != 8) {
                    if (ordinal != 18) {
                        if (ordinal == 19) {
                            if (C87412m.m108589b(str, String.valueOf(1))) {
                                this.f151875f = true;
                            } else if (C87412m.m108589b(str, String.valueOf(3))) {
                                this.f151875f = false;
                            }
                        }
                    } else if (C87412m.m108589b(str, String.valueOf(2))) {
                        C54067f0 f0Var2 = f151869h;
                        C54067f0.C54086x xVar = C54067f0.C54086x.YES;
                        f0Var2.getClass();
                        f0Var2.f151479w = xVar;
                    }
                } else if (f151869h.f151442X <= 0) {
                    return;
                }
            } else if (C87412m.m108589b(str, String.valueOf(1))) {
                C54067f0 f0Var3 = f151869h;
                f0Var3.f151455f = false;
                f0Var3.f151457g = false;
            }
            FinderLiveActionStruct finderLiveActionStruct = new FinderLiveActionStruct();
            C54067f0 f0Var4 = f151869h;
            finderLiveActionStruct.f155421d = finderLiveActionStruct.mo86045b("FinderUsrname", f0Var4.mo74756f(), true);
            finderLiveActionStruct.f155422e = finderLiveActionStruct.mo86045b("FinderWxAppInfo", f0Var4.mo74759i(), true);
            finderLiveActionStruct.f155423f = f0Var4.mo74761k();
            finderLiveActionStruct.f155424g = finderLiveActionStruct.mo86045b("FinderSessionId", f0Var4.mo74758h(), true);
            finderLiveActionStruct.f155425h = currentTimeMillis;
            finderLiveActionStruct.mo86046c("ActionTimeMs", currentTimeMillis);
            finderLiveActionStruct.f155426i = finderLiveActionStruct.mo86045b("LiveId", f0Var4.mo74753c(), true);
            finderLiveActionStruct.f155427j = finderLiveActionStruct.mo86045b("FeedId", f0Var4.mo74752b(), true);
            finderLiveActionStruct.f155428k = finderLiveActionStruct.mo86045b("Description", TextUtils.isEmpty(f0Var4.f151443Y.f151826c) ? f0Var4.mo74754d() : f0Var4.f151443Y.f151826c, true);
            finderLiveActionStruct.f155429l = f0Var4.f151442X;
            finderLiveActionStruct.f155430m = f0Var4.f151440V;
            finderLiveActionStruct.f155431n = f0Var4.f151441W;
            finderLiveActionStruct.f155432o = (long) g0Var.f448d;
            int ordinal2 = g0Var.ordinal();
            String str3 = "";
            if (ordinal2 == 13) {
                finderLiveActionStruct.f155433p = finderLiveActionStruct.mo86045b("ActionResult", Ax0(), true);
            } else if (ordinal2 != 14) {
                finderLiveActionStruct.f155433p = finderLiveActionStruct.mo86045b("ActionResult", str != null ? C112551y.m153814n(str, ",", ";", false) : str3, true);
            } else {
                finderLiveActionStruct.f155433p = finderLiveActionStruct.mo86045b("ActionResult", Dx0(), true);
            }
            finderLiveActionStruct.f155434q = (long) f0Var4.f151460h0.f162d;
            if (str2 != null) {
                str3 = C112551y.m153814n(str2, ",", ";", false);
            }
            finderLiveActionStruct.f155435r = finderLiveActionStruct.mo86045b("ChnlExtra", str3, true);
            finderLiveActionStruct.mo86054n();
            Log.m105924i("HABBYGE-MALI.HellLiveReport", "report21054: finderUsrname=" + finderLiveActionStruct.f155421d + ", finderWxAppInfo=" + finderLiveActionStruct.f155422e + ", isPrivate=" + finderLiveActionStruct.f155423f + ", finderSessionId=" + finderLiveActionStruct.f155424g + ", actionTimeMs=" + finderLiveActionStruct.f155425h + ", liveId=" + finderLiveActionStruct.f155426i + ", feedId=" + finderLiveActionStruct.f155427j + ", description=" + finderLiveActionStruct.f155428k + ", sourceScene=" + finderLiveActionStruct.f155434q + ", liveTime=" + finderLiveActionStruct.f155429l + ", likeCount=" + finderLiveActionStruct.f155430m + ", onlineCount=" + finderLiveActionStruct.f155431n + ", actionType=" + finderLiveActionStruct.f155432o + ", actionResult=" + finderLiveActionStruct.f155433p + ", chnlExtra=" + finderLiveActionStruct.f155435r);
        }
    }

    public final void wx0(C54064b0 b0Var) {
        C54064b0 b0Var2 = b0Var;
        C54067f0 f0Var = f151869h;
        f0Var.f151449c = false;
        f0Var.f151445a = "";
        C54059a aVar = f151870i;
        aVar.getClass();
        Class cls = C54108o.class;
        Class cls2 = C10383h.class;
        C87412m.m108594g(b0Var2, "enterData");
        FinderLiveEntranceLogStruct finderLiveEntranceLogStruct = new FinderLiveEntranceLogStruct();
        ((C54108o) C86312j.m106911c(cls)).Cx0(finderLiveEntranceLogStruct, b0Var2.f151401c);
        finderLiveEntranceLogStruct.mo76259w(((C10383h) C86312j.m106911c(cls2)).mo10700XQ(b0Var2.f151399a));
        finderLiveEntranceLogStruct.f155516e = b0Var2.f151400b;
        finderLiveEntranceLogStruct.mo76260x(((C10383h) C86312j.m106911c(cls2)).mo10700XQ(b0Var2.f151400b));
        finderLiveEntranceLogStruct.f155520i = b0Var2.f151404f.f151625d;
        finderLiveEntranceLogStruct.mo76257u(b0Var2.f151405g);
        finderLiveEntranceLogStruct.f155522k = b0Var2.f151402d;
        finderLiveEntranceLogStruct.f155523l = b0Var2.f151406h;
        finderLiveEntranceLogStruct.f155524m = b0Var2.f151407i;
        finderLiveEntranceLogStruct.mo76262z(b0Var2.f151408j);
        finderLiveEntranceLogStruct.f155532u = finderLiveEntranceLogStruct.mo86045b("SnsFeedId", b0Var2.f151409k, true);
        finderLiveEntranceLogStruct.mo76258v(((C10383h) C86312j.m106911c(cls2)).mo10696E());
        finderLiveEntranceLogStruct.f155527p = b0Var2.f151403e;
        finderLiveEntranceLogStruct.mo76256t(((C10383h) C86312j.m106911c(cls2)).mo10698S0());
        finderLiveEntranceLogStruct.f155537z = finderLiveEntranceLogStruct.mo86045b("ClickSubTabContextId", b0Var2.f151414p, true);
        if (C112551y.m153820t(b0Var2.f151405g, "temp_", false, 2, (Object) null)) {
            finderLiveEntranceLogStruct.mo76261y(b0Var2.f151412n);
            if (TextUtils.isEmpty(finderLiveEntranceLogStruct.f155530s) && C87412m.m108589b(finderLiveEntranceLogStruct.f155521j, "temp_2")) {
                ((C54108o) C86312j.m106911c(cls)).getClass();
                finderLiveEntranceLogStruct.mo76261y(f0Var.f151423E);
            }
        } else {
            long j = b0Var2.f151399a;
            String str = finderLiveEntranceLogStruct.f155521j;
            C87412m.m108593f(str, "struct.commentScene");
            finderLiveEntranceLogStruct.mo76261y(aVar.mo74732a(j, Long.parseLong(str)));
        }
        if (TextUtils.isEmpty(finderLiveEntranceLogStruct.f155530s)) {
            finderLiveEntranceLogStruct.mo76261y(b0Var2.f151412n);
        }
        finderLiveEntranceLogStruct.f155533v = b0Var2.f151410l;
        finderLiveEntranceLogStruct.mo76255s(C112551y.m153816p(b0Var2.f151415q, ",", ";", false, 4, (Object) null));
        ((C54108o) C86312j.m106911c(cls)).getClass();
        finderLiveEntranceLogStruct.f155534w = f0Var.mo74755e(finderLiveEntranceLogStruct.f155521j, (long) b0Var2.f151411m.f151689d);
        if (C87412m.m108589b(finderLiveEntranceLogStruct.f155521j, "61") || C87412m.m108589b(((C61131i) C86312j.m106911c(C61131i.class)).mo86084Y7(), "123")) {
            finderLiveEntranceLogStruct.f155535x = finderLiveEntranceLogStruct.mo86045b("SnsSessionID", TextUtils.isEmpty(C64208c.f181965o) ? ((C23462b) ((C10383h) C86312j.m106911c(cls2)).mo10693DZ()).mo36920d() : C64208c.f181965o, true);
        }
        finderLiveEntranceLogStruct.mo86054n();
        String str2 = aVar.f151376a;
        Log.m105924i(str2, "report21053OnEnter, struct=\nfeedId=" + finderLiveEntranceLogStruct.f155517f + "\nliveId=" + finderLiveEntranceLogStruct.f155531t + "\nuserName=" + finderLiveEntranceLogStruct.f155515d + "\nisPrivate=" + finderLiveEntranceLogStruct.f155529r + "\nsessionID=" + finderLiveEntranceLogStruct.f155518g + "\nactionTS=" + finderLiveEntranceLogStruct.f155519h + "\naction=" + finderLiveEntranceLogStruct.f155520i + "\ncommentScene=" + finderLiveEntranceLogStruct.f155521j + "\nindex=" + finderLiveEntranceLogStruct.f155522k + "\nenterStatus=" + finderLiveEntranceLogStruct.f155523l + "\ncontextId=" + finderLiveEntranceLogStruct.f155526o + "\nonlineNum=" + finderLiveEntranceLogStruct.f155527p + "\nclickTabContextId=" + finderLiveEntranceLogStruct.f155528q + "\nclickSubTabContextId=" + finderLiveEntranceLogStruct.f155537z + "\nsessionBuffer=" + finderLiveEntranceLogStruct.f155530s + "\nshareType=" + finderLiveEntranceLogStruct.f155524m + "\nshareUserName=" + finderLiveEntranceLogStruct.f155525n + "\nenterSessionId=" + finderLiveEntranceLogStruct.f155533v + "\nenterIconType=" + finderLiveEntranceLogStruct.f155534w + "\nsnsSessionID=" + finderLiveEntranceLogStruct.f155535x + "\nsnsFeedId=" + finderLiveEntranceLogStruct.f155532u);
    }

    /* renamed from: xL */
    public void mo9620xL(JSONObject jSONObject) {
        if (jSONObject != null) {
            f151869h.f151436R = jSONObject;
        }
    }

    public final String xx0(Map<String, String> map) {
        CharSequence charSequence = map.get("liveId");
        boolean z = true;
        if (charSequence == null || charSequence.length() == 0) {
            map.put("liveId", f151869h.f151427I);
        }
        CharSequence charSequence2 = map.get("feedId");
        if (charSequence2 == null || charSequence2.length() == 0) {
            map.put("feedId", f151869h.f151428J);
        }
        CharSequence charSequence3 = map.get("share_id");
        if (charSequence3 == null || charSequence3.length() == 0) {
            map.put("share_id", f151869h.f151429K);
        }
        C0654b bVar = (C0654b) FinderLiveService.f159376d.mo77630e(C0654b.class);
        if (bVar == null || !bVar.f1544f) {
            z = false;
        }
        map.put("is_mmbiz_live", z ? "1" : "0");
        String jSONObject = new JSONObject(C90364q0.m113154m(map)).toString();
        C87412m.m108593f(jSONObject, "JSONObject(eidUdfKVMap.a…              .toString()");
        return C112551y.m153814n(jSONObject, ",", ";", false);
    }

    public final void yx0() {
        long currentTimeMillis = System.currentTimeMillis();
        for (int size = f151869h.f151474r.size() - 1; -1 < size; size--) {
            C54067f0 f0Var = f151869h;
            C117878c<String, Long, Boolean> cVar = f0Var.f151474r.get(size);
            C87412m.m108593f(cVar, "mConfig.gAnchorLinkMicTimeList[i]");
            C117878c cVar2 = cVar;
            Object a = cVar2.mo182596a(1);
            C87412m.m108593f(a, "tuple.`$2`()");
            if (((Number) a).longValue() > 0 && C87412m.m108589b(cVar2.mo182596a(2), Boolean.FALSE)) {
                Object a2 = cVar2.mo182596a(1);
                C87412m.m108593f(a2, "tuple.`$2`()");
                long longValue = (currentTimeMillis - ((Number) a2).longValue()) / 1000;
                if (longValue >= 0) {
                    f0Var.f151474r.set(size, C117882j.m166285d(cVar2.mo182596a(0), Long.valueOf(longValue), Boolean.TRUE));
                    return;
                }
            }
        }
    }

    public final void zx0(C54067f0.C54068a0 a0Var) {
        long currentTimeMillis = System.currentTimeMillis();
        for (int size = f151869h.f151472p.size() - 1; -1 < size; size--) {
            C54067f0 f0Var = f151869h;
            C117878c<C54067f0.C54068a0, Long, Boolean> cVar = f0Var.f151472p.get(size);
            C87412m.m108593f(cVar, "mConfig.gLinkMicTimeList[i]");
            C117878c cVar2 = cVar;
            if (cVar2.mo182596a(0) == a0Var) {
                Object a = cVar2.mo182596a(1);
                C87412m.m108593f(a, "tuple.`$2`()");
                if (((Number) a).longValue() > 0 && C87412m.m108589b(cVar2.mo182596a(2), Boolean.FALSE)) {
                    Object a2 = cVar2.mo182596a(1);
                    C87412m.m108593f(a2, "tuple.`$2`()");
                    long longValue = (currentTimeMillis - ((Number) a2).longValue()) / 1000;
                    if (longValue >= 0) {
                        f0Var.f151472p.set(size, C117882j.m166285d(a0Var, Long.valueOf(longValue), Boolean.TRUE));
                        return;
                    }
                }
            }
        }
    }
}
