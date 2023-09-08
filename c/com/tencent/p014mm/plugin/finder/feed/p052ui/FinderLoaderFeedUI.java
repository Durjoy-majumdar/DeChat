package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderFeedDetailUI;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import jq3.C60905o;
import kf1.C9854m5;
import kotlin.Metadata;
import o40.C61926c;
import rs1.C13140c8;
import rs1.C13194da;
import rs1.C13539y3;
import rs1.C13554z;
import rs1.C48085q4;
import rs1.C63513a1;
import rs1.C63545b1;
import rs1.C63547e;
import rs1.C63575n3;
import rs1.C63648v;
import rs1.C63654v2;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110826x0;
import vf1.C14852y3;
import vf1.C14856z3;
import ye1.C15976o;
import zn1.C16336r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "M", "Lkf1/m5;", "V", "Lcom/tencent/mm/plugin/finder/feed/FinderLoaderFeedUIContract$Presenter;", "P", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI */
public abstract class FinderLoaderFeedUI<M extends BaseFinderFeedLoader, V extends C9854m5, P extends FinderLoaderFeedUIContract$Presenter> extends MMFinderFeedDetailUI {

    /* renamed from: r */
    public static final /* synthetic */ int f14616r = 0;

    /* renamed from: o */
    public final C13601g f14617o = C36568h.m40985a(new C2991d(this));

    /* renamed from: p */
    public final C13601g f14618p = C36568h.m40985a(new C2989b(this));

    /* renamed from: q */
    public final C13601g f14619q = C36568h.m40985a(new C2988a(this));

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI$a */
    public static final class C2988a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLoaderFeedUI<M, V, P> f14620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2988a(FinderLoaderFeedUI<M, V, P> finderLoaderFeedUI) {
            super(0);
            this.f14620d = finderLoaderFeedUI;
        }

