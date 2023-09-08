package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.animation.Animator;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import bl3.C0324s;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.component.UIComponentFragment;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderFeedDetailUI;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderFriendTabFragment;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58784w3;
import er1.C7919x;
import fy3.C32224a;
import go3.C76003c;
import gy3.C24560g0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C8809w2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C88990b;
import o31.C11345b;
import os1.C11739f;
import p185kq.C10383h;
import p217oq.C11716d;
import p217oq.C11717f;
import q31.C118148a;
import rs1.C13194da;
import rs1.C13211e2;
import rs1.C13317l7;
import rs1.C13340n6;
import rs1.C13367pa;
import rs1.C13421r8;
import rs1.C13442s8;
import rs1.C13466ta;
import rs1.C13502w6;
import rs1.C13521w7;
import rs1.C13539y3;
import rs1.C13554z;
import rs1.C48085q4;
import rs1.C63513a1;
import rs1.C63545b1;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110826x0;
import sx3.C90364q0;
import te3.C49712hj1;
import ts1.C14078c;
import u24.C90599h;
import u91.C22623c;
import vf1.C14742c6;
import wc1.C15124t;
import z04.C112550d0;
import z91.C23462b;
import zp3.C79406f;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI5 */
public class OccupyFinderUI5 extends MMFinderFeedDetailUI {

    /* renamed from: v */
    public static long f14942v = System.nanoTime();

    /* renamed from: w */
    public static final /* synthetic */ int f14943w = 0;

    /* renamed from: o */
    public long f14944o;

    /* renamed from: p */
    public long f14945p;

    /* renamed from: q */
    public FinderFriendTabFragment f14946q;

    /* renamed from: r */
    public boolean f14947r;

    /* renamed from: s */
    public int f14948s;

    /* renamed from: t */
    public boolean f14949t;

    /* renamed from: u */
    public boolean f14950u;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI5$a */
    public static final class C3095a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f14951d;

        /* renamed from: e */
        public final /* synthetic */ OccupyFinderUI5 f14952e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3095a(View view, OccupyFinderUI5 occupyFinderUI5) {
            super(0);
            this.f14951d = view;
            this.f14952e = occupyFinderUI5;
        }

