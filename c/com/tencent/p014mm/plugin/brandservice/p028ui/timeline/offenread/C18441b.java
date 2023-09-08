package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19636w0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C60958c;
import k20.C9556a;
import kw0.C46746a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C77813z;
import te3.C118459qf;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b */
public final class C18441b implements C18440a0 {

    /* renamed from: t */
    public static boolean f51194t;

    /* renamed from: u */
    public static final float f51195u = (C85875k4.m106211z() ? 0.9f : 0.8f);

    /* renamed from: d */
    public final BizTimeLineUI f51196d;

    /* renamed from: e */
    public final BizTimeLineHotView f51197e;

    /* renamed from: f */
    public final View f51198f;

    /* renamed from: g */
    public final C13601g f51199g = C36568h.m40985a(new C18446f(this));

    /* renamed from: h */
    public final C13601g f51200h = C36568h.m40985a(new C18442a(this));

    /* renamed from: i */
    public final C13601g f51201i = C36568h.m40985a(new C18448h(this));

    /* renamed from: j */
    public final C13601g f51202j = C36568h.m40985a(new C18452l(this));

    /* renamed from: n */
    public final C13601g f51203n = C36568h.m40985a(new C18450j(this));

    /* renamed from: o */
    public final C13601g f51204o = C36568h.m40985a(new C18451k(this));

    /* renamed from: p */
    public CopyOnWriteArrayList<C18468r> f51205p = new CopyOnWriteArrayList<>();

    /* renamed from: q */
    public boolean f51206q = true;

    /* renamed from: r */
    public int f51207r = -1;

    /* renamed from: s */
    public boolean f51208s;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$d */
    public static final class C2125d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f12091d;

