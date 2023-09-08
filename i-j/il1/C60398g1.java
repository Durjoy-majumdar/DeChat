package il1;

import ak1.C0073g0;
import ak1.C54108o;
import android.animation.Animator;
import android.view.View;
import android.widget.RelativeLayout;
import b50.C54405b;
import b50.C54412f;
import b50.C54422h;
import b50.C54423i;
import cj1.C54730a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsViewV2;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58115i;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import j50.C60735a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ks3.C61158a;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s50.C36624a;

/* renamed from: il1.g1 */
public final class C60398g1 {

    /* renamed from: a */
    public final RelativeLayout f172215a;

    /* renamed from: b */
    public final C13601g<List<FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k>> f172216b;

    /* renamed from: c */
    public FinderLiveCameraOptBeautyPowerfulSuitViewV2 f172217c;

    /* renamed from: d */
    public FinderLiveCameraOptBeautyPowerfulDetailsViewV2 f172218d;

    /* renamed from: e */
    public C32224a<C13598b0> f172219e;

    /* renamed from: il1.g1$a */
    public static final class C60399a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60398g1 f172220d;

        /* renamed from: e */
        public final /* synthetic */ boolean f172221e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60399a(C60398g1 g1Var, boolean z) {
            super(0);
            this.f172220d = g1Var;
            this.f172221e = z;
        }

