package com.tencent.p014mm.plugin.finder.search;

import ak1.C54067f0;
import ak1.C54095l;
import al1.C0081n;
import android.content.Intent;
import android.view.View;
import bl3.C39818r;
import cm1.C0797z;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wcdb.FileUtils;
import de1.C7287o;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7428c1;
import er1.C58684b;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp1.C8668i;
import hp1.C8674m0;
import hp1.C8676n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import je1.C9320i4;
import jp1.C9485a;
import kj2.C117407d;
import kotlin.Metadata;
import ls3.C10649f;
import ob0.C11385n;
import p185kq.C10383h;
import p185kq.C61130g;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C36907w;
import te3.C48868bk1;
import te3.C48924by0;
import te3.C49098d51;
import te3.C49712hj1;
import te3.C50972qk0;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64686ro2;
import te3.C64848y91;
import tf0.C13883o1;
import tf0.C13887q1;
import wp1.C15585f;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderMixSearchPresenter;", "Lhp1/m0;", "Lob0/n;", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter */
public final class FinderMixSearchPresenter implements C8674m0, C11385n {

    /* renamed from: d */
    public final String f16574d = "Finder.FinderMixSearchPresenter";

    /* renamed from: e */
    public String f16575e = "";

    /* renamed from: f */
    public MMActivity f16576f;

    /* renamed from: g */
    public String f16577g;

    /* renamed from: h */
    public int f16578h;

    /* renamed from: i */
    public C89349b f16579i;

    /* renamed from: j */
    public ArrayList<C48868bk1> f16580j = new ArrayList<>();

    /* renamed from: n */
    public Map<Integer, C9485a> f16581n = new LinkedHashMap();

    /* renamed from: o */
    public int f16582o = 1;

    /* renamed from: p */
    public HashMap<String, C8668i> f16583p = new HashMap<>();

    /* renamed from: q */
    public String f16584q = "";

    /* renamed from: r */
    public int f16585r;

    /* renamed from: s */
    public int f16586s;

    /* renamed from: t */
    public final HashSet<C9320i4> f16587t = new HashSet<>();

    /* renamed from: u */
    public String f16588u = "";

    /* renamed from: v */
    public C8676n0 f16589v;

    /* renamed from: w */
    public final FinderMixSearchPresenter$contactChangelistener$1 f16590w = new FinderMixSearchPresenter$contactChangelistener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$a */
    public static final class C3571a {

        /* renamed from: a */
        public final int f16591a;

        /* renamed from: b */
        public final int f16592b;

        /* renamed from: c */
        public final int f16593c;

        public C3571a(int i, int i2, int i3) {
            this.f16591a = i;
            this.f16592b = i2;
            this.f16593c = i3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$b */
    public static final class C3572b extends C87413o implements C32226l<BaseFinderFeed, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<BaseFinderFeed> f16594d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3572b(List<BaseFinderFeed> list) {
            super(1);
            this.f16594d = list;
        }

        public Object invoke(Object obj) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) obj;
            C87412m.m108594g(baseFinderFeed, LocaleUtil.ITALIAN);
            this.f16594d.add(baseFinderFeed);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$c */
    public static final class C3573c extends C87413o implements C32226l<BaseFinderFeed, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<BaseFinderFeed> f16595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3573c(List<BaseFinderFeed> list) {
            super(1);
            this.f16595d = list;
        }

        public Object invoke(Object obj) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) obj;
            C87412m.m108594g(baseFinderFeed, LocaleUtil.ITALIAN);
            this.f16595d.add(baseFinderFeed);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$d */
    public static final class C3574d extends C87413o implements C32226l<BaseFinderFeed, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<BaseFinderFeed> f16596d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3574d(List<BaseFinderFeed> list) {
            super(1);
            this.f16596d = list;
        }

