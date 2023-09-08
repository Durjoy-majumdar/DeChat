package com.tencent.p014mm.plugin.finder.nearby;

import ak1.C0075i;
import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import bh3.C113177k;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderTabSelectedEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.localcity.NearbyLiveLocalCityFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.square.nearbylivefriends.NearbyLiveFriendsSquareFragment;
import com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonFragment;
import com.tencent.p014mm.plugin.finder.nearby.video.NearbyVideoFragment;
import com.tencent.p014mm.plugin.finder.view.FinderFragmentChangeObserver;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import er1.C75653r5;
import f40.C86709a0;
import fm1.C8138e;
import fm1.C8139f;
import fm1.C8164o;
import fy3.C32226l;
import gy3.C87412m;
import hn1.C8614b;
import ht1.C8815x4;
import im1.C9200b;
import im1.C9201c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import jm1.C9472a;
import l31.C61212e;
import ln1.C10585g;
import mm1.C10935b;
import nn1.C11232a;
import nn1.C11235c;
import o31.C11345b;
import o31.C76986a;
import p185kq.C10383h;
import p192l4.C10462b;
import p565ir.C60606n;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C49712hj1;
import up1.C37521f;
import vc1.C37715b;

/* renamed from: com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC */
public final class NearbyHomeUIC extends UIComponent {

    /* renamed from: d */
    public boolean f15511d;

    /* renamed from: e */
    public boolean f15512e;

    /* renamed from: f */
    public final ArrayList<AbsNearByFragment> f15513f;

    /* renamed from: g */
    public int f15514g;

    /* renamed from: h */
    public int f15515h;

    /* renamed from: i */
    public C9472a f15516i;

    /* renamed from: j */
    public final C3270a f15517j;

    /* renamed from: n */
    public final IListener<FinderTabSelectedEvent> f15518n;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC$a */
    public static final class C3270a extends C9200b {

        /* renamed from: h */
        public final /* synthetic */ AppCompatActivity f15519h;

        /* renamed from: i */
        public final /* synthetic */ NearbyHomeUIC f15520i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3270a(AppCompatActivity appCompatActivity, NearbyHomeUIC nearbyHomeUIC, ArrayList<AbsNearByFragment> arrayList) {
            super((MMActivity) appCompatActivity, arrayList);
            this.f15519h = appCompatActivity;
            this.f15520i = nearbyHomeUIC;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        }

        /* renamed from: a */
        public void mo3546a(boolean z, int i, AbsNearByFragment absNearByFragment) {
            C87412m.m108594g(absNearByFragment, "fragment");
        }

