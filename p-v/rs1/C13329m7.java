package rs1;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import as1.C0201a;
import bl3.C39818r;
import bs1.C0375d;
import bs1.C0376e;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C7865r3;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C98522w3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import p185kq.C10383h;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90363p0;
import xd1.C15644c;
import xd1.C15665p;
import xd1.C15669q;
import z91.C23462b;

/* renamed from: rs1.m7 */
public final class C13329m7 implements C0201a.C0203b, C98522w3.C98523c {

    /* renamed from: a */
    public final FragmentActivity f37803a;

    /* renamed from: b */
    public final int f37804b;

    /* renamed from: c */
    public VASCommonFragment f37805c;

    /* renamed from: d */
    public C0201a f37806d;

    /* renamed from: e */
    public FrameLayout f37807e;

    /* renamed from: f */
    public boolean f37808f;

    /* renamed from: g */
    public int f37809g;

    /* renamed from: h */
    public boolean f37810h;

    /* renamed from: i */
    public final String f37811i = "FinderPoiDrawer";

    /* renamed from: j */
    public C32224a<Boolean> f37812j;

    /* renamed from: k */
    public C32226l<? super Float, Boolean> f37813k;

    /* renamed from: l */
    public C32227p<? super Float, ? super Float, Boolean> f37814l;

    /* renamed from: m */
    public C32227p<? super Float, ? super Float, C13598b0> f37815m;

    /* renamed from: n */
    public C32224a<Boolean> f37816n;

    /* renamed from: o */
    public String f37817o;

    /* renamed from: p */
    public final Rect f37818p = new Rect();

    /* renamed from: rs1.m7$a */
    public final class C13330a extends C0376e {

        /* renamed from: b */
        public final Context f37819b;

        /* renamed from: c */
        public View f37820c;

        /* renamed from: d */
        public final /* synthetic */ C13329m7 f37821d;

        /* renamed from: rs1.m7$a$a */
        public static final class C13331a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C13330a f37822d;