        public Object invoke() {
            Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulWidget", "#detailsView.onRequestReset suit=" + this.f172220d.f172217c.getSuit());
            C60398g1 g1Var = this.f172220d;
            boolean z = this.f172221e;
            for (FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k kVar : (Iterable) ((C36570n) this.f172220d.f172216b).getValue()) {
                C54730a aVar = C54730a.f153378a;
                int suit = g1Var.f172217c.getSuit();
                int i = kVar.f159638a;
                Log.m105924i("Finder.BeautySuitDataManager", "#setBeautyToDefault suitId=" + suit + " beautyId=" + i);
                aVar.mo75618e().remove(aVar.mo75614a(suit, i));
                FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2 = g1Var.f172218d;
                if (finderLiveCameraOptBeautyPowerfulDetailsViewV2 != null) {
                    Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#reload");
                    finderLiveCameraOptBeautyPowerfulDetailsViewV2.setSelectedEffect(finderLiveCameraOptBeautyPowerfulDetailsViewV2.f159593f);
                    finderLiveCameraOptBeautyPowerfulDetailsViewV2.mo77800g();
                    C60398g1.m70658a(g1Var, kVar.f159638a, aVar.mo75617d(g1Var.f172217c.getSuit(), kVar.f159638a, z, false));
                } else {
                    C87412m.m108603p("detailsView");
                    throw null;
                }
            }
            this.f172220d.mo85375c(4);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.g1$b */
    public static final class C60400b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60398g1 f172222d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60400b(C60398g1 g1Var) {
            super(0);
            this.f172222d = g1Var;
        }

        public Object invoke() {
            FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2 = this.f172222d.f172218d;
            if (finderLiveCameraOptBeautyPowerfulDetailsViewV2 != null) {
                finderLiveCameraOptBeautyPowerfulDetailsViewV2.mo77797d(true);
                this.f172222d.f172217c.mo77840c(true);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("detailsView");
            throw null;
        }
    }

    /* renamed from: il1.g1$c */
    public static final class C60401c implements View.OnClickListener {

        /* renamed from: d */
        public static final C60401c f172223d = new C60401c();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptBeautyPowerfulWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptBeautyPowerfulWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.g1$d */
    public static final class C60402d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60398g1 f172224d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60402d(C60398g1 g1Var) {
            super(0);
            this.f172224d = g1Var;
        }

        public Object invoke() {
            C32224a<C13598b0> aVar = this.f172224d.f172219e;
            if (aVar != null) {
                aVar.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.g1$e */
    public static final class C60403e extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60398g1 f172225d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60403e(C60398g1 g1Var) {
            super(1);
            this.f172225d = g1Var;
        }

        public Object invoke(Object obj) {
            boolean z = true;
            if (!((Boolean) obj).booleanValue()) {
                FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2 = this.f172225d.f172218d;
                if (finderLiveCameraOptBeautyPowerfulDetailsViewV2 != null) {
                    Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#showSelf");
                    Animator animator = finderLiveCameraOptBeautyPowerfulDetailsViewV2.f159592e;
                    if (animator == null || !animator.isRunning()) {
                        z = false;
                    }
                    if (z) {
                        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#showSelf visibilityAnimator isRunning");
                    } else {
                        finderLiveCameraOptBeautyPowerfulDetailsViewV2.mo77796c(false);
                    }
                    this.f172225d.mo85375c(2);
                } else {
                    C87412m.m108603p("detailsView");
                    throw null;
                }
            } else {
                FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV22 = this.f172225d.f172218d;
                if (finderLiveCameraOptBeautyPowerfulDetailsViewV22 != null) {
                    finderLiveCameraOptBeautyPowerfulDetailsViewV22.mo77797d(true);
                } else {
                    C87412m.m108603p("detailsView");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.g1$f */
    public static final class C60404f extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60398g1 f172226d;

        /* renamed from: e */
        public final /* synthetic */ boolean f172227e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60404f(C60398g1 g1Var, boolean z) {
            super(1);
            this.f172226d = g1Var;
            this.f172227e = z;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2 = this.f172226d.f172218d;
            if (finderLiveCameraOptBeautyPowerfulDetailsViewV2 != null) {
                Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulDetailsView", "#reload");
                finderLiveCameraOptBeautyPowerfulDetailsViewV2.setSelectedEffect(finderLiveCameraOptBeautyPowerfulDetailsViewV2.f159593f);
                finderLiveCameraOptBeautyPowerfulDetailsViewV2.mo77800g();
                C54730a.f153378a.mo75620g(intValue);
                C60398g1 g1Var = this.f172226d;
                boolean z = this.f172227e;
                for (FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k kVar : (Iterable) ((C36570n) this.f172226d.f172216b).getValue()) {
                    int i = kVar.f159638a;
                    C60398g1.m70658a(g1Var, i, C54730a.f153378a.mo75615b(intValue, i, z, 0));
                }
                return C13598b0.f38549a;
            }
            C87412m.m108603p("detailsView");
            throw null;
        }
    }

    /* renamed from: il1.g1$g */
    public static final class C60405g extends C87413o implements C32226l<Integer, Integer> {

        /* renamed from: d */
        public final /* synthetic */ C60398g1 f172228d;

        /* renamed from: e */
        public final /* synthetic */ boolean f172229e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60405g(C60398g1 g1Var, boolean z) {
            super(1);
            this.f172228d = g1Var;
            this.f172229e = z;
        }

        public Object invoke(Object obj) {
            return Integer.valueOf(C54730a.f153378a.mo75615b(this.f172228d.f172217c.getSuit(), ((Number) obj).intValue(), this.f172229e, 0));
        }
    }

    /* renamed from: il1.g1$h */
    public static final class C60406h extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C60398g1 f172230d;

        /* renamed from: e */
        public final /* synthetic */ boolean f172231e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60406h(C60398g1 g1Var, boolean z) {
            super(0);
            this.f172230d = g1Var;
            this.f172231e = z;
        }

        public Object invoke() {
            C54730a aVar = C54730a.f153378a;
            int suit = this.f172230d.f172217c.getSuit();
            boolean z = this.f172231e;
            Integer[] a = C54422h.f152647a.mo75236a();
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= 22) {
                    z2 = true;
                    break;
                }
                int intValue = a[i].intValue();
                String a2 = aVar.mo75614a(suit, intValue);
                int d = aVar.mo75617d(suit, intValue, z, false);
                if (aVar.mo75618e().getInt(a2, d) != d) {
                    break;
                }
                i++;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* renamed from: il1.g1$i */
    public static final class C60407i extends C87413o implements C32226l<Integer, Integer> {

        /* renamed from: d */
        public final /* synthetic */ C60398g1 f172232d;

        /* renamed from: e */
        public final /* synthetic */ boolean f172233e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60407i(C60398g1 g1Var, boolean z) {
            super(1);
            this.f172232d = g1Var;
            this.f172233e = z;
        }

        public Object invoke(Object obj) {
            return Integer.valueOf(C54730a.f153378a.mo75617d(this.f172232d.f172217c.getSuit(), ((Number) obj).intValue(), this.f172233e, true));
        }
    }

    /* renamed from: il1.g1$j */
    public static final class C60408j extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60398g1 f172234d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60408j(C60398g1 g1Var) {
            super(2);
            this.f172234d = g1Var;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            if (intValue == 18) {
                C60398g1.m70658a(this.f172234d, 19, 0);
            } else if (intValue == 19) {
                C60398g1.m70658a(this.f172234d, 18, 0);
            }
            C60398g1.m70658a(this.f172234d, intValue, intValue2);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.g1$k */
    public static final class C60409k extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60398g1 f172235d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60409k(C60398g1 g1Var) {
            super(2);
            this.f172235d = g1Var;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulWidget", "#detailsView.onWriteSeek key=" + intValue + " seek=" + intValue2);
            if (intValue == 18) {
                C60398g1.m70658a(this.f172235d, 19, 0);
                C54730a.f153378a.mo75619f(this.f172235d.f172217c.getSuit(), 19, 0);
            } else if (intValue == 19) {
                C60398g1.m70658a(this.f172235d, 18, 0);
                C54730a.f153378a.mo75619f(this.f172235d.f172217c.getSuit(), 18, 0);
            }
            C54730a.f153378a.mo75619f(this.f172235d.f172217c.getSuit(), intValue, intValue2);
            C60398g1.m70658a(this.f172235d, intValue, intValue2);
            this.f172235d.mo85375c(3);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.g1$l */
    public static final class C60410l extends C87413o implements C32224a<List<FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k>> {

        /* renamed from: d */
        public final /* synthetic */ C60398g1 f172236d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60410l(C60398g1 g1Var) {
            super(0);
            this.f172236d = g1Var;
        }

        public Object invoke() {
            C54423i iVar = C54423i.FACIAL_FEATURES;
            ArrayList arrayList = new ArrayList();
            C60398g1 g1Var = this.f172236d;
            String string = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhu);
            C87412m.m108593f(string, "panelRoot.context.resour…_live_beauty_smooth_face)");
            C54423i iVar2 = C54423i.SKIN_BEAUTY;
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(0, string, false, iVar2));
            String string2 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhe);
            C87412m.m108593f(string2, "panelRoot.context.resour…_live_beauty_bright_face)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(2, string2, false, iVar2));
            String string3 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhr);
            C87412m.m108593f(string3, "panelRoot.context.resour…nder_live_beauty_sharpen)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(8, string3, false, iVar2));
            String string4 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dht);
            C87412m.m108593f(string4, "panelRoot.context.resour…_live_beauty_smile_folds)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(7, string4, false, iVar2));
            String string5 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhq);
            C87412m.m108593f(string5, "panelRoot.context.resour….finder_live_beauty_rosy)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(3, string5, false, iVar2));
            String string6 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhi);
            C87412m.m108593f(string6, "panelRoot.context.resour…er_live_beauty_girl_slim)");
            C54423i iVar3 = C54423i.FACE_SHAPE;
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(19, string6, false, iVar3));
            String string7 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhc);
            C87412m.m108593f(string7, "panelRoot.context.resour…der_live_beauty_boy_slim)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(18, string7, false, iVar3));
            boolean z = C54730a.f153379b;
            if (!z) {
                String string8 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhg);
                C87412m.m108593f(string8, "panelRoot.context.resour….finder_live_beauty_chin)");
                arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(15, string8, true, iVar3));
            }
            if (!z) {
                String string9 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhy);
                C87412m.m108593f(string9, "panelRoot.context.resour…der_live_beauty_zhailian)");
                arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(20, string9, false, iVar3));
            }
            String string10 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhf);
            C87412m.m108593f(string10, "panelRoot.context.resour…r_live_beauty_cheek_bone)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(11, string10, false, iVar3));
            String string11 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhk);
            C87412m.m108593f(string11, "panelRoot.context.resour…nder_live_beauty_jawbone)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(12, string11, false, iVar3));
            if (!z) {
                String string12 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhj);
                C87412m.m108593f(string12, "panelRoot.context.resour…er_live_beauty_hair_line)");
                arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(17, string12, true, iVar3));
            }
            String string13 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhs);
            C87412m.m108593f(string13, "panelRoot.context.resour…r_live_beauty_small_head)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(10, string13, false, iVar3));
            if (!z) {
                String string14 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhx);
                C87412m.m108593f(string14, "panelRoot.context.resour…r_live_beauty_wuguanliti)");
                arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(21, string14, false, iVar));
            }
            String string15 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhl);
            C87412m.m108593f(string15, "panelRoot.context.resour…er_live_beauty_morph_eye)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(14, string15, false, iVar));
            String string16 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhd);
            C87412m.m108593f(string16, "panelRoot.context.resour…r_live_beauty_bright_eye)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(5, string16, false, iVar));
            String string17 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhw);
            C87412m.m108593f(string17, "panelRoot.context.resour…live_beauty_wing_of_nose)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(13, string17, false, iVar));
            if (!z) {
                String string18 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhn);
                C87412m.m108593f(string18, "panelRoot.context.resour…_live_beauty_mouth_morph)");
                arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(16, string18, true, iVar));
            }
            String string19 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhh);
            C87412m.m108593f(string19, "panelRoot.context.resour…er_live_beauty_eye_pouch)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(6, string19, false, iVar));
            String string20 = g1Var.f172215a.getContext().getResources().getString(C0966R.string.dhv);
            C87412m.m108593f(string20, "panelRoot.context.resour…live_beauty_teeth_bright)");
            arrayList.add(new FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k(9, string20, false, iVar));
            return arrayList;
        }
    }

    public C60398g1(RelativeLayout relativeLayout, boolean z) {
        C87412m.m108594g(relativeLayout, "panelRoot");
        this.f172215a = relativeLayout;
        C13601g<List<FinderLiveCameraOptBeautyPowerfulDetailsViewV2.C55990k>> a = C36568h.m40985a(new C60410l(this));
        this.f172216b = a;
        mo85374b(false);
        relativeLayout.setOnClickListener(C60401c.f172223d);
        View findViewById = relativeLayout.findViewById(C0966R.C0970id.f358108dg3);
        C87412m.m108593f(findViewById, "panelRoot.findViewById(R…auty_powerful_panel_suit)");
        FinderLiveCameraOptBeautyPowerfulSuitViewV2 finderLiveCameraOptBeautyPowerfulSuitViewV2 = (FinderLiveCameraOptBeautyPowerfulSuitViewV2) findViewById;
        this.f172217c = finderLiveCameraOptBeautyPowerfulSuitViewV2;
        finderLiveCameraOptBeautyPowerfulSuitViewV2.setOnCloseClick(new C60402d(this));
        this.f172217c.setOnModeSwitch(new C60403e(this));
        this.f172217c.setOnSuitSwitch(new C60404f(this, z));
        C54730a aVar = C54730a.f153378a;
        int c = aVar.mo75616c();
        int i = C61158a.f174107a;
        if (c == -1000) {
            c = !z;
            aVar.mo75620g(c);
        }
        this.f172217c.setSuit(c);
        View findViewById2 = relativeLayout.findViewById(C0966R.C0970id.dfv);
        C87412m.m108593f(findViewById2, "panelRoot.findViewById(R…y_powerful_panel_details)");
        FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2 = (FinderLiveCameraOptBeautyPowerfulDetailsViewV2) findViewById2;
        this.f172218d = finderLiveCameraOptBeautyPowerfulDetailsViewV2;
        finderLiveCameraOptBeautyPowerfulDetailsViewV2.setOnRequestSeekByKey(new C60405g(this, z));
        FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV22 = this.f172218d;
        if (finderLiveCameraOptBeautyPowerfulDetailsViewV22 != null) {
            finderLiveCameraOptBeautyPowerfulDetailsViewV22.setOnRequestCheckIsDefault(new C60406h(this, z));
            FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV23 = this.f172218d;
            if (finderLiveCameraOptBeautyPowerfulDetailsViewV23 != null) {
                finderLiveCameraOptBeautyPowerfulDetailsViewV23.setOnRequestDefaultSeekByKey(new C60407i(this, z));
                FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV24 = this.f172218d;
                if (finderLiveCameraOptBeautyPowerfulDetailsViewV24 != null) {
                    finderLiveCameraOptBeautyPowerfulDetailsViewV24.setOnSeekChanging(new C60408j(this));
                    FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV25 = this.f172218d;
                    if (finderLiveCameraOptBeautyPowerfulDetailsViewV25 != null) {
                        finderLiveCameraOptBeautyPowerfulDetailsViewV25.setOnSeekDone(new C60409k(this));
                        FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV26 = this.f172218d;
                        if (finderLiveCameraOptBeautyPowerfulDetailsViewV26 != null) {
                            finderLiveCameraOptBeautyPowerfulDetailsViewV26.setOnRequestReset(new C60399a(this, z));
                            FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV27 = this.f172218d;
                            if (finderLiveCameraOptBeautyPowerfulDetailsViewV27 != null) {
                                finderLiveCameraOptBeautyPowerfulDetailsViewV27.setOnBackClick(new C60400b(this));
                                FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV28 = this.f172218d;
                                if (finderLiveCameraOptBeautyPowerfulDetailsViewV28 != null) {
                                    finderLiveCameraOptBeautyPowerfulDetailsViewV28.setEffectItems(a.getValue());
                                } else {
                                    C87412m.m108603p("detailsView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("detailsView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("detailsView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("detailsView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("detailsView");
                    throw null;
                }
            } else {
                C87412m.m108603p("detailsView");
                throw null;
            }
        } else {
            C87412m.m108603p("detailsView");
            throw null;
        }
    }

    /* renamed from: a */
    public static final void m70658a(C60398g1 g1Var, int i, int i2) {
        HashMap<Integer, Integer> hashMap;
        g1Var.getClass();
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C36624a aVar = FinderLiveService.f159390t;
        if (!(aVar == null || (hashMap = aVar.f97362a) == null)) {
            Integer put = hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
        finderLiveService.getClass();
        C60735a aVar2 = FinderLiveService.f159378f;
        C54405b bVar = aVar2 != null ? aVar2.f173032r : null;
        if (bVar != null) {
            ((C54412f) bVar).mo75226i(FinderLiveService.f159390t);
        }
    }

    /* renamed from: b */
    public final void mo85374b(boolean z) {
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulWidget", "#hidePanel isAnimation=" + z);
        if (!z) {
            RelativeLayout relativeLayout = this.f172215a;
            relativeLayout.setTranslationY((float) C75044y4.m89990b(relativeLayout.getContext()).y);
            return;
        }
        this.f172215a.animate().translationY((float) C75044y4.m89990b(this.f172215a.getContext()).y).setDuration(200).start();
    }

    /* renamed from: c */
    public final void mo85375c(int i) {
        C58115i liveStatus;
        Class cls = C54108o.class;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        C54405b bVar = aVar != null ? aVar.f173032r : null;
        boolean z = true;
        if (bVar == null || (liveStatus = ((C54412f) bVar).getLiveStatus()) == null || !liveStatus.mo82885g()) {
            z = false;
        }
        if (z) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.CLICK_FAIRY_STICK, jSONObject.toString(), (String) null, 4, (Object) null);
            return;
        }
        C7335d c2 = C86312j.m106911c(cls);
        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8600a((C8777j5) c2, 23, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: d */
    public final void mo85376d() {
        C58115i liveStatus;
        boolean z = false;
        mo85374b(false);
        this.f172217c.setSuitMode(true);
        this.f172217c.setVisibility(8);
        FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV2 = this.f172218d;
        C54405b bVar = null;
        if (finderLiveCameraOptBeautyPowerfulDetailsViewV2 != null) {
            finderLiveCameraOptBeautyPowerfulDetailsViewV2.mo77797d(false);
            FinderLiveCameraOptBeautyPowerfulDetailsViewV2 finderLiveCameraOptBeautyPowerfulDetailsViewV22 = this.f172218d;
            if (finderLiveCameraOptBeautyPowerfulDetailsViewV22 != null) {
                finderLiveCameraOptBeautyPowerfulDetailsViewV22.setVisibility(8);
                FinderLiveService.f159376d.getClass();
                C60735a aVar = FinderLiveService.f159378f;
                if (aVar != null) {
                    bVar = aVar.f173032r;
                }
                if (!(bVar == null || (liveStatus = ((C54412f) bVar).getLiveStatus()) == null || !liveStatus.mo82885g())) {
                    z = true;
                }
                if (z) {
                    C7335d c = C86312j.m106911c(C54108o.class);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_BEAUTY, C54730a.C54731a.f153381a.mo75621a(), (String) null, 4, (Object) null);
                    return;
                }
                return;
            }
            C87412m.m108603p("detailsView");
            throw null;
        }
        C87412m.m108603p("detailsView");
        throw null;
    }

    /* renamed from: e */
    public final void mo85377e() {
        Log.m105924i("Finder.FinderLiveCameraOptBeautyPowerfulWidget", "#showBeautyPanel");
        this.f172217c.setVisibility(0);
        this.f172215a.animate().translationY(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null).start();
        mo85375c(1);
    }
}
