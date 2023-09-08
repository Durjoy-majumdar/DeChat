package com.tencent.p014mm.plugin.finder.feed.model;

import androidx.appcompat.app.AppCompatActivity;
import cm1.C0740i2;
import cm1.C55033u;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import df1.C58259c;
import di3.C86312j;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import ef1.C7642k;
import er1.C58739j4;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import ht1.C8808v4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import je1.C46547x1;
import je1.C60795a2;
import jp3.C9486a;
import jp3.C9487b;
import o40.C61926c;
import p629ny.C76979h;
import pe3.C89349b;
import rs1.C13442s8;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C64197v;
import te3.C49946j51;
import te3.C50124kf1;
import te3.C51695vh1;
import te3.C64689rq2;
import te3.C64854ye0;
import up1.C37521f;
import up1.C65426w0;
import vp1.C65838f;
import wp1.C66164a;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.r */
public final class C55776r extends C58555d implements C9487b<C9486a> {

    /* renamed from: t */
    public static boolean f158805t;

    /* renamed from: g */
    public final AppCompatActivity f158806g;

    /* renamed from: h */
    public final String f158807h = "Finder.FinderCommentPreloader";

    /* renamed from: i */
    public final CopyOnWriteArraySet<C9486a> f158808i = new CopyOnWriteArraySet<>();

    /* renamed from: j */
    public C32226l<? super Integer, ? extends C0740i2> f158809j;

    /* renamed from: n */
    public int f158810n;

    /* renamed from: o */
    public int f158811o = 2;

    /* renamed from: p */
    public Vector<Long> f158812p = new Vector<>();

    /* renamed from: q */
    public final Map<Long, FeedUpdateEvent> f158813q = new LinkedHashMap();

    /* renamed from: r */
    public final CopyOnWriteArrayList<Long> f158814r = new CopyOnWriteArrayList<>();

    /* renamed from: s */
    public int f158815s;

    public C55776r(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f158806g = appCompatActivity;
    }

