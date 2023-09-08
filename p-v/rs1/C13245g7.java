package rs1;

import androidx.appcompat.app.AppCompatActivity;
import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import je1.C9331l1;
import jq3.C60905o;
import nr3.C89059e;
import p185kq.C10383h;
import qn1.C12883c;
import rs1.C13502w6;
import rx3.C13598b0;
import te3.C50816pe1;
import te3.C50949qe1;
import te3.C51096re1;
import up1.C37521f;

/* renamed from: rs1.g7 */
public final class C13245g7 extends C87413o implements C32226l<BaseFinderFeed, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13502w6 f37605d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f37606e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13245g7(C13502w6 w6Var, C60905o oVar) {
        super(1);
        this.f37605d = w6Var;
        this.f37606e = oVar;
    }

    public Object invoke(Object obj) {
        boolean z;
        T t;
        C89059e eVar;
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) obj;
        C87412m.m108594g(baseFinderFeed, LocaleUtil.ITALIAN);
        Log.m105924i("Finder.FinderNpsSurveyUIC", "showSurveyLayout feedId = " + ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(baseFinderFeed.getItemId()));
        C13502w6.f38268s.add(Long.valueOf(baseFinderFeed.getItemId()));
        C51096re1 re12 = C13502w6.f38270u.get(Long.valueOf(baseFinderFeed.getItemId()));
        if (re12 != null) {
            ConcurrentHashMap<Long, C13502w6.C13504b> concurrentHashMap = C13502w6.f38271v;
            Long valueOf = Long.valueOf(baseFinderFeed.getItemId());
            C13502w6.C13504b bVar = r5;
            C13502w6.C13504b bVar2 = new C13502w6.C13504b(C13502w6.C13505c.HIDE, System.currentTimeMillis(), 1, this.f37605d.f38275g, (List) null, (List) null, (Map) null, (C50949qe1) null, 240, (C8480h) null);
            concurrentHashMap.put(valueOf, bVar);
            C12883c.C12885b bVar3 = C12883c.f36861h;
            bVar3.mo12405a().mo12404h(re12.f140853d);
            bVar3.mo12405a().getClass();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_NPS_SURVEY_LAST_SHOW_TIME_LONG_SYNC, Long.valueOf(C31543z5.m39453c() / 1000));
            C13502w6 w6Var = this.f37605d;
            C60905o oVar = this.f37606e;
            w6Var.getClass();
            C50816pe1 Q3 = C13502w6.m12821Q3(w6Var, oVar, (C32226l) null, 2, (Object) null);
            if (Q3 != null) {
                LinkedList<C50949qe1> linkedList = Q3.f139722e;
                C87412m.m108593f(linkedList, "info.questions");
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C50949qe1) t).f140257d == Q3.f139723f) {
                        break;
                    }
                }
                C50949qe1 qe12 = (C50949qe1) t;
                if (qe12 != null) {
                    if (qe12.f140260g != 1) {
                        z = true;
                    }
                    if (!z) {
                        w6Var.mo12903F3(oVar, qe12, (C32224a<C13598b0>) null);
                    } else {
                        int i = qe12.f140261h;
                        if (i == 1) {
                            w6Var.mo12905I3(oVar, qe12, (C32224a<C13598b0>) null);
                        } else if (i == 2) {
                            w6Var.mo12904G3(oVar, qe12, (C32224a<C13598b0>) null);
                        }
                    }
                    C51096re1 re13 = C13502w6.f38270u.get(Long.valueOf(((C0740i2) oVar.f173503E).getItemId()));
                    if (re13 != null) {
                        long j = re13.f140853d;
                        long j2 = Q3.f139721d;
                        Log.m105924i("Finder.FinderNpsSurveyUIC", "surveyShow taskId=" + j + ", surveyId=" + j2);
                        if (w6Var.getActivity() instanceof MMActivity) {
                            eVar = new C9331l1(j, j2).mo9225i();
                            AppCompatActivity activity = w6Var.getActivity();
                            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                            eVar.mo11397F((MMActivity) activity);
                        } else {
                            eVar = new C9331l1(j, j2).mo9225i();
                        }
                        eVar.mo123062e(C13276i7.f37688a);
                    }
                }
            }
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99514s7.mo60266n().intValue();
            long j3 = intValue == 0 ? (long) (re12.f140862p * ((float) 1000)) : ((long) intValue) * 1000;
            if (j3 > 0) {
                Log.m105924i("Finder.FinderNpsSurveyUIC", "showSurveyLayout timerHandler.postDelayed " + j3 + " ms");
                C13502w6 w6Var2 = this.f37605d;
                w6Var2.f38274f.postDelayed(new C13234f7(w6Var2, this.f37606e), j3);
            }
        }
        return C13598b0.f38549a;
    }
}
