package il1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import bl3.C39818r;
import cl1.C54991o;
import cl1.C55001u;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveWrapContentViewPager;
import com.tencent.p014mm.plugin.finder.view.FinderLiveVisitorFansRightView;
import com.tencent.p014mm.plugin.finder.view.FinderLiveVisitorFansTaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import de3.C75375u;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import k60.C60979d;
import nr3.C89059e;
import ok1.C62042e;
import p629ny.C76979h;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qg1.C12226j;
import qj1.C12677tg;
import qj1.C62660c;
import qk1.C12788a1;
import qo3.C12925w;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import te3.C64273c21;
import up1.C27696y;
import z04.C112550d0;
import zc1.C66785b;

/* renamed from: il1.h4 */
public final class C9012h4 extends C9120u0 implements View.OnClickListener {

    /* renamed from: A */
    public final TextView f28461A;

    /* renamed from: B */
    public final FinderLiveVisitorFansTaskView f28462B;

    /* renamed from: C */
    public final FinderLiveVisitorFansRightView f28463C;

    /* renamed from: D */
    public final C12788a1 f28464D;

    /* renamed from: E */
    public final FinderLiveWrapContentViewPager f28465E;

    /* renamed from: F */
    public final TabLayout f28466F;

    /* renamed from: G */
    public final C13601g f28467G;

    /* renamed from: h */
    public C32224a<C13598b0> f28468h;

    /* renamed from: i */
    public C32224a<C13598b0> f28469i;

    /* renamed from: j */
    public C12925w f28470j;

    /* renamed from: n */
    public final boolean f28471n;

    /* renamed from: o */
    public int f28472o;

    /* renamed from: p */
    public final View f28473p;

    /* renamed from: q */
    public final View f28474q;

    /* renamed from: r */
    public final LiveBottomSheetPanel f28475r;

    /* renamed from: s */
    public final View f28476s;

    /* renamed from: t */
    public final View f28477t;

    /* renamed from: u */
    public final TextView f28478u;

    /* renamed from: v */
    public final ImageView f28479v;

    /* renamed from: w */
    public final NestedScrollView f28480w;

    /* renamed from: x */
    public final ProgressBar f28481x;

    /* renamed from: y */
    public final TextView f28482y;

    /* renamed from: z */
    public final TextView f28483z;

    /* renamed from: il1.h4$a */
    public static final class C9013a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C9013a f28484d = new C9013a();