        public Object invoke() {
            View view = this.f14951d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5$finish$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5$finish$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            OccupyFinderUI5.super.finish();
            this.f14952e.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI5$b */
    public static final class C3096b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI5 f14953d;

        public C3096b(OccupyFinderUI5 occupyFinderUI5) {
            this.f14953d = occupyFinderUI5;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            OccupyFinderUI5 occupyFinderUI5 = this.f14953d;
            occupyFinderUI5.f14948s = 1;
            occupyFinderUI5.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI5$c */
    public static final class C3097c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI5 f14954d;

        public C3097c(OccupyFinderUI5 occupyFinderUI5) {
            this.f14954d = occupyFinderUI5;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderFriendTabFragment finderFriendTabFragment = this.f14954d.f14946q;
            if (finderFriendTabFragment != null) {
                finderFriendTabFragment.mo4177S();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI5$d */
    public static final class C3098d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ OccupyFinderUI5 f14955d;

        public C3098d(OccupyFinderUI5 occupyFinderUI5) {
            this.f14955d = occupyFinderUI5;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderFriendTabFragment finderFriendTabFragment = this.f14955d.f14946q;
            if (finderFriendTabFragment != null) {
                finderFriendTabFragment.mo4177S();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI5$e */
    public static final class C3099e implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ OccupyFinderUI5 f14956a;

        public C3099e(OccupyFinderUI5 occupyFinderUI5) {
            this.f14956a = occupyFinderUI5;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            Class cls = C10383h.class;
            Intent intent = this.f14956a.getIntent();
            String str2 = null;
            String valueOf = String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
            if (C90599h.m113511d(valueOf)) {
                valueOf = C11716d.f34294a;
            }
            C13604l[] lVarArr = new C13604l[5];
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            String str3 = "";
            if (Wb == null) {
                Wb = str3;
            }
            lVarArr[0] = new C13604l("behaviour_session_id", Wb);
            String E = ((C10383h) C86312j.m106911c(cls)).mo10696E();
            if (E == null) {
                E = str3;
            }
            lVarArr[1] = new C13604l("finder_context_id", E);
            String S0 = ((C10383h) C86312j.m106911c(cls)).mo10698S0();
            if (S0 != null) {
                str3 = S0;
            }
            lVarArr[2] = new C13604l("finder_tab_context_id", str3);
            lVarArr[3] = new C13604l("extra_info", valueOf);
            Intent intent2 = this.f14956a.getIntent();
            if (intent2 != null) {
                str2 = intent2.getStringExtra("key_enter_source_info");
            }
            lVarArr[4] = new C13604l("enter_source_info", String.valueOf(str2));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI5$f */
    public static final class C3100f implements Runnable {

        /* renamed from: d */
        public static final C3100f f14957d = new C3100f();

        public final void run() {
            ((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11606k3(1, C11739f.C11741b.SOURCE_EXIT);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI5$g */
    public static final class C3101g implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ View f14958d;

        /* renamed from: e */
        public final /* synthetic */ OccupyFinderUI5 f14959e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f14960f;

        public C3101g(View view, OccupyFinderUI5 occupyFinderUI5, C32224a<C13598b0> aVar) {
            this.f14958d = view;
            this.f14959e = occupyFinderUI5;
            this.f14960f = aVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f14960f.invoke();
            this.f14959e.f14950u = false;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f14958d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5$revealActivity$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5$revealActivity$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            OccupyFinderUI5 occupyFinderUI5 = this.f14959e;
            occupyFinderUI5.f14950u = true;
            C88990b.m111194c(occupyFinderUI5.getContext(), (C88990b.C61771c) null);
        }
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 1;
    }

    /* renamed from: O7 */
    public final void mo3134O7(View view, int i, int i2, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "rootLayout");
        C87412m.m108594g(aVar, "call");
        if (!this.f14950u) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width < height) {
                width = height;
            }
            float f = ((float) width) * (z ? 1.0f : 1.1f);
            view.animate().cancel();
            Log.m105924i("Finder.FriendTabAffinityUI", "[revealActivity] x=" + i + " y=" + i2 + " isExit=" + z + " finalRadius=" + f);
            float f2 = z ? f : 0.0f;
            if (z) {
                f = 0.0f;
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f2, f);
            C87412m.m108593f(createCircularReveal, "createCircularReveal(roo…xit) 0f else finalRadius)");
            createCircularReveal.setDuration(z ? 420 : 480);
            createCircularReveal.setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator());
            createCircularReveal.addListener(new C3101g(view, this, aVar));
            createCircularReveal.start();
        }
    }

    public boolean enableActivityAnimation() {
        return !getIntent().hasExtra("EXTRA_CIRCULAR_REVEAL_X");
    }

    public void finish() {
        Log.m105924i("Finder.FriendTabAffinityUI", "[finish] page_exit_mode=" + this.f14948s + " isAutoRefreshFriendTab=" + this.f14947r);
        FinderFriendTabFragment finderFriendTabFragment = this.f14946q;
        if (finderFriendTabFragment != null) {
            ((C13317l7) C39818r.f106831a.mo62445d(finderFriendTabFragment).mo75002a(C13317l7.class)).mo12758c3("page_exit_mode", String.valueOf(this.f14948s));
        }
        C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3();
        C11717f fVar = (C11717f) C86312j.m106911c(C11717f.class);
        String str = q3.f134670d;
        String simpleName = getClass().getSimpleName();
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f14944o;
        long j2 = currentTimeMillis - j;
        long currentTimeMillis2 = System.currentTimeMillis();
        String str2 = q3.f134672f;
        String e = ((C23462b) ((C10383h) C86312j.m106911c(C10383h.class)).mo10693DZ()).mo36921e();
        String str3 = q3.f134671e;
        String str4 = str3 == null ? "" : str3;
        String stringExtra = getIntent().getStringExtra("key_extra_info");
        fVar.f50(new C22623c(str, simpleName, j2, j, currentTimeMillis2, str2, e, 0, false, stringExtra == null ? "" : stringExtra, (String) null, str4, 1280, (C8480h) null));
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        if (!getIntent().hasExtra("EXTRA_CIRCULAR_REVEAL_X") || !getIntent().hasExtra("EXTRA_CIRCULAR_REVEAL_Y")) {
            super.finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("EXTRA_CIRCULAR_REVEAL_X", 0);
        int intExtra2 = getIntent().getIntExtra("EXTRA_CIRCULAR_REVEAL_Y", 0);
        View findViewById = findViewById(C0966R.C0970id.iwf);
        C87412m.m108593f(findViewById, "rootLayout");
        mo3134O7(findViewById, intExtra, intExtra2, true, new C3095a(findViewById, this));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359693ac2;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Class<C13194da> cls = C13194da.class;
        return C110826x0.m151017e(C63545b1.class, C48085q4.class, C13211e2.class, C13340n6.class, MediaPreloadCore.class, C13442s8.class, C13521w7.class, FinderLikeGuideUIC.class, C13466ta.class, C13421r8.class, cls, C14078c.class, cls, C13367pa.class, C15124t.class, C0324s.m265a(C24560g0.m30725a(C8809w2.class)), C13502w6.class, C63513a1.class, C13539y3.class, C13554z.class);
    }

    public boolean isHideStatusBar() {
        return true;
    }

    public boolean isSupportNavigationSwipeBack() {
        return true;
    }

    public void onBackPressed() {
        for (UIComponent onBackPressed : getUiComponents()) {
            if (onBackPressed.onBackPressed()) {
                return;
            }
        }
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        C87412m.m108593f(fragments, "supportFragmentManager.fragments");
        for (Fragment fragment : fragments) {
            if (fragment instanceof UIComponentFragment) {
                for (UIComponent onBackPressed2 : ((UIComponentFragment) fragment).f165434e) {
                    if (onBackPressed2.onBackPressed()) {
                        return;
                    }
                }
                continue;
            }
        }
        this.f14948s = 3;
        finish();
    }

    public void onCreate(Bundle bundle) {
        FinderFriendTabFragment finderFriendTabFragment;
        Class cls = FinderCommonFeatureService.class;
        Class cls2 = C61212e.class;
        super.onCreate(bundle);
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "this.window.decorView");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        C74779i.m89536a(this, false);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91112w(new ColorDrawable(0));
            supportActionBar.mo91104o();
        }
        C58784w3 w3Var = C58784w3.f168295a;
        w3Var.mo83945l(getWindow(), false);
        setNavigationbarColor(getResources().getColor(C0966R.color.f3131gg));
        int f = C75044y4.m89994f(this);
        View findViewById = findViewById(C0966R.C0970id.iwf);
        if (findViewById != null) {
            findViewById.setPadding(0, f, 0, 0);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().getDecorView().setBackgroundDrawable((Drawable) null);
        if (!C87412m.m108589b(getIntent().getStringExtra("ENTER_SOURCE"), "bubble")) {
            overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
            ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("TLRecommendTab");
        } else {
            View findViewById2 = findViewById(C0966R.C0970id.iwf);
            C87412m.m108593f(findViewById2, "findViewById(R.id.root_container)");
            if (bundle != null || !getIntent().hasExtra("EXTRA_CIRCULAR_REVEAL_X") || !getIntent().hasExtra("EXTRA_CIRCULAR_REVEAL_Y")) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById2;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5", "runEnterAnim", "(Landroid/os/Bundle;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5", "runEnterAnim", "(Landroid/os/Bundle;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(4);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5", "runEnterAnim", "(Landroid/os/Bundle;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI5", "runEnterAnim", "(Landroid/os/Bundle;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intExtra = getIntent().getIntExtra("EXTRA_CIRCULAR_REVEAL_X", 0);
                int intExtra2 = getIntent().getIntExtra("EXTRA_CIRCULAR_REVEAL_Y", 0);
                ViewTreeObserver viewTreeObserver = findViewById2.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(new C14742c6(this, findViewById2, intExtra, intExtra2));
                }
            }
        }
        this.f14944o = System.currentTimeMillis();
        float dimension = getResources().getDimension(C0966R.dimen.f3736cp);
        ((RoundedCornerFrameLayout) findViewById(C0966R.C0970id.btv)).mo153905b(dimension, dimension, 0.0f, 0.0f);
        TextView textView = (TextView) findViewById(C0966R.C0970id.kcp);
        int a = C79406f.m96347a(getContext(), 18.0f);
        C87412m.m108593f(textView, LocaleUtil.ITALIAN);
        C7919x.m8091a(textView);
        String string = getContext().getResources().getString(C0966R.string.da9, new Object[]{"@"});
        C87412m.m108593f(string, "context.resources.getStr…_tab_bubble_title_2, \"@\")");
        SpannableString spannableString = new SpannableString(string);
        int E = C112550d0.m153769E(string, "@", 0, false, 6, (Object) null);
        int color = getContext().getResources().getColor(C0966R.color.f2975b6);
        Integer b0 = w3Var.mo83917b0(1, true);
        Drawable e = C74933u4.m89768e(getContext(), b0 != null ? b0.intValue() : C0966R.raw.icons_filled_little_like, color);
        e.setBounds(0, 0, a, a);
        spannableString.setSpan(new C76003c(e, 1), E, E + 1, 33);
        textView.setText(spannableString);
        this.f14946q = new FinderFriendTabFragment();
        C39818r rVar = C39818r.f106831a;
        this.f14947r = ((C11739f) rVar.mo62446e(cls).mo75002a(C11739f.class)).mo11603f3(1);
        if (getIntent().getBooleanExtra("IsFirstEnterTab", false) && (finderFriendTabFragment = this.f14946q) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("IsFirstEnterTab", true);
            finderFriendTabFragment.f17335p = bundle2;
        }
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
        FinderFriendTabFragment finderFriendTabFragment2 = this.f14946q;
        C87412m.m108591d(finderFriendTabFragment2);
        beginTransaction.mo165200l(C0966R.C0970id.eek, finderFriendTabFragment2);
        beginTransaction.mo165162d();
        findViewById(C0966R.C0970id.bes).setOnClickListener(new C3096b(this));
        findViewById(C0966R.C0970id.koz).setOnClickListener(new C3097c(this));
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Zx0(4, 1, ((C13442s8) rVar.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3(), 11);
        findViewById(C0966R.C0970id.koz).setOnClickListener(new C3098d(this));
        ((C61212e) C86312j.m106911c(cls2)).mo86178qr(this, C11345b.OccupyFinderUI5);
        ((C61212e) C86312j.m106911c(cls2)).mo86136FZ(this, getClass().getSimpleName());
        ((C61212e) C86312j.m106911c(cls2)).mo86148No(this, 40, 24184);
        ((C61212e) C86312j.m106911c(cls2)).E60(this, new C3099e(this));
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        setTheme(C0966R.style.f8629pa);
    }

    public void onDestroy() {
        super.onDestroy();
        ((C119157j) C119157j.f356862d).mo183895z(C3100f.f14957d);
    }

    public void onPause() {
        Class cls = C10383h.class;
        if (this.f14946q != null) {
            C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3();
            C11717f fVar = (C11717f) C86312j.m106911c(C11717f.class);
            String str = q3.f134670d;
            String Dt = ((C10383h) C86312j.m106911c(cls)).mo10695Dt("FinderFriendTabFragment");
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f14945p;
            long j2 = currentTimeMillis - j;
            long currentTimeMillis2 = System.currentTimeMillis();
            String str2 = q3.f134672f;
            String e = ((C23462b) ((C10383h) C86312j.m106911c(cls)).mo10693DZ()).mo36921e();
            String str3 = q3.f134671e;
            String str4 = str3 == null ? "" : str3;
            String stringExtra = getIntent().getStringExtra("key_extra_info");
            fVar.f50(new C22623c(str, Dt, j2, j, currentTimeMillis2, str2, e, 0, false, stringExtra == null ? "" : stringExtra, (String) null, str4, 1280, (C8480h) null));
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f14945p = System.currentTimeMillis();
    }

    public void onStop() {
        super.onStop();
        C11739f fVar = (C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        FinderFriendTabFragment finderFriendTabFragment = this.f14946q;
        fVar.mo11604g3(finderFriendTabFragment != null ? finderFriendTabFragment.f17334o : 0);
    }

    public void onSwipeBack() {
        this.f14948s = 2;
        super.onSwipeBack();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && !this.f14949t) {
            FinderFriendTabFragment finderFriendTabFragment = this.f14946q;
            if (finderFriendTabFragment != null) {
                finderFriendTabFragment.mo2202O();
            }
            this.f14949t = true;
        }
    }
}