        public Object invoke() {
            FinderLoaderFeedUI<M, V, P> finderLoaderFeedUI = this.f14620d;
            int i = FinderLoaderFeedUI.f14616r;
            return finderLoaderFeedUI.mo3055Q7().f42960d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI$b */
    public static final class C2989b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderLoaderFeedUI<M, V, P> f14621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2989b(FinderLoaderFeedUI<M, V, P> finderLoaderFeedUI) {
            super(0);
            this.f14621d = finderLoaderFeedUI;
        }

        public Object invoke() {
            FinderLoaderFeedUI<M, V, P> finderLoaderFeedUI = this.f14621d;
            int i = FinderLoaderFeedUI.f14616r;
            return finderLoaderFeedUI.mo3055Q7().f42959c;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI$c */
    public static final class C2990c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLoaderFeedUI<M, V, P> f14622d;

        public C2990c(FinderLoaderFeedUI<M, V, P> finderLoaderFeedUI) {
            this.f14622d = finderLoaderFeedUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39622i0 a = C39818r.f106831a.mo62444c(this.f14622d).mo75002a(C63575n3.class);
            C87412m.m108593f(a, "UICProvider.of(this).get…allNormalUIC::class.java)");
            C63575n3.m74909c3((C63575n3) a, false, false, false, 7, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI$d */
    public static final class C2991d extends C87413o implements C32224a<C15976o> {

        /* renamed from: d */
        public final /* synthetic */ FinderLoaderFeedUI<M, V, P> f14623d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2991d(FinderLoaderFeedUI<M, V, P> finderLoaderFeedUI) {
            super(0);
            this.f14623d = finderLoaderFeedUI;
        }

        public Object invoke() {
            return C15976o.m14888a(this.f14623d.findViewById(C0966R.C0970id.egf));
        }
    }

    /* renamed from: N7 */
    public final TextView mo3054N7() {
        return (TextView) ((C36570n) this.f14618p).getValue();
    }

    /* renamed from: O7 */
    public abstract M mo2938O7();

    /* renamed from: P7 */
    public abstract P mo2939P7();

    /* renamed from: Q7 */
    public final C15976o mo3055Q7() {
        return (C15976o) ((C36570n) this.f14617o).getValue();
    }

    /* renamed from: R7 */
    public abstract V mo2940R7();

    /* renamed from: S7 */
    public abstract void mo2941S7();

    /* renamed from: T7 */
    public boolean mo2950T7() {
        return this instanceof BizProfileTimelineUI;
    }

    /* renamed from: U7 */
    public final void mo3056U7() {
        if (!C85875k4.m106197n0() || !C85875k4.m106154K(getTaskId())) {
            mo3055Q7().f42964h.setVisibility(8);
            mo3055Q7().f42963g.setVisibility(8);
            mo3055Q7().f42962f.setVisibility(8);
            return;
        }
        mo3055Q7().f42964h.setVisibility(0);
        mo3055Q7().f42963g.setVisibility(0);
        mo3055Q7().f42962f.setVisibility(4);
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet b = C110826x0.m151014b(C13539y3.class, C63513a1.class, C13194da.class, C56711j.class, FinderLikeGuideUIC.class, C63648v.class, C63547e.class, C13554z.class, C48085q4.class, C63545b1.class, C13140c8.class, C63654v2.class, C16336r.class);
        if (mo2950T7()) {
            b.add(C63575n3.class);
        }
        return b;
    }

    public boolean isHideStatusBar() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        FinderVideoLayout finderVideoLayout;
        super.onActivityResult(i, i2, intent);
        if (-1 == i2 && i == 101) {
            RecyclerView recyclerView = mo2940R7().getRecyclerView();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                RecyclerView.C16631z I0 = recyclerView.mo17023I0(((LinearLayoutManager) layoutManager).mo16957C());
                C60905o oVar = I0 instanceof C60905o ? (C60905o) I0 : null;
                if (oVar != null && (finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a)) != null) {
                    long longExtra = intent != null ? intent.getLongExtra("KEY_CACHE_OBJECT_ID", -1) : -1;
                    long longExtra2 = intent != null ? intent.getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", -1) : -1;
                    Log.m105924i("FinderLoaderFeedUI", "[onActivityResult] feedId=" + C61926c.m72691p(longExtra) + " seekTime=" + longExtra2);
                    if (longExtra2 != -1) {
                        FinderVideoLayout.m65079J(finderVideoLayout, longExtra2, 0, 0.0f, false, (ITPPlayerListener.IOnSeekCompleteListener) null, 30, (Object) null);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (((rs1.C63575n3) r0).mo88421d3(false) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r3 = this;
            java.util.HashSet r0 = r3.getUiComponents()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r0.next()
            com.tencent.mm.ui.component.UIComponent r1 = (com.tencent.p014mm.p136ui.component.UIComponent) r1
            boolean r1 = r1.onBackPressed()
            if (r1 == 0) goto L_0x0008
            return
        L_0x001b:
            com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter r0 = r3.mo2939P7()
            boolean r0 = r0.mo10276S0()
            r1 = 0
            if (r0 != 0) goto L_0x003f
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r0 = r0.mo62444c(r3)
            java.lang.Class<rs1.n3> r2 = rs1.C63575n3.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            java.lang.String r2 = "UICProvider.of(this).get…allNormalUIC::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            rs1.n3 r0 = (rs1.C63575n3) r0
            boolean r0 = r0.mo88421d3(r1)
            if (r0 == 0) goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            if (r1 != 0) goto L_0x0045
            r3.finish()
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLoaderFeedUI.onBackPressed():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        mo3056U7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!(this instanceof FinderHorizontalVideoHalfFeedUI)) {
            View decorView = getWindow().getDecorView();
            C87412m.m108593f(decorView, "window.decorView");
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
            getWindow().setStatusBarColor(0);
            getController().mo177059O0(this, getResources().getColor(C0966R.color.ahf));
            C74779i.m89536a(this, false);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo91112w(new ColorDrawable(0));
                supportActionBar.mo91104o();
            }
            LayoutInflater b = C85868k2.m106137b(getContext());
            View bodyView = getBodyView();
            C87412m.m108592e(bodyView, "null cannot be cast to non-null type android.view.ViewGroup");
            boolean z = true;
            b.inflate(C0966R.C0971layout.f359694ac3, (ViewGroup) bodyView, true);
            mo3055Q7().f42961e.setPadding(0, C75044y4.m89994f(this), 0, 0);
            mo3055Q7().f42957a.setOnClickListener(new C14852y3(this));
            mo3056U7();
            mo3055Q7().f42964h.setOnClickListener(new C14856z3(this));
            CharSequence mMTitle = getMMTitle();
            if (!(mMTitle == null || mMTitle.length() == 0)) {
                z = false;
            }
            if (z) {
                mo3054N7().setVisibility(8);
            } else {
                mo3054N7().setVisibility(0);
                mo3054N7().setText(getMMTitle());
            }
            C58784w3.f168295a.mo83945l(getWindow(), false);
            getWindow().getNavigationBarColor();
            setNavigationbarColor(getResources().getColor(C0966R.color.f3131gg));
            mo3055Q7().f42961e.setVisibility(0);
            View findViewById = findViewById(C0966R.C0970id.ivb);
            if (findViewById != null) {
                findViewById.setLayoutParams(new CoordinatorLayout.C103717e(-1, -1));
                findViewById.setBackgroundColor(getResources().getColor(C0966R.color.f3493v5));
            }
        }
        mo2941S7();
        FinderLoaderFeedUIContract$Presenter P7 = mo2939P7();
        C9854m5 R7 = mo2940R7();
        BaseFinderFeedLoader O7 = mo2938O7();
        P7.mo2547t1(O7, R7);
        if (mo2950T7()) {
            FrameLayout frameLayout = mo3055Q7().f42958b;
            frameLayout.setVisibility(0);
            frameLayout.setOnClickListener(new C2990c(this));
            C63575n3 n3Var = (C63575n3) C39818r.f106831a.mo62444c(this).mo75002a(C63575n3.class);
            n3Var.f180282h = O7;
            n3Var.mo88425i3(getIntent().getExtras());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        mo2939P7().onDetach();
    }

    public void onPause() {
        super.onPause();
        mo2939P7().mo10277T0();
    }

    public void onResume() {
        super.onResume();
        mo2939P7().mo10278W0();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C87412m.m108594g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        BaseFeedLoader.saveCache$default(mo2938O7(), getIntent(), mo2938O7().getInitPos(), (C2780c) null, 4, (Object) null);
    }

    public void setMMTitle(CharSequence charSequence) {
        super.setMMTitle(charSequence);
        CharSequence mMTitle = getMMTitle();
        if (mMTitle == null || mMTitle.length() == 0) {
            mo3054N7().setVisibility(8);
            return;
        }
        mo3054N7().setVisibility(0);
        mo3054N7().setText(getMMTitle());
    }

    public void setMMTitle(int i) {
        super.setMMTitle(i);
        CharSequence mMTitle = getMMTitle();
        if (mMTitle == null || mMTitle.length() == 0) {
            mo3054N7().setVisibility(8);
            return;
        }
        mo3054N7().setVisibility(0);
        mo3054N7().setText(getMMTitle());
    }

    public void setMMTitle(String str) {
        super.setMMTitle(str);
        CharSequence mMTitle = getMMTitle();
        if (mMTitle == null || mMTitle.length() == 0) {
            mo3054N7().setVisibility(8);
            return;
        }
        mo3054N7().setVisibility(0);
        mo3054N7().setText(getMMTitle());
    }
}
