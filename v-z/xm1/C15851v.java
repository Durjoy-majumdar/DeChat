package xm1;

import ak1.C54059a;
import ak1.C54067f0;
import an1.C0091d;
import an1.C0093f;
import an1.C0098k;
import an1.C0101n;
import an1.C0103p;
import bl3.C39818r;
import bn1.C0331b;
import c30.C104289g;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.Set;
import jq3.C9493c;
import jq3.C9494d;
import jq3.C9499g;
import ln1.C10584f;
import rs1.C13442s8;
import te3.C48682a91;
import te3.C49098d51;
import te3.C49114d91;
import te3.C64273c21;
import z04.C112551y;

/* renamed from: xm1.v */
public final class C15851v extends C9499g<C9493c> {

    /* renamed from: a */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f42679a;

    public C15851v(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback) {
        this.f42679a = liveEntranceFragmentViewCallback;
    }

    /* renamed from: b */
    public void mo752b(Set<C9494d<C9493c>> set) {
        Iterator<T> it;
        String str;
        String num;
        String num2;
        C49114d91 d912;
        C49098d51 d512;
        FinderItem o;
        C64273c21 liveInfo;
        C48682a91 a912;
        String str2;
        C87412m.m108594g(set, "recordsSet");
        Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "onExposeTimeRecorded: size = " + set.size());
        LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback = this.f42679a;
        Iterator<T> it4 = set.iterator();
        while (it4.hasNext()) {
            C9494d dVar = (C9494d) it4.next();
            liveEntranceFragmentViewCallback.getClass();
            Class cls = C13442s8.class;
            C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;
            C39818r rVar = C39818r.f106831a;
            C10584f fVar = (C10584f) rVar.mo62444c(liveEntranceFragmentViewCallback.f15702a).mo75002a(C10584f.class);
            if (fVar != null) {
                T t = dVar.f29663a;
                if (t instanceof C0091d) {
                    fVar.f31923e = dVar.f29667e;
                } else {
                    it = it4;
                    if (t instanceof C0093f) {
                        fVar.f31922d = dVar.f29667e;
                        C104289g gVar = new C104289g();
                        gVar.mo145967r("page_index", Integer.valueOf(dVar.f29667e));
                        String d = liveEntranceFragmentViewCallback.f15719r.mo14668d(dVar.f29667e, dVar.f29668f, "onExpose");
                        String str3 = liveEntranceFragmentViewCallback.f15705d.f134671e;
                        String gVar2 = gVar.toString();
                        C87412m.m108593f(gVar2, "eldUdfKv.toString()");
                        fVar.mo10841c3(d, str3, "main_page_focus_list", C112551y.m153814n(gVar2, ",", ";", false));
                    } else {
                        boolean z = t instanceof C0103p;
                        String str4 = "";
                        C0103p pVar = null;
                        if (z) {
                            if (z) {
                                pVar = (C0103p) t;
                            }
                            C0103p pVar2 = pVar;
                            if (!(pVar2 == null || (a912 = pVar2.f545d) == null || (str2 = a912.f130379f) == null)) {
                                str4 = str2;
                            }
                            fVar.f31925g.put(str4, Integer.valueOf(dVar.f29667e));
                            C104289g gVar3 = new C104289g();
                            gVar3.mo145967r("page_index", Integer.valueOf(dVar.f29667e));
                            gVar3.mo145967r("column_id", str4);
                            String d2 = liveEntranceFragmentViewCallback.f15719r.mo14668d(dVar.f29667e, dVar.f29668f, "onExpose");
                            String str5 = liveEntranceFragmentViewCallback.f15705d.f134671e;
                            String gVar4 = gVar3.toString();
                            C87412m.m108593f(gVar4, "eldUdfKv.toString()");
                            fVar.mo10841c3(d2, str5, "main_page_column", C112551y.m153814n(gVar4, ",", ";", false));
                        } else if (t instanceof C0098k) {
                            int i = dVar.f29667e;
                            fVar.f31924f = i;
                            fVar.mo10841c3(liveEntranceFragmentViewCallback.f15719r.mo14668d(i, dVar.f29668f, "onExpose"), liveEntranceFragmentViewCallback.f15705d.f134671e, "main_page_recmd_more", str4);
                        } else {
                            boolean z2 = t instanceof C0101n;
                            if (z2 ? true : t instanceof C0331b) {
                                int i2 = z2 ? 2 : 1;
                                C104289g gVar5 = new C104289g();
                                String str6 = str4;
                                gVar5.mo145967r("page_index", Integer.valueOf(fVar.f31924f));
                                gVar5.mo145967r("card_type", Integer.valueOf(i2));
                                gVar5.mo145967r("card_index", Integer.valueOf(dVar.f29667e - fVar.f31924f));
                                T t2 = dVar.f29663a;
                                C0331b bVar = t2 instanceof C0331b ? (C0331b) t2 : null;
                                gVar5.mo145967r("liveid", (bVar == null || (o = bVar.mo3513o()) == null || (liveInfo = o.getLiveInfo()) == null) ? str6 : Long.valueOf(liveInfo.f182392d));
                                T t3 = dVar.f29663a;
                                C0101n nVar = t3 instanceof C0101n ? (C0101n) t3 : null;
                                if (nVar == null || (d912 = nVar.f541d) == null || (d512 = d912.f132196d) == null || (str = d512.f132122h) == null) {
                                    str = str6;
                                }
                                gVar5.mo145967r("Noticeid", str);
                                String d3 = liveEntranceFragmentViewCallback.f15719r.mo14668d(dVar.f29667e, dVar.f29668f, "onExpose");
                                String str7 = liveEntranceFragmentViewCallback.f15705d.f134671e;
                                String gVar6 = gVar5.toString();
                                C87412m.m108593f(gVar6, "eldUdfKv.toString()");
                                fVar.mo10841c3(d3, str7, "main_page_recmd_card", C112551y.m153814n(gVar6, ",", ";", false));
                                C104289g gVar7 = new C104289g();
                                gVar7.mo145967r("main_page_position", 4);
                                if (fVar.f31930o != 0) {
                                    String str8 = fVar.f31931p;
                                    if (!(str8 == null || str8.length() == 0)) {
                                        gVar7.mo145967r("pull_liveid", Long.valueOf(fVar.f31930o));
                                        gVar7.mo145967r("pull_commentsence", fVar.f31931p);
                                    }
                                }
                                T t4 = dVar.f29663a;
                                boolean z3 = t4 instanceof C0101n;
                                if (z3) {
                                    C0101n nVar2 = z3 ? (C0101n) t4 : null;
                                    if (nVar2 != null) {
                                        C54059a aVar = liveEntranceFragmentViewCallback.f15718q;
                                        int i3 = dVar.f29667e;
                                        C13442s8 s8Var = (C13442s8) rVar.mo62444c(liveEntranceFragmentViewCallback.f15702a).mo75002a(cls);
                                        String str9 = (s8Var == null || (num2 = Integer.valueOf(s8Var.f38096i).toString()) == null) ? str6 : num2;
                                        String gVar8 = gVar7.toString();
                                        C87412m.m108593f(gVar8, "chnlExtra.toString()");
                                        aVar.mo74735d(nVar2, i3, qVar, str9, "", gVar8);
                                    }
                                } else {
                                    C0331b bVar2 = t4 instanceof C0331b ? (C0331b) t4 : null;
                                    if (bVar2 != null) {
                                        C54059a aVar2 = liveEntranceFragmentViewCallback.f15718q;
                                        int i4 = dVar.f29667e;
                                        C13442s8 s8Var2 = (C13442s8) rVar.mo62444c(liveEntranceFragmentViewCallback.f15702a).mo75002a(cls);
                                        String str10 = (s8Var2 == null || (num = Integer.valueOf(s8Var2.f38096i).toString()) == null) ? str6 : num;
                                        String gVar9 = gVar7.toString();
                                        C87412m.m108593f(gVar9, "chnlExtra.toString()");
                                        aVar2.mo74735d(bVar2, i4, qVar, str10, "", gVar9);
                                    }
                                }
                            } else {
                                Log.m105928w("Finder.LiveEntranceFragmentViewCallback", "handleExposeReport unknown feed:" + dVar.f29663a);
                            }
                        }
                    }
                    Set<C9494d<C9493c>> set2 = set;
                    it4 = it;
                }
            }
            it = it4;
            Set<C9494d<C9493c>> set22 = set;
            it4 = it;
        }
        C15826d.f42633a.mo14505a(this.f42679a.f15702a, set);
    }

    /* renamed from: c */
    public void mo753c(C9494d<C9493c> dVar) {
        C87412m.m108594g(dVar, "item");
    }
}
