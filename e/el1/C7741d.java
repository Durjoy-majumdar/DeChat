package el1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bd1.C54446b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI;
import com.tencent.p014mm.plugin.finder.view.C4226y6;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import qo3.C101218e0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sg1.C13677a;
import sx3.C64197v;
import te3.C50555nj3;
import te3.C51020qw0;
import te3.C51745vv0;
import te3.C51946xa1;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: el1.d */
public final class C7741d extends UIComponent {

    /* renamed from: A */
    public C51020qw0 f26214A = new C51020qw0();

    /* renamed from: B */
    public boolean f26215B;

    /* renamed from: C */
    public int f26216C;

    /* renamed from: D */
    public boolean f26217D;

    /* renamed from: d */
    public final C13601g f26218d;

    /* renamed from: e */
    public ViewGroup f26219e;

    /* renamed from: f */
    public View f26220f;

    /* renamed from: g */
    public TextView f26221g;

    /* renamed from: h */
    public View f26222h;

    /* renamed from: i */
    public View f26223i;

    /* renamed from: j */
    public TextView f26224j;

    /* renamed from: n */
    public View f26225n;

    /* renamed from: o */
    public TextView f26226o;

    /* renamed from: p */
    public View f26227p;

    /* renamed from: q */
    public View f26228q;

    /* renamed from: r */
    public TextView f26229r;

    /* renamed from: s */
    public View f26230s;

    /* renamed from: t */
    public TextView f26231t;

    /* renamed from: u */
    public View f26232u;

    /* renamed from: v */
    public View f26233v;

    /* renamed from: w */
    public TextView f26234w;

    /* renamed from: x */
    public C101218e0 f26235x;

    /* renamed from: y */
    public C7045j f26236y;

    /* renamed from: z */
    public LinkedList<C51745vv0> f26237z = new LinkedList<>();

    /* renamed from: el1.d$a */
    public static final class C7742a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C7742a f26238d = new C7742a();

