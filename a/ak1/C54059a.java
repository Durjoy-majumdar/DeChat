package ak1;

import ak1.C54067f0;
import ak1.C54095l;
import android.text.TextUtils;
import cl1.C55001u;
import cm1.C0740i2;
import cm1.C0773s0;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import op3.C117878c;
import org.json.JSONObject;
import p185kq.C10383h;
import p185kq.C61131i;
import t91.C64208c;
import te3.C49712hj1;
import tf0.C64916p1;
import z04.C112551y;
import z91.C23462b;

/* renamed from: ak1.a */
public final class C54059a {

    /* renamed from: a */
    public final String f151376a = "HABBYGE-MALI.Audience21053Report";

    /* renamed from: b */
    public final C54091j f151377b;

    /* renamed from: c */
    public final C54092k f151378c;

    /* renamed from: ak1.a$a */
    public static final class C54060a implements C54065c0 {

        /* renamed from: a */
        public final /* synthetic */ C54059a f151379a;

        public C54060a(C54059a aVar) {
            this.f151379a = aVar;
        }

        /* renamed from: a */
        public void mo74738a(C54098m mVar, boolean z) {
            C87412m.m108594g(mVar, "feed");
            if (mVar.f151822f) {
                C54059a aVar = this.f151379a;
                aVar.getClass();
                Class cls = C54108o.class;
                Class cls2 = C10383h.class;
                FinderLiveEntranceLogStruct finderLiveEntranceLogStruct = new FinderLiveEntranceLogStruct();
                ((C54108o) C86312j.m106911c(cls)).Cx0(finderLiveEntranceLogStruct, mVar.f151817a.f1766d.getUsername());
                finderLiveEntranceLogStruct.mo76259w(mVar.f151819c);
                finderLiveEntranceLogStruct.f155516e = 0;
                finderLiveEntranceLogStruct.mo76260x("0");
                finderLiveEntranceLogStruct.f155520i = mVar.f151820d.f151625d;
                finderLiveEntranceLogStruct.mo76257u(mVar.f151821e);
                finderLiveEntranceLogStruct.f155522k = (long) mVar.f151818b;
                finderLiveEntranceLogStruct.f155523l = 0;
                finderLiveEntranceLogStruct.f155524m = 0;
                finderLiveEntranceLogStruct.mo76262z("");
                finderLiveEntranceLogStruct.mo76258v(((C10383h) C86312j.m106911c(cls2)).mo10696E());
                finderLiveEntranceLogStruct.f155527p = -1;
                finderLiveEntranceLogStruct.mo76256t(((C10383h) C86312j.m106911c(cls2)).mo10698S0());
                if (C112551y.m153820t(mVar.f151821e, "temp_", false, 2, (Object) null)) {
                    if (C87412m.m108589b(finderLiveEntranceLogStruct.f155521j, "temp_2")) {
                        ((C54108o) C86312j.m106911c(cls)).getClass();
                        finderLiveEntranceLogStruct.mo76261y(C54108o.f151869h.f151423E);
                    } else {
                        finderLiveEntranceLogStruct.mo76261y(mVar.f151821e);
                    }
                } else if (((C10383h) C86312j.m106911c(cls2)).mo10702vz(mVar.f151819c)) {
                    finderLiveEntranceLogStruct.mo76261y(aVar.mo74732a(Util.getLong(mVar.f151819c, -1), Long.parseLong(mVar.f151821e)));
                } else {
                    finderLiveEntranceLogStruct.mo76261y(mVar.f151821e);
                }
                finderLiveEntranceLogStruct.mo86054n();
                String str = aVar.f151376a;
                Log.m105924i(str, "report21053OnExposure, item, struct:\nnickName=" + mVar.f151823g + "\nuserName=" + finderLiveEntranceLogStruct.f155515d + "\nfeedID=" + finderLiveEntranceLogStruct.f155517f + "\nliveIDStr=" + finderLiveEntranceLogStruct.f155531t + "\nactionTS=" + finderLiveEntranceLogStruct.f155519h + "\naction=" + finderLiveEntranceLogStruct.f155520i + "\ncommentScene=" + finderLiveEntranceLogStruct.f155521j + "\nindex=" + finderLiveEntranceLogStruct.f155522k + "\nenterStatus=" + finderLiveEntranceLogStruct.f155523l + "\nshareType=" + finderLiveEntranceLogStruct.f155524m + "\nshareUserName=" + finderLiveEntranceLogStruct.f155525n + "\ncontextId=" + finderLiveEntranceLogStruct.f155526o + "\nonlineNum=" + finderLiveEntranceLogStruct.f155527p + "\nclickTabContextId=" + finderLiveEntranceLogStruct.f155528q + "\nisPrivate=" + finderLiveEntranceLogStruct.f155529r + "\nsessionBuffer=" + finderLiveEntranceLogStruct.f155530s + "\nsnsFeedId=" + finderLiveEntranceLogStruct.f155532u + "\nsessionID=" + finderLiveEntranceLogStruct.f155518g);
            }
        }

        /* renamed from: b */
        public void mo74739b(C54100n nVar) {
            C87412m.m108594g(nVar, "feed");
        }

        /* renamed from: c */
        public void mo74740c(C54100n nVar, boolean z) {
            String str;
            C87412m.m108594g(nVar, "feed");
            if (nVar.f151854f) {
                C54059a aVar = this.f151379a;
                aVar.getClass();
                Class cls = C54108o.class;
                Class cls2 = C10383h.class;
                FinderLiveEntranceLogStruct finderLiveEntranceLogStruct = new FinderLiveEntranceLogStruct();
                C54108o oVar = (C54108o) C86312j.m106911c(cls);
                FinderContact finderContact = nVar.f151849a.f131162d;
                if (finderContact == null || (str = finderContact.username) == null) {
                    str = "";
                }
                oVar.Cx0(finderLiveEntranceLogStruct, str);
                finderLiveEntranceLogStruct.mo76259w(nVar.f151851c);
                finderLiveEntranceLogStruct.f155516e = 0;
                finderLiveEntranceLogStruct.mo76260x("0");
                finderLiveEntranceLogStruct.f155520i = nVar.f151852d.f151625d;
                finderLiveEntranceLogStruct.mo76257u(nVar.f151853e);
                finderLiveEntranceLogStruct.f155522k = (long) nVar.f151850b;
                finderLiveEntranceLogStruct.f155523l = 0;
                finderLiveEntranceLogStruct.f155524m = 0;
                finderLiveEntranceLogStruct.mo76262z("");
                finderLiveEntranceLogStruct.mo76258v(((C10383h) C86312j.m106911c(cls2)).mo10696E());
                finderLiveEntranceLogStruct.f155527p = -1;
                finderLiveEntranceLogStruct.mo76256t(((C10383h) C86312j.m106911c(cls2)).mo10698S0());
                if (C112551y.m153820t(nVar.f151853e, "temp_", false, 2, (Object) null)) {
                    if (C87412m.m108589b(finderLiveEntranceLogStruct.f155521j, "temp_2")) {
                        ((C54108o) C86312j.m106911c(cls)).getClass();
                        finderLiveEntranceLogStruct.mo76261y(C54108o.f151869h.f151423E);
                    } else {
                        finderLiveEntranceLogStruct.mo76261y(nVar.f151853e);
                    }
                } else if (((C10383h) C86312j.m106911c(cls2)).mo10702vz(nVar.f151851c)) {
                    long j = Util.getLong(nVar.f151851c, -1);
                    String str2 = finderLiveEntranceLogStruct.f155521j;
                    C87412m.m108593f(str2, "struct.commentScene");
                    finderLiveEntranceLogStruct.mo76261y(aVar.mo74732a(j, Long.parseLong(str2)));
                } else {
                    finderLiveEntranceLogStruct.mo76261y(nVar.f151853e);
                }
                finderLiveEntranceLogStruct.mo86054n();
                String str3 = aVar.f151376a;
                Log.m105924i(str3, "report21053OnExposure, mixsearch, struct:\nnickName=" + nVar.f151855g + "\nuserName=" + finderLiveEntranceLogStruct.f155515d + "\nfeedID=" + finderLiveEntranceLogStruct.f155517f + "\nliveIDStr=" + finderLiveEntranceLogStruct.f155531t + "\nactionTS=" + finderLiveEntranceLogStruct.f155519h + "\naction=" + finderLiveEntranceLogStruct.f155520i + "\ncommentScene=" + finderLiveEntranceLogStruct.f155521j + "\nindex=" + finderLiveEntranceLogStruct.f155522k + "\nenterStatus=" + finderLiveEntranceLogStruct.f155523l + "\nshareType=" + finderLiveEntranceLogStruct.f155524m + "\nshareUserName=" + finderLiveEntranceLogStruct.f155525n + "\ncontextId=" + finderLiveEntranceLogStruct.f155526o + "\nonlineNum=" + finderLiveEntranceLogStruct.f155527p + "\nclickTabContextId=" + finderLiveEntranceLogStruct.f155528q + "\nisPrivate=" + finderLiveEntranceLogStruct.f155529r + "\nsessionBuffer=" + finderLiveEntranceLogStruct.f155530s + "\nsnsFeedId=" + finderLiveEntranceLogStruct.f155532u + "\nsessionID=" + finderLiveEntranceLogStruct.f155518g);
            }
        }

        /* renamed from: d */
        public void mo74741d(C54098m mVar) {
            C87412m.m108594g(mVar, "feed");
        }