    /* renamed from: E1 */
    public static final void m63512E1(C55776r rVar, LinkedList linkedList, long j) {
        long j2;
        long j3 = j;
        Class cls = C76979h.class;
        rVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
        Iterator it = linkedList.iterator();
        while (true) {
            j2 = 0;
            if (!it.hasNext()) {
                break;
            }
            FinderCommentInfo finderCommentInfo = (FinderCommentInfo) it.next();
            C87412m.m108594g(finderCommentInfo, "level1CommentInfo");
            C65426w0 w0Var = new C65426w0();
            w0Var.field_feedId = j3;
            w0Var.field_state = 2;
            C64854ye0 ye02 = w0Var.field_actionInfo;
            ye02.f186497e = finderCommentInfo;
            ye02.f186500h = 0;
            C55033u uVar = new C55033u(w0Var);
            ((C76979h) C86312j.m106911c(cls)).mo107057T1(MMApplicationContext.getContext(), uVar.f154492d.getContent());
            arrayList2.add(uVar);
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        int i = 0;
        while (it4.hasNext()) {
            Object next = it4.next();
            int i2 = i + 1;
            if (i >= 0) {
                C55033u uVar2 = (C55033u) next;
                arrayList3.add(uVar2);
                C65426w0 w0Var2 = uVar2.f154492d;
                if (w0Var2.field_actionInfo.f186500h == j2 && w0Var2.mo89540v2().size() > 0 && (i >= arrayList.size() - 1 || ((C55033u) arrayList.get(i2)).f154492d.field_actionInfo.f186500h == j2)) {
                    int size = uVar2.f154492d.mo89540v2().size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        FinderCommentInfo remove = uVar2.f154492d.mo89540v2().remove();
                        C87412m.m108593f(remove, "level2CommentInfo");
                        long itemId = uVar2.getItemId();
                        C65426w0 w0Var3 = new C65426w0();
                        w0Var3.field_feedId = j3;
                        w0Var3.field_state = 2;
                        C64854ye0 ye03 = w0Var3.field_actionInfo;
                        ye03.f186497e = remove;
                        ye03.f186500h = itemId;
                        C55033u uVar3 = new C55033u(w0Var3);
                        ((C76979h) C86312j.m106911c(cls)).mo107057T1(MMApplicationContext.getContext(), uVar3.f154492d.getContent());
                        C65426w0 w0Var4 = uVar3.f154492d;
                        w0Var4.getClass();
                        C58739j4 j4Var = C58739j4.f168176a;
                        int p2 = w0Var4.mo89533p2();
                        j4Var.getClass();
                        if ((p2 & 2) != 0) {
                            uVar3.f154504s = true;
                            arrayList3.add(uVar3);
                            break;
                        }
                        i3++;
                    }
                }
                i = i2;
                j2 = 0;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: F1 */
    public static final List m63513F1(C55776r rVar, List list, long j) {
        rVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C55033u uVar = (C55033u) next;
                arrayList.add(uVar);
                C65426w0 w0Var = uVar.f154492d;
                if (w0Var.field_actionInfo.f186500h != 0 || w0Var.mo89540v2().size() <= 0) {
                    List list2 = list;
                } else {
                    if (i >= list.size() - 1) {
                        List list3 = list;
                    } else if (((C55033u) list.get(i2)).f154492d.field_actionInfo.f186500h != 0) {
                    }
                    C37521f.f99374d.getClass();
                    if (C37521f.f99480p0.mo60266n().intValue() == 1) {
                        int size = uVar.f154492d.mo89540v2().size();
                        for (int i3 = 0; i3 < size; i3++) {
                            FinderCommentInfo remove = uVar.f154492d.mo89540v2().remove();
                            C66164a aVar = C66164a.f190162a;
                            C87412m.m108593f(remove, "level2Comment");
                            C55033u c = aVar.mo90222c(remove, j, uVar.getItemId());
                            c.f154504s = true;
                            arrayList.add(c);
                        }
                        int i4 = uVar.f154503r - size;
                        uVar.f154503r = i4;
                        if (i4 < 0) {
                            uVar.f154503r = 0;
                        }
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return arrayList;
    }

    /* renamed from: G1 */
    public static final void m63514G1(C55776r rVar, List list, List list2, long j) {
        int i;
        C55776r rVar2 = rVar;
        List list3 = list2;
        rVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FinderCommentInfo finderCommentInfo = ((C65426w0) it.next()).field_actionInfo.f186501i;
            if (finderCommentInfo != null) {
                Iterator it4 = arrayList2.iterator();
                int i2 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((FinderCommentInfo) it4.next()).commentId == finderCommentInfo.commentId) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                if (i < 0 && finderCommentInfo.commentId != 0) {
                    arrayList2.add(finderCommentInfo);
                }
            }
        }
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            FinderCommentInfo finderCommentInfo2 = (FinderCommentInfo) it5.next();
            Iterator it6 = list2.iterator();
            int i3 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((C55033u) it6.next()).f154492d.mo89531n2() == finderCommentInfo2.commentId) {
                    break;
                }
                i3++;
            }
            if (i3 >= 0) {
                list3.remove(i3);
                String str = rVar2.f158807h;
                Log.m105924i(str, "mergeLocalLevel2Comments, remove level1ExistIndex:" + i3 + ", id:" + finderCommentInfo2.commentId);
            }
            arrayList.add(C66164a.f190162a.mo90221b(finderCommentInfo2, j));
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                C65426w0 w0Var = (C65426w0) it7.next();
                if (w0Var.field_actionInfo.f186500h == finderCommentInfo2.commentId) {
                    C55033u uVar = new C55033u(w0Var);
                    ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), w0Var.getContent());
                    arrayList.add(uVar);
                }
            }
        }
        if (arrayList.size() > 0) {
            String str2 = rVar2.f158807h;
            Log.m105924i(str2, "mergeLocalLevel2Comments, total local size: " + arrayList.size() + ", level1 size:" + arrayList2.size());
        }
        list3.addAll(arrayList);
    }

    /* renamed from: J1 */
    public static /* synthetic */ void m63515J1(C55776r rVar, long j, String str, int i, boolean z, String str2, int i2, String str3, int i3, Object obj) {
        rVar.mo77390I1(j, str, i, z, str2, (i3 & 32) != 0 ? -1 : i2, (i3 & 64) != 0 ? "" : str3);
    }

    /* renamed from: B1 */
    public void mo2331B1(C7637b bVar) {
        C51695vh1 vh12;
        C51695vh1 vh13;
        C0740i2 i2Var;
        C87412m.m108594g(bVar, "ev");
        if (bVar instanceof C7642k) {
            int i = ((C7642k) bVar).f25959j;
            this.f158815s = i;
            if (i >= 0) {
                C32226l<? super Integer, ? extends C0740i2> lVar = this.f158809j;
                if (!(lVar == null || (i2Var = (C0740i2) lVar.invoke(Integer.valueOf(i))) == null || !(i2Var instanceof BaseFinderFeed))) {
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                    m63515J1(this, baseFinderFeed.mo3513o().getId(), baseFinderFeed.mo3513o().getObjectNonceId(), this.f158810n, baseFinderFeed.mo3513o().isOldVersion(), baseFinderFeed.mo3513o().getUserName(), i, (String) null, 64, (Object) null);
                }
            } else {
                return;
            }
        }
        if ((bVar instanceof C58259c.C58260a) && C66785b.f191882e.mo90681z1()) {
            C58259c.C58260a aVar = (C58259c.C58260a) bVar;
            if (aVar.f166811b == 3) {
                C32226l<? super Integer, ? extends C0740i2> lVar2 = this.f158809j;
                BaseFinderFeed baseFinderFeed2 = null;
                C0740i2 i2Var2 = lVar2 != null ? (C0740i2) lVar2.invoke(Integer.valueOf(this.f158815s)) : null;
                if (i2Var2 instanceof BaseFinderFeed) {
                    baseFinderFeed2 = (BaseFinderFeed) i2Var2;
                }
                if (baseFinderFeed2 != null) {
                    int i2 = this.f158815s;
                    C50124kf1 kf12 = baseFinderFeed2.mo3513o().getFeedObject().object_extend;
                    boolean z = false;
                    boolean z2 = (kf12 == null || (vh13 = kf12.f136748g) == null) ? false : vh13.f143486f;
                    C50124kf1 kf13 = baseFinderFeed2.mo3513o().getFeedObject().object_extend;
                    int i3 = (kf13 == null || (vh12 = kf13.f136748g) == null) ? -1 : vh12.f143487g;
                    C64689rq2 rq22 = aVar.f166813d;
                    int i4 = rq22 != null ? rq22.f185269g : 0;
                    String str = this.f158807h;
                    Log.m105924i(str, "[handlePreloadOnProgress] pos:" + i2 + " userPageIsPreload:" + z2 + ", commentWaitTime:" + i3 + ", offset:" + aVar.f166815f + " duration:" + i4);
                    if (z2) {
                        if (aVar.f166815f >= i3) {
                            z = true;
                        }
                        if (i3 > 0 && !this.f158814r.contains(Long.valueOf(baseFinderFeed2.getItemId())) && z) {
                            mo77390I1(baseFinderFeed2.mo3513o().getId(), baseFinderFeed2.mo3513o().getObjectNonceId(), this.f158810n, baseFinderFeed2.mo3513o().isOldVersion(), baseFinderFeed2.mo3513o().getUserName(), i2, "handlePreloadOnProgress");
                            this.f158814r.add(Long.valueOf(baseFinderFeed2.getItemId()));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: H1 */
    public final void mo77389H1(int i, int i2, C32226l<? super Integer, ? extends C0740i2> lVar) {
        Log.m105924i(this.f158807h, "onAttach");
        this.f158809j = lVar;
        this.f158811o = i;
        this.f158810n = i2;
    }

    /* renamed from: I1 */
    public final void mo77390I1(long j, String str, int i, boolean z, String str2, int i2, String str3) {
        ArrayList arrayList;
        List list;
        long j2 = j;
        int i3 = i;
        String str4 = str3;
        C87412m.m108594g(str2, "feedUsername");
        C87412m.m108594g(str4, "invokeSource");
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            Log.m105924i(this.f158807h, "***preloadFirstPageComment disable for 青少年模式");
        } else if (f158805t) {
            String str5 = this.f158807h;
            Log.m105924i(str5, "preloadFirstPageComment disable commentScene=" + i3);
        } else if (!C66785b.f191882e.mo90681z1() || C87412m.m108589b(str4, "handlePreloadOnProgress")) {
            C37521f.f99374d.getClass();
            if (!(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_preload_comment, 1) == 1)) {
                Log.m105924i(this.f158807h, "***preloadFirstPageComment disable");
            } else if (j2 == 0) {
                Log.m105924i(this.f158807h, "***preloadFirstPageComment feedId is 0");
            } else {
                C32226l<? super Integer, ? extends C0740i2> lVar = this.f158809j;
                C0740i2 i2Var = lVar != null ? (C0740i2) lVar.invoke(Integer.valueOf(i2)) : null;
                BaseFinderFeed baseFinderFeed = i2Var instanceof BaseFinderFeed ? (BaseFinderFeed) i2Var : null;
                boolean z2 = baseFinderFeed != null && baseFinderFeed.mo3477K();
                List<C65426w0> d = C65838f.f189333a.mo89883d(j2, 0);
                if (!z2) {
                    if (!(d == null)) {
                        String str6 = this.f158807h;
                        Log.m105924i(str6, "***preloadFirstPageComment has cache, feedId = " + C61926c.m72691p(j));
                        return;
                    }
                }
                if (this.f158812p.contains(Long.valueOf(j))) {
                    String str7 = this.f158807h;
                    Log.m105924i(str7, "***preloadFirstPageComment is loading, feedId = " + C61926c.m72691p(j));
                    return;
                }
                List list2 = C64186f0.f181907d;
                List<C65426w0> jo = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Ex0().mo89495jo(j2);
                if (!z) {
                    List arrayList2 = new ArrayList();
                    for (T next : jo) {
                        if (((C65426w0) next).field_actionInfo.f186500h != 0) {
                            arrayList2.add(next);
                        }
                        String str8 = str2;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (T next2 : jo) {
                        if (((C65426w0) next2).field_actionInfo.f186500h == 0) {
                            arrayList3.add(next2);
                        }
                    }
                    arrayList = arrayList3;
                    list = arrayList2;
                } else {
                    list = list2;
                    arrayList = jo;
                }
                this.f158812p.add(Long.valueOf(j));
                String str9 = this.f158807h;
                Log.m105924i(str9, "***preloadFirstPageComment start request, pos = " + i2 + ", feedId = " + C61926c.m72691p(j) + ", isHistoryFeed = " + z2);
                if (C66785b.f191882e.mo90681z1()) {
                    int i4 = this.f158811o;
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f158806g);
                    new C60795a2(j, str, i, i4, str2, (C89349b) null, (C65426w0) null, 0, false, f != null ? f.mo12861q3() : null, 3, 480, (C8480h) null).mo9225i().mo123064p(new C55775q(this, list, j, arrayList)).mo11397F(this);
                    return;
                }
                int i5 = this.f158811o;
                C13442s8 f2 = C13442s8.f38060Q0.mo12873f(this.f158806g);
                new C46547x1(j, str, i, i5, str2, false, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, f2 != null ? f2.mo12861q3() : null, 2, (C49946j51) null, false, 106464, (C8480h) null).mo9225i().mo123064p(new C55774o(this, j, list, arrayList, i2)).mo11397F(this);
            }
        } else {
            String str10 = this.f158807h;
            Log.m105924i(str10, "preloadFirstPageComment disable commentScene=" + i3 + "  for isEnableFinderGetCommentList invokeSource:" + str4);
        }
    }

    public void keep(C9486a aVar) {
        this.f158808i.add(aVar);
    }

    public final void onDetach() {
        Log.m105924i(this.f158807h, "onDetach");
        this.f158809j = null;
        for (C9486a dead : this.f158808i) {
            dead.dead();
        }
        f158805t = false;
        this.f158808i.clear();
        this.f158812p.clear();
        ((LinkedHashMap) this.f158813q).clear();
        this.f158814r.clear();
    }

    /* renamed from: z1 */
    public boolean mo2333z1(C58553c cVar, C7637b bVar) {
        C87412m.m108594g(cVar, "dispatcher");
        C87412m.m108594g(bVar, "event");
        if (!(bVar instanceof C7642k)) {
            return (bVar instanceof C58259c.C58260a) && ((C58259c.C58260a) bVar).f166811b == 3;
        }
        int i = ((C7642k) bVar).f25951b;
        return i == 0 || i == 5 || i == 4;
    }
}
