package com.tencent.p014mm.plugin.finder.activity.base.uic;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bl3.C54492n;
import ce1.C0465g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedStickyEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.activity.fragment.FinderActivityFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p192l4.C10462b;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import te3.C51270sn1;
import te3.C52271zj0;
import ye1.C15968c;

/* renamed from: com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC */
public abstract class FinderBaseContentUIC extends UIComponent {

    /* renamed from: d */
    public int f12457d;

    /* renamed from: e */
    public String f12458e = "";

    /* renamed from: f */
    public String f12459f;

    /* renamed from: g */
    public long f12460g;

    /* renamed from: h */
    public String f12461h;

    /* renamed from: i */
    public C52271zj0 f12462i;

    /* renamed from: j */
    public final C13601g f12463j = C36568h.m40985a(new C2302a(this));

    /* renamed from: n */
    public final FinderBaseContentUIC$finderTopicInfoListener$1 f12464n;

    /* renamed from: o */
    public final FinderBaseContentUIC$feedStickyListener$1 f12465o;

    /* renamed from: com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC$a */
    public static final class C2302a extends C87413o implements C32224a<C15968c> {

        /* renamed from: d */
        public final /* synthetic */ FinderBaseContentUIC f12466d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2302a(FinderBaseContentUIC finderBaseContentUIC) {
            super(0);
            this.f12466d = finderBaseContentUIC;
        }

        public Object invoke() {
            View findViewById = this.f12466d.findViewById(C0966R.C0970id.ksm);
            int i = C0966R.C0970id.cj7;
            TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.cj7);
            if (textView != null) {
                i = C0966R.C0970id.cjg;
                FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.cjg);
                if (frameLayout != null) {
                    i = C0966R.C0970id.i5i;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C10462b.m10395a(findViewById, C0966R.C0970id.i5i);
                    if (coordinatorLayout != null) {
                        i = C0966R.C0970id.i7j;
                        ProgressBar progressBar = (ProgressBar) C10462b.m10395a(findViewById, C0966R.C0970id.i7j);
                        if (progressBar != null) {
                            i = C0966R.C0970id.is_;
                            TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.is_);
                            if (textView2 != null) {
                                i = C0966R.C0970id.ivb;
                                RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ivb);
                                if (refreshLoadMoreLayout != null) {
                                    i = C0966R.C0970id.knd;
                                    FrameLayout frameLayout2 = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.knd);
                                    if (frameLayout2 != null) {
                                        i = C0966R.C0970id.ksl;
                                        RecyclerView recyclerView = (RecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.ksl);
                                        if (recyclerView != null) {
                                            FrameLayout frameLayout3 = (FrameLayout) findViewById;
                                            return new C15968c(frameLayout3, textView, frameLayout, coordinatorLayout, progressBar, textView2, refreshLoadMoreLayout, frameLayout2, recyclerView, frameLayout3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderBaseContentUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C40008f fVar = C40008f.f107254d;
        this.f12464n = new FinderBaseContentUIC$finderTopicInfoListener$1(this, fVar);
        this.f12465o = new FinderBaseContentUIC$feedStickyListener$1(this, fVar);
    }

    /* renamed from: c3 */
    public int mo316c3(int i) {
        if (i >= 3) {
            return 12;
        }
        return mo320i3();
    }

    /* renamed from: d3 */
    public int mo317d3() {
        return 59;
    }

    /* renamed from: e3 */
    public int mo2199e3() {
        return 1;
    }

    /* renamed from: f3 */
    public abstract FinderTabUIC mo318f3();

    /* renamed from: g3 */
    public String mo319g3() {
        String stringExtra = getIntent().getStringExtra("key_activity_name");
        return stringExtra == null ? "" : stringExtra;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a8l;
    }

    /* renamed from: i3 */
    public int mo320i3() {
        return 7;
    }

    /* renamed from: j3 */
    public boolean mo2200j3() {
        return this.f12457d == 2;
    }

    /* renamed from: k3 */
    public abstract void mo521k3(FeedStickyEvent feedStickyEvent);

    /* renamed from: l3 */
    public abstract void mo522l3();

    /* renamed from: m3 */
    public abstract void mo523m3(C52271zj0 zj02);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (getFragment() instanceof FinderHomeTabFragment) {
            Fragment fragment = getFragment();
            C87412m.m108592e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
            int i2 = ((FinderHomeTabFragment) fragment).f17334o;
            Log.m105924i(C54492n.TAG, "convertInnerTabType : " + i2);
            i = 1 + i2;
        }
        this.f12457d = i;
        this.f12460g = getIntent().getLongExtra("key_activity_id", 0);
        if (this.f12457d > 2 && (getFragment() instanceof FinderActivityFragment)) {
            Fragment fragment2 = getFragment();
            C87412m.m108592e(fragment2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment");
            this.f12460g = ((FinderActivityFragment) fragment2).f12469q;
        }
        this.f12461h = getIntent().getStringExtra("key_encrypted_topic_id");
        this.f12458e = mo319g3();
        this.f12459f = getIntent().getStringExtra("key_by_pass_info");
        C51270sn1 sn12 = (C51270sn1) ((C0465g) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C0465g.class)).f33564d;
        this.f12462i = sn12 != null ? sn12.f141633w : null;
        this.f12465o.alive();
        this.f12464n.alive();
        setCoveredStyle();
        Log.m105924i(C54492n.TAG, "topic:" + this.f12458e + " topicType:" + mo320i3() + " tabType:" + this.f12457d + " eventTopicId:" + this.f12460g + " encryptedEventTopicId:" + this.f12461h);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPreDestroyed() {
        Class cls = C13442s8.class;
        Fragment fragment = getFragment();
        if (fragment != null) {
            C39818r rVar = C39818r.f106831a;
            ((C13442s8) rVar.mo62445d(fragment).mo75002a(cls)).getClass();
            ((C13442s8) rVar.mo62445d(fragment).mo75002a(cls)).onDestroy();
        }
        super.onPreDestroyed();
        this.f12464n.dead();
        this.f12465o.dead();
    }

    public void setCoveredStyle() {
    }
}