        /* renamed from: e */
        public void mo74742e(C54095l lVar) {
            C87412m.m108594g(lVar, "liveFeed");
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo74743f(ak1.C54095l r6, boolean r7) {
            /*
                r5 = this;
                java.lang.String r0 = "liveFeed"
                gy3.C87412m.m108594g(r6, r0)
                cm1.i2 r0 = r6.f151789a
                boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed"
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x001e
                er1.j4 r1 = er1.C58739j4.f168176a
                gy3.C87412m.m108592e(r0, r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
                boolean r0 = r1.mo83686O(r0)
                if (r0 == 0) goto L_0x001e
                r0 = 1
                goto L_0x001f
            L_0x001e:
                r0 = 0
            L_0x001f:
                cm1.i2 r1 = r6.f151789a
                boolean r1 = r1 instanceof cm1.C0727e0
                if (r1 == 0) goto L_0x0029
                ak1.f0$q r1 = ak1.C54067f0.C54078q.LIVE_EXPOSE_MORE_LIVE
                r6.f151795g = r1
            L_0x0029:
                boolean r1 = r6.f151801m
                if (r1 != 0) goto L_0x003c
                if (r0 != 0) goto L_0x003c
                ak1.l$b r0 = r6.f151799k
                ak1.l$b r1 = ak1.C54095l.C0078b.ING
                if (r0 == r1) goto L_0x003c
                boolean r0 = r6.f151800l
                if (r0 == 0) goto L_0x003a
                goto L_0x003c
            L_0x003a:
                r0 = 0
                goto L_0x003d
            L_0x003c:
                r0 = 1
            L_0x003d:
                if (r0 != 0) goto L_0x005d
                if (r7 == 0) goto L_0x005d
                cm1.i2 r7 = r6.f151789a
                boolean r1 = r7 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r1 == 0) goto L_0x005d
                gy3.C87412m.m108592e(r7, r2)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
                fe1.q r7 = r7.mo3507l()
                if (r7 == 0) goto L_0x0057
                int r7 = r7.field_liveStatus
                if (r7 != r3) goto L_0x0057
                goto L_0x0058
            L_0x0057:
                r3 = 0
            L_0x0058:
                ak1.f0$q r7 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR
                r6.f151795g = r7
                r0 = r3
            L_0x005d:
                if (r0 == 0) goto L_0x0064
                ak1.a r7 = r5.f151379a
                r7.mo74736e(r6)
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ak1.C54059a.C54060a.mo74743f(ak1.l, boolean):void");
        }
    }

    public C54059a() {
        C54060a aVar = new C54060a(this);
        this.f151377b = new C54091j(aVar);
        this.f151378c = new C54092k(aVar);
    }

    /* renamed from: a */
    public final String mo74732a(long j, long j2) {
        String Cu = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76655Cu(j, (int) j2);
        if (Cu == null) {
            Cu = "";
        }
        if (Util.isNullOrNil(Cu)) {
            C45795b.C32059a aVar = C45795b.f123697j;
            C45795b bVar = C45795b.f123698n;
            Cu = String.valueOf(bVar != null ? ((C55001u) bVar.mo71262a(C55001u.class)).f154424u : null);
            if (Util.isNullOrNil(Cu)) {
                Cu = ((C54116w) C86312j.m106911c(C54116w.class)).f151954s;
            }
        }
        return C112551y.m153816p(Cu, ",", ";", false, 4, (Object) null);
    }

    /* renamed from: b */
    public final String mo74733b(String str, String str2) {
        int i = 1;
        if (str2.length() == 0) {
            return str;
        }
        try {
            JSONObject jSONObject = str.length() == 0 ? new JSONObject() : new JSONObject(C112551y.m153814n(str, ";", ",", false));
            int i2 = C72996z1.m85820U5(str2) ? 2 : 1;
            if (!C45628s0.m50749N(str2)) {
                i = 0;
            }
            jSONObject.put("session_type", i2);
            jSONObject.put("is_enterprise", i);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "json.toString()");
            return C112551y.m153814n(jSONObject2, ",", ";", false);
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v7, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: androidx.recyclerview.widget.LinearLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: androidx.recyclerview.widget.LinearLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v10, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: androidx.recyclerview.widget.LinearLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v53, resolved type: androidx.recyclerview.widget.LinearLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v13, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v16, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v19, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v22, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v92, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v104, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v105, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v25, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v107, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: com.tencent.mm.plugin.finder.model.BaseFinderFeed} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v28, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v29, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v30, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v31, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v32, resolved type: com.tencent.mm.view.recyclerview.WxRecyclerAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v33, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v34, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v35, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v36, resolved type: androidx.recyclerview.widget.StaggeredGridLayoutManager} */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Object, ht1.l1] */
    /* JADX WARNING: type inference failed for: r34v6, types: [ht1.l1] */
    /* JADX WARNING: type inference failed for: r3v36 */
    /* JADX WARNING: type inference failed for: r3v37, types: [androidx.recyclerview.widget.LinearLayoutManager] */
    /* JADX WARNING: type inference failed for: r3v39 */
    /* JADX WARNING: type inference failed for: r34v9, types: [androidx.recyclerview.widget.LinearLayoutManager] */
    /* JADX WARNING: type inference failed for: r3v47 */
    /* JADX WARNING: type inference failed for: r3v48, types: [androidx.recyclerview.widget.LinearLayoutManager] */
    /* JADX WARNING: type inference failed for: r3v50 */
    /* JADX WARNING: type inference failed for: r34v12, types: [androidx.recyclerview.widget.LinearLayoutManager] */
    /* JADX WARNING: type inference failed for: r2v81, types: [androidx.recyclerview.widget.RecyclerView$e] */
    /* JADX WARNING: type inference failed for: r2v88, types: [java.lang.Object, ht1.o5] */
    /* JADX WARNING: type inference failed for: r34v18, types: [ht1.o5] */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x073a, code lost:
        if (r3 >= 2) goto L_0x0745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fc, code lost:
        if (r3 >= 2) goto L_0x0107;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x088d A[LOOP:7: B:400:0x075a->B:425:0x088d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0262 A[EDGE_INSN: B:459:0x0262->B:84:0x0262 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x08ae A[EDGE_INSN: B:483:0x08ae->B:427:0x08ae ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0241 A[LOOP:0: B:61:0x011c->B:82:0x0241, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74734c(androidx.recyclerview.widget.RecyclerView r56, ak1.C54067f0.C54078q r57, java.lang.String r58, ak1.C0075i r59, int r60, long r61, int r63) {
        /*
            r55 = this;
            r0 = r55
            r14 = r57
            r11 = r58
            r1 = r59
            ak1.l$b r31 = ak1.C54095l.C0078b.UNDEFINE
            java.lang.Class<kq.h> r32 = p185kq.C10383h.class
            java.lang.String r2 = "actionType"
            gy3.C87412m.m108594g(r14, r2)
            java.lang.String r2 = "commentscene"
            gy3.C87412m.m108594g(r11, r2)
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = "94"
            boolean r2 = gy3.C87412m.m108589b(r11, r2)
            r10 = 1
            if (r2 == 0) goto L_0x0026
            r2 = 1
            goto L_0x002c
        L_0x0026:
            java.lang.String r2 = "80"
            boolean r2 = gy3.C87412m.m108589b(r11, r2)
        L_0x002c:
            if (r2 == 0) goto L_0x0030
            r2 = 1
            goto L_0x0037
        L_0x0030:
            java.lang.String r2 = "temp_10"
            boolean r2 = gy3.C87412m.m108589b(r11, r2)
        L_0x0037:
            java.lang.String r3 = "temp_5"
            if (r2 == 0) goto L_0x003e
            r2 = 1
            goto L_0x0042
        L_0x003e:
            boolean r2 = gy3.C87412m.m108589b(r11, r3)
        L_0x0042:
            if (r2 == 0) goto L_0x0046
            r2 = 1
            goto L_0x004c
        L_0x0046:
            java.lang.String r2 = "26"
            boolean r2 = gy3.C87412m.m108589b(r11, r2)
        L_0x004c:
            java.lang.String r4 = "temp_4"
            if (r2 == 0) goto L_0x0053
            r2 = 1
            goto L_0x0057
        L_0x0053:
            boolean r2 = gy3.C87412m.m108589b(r11, r4)
        L_0x0057:
            if (r2 == 0) goto L_0x005b
            r2 = 1
            goto L_0x0061
        L_0x005b:
            java.lang.String r2 = "23"
            boolean r2 = gy3.C87412m.m108589b(r11, r2)
        L_0x0061:
            if (r2 == 0) goto L_0x0065
            r2 = 1
            goto L_0x006b
        L_0x0065:
            java.lang.String r2 = "15"
            boolean r2 = gy3.C87412m.m108589b(r11, r2)
        L_0x006b:
            java.lang.String r6 = "liveIdTuple3.`$2`()"
            java.lang.String r7 = "liveIdTuple3.`$1`()"
            java.lang.String r33 = ""
            java.lang.String r5 = "feedId"
            java.lang.String r15 = "iterator.next()"
            java.lang.String r13 = "hellFeedPair.value"
            r34 = 0
            if (r2 == 0) goto L_0x04a3
            ak1.j r2 = r0.f151377b
            r2.getClass()
            r12 = r60
            r2.f151762f = r12
            r8 = r61
            r2.f151763g = r8
            r8 = r63
            r2.f151764h = r8
            int r8 = r59.ordinal()
            if (r8 == r10) goto L_0x0418
            r9 = 2
            if (r8 == r9) goto L_0x0317
            r9 = 3
            if (r8 == r9) goto L_0x02b2
            r9 = 4
            if (r8 == r9) goto L_0x02ae
            r9 = 7
            if (r8 == r9) goto L_0x00c1
            r3 = 8
            if (r8 == r3) goto L_0x00ba
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "run, else-case, event="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "HABBYGE-MALI.HellFeedExposure"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            goto L_0x095b
        L_0x00ba:
            java.util.HashMap<java.lang.String, ak1.l> r1 = r2.f151767k
            r1.clear()
            goto L_0x095b
        L_0x00c1:
            if (r56 != 0) goto L_0x00c5
            goto L_0x095b
        L_0x00c5:
            androidx.recyclerview.widget.RecyclerView$e r1 = r56.getAdapter()
            boolean r3 = r1 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r3 == 0) goto L_0x00d0
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r1
            goto L_0x00d2
        L_0x00d0:
            r1 = r34
        L_0x00d2:
            if (r1 != 0) goto L_0x00d6
            goto L_0x095b
        L_0x00d6:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r56.getLayoutManager()
            boolean r4 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x00e6
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            goto L_0x00e8
        L_0x00e6:
            r3 = r34
        L_0x00e8:
            if (r3 != 0) goto L_0x00ec
            goto L_0x095b
        L_0x00ec:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            int r4 = r3.mo16957C()
            int r3 = r3.mo16959E()
            if (r4 != 0) goto L_0x0105
            r8 = 2
            if (r3 < r8) goto L_0x00ff
            goto L_0x0107
        L_0x00ff:
            r54 = r4
            r4 = r3
            r3 = r54
            goto L_0x010a
        L_0x0105:
            int r4 = r4 + -1
        L_0x0107:
            int r3 = r3 + -1
            goto L_0x00ff
        L_0x010a:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.List r8 = r1.getData()
            boolean r1 = r8.isEmpty()
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x025d
            if (r3 > r4) goto L_0x025d
        L_0x011c:
            int r1 = r8.size()
            if (r1 > r3) goto L_0x0123
            goto L_0x0133
        L_0x0123:
            java.lang.Object r1 = r8.get(r3)
            boolean r9 = r1 instanceof cm1.C0740i2
            if (r9 == 0) goto L_0x012f
            cm1.i2 r1 = (cm1.C0740i2) r1
            r9 = r1
            goto L_0x0131
        L_0x012f:
            r9 = r34
        L_0x0131:
            if (r9 != 0) goto L_0x0147
        L_0x0133:
            r1 = r2
            r11 = r5
            r46 = r6
            r47 = r7
            r38 = r8
            r2 = r12
            r41 = r13
            r0 = r15
            r14 = 0
            r54 = r4
            r4 = r3
            r3 = r54
            goto L_0x023f
        L_0x0147:
            long r10 = r9.getItemId()
            di3.d r1 = di3.C86312j.m106911c(r32)
            kq.h r1 = (p185kq.C10383h) r1
            java.lang.String r1 = r1.mo10700XQ(r10)
            r56 = r3
            java.util.HashMap<java.lang.String, ak1.l> r3 = r2.f151767k
            boolean r3 = r3.containsKey(r1)
            if (r3 != 0) goto L_0x0220
            ak1.l$a r3 = ak1.C54095l.f151788x
            r59 = r4
            op3.c r4 = r3.mo74779a(r9)
            r60 = r1
            boolean r1 = r9 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r1 == 0) goto L_0x017b
            r1 = r9
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            java.lang.String r1 = r1.getUserName()
            r36 = r1
            goto L_0x017d
        L_0x017b:
            r36 = r33
        L_0x017d:
            ak1.l r1 = new ak1.l
            r17 = r15
            r15 = r60
            r60 = r1
            gy3.C87412m.m108593f(r15, r5)
            r37 = r5
            r61 = r8
            r5 = 0
            java.lang.Object r8 = r4.mo182596a(r5)
            gy3.C87412m.m108593f(r8, r7)
            java.lang.Number r8 = (java.lang.Number) r8
            long r18 = r8.longValue()
            r38 = r61
            r5 = r9
            r8 = r18
            r18 = r15
            r15 = 1
            java.lang.Object r4 = r4.mo182596a(r15)
            gy3.C87412m.m108593f(r4, r6)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r39 = r12
            r12 = r4
            java.lang.String r3 = r3.mo74780b(r5)
            r4 = r13
            r13 = r3
            r3 = 1
            r0 = r17
            r61 = r18
            r35 = 1
            r15 = r3
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            int r3 = r2.f151762f
            r25 = r3
            r62 = r4
            long r3 = r2.f151763g
            r26 = r3
            int r3 = r2.f151764h
            r28 = r3
            r29 = 1044480(0xff000, float:1.463628E-39)
            r30 = 0
            r4 = r2
            r2 = r5
            r5 = r56
            r3 = r36
            r43 = r59
            r41 = r62
            r42 = r4
            r4 = r5
            r45 = r5
            r44 = r37
            r5 = r61
            r46 = r6
            r47 = r7
            r6 = r10
            r11 = 1
            r10 = r57
            r11 = r58
            r14 = r31
            r1.<init>(r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r28, r29, r30)
            r1 = r42
            java.util.HashMap<java.lang.String, ak1.l> r2 = r1.f151767k
            r4 = r60
            r3 = r61
            r2.put(r3, r4)
            java.util.HashMap<java.lang.String, ak1.l> r2 = r1.f151765i
            r2.put(r3, r4)
            ak1.c0 r2 = r1.f151757a
            r14 = 0
            if (r2 == 0) goto L_0x021d
            r2.mo74743f(r4, r14)
        L_0x021d:
            r11 = r44
            goto L_0x0233
        L_0x0220:
            r45 = r56
            r3 = r1
            r1 = r2
            r43 = r4
            r46 = r6
            r47 = r7
            r38 = r8
            r39 = r12
            r41 = r13
            r0 = r15
            r14 = 0
            r11 = r5
        L_0x0233:
            gy3.C87412m.m108593f(r3, r11)
            r2 = r39
            r2.add(r3)
            r3 = r43
            r4 = r45
        L_0x023f:
            if (r4 == r3) goto L_0x0262
            int r4 = r4 + 1
            r14 = r57
            r15 = r0
            r12 = r2
            r5 = r11
            r8 = r38
            r13 = r41
            r6 = r46
            r7 = r47
            r10 = 1
            r0 = r55
            r11 = r58
            r2 = r1
            r54 = r4
            r4 = r3
            r3 = r54
            goto L_0x011c
        L_0x025d:
            r1 = r2
            r2 = r12
            r41 = r13
            r0 = r15
        L_0x0262:
            java.util.HashMap<java.lang.String, ak1.l> r3 = r1.f151767k
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x026c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02a9
            java.lang.Object r4 = r3.next()
            gy3.C87412m.m108593f(r4, r0)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L_0x02a4
            r3.remove()
            java.util.HashMap<java.lang.String, ak1.l> r5 = r1.f151765i
            java.lang.Object r6 = r4.getKey()
            r5.remove(r6)
            ak1.c0 r5 = r1.f151757a
            if (r5 == 0) goto L_0x02a4
            java.lang.Object r4 = r4.getValue()
            r10 = r41
            gy3.C87412m.m108593f(r4, r10)
            ak1.l r4 = (ak1.C54095l) r4
            r5.mo74742e(r4)
            goto L_0x02a6
        L_0x02a4:
            r10 = r41
        L_0x02a6:
            r41 = r10
            goto L_0x026c
        L_0x02a9:
            r2.clear()
            goto L_0x095b
        L_0x02ae:
            r1 = r2
            r6 = r58
            goto L_0x0319
        L_0x02b2:
            r1 = r2
            r10 = r13
            r0 = r15
            java.util.HashMap<java.lang.String, ak1.l> r2 = r1.f151765i
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x02bf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02e2
            java.lang.Object r3 = r2.next()
            gy3.C87412m.m108593f(r3, r0)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r2.remove()
            ak1.c0 r5 = r1.f151757a
            if (r5 == 0) goto L_0x02bf
            java.lang.Object r3 = r3.getValue()
            gy3.C87412m.m108593f(r3, r10)
            ak1.l r3 = (ak1.C54095l) r3
            r5.mo74742e(r3)
            goto L_0x02bf
        L_0x02e2:
            r6 = r58
            boolean r2 = gy3.C87412m.m108589b(r6, r4)
            if (r2 == 0) goto L_0x095b
            java.util.HashMap<java.lang.String, ak1.n> r2 = r1.f151766j
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x02f4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x095b
            java.lang.Object r3 = r2.next()
            gy3.C87412m.m108593f(r3, r0)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r2.remove()
            ak1.c0 r4 = r1.f151757a
            if (r4 == 0) goto L_0x02f4
            java.lang.Object r3 = r3.getValue()
            gy3.C87412m.m108593f(r3, r10)
            ak1.n r3 = (ak1.C54100n) r3
            r4.mo74739b(r3)
            goto L_0x02f4
        L_0x0317:
            r1 = r2
            r6 = r11
        L_0x0319:
            boolean r0 = gy3.C87412m.m108589b(r6, r4)
            if (r0 == 0) goto L_0x0374
            if (r56 == 0) goto L_0x0326
            androidx.recyclerview.widget.RecyclerView$e r0 = r56.getAdapter()
            goto L_0x0328
        L_0x0326:
            r0 = r34
        L_0x0328:
            boolean r2 = r0 instanceof ht1.C60191o5
            if (r2 == 0) goto L_0x032f
            ht1.o5 r0 = (ht1.C60191o5) r0
            goto L_0x0331
        L_0x032f:
            r0 = r34
        L_0x0331:
            if (r0 != 0) goto L_0x0344
            java.lang.ref.WeakReference<ht1.o5> r0 = r1.f151760d
            if (r0 == 0) goto L_0x033e
            java.lang.Object r0 = r0.get()
            ht1.o5 r0 = (ht1.C60191o5) r0
            goto L_0x0340
        L_0x033e:
            r0 = r34
        L_0x0340:
            if (r0 != 0) goto L_0x0344
            goto L_0x095b
        L_0x0344:
            if (r56 == 0) goto L_0x034b
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r56.getLayoutManager()
            goto L_0x034d
        L_0x034b:
            r2 = r34
        L_0x034d:
            boolean r3 = r2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r3 == 0) goto L_0x0354
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r2
            goto L_0x0356
        L_0x0354:
            r2 = r34
        L_0x0356:
            if (r2 != 0) goto L_0x036d
            java.lang.ref.WeakReference<androidx.recyclerview.widget.StaggeredGridLayoutManager> r2 = r1.f151758b
            if (r2 == 0) goto L_0x0364
            java.lang.Object r2 = r2.get()
            r34 = r2
            androidx.recyclerview.widget.StaggeredGridLayoutManager r34 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r34
        L_0x0364:
            if (r34 != 0) goto L_0x0368
            goto L_0x095b
        L_0x0368:
            r7 = r57
            r2 = r34
            goto L_0x036f
        L_0x036d:
            r7 = r57
        L_0x036f:
            r1.mo74769e(r0, r2, r7, r6)
            goto L_0x095b
        L_0x0374:
            r7 = r57
            boolean r0 = gy3.C87412m.m108589b(r6, r3)
            if (r0 == 0) goto L_0x03c8
            if (r56 == 0) goto L_0x0383
            androidx.recyclerview.widget.RecyclerView$e r0 = r56.getAdapter()
            goto L_0x0385
        L_0x0383:
            r0 = r34
        L_0x0385:
            boolean r2 = r0 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r2 == 0) goto L_0x038c
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0
            goto L_0x038e
        L_0x038c:
            r0 = r34
        L_0x038e:
            if (r0 != 0) goto L_0x03a1
            java.lang.ref.WeakReference<com.tencent.mm.view.recyclerview.WxRecyclerAdapter<cm1.i2>> r0 = r1.f151761e
            if (r0 == 0) goto L_0x039b
            java.lang.Object r0 = r0.get()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0
            goto L_0x039d
        L_0x039b:
            r0 = r34
        L_0x039d:
            if (r0 != 0) goto L_0x03a1
            goto L_0x095b
        L_0x03a1:
            r2 = r0
            if (r56 == 0) goto L_0x03ad
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r56.getLayoutManager()
            if (r0 != 0) goto L_0x03ab
            goto L_0x03ad
        L_0x03ab:
            r3 = r0
            goto L_0x03bd
        L_0x03ad:
            java.lang.ref.WeakReference<androidx.recyclerview.widget.StaggeredGridLayoutManager> r0 = r1.f151758b
            if (r0 == 0) goto L_0x03b9
            java.lang.Object r0 = r0.get()
            r34 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager r34 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r34
        L_0x03b9:
            if (r34 == 0) goto L_0x095b
            r3 = r34
        L_0x03bd:
            r0 = 1
            r4 = r57
            r5 = r58
            r6 = r0
            r1.mo74767c(r2, r3, r4, r5, r6)
            goto L_0x095b
        L_0x03c8:
            if (r56 == 0) goto L_0x03cf
            androidx.recyclerview.widget.RecyclerView$e r0 = r56.getAdapter()
            goto L_0x03d1
        L_0x03cf:
            r0 = r34
        L_0x03d1:
            boolean r2 = r0 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r2 == 0) goto L_0x03d8
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0
            goto L_0x03da
        L_0x03d8:
            r0 = r34
        L_0x03da:
            if (r0 != 0) goto L_0x03ed
            java.lang.ref.WeakReference<com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?>> r0 = r1.f151759c
            if (r0 == 0) goto L_0x03e7
            java.lang.Object r0 = r0.get()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0
            goto L_0x03e9
        L_0x03e7:
            r0 = r34
        L_0x03e9:
            if (r0 != 0) goto L_0x03ed
            goto L_0x095b
        L_0x03ed:
            if (r56 == 0) goto L_0x03f4
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r56.getLayoutManager()
            goto L_0x03f6
        L_0x03f4:
            r2 = r34
        L_0x03f6:
            boolean r3 = r2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r3 == 0) goto L_0x03fd
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r2
            goto L_0x03ff
        L_0x03fd:
            r2 = r34
        L_0x03ff:
            if (r2 != 0) goto L_0x0413
            java.lang.ref.WeakReference<androidx.recyclerview.widget.StaggeredGridLayoutManager> r2 = r1.f151758b
            if (r2 == 0) goto L_0x040d
            java.lang.Object r2 = r2.get()
            r34 = r2
            androidx.recyclerview.widget.StaggeredGridLayoutManager r34 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r34
        L_0x040d:
            if (r34 != 0) goto L_0x0411
            goto L_0x095b
        L_0x0411:
            r2 = r34
        L_0x0413:
            r1.mo74768d(r0, r2, r7, r6)
            goto L_0x095b
        L_0x0418:
            r1 = r2
            r6 = r11
            r7 = r14
            if (r56 != 0) goto L_0x041f
            goto L_0x095b
        L_0x041f:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r56.getLayoutManager()
            boolean r2 = r0 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r2 == 0) goto L_0x042a
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            goto L_0x042c
        L_0x042a:
            r0 = r34
        L_0x042c:
            if (r0 != 0) goto L_0x0430
            goto L_0x095b
        L_0x0430:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r0)
            r1.f151758b = r2
            boolean r2 = gy3.C87412m.m108589b(r6, r4)
            if (r2 == 0) goto L_0x045b
            androidx.recyclerview.widget.RecyclerView$e r2 = r56.getAdapter()
            boolean r3 = r2 instanceof ht1.C60191o5
            if (r3 == 0) goto L_0x0449
            r34 = r2
            ht1.o5 r34 = (ht1.C60191o5) r34
        L_0x0449:
            r2 = r34
            if (r2 != 0) goto L_0x044f
            goto L_0x095b
        L_0x044f:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r1.f151760d = r3
            r1.mo74769e(r2, r0, r7, r6)
            goto L_0x095b
        L_0x045b:
            boolean r2 = gy3.C87412m.m108589b(r6, r3)
            if (r2 == 0) goto L_0x0485
            androidx.recyclerview.widget.RecyclerView$e r2 = r56.getAdapter()
            boolean r3 = r2 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r3 == 0) goto L_0x046c
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r2 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r2
            goto L_0x046e
        L_0x046c:
            r2 = r34
        L_0x046e:
            if (r2 != 0) goto L_0x0472
            goto L_0x095b
        L_0x0472:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r1.f151761e = r3
            r8 = 1
            r3 = r0
            r4 = r57
            r5 = r58
            r6 = r8
            r1.mo74767c(r2, r3, r4, r5, r6)
            goto L_0x095b
        L_0x0485:
            androidx.recyclerview.widget.RecyclerView$e r2 = r56.getAdapter()
            boolean r3 = r2 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r3 == 0) goto L_0x0491
            r34 = r2
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r34 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r34
        L_0x0491:
            r2 = r34
            if (r2 != 0) goto L_0x0497
            goto L_0x095b
        L_0x0497:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r1.f151759c = r3
            r1.mo74768d(r2, r0, r7, r6)
            goto L_0x095b
        L_0x04a3:
            r46 = r6
            r47 = r7
            r6 = r11
            r10 = r13
            r7 = r14
            r0 = r15
            r14 = 0
            r11 = r5
            int r2 = r58.hashCode()
            r3 = 49
            java.lang.String r4 = "temp_3"
            if (r2 == r3) goto L_0x0521
            r3 = 50
            if (r2 == r3) goto L_0x0518
            r3 = 1575(0x627, float:2.207E-42)
            if (r2 == r3) goto L_0x050f
            r3 = 1603(0x643, float:2.246E-42)
            if (r2 == r3) goto L_0x0506
            r3 = 1638(0x666, float:2.295E-42)
            if (r2 == r3) goto L_0x04fd
            r3 = 1660(0x67c, float:2.326E-42)
            if (r2 == r3) goto L_0x04f4
            r3 = 1723(0x6bb, float:2.414E-42)
            if (r2 == r3) goto L_0x04eb
            r3 = 1598(0x63e, float:2.239E-42)
            if (r2 == r3) goto L_0x04e2
            r3 = 1599(0x63f, float:2.24E-42)
            if (r2 == r3) goto L_0x04d9
            goto L_0x0529
        L_0x04d9:
            java.lang.String r2 = "21"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0529
            goto L_0x052e
        L_0x04e2:
            java.lang.String r2 = "20"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x052e
            goto L_0x0529
        L_0x04eb:
            java.lang.String r2 = "61"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x052e
            goto L_0x0529
        L_0x04f4:
            java.lang.String r2 = "40"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x052e
            goto L_0x0529
        L_0x04fd:
            java.lang.String r2 = "39"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x052e
            goto L_0x0529
        L_0x0506:
            java.lang.String r2 = "25"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x052e
            goto L_0x0529
        L_0x050f:
            java.lang.String r2 = "18"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x052e
            goto L_0x0529
        L_0x0518:
            java.lang.String r2 = "2"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x052e
            goto L_0x0529
        L_0x0521:
            java.lang.String r2 = "1"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x052e
        L_0x0529:
            boolean r2 = gy3.C87412m.m108589b(r6, r4)
            goto L_0x052f
        L_0x052e:
            r2 = 1
        L_0x052f:
            java.lang.String r3 = "12"
            if (r2 == 0) goto L_0x0535
            r2 = 1
            goto L_0x0539
        L_0x0535:
            boolean r2 = gy3.C87412m.m108589b(r6, r3)
        L_0x0539:
            if (r2 == 0) goto L_0x053d
            r2 = 1
            goto L_0x0544
        L_0x053d:
            java.lang.String r2 = "temp_1"
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
        L_0x0544:
            if (r2 == 0) goto L_0x0548
            r2 = 1
            goto L_0x054f
        L_0x0548:
            java.lang.String r2 = "temp_9"
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
        L_0x054f:
            if (r2 == 0) goto L_0x0553
            r2 = 1
            goto L_0x0559
        L_0x0553:
            java.lang.String r2 = "27"
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
        L_0x0559:
            if (r2 == 0) goto L_0x055d
            r2 = 1
            goto L_0x0563
        L_0x055d:
            java.lang.String r2 = "9"
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
        L_0x0563:
            if (r2 == 0) goto L_0x0567
            r2 = 1
            goto L_0x056d
        L_0x0567:
            java.lang.String r2 = "6"
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
        L_0x056d:
            if (r2 == 0) goto L_0x0571
            r2 = 1
            goto L_0x0577
        L_0x0571:
            java.lang.String r2 = "16"
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
        L_0x0577:
            if (r2 == 0) goto L_0x095b
            r5 = r0
            r0 = r55
            ak1.k r2 = r0.f151378c
            r2.getClass()
            int r8 = r59.ordinal()
            r15 = 1
            if (r8 == r15) goto L_0x08fd
            r9 = 7
            if (r8 == r9) goto L_0x06fb
            ak1.i r8 = ak1.C0075i.EVENT_ON_RESUME
            if (r1 == r8) goto L_0x0655
            ak1.i r8 = ak1.C0075i.EVENT_ON_REFRESH
            if (r1 != r8) goto L_0x0595
            goto L_0x0655
        L_0x0595:
            ak1.i r7 = ak1.C0075i.EVENT_ON_PAUSE
            if (r1 != r7) goto L_0x064a
            boolean r1 = gy3.C87412m.m108589b(r6, r3)
            if (r1 == 0) goto L_0x05cc
            java.util.HashMap<java.lang.String, ak1.m> r1 = r2.f151774g
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x05a9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x095b
            java.lang.Object r3 = r1.next()
            gy3.C87412m.m108593f(r3, r5)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r1.remove()
            ak1.c0 r4 = r2.f151768a
            if (r4 == 0) goto L_0x05a9
            java.lang.Object r3 = r3.getValue()
            gy3.C87412m.m108593f(r3, r10)
            ak1.m r3 = (ak1.C54098m) r3
            r4.mo74741d(r3)
            goto L_0x05a9
        L_0x05cc:
            boolean r1 = gy3.C87412m.m108589b(r6, r4)
            if (r1 == 0) goto L_0x05ff
            java.util.HashMap<java.lang.String, ak1.n> r1 = r2.f151775h
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x05dc:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x095b
            java.lang.Object r3 = r1.next()
            gy3.C87412m.m108593f(r3, r5)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r1.remove()
            ak1.c0 r4 = r2.f151768a
            if (r4 == 0) goto L_0x05dc
            java.lang.Object r3 = r3.getValue()
            gy3.C87412m.m108593f(r3, r10)
            ak1.n r3 = (ak1.C54100n) r3
            r4.mo74739b(r3)
            goto L_0x05dc
        L_0x05ff:
            java.lang.Class<kq.g> r1 = p185kq.C61130g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kq.g r1 = (p185kq.C61130g) r1
            java.lang.String r1 = r1.mo33249xj()
            java.lang.String r3 = "com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI3"
            boolean r3 = gy3.C87412m.m108589b(r1, r3)
            if (r3 != 0) goto L_0x095b
            java.lang.String r3 = "OccupyFinderUI3"
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 == 0) goto L_0x061d
            goto L_0x095b
        L_0x061d:
            java.util.HashMap<java.lang.String, ak1.l> r1 = r2.f151772e
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0627:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x095b
            java.lang.Object r3 = r1.next()
            gy3.C87412m.m108593f(r3, r5)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r1.remove()
            ak1.c0 r4 = r2.f151768a
            if (r4 == 0) goto L_0x0627
            java.lang.Object r3 = r3.getValue()
            gy3.C87412m.m108593f(r3, r10)
            ak1.l r3 = (ak1.C54095l) r3
            r4.mo74742e(r3)
            goto L_0x0627
        L_0x064a:
            ak1.i r3 = ak1.C0075i.EVENT_ON_DESTROY
            if (r1 != r3) goto L_0x095b
            java.util.HashMap<java.lang.String, ak1.l> r1 = r2.f151773f
            r1.clear()
            goto L_0x095b
        L_0x0655:
            boolean r1 = gy3.C87412m.m108589b(r6, r4)
            if (r1 == 0) goto L_0x06ab
            if (r56 == 0) goto L_0x0662
            androidx.recyclerview.widget.RecyclerView$e r1 = r56.getAdapter()
            goto L_0x0664
        L_0x0662:
            r1 = r34
        L_0x0664:
            boolean r3 = r1 instanceof ht1.C60182l1
            if (r3 == 0) goto L_0x066b
            ht1.l1 r1 = (ht1.C60182l1) r1
            goto L_0x066d
        L_0x066b:
            r1 = r34
        L_0x066d:
            if (r1 != 0) goto L_0x0680
            java.lang.ref.WeakReference<ht1.l1> r1 = r2.f151771d
            if (r1 == 0) goto L_0x067a
            java.lang.Object r1 = r1.get()
            ht1.l1 r1 = (ht1.C60182l1) r1
            goto L_0x067c
        L_0x067a:
            r1 = r34
        L_0x067c:
            if (r1 != 0) goto L_0x0680
            goto L_0x095b
        L_0x0680:
            if (r56 == 0) goto L_0x0687
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r56.getLayoutManager()
            goto L_0x0689
        L_0x0687:
            r3 = r34
        L_0x0689:
            boolean r4 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0690
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            goto L_0x0692
        L_0x0690:
            r3 = r34
        L_0x0692:
            if (r3 != 0) goto L_0x06a6
            java.lang.ref.WeakReference<androidx.recyclerview.widget.LinearLayoutManager> r3 = r2.f151769b
            if (r3 == 0) goto L_0x06a0
            java.lang.Object r3 = r3.get()
            r34 = r3
            androidx.recyclerview.widget.LinearLayoutManager r34 = (androidx.recyclerview.widget.LinearLayoutManager) r34
        L_0x06a0:
            if (r34 != 0) goto L_0x06a4
            goto L_0x095b
        L_0x06a4:
            r3 = r34
        L_0x06a6:
            r2.mo74773d(r1, r3, r7, r6)
            goto L_0x095b
        L_0x06ab:
            if (r56 == 0) goto L_0x06b2
            androidx.recyclerview.widget.RecyclerView$e r1 = r56.getAdapter()
            goto L_0x06b4
        L_0x06b2:
            r1 = r34
        L_0x06b4:
            boolean r3 = r1 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r3 == 0) goto L_0x06bb
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r1
            goto L_0x06bd
        L_0x06bb:
            r1 = r34
        L_0x06bd:
            if (r1 != 0) goto L_0x06d0
            java.lang.ref.WeakReference<com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?>> r1 = r2.f151770c
            if (r1 == 0) goto L_0x06ca
            java.lang.Object r1 = r1.get()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r1
            goto L_0x06cc
        L_0x06ca:
            r1 = r34
        L_0x06cc:
            if (r1 != 0) goto L_0x06d0
            goto L_0x095b
        L_0x06d0:
            if (r56 == 0) goto L_0x06d7
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r56.getLayoutManager()
            goto L_0x06d9
        L_0x06d7:
            r3 = r34
        L_0x06d9:
            boolean r4 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x06e0
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            goto L_0x06e2
        L_0x06e0:
            r3 = r34
        L_0x06e2:
            if (r3 != 0) goto L_0x06f6
            java.lang.ref.WeakReference<androidx.recyclerview.widget.LinearLayoutManager> r3 = r2.f151769b
            if (r3 == 0) goto L_0x06f0
            java.lang.Object r3 = r3.get()
            r34 = r3
            androidx.recyclerview.widget.LinearLayoutManager r34 = (androidx.recyclerview.widget.LinearLayoutManager) r34
        L_0x06f0:
            if (r34 != 0) goto L_0x06f4
            goto L_0x095b
        L_0x06f4:
            r3 = r34
        L_0x06f6:
            r2.mo74772c(r1, r3, r7, r6)
            goto L_0x095b
        L_0x06fb:
            if (r56 != 0) goto L_0x06ff
            goto L_0x095b
        L_0x06ff:
            androidx.recyclerview.widget.RecyclerView$e r1 = r56.getAdapter()
            boolean r3 = r1 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r3 == 0) goto L_0x070a
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r1
            goto L_0x070c
        L_0x070a:
            r1 = r34
        L_0x070c:
            if (r1 != 0) goto L_0x0710
            goto L_0x095b
        L_0x0710:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r1)
            r2.f151770c = r3
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r56.getLayoutManager()
            boolean r4 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0722
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            goto L_0x0724
        L_0x0722:
            r3 = r34
        L_0x0724:
            if (r3 != 0) goto L_0x0728
            goto L_0x095b
        L_0x0728:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r2.f151769b = r4
            int r4 = r3.mo16957C()
            int r3 = r3.mo16959E()
            if (r4 != 0) goto L_0x0743
            r8 = 2
            if (r3 < r8) goto L_0x073d
            goto L_0x0745
        L_0x073d:
            r54 = r4
            r4 = r3
            r3 = r54
            goto L_0x0748
        L_0x0743:
            int r4 = r4 + -1
        L_0x0745:
            int r3 = r3 + -1
            goto L_0x073d
        L_0x0748:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.List r12 = r1.getData()
            boolean r1 = r12.isEmpty()
            r1 = r1 ^ r15
            if (r1 == 0) goto L_0x08a8
            if (r3 > r4) goto L_0x08a8
        L_0x075a:
            int r1 = r12.size()
            if (r1 > r3) goto L_0x0761
            goto L_0x0771
        L_0x0761:
            java.lang.Object r1 = r12.get(r3)
            boolean r8 = r1 instanceof cm1.C0740i2
            if (r8 == 0) goto L_0x076d
            cm1.i2 r1 = (cm1.C0740i2) r1
            r8 = r1
            goto L_0x076f
        L_0x076d:
            r8 = r34
        L_0x076f:
            if (r8 != 0) goto L_0x0785
        L_0x0771:
            r0 = r2
            r49 = r5
            r51 = r10
            r1 = r11
            r35 = r12
            r2 = r13
            r38 = r46
            r36 = r47
            r37 = 0
            r5 = r3
            r3 = r4
            r4 = 1
            goto L_0x088b
        L_0x0785:
            long r14 = r8.getItemId()
            di3.d r1 = di3.C86312j.m106911c(r32)
            kq.h r1 = (p185kq.C10383h) r1
            java.lang.String r9 = r1.mo10700XQ(r14)
            java.util.HashMap<java.lang.String, ak1.l> r1 = r2.f151773f
            boolean r1 = r1.containsKey(r9)
            if (r1 != 0) goto L_0x0869
            ak1.l$a r1 = ak1.C54095l.f151788x
            op3.c r0 = r1.mo74779a(r8)
            r56 = r1
            boolean r1 = r8 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r1 == 0) goto L_0x07b5
            r1 = r8
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            java.lang.String r1 = r1.getUserName()
            r26 = r1
            goto L_0x07b7
        L_0x07b5:
            r26 = r33
        L_0x07b7:
            ak1.l r1 = new ak1.l
            r27 = r3
            r3 = r56
            r56 = r1
            gy3.C87412m.m108593f(r9, r11)
            r36 = r4
            r37 = r5
            r4 = 0
            java.lang.Object r5 = r0.mo182596a(r4)
            r4 = r47
            gy3.C87412m.m108593f(r5, r4)
            java.lang.Number r5 = (java.lang.Number) r5
            long r16 = r5.longValue()
            r5 = r8
            r59 = r9
            r8 = r16
            r4 = 1
            java.lang.Object r0 = r0.mo182596a(r4)
            r60 = r14
            r15 = r46
            gy3.C87412m.m108593f(r0, r15)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r35 = r12
            r12 = r0
            java.lang.String r0 = r3.mo74780b(r5)
            r14 = r13
            r13 = r0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            java.lang.String r0 = r2.f151778k
            r3 = 0
            int r28 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0, r3)
            r29 = 2093056(0x1ff000, float:2.932996E-39)
            r30 = 0
            r0 = 1
            r39 = r60
            r38 = r15
            r15 = r0
            r0 = r2
            r2 = r5
            r60 = r27
            r27 = 0
            r3 = r26
            r48 = r36
            r36 = r47
            r4 = r60
            r50 = r5
            r49 = r37
            r5 = r59
            r6 = r39
            r51 = r10
            r10 = r57
            r52 = r11
            r11 = r58
            r53 = r14
            r37 = 0
            r14 = r31
            r26 = r39
            r1.<init>(r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r28, r29, r30)
            r1 = r50
            boolean r1 = r1 instanceof cm1.C0727e0
            if (r1 == 0) goto L_0x0850
            ak1.f0$q r1 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR
            r2 = r56
            r2.f151795g = r1
            goto L_0x0852
        L_0x0850:
            r2 = r56
        L_0x0852:
            java.util.HashMap<java.lang.String, ak1.l> r1 = r0.f151773f
            r3 = r59
            r1.put(r3, r2)
            java.util.HashMap<java.lang.String, ak1.l> r1 = r0.f151772e
            r1.put(r3, r2)
            ak1.c0 r1 = r0.f151768a
            r4 = 1
            if (r1 == 0) goto L_0x0866
            r1.mo74743f(r2, r4)
        L_0x0866:
            r1 = r52
            goto L_0x087f
        L_0x0869:
            r0 = r2
            r60 = r3
            r48 = r4
            r49 = r5
            r3 = r9
            r51 = r10
            r35 = r12
            r53 = r13
            r38 = r46
            r36 = r47
            r4 = 1
            r37 = 0
            r1 = r11
        L_0x087f:
            gy3.C87412m.m108593f(r3, r1)
            r2 = r53
            r2.add(r3)
            r5 = r60
            r3 = r48
        L_0x088b:
            if (r5 == r3) goto L_0x08ae
            int r5 = r5 + 1
            r7 = r57
            r6 = r58
            r11 = r1
            r13 = r2
            r4 = r3
            r3 = r5
            r12 = r35
            r47 = r36
            r46 = r38
            r5 = r49
            r10 = r51
            r14 = 0
            r15 = 1
            r2 = r0
            r0 = r55
            goto L_0x075a
        L_0x08a8:
            r0 = r2
            r49 = r5
            r51 = r10
            r2 = r13
        L_0x08ae:
            java.util.HashMap<java.lang.String, ak1.l> r1 = r0.f151773f
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x08b8:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x08f9
            java.lang.Object r3 = r1.next()
            r4 = r49
            gy3.C87412m.m108593f(r3, r4)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L_0x08f2
            r1.remove()
            java.util.HashMap<java.lang.String, ak1.l> r5 = r0.f151772e
            java.lang.Object r6 = r3.getKey()
            r5.remove(r6)
            ak1.c0 r5 = r0.f151768a
            if (r5 == 0) goto L_0x08f2
            java.lang.Object r3 = r3.getValue()
            r6 = r51
            gy3.C87412m.m108593f(r3, r6)
            ak1.l r3 = (ak1.C54095l) r3
            r5.mo74742e(r3)
            goto L_0x08f4
        L_0x08f2:
            r6 = r51
        L_0x08f4:
            r49 = r4
            r51 = r6
            goto L_0x08b8
        L_0x08f9:
            r2.clear()
            goto L_0x095b
        L_0x08fd:
            r0 = r2
            if (r56 != 0) goto L_0x0901
            goto L_0x095b
        L_0x0901:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r56.getLayoutManager()
            boolean r2 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto L_0x090c
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            goto L_0x090e
        L_0x090c:
            r1 = r34
        L_0x090e:
            if (r1 != 0) goto L_0x0911
            goto L_0x095b
        L_0x0911:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.f151769b = r2
            r2 = r58
            boolean r3 = gy3.C87412m.m108589b(r2, r4)
            if (r3 == 0) goto L_0x093e
            androidx.recyclerview.widget.RecyclerView$e r3 = r56.getAdapter()
            boolean r4 = r3 instanceof ht1.C60182l1
            if (r4 == 0) goto L_0x092c
            r34 = r3
            ht1.l1 r34 = (ht1.C60182l1) r34
        L_0x092c:
            r3 = r34
            if (r3 != 0) goto L_0x0931
            goto L_0x095b
        L_0x0931:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r0.f151771d = r4
            r4 = r57
            r0.mo74773d(r3, r1, r4, r2)
            goto L_0x095b
        L_0x093e:
            r4 = r57
            androidx.recyclerview.widget.RecyclerView$e r3 = r56.getAdapter()
            boolean r5 = r3 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r5 == 0) goto L_0x094c
            r34 = r3
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r34 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r34
        L_0x094c:
            r3 = r34
            if (r3 != 0) goto L_0x0951
            goto L_0x095b
        L_0x0951:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
            r0.f151770c = r5
            r0.mo74772c(r3, r1, r4, r2)
        L_0x095b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54059a.mo74734c(androidx.recyclerview.widget.RecyclerView, ak1.f0$q, java.lang.String, ak1.i, int, long, int):void");
    }

    /* renamed from: d */
    public final void mo74735d(C0740i2 i2Var, int i, C54067f0.C54078q qVar, String str, String str2, String str3) {
        C0740i2 i2Var2 = i2Var;
        C87412m.m108594g(i2Var2, "feed");
        C87412m.m108594g(qVar, "actionType");
        C87412m.m108594g(str, "commentscene");
        C87412m.m108594g(str2, "clickSubTabContextId");
        C87412m.m108594g(str3, "chnlExtra");
        long itemId = i2Var.getItemId();
        String XQ = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(itemId);
        C54095l.C54096a aVar = C54095l.f151788x;
        C117878c<Long, Integer, Boolean> a = aVar.mo74779a(i2Var2);
        String userName = i2Var2 instanceof BaseFinderFeed ? ((BaseFinderFeed) i2Var2).mo3513o().getUserName() : "";
        C87412m.m108593f(XQ, "feedId");
        Object a2 = a.mo182596a(0);
        C87412m.m108593f(a2, "tuple3.`$1`()");
        long longValue = ((Number) a2).longValue();
        Object a3 = a.mo182596a(1);
        C87412m.m108593f(a3, "tuple3.`$2`()");
        int intValue = ((Number) a3).intValue();
        String b = aVar.mo74780b(i2Var2);
        C54095l.C0078b bVar = C54095l.C0078b.UNDEFINE;
        Object a4 = a.mo182596a(2);
        C87412m.m108593f(a4, "tuple3.`$3`()");
        C54095l lVar = r0;
        C54095l lVar2 = new C54095l(i2Var, userName, i, XQ, itemId, longValue, qVar, str, intValue, b, bVar, true, ((Boolean) a4).booleanValue(), 0, (String) null, str2, str3, (String) null, 0, (String) null, 0, 0, 0, 8282112, (C8480h) null);
        mo74736e(lVar);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (gy3.C87412m.m108589b(r2.f151796h, "17") == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r7.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderMachineTabFragment") == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (gy3.C87412m.m108589b(r2.f151796h, "temp_1") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (gy3.C87412m.m108589b(r2.f151796h, "17") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (gy3.C87412m.m108589b(r2.f151796h, "temp_9") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        if (gy3.C87412m.m108589b(r2.f151796h, "18") == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f9, code lost:
        if (r8 == null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (r7.equals("FinderMachineTabFragment") == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (r7.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderFriendTabFragment") == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        if (r7.equals("FinderFriendTabFragment") == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (gy3.C87412m.m108589b(r2.f151796h, "temp_1") != false) goto L_?;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74736e(ak1.C54095l r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            java.lang.String r0 = ","
            java.lang.String r3 = ";"
            java.lang.Class<ak1.o> r4 = ak1.C54108o.class
            java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
            java.lang.Class<kq.h> r6 = p185kq.C10383h.class
            java.lang.String r7 = "liveFeed"
            gy3.C87412m.m108594g(r2, r7)
            java.lang.String r7 = t91.C64208c.f181960j
            int r8 = r7.hashCode()
            java.lang.String r9 = "18"
            java.lang.String r10 = "17"
            java.lang.String r11 = "temp_1"
            switch(r8) {
                case -1817116115: goto L_0x0050;
                case -844087327: goto L_0x0036;
                case 839202232: goto L_0x002d;
                case 1835482404: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x007d
        L_0x0024:
            java.lang.String r8 = "FinderMachineTabFragment"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0059
            goto L_0x007d
        L_0x002d:
            java.lang.String r8 = "com.tencent.mm.plugin.finder.ui.fragment.FinderFriendTabFragment"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x003f
            goto L_0x007d
        L_0x0036:
            java.lang.String r8 = "FinderFriendTabFragment"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x003f
            goto L_0x007d
        L_0x003f:
            java.lang.String r7 = r2.f151796h
            boolean r7 = gy3.C87412m.m108589b(r7, r11)
            if (r7 != 0) goto L_0x004f
            java.lang.String r7 = r2.f151796h
            boolean r7 = gy3.C87412m.m108589b(r7, r10)
            if (r7 == 0) goto L_0x007d
        L_0x004f:
            return
        L_0x0050:
            java.lang.String r8 = "com.tencent.mm.plugin.finder.ui.fragment.FinderMachineTabFragment"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0059
            goto L_0x007d
        L_0x0059:
            java.lang.String r7 = r2.f151796h
            boolean r7 = gy3.C87412m.m108589b(r7, r11)
            if (r7 != 0) goto L_0x007c
            java.lang.String r7 = r2.f151796h
            boolean r7 = gy3.C87412m.m108589b(r7, r10)
            if (r7 != 0) goto L_0x007c
            java.lang.String r7 = r2.f151796h
            java.lang.String r8 = "temp_9"
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 != 0) goto L_0x007c
            java.lang.String r7 = r2.f151796h
            boolean r7 = gy3.C87412m.m108589b(r7, r9)
            if (r7 == 0) goto L_0x007d
        L_0x007c:
            return
        L_0x007d:
            com.tencent.mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct r7 = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct
            r7.<init>()
            di3.d r8 = di3.C86312j.m106911c(r4)
            ak1.o r8 = (ak1.C54108o) r8
            java.lang.String r10 = r2.f151790b
            r8.Cx0(r7, r10)
            java.lang.String r8 = r2.f151792d
            r7.mo76259w(r8)
            long r10 = r2.f151794f
            r7.f155516e = r10
            di3.d r8 = di3.C86312j.m106911c(r6)
            kq.h r8 = (p185kq.C10383h) r8
            long r10 = r2.f151794f
            java.lang.String r8 = r8.mo10700XQ(r10)
            r7.mo76260x(r8)
            ak1.f0$q r8 = r2.f151795g
            long r10 = r8.f151625d
            r7.f155520i = r10
            java.lang.String r8 = r2.f151796h
            r7.mo76257u(r8)
            int r8 = r2.f151791c
            long r10 = (long) r8
            r7.f155522k = r10
            r10 = 0
            r7.f155523l = r10
            int r8 = r2.f151802n
            long r10 = (long) r8
            r7.f155524m = r10
            java.lang.String r8 = r7.f155518g
            r10 = 2
            r11 = 0
            r12 = 1
            if (r8 == 0) goto L_0x00e4
            java.lang.String r13 = "101"
            boolean r8 = z04.C112551y.m153819s(r8, r13, r11)
            if (r8 == 0) goto L_0x00d1
            long r13 = (long) r12
            r7.f155524m = r13
            goto L_0x00e4
        L_0x00d1:
            java.lang.String r8 = r7.f155518g
            java.lang.String r13 = "struct.sessionID"
            gy3.C87412m.m108593f(r8, r13)
            java.lang.String r13 = "102"
            boolean r8 = z04.C112551y.m153819s(r8, r13, r11)
            if (r8 == 0) goto L_0x00e4
            long r13 = (long) r10
            r7.f155524m = r13
        L_0x00e4:
            java.lang.String r8 = r2.f151806r
            java.lang.String r13 = ""
            r14 = 0
            if (r8 == 0) goto L_0x00fb
            int r15 = r8.length()
            if (r15 != 0) goto L_0x00f3
            r15 = 1
            goto L_0x00f4
        L_0x00f3:
            r15 = 0
        L_0x00f4:
            r15 = r15 ^ r12
            if (r15 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r8 = r14
        L_0x00f9:
            if (r8 != 0) goto L_0x0111
        L_0x00fb:
            java.lang.String r8 = r2.f151790b
            if (r8 == 0) goto L_0x0108
            int r15 = r8.length()
            if (r15 != 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r15 = 0
            goto L_0x0109
        L_0x0108:
            r15 = 1
        L_0x0109:
            r15 = r15 ^ r12
            if (r15 == 0) goto L_0x010d
            goto L_0x010e
        L_0x010d:
            r8 = r14
        L_0x010e:
            if (r8 != 0) goto L_0x0111
            r8 = r13
        L_0x0111:
            r7.mo76262z(r8)
            java.lang.String r8 = r2.f151808t
            int r8 = r8.length()
            if (r8 != 0) goto L_0x011e
            r8 = 1
            goto L_0x011f
        L_0x011e:
            r8 = 0
        L_0x011f:
            if (r8 == 0) goto L_0x012c
            di3.d r5 = di3.C86312j.m106911c(r6)
            kq.h r5 = (p185kq.C10383h) r5
            java.lang.String r5 = r5.mo10696E()
            goto L_0x0161
        L_0x012c:
            java.lang.String r8 = r2.f151808t
            boolean r8 = eb0.C45628s0.m50749N(r8)
            r15 = 65
            if (r8 == 0) goto L_0x0143
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.t1 r5 = (ht1.C60200t1) r5
            r8 = 31
            java.lang.String r5 = r5.mo76802R1(r8, r10, r15)
            goto L_0x0161
        L_0x0143:
            java.lang.String r8 = r2.f151808t
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)
            if (r8 == 0) goto L_0x0157
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.t1 r5 = (ht1.C60200t1) r5
            r8 = 3
            java.lang.String r5 = r5.mo76802R1(r8, r10, r15)
            goto L_0x0161
        L_0x0157:
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.t1 r5 = (ht1.C60200t1) r5
            java.lang.String r5 = r5.mo76802R1(r10, r10, r15)
        L_0x0161:
            r7.mo76258v(r5)
            ak1.f0$q r5 = r2.f151795g
            int r5 = r5.ordinal()
            java.lang.String r8 = "from_feed_id"
            if (r5 == r12) goto L_0x0178
            if (r5 == r10) goto L_0x0178
            r15 = 6
            if (r5 == r15) goto L_0x0178
            r15 = 10
            if (r5 == r15) goto L_0x0178
            goto L_0x01be
        L_0x0178:
            java.lang.String r5 = r2.f151805q
            int r15 = r5.length()
            if (r15 <= 0) goto L_0x0182
            r15 = 1
            goto L_0x0183
        L_0x0182:
            r15 = 0
        L_0x0183:
            if (r15 == 0) goto L_0x0186
            goto L_0x0187
        L_0x0186:
            r5 = r14
        L_0x0187:
            if (r5 == 0) goto L_0x018f
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>(r5)
            goto L_0x0197
        L_0x018f:
            org.json.JSONObject r15 = new org.json.JSONObject
            java.lang.String r5 = "{}"
            r15.<init>(r5)
        L_0x0197:
            java.lang.String r5 = r15.optString(r8)
            long r10 = r2.f151810v
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.getUnsignedLong(r5, r10)
            java.lang.String r5 = "from_comment_scene"
            java.lang.String r5 = r15.optString(r5)
            int r15 = r2.f151811w
            com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5, r15)
            cm1.s0$b r5 = cm1.C0773s0.f1815b
            cm1.s0 r5 = r5.mo714a()
            java.lang.String r15 = r2.f151805q
            java.lang.String r5 = r5.mo713b(r10, r15)
            if (r5 != 0) goto L_0x01bb
            goto L_0x01bc
        L_0x01bb:
            r13 = r5
        L_0x01bc:
            r2.f151805q = r13
        L_0x01be:
            java.lang.String r5 = r2.f151805q
            java.lang.String r10 = r2.f151808t
            java.lang.String r16 = r1.mo74733b(r5, r10)
            r19 = 0
            r20 = 4
            r21 = 0
            java.lang.String r17 = ","
            java.lang.String r18 = ";"
            java.lang.String r5 = z04.C112551y.m153816p(r16, r17, r18, r19, r20, r21)
            r7.mo76255s(r5)
            int r5 = r2.f151797i
            long r10 = (long) r5
            r7.f155527p = r10
            long r10 = r2.f151807s
            r7.f155534w = r10
            di3.d r5 = di3.C86312j.m106911c(r6)
            kq.h r5 = (p185kq.C10383h) r5
            java.lang.String r5 = r5.mo10698S0()
            r7.mo76256t(r5)
            java.lang.String r5 = r2.f151804p
            java.lang.String r10 = "ClickSubTabContextId"
            java.lang.String r5 = r7.mo86045b(r10, r5, r12)
            r7.f155537z = r5
            int r5 = r2.f151809u
            if (r5 == 0) goto L_0x0252
            java.lang.String r5 = r7.f155536y     // Catch:{ Exception -> 0x0244 }
            java.lang.String r10 = "struct.chnl_extra"
            gy3.C87412m.m108593f(r5, r10)     // Catch:{ Exception -> 0x0244 }
            r10 = 0
            java.lang.String r5 = z04.C112551y.m153814n(r5, r3, r0, r10)     // Catch:{ Exception -> 0x0244 }
            int r10 = r5.length()     // Catch:{ Exception -> 0x0244 }
            if (r10 != 0) goto L_0x0210
            r10 = 1
            goto L_0x0211
        L_0x0210:
            r10 = 0
        L_0x0211:
            if (r10 != 0) goto L_0x0219
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0244 }
            r10.<init>(r5)     // Catch:{ Exception -> 0x0244 }
            goto L_0x021e
        L_0x0219:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0244 }
            r10.<init>()     // Catch:{ Exception -> 0x0244 }
        L_0x021e:
            java.lang.String r5 = "head_enter_type"
            int r11 = r2.f151809u     // Catch:{ Exception -> 0x0244 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x0244 }
            r10.put(r5, r11)     // Catch:{ Exception -> 0x0244 }
            long r12 = r2.f151810v     // Catch:{ Exception -> 0x0244 }
            java.lang.String r11 = o40.C61926c.m72691p(r12)     // Catch:{ Exception -> 0x0244 }
            r10.put(r8, r11)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r10 = "jsonObject.toString()"
            gy3.C87412m.m108593f(r8, r10)     // Catch:{ Exception -> 0x0244 }
            r10 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r8, r0, r3, r10)     // Catch:{ Exception -> 0x0244 }
            r7.mo76255s(r0)     // Catch:{ Exception -> 0x0244 }
            goto L_0x0252
        L_0x0244:
            r0 = move-exception
            java.lang.String r3 = r1.f151376a
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x0252:
            java.lang.String r0 = r2.f151796h
            java.lang.String r3 = "temp_"
            r8 = 2
            r10 = 0
            boolean r0 = z04.C112551y.m153820t(r0, r3, r10, r8, r14)
            if (r0 == 0) goto L_0x0281
            java.lang.String r0 = r2.f151796h
            java.lang.String r3 = "temp_2"
            boolean r0 = gy3.C87412m.m108589b(r0, r3)
            if (r0 == 0) goto L_0x027b
            di3.d r0 = di3.C86312j.m106911c(r4)
            ak1.o r0 = (ak1.C54108o) r0
            r0.getClass()
            ak1.f0 r0 = ak1.C54108o.f151869h
            java.lang.String r0 = r0.f151423E
            r7.mo76261y(r0)
            goto L_0x0296
        L_0x027b:
            java.lang.String r0 = r2.f151796h
            r7.mo76261y(r0)
            goto L_0x0296
        L_0x0281:
            long r3 = r2.f151793e
            java.lang.String r0 = r7.f155521j
            java.lang.String r8 = "struct.commentScene"
            gy3.C87412m.m108593f(r0, r8)
            long r10 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = r1.mo74732a(r3, r10)
            r7.mo76261y(r0)
        L_0x0296:
            java.lang.String r0 = r7.f155521j
            java.lang.String r3 = "61"
            boolean r0 = gy3.C87412m.m108589b(r0, r3)
            if (r0 != 0) goto L_0x02b4
            java.lang.Class<kq.i> r0 = p185kq.C61131i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kq.i r0 = (p185kq.C61131i) r0
            java.lang.String r0 = r0.mo86084Y7()
            java.lang.String r3 = "123"
            boolean r0 = gy3.C87412m.m108589b(r0, r3)
            if (r0 == 0) goto L_0x02d8
        L_0x02b4:
            java.lang.String r0 = t91.C64208c.f181965o
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02cd
            di3.d r0 = di3.C86312j.m106911c(r6)
            kq.h r0 = (p185kq.C10383h) r0
            kq.l r0 = r0.mo10693DZ()
            z91.b r0 = (z91.C23462b) r0
            java.lang.String r0 = r0.mo36920d()
            goto L_0x02cf
        L_0x02cd:
            java.lang.String r0 = t91.C64208c.f181965o
        L_0x02cf:
            java.lang.String r3 = "SnsSessionID"
            r4 = 1
            java.lang.String r0 = r7.mo86045b(r3, r0, r4)
            r7.f155535x = r0
        L_0x02d8:
            java.lang.String r0 = r7.f155521j
            boolean r0 = gy3.C87412m.m108589b(r0, r9)
            if (r0 == 0) goto L_0x02e8
            java.lang.String r0 = r1.f151376a
            java.lang.String r2 = "filter, ConstantsFinder.FinderGetCommentScene.MMFinder_GetComment_Scene_Friend_Rec_Tab"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            return
        L_0x02e8:
            r7.mo86054n()
            java.lang.String r0 = r1.f151376a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "report21053OnExposure, struct:\nuserName="
            r3.append(r4)
            java.lang.String r4 = r7.f155515d
            r3.append(r4)
            java.lang.String r4 = "\nnickName="
            r3.append(r4)
            java.lang.String r2 = r2.f151798j
            r3.append(r2)
            java.lang.String r2 = "\nfeedID="
            r3.append(r2)
            java.lang.String r2 = r7.f155517f
            r3.append(r2)
            java.lang.String r2 = "\nliveIDStr="
            r3.append(r2)
            java.lang.String r2 = r7.f155531t
            r3.append(r2)
            java.lang.String r2 = "\nactionTS="
            r3.append(r2)
            long r4 = r7.f155519h
            r3.append(r4)
            java.lang.String r2 = "\naction="
            r3.append(r2)
            long r4 = r7.f155520i
            r3.append(r4)
            java.lang.String r2 = "\ncommentScene="
            r3.append(r2)
            java.lang.String r2 = r7.f155521j
            r3.append(r2)
            java.lang.String r2 = "\nindex="
            r3.append(r2)
            long r4 = r7.f155522k
            r3.append(r4)
            java.lang.String r2 = "\nenterStatus="
            r3.append(r2)
            long r4 = r7.f155523l
            r3.append(r4)
            java.lang.String r2 = "\nshareType="
            r3.append(r2)
            long r4 = r7.f155524m
            r3.append(r4)
            java.lang.String r2 = "\nshareUserName="
            r3.append(r2)
            java.lang.String r2 = r7.f155525n
            r3.append(r2)
            java.lang.String r2 = "\ncontextId="
            r3.append(r2)
            java.lang.String r2 = r7.f155526o
            r3.append(r2)
            java.lang.String r2 = "\nonlineNum="
            r3.append(r2)
            long r4 = r7.f155527p
            r3.append(r4)
            java.lang.String r2 = "\nclickTabContextId="
            r3.append(r2)
            java.lang.String r2 = r7.f155528q
            r3.append(r2)
            java.lang.String r2 = "\nclickSubTabContextId="
            r3.append(r2)
            java.lang.String r2 = r7.f155537z
            r3.append(r2)
            java.lang.String r2 = "\nchnl_extra="
            r3.append(r2)
            java.lang.String r2 = r7.f155536y
            r3.append(r2)
            java.lang.String r2 = "\nisPrivate="
            r3.append(r2)
            long r4 = r7.f155529r
            r3.append(r4)
            java.lang.String r2 = "\nsessionBuffer="
            r3.append(r2)
            java.lang.String r2 = r7.f155530s
            r3.append(r2)
            java.lang.String r2 = "\nsnsFeedId="
            r3.append(r2)
            java.lang.String r2 = r7.f155532u
            r3.append(r2)
            java.lang.String r2 = "\nenterSessionId="
            r3.append(r2)
            long r4 = r7.f155533v
            r3.append(r4)
            java.lang.String r2 = "\nenterIconType="
            r3.append(r2)
            long r4 = r7.f155534w
            r3.append(r4)
            java.lang.String r2 = "\nsnsSessionID="
            r3.append(r2)
            java.lang.String r2 = r7.f155535x
            r3.append(r2)
            java.lang.String r2 = "\nsessionID="
            r3.append(r2)
            java.lang.String r2 = r7.f155518g
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54059a.mo74736e(ak1.l):void");
    }

    /* renamed from: f */
    public final void mo74737f(C54067f0.C54078q qVar, int i, String str, FeedData feedData, C49712hj1 hj12) {
        String str2;
        Class cls = C54108o.class;
        Class cls2 = C10383h.class;
        C87412m.m108594g(qVar, "actionType");
        C87412m.m108594g(str, "commentscene");
        if (feedData != null) {
            FinderLiveEntranceLogStruct finderLiveEntranceLogStruct = new FinderLiveEntranceLogStruct();
            ((C54108o) C86312j.m106911c(cls)).Cx0(finderLiveEntranceLogStruct, feedData.getUserName());
            finderLiveEntranceLogStruct.mo76259w(((C10383h) C86312j.m106911c(cls2)).mo10700XQ(feedData.getFeedId()));
            finderLiveEntranceLogStruct.f155516e = feedData.getLiveId();
            finderLiveEntranceLogStruct.mo76260x(((C10383h) C86312j.m106911c(cls2)).mo10700XQ(feedData.getLiveId()));
            finderLiveEntranceLogStruct.f155520i = qVar.f151625d;
            finderLiveEntranceLogStruct.mo76257u(str);
            finderLiveEntranceLogStruct.f155522k = (long) i;
            finderLiveEntranceLogStruct.f155523l = 0;
            finderLiveEntranceLogStruct.f155524m = 0;
            finderLiveEntranceLogStruct.mo76262z(feedData.getUserName());
            finderLiveEntranceLogStruct.mo76258v(((C10383h) C86312j.m106911c(cls2)).mo10696E());
            finderLiveEntranceLogStruct.f155527p = (long) feedData.getOnlineNum();
            finderLiveEntranceLogStruct.mo76256t(((C10383h) C86312j.m106911c(cls2)).mo10698S0());
            int ordinal = qVar.ordinal();
            if (!(ordinal == 1 || ordinal == 2 || ordinal == 6 || ordinal == 10) || (str2 = C0773s0.f1815b.mo714a().mo713b(feedData.getFeedId(), (String) null)) == null) {
                str2 = "";
            }
            finderLiveEntranceLogStruct.mo76255s(C112551y.m153814n(str2, ",", ";", false));
            if (C87412m.m108589b(finderLiveEntranceLogStruct.f155521j, "temp_2")) {
                ((C54108o) C86312j.m106911c(cls)).getClass();
                finderLiveEntranceLogStruct.mo76261y(C54108o.f151869h.f151423E);
            } else {
                finderLiveEntranceLogStruct.mo76261y(C112551y.m153816p(feedData.getSessionBuffer(), ",", ";", false, 4, (Object) null));
            }
            if (C87412m.m108589b(finderLiveEntranceLogStruct.f155521j, "61") || C87412m.m108589b(((C61131i) C86312j.m106911c(C61131i.class)).mo86084Y7(), "123")) {
                finderLiveEntranceLogStruct.f155535x = finderLiveEntranceLogStruct.mo86045b("SnsSessionID", TextUtils.isEmpty(C64208c.f181965o) ? ((C23462b) ((C10383h) C86312j.m106911c(cls2)).mo10693DZ()).mo36920d() : C64208c.f181965o, true);
            }
            finderLiveEntranceLogStruct.mo86054n();
            String str3 = this.f151376a;
            Log.m105924i(str3, "report21053OnExposure, struct-2:\nuserName=" + finderLiveEntranceLogStruct.f155515d + "\nnickName=" + feedData.getNickName() + "\nfeedID=" + finderLiveEntranceLogStruct.f155517f + "\nliveIDStr=" + finderLiveEntranceLogStruct.f155531t + "\nactionTS=" + finderLiveEntranceLogStruct.f155519h + "\naction=" + finderLiveEntranceLogStruct.f155520i + "\ncommentScene=" + finderLiveEntranceLogStruct.f155521j + "\nindex=" + finderLiveEntranceLogStruct.f155522k + "\nenterStatus=" + finderLiveEntranceLogStruct.f155523l + "\nshareType=" + finderLiveEntranceLogStruct.f155524m + "\nshareUserName=" + finderLiveEntranceLogStruct.f155525n + "\ncontextId=" + finderLiveEntranceLogStruct.f155526o + "\nonlineNum=" + finderLiveEntranceLogStruct.f155527p + "\nclickTabContextId=" + finderLiveEntranceLogStruct.f155528q + "\nisPrivate=" + finderLiveEntranceLogStruct.f155529r + "\nsessionBuffer=" + finderLiveEntranceLogStruct.f155530s + "\nsnsFeedId=" + finderLiveEntranceLogStruct.f155532u + "\nenterSessionId=" + finderLiveEntranceLogStruct.f155533v + "\nenterIconType=" + finderLiveEntranceLogStruct.f155534w + "\nsnsSessionID=" + finderLiveEntranceLogStruct.f155535x + "\nsessionID=" + finderLiveEntranceLogStruct.f155518g + "\nchnlExtra=" + finderLiveEntranceLogStruct.f155536y);
        }
    }
}