        public C7742a() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (C32444a.f86092Q0.mo60266n().intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: el1.d$b */
    public static final class C7743b extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7741d f26239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7743b(C7741d dVar) {
            super(1);
            this.f26239d = dVar;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            Log.m105924i("FinderLiveChargeWhiteListUIC", "live charge choose wecoin:" + intValue);
            this.f26239d.mo8862d3(intValue);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7741d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C13601g a = C36568h.m40985a(C7742a.f26238d);
        this.f26218d = a;
        Boolean bool = null;
        C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
        int i = c != null ? c.mo75251m2().f132499j : 0;
        this.f26216C = i;
        this.f26217D = C61926c.m72696u(i, 8);
        Boolean valueOf = Boolean.valueOf(appCompatActivity.getIntent().getBooleanExtra("KEY_PARAMS_LIVE_CHARGE_HIDE", false));
        bool = valueOf.booleanValue() ? valueOf : bool;
        if (bool != null) {
            bool.booleanValue();
            this.f26217D = false;
        }
        Log.m105924i("FinderLiveChargeWhiteListUIC", "init liveFlag:" + this.f26216C + ",livePurchaseEnable:" + this.f26217D + ",enableChooseChargeMode:" + ((Boolean) ((C36570n) a).getValue()).booleanValue() + '!');
    }

    /* renamed from: c3 */
    public void mo8861c3(boolean z) {
        if (z) {
            mo8862d3(this.f26214A.f140581e);
            mo8864f3();
            mo8865g3();
            mo8866i3();
            ViewGroup viewGroup = this.f26219e;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.f26219e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        C51946xa1 xa12 = this.f26214A.f140582f;
        if (xa12 != null) {
            xa12.f144557d.clear();
            xa12.f144558e.clear();
            xa12.f144559f.clear();
            xa12.f144560g.clear();
        }
        mo8865g3();
        mo8866i3();
    }

    /* renamed from: d3 */
    public final void mo8862d3(int i) {
        this.f26214A.f140581e = i;
        if (i > 0) {
            TextView textView = this.f26229r;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            TextView textView2 = this.f26229r;
            if (textView2 != null) {
                textView2.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
            }
            View view = this.f26228q;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC", "setChargeCost", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC", "setChargeCost", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f26214A.f140580d = 2;
        } else {
            TextView textView3 = this.f26229r;
            if (textView3 != null) {
                textView3.setText(getContext().getResources().getString(C0966R.string.n7q));
            }
            TextView textView4 = this.f26229r;
            if (textView4 != null) {
                textView4.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
            }
            View view3 = this.f26228q;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC", "setChargeCost", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC", "setChargeCost", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f26214A.f140580d = 0;
        }
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI");
        ((FinderLiveVisitorWhiteListUI) activity).mo3040O7();
    }

    /* renamed from: e3 */
    public final void mo8863e3() {
        new C4226y6(getActivity(), new C7743b(this)).mo5095a(C64197v.m75537f(10, 500, 1000, 2000));
    }

    /* renamed from: f3 */
    public final void mo8864f3() {
        C50555nj3 nj32 = this.f26214A.f140583g;
        boolean z = false;
        if (nj32 != null && nj32.f138632d == 2) {
            z = true;
        }
        int i = 180;
        if (z) {
            TextView textView = this.f26231t;
            if (textView != null) {
                textView.setText(getString(C0966R.string.n78));
            }
            C50555nj3 nj33 = this.f26214A.f140583g;
            if (nj33 != null) {
                i = nj33.f138634f;
            }
            TextView textView2 = this.f26234w;
            if (textView2 != null) {
                textView2.setText(C13677a.f38723a.mo13061a(getActivity(), i, 2));
            }
        } else {
            TextView textView3 = this.f26231t;
            if (textView3 != null) {
                textView3.setText(getString(C0966R.string.n76));
            }
            C50555nj3 nj34 = this.f26214A.f140583g;
            if (nj34 != null) {
                i = nj34.f138633e;
            }
            TextView textView4 = this.f26234w;
            if (textView4 != null) {
                textView4.setText(C13677a.f38723a.mo13061a(getActivity(), i, 1));
            }
        }
        if (this.f26215B) {
            TextView textView5 = this.f26234w;
            if (textView5 != null) {
                textView5.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
                return;
            }
            return;
        }
        TextView textView6 = this.f26234w;
        if (textView6 != null) {
            textView6.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
        }
    }

    /* renamed from: g3 */
    public final void mo8865g3() {
        FinderLiveVisitorWhiteListUI.C2981a aVar = FinderLiveVisitorWhiteListUI.f14583v;
        C51946xa1 xa12 = this.f26214A.f140582f;
        LinkedList<String> linkedList = xa12 != null ? xa12.f144559f : null;
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        String b = aVar.mo3050b(linkedList);
        if (b.length() == 0) {
            TextView textView = this.f26221g;
            if (textView != null) {
                textView.setText(getContext().getResources().getString(C0966R.string.n9i));
            }
            TextView textView2 = this.f26221g;
            if (textView2 != null) {
                textView2.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                return;
            }
            return;
        }
        TextView textView3 = this.f26221g;
        if (textView3 != null) {
            textView3.setText(b);
        }
        TextView textView4 = this.f26221g;
        if (textView4 != null) {
            textView4.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
        }
    }

    /* renamed from: i3 */
    public final void mo8866i3() {
        boolean z = false;
        if (this.f26237z.size() > 0) {
            TextView textView = this.f26224j;
            if (textView != null) {
                textView.setVisibility(0);
            }
            View view = this.f26225n;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC", "updateWhiteList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC", "updateWhiteList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView2 = this.f26226o;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            TextView textView3 = this.f26224j;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
            View view2 = this.f26225n;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(4);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC", "updateWhiteList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC", "updateWhiteList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView4 = this.f26226o;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        }
        FinderLiveVisitorWhiteListUI.C2981a aVar3 = FinderLiveVisitorWhiteListUI.f14583v;
        C51946xa1 xa12 = this.f26214A.f140582f;
        String a = aVar3.mo3049a(xa12 != null ? xa12.f144560g : null);
        if (a.length() == 0) {
            z = true;
        }
        if (z) {
            TextView textView5 = this.f26224j;
            if (textView5 != null) {
                textView5.setText(getContext().getResources().getString(C0966R.string.n_5));
            }
            TextView textView6 = this.f26224j;
            if (textView6 != null) {
                textView6.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
                return;
            }
            return;
        }
        TextView textView7 = this.f26224j;
        if (textView7 != null) {
            textView7.setText(a);
        }
        TextView textView8 = this.f26224j;
        if (textView8 != null) {
            textView8.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
        }
    }
}