        /* renamed from: k */
        public void mo3547k(int i, int i2, int i3, int i4) {
            TabLayout.C55061f k;
            Log.m105924i(FinderFragmentChangeObserver.TAG, "onFragmentChange from:" + i + " to:" + i2);
            ((C54108o) C86312j.m106911c(C54108o.class)).Ix0((RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "94", C0075i.EVENT_ON_RESUME, i3, i4);
            this.f15520i.f15514g = i2;
            C39818r rVar = C39818r.f106831a;
            C39622i0 a = rVar.mo62444c(this.f15519h).mo75002a(C8139f.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…ActionBarUIC::class.java)");
            TabLayout f3 = ((C8139f) a).mo9206f3();
            if (!(f3 == null || (k = f3.mo146907k(i2)) == null || k.mo76120a())) {
                k.mo76121b();
            }
            NearbyHomeUIC nearbyHomeUIC = this.f15520i;
            nearbyHomeUIC.getClass();
            Class cls = C8815x4.class;
            if (i != -1) {
                if ((i == 1 && i2 == 0) || (i == 0 && i2 == 1)) {
                    ((C8815x4) rVar.mo62444c(nearbyHomeUIC.getActivity()).mo62447c(cls)).mo9641e1();
                }
            } else if (i2 == 0 || (i2 == 1 && nearbyHomeUIC.f15513f.size() > 1 && !(nearbyHomeUIC.f15513f.get(1) instanceof NearbyLiveFriendsSquareFragment))) {
                ((C8815x4) rVar.mo62444c(nearbyHomeUIC.getActivity()).mo62447c(cls)).mo9641e1();
            }
            this.f15520i.mo3544e3(i3, false);
            this.f15520i.mo3544e3(i4, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.NearbyHomeUIC$b */
    public static final class C3271b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ NearbyHomeUIC f15521d;

        /* renamed from: e */
        public final /* synthetic */ int f15522e;

        public C3271b(NearbyHomeUIC nearbyHomeUIC, int i) {
            this.f15521d = nearbyHomeUIC;
            this.f15522e = i;
        }

        public final void run() {
            TabLayout.C55061f k;
            C39622i0 a = C39818r.f106831a.mo62444c(this.f15521d.getActivity()).mo75002a(C8139f.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…ActionBarUIC::class.java)");
            int d3 = this.f15521d.mo3543d3(this.f15522e);
            TabLayout f3 = ((C8139f) a).mo9206f3();
            if (!(f3 == null || (k = f3.mo146907k(d3)) == null || k.mo76120a())) {
                k.mo76121b();
            }
            NearbyHomeUIC nearbyHomeUIC = this.f15521d;
            nearbyHomeUIC.f15517j.onPageSelected(nearbyHomeUIC.mo3543d3(this.f15522e));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyHomeUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f15512e = (((long) C75592q0.m90785o()) & 512) == 0;
        ArrayList<AbsNearByFragment> c = C37715b.f99914a.mo61298a() ? this.f15512e ? C64197v.m75534c(new NearbyVideoFragment(), new NearbyLiveLocalCityFragment(), new NearbyPersonFragment()) : C64197v.m75534c(new NearbyVideoFragment(), new NearbyLiveLocalCityFragment()) : this.f15512e ? C64197v.m75534c(new NearbyVideoFragment(), new NearbyLiveFriendsSquareFragment(), new NearbyPersonFragment()) : C64197v.m75534c(new NearbyVideoFragment(), new NearbyLiveFriendsSquareFragment());
        this.f15513f = c;
        this.f15514g = 1;
        this.f15515h = 1002;
        this.f15517j = new C3270a(appCompatActivity, this, c);
        this.f15518n = new NearbyHomeUIC$eventListener$1(this, C40008f.f107254d);
    }

    /* renamed from: c3 */
    public final AbsNearByFragment mo3542c3() {
        C9472a aVar = this.f15516i;
        FinderViewPager finderViewPager = aVar != null ? aVar.f29547a : null;
        if (finderViewPager == null) {
            Log.m105920e("NearbyHomeUIC", "[getActiveFragment] viewPager==null lastIndex=" + this.f15514g);
        }
        int currentItem = finderViewPager != null ? finderViewPager.getCurrentItem() : this.f15514g;
        if (currentItem < 0 || currentItem >= this.f15513f.size() || this.f15513f.size() == 0) {
            return null;
        }
        return this.f15513f.get(currentItem);
    }

    /* renamed from: d3 */
    public final int mo3543d3(int i) {
        Iterator<AbsNearByFragment> it = this.f15513f.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().f15527o == i) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        Log.m105920e("Finder.HomeUIC", "[getIndex] type=" + i + " is invalid.");
        return 0;
    }

    /* renamed from: e3 */
    public final void mo3544e3(int i, boolean z) {
        String str;
        Class cls = C113177k.class;
        switch (i) {
            case 1001:
                str = ".ui.nearby.Live";
                break;
            case 1002:
                str = ".ui.nearby.FinderVideo";
                break;
            case 1003:
                str = ".ui.nearby.Person";
                break;
            default:
                str = null;
                break;
        }
        if (str == null) {
            return;
        }
        if (z) {
            this.f15515h = i;
            ((C113177k) C86312j.m106911c(cls)).mo165709du(str);
            return;
        }
        ((C113177k) C86312j.m106911c(cls)).mo165697Ci(str);
    }

    /* renamed from: f3 */
    public final void mo3545f3(int i) {
        int d3 = mo3543d3(i);
        StringBuilder sb = new StringBuilder();
        sb.append("setCurrentTabIndex size:");
        sb.append(this.f15513f.size());
        sb.append(" index:");
        sb.append(d3);
        sb.append(" args:");
        FinderViewPager finderViewPager = null;
        sb.append((Object) null);
        Log.m105924i("NearbyHomeUIC", sb.toString());
        boolean z = false;
        if (d3 >= 0 && d3 < this.f15513f.size()) {
            z = true;
        }
        if (z) {
            C9472a aVar = this.f15516i;
            if (aVar != null) {
                finderViewPager = aVar.f29547a;
            }
            if (finderViewPager != null) {
                finderViewPager.setCurrentItem(d3);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bk7;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C10383h.class;
        C8164o oVar = C8164o.f27042a;
        int b = oVar.mo9218b();
        Log.m105924i("NearbyHomeUIC", "[onCreate] targetTabType=" + b);
        C11232a aVar = C11235c.f33110a;
        aVar.mo12482c("nearbyHomeOnCreate");
        aVar.f33099e = getActivity().hashCode();
        this.f15518n.alive();
        View findViewById = findViewById(C0966R.C0970id.mgc);
        LinearLayout linearLayout = (LinearLayout) findViewById;
        FinderViewPager finderViewPager = (FinderViewPager) C10462b.m10395a(findViewById, C0966R.C0970id.l89);
        if (finderViewPager != null) {
            this.f15516i = new C9472a(linearLayout, linearLayout, finderViewPager);
            finderViewPager.setEnableViewPagerScroll(true);
            FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
            C87412m.m108593f(supportFragmentManager, "activity.supportFragmentManager");
            finderViewPager.setAdapter(new C9201c(supportFragmentManager, this.f15513f));
            finderViewPager.addOnPageChangeListener(this.f15517j);
            finderViewPager.setOffscreenPageLimit(3);
            finderViewPager.post(new C3271b(this, b));
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99421i2.mo60266n().intValue();
            String str = "";
            if (intValue > 0) {
                Context context = finderViewPager.getContext();
                C9472a aVar2 = this.f15516i;
                FinderViewPager finderViewPager2 = aVar2 != null ? aVar2.f29547a : null;
                try {
                    Field declaredField = ViewPager.class.getDeclaredField("mScroller");
                    C87412m.m108593f(declaredField, "ViewPager::class.java.ge…eclaredField(\"mScroller\")");
                    declaredField.setAccessible(true);
                    declaredField.set(finderViewPager2, new C75653r5(context, intValue));
                } catch (Exception e) {
                    Log.printErrStackTrace("ViewPageUtils", e, str, new Object[0]);
                }
            }
            C39818r rVar = C39818r.f106831a;
            String str2 = ((C13442s8) rVar.mo62444c(getActivity()).mo75002a(C13442s8.class)).f38098n;
            if (str2 != null) {
                str = str2;
            }
            String str3 = oVar.mo9220d() + '-' + C31543z5.m39453c();
            ((C60606n) C86312j.m106911c(C60606n.class)).mo85052c7(getActivity(), (C32226l<? super Boolean, C13598b0>) null);
            ((C10383h) C86312j.m106911c(cls)).mo10697OK(str);
            ((C10383h) C86312j.m106911c(cls)).rn0(str3);
            C10585g gVar = C10585g.f31933a;
            C87412m.m108594g(str3, "enterClickTabContextID");
            C10585g.f31934b = str;
            long c = C31543z5.m39453c();
            C10585g.f31935c = c;
            C10585g.f31936d = c;
            this.f15511d = true;
            mo3545f3(b);
            if (C37715b.f99914a.mo61298a()) {
                Log.m105928w("NearbyHomeUIC", "prepareLiveSquare not NearbyLiveSquareFragment");
            } else if (!(this.f15513f.get(1) instanceof NearbyLiveSquareFragment)) {
                Log.m105928w("NearbyHomeUIC", "prepareLiveSquare return for !is NearbyLiveSquareFragment");
            } else {
                AbsNearByFragment absNearByFragment = this.f15513f.get(1);
                C87412m.m108592e(absNearByFragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment");
                ((NearbyLiveSquareFragment) absNearByFragment).mo3604e0(getActivity());
                ((C8138e) rVar.mo62444c(getActivity()).mo75002a(C8138e.class)).mo9204f3();
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_ENTER_NEARBY_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77239M5("NearbyEntrance");
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86136FZ(this, NearbyHomeUIC.class.getSimpleName()).mo86178qr(this, C11345b.NearbyHomeUI).mo86179qs(this, C76986a.NewNearBy);
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(C0966R.C0970id.l89)));
    }

    public void onDestroy() {
        int i;
        super.onDestroy();
        this.f15518n.dead();
        C8614b.f27717a.mo9482g();
        C8164o oVar = C8164o.f27042a;
        if (this.f15511d) {
            AbsNearByFragment c3 = mo3542c3();
            i = c3 != null ? c3.f15527o : 1001;
        } else {
            i = oVar.mo9218b();
        }
        Log.m105924i("NearbyConfig", "saveExitTabType tabType:" + i);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_NEARBY_LAST_TAB_TYPE_INT_SYNC, Integer.valueOf(i));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_EXIT_NEARBY_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
        C10935b.f32585a.mo11140h();
        mo3544e3(this.f15515h, false);
        Log.m105924i("NearbyHomeUIC", "onDestroy fragments:" + this.f15513f);
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("NearbyHomeUIC", "onPause()");
        AbsNearByFragment c3 = mo3542c3();
        if (!(c3 instanceof NearbyLiveSquareFragment)) {
            C10585g.f31933a.mo10848f(c3);
        }
    }

    public void onResume() {
        String str;
        super.onResume();
        Log.m105924i("NearbyHomeUIC", "onResume()");
        C10585g gVar = C10585g.f31933a;
        C10585g.f31936d = C31543z5.m39453c();
        C11235c.f33110a.mo12482c("nearbyHomeOnResume");
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        C2483o0.C2484a aVar = C2483o0.f12984a;
        aVar.mo2463m(1, q3);
        AbsNearByFragment c3 = mo3542c3();
        if (c3 == null || (str = c3.mo3553U()) == null) {
            str = "";
        }
        aVar.mo2461k(1, q3, 0, str);
        aVar.mo2462l(1, q3);
    }
}