        public Object invoke(Object obj) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) obj;
            C87412m.m108594g(baseFinderFeed, LocaleUtil.ITALIAN);
            this.f16596d.add(baseFinderFeed);
            return C13598b0.f38549a;
        }
    }

    public FinderMixSearchPresenter(MMActivity mMActivity, int i) {
        C87412m.m108594g(mMActivity, "context");
        this.f16576f = mMActivity;
        this.f16585r = i;
    }

    /* renamed from: J */
    public Map<Integer, C9485a> mo3906J() {
        return this.f16581n;
    }

    /* renamed from: R0 */
    public C13604l<Boolean, Boolean> mo3907R0(int i) {
        C13604l<Boolean, Boolean> lVar;
        int i2 = i;
        C9485a aVar = (C9485a) ((LinkedHashMap) this.f16581n).get(Integer.valueOf(i));
        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(this.f16576f).mo75002a(C13442s8.class)).mo12861q3();
        boolean z = true;
        if (i2 == -1 && this.f16586s == 1) {
            String str = this.f16577g;
            if (str != null) {
                C9320i4 i4Var = new C9320i4(str, this.f16578h, this.f16575e, this.f16579i, this.f16585r, q3, (C89349b) null, (C89349b) null, (C89349b) null, true, 0, 1472, (C8480h) null);
                if (this.f16587t.contains(i4Var)) {
                    Boolean bool = Boolean.FALSE;
                    return new C13604l<>(bool, bool);
                }
                C86709a0.m107524d().mo123460f(i4Var);
                C86709a0.m107524d().mo123455a(3820, this);
                this.f16587t.add(i4Var);
                Boolean bool2 = Boolean.TRUE;
                return new C13604l<>(bool2, bool2);
            }
            lVar = new C13604l<>(Boolean.FALSE, Boolean.TRUE);
        } else {
            if (i2 > 0) {
                if (aVar == null || aVar.f29654d != 1) {
                    z = false;
                }
                if (z) {
                    String str2 = this.f16577g;
                    if (str2 != null) {
                        C9320i4 i4Var2 = new C9320i4(str2, this.f16578h, this.f16575e, aVar.f29655e, aVar.f29656f, q3, (C89349b) null, (C89349b) null, (C89349b) null, true, i, FileUtils.S_IRWXU, (C8480h) null);
                        if (this.f16587t.contains(i4Var2)) {
                            return new C13604l<>(Boolean.TRUE, Boolean.FALSE);
                        }
                        C86709a0.m107524d().mo123460f(i4Var2);
                        C86709a0.m107524d().mo123455a(3820, this);
                        this.f16587t.add(i4Var2);
                        Boolean bool3 = Boolean.TRUE;
                        return new C13604l<>(bool3, bool3);
                    }
                    lVar = new C13604l<>(Boolean.FALSE, Boolean.TRUE);
                }
            }
            lVar = new C13604l<>(Boolean.FALSE, Boolean.TRUE);
        }
        return lVar;
    }

    /* renamed from: b0 */
    public void mo3908b0() {
        Intent intent = new Intent();
        C50972qk0 qk02 = new C50972qk0();
        qk02.f140366j = this.f16575e;
        qk02.f140360d = this.f16577g;
        qk02.f140361e = this.f16578h;
        boolean z = true;
        qk02.f140362f = 1;
        qk02.f140364h = this.f16579i;
        ArrayList<C48868bk1> arrayList = this.f16580j;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C48868bk1 add : arrayList) {
            arrayList2.add(Boolean.valueOf(qk02.f140367n.add(add)));
        }
        try {
            if (this.f16585r == 13) {
                intent.putExtra("request_type", 17);
            } else {
                intent.putExtra("request_type", 1);
            }
            if (this.f16585r != 13) {
                z = false;
            }
            intent.putExtra("is_force_night_mode", z);
        } catch (Exception unused) {
        }
        ((C58684b) C86312j.m106911c(C58684b.class)).Ex0(this.f16576f, qk02, intent);
    }

    /* renamed from: e */
    public void mo3909e(BaseFinderFeed baseFinderFeed, Intent intent, List<? extends BaseFinderFeed> list) {
        C48924by0 by02;
        Intent intent2 = intent;
        List<? extends BaseFinderFeed> list2 = list;
        Class cls = C58417y0.class;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(intent2, "intent");
        C87412m.m108594g(list2, "feedList");
        C50972qk0 qk02 = new C50972qk0();
        qk02.f140366j = this.f16575e;
        qk02.f140360d = this.f16577g;
        qk02.f140361e = this.f16578h;
        qk02.f140362f = 1;
        qk02.f140364h = this.f16579i;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
        for (BaseFinderFeed o : list) {
            arrayList.add(Boolean.valueOf(qk02.f140363g.add(o.mo3513o().getFeedObject())));
        }
        Iterator<FinderObject> it = qk02.f140363g.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i2 = i + 1;
            FinderObject next = it.next();
            if (baseFinderFeed.mo3513o().getFeedObject().f164794id == next.f164794id) {
                qk02.f140365i = i;
                int i3 = this.f16582o;
                String xx02 = ((C58417y0) C86312j.m106911c(cls)).xx0(next.f164794id);
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0 y0Var = (C58417y0) c;
                String str = this.f16575e;
                String str2 = this.f16577g;
                String str3 = ((C58417y0) C86312j.m106911c(cls)).f167351e;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f16576f);
                C58417y0.cy0(y0Var, str, str2, 3, 3, xx02, i, 4, 1, str3, 2, i3, f != null ? f.mo12861q3() : null, (String) null, 0, 12288, (Object) null);
            } else {
                i = i2;
            }
        }
        if (Util.isEqual(baseFinderFeed.mo3513o().getFeedObject().username, C66785b.f191882e.mo90662O5())) {
            C7335d c2 = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c2, "getService(ActivityRouter::class.java)");
            C13883o1 o1Var = (C13883o1) c2;
            MMActivity mMActivity = this.f16576f;
            long j = baseFinderFeed.mo3513o().getFeedObject().f164794id;
            String str4 = baseFinderFeed.mo3513o().getFeedObject().objectNonceId;
            String str5 = str4 == null ? "" : str4;
            C64273c21 c212 = baseFinderFeed.mo3513o().getFeedObject().liveInfo;
            if (c212 == null) {
                c212 = new C64273c21();
            }
            C13883o1.C13884a.m13249a(o1Var, mMActivity, j, str5, c212, (C0081n) null, (C49098d51) null, (String) null, (LinkedList) null, (C64848y91) null, (String) null, baseFinderFeed.mo3526z(), (LinkedList) null, (Intent) null, 7152, (Object) null);
            return;
        }
        int i4 = ((C13442s8) C39818r.f106831a.mo62444c(this.f16576f).mo75002a(C13442s8.class)).f38096i;
        ((C61130g) C86312j.m106911c(C61130g.class)).mo33246ry("temp_4");
        C64273c21 c213 = baseFinderFeed.mo3513o().getFeedObject().liveInfo;
        intent2.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", c213 != null ? c213.f182384X : 0);
        C64273c21 c214 = baseFinderFeed.mo3513o().getFeedObject().liveInfo;
        if (!(c214 == null || (by02 = c214.f182402p0) == null)) {
            intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", by02.toByteArray());
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(baseFinderFeed.mo3513o().getFeedObject());
        C64279c90 c902 = new C64279c90();
        c902.f182444d = "";
        c902.f182445e = "";
        c902.f182446f = false;
        c902.f182447g = -1;
        c902.f182448h = -1;
        c902.f182449i = 1;
        C64686ro2 ro22 = new C64686ro2();
        ro22.f185214e = i4;
        ro22.f185218i = baseFinderFeed.mo3513o().getFeedObject();
        c902.f182450j = ro22;
        ((C10649f) C86312j.m106911c(C10649f.class)).mo10913cP(this.f16576f, intent, arrayList2, 0, c902, (C10649f.C10650a) null);
    }

    /* renamed from: e0 */
    public void mo3910e0(String str, int i, int i2, List<? extends BaseFinderFeed> list, int i3) {
        String str2 = str;
        int i4 = i;
        int i5 = i2;
        List<? extends BaseFinderFeed> list2 = list;
        Class<C13442s8> cls = C13442s8.class;
        Class cls2 = C58417y0.class;
        C87412m.m108594g(str2, "id");
        if (!this.f16583p.containsKey(str2)) {
            String str3 = this.f16574d;
            Log.m105918d(str3, "addExposeItem " + str2 + ' ' + i4 + ' ' + i5);
            C8668i iVar = new C8668i();
            iVar.f27858b = str2;
            iVar.f27857a = i4;
            iVar.f27859c = i5;
            iVar.f27860d = System.currentTimeMillis();
            this.f16583p.put(str2, iVar);
            if (this.f16583p.size() % 30 == 0) {
                mo3918t(false);
            }
        }
        int i6 = this.f16582o;
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls2);
        String str4 = this.f16575e;
        String str5 = this.f16577g;
        String str6 = ((C58417y0) C86312j.m106911c(cls2)).f167351e;
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f16576f);
        C13442s8.C13443a aVar2 = aVar;
        int i7 = i6;
        Class<C13442s8> cls3 = cls;
        int i8 = i5;
        y0Var.by0(str4, str5, 0, i2, str, i, 1, 1, str6, 1, i7, f != null ? f.mo12861q3() : null);
        if (this.f16585r == 13) {
            List<? extends BaseFinderFeed> list3 = list;
            if (list3 != null) {
                if (i8 == 3) {
                    BaseFinderFeed baseFinderFeed = (i4 < 0 || i4 >= list.size()) ? null : (BaseFinderFeed) list3.get(i4);
                    if (baseFinderFeed != null && C58739j4.f168176a.mo83686O(baseFinderFeed)) {
                        C39818r rVar = C39818r.f106831a;
                        Class<C13442s8> cls4 = cls3;
                        String str7 = ((C13442s8) rVar.mo62444c(this.f16576f).mo75002a(cls4)).f38100p;
                        String str8 = str7 == null ? "" : str7;
                        String str9 = ((C13442s8) rVar.mo62444c(this.f16576f).mo75002a(cls4)).f38102q;
                        String str10 = str9 == null ? "" : str9;
                        long itemId = baseFinderFeed.getItemId();
                        String XQ = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(itemId);
                        C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
                        long j = liveInfo != null ? liveInfo.f182392d : 0;
                        String userName = baseFinderFeed.mo3513o().getUserName();
                        C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
                        int i9 = liveInfo2 != null ? liveInfo2.f182393e : 0;
                        C87412m.m108593f(XQ, "feedId");
                        ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13304EM(new C54095l(baseFinderFeed, userName, i, XQ, itemId, j, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "temp_4", i9, baseFinderFeed.mo3513o().getNickName(), C54095l.C0078b.UNDEFINE, true, false, 0, str8, str10, (String) null, (String) null, 0, (String) null, 0, 0, 0, 8335360, (C8480h) null));
                    }
                }
                C7335d c = C86312j.m106911c(cls2);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0 y0Var2 = (C58417y0) c;
                String str11 = this.f16575e;
                String str12 = this.f16577g;
                String str13 = ((C58417y0) C86312j.m106911c(cls2)).f167351e;
                C13442s8 f2 = aVar2.mo12873f(this.f16576f);
                C58417y0.cy0(y0Var2, str11, str12, 3, i2, str, i, 4, 1, str13, 1, i7, f2 != null ? f2.mo12861q3() : null, (String) null, i3, 4096, (Object) null);
                return;
            }
            return;
        }
        C7335d c2 = C86312j.m106911c(cls2);
        C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
        C58417y0 y0Var3 = (C58417y0) c2;
        String str14 = this.f16575e;
        String str15 = this.f16577g;
        String str16 = ((C58417y0) C86312j.m106911c(cls2)).f167351e;
        C13442s8 f3 = aVar2.mo12873f(this.f16576f);
        C58417y0.cy0(y0Var3, str14, str15, 0, i2, str, i, 1, 1, str16, 1, i7, f3 != null ? f3.mo12861q3() : null, (String) null, i3, 4096, (Object) null);
    }

    /* renamed from: m */
    public List<C48868bk1> mo3911m() {
        return this.f16580j;
    }

    /* renamed from: m0 */
    public boolean mo3912m0() {
        boolean z;
        Collection<C9485a> values = ((LinkedHashMap) this.f16581n).values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            for (C9485a aVar : values) {
                if (aVar.f29653c.size() > 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public final void mo3913n(List<? extends FinderObject> list, int i, C32226l<? super BaseFinderFeed, C13598b0> lVar) {
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (FinderObject a : list) {
            BaseFinderFeed k = C15585f.f42211a.mo14348k(FinderItem.Companion.mo79056a(a, 16));
            if (!k.mo3513o().getMediaList().isEmpty()) {
                lVar.invoke(k);
            }
            if (k instanceof C0797z) {
                C7335d c = C86312j.m106911c(C58417y0.class);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                ((C58417y0) c).py0(k.getItemId(), i, k.mo3526z(), 0);
            }
            arrayList.add(C13598b0.f38549a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (((r4.one_time_flag & 4) > 0) == false) goto L_0x0034;
     */
    /* renamed from: n1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3914n1(te3.C48868bk1 r37, int r38) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            java.lang.String r3 = "finderSearchInfo"
            gy3.C87412m.m108594g(r1, r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r1.f131162d
            java.lang.String r16 = ""
            if (r4 == 0) goto L_0x001a
            java.lang.String r4 = r4.username
            if (r4 != 0) goto L_0x001c
        L_0x001a:
            r4 = r16
        L_0x001c:
            java.lang.String r5 = "finder_username"
            r3.putExtra(r5, r4)
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r1.f131162d
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0033
            int r4 = r4.one_time_flag
            r4 = r4 & 4
            if (r4 <= 0) goto L_0x002f
            r4 = 1
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r4 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            java.lang.String r4 = "KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE"
            r3.putExtra(r4, r5)
            java.lang.String r4 = r0.f16577g
            if (r4 != 0) goto L_0x003f
            r4 = r16
        L_0x003f:
            java.lang.String r5 = "KEY_SEARCH_WRORD"
            r3.putExtra(r5, r4)
            rs1.s8$a r15 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r5 = r0.f16576f
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 7
            r12 = 0
            r13 = 0
            r14 = 192(0xc0, float:2.69E-43)
            r17 = 0
            r4 = r15
            r6 = r3
            r18 = r15
            r15 = r17
            rs1.C13442s8.C13443a.m12791e(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Class<er1.b> r4 = er1.C58684b.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            er1.b r4 = (er1.C58684b) r4
            com.tencent.mm.ui.MMActivity r5 = r0.f16576f
            r4.mo13272V1(r5, r3)
            int r3 = r0.f16582o
            di3.d r4 = di3.C86312j.m106911c(r2)
            r19 = r4
            dp1.y0 r19 = (dp1.C58417y0) r19
            java.lang.String r4 = r0.f16575e
            java.lang.String r5 = r0.f16577g
            r22 = 0
            r23 = 1
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r1.f131162d
            if (r6 == 0) goto L_0x0087
            java.lang.String r6 = r6.username
            if (r6 != 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            r24 = r6
            goto L_0x0089
        L_0x0087:
            r24 = r16
        L_0x0089:
            r26 = 1
            r27 = 1
            di3.d r6 = di3.C86312j.m106911c(r2)
            dp1.y0 r6 = (dp1.C58417y0) r6
            java.lang.String r6 = r6.f167351e
            r29 = 2
            com.tencent.mm.ui.MMActivity r7 = r0.f16576f
            r8 = r18
            rs1.s8 r7 = r8.mo12873f(r7)
            r9 = 0
            if (r7 == 0) goto L_0x00a9
            te3.hj1 r7 = r7.mo12861q3()
            r31 = r7
            goto L_0x00ab
        L_0x00a9:
            r31 = r9
        L_0x00ab:
            r20 = r4
            r21 = r5
            r25 = r38
            r28 = r6
            r30 = r3
            r19.by0(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            di3.d r4 = di3.C86312j.m106911c(r2)
            java.lang.String r5 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            r19 = r4
            dp1.y0 r19 = (dp1.C58417y0) r19
            java.lang.String r4 = r0.f16575e
            java.lang.String r5 = r0.f16577g
            r22 = 0
            r23 = 1
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r1.f131162d
            if (r6 == 0) goto L_0x00d9
            java.lang.String r6 = r6.username
            if (r6 != 0) goto L_0x00d6
            goto L_0x00d9
        L_0x00d6:
            r24 = r6
            goto L_0x00db
        L_0x00d9:
            r24 = r16
        L_0x00db:
            r26 = 1
            r27 = 1
            di3.d r6 = di3.C86312j.m106911c(r2)
            dp1.y0 r6 = (dp1.C58417y0) r6
            java.lang.String r6 = r6.f167351e
            r29 = 2
            com.tencent.mm.ui.MMActivity r7 = r0.f16576f
            rs1.s8 r7 = r8.mo12873f(r7)
            if (r7 == 0) goto L_0x00f8
            te3.hj1 r7 = r7.mo12861q3()
            r31 = r7
            goto L_0x00fa
        L_0x00f8:
            r31 = r9
        L_0x00fa:
            r32 = 0
            r33 = 0
            r34 = 12288(0x3000, float:1.7219E-41)
            r35 = 0
            r20 = r4
            r21 = r5
            r25 = r38
            r28 = r6
            r30 = r3
            dp1.C58417y0.cy0(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            com.tencent.mm.ui.MMActivity r3 = r0.f16576f
            rs1.s8 r3 = r8.mo12873f(r3)
            if (r3 == 0) goto L_0x0134
            di3.d r2 = di3.C86312j.m106911c(r2)
            r4 = r2
            dp1.y0 r4 = (dp1.C58417y0) r4
            r5 = 6
            r6 = 0
            int r8 = r3.f38096i
            r9 = 1
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.f131162d
            if (r1 == 0) goto L_0x012f
            java.lang.String r1 = r1.username
            if (r1 != 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r10 = r1
            goto L_0x0131
        L_0x012f:
            r10 = r16
        L_0x0131:
            r4.yx0(r5, r6, r8, r9, r10)
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.search.FinderMixSearchPresenter.mo3914n1(te3.bk1, int):void");
    }

    /* renamed from: o0 */
    public String mo3915o0() {
        return this.f16584q;
    }

    public void onDetach() {
        C86709a0.m107524d().mo123470p(3820, this);
        mo3918t(true);
        this.f16590w.dead();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: jp1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: jp1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v34, resolved type: jp1.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: jp1.a} */
    /* JADX WARNING: type inference failed for: r8v26 */
    /* JADX WARNING: type inference failed for: r9v24 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0396, code lost:
        if (r6 == false) goto L_0x0399;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r34, int r35, java.lang.String r36, ob0.C117747y r37) {
        /*
            r33 = this;
            r0 = r33
            r1 = r37
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderSearch"
            gy3.C87412m.m108592e(r1, r2)
            je1.i4 r1 = (je1.C9320i4) r1
            java.util.HashSet<je1.i4> r2 = r0.f16587t
            r2.remove(r1)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            r3 = 3820(0xeec, float:5.353E-42)
            r2.mo123470p(r3, r0)
            hp1.n0 r2 = r0.f16589v
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchViewCallback"
            gy3.C87412m.m108592e(r2, r3)
            hp1.r0 r2 = (hp1.C8684r0) r2
            r2.mo9532x()
            java.util.ArrayList<te3.bk1> r2 = r0.f16580j
            int r2 = r2.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Map<java.lang.Integer, jp1.a> r4 = r0.f16581n
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.util.Collection r4 = r4.values()
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x0044
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0044
        L_0x0042:
            r4 = 0
            goto L_0x0062
        L_0x0044:
            java.util.Iterator r4 = r4.iterator()
        L_0x0048:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0042
            java.lang.Object r5 = r4.next()
            jp1.a r5 = (jp1.C9485a) r5
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r5 = r5.f29653c
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x005e
            r5 = 1
            goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            if (r5 == 0) goto L_0x0048
            r4 = 1
        L_0x0062:
            if (r34 != 0) goto L_0x03ee
            if (r35 != 0) goto L_0x03ee
            kj2.d r8 = kj2.C117407d.INSTANCE
            r9 = 1265(0x4f1, double:6.25E-321)
            r11 = 4
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            te3.gk1 r5 = r1.f29125v
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchResponse"
            gy3.C87412m.m108592e(r5, r8)
            java.util.LinkedList<te3.bk1> r8 = r5.f134088d
            java.lang.String r9 = "response.infoList"
            gy3.C87412m.m108593f(r8, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r11 = sx3.C36907w.m41090l(r8, r10)
            r9.<init>(r11)
            java.util.Iterator r8 = r8.iterator()
        L_0x008f:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x00aa
            java.lang.Object r11 = r8.next()
            te3.bk1 r11 = (te3.C48868bk1) r11
            com.tencent.mm.protocal.protobuf.FinderContact r12 = r11.f131162d
            if (r12 == 0) goto L_0x00a4
            java.util.ArrayList<te3.bk1> r12 = r0.f16580j
            r12.add(r11)
        L_0x00a4:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            r9.add(r11)
            goto L_0x008f
        L_0x00aa:
            bl3.r r8 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r9 = r0.f16576f
            bl3.r$a r8 = r8.mo62444c(r9)
            java.lang.Class<rs1.s8> r9 = rs1.C13442s8.class
            androidx.lifecycle.i0 r8 = r8.mo75002a(r9)
            rs1.s8 r8 = (rs1.C13442s8) r8
            int r8 = r8.f38096i
            java.util.LinkedList<te3.vj1> r9 = r5.f134101t
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)
            java.lang.String r11 = "response.multiFeedStream"
            java.lang.String r13 = ""
            if (r9 != 0) goto L_0x0160
            java.util.LinkedList<te3.vj1> r9 = r5.f134101t
            gy3.C87412m.m108593f(r9, r11)
            java.util.Iterator r9 = r9.iterator()
        L_0x00d1:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x0238
            java.lang.Object r14 = r9.next()
            te3.vj1 r14 = (te3.C51701vj1) r14
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r14.f143510f
            java.lang.String r10 = "tab.object_list"
            gy3.C87412m.m108593f(r6, r10)
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$b r10 = new com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$b
            r10.<init>(r15)
            r0.mo3913n(r6, r8, r10)
            java.util.Map<java.lang.Integer, jp1.a> r6 = r0.f16581n
            int r10 = r14.f143509e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r16 = r6.get(r10)
            if (r16 != 0) goto L_0x0120
            jp1.a r7 = new jp1.a
            int r12 = r14.f143509e
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 62
            r25 = 0
            r17 = r7
            r18 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r6.put(r10, r7)
            r16 = r7
        L_0x0120:
            r6 = r16
            jp1.a r6 = (jp1.C9485a) r6
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$a r7 = new com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$a
            int r10 = r14.f143509e
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r12 = r6.f29653c
            int r12 = r12.size()
            r16 = r9
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r9 = r6.f29653c
            int r9 = r9.size()
            int r17 = r15.size()
            int r9 = r9 + r17
            r7.<init>(r10, r12, r9)
            r3.add(r7)
            java.lang.String r7 = r14.f143508d
            if (r7 != 0) goto L_0x0147
            r7 = r13
        L_0x0147:
            r6.f29652b = r7
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r7 = r6.f29653c
            r7.addAll(r15)
            int r7 = r14.f143511g
            r6.f29654d = r7
            pe3.b r7 = r14.f143512h
            r6.f29655e = r7
            int r7 = r14.f143513i
            r6.f29656f = r7
            r9 = r16
            r10 = 10
            goto L_0x00d1
        L_0x0160:
            boolean r6 = r1.f29118o
            java.lang.String r7 = "response.objectList"
            if (r6 == 0) goto L_0x01d1
            int r6 = r1.f29119p
            r9 = -1
            if (r6 == r9) goto L_0x01d1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r9 = r5.f134091g
            gy3.C87412m.m108593f(r9, r7)
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$c r7 = new com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$c
            r7.<init>(r6)
            r0.mo3913n(r9, r8, r7)
            java.util.Map<java.lang.Integer, jp1.a> r7 = r0.f16581n
            int r8 = r1.f29119p
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r9 = r7.get(r8)
            if (r9 != 0) goto L_0x01a6
            jp1.a r9 = new jp1.a
            int r15 = r1.f29119p
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 62
            r22 = 0
            r14 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r7.put(r8, r9)
        L_0x01a6:
            jp1.a r9 = (jp1.C9485a) r9
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$a r7 = new com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$a
            int r8 = r1.f29119p
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r10 = r9.f29653c
            int r10 = r10.size()
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r12 = r9.f29653c
            int r12 = r12.size()
            int r14 = r6.size()
            int r12 = r12 + r14
            r7.<init>(r8, r10, r12)
            r3.add(r7)
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r7 = r9.f29653c
            r7.addAll(r6)
            int r6 = r5.f134090f
            r9.f29654d = r6
            pe3.b r6 = r5.f134092h
            r9.f29655e = r6
            goto L_0x0238
        L_0x01d1:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r9 = r5.f134091g
            gy3.C87412m.m108593f(r9, r7)
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$d r7 = new com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$d
            r7.<init>(r6)
            r0.mo3913n(r9, r8, r7)
            java.util.Map<java.lang.Integer, jp1.a> r7 = r0.f16581n
            r8 = -1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r8 = r7.get(r9)
            if (r8 != 0) goto L_0x020a
            jp1.a r8 = new jp1.a
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 62
            r22 = 0
            r15 = -1
            r14 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r7.put(r9, r8)
        L_0x020a:
            jp1.a r8 = (jp1.C9485a) r8
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$a r7 = new com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter$a
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r9 = r8.f29653c
            int r9 = r9.size()
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r10 = r8.f29653c
            int r10 = r10.size()
            int r12 = r6.size()
            int r10 = r10 + r12
            r12 = -1
            r7.<init>(r12, r9, r10)
            r3.add(r7)
            r8.f29652b = r13
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r7 = r8.f29653c
            r7.addAll(r6)
            int r6 = r5.f134090f
            r8.f29654d = r6
            pe3.b r6 = r5.f134092h
            r8.f29655e = r6
            r6 = 0
            r8.f29656f = r6
        L_0x0238:
            boolean r6 = r1.f29118o
            r7 = 0
            if (r6 == 0) goto L_0x0242
            int r1 = r1.f29119p
            r6 = -1
            if (r1 != r6) goto L_0x025b
        L_0x0242:
            te3.hk1 r1 = r5.f134099r
            if (r1 == 0) goto L_0x0249
            java.lang.String r1 = r1.f134698d
            goto L_0x024a
        L_0x0249:
            r1 = r7
        L_0x024a:
            if (r1 != 0) goto L_0x024d
            r1 = r13
        L_0x024d:
            r0.f16584q = r1
            int r1 = r5.f134089e
            r0.f16578h = r1
            int r1 = r5.f134090f
            r0.f16586s = r1
            pe3.b r1 = r5.f134092h
            r0.f16579i = r1
        L_0x025b:
            java.lang.String r1 = r0.f16574d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "onSceneEnd "
            r6.append(r8)
            java.util.LinkedList<te3.bk1> r8 = r5.f134088d
            int r8 = r8.size()
            r6.append(r8)
            r8 = 32
            r6.append(r8)
            int r9 = r5.f134089e
            r6.append(r9)
            r6.append(r8)
            int r9 = r5.f134090f
            r6.append(r9)
            r6.append(r8)
            java.util.ArrayList<te3.bk1> r8 = r0.f16580j
            int r8 = r8.size()
            r6.append(r8)
            java.lang.String r8 = " ["
            r6.append(r8)
            java.util.Map<java.lang.Integer, jp1.a> r8 = r0.f16581n
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8
            java.util.Collection r14 = r8.values()
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 62
            r22 = 0
            java.lang.String r15 = ","
            java.lang.String r8 = sx3.C110818d0.m150921S(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r6.append(r8)
            r8 = 93
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            java.lang.String r1 = r0.f16588u
            java.lang.String r6 = r0.f16577g
            if (r6 != 0) goto L_0x02c5
            r6 = r13
        L_0x02c5:
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            if (r1 != 0) goto L_0x0362
            java.util.Map<java.lang.Integer, jp1.a> r1 = r0.f16581n
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.util.Collection r1 = r1.values()
            java.lang.Object r1 = sx3.C110818d0.m150915M(r1)
            jp1.a r1 = (jp1.C9485a) r1
            if (r1 == 0) goto L_0x02df
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r1 = r1.f29653c
            if (r1 != 0) goto L_0x02e1
        L_0x02df:
            sx3.f0 r1 = sx3.C64186f0.f181907d
        L_0x02e1:
            java.lang.String r6 = r0.f16577g
            if (r6 != 0) goto L_0x02e6
            r6 = r13
        L_0x02e6:
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r10 = sx3.C36907w.m41090l(r1, r9)
            r8.<init>(r10)
            java.util.Iterator r1 = r1.iterator()
        L_0x02f5:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x030d
            java.lang.Object r9 = r1.next()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r9
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r9.mo3513o()
            java.lang.String r9 = r9.getUnsignedId()
            r8.add(r9)
            goto L_0x02f5
        L_0x030d:
            int r1 = r6.length()
            if (r1 != 0) goto L_0x0315
            r1 = 1
            goto L_0x0316
        L_0x0315:
            r1 = 0
        L_0x0316:
            if (r1 == 0) goto L_0x031a
            r12 = 0
            goto L_0x035a
        L_0x031a:
            dp1.h1$a r1 = dp1.C58368h1.f167164D
            te3.cb0 r9 = new te3.cb0
            r9.<init>()
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r12 = "feedActionType"
            r14 = 10
            r10.put(r12, r14)
            java.lang.String r12 = "search_data"
            r10.put(r12, r6)
            int r6 = r8.size()
            r12 = 50
            int r6 = java.lang.Math.min(r6, r12)
            r12 = 0
            java.util.List r6 = r8.subList(r12, r6)
            java.lang.String r8 = "result_list"
            r10.put(r8, r6)
            java.lang.String r6 = r10.toString()
            r9.f131610g = r6
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r6 = r6.mo90662O5()
            r9.f131608e = r6
            rx3.b0 r6 = rx3.C13598b0.f38549a
            r1.mo8590b(r7, r9)
        L_0x035a:
            java.lang.String r1 = r0.f16577g
            if (r1 != 0) goto L_0x035f
            r1 = r13
        L_0x035f:
            r0.f16588u = r1
            goto L_0x0363
        L_0x0362:
            r12 = 0
        L_0x0363:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r5.f134091g
            int r1 = r1.size()
            if (r1 > 0) goto L_0x0398
            java.util.LinkedList<te3.vj1> r1 = r5.f134101t
            gy3.C87412m.m108593f(r1, r11)
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x0378
        L_0x0376:
            r6 = 0
            goto L_0x0396
        L_0x0378:
            java.util.Iterator r1 = r1.iterator()
        L_0x037c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0376
            java.lang.Object r6 = r1.next()
            te3.vj1 r6 = (te3.C51701vj1) r6
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r6.f143510f
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0392
            r6 = 1
            goto L_0x0393
        L_0x0392:
            r6 = 0
        L_0x0393:
            if (r6 == 0) goto L_0x037c
            r6 = 1
        L_0x0396:
            if (r6 == 0) goto L_0x0399
        L_0x0398:
            r12 = 1
        L_0x0399:
            java.lang.String r1 = r0.f16577g
            if (r1 != 0) goto L_0x03a0
            r18 = r13
            goto L_0x03a2
        L_0x03a0:
            r18 = r1
        L_0x03a2:
            java.util.LinkedList<te3.bk1> r1 = r5.f134088d
            boolean r1 = r1.isEmpty()
            r5 = 1
            r6 = r12 ^ 1
            java.lang.Class<dp1.y0> r8 = dp1.C58417y0.class
            int r9 = r0.f16582o
            r10 = 2
            if (r1 == 0) goto L_0x03b5
            r22 = 1
            goto L_0x03b7
        L_0x03b5:
            r22 = 2
        L_0x03b7:
            if (r6 == 0) goto L_0x03bc
            r23 = 1
            goto L_0x03be
        L_0x03bc:
            r23 = 2
        L_0x03be:
            di3.d r1 = di3.C86312j.m106911c(r8)
            r14 = r1
            dp1.y0 r14 = (dp1.C58417y0) r14
            r15 = 1
            di3.d r1 = di3.C86312j.m106911c(r8)
            dp1.y0 r1 = (dp1.C58417y0) r1
            java.lang.String r1 = r1.f167351e
            java.lang.String r5 = r0.f16575e
            r19 = 1
            r21 = 2
            rs1.s8$a r6 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r8 = r0.f16576f
            rs1.s8 r6 = r6.mo12873f(r8)
            if (r6 == 0) goto L_0x03e2
            te3.hj1 r7 = r6.mo12861q3()
        L_0x03e2:
            r24 = r7
            r16 = r1
            r17 = r5
            r20 = r9
            r14.ay0(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x03fb
        L_0x03ee:
            kj2.d r25 = kj2.C117407d.INSTANCE
            r26 = 1265(0x4f1, double:6.25E-321)
            r28 = 5
            r30 = 1
            r32 = 0
            r25.idkeyStat(r26, r28, r30, r32)
        L_0x03fb:
            hp1.n0 r1 = r0.f16589v
            if (r1 == 0) goto L_0x0402
            r1.mo9526G(r2, r4, r3)
        L_0x0402:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.search.FinderMixSearchPresenter.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    /* renamed from: q */
    public void mo3916q(BaseFinderFeed baseFinderFeed, List<? extends BaseFinderFeed> list, int i, View view) {
        List<? extends BaseFinderFeed> list2 = list;
        Class cls = C58417y0.class;
        C87412m.m108594g(baseFinderFeed, "finderFeedObj");
        C87412m.m108594g(list2, "feedList");
        C87412m.m108594g(view, "view");
        C50972qk0 qk02 = new C50972qk0();
        qk02.f140366j = this.f16575e;
        qk02.f140360d = this.f16577g;
        qk02.f140361e = this.f16578h;
        qk02.f140362f = 1;
        qk02.f140364h = this.f16579i;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
        for (BaseFinderFeed o : list) {
            arrayList.add(Boolean.valueOf(qk02.f140363g.add(o.mo3513o().getFeedObject())));
        }
        Iterator<FinderObject> it = qk02.f140363g.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i3 = i2 + 1;
            FinderObject next = it.next();
            if (baseFinderFeed.mo3513o().getFeedObject().f164794id == next.f164794id) {
                qk02.f140365i = i2;
                int i4 = this.f16582o;
                String xx02 = ((C58417y0) C86312j.m106911c(cls)).xx0(next.f164794id);
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                String str = this.f16575e;
                String str2 = this.f16577g;
                String str3 = ((C58417y0) C86312j.m106911c(cls)).f167351e;
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                C13442s8 f = aVar.mo12873f(this.f16576f);
                y0Var.by0(str, str2, 0, 2, xx02, i2, 1, 1, str3, 2, i4, f != null ? f.mo12861q3() : null);
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                C58417y0 y0Var2 = (C58417y0) c;
                String str4 = this.f16575e;
                String str5 = this.f16577g;
                String str6 = ((C58417y0) C86312j.m106911c(cls)).f167351e;
                C13442s8 f2 = aVar.mo12873f(this.f16576f);
                C58417y0.cy0(y0Var2, str4, str5, 0, 2, xx02, i2, 1, 1, str6, 2, i4, f2 != null ? f2.mo12861q3() : null, (String) null, i, 4096, (Object) null);
            } else {
                i2 = i3;
            }
        }
        Intent intent = new Intent();
        String str7 = this.f16577g;
        if (str7 == null) {
            str7 = "";
        }
        intent.putExtra("KEY_SEARCH_WRORD", str7);
        C13442s8.f38060Q0.mo12871c(this.f16576f, intent);
        C7287o.m7447c(intent, view, 0, false, false, (C32227p) null, 30, (Object) null);
        ((C58684b) C86312j.m106911c(C58684b.class)).Hx0(this.f16576f, qk02, intent);
    }

    /* renamed from: r0 */
    public boolean mo3917r0() {
        return this.f16586s == 1;
    }

    /* renamed from: t */
    public final void mo3918t(boolean z) {
        if (!Util.isNullOrNil(this.f16575e) && (!this.f16583p.isEmpty())) {
            C7428c1.f25609a.mo8561a(this.f16575e, this.f16577g, 0, this.f16583p, 1);
            if (z) {
                this.f16583p.clear();
            }
        }
    }

    /* renamed from: x */
    public void mo3919x(String str, int i, boolean z, C89349b bVar, int i2) {
        String str2 = str;
        C87412m.m108594g(str2, SearchIntents.EXTRA_QUERY);
        C117407d.INSTANCE.idkeyStat(1265, 3, 1, false);
        mo3918t(true);
        this.f16578h = 0;
        this.f16586s = 0;
        this.f16579i = null;
        this.f16580j.clear();
        ((LinkedHashMap) this.f16581n).clear();
        this.f16577g = str2;
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        this.f16575e = uuid;
        HashSet<C9320i4> hashSet = new HashSet<>(this.f16587t);
        this.f16587t.clear();
        for (C9320i4 d : hashSet) {
            C86709a0.m107524d().mo123458d(d);
        }
        if (!Util.isNullOrNil(str)) {
            C9320i4 i4Var = new C9320i4(str, this.f16578h, this.f16575e, this.f16579i, z ? 10 : i2, ((C13442s8) C39818r.f106831a.mo62444c(this.f16576f).mo75002a(C13442s8.class)).mo12861q3(), bVar, (C89349b) null, (C89349b) null, false, 0, 1920, (C8480h) null);
            C86709a0.m107524d().mo123460f(i4Var);
            C86709a0.m107524d().mo123455a(3820, this);
            this.f16587t.add(i4Var);
            C8676n0 n0Var = this.f16589v;
            if (n0Var != null) {
                n0Var.mo9527Q();
            }
        }
        this.f16582o = i;
    }
}