        public C9013a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("FinderLiveFansTaskWidget");
        }
    }

    /* renamed from: il1.h4$b */
    public static final class C9014b implements ViewPager.OnPageChangeListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveWrapContentViewPager f28485d;

        public C9014b(FinderLiveWrapContentViewPager finderLiveWrapContentViewPager) {
            this.f28485d = finderLiveWrapContentViewPager;
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            this.f28485d.reMeasureCurrentPage(i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9012h4(Context context) {
        super(context);
        float f;
        C87412m.m108594g(context, "context");
        boolean z = context.getResources().getConfiguration().orientation == 2;
        this.f28471n = z;
        if (z) {
            float height = getHEIGHT();
            float width = getWIDTH();
            f = (height > width ? width : height) - ((float) MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv));
        } else {
            f = getHEIGHT() * (((float) C32444a.f86121a.mo58621b()) / 100.0f);
        }
        this.f28472o = (int) f;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.agb, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…sk_widget_ui, this, true)");
        this.f28473p = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.csc);
        this.f28474q = findViewById;
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) inflate.findViewById(C0966R.C0970id.csd);
        this.f28475r = liveBottomSheetPanel;
        View findViewById2 = liveBottomSheetPanel.findViewById(C0966R.C0970id.csg);
        this.f28476s = findViewById2;
        View findViewById3 = liveBottomSheetPanel.findViewById(C0966R.C0970id.cs_);
        this.f28477t = findViewById3;
        this.f28478u = (TextView) liveBottomSheetPanel.findViewById(C0966R.C0970id.csb);
        this.f28479v = (ImageView) liveBottomSheetPanel.findViewById(C0966R.C0970id.csa);
        this.f28480w = (NestedScrollView) liveBottomSheetPanel.findViewById(C0966R.C0970id.csi);
        RelativeLayout relativeLayout = (RelativeLayout) liveBottomSheetPanel.findViewById(C0966R.C0970id.iya);
        this.f28481x = (ProgressBar) liveBottomSheetPanel.findViewById(C0966R.C0970id.csh);
        this.f28482y = (TextView) liveBottomSheetPanel.findViewById(C0966R.C0970id.cto);
        this.f28483z = (TextView) liveBottomSheetPanel.findViewById(C0966R.C0970id.csw);
        this.f28461A = (TextView) liveBottomSheetPanel.findViewById(C0966R.C0970id.cts);
        this.f28462B = new FinderLiveVisitorFansTaskView(context);
        this.f28463C = new FinderLiveVisitorFansRightView(context);
        C12788a1 a1Var = new C12788a1();
        this.f28464D = a1Var;
        FinderLiveWrapContentViewPager finderLiveWrapContentViewPager = (FinderLiveWrapContentViewPager) liveBottomSheetPanel.findViewById(C0966R.C0970id.mz9);
        finderLiveWrapContentViewPager.setAdapter(a1Var);
        finderLiveWrapContentViewPager.addOnPageChangeListener(new C9014b(finderLiveWrapContentViewPager));
        this.f28465E = finderLiveWrapContentViewPager;
        this.f28466F = (TabLayout) liveBottomSheetPanel.findViewById(C0966R.C0970id.mz_);
        this.f28467G = C36568h.m40985a(C9013a.f28484d);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        ((ImageView) liveBottomSheetPanel.findViewById(C0966R.C0970id.cse)).setOnClickListener(this);
        liveBottomSheetPanel.getLayoutParams().height = this.f28472o;
        liveBottomSheetPanel.setOnVisibilityListener(new C8991g4(this));
        Log.m105924i("FinderLiveFansTaskWidget", "init isLand:" + z);
    }

    private final MultiProcessMMKV getMmkv() {
        return (MultiProcessMMKV) ((C36570n) this.f28467G).getValue();
    }

    private final void setTitle(C45795b bVar) {
        String str;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C58961d.C58963b bVar2 = C58961d.f168673a;
        String str2 = "";
        if (bVar == null || (str = ((C54991o) bVar.mo71262a(C54991o.class)).f154345o) == null) {
            str = str2;
        }
        C58969q b = bVar2.mo84155b(str);
        C60979d<C100810g0> i2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2();
        C62345f fVar = new C62345f(b != null ? b.getAvatarUrl() : str2, (C27696y) null, 2, (C8480h) null);
        ImageView imageView = this.f28479v;
        C87412m.m108593f(imageView, "titleIcon");
        i2.mo85957c(fVar, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        this.f28478u.setText(str2);
        ViewParent parent = this.f28478u.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int measuredWidth = viewGroup.getMeasuredWidth();
        int childCount = viewGroup.getChildCount();
        int i = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (!C87412m.m108589b(childAt, this.f28478u)) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                i = i + childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            }
        }
        int i4 = measuredWidth - i;
        if (i4 > 0) {
            this.f28478u.setMaxWidth(i4);
        } else {
            this.f28478u.setMaxWidth((int) (((float) C75044y4.m89990b(MMApplicationContext.getContext()).x) - ((float) MMApplicationContext.getResources().getDimensionPixelOffset(C0966R.dimen.f3720ca))));
        }
        Log.m105924i("FinderLiveFansTaskWidget", "setTitle parentWidth:" + measuredWidth + ",sibleWidth:" + i + ",titleTvMaxWidth:" + i4 + ",set maxWidth:" + this.f28478u.getMaxWidth());
        TextView textView = this.f28478u;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = this.f28473p.getContext();
        Context context2 = this.f28473p.getContext();
        Object[] objArr = new Object[1];
        if (b != null) {
            str2 = b.getNickname();
        }
        objArr[0] = str2;
        textView.setText(hVar.yp0(context, context2.getString(C0966R.string.dla, objArr), this.f28478u.getTextSize()));
    }

    /* renamed from: b */
    public final C75375u mo9826b(String str, int i) {
        C75375u uVar = new C75375u(str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getContext().getResources().getColor(C0966R.color.f2976b7));
        int E = C112550d0.m153769E(str, String.valueOf(i), 0, false, 6, (Object) null);
        uVar.mo105705b(foregroundColorSpan, E, String.valueOf(i).length() + E, 33);
        return uVar;
    }

    /* renamed from: c */
    public final void mo9827c() {
        C12925w wVar = this.f28470j;
        if (wVar != null) {
            wVar.mo5085n();
        }
        this.f28470j = null;
        this.f28475r.setTranslationY(0.0f);
    }

    /* renamed from: d */
    public final void mo9828d(boolean z) {
        String str;
        C45795b A0;
        C64273c21 c212;
        C62660c basePlugin = getBasePlugin();
        byte[] bArr = null;
        setTitle(basePlugin != null ? basePlugin.mo87684A0() : null);
        Class cls = C55001u.class;
        this.f28480w.setVisibility(8);
        this.f28481x.setVisibility(0);
        C62660c basePlugin2 = getBasePlugin();
        long j = 0;
        long j2 = (basePlugin2 == null || (c212 = ((C55001u) basePlugin2.mo87696x0(cls)).f154420q) == null) ? 0 : c212.f182392d;
        C62660c basePlugin3 = getBasePlugin();
        if (basePlugin3 != null) {
            j = ((C55001u) basePlugin3.mo87696x0(cls)).f154416j;
        }
        long j3 = j;
        C62660c basePlugin4 = getBasePlugin();
        if (basePlugin4 != null) {
            bArr = ((C55001u) basePlugin4.mo87696x0(cls)).f154417n;
        }
        C89349b a = C89349b.m111674a(bArr);
        C62660c basePlugin5 = getBasePlugin();
        if (basePlugin5 == null || (A0 = basePlugin5.mo87684A0()) == null || (str = ((C54991o) A0.mo71262a(C54991o.class)).f154345o) == null) {
            str = "";
        }
        C89059e B = new C12226j(str, a, j2, j3, C66785b.f191882e.mo90662O5(), (C49712hj1) null).mo9225i().mo123062e(new C8975f4(this, z));
        if (getContext() != null && (getContext() instanceof MMActivity)) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            B.mo11397F((MMActivity) context);
        }
        C12925w wVar = new C12925w(this.f28473p.getContext());
        C62042e.f176370a.mo87010H1(this.f28473p);
        if (this.f28471n) {
            this.f28474q.getLayoutParams().height = 0;
        }
        wVar.f36921B.addView(this.f28473p, 0, new FrameLayout.LayoutParams(-1, -1));
        wVar.mo12461a();
        wVar.mo5086o();
        this.f28470j = wVar;
    }

    public final C12925w getBottomSheet() {
        return this.f28470j;
    }

    public final C32224a<C13598b0> getFansGroupClickListener() {
        return this.f28469i;
    }

    public final C32224a<C13598b0> getHelpIconClickListener() {
        return this.f28468h;
    }

    public final boolean getWasNotifySettingGuideShown() {
        return getMmkv().getBoolean("wasNotifySettingGuideShown", false);
    }

    public void onClick(View view) {
        C32224a<C13598b0> aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansTaskWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        boolean z = true;
        if ((valueOf == null || valueOf.intValue() != C0966R.C0970id.csc) && (valueOf == null || valueOf.intValue() != C0966R.C0970id.csg)) {
            z = false;
        }
        if (z) {
            mo9827c();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.cs_) {
            if (C58739j4.f168176a.mo83683L()) {
                Log.m105924i("FinderLiveFansTaskWidget", "fast click fans_group!");
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansTaskWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Yx0((C54116w) c, C54067f0.C0069t0.FANS_CLUB_CLICK, (Boolean) null, (C12677tg.C12678a) null, 6, (Object) null);
            C32224a<C13598b0> aVar2 = this.f28469i;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.cse || (aVar = this.f28468h) == null)) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansTaskWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setBottomSheet(C12925w wVar) {
        this.f28470j = wVar;
    }

    public final void setFansGroupClickListener(C32224a<C13598b0> aVar) {
        this.f28469i = aVar;
    }

    public final void setHelpIconClickListener(C32224a<C13598b0> aVar) {
        this.f28468h = aVar;
    }

    public final void setWasNotifySettingGuideShown(boolean z) {
        getMmkv().putBoolean("wasNotifySettingGuideShown", z);
    }
}
