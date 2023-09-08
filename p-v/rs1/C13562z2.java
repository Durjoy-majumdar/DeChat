package rs1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C26896y;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8789o2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l31.C61212e;
import nj3.C76901s0;
import q31.C118148a;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;
import te3.C49712hj1;
import tf0.C64916p1;
import up1.C37521f;

/* renamed from: rs1.z2 */
public final class C13562z2 extends UIComponent implements C8789o2 {

    /* renamed from: d */
    public boolean f38474d;

    /* renamed from: e */
    public boolean f38475e;

    /* renamed from: f */
    public BaseFinderFeed f38476f;

    /* renamed from: g */
    public String f38477g = "";

    /* renamed from: h */
    public C76901s0 f38478h;

    /* renamed from: h4 */
    public final C13601g f38479h4;

    /* renamed from: i */
    public final ConcurrentHashMap<Long, C13563a> f38480i = new ConcurrentHashMap<>();

    /* renamed from: j */
    public final boolean f38481j;

    /* renamed from: n */
    public final C13601g f38482n;

    /* renamed from: rs1.z2$a */
    public interface C13563a {
        /* renamed from: a */
        void mo12960a();

        /* renamed from: b */
        void mo12961b(boolean z);

        /* renamed from: c */
        void mo12962c(String str);
    }

    /* renamed from: rs1.z2$b */
    public static final class C13564b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C13564b f38483d = new C13564b();

        public C13564b() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            return Integer.valueOf(C37521f.f99445l1.mo60266n().intValue() * 2);
        }
    }

    /* renamed from: rs1.z2$c */
    public static final class C13565c implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C49712hj1 f38484a;

        public C13565c(C49712hj1 hj12) {
            this.f38484a = hj12;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C13604l[] lVarArr = new C13604l[4];
            C49712hj1 hj12 = this.f38484a;
            Integer num = null;
            lVarArr[0] = new C13604l("behaviour_session_id", hj12 != null ? hj12.f134670d : null);
            lVarArr[1] = new C13604l("finder_context_id", hj12 != null ? hj12.f134671e : null);
            lVarArr[2] = new C13604l("finder_tab_context_id", hj12 != null ? hj12.f134672f : null);
            if (hj12 != null) {
                num = Integer.valueOf(hj12.f134675i);
            }
            lVarArr[3] = new C13604l("comment_scene", num);
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: rs1.z2$d */
    public static final class C13566d extends C87413o implements C32224a<Runnable> {

        /* renamed from: B */
        public final /* synthetic */ C13562z2 f38485B;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13566d(C13562z2 z2Var) {
            super(0);
            this.f38485B = z2Var;
        }

        public Object invoke() {
            return new C26896y(this.f38485B);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13562z2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C37521f.f99374d.getClass();
        this.f38481j = C37521f.f99168F3.mo60266n().intValue() != 1 ? false : true;
        this.f38482n = C36568h.m40985a(C13564b.f38483d);
        this.f38479h4 = C36568h.m40985a(new C13566d(this));
    }

    /* renamed from: c3 */
    public final void mo12959c3(View view, String str, String str2, String str3, int i) {
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        eVar.o30(view, str);
        eVar.mo86175pO(view, i, 25496);
        eVar.mo86149PM(view, C90364q0.m113147f(new C13604l("feed_id", str2), new C13604l("comment_text", str3)));
        C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(getActivity());
        eVar.E60(view, new C13565c(gr02 != null ? gr02.mo12861q3() : null));
    }

    public void onDestroy() {
        super.onDestroy();
        getRootView().removeCallbacks((Runnable) ((C36570n) this.f38479h4).getValue());
        this.f38480i.clear();
    }

    public void onPause() {
        super.onPause();
        this.f38475e = true;
    }

    public void onResume() {
        super.onResume();
        this.f38475e = false;
        if (this.f38474d) {
            getRootView().removeCallbacks((Runnable) ((C36570n) this.f38479h4).getValue());
            getRootView().postDelayed((Runnable) ((C36570n) this.f38479h4).getValue(), 500);
            this.f38474d = false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13562z2(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C37521f.f99374d.getClass();
        this.f38481j = C37521f.f99168F3.mo60266n().intValue() != 1 ? false : true;
        this.f38482n = C36568h.m40985a(C13564b.f38483d);
        this.f38479h4 = C36568h.m40985a(new C13566d(this));
    }
}