        public C2125d(View view) {
            this.f12091d = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = this.f12091d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar$doRightArrowAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar$doRightArrowAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$a */
    public static final class C18442a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C18441b f51209d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18442a(C18441b bVar) {
            super(0);
            this.f51209d = bVar;
        }

        public Object invoke() {
            View findViewById = this.f51209d.f51198f.findViewById(C0966R.C0970id.acv);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.view.View");
            return findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$b */
    public static final class C18443b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C18441b f51210d;

        public C18443b(C18441b bVar) {
            this.f51210d = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C46746a aVar = C46746a.f125826a;
            BizTimeLineHotListView d = this.f51210d.mo23055d();
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            if (d != null) {
                ViewGroup.LayoutParams layoutParams = d.getLayoutParams();
                layoutParams.height = intValue;
                d.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$c */
    public static final class C18444c implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ boolean f51211a;

        /* renamed from: b */
        public final /* synthetic */ C18441b f51212b;

        public C18444c(boolean z, C18441b bVar) {
            this.f51211a = z;
            this.f51212b = bVar;
        }

        public void onAnimationEnd(Animation animation) {
            if (!this.f51211a) {
                this.f51212b.mo23055d().setVisibility(8);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$e */
    public static final class C18445e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C18441b f51213d;

        /* renamed from: e */
        public final /* synthetic */ List<C118459qf> f51214e;

        /* renamed from: f */
        public final /* synthetic */ boolean f51215f;

        /* renamed from: g */
        public final /* synthetic */ int f51216g;

        public C18445e(C18441b bVar, List<? extends C118459qf> list, boolean z, int i) {
            this.f51213d = bVar;
            this.f51214e = list;
            this.f51215f = z;
            this.f51216g = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar$initList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f51213d.f51197e.getReadReport().f51272c = true;
            C18441b bVar = this.f51213d;
            bVar.f51208s = true;
            C19428d.f54856a.mo25155H(bVar.f51207r == 1 ? 83 : 82);
            C115669n.INSTANCE.mo160131h(23692, 2, Integer.valueOf(C19636w0.f55626c), Integer.valueOf(this.f51214e.size()), Integer.valueOf(this.f51213d.f51207r == 1 ? 2 : 1));
            C18441b bVar2 = this.f51213d;
            if (bVar2.f51207r == 0) {
                C18441b.m19085i(bVar2, this.f51214e, this.f51215f, this.f51216g);
                this.f51213d.mo23060k();
                C18441b bVar3 = this.f51213d;
                bVar3.mo23059j(bVar3.mo23057f(), 0, 0 - bVar3.mo23057f().getMeasuredWidth());
                bVar3.mo23062m(0.9f, 0.3f);
                bVar3.mo23053b(bVar3.mo23056e(), 0.0f, 180.0f, C18441b.f51195u, 0.5f);
                bVar3.mo23052a(true);
            } else {
                C18441b.m19084h(bVar2, this.f51214e);
                C18441b bVar4 = this.f51213d;
                bVar4.mo23059j(bVar4.mo23057f(), 0 - bVar4.mo23057f().getMeasuredWidth(), 0);
                bVar4.mo23062m(0.3f, 0.9f);
                bVar4.mo23053b(bVar4.mo23056e(), 180.0f, 0.0f, 0.5f, C18441b.f51195u);
                bVar4.mo23052a(false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar$initList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$f */
    public static final class C18446f extends C87413o implements C32224a<BizTimeLineHotListView> {

        /* renamed from: d */
        public final /* synthetic */ C18441b f51217d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18446f(C18441b bVar) {
            super(0);
            this.f51217d = bVar;
        }

        public Object invoke() {
            View findViewById = this.f51217d.f51198f.findViewById(C0966R.C0970id.f357538ad0);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView");
            return (BizTimeLineHotListView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$g */
    public static final class C18447g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C18441b f51218d;

        /* renamed from: e */
        public final /* synthetic */ View f51219e;

        public C18447g(C18441b bVar, View view) {
            this.f51218d = bVar;
            this.f51219e = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C18441b bVar = this.f51218d;
            View view = this.f51219e;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            bVar.mo23061l(view, ((Integer) animatedValue).intValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$h */
    public static final class C18448h extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C18441b f51220d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18448h(C18441b bVar) {
            super(0);
            this.f51220d = bVar;
        }

        public Object invoke() {
            View findViewById = this.f51220d.f51198f.findViewById(C0966R.C0970id.acs);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
            return (WeImageView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$i */
    public static final class C18449i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C18441b f51221d;

        public C18449i(C18441b bVar) {
            this.f51221d = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            ((TextView) ((C36570n) this.f51221d.f51202j).getValue()).setAlpha(floatValue);
            this.f51221d.mo23057f().setAlpha(floatValue);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$j */
    public static final class C18450j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C18441b f51222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18450j(C18441b bVar) {
            super(0);
            this.f51222d = bVar;
        }

        public Object invoke() {
            View findViewById = this.f51222d.f51198f.findViewById(C0966R.C0970id.f357541ad3);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            return (TextView) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$k */
    public static final class C18451k extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C18441b f51223d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18451k(C18441b bVar) {
            super(0);
            this.f51223d = bVar;
        }

        public Object invoke() {
            View findViewById = this.f51223d.f51198f.findViewById(C0966R.C0970id.ad4);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
            return (LinearLayout) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$l */
    public static final class C18452l extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C18441b f51224d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18452l(C18441b bVar) {
            super(0);
            this.f51224d = bVar;
        }

        public Object invoke() {
            View findViewById = this.f51224d.f51198f.findViewById(C0966R.C0970id.f357539ad1);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            return (TextView) findViewById;
        }
    }

    public C18441b(BizTimeLineUI bizTimeLineUI, BizTimeLineHotView bizTimeLineHotView, View view) {
        C87412m.m108594g(bizTimeLineUI, "context");
        C87412m.m108594g(bizTimeLineHotView, "hotView");
        C87412m.m108594g(view, "rootView");
        this.f51196d = bizTimeLineUI;
        this.f51197e = bizTimeLineHotView;
        this.f51198f = view;
        mo23055d().mo23000G1(bizTimeLineUI, new ArrayList(), bizTimeLineHotView.getReadReport(), this, true);
    }

    /* renamed from: h */
    public static final void m19084h(C18441b bVar, List<? extends C118459qf> list) {
        bVar.f51207r = 0;
        bVar.mo23056e().setRotation(0.0f);
        View c = bVar.mo23054c();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = c;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar", "initList$initCollapseLiveBar", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar", "initList$initCollapseLiveBar", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C19428d.f54856a.mo25155H(81);
        C115669n.INSTANCE.mo160131h(23692, 1, Integer.valueOf(C19636w0.f55626c), Integer.valueOf(list.size()), 1);
    }

    /* renamed from: i */
    public static final void m19085i(C18441b bVar, List<? extends C118459qf> list, boolean z, int i) {
        C18441b bVar2 = bVar;
        int i2 = i;
        bVar2.f51207r = 1;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C118459qf qfVar : list) {
            C18468r rVar = new C18468r();
            rVar.f354229d = qfVar.f354270d;
            rVar.f354232g = qfVar.f354271e;
            rVar.f354233h = qfVar.f354272f;
            rVar.f354235j = qfVar.f354274h;
            rVar.f354234i = qfVar.f354273g;
            rVar.f51260x = qfVar.f354275i;
            if (i2 == 1) {
                C19428d.f54856a.mo25159L(qfVar);
            }
            arrayList.add(rVar);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (!(arrayList2.isEmpty())) {
            C77813z.m93909o(arrayList2, new C18454c(z));
            C18468r rVar2 = null;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C18468r rVar3 = (C18468r) it.next();
                rVar3.f51258v = false;
                if (rVar2 != null && !rVar2.f51257u && rVar3.f51257u) {
                    rVar3.f51258v = true;
                    rVar2.f51258v = true;
                }
                rVar2 = rVar3;
            }
        }
        CopyOnWriteArrayList<C18468r> copyOnWriteArrayList = bVar2.f51205p;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        CopyOnWriteArrayList<C18468r> copyOnWriteArrayList2 = bVar2.f51205p;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.addAll(arrayList2);
        }
        bVar.mo23055d().setVisibility(0);
        CopyOnWriteArrayList<C18468r> copyOnWriteArrayList3 = bVar2.f51205p;
        if (copyOnWriteArrayList3 == null || copyOnWriteArrayList3.isEmpty()) {
            View c = bVar.mo23054c();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = c;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar", "initList$initExpandLiveBar", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar;Ljava/util/List;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar", "initList$initExpandLiveBar", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar;Ljava/util/List;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i2 == 1 && !bVar2.f51206q) {
                C19428d.f54856a.mo25155H(77);
                Log.m105924i("MicroMsg.BizFinderLiveBar", "doGetBizFinderLives refresh list on empty size");
                return;
            }
            return;
        }
        if (i2 == 0) {
            bVar2.f51206q = false;
            C19428d.f54856a.mo25155H(76);
        }
        C115669n.INSTANCE.mo160131h(23692, 1, Integer.valueOf(C19636w0.f55626c), Integer.valueOf(list.size()), 2);
        View c2 = bVar.mo23054c();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = c2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar", "initList$initExpandLiveBar", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar;Ljava/util/List;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar", "initList$initExpandLiveBar", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizFinderLiveBar;Ljava/util/List;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bVar.mo23055d().mo23002I1(bVar2.f51205p, false);
        Log.m105918d("MicroMsg.BizFinderLiveBar", "doGetBizFinderLives refresh data size=" + bVar2.f51205p.size() + ", fromType=" + i2);
    }

    /* renamed from: a */
    public final void mo23052a(boolean z) {
        AlphaAnimation alphaAnimation;
        ValueAnimator valueAnimator;
        if (!z) {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(200);
        alphaAnimation.setStartOffset(100);
        mo23055d().startAnimation(alphaAnimation);
        BizTimeLineUI bizTimeLineUI = this.f51196d;
        int i = BizTimeLineHotListView.f51108T1;
        int a = (((C18466p.m19102a(bizTimeLineUI) - BizTimeLineHotListView.f51111W1) * 4) / 3) + BizTimeLineHotListView.f51114Z1;
        int[] iArr = new int[2];
        if (z) {
            iArr[0] = 0;
            iArr[1] = a;
            valueAnimator = ValueAnimator.ofInt(iArr);
        } else {
            iArr[0] = a;
            iArr[1] = 0;
            valueAnimator = ValueAnimator.ofInt(iArr);
        }
        valueAnimator.setDuration(300);
        valueAnimator.addUpdateListener(new C18443b(this));
        alphaAnimation.setAnimationListener(new C18444c(z, this));
        valueAnimator.start();
    }

    /* renamed from: b */
    public final void mo23053b(View view, float f, float f2, float f3, float f4) {
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(300);
        rotateAnimation.setFillAfter(true);
        view.startAnimation(rotateAnimation);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f3, f4});
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new C2125d(view));
        ofFloat.start();
    }

    /* renamed from: c */
    public final View mo23054c() {
        return (View) ((C36570n) this.f51200h).getValue();
    }

    /* renamed from: d */
    public final BizTimeLineHotListView mo23055d() {
        return (BizTimeLineHotListView) this.f51199g.getValue();
    }

    /* renamed from: e */
    public final WeImageView mo23056e() {
        return (WeImageView) ((C36570n) this.f51201i).getValue();
    }

    /* renamed from: f */
    public final TextView mo23057f() {
        return (TextView) ((C36570n) this.f51203n).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0094, code lost:
        if (r1 != false) goto L_0x0096;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23058g(java.util.LinkedList<te3.C118459qf> r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "list"
            gy3.C87412m.m108594g(r10, r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r0 = r9.f51196d
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "Main_BizFinderLiveRedDotType"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r1 = 1
            if (r0 != r1) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            com.tencent.mm.pluginsdk.model.d r3 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            java.util.List r10 = r3.mo25181p(r10, r0)
            boolean r0 = r3.mo25188w(r0)
            android.widget.TextView r3 = r9.mo23057f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 32
            r4.append(r5)
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r5 = r9.f51196d
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131822671(0x7f11084f, float:1.927812E38)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            int r8 = r10.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r2] = r8
            java.lang.String r5 = r5.getString(r6, r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.setText(r4)
            rx3.g r3 = r9.f51204o
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$e r4 = new com.tencent.mm.plugin.brandservice.ui.timeline.offenread.b$e
            r4.<init>(r9, r10, r0, r11)
            r3.setOnClickListener(r4)
            boolean r3 = r10.isEmpty()
            if (r3 != 0) goto L_0x00d2
            boolean r3 = r9.f51208s
            if (r3 == 0) goto L_0x0073
            int r4 = r9.f51207r
            if (r4 == 0) goto L_0x0096
        L_0x0073:
            if (r3 != 0) goto L_0x00d2
            if (r0 != 0) goto L_0x00d2
            java.util.Iterator r3 = r10.iterator()
        L_0x007b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0094
            java.lang.Object r4 = r3.next()
            te3.qf r4 = (te3.C118459qf) r4
            com.tencent.mm.pluginsdk.model.d r5 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            java.lang.String r6 = r4.f354270d
            java.lang.String r4 = r4.f354271e
            boolean r4 = r5.mo25184s(r6, r4)
            if (r4 != 0) goto L_0x007b
            r1 = 0
        L_0x0094:
            if (r1 == 0) goto L_0x00d2
        L_0x0096:
            rx3.g r11 = r9.f51202j
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 1063675494(0x3f666666, float:0.9)
            r11.setAlpha(r0)
            android.widget.TextView r11 = r9.mo23057f()
            r11.setAlpha(r0)
            com.tencent.mm.ui.widget.imageview.WeImageView r11 = r9.mo23056e()
            r0 = 0
            r11.setRotation(r0)
            com.tencent.mm.ui.widget.imageview.WeImageView r11 = r9.mo23056e()
            float r0 = f51195u
            r11.setAlpha(r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r11 = r9.mo23055d()
            r0 = 8
            r11.setVisibility(r0)
            android.widget.TextView r11 = r9.mo23057f()
            r9.mo23061l(r11, r2)
            m19084h(r9, r10)
            return
        L_0x00d2:
            rx3.g r1 = r9.f51202j
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 1050253722(0x3e99999a, float:0.3)
            r1.setAlpha(r3)
            android.widget.TextView r1 = r9.mo23057f()
            r1.setAlpha(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r9.mo23056e()
            r3 = 1127481344(0x43340000, float:180.0)
            r1.setRotation(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r9.mo23056e()
            r3 = 1056964608(0x3f000000, float:0.5)
            r1.setAlpha(r3)
            android.widget.TextView r1 = r9.mo23057f()
            com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI r3 = r9.f51196d
            r4 = 200(0xc8, float:2.8E-43)
            int r3 = kg3.C76577a.m92151b(r3, r4)
            int r2 = r2 - r3
            r9.mo23061l(r1, r2)
            m19085i(r9, r10, r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18441b.mo23058g(java.util.LinkedList, int):void");
    }

    /* renamed from: j */
    public final void mo23059j(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setDuration(300);
        ofInt.addUpdateListener(new C18447g(this, view));
        ofInt.start();
    }

    /* renamed from: k */
    public final void mo23060k() {
        try {
            boolean z = true;
            if (this.f51207r == 1 && mo23054c().getVisibility() == 0) {
                CopyOnWriteArrayList<C18468r> copyOnWriteArrayList = this.f51205p;
                if (copyOnWriteArrayList != null) {
                    if (!copyOnWriteArrayList.isEmpty()) {
                        z = false;
                    }
                }
                if (!z) {
                    BizTimeLineHotListView d = mo23055d();
                    if (d != null) {
                        d.mo23005L1();
                    }
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BizFinderLiveBar", e, "reportShow", new Object[0]);
        }
    }

    /* renamed from: l */
    public final void mo23061l(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.leftMargin = i;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: m */
    public final void mo23062m(float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new C18449i(this));
        ofFloat.start();
    }

    public void setOftenReadTitlePaddingLeft(float f) {
    }

    public void setVideoTitlePaddingLeft(float f) {
    }

    /* renamed from: w0 */
    public void mo23045w0() {
    }

    /* renamed from: x0 */
    public void mo23046x0() {
    }

    /* renamed from: y0 */
    public void mo23047y0(String str) {
        this.f51197e.mo23047y0(str);
    }

    /* renamed from: z0 */
    public void mo23048z0(String str, String str2, int i) {
    }
}
