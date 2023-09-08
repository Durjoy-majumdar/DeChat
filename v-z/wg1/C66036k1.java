package wg1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58739j4;
import fj1.C45795b;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import ok1.C62042e;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import q31.C118148a;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: wg1.k1 */
public final class C66036k1 implements C66088u1 {

    /* renamed from: d */
    public final MMActivity f189845d;

    /* renamed from: e */
    public final C66083t1 f189846e;

    /* renamed from: f */
    public final View f189847f;

    /* renamed from: g */
    public TextView f189848g;

    /* renamed from: h */
    public PAGView f189849h;

    /* renamed from: i */
    public C66037a f189850i;

    /* renamed from: j */
    public final boolean f189851j = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76821Vb();

    /* renamed from: n */
    public int f189852n;

    /* renamed from: wg1.k1$a */
    public static final class C66037a extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public WeakReference<C66036k1> f189853d;

        public C66037a(C66036k1 k1Var) {
            C87412m.m108594g(k1Var, "viewCallback");
            this.f189853d = new WeakReference<>(k1Var);
        }

        public void onAnimationCancel(PAGView pAGView) {
        }

        public void onAnimationEnd(PAGView pAGView) {
            C66036k1 k1Var = this.f189853d.get();
            boolean z = k1Var == null;
            Log.m105924i("Finder.FinderLiveLuckyMoneyBubbleViewCallback", "onAnimationEnd emptyViewCallback:" + z);
            if (k1Var != null) {
                PAGView pAGView2 = k1Var.f189849h;
                if (pAGView2 != null) {
                    pAGView2.setComposition(k1Var.f189852n == 1 ? PAGFile.Load(k1Var.f189845d.getAssets(), "finder_live_lucky_money_repeated_1.pag") : PAGFile.Load(k1Var.f189845d.getAssets(), "finder_live_lucky_money_repeated_2.pag"));
                }
                PAGView pAGView3 = k1Var.f189849h;
                if (pAGView3 != null) {
                    pAGView3.removeListener(this);
                }
                PAGView pAGView4 = k1Var.f189849h;
                if (pAGView4 != null) {
                    pAGView4.setRepeatCount(0);
                }
                PAGView pAGView5 = k1Var.f189849h;
                if (pAGView5 != null) {
                    pAGView5.play();
                }
            }
        }

        public void onAnimationRepeat(PAGView pAGView) {
        }

        public void onAnimationStart(PAGView pAGView) {
        }
    }

    /* renamed from: wg1.k1$b */
    public static final class C66038b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66036k1 f189854d;

        public C66038b(C66036k1 k1Var) {
            this.f189854d = k1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66083t1 t1Var = this.f189854d.f189846e;
            if (t1Var != null) {
                t1Var.mo90134b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.k1$c */
    public static final class C66039c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66036k1 f189855d;

        public C66039c(C66036k1 k1Var) {
            this.f189855d = k1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66083t1 t1Var = this.f189855d.f189846e;
            if (t1Var != null) {
                t1Var.mo90134b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.k1$d */
    public static final class C66040d implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ C66036k1 f189856a;

        public C66040d(C66036k1 k1Var) {
            this.f189856a = k1Var;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C66083t1 t1Var = this.f189856a.f189846e;
            if (t1Var == null) {
                return null;
            }
            String F0 = t1Var.mo90133F0();
            if (F0 == null) {
                F0 = "";
            }
            int i = 1;
            C13604l[] lVarArr = new C13604l[1];
            if (!C87412m.m108589b(F0, "")) {
                i = 2;
            }
            lVarArr[0] = new C13604l("cur_red_packet_source", Integer.valueOf(i));
            return C90364q0.m113148g(lVarArr);
        }
    }

    public C66036k1(MMActivity mMActivity, C66083t1 t1Var, C45795b bVar, View view) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(view, "rootView");
        this.f189845d = mMActivity;
        this.f189846e = t1Var;
        this.f189847f = view;
        C58739j4.f168176a.mo83714i0("FinderLiveLuckyMoneyBubbleViewCallback");
    }

    /* renamed from: P */
    public void mo90066P(int i) {
        Log.m105924i("Finder.FinderLiveLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount: count:" + i + ", currentCnt=" + this.f189852n + ", pagView:" + this.f189849h + ", isPagEnable:" + this.f189851j);
        reset();
        int i2 = 8;
        if (i < 1) {
            View view = this.f189847f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i == 1) {
            PAGView pAGView = this.f189849h;
            if (pAGView != null) {
                pAGView.setComposition(PAGFile.Load(this.f189845d.getAssets(), "finder_live_lucky_money_section_1.pag"));
            }
        } else {
            PAGView pAGView2 = this.f189849h;
            if (pAGView2 != null) {
                pAGView2.setComposition(this.f189852n < 1 ? PAGFile.Load(this.f189845d.getAssets(), "finder_live_lucky_money_complete.pag") : PAGFile.Load(this.f189845d.getAssets(), "finder_live_lucky_money_section_2.pag"));
            }
        }
        this.f189852n = i;
        PAGView pAGView3 = this.f189849h;
        if (pAGView3 != null) {
            pAGView3.setRepeatCount(1);
        }
        PAGView pAGView4 = this.f189849h;
        if (pAGView4 != null) {
            pAGView4.play();
        }
        PAGView pAGView5 = this.f189849h;
        if (pAGView5 != null) {
            pAGView5.addListener(this.f189850i);
        }
        View view3 = this.f189847f;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        TextView textView = this.f189848g;
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append('x');
            sb.append(i);
            textView.setText(sb.toString());
        }
        TextView textView2 = this.f189848g;
        if (textView2 != null) {
            if (i != 1) {
                i2 = 0;
            }
            textView2.setVisibility(i2);
        }
    }

    /* renamed from: a */
    public void mo90067a() {
        Class cls = C61212e.class;
        TextView textView = (TextView) this.f189847f.findViewById(C0966R.C0970id.bf9);
        this.f189848g = textView;
        if (textView != null) {
            C62042e.f176370a.mo87033P1(textView);
        }
        this.f189849h = (PAGView) this.f189847f.findViewById(C0966R.C0970id.gbv);
        C66037a aVar = new C66037a(this);
        this.f189850i = aVar;
        PAGView pAGView = this.f189849h;
        if (pAGView != null) {
            pAGView.addListener(aVar);
        }
        PAGView pAGView2 = this.f189849h;
        if (pAGView2 != null) {
            pAGView2.setOnClickListener(new C66038b(this));
        }
        View view = this.f189847f;
        if (view != null) {
            view.setOnClickListener(new C66039c(this));
        }
        ((C61212e) C86312j.m106911c(cls)).o30(this.f189849h, "finder_live_red_packet");
        if (!C62042e.f176370a.mo87027N0()) {
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f189849h, 40, 25561);
            ((C61212e) C86312j.m106911c(cls)).E60(this.f189849h, new C66040d(this));
        }
    }

    public void destroy() {
    }

    /* renamed from: e */
    public View mo90069e() {
        return this.f189847f;
    }

    public MMFragmentActivity getActivity() {
        return this.f189845d;
    }

    public void release() {
        View view = this.f189847f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "release", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "release", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        reset();
    }

    public void reset() {
        PAGView pAGView;
        PAGView pAGView2 = this.f189849h;
        boolean z = true;
        if (pAGView2 == null || !pAGView2.isPlaying()) {
            z = false;
        }
        if (z && (pAGView = this.f189849h) != null) {
            pAGView.stop();
        }
        PAGView pAGView3 = this.f189849h;
        if (pAGView3 != null) {
            pAGView3.removeListener(this.f189850i);
        }
    }
}