            public C13331a(C13330a aVar) {
                this.f37822d = aVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderPoiDrawer$BackgroundComponent$getView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C0201a aVar = this.f37822d.f978a;
                if (aVar != null) {
                    aVar.mo4919k(aVar.f18132i, false);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPoiDrawer$BackgroundComponent$getView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C13330a(C13329m7 m7Var, Context context) {
            C87412m.m108594g(context, "context");
            this.f37821d = m7Var;
            this.f37819b = context;
        }

        /* renamed from: a */
        public View mo408a() {
            if (this.f37820c == null) {
                View view = new View(this.f37819b);
                C13329m7 m7Var = this.f37821d;
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                if (!m7Var.f37810h) {
                    view.setBackgroundColor(view.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5));
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderPoiDrawer$BackgroundComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPoiDrawer$BackgroundComponent", "getView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setOnClickListener(new C13331a(this));
                }
                this.f37820c = view;
            }
            return this.f37820c;
        }

        /* renamed from: f */
        public void mo409f(C0201a aVar, float f, String str) {
            View container;
            C13329m7 m7Var;
            VASCommonFragment vASCommonFragment;
            View view;
            C15665p pVar;
            float f2 = f;
            Class cls = C15669q.class;
            C87412m.m108594g(aVar, "layout");
            C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
            super.mo409f(aVar, f, str);
            VASCommonFragment vASCommonFragment2 = this.f37821d.f37805c;
            if (vASCommonFragment2 != null) {
                C39818r rVar = C39818r.f106831a;
                C15669q qVar = (C15669q) rVar.mo62445d(vASCommonFragment2).mo62449e(cls);
                if (qVar != null) {
                    int i = (int) f2;
                    if (!qVar.mo80061o3().isEmpty() && (pVar = (C15665p) rVar.mo62445d(qVar.getActiveFragment()).mo62449e(C15665p.class)) != null) {
                        pVar.mo14412g3().f30220j.setParentTranslation(i);
                    }
                }
            }
            float f3 = 0.0f;
            int i2 = 0;
            if (!this.f37821d.f37810h) {
                View view2 = this.f37820c;
                if (view2 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderPoiDrawer$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPoiDrawer$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                float borderExpand = aVar.getBorderExpand();
                float borderPeek = aVar.getCanPeek() ? aVar.getBorderPeek() : aVar.getBorderClose();
                float f4 = (borderPeek - f2) / (borderPeek - borderExpand);
                if (f4 > 1.0f) {
                    f4 = 1.0f;
                }
                if (0.0f >= f4) {
                    f4 = 0.0f;
                }
                View view4 = this.f37820c;
                if (view4 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(Float.valueOf(f4));
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderPoiDrawer$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view4.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPoiDrawer$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                if ((f4 == 0.0f) && (view = this.f37820c) != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view6 = view;
                    C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderPoiDrawer$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPoiDrawer$BackgroundComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            C0201a aVar5 = this.f37821d.f37806d;
            float translation = aVar5 != null ? aVar5.getTranslation() : 0.0f;
            C0201a aVar6 = this.f37821d.f37806d;
            if (translation < (aVar6 != null ? aVar6.getBorderPeek() : 0.0f) && (vASCommonFragment = m7Var.f37805c) != null) {
                C15669q qVar2 = (C15669q) C39818r.f106831a.mo62445d(vASCommonFragment).mo62449e(cls);
                if (qVar2 != null) {
                    qVar2.f42355x = true;
                    qVar2.mo323m4();
                    if (qVar2.f42348h4 == 0) {
                        qVar2.f42350j4 = ((C23462b) ((C10383h) C86312j.m106911c(C10383h.class)).mo10693DZ()).mo36921e();
                        qVar2.f42348h4 = System.currentTimeMillis();
                        qVar2.f42349i4 = System.currentTimeMillis();
                    } else if (qVar2.f42349i4 == 0) {
                        qVar2.f42349i4 = System.currentTimeMillis();
                    }
                }
                Log.m105924i((m7Var = this.f37821d).f37811i, "onDrawerStartExpend");
            }
            C13329m7 m7Var2 = this.f37821d;
            C32227p<? super Float, ? super Float, C13598b0> pVar2 = m7Var2.f37815m;
            if (pVar2 != null) {
                C0201a aVar7 = m7Var2.f37806d;
                if (aVar7 != null) {
                    f3 = aVar7.getPeekHeight();
                }
                Float valueOf = Float.valueOf(f3);
                C0201a aVar8 = this.f37821d.f37806d;
                if (!(aVar8 == null || (container = aVar8.getContainer()) == null)) {
                    i2 = container.getHeight();
                }
                pVar2.invoke(valueOf, Float.valueOf(((float) i2) - f2));
            }
        }
    }

    /* renamed from: rs1.m7$b */
    public final class C13332b extends C0375d {
        public C13332b() {
        }

        /* renamed from: b */
        public void mo412b(C0201a aVar) {
            C87412m.m108594g(aVar, "layout");
            Log.m105924i(C13329m7.this.f37811i, "onDrawerClose");
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86150RW(C13329m7.this.f37805c, true);
        }

        /* renamed from: c */
        public void mo413c(C0201a aVar) {
            C15644c cVar;
            C87412m.m108594g(aVar, "layout");
            Log.m105924i(C13329m7.this.f37811i, "onDrawerExpand");
            VASCommonFragment vASCommonFragment = C13329m7.this.f37805c;
            if (!(vASCommonFragment == null || (cVar = (C15644c) C39818r.f106831a.mo62445d(vASCommonFragment).mo62449e(C15644c.class)) == null)) {
                cVar.f42288I = 1;
            }
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            C13329m7 m7Var = C13329m7.this;
            VASCommonFragment vASCommonFragment2 = m7Var.f37805c;
            VASActivity vASActivity = vASCommonFragment2 != null ? vASCommonFragment2.f348642o : null;
            String str = m7Var.f37817o;
            if (str == null) {
                str = "";
            }
            eVar.mo86153W7("expand_half_page", vASActivity, C90363p0.m113143b(new C13604l("poiid", str)), 27051);
        }

        /* renamed from: d */
        public void mo414d(C0201a aVar) {
            C87412m.m108594g(aVar, "layout");
            Log.m105924i(C13329m7.this.f37811i, "onDrawerOpen");
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86143M0(C13329m7.this.f37805c);
            C0201a aVar2 = C13329m7.this.f37806d;
            if (aVar2 != null) {
                aVar2.mo214p(false);
            }
        }

        /* renamed from: e */
        public void mo411e(C0201a aVar) {
            C87412m.m108594g(aVar, "layout");
            Log.m105924i(C13329m7.this.f37811i, "onDrawerPeek");
            C0201a aVar2 = C13329m7.this.f37806d;
            if (aVar2 != null) {
                aVar2.mo214p(true);
            }
            C13329m7 m7Var = C13329m7.this;
            VASCommonFragment vASCommonFragment = m7Var.f37805c;
            if (vASCommonFragment != null) {
                C39818r rVar = C39818r.f106831a;
                C15669q qVar = (C15669q) rVar.mo62445d(vASCommonFragment).mo62449e(C15669q.class);
                if (qVar != null) {
                    qVar.mo14414f();
                    qVar.mo14413a();
                }
                C15644c cVar = (C15644c) rVar.mo62445d(vASCommonFragment).mo62449e(C15644c.class);
                if (cVar != null) {
                    cVar.f42288I = 2;
                }
                C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                VASCommonFragment vASCommonFragment2 = m7Var.f37805c;
                VASActivity vASActivity = vASCommonFragment2 != null ? vASCommonFragment2.f348642o : null;
                String str = m7Var.f37817o;
                if (str == null) {
                    str = "";
                }
                eVar.mo86153W7("fold_half_page", vASActivity, C90363p0.m113143b(new C13604l("poiid", str)), 27051);
            }
        }

        /* renamed from: f */
        public void mo409f(C0201a aVar, float f, String str) {
            C87412m.m108594g(aVar, "layout");
            C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
            super.mo409f(aVar, f, str);
            float f2 = 1.0f;
            float borderExpand = ((f - aVar.getBorderExpand()) * 1.0f) / (aVar.getBorderClose() - aVar.getBorderExpand());
            if (borderExpand < 0.0f) {
                borderExpand = 0.0f;
            }
            if (borderExpand <= 1.0f) {
                f2 = borderExpand;
            }
            String str2 = C13329m7.this.f37811i;
            Log.m105926v(str2, "onTranslationChange translation: " + f + " percent: " + f2);
            C0201a aVar2 = C13329m7.this.f37806d;
            if (aVar2 != null) {
                aVar2.mo214p(false);
            }
        }
    }

    public C13329m7(FragmentActivity fragmentActivity, int i) {
        C87412m.m108594g(fragmentActivity, "context");
        this.f37803a = fragmentActivity;
        this.f37804b = i;
    }

    /* renamed from: a */
    public void mo12764a(C32224a<Boolean> aVar) {
        this.f37812j = aVar;
    }

    /* renamed from: b */
    public boolean mo12765b() {
        if (this.f37810h) {
            return false;
        }
        C0201a aVar = this.f37806d;
        float f = 0.0f;
        float translation = aVar != null ? aVar.getTranslation() : 0.0f;
        C0201a aVar2 = this.f37806d;
        if (aVar2 != null) {
            f = aVar2.getBorderPeek();
        }
        if (translation >= f) {
            return false;
        }
        C0201a aVar3 = this.f37806d;
        if (aVar3 != null) {
            aVar3.mo4919k(aVar3.f18132i, false);
        }
        return true;
    }

    /* renamed from: c */
    public void mo12766c(C32226l<? super Float, Boolean> lVar) {
        this.f37813k = lVar;
    }

    /* renamed from: d */
    public void mo12767d(C32227p<? super Float, ? super Float, C13598b0> pVar) {
        this.f37815m = pVar;
    }

    /* renamed from: e */
    public void mo12768e(C32227p<? super Float, ? super Float, Boolean> pVar) {
        this.f37814l = pVar;
    }

    /* renamed from: f */
    public void mo12769f(C32224a<Boolean> aVar) {
        this.f37816n = aVar;
    }

    /* renamed from: g */
    public Rect mo236g(C0201a aVar) {
        Rect rect;
        C87412m.m108594g(aVar, "drawer");
        VASCommonFragment vASCommonFragment = this.f37805c;
        if (vASCommonFragment == null) {
            return this.f37818p;
        }
        C15644c cVar = (C15644c) C39818r.f106831a.mo62445d(vASCommonFragment).mo62449e(C15644c.class);
        if (cVar != null) {
            View view = cVar.f42282C;
            boolean z = false;
            if (view != null ? view.getGlobalVisibleRect(cVar.f42289J) : false) {
                AppBarLayout appBarLayout = cVar.f42281B;
                if (appBarLayout != null ? appBarLayout.getGlobalVisibleRect(cVar.f42290K) : false) {
                    z = true;
                }
            }
            if (z) {
                Rect rect2 = cVar.f42289J;
                int i = rect2.left;
                int i2 = rect2.top;
                Rect rect3 = cVar.f42290K;
                rect2.set(i, i2, rect3.right, rect3.bottom);
                rect = cVar.f42289J;
            } else {
                rect = null;
            }
            if (rect != null) {
                return rect;
            }
        }
        return this.f37818p;
    }

    /* renamed from: h */
    public final void mo12770h() {
        C15644c cVar;
        if (this.f37810h) {
            C0201a aVar = this.f37806d;
            if (aVar != null) {
                aVar.setTran(((float) C7865r3.f26468a.mo8969b(this.f37803a)) * 0.25f);
            }
            VASCommonFragment vASCommonFragment = this.f37805c;
            if (vASCommonFragment != null && (cVar = (C15644c) C39818r.f106831a.mo62445d(vASCommonFragment).mo62449e(C15644c.class)) != null) {
                cVar.f42288I = 3;
            }
        }
    }
}
