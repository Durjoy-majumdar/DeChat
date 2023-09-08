package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import p185kq.C10383h;
import q31.C118148a;
import rs1.C13140c8;
import rs1.C13484v3;
import rs1.C13572z9;
import rs1.C63547e;
import rs1.C63580na;
import rs1.C63586o;
import rs1.C63654v2;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110826x0;
import sx3.C90364q0;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderFollowTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment */
public final class FinderFollowTabFragment extends FinderHomeTabFragment {

    /* renamed from: q */
    public final C13601g f17328q = C36568h.m40985a(C3816b.f17330d);

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment$a */
    public static final class C3815a implements C118148a {

        /* renamed from: a */
        public static final C3815a f17329a = new C3815a();

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            C13604l[] lVarArr = new C13604l[5];
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            lVarArr[0] = new C13604l("behaviour_session_id", Wb);
            String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
            if (E == null) {
                E = "";
            }
            lVarArr[1] = new C13604l("finder_context_id", E);
            String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
            if (S0 == null) {
                S0 = "";
            }
            lVarArr[2] = new C13604l("finder_tab_context_id", S0);
            lVarArr[3] = new C13604l("extra_info", "");
            lVarArr[4] = new C13604l("enter_source_info", "");
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment$b */
    public static final class C3816b extends C87413o implements C32224a<Class<? extends UIComponent>> {

        /* renamed from: d */
        public static final C3816b f17330d = new C3816b();

        public C3816b() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            return C37521f.f99315W0.mo60266n().intValue() == 1 ? FinderTwoFlowTimelineUIC.class : FinderTimelineUIC.class;
        }
    }

    public FinderFollowTabFragment() {
        super(C0966R.string.eqk, 3);
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        HashSet b = C110826x0.m151014b((Class) ((C36570n) this.f17328q).getValue(), C63586o.class, C63580na.class, C63547e.class, C13572z9.class, C13140c8.class, C63654v2.class);
        b.add(C13484v3.class);
        return b;
    }

    /* renamed from: R */
    public int mo2203R() {
        return C87412m.m108589b((Class) ((C36570n) this.f17328q).getValue(), FinderTimelineUIC.class) ? 17 : 155;
    }

    /* renamed from: S */
    public void mo4177S() {
        Class cls = FinderTimelineUIC.class;
        if (C87412m.m108589b((Class) ((C36570n) this.f17328q).getValue(), cls)) {
            ((FinderTimelineUIC) mo82247K(cls)).mo5174f3(true);
        } else {
            ((FinderTwoFlowTimelineUIC) mo82247K(FinderTwoFlowTimelineUIC.class)).mo5179d3(true);
        }
        C63586o oVar = (C63586o) mo82247K(C63586o.class);
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.FinderFollowTabFragment);
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder);
        Class<FinderFollowTabFragment> cls2 = FinderFollowTabFragment.class;
        ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "FinderFollowTabFragment");
        ((C61212e) C86312j.m106911c(cls)).mo86172oE(this, true);
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 40, 24184);
        ((C61212e) C86312j.m106911c(cls)).E60(this, C3815a.f17329a);
    }
}
