package com.tencent.p014mm.plugin.finder.nearby.live.square;

import ak1.C0075i;
import ak1.C54067f0;
import ak1.C54108o;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderTabSelectedEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment;
import com.tencent.p014mm.plugin.finder.view.FinderFragmentChangeObserver;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C7813i5;
import f40.C86709a0;
import gy3.C87412m;
import im1.C9200b;
import java.util.Iterator;
import java.util.LinkedList;
import mk1.C10905g;
import rm1.C13087a;
import rs1.C13442s8;
import sm1.C13731a;
import te3.C51942x91;
import um1.C14248a;
import up1.C37521f;
import wm1.C15530g;

/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC */
public final class NearbyLiveSquareUIC extends UIComponent {

    /* renamed from: d */
    public FinderViewPager f15655d;

    /* renamed from: e */
    public boolean f15656e;

    /* renamed from: f */
    public C13731a f15657f;

    /* renamed from: g */
    public C10905g f15658g;

    /* renamed from: h */
    public C51942x91 f15659h;

    /* renamed from: i */
    public long f15660i = -1;

    /* renamed from: j */
    public String f15661j = "";

    /* renamed from: n */
    public int f15662n = -1;

    /* renamed from: o */
    public final LinkedList<NearbyLiveSquareTabFragment> f15663o;

    /* renamed from: p */
    public final LinkedList<C51942x91> f15664p;

    /* renamed from: q */
    public boolean f15665q;

    /* renamed from: r */
    public final C3306a f15666r;

    /* renamed from: s */
    public final IListener<FinderTabSelectedEvent> f15667s;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC$a */
    public static final class C3306a extends C9200b {

        /* renamed from: h */
        public final /* synthetic */ NearbyLiveSquareUIC f15668h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3306a(NearbyLiveSquareUIC nearbyLiveSquareUIC, AppCompatActivity appCompatActivity, LinkedList<NearbyLiveSquareTabFragment> linkedList) {
            super((MMActivity) appCompatActivity, linkedList);
            this.f15668h = nearbyLiveSquareUIC;
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
            if (!(i == -1 || i == i2)) {
                Log.m105924i(FinderFragmentChangeObserver.TAG, "onFragmentChange hit onPageScrolled scroll change.");
                C39818r rVar = C39818r.f106831a;
                Fragment fragment = this.f15668h.getFragment();
                C87412m.m108591d(fragment);
                ((C14248a) rVar.mo62445d(fragment).mo75002a(C14248a.class)).f39775d.mo10662e();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEVER_SCROLL_IN_LIVE_SQUARE_CNT_BOOLEAN_SYNC, Boolean.FALSE);
                C13087a.f37262i = 3;
            }
            ((C54108o) C86312j.m106911c(C54108o.class)).Ix0((RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "94", C0075i.EVENT_ON_RESUME, i3, i4);
            NearbyLiveSquareUIC nearbyLiveSquareUIC = this.f15668h;
            nearbyLiveSquareUIC.f15662n = i2;
            C39818r rVar2 = C39818r.f106831a;
            Fragment fragment2 = nearbyLiveSquareUIC.getFragment();
            C87412m.m108591d(fragment2);
            C39622i0 a = rVar2.mo62445d(fragment2).mo75002a(C15530g.class);
            C87412m.m108593f(a, "UICProvider.of(fragment!…TabLayoutUIC::class.java)");
            TabLayout f3 = ((C15530g) a).mo14306f3();
            if (f3 != null && (k = f3.mo146907k(i2)) != null && !k.mo76120a()) {
                k.mo76121b();
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyLiveSquareUIC(MMFragmentActivity mMFragmentActivity) {
        super((AppCompatActivity) mMFragmentActivity);
        C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        LinkedList<NearbyLiveSquareTabFragment> linkedList = new LinkedList<>();
        this.f15663o = linkedList;
        this.f15664p = new LinkedList<>();
        this.f15666r = new C3306a(this, getActivity(), linkedList);
        this.f15667s = new NearbyLiveSquareUIC$eventListener$1(this, C40008f.f107254d);
    }

    /* renamed from: c3 */
    public static final void m3321c3(NearbyLiveSquareUIC nearbyLiveSquareUIC) {
        String S;
        nearbyLiveSquareUIC.getClass();
        C39818r rVar = C39818r.f106831a;
        Fragment fragment = nearbyLiveSquareUIC.getFragment();
        C87412m.m108591d(fragment);
        String str = ((C13442s8) rVar.mo62445d(fragment).mo75002a(C13442s8.class)).f38098n;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        Intent intent = new Intent();
        intent.putExtra("key_context_id", str);
        intent.putExtra("key_click_tab_context_id", C13087a.f37256c);
        NearbyLiveSquareTabFragment d3 = nearbyLiveSquareUIC.mo3605d3();
        if (!(d3 == null || (S = d3.mo3551S()) == null)) {
            str2 = S;
        }
        intent.putExtra("key_click_sub_tab_context_id", str2);
        C13731a aVar = nearbyLiveSquareUIC.f15657f;
        if (aVar != null) {
            aVar.mo13108a(intent);
        } else {
            C87412m.m108603p("liveSearchHelper");
            throw null;
        }
    }

    /* renamed from: j3 */
    public static void m3322j3(NearbyLiveSquareUIC nearbyLiveSquareUIC, int i, boolean z, Bundle bundle, int i2, Object obj) {
        boolean z2 = true;
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        nearbyLiveSquareUIC.getClass();
        Log.m105924i("NearbyLiveSquareUIC", "setCurrentTabIndex size:" + nearbyLiveSquareUIC.f15663o.size() + " index:" + i + " withAnim:" + z + " args:" + bundle);
        if (i < 0 || i >= nearbyLiveSquareUIC.f15663o.size()) {
            z2 = false;
        }
        if (z2) {
            if (bundle != null) {
                nearbyLiveSquareUIC.f15663o.get(i).getClass();
            }
            FinderViewPager finderViewPager = nearbyLiveSquareUIC.f15655d;
            if (finderViewPager != null) {
                finderViewPager.setCurrentItem(i, z);
            }
        }
    }

    /* renamed from: d3 */
    public final NearbyLiveSquareTabFragment mo3605d3() {
        FinderViewPager finderViewPager;
        Fragment fragment = getFragment();
        C87412m.m108591d(fragment);
        return mo3607f3((fragment.getView() == null || (finderViewPager = this.f15655d) == null) ? this.f15662n : finderViewPager != null ? finderViewPager.getCurrentItem() : this.f15662n);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f15690r;
     */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo3606e3() {
        /*
            r1 = this;
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r0 = r1.mo3605d3()
            if (r0 == 0) goto L_0x000d
            te3.x91 r0 = r0.f15690r
            if (r0 == 0) goto L_0x000d
            int r0 = r0.f144531d
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            int r0 = r1.mo3608g3(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.mo3606e3():int");
    }

    /* renamed from: f3 */
    public final NearbyLiveSquareTabFragment mo3607f3(int i) {
        if (i < 0 || i >= this.f15663o.size() || this.f15663o.size() == 0) {
            return null;
        }
        return this.f15663o.get(i);
    }

    /* renamed from: g3 */
    public final int mo3608g3(int i) {
        Iterator<C51942x91> it = this.f15664p.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().f144531d == i) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        Log.m105920e("NearbyLiveSquareUIC", "[getIndex] tabId=" + i + " is invalid.");
        return 0;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bkf;
    }

    /* renamed from: i3 */
    public final void mo3609i3(int i) {
        FinderViewPager finderViewPager;
        int g3 = mo3608g3(i);
        boolean z = false;
        if (g3 >= 0 && g3 < this.f15663o.size()) {
            z = true;
        }
        if (z && (finderViewPager = this.f15655d) != null) {
            finderViewPager.setCurrentItem(g3);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f15658g == null) {
            C87412m.m108603p("livePostHelper");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Class<kq.h> r1 = p185kq.C10383h.class
            java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
            android.os.Bundle r3 = r18.getArguments()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0018
            java.lang.String r6 = "key_use_dark_style"
            int r3 = r3.getInt(r6, r4)
            if (r3 != r4) goto L_0x0018
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            r0.f15665q = r3
            androidx.fragment.app.Fragment r3 = r18.getFragment()
            r6 = 2131316254(0x7f094e1e, float:1.8250984E38)
            r7 = 0
            if (r3 == 0) goto L_0x0032
            android.view.View r3 = r3.getView()
            if (r3 == 0) goto L_0x0032
            android.view.View r3 = r3.findViewById(r6)
            com.tencent.mm.plugin.finder.view.FinderViewPager r3 = (com.tencent.p014mm.plugin.finder.view.FinderViewPager) r3
            goto L_0x0033
        L_0x0032:
            r3 = r7
        L_0x0033:
            r0.f15655d = r3
            androidx.fragment.app.Fragment r3 = r18.getFragment()
            if (r3 == 0) goto L_0x0049
            android.view.View r3 = r3.getView()
            if (r3 == 0) goto L_0x0049
            r8 = 2131297703(0x7f0905a7, float:1.8213358E38)
            android.view.View r3 = r3.findViewById(r8)
            goto L_0x004a
        L_0x0049:
            r3 = r7
        L_0x004a:
            boolean r8 = r0.f15665q
            if (r8 == 0) goto L_0x006e
            com.tencent.mm.plugin.finder.view.FinderViewPager r8 = r0.f15655d
            r9 = 2131099792(0x7f060090, float:1.7811947E38)
            if (r8 == 0) goto L_0x0060
            android.content.res.Resources r10 = r18.getResources()
            int r10 = r10.getColor(r9)
            r8.setBackgroundColor(r10)
        L_0x0060:
            if (r3 == 0) goto L_0x0090
            android.content.res.Resources r8 = r18.getResources()
            int r8 = r8.getColor(r9)
            r3.setBackgroundColor(r8)
            goto L_0x0090
        L_0x006e:
            if (r3 == 0) goto L_0x007e
            android.content.res.Resources r8 = r18.getResources()
            r9 = 2131099720(0x7f060048, float:1.7811801E38)
            int r8 = r8.getColor(r9)
            r3.setBackgroundColor(r8)
        L_0x007e:
            com.tencent.mm.plugin.finder.view.FinderViewPager r3 = r0.f15655d
            if (r3 == 0) goto L_0x0090
            android.content.res.Resources r8 = r18.getResources()
            r9 = 2131099688(0x7f060028, float:1.7811736E38)
            int r8 = r8.getColor(r9)
            r3.setBackgroundColor(r8)
        L_0x0090:
            androidx.fragment.app.Fragment r3 = r18.getFragment()
            if (r3 == 0) goto L_0x00a3
            android.view.View r3 = r3.getView()
            if (r3 == 0) goto L_0x00a3
            android.view.View r3 = r3.findViewById(r6)
            com.tencent.mm.plugin.finder.view.FinderViewPager r3 = (com.tencent.p014mm.plugin.finder.view.FinderViewPager) r3
            goto L_0x00a4
        L_0x00a3:
            r3 = r7
        L_0x00a4:
            r0.f15655d = r3
            android.os.Bundle r3 = r18.getArguments()
            if (r3 == 0) goto L_0x00c5
            java.lang.String r6 = "nearby_live_target_square_page_params_key"
            byte[] r3 = r3.getByteArray(r6)
            if (r3 == 0) goto L_0x00c5
            te3.x91 r6 = new te3.x91
            r6.<init>()
            pe3.a r3 = r6.parseFrom(r3)
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveTabInfo"
            gy3.C87412m.m108592e(r3, r6)
            te3.x91 r3 = (te3.C51942x91) r3
            goto L_0x00c6
        L_0x00c5:
            r3 = r7
        L_0x00c6:
            r0.f15659h = r3
            android.os.Bundle r3 = r18.getArguments()
            r8 = -1
            if (r3 == 0) goto L_0x00d6
            java.lang.String r6 = "nearby_live_target_object_id_params_key"
            long r8 = r3.getLong(r6, r8)
        L_0x00d6:
            r0.f15660i = r8
            android.os.Bundle r3 = r18.getArguments()
            java.lang.String r6 = ""
            if (r3 == 0) goto L_0x00e7
            java.lang.String r8 = "nearby_live_target_nonce_id_params_key"
            java.lang.String r3 = r3.getString(r8, r6)
            goto L_0x00e8
        L_0x00e7:
            r3 = r7
        L_0x00e8:
            if (r3 != 0) goto L_0x00eb
            r3 = r6
        L_0x00eb:
            r0.f15661j = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "onCreate targetTabInfo="
            r3.append(r8)
            te3.x91 r8 = r0.f15659h
            if (r8 == 0) goto L_0x0102
            int r8 = r8.f144531d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0103
        L_0x0102:
            r8 = r7
        L_0x0103:
            r3.append(r8)
            r8 = 45
            r3.append(r8)
            te3.x91 r8 = r0.f15659h
            if (r8 == 0) goto L_0x0111
            java.lang.String r7 = r8.f144532e
        L_0x0111:
            r3.append(r7)
            java.lang.String r7 = " targetObjectId:"
            r3.append(r7)
            long r7 = r0.f15660i
            r3.append(r7)
            java.lang.String r7 = " targetObjectNonceId:"
            r3.append(r7)
            java.lang.String r7 = r0.f15661j
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = "NearbyLiveSquareUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTabSelectedEvent> r3 = r0.f15667s
            r3.alive()
            mk1.g r3 = new mk1.g
            androidx.appcompat.app.AppCompatActivity r7 = r18.getActivity()
            r3.<init>(r7)
            r0.f15658g = r3
            sm1.a r3 = new sm1.a
            androidx.appcompat.app.AppCompatActivity r7 = r18.getActivity()
            r3.<init>(r7)
            r0.f15657f = r3
            com.tencent.mm.plugin.finder.view.FinderViewPager r3 = r0.f15655d
            if (r3 != 0) goto L_0x0151
            goto L_0x0154
        L_0x0151:
            r3.setEnableViewPagerScroll(r4)
        L_0x0154:
            r0.f15656e = r4
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.fragment.app.Fragment r4 = r18.getFragment()
            gy3.C87412m.m108591d(r4)
            bl3.r$a r4 = r3.mo62445d(r4)
            androidx.lifecycle.i0 r4 = r4.mo75002a(r2)
            rs1.s8 r4 = (rs1.C13442s8) r4
            java.lang.String r4 = r4.f38098n
            if (r4 != 0) goto L_0x016e
            r4 = r6
        L_0x016e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "1001-"
            r7.append(r8)
            long r8 = eb0.C31543z5.m39453c()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            androidx.appcompat.app.AppCompatActivity r8 = r18.getActivity()
            r9 = 2131312933(0x7f094125, float:1.8244249E38)
            android.view.View r8 = r8.findViewById(r9)
            if (r8 == 0) goto L_0x0228
            vc1.b r9 = vc1.C37715b.f99914a
            boolean r9 = r9.mo61298a()
            if (r9 == 0) goto L_0x01e1
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r9.mo10233c(r10)
            java.lang.Object[] r11 = r9.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC"
            java.lang.String r13 = "initSearchItem"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r8
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r5 = r9.mo10231a(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r8.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC"
            java.lang.String r12 = "initSearchItem"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            tm1.c r5 = new tm1.c
            r5.<init>(r0)
            r8.setOnClickListener(r5)
            goto L_0x0228
        L_0x01e1:
            r9 = 8
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r15.mo10233c(r9)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC"
            java.lang.String r13 = "initSearchItem"
            java.lang.String r14 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r8
            r19 = r6
            r6 = r15
            r15 = r9
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r5 = r6.mo10231a(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r8.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC"
            java.lang.String r12 = "initSearchItem"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x022a
        L_0x0228:
            r19 = r6
        L_0x022a:
            androidx.appcompat.app.AppCompatActivity r5 = r18.getActivity()
            r6 = 2131312877(0x7f0940ed, float:1.8244135E38)
            android.view.View r5 = r5.findViewById(r6)
            if (r5 == 0) goto L_0x023f
            tm1.d r6 = new tm1.d
            r6.<init>(r0)
            r5.setOnClickListener(r6)
        L_0x023f:
            di3.d r5 = di3.C86312j.m106911c(r1)
            kq.h r5 = (p185kq.C10383h) r5
            r5.mo10697OK(r4)
            di3.d r1 = di3.C86312j.m106911c(r1)
            kq.h r1 = (p185kq.C10383h) r1
            r1.rn0(r7)
            ln1.g r1 = ln1.C10585g.f31933a
            java.lang.String r1 = "enterClickTabContextID"
            gy3.C87412m.m108594g(r7, r1)
            ln1.C10585g.f31934b = r4
            long r5 = eb0.C31543z5.m39453c()
            ln1.C10585g.f31935c = r5
            ln1.C10585g.f31936d = r5
            androidx.fragment.app.Fragment r1 = r18.getFragment()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment
            if (r1 == 0) goto L_0x02a6
            androidx.fragment.app.Fragment r1 = r18.getFragment()
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment"
            gy3.C87412m.m108592e(r1, r5)
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment r1 = (com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment) r1
            bl3.r$a r1 = r3.mo62445d(r1)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            rs1.s8 r1 = (rs1.C13442s8) r1
            java.lang.String r1 = r1.f38100p
            if (r1 != 0) goto L_0x0285
            r1 = r19
        L_0x0285:
            android.os.Bundle r2 = r18.getArguments()
            if (r2 == 0) goto L_0x0296
            java.lang.String r3 = "key_by_pass"
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L_0x0294
            goto L_0x0296
        L_0x0294:
            r6 = r2
            goto L_0x0298
        L_0x0296:
            r6 = r19
        L_0x0298:
            rm1.a r2 = rm1.C13087a.f37254a
            androidx.fragment.app.Fragment r3 = r18.getFragment()
            gy3.C87412m.m108592e(r3, r5)
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment r3 = (com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment) r3
            r2.mo12580a(r4, r3, r1, r6)
        L_0x02a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.onCreate(android.os.Bundle):void");
    }

    public void onPause() {
        super.onPause();
        C10905g gVar = this.f15658g;
        if (gVar != null) {
            Log.m105924i("Finder.FinderLivePostForNearby", "reset()");
            C7813i5 i5Var = gVar.f32531e;
            if (i5Var != null) {
                i5Var.f26337e = 0;
                return;
            }
            return;
        }
        C87412m.m108603p("livePostHelper");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r0 = (r0 = mo3605d3()).f15690r;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPreDestroyed() {
        /*
            r5 = this;
            super.onPreDestroyed()
            mm1.b r0 = mm1.C10935b.f32585a
            r0.mo11140h()
            fm1.o r0 = fm1.C8164o.f27042a
            boolean r0 = r5.f15656e
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r0 = r5.mo3605d3()
            if (r0 == 0) goto L_0x001c
            te3.x91 r0 = r0.f15690r
            if (r0 == 0) goto L_0x001c
            int r0 = r0.f144531d
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            androidx.fragment.app.Fragment r2 = r5.getFragment()
            if (r2 == 0) goto L_0x0034
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r2 = r3.mo62445d(r2)
            java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.s8 r2 = (rs1.C13442s8) r2
            int r2 = r2.f38096i
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "saveExitLiveTabId tabId:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " commentScene: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "NearbyConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            long r3 = android.os.SystemClock.elapsedRealtime()
            fm1.C8164o.f27044c = r3
            android.util.SparseArray<java.lang.Integer> r3 = fm1.C8164o.f27045d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r2, r0)
            java.lang.String r0 = ""
            rm1.C13087a.f37255b = r0
            rm1.C13087a.f37257d = r0
            r2 = 0
            rm1.C13087a.f37258e = r2
            rm1.C13087a.f37256c = r0
            r2 = 1
            rm1.C13087a.f37259f = r2
            rm1.C13087a.f37263j = r1
            rm1.C13087a.f37260g = r0
            r0 = -1
            rm1.C13087a.f37261h = r0
            rm1.C13087a.f37262i = r0
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTabSelectedEvent> r0 = r5.f15667s
            r0.dead()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.onPreDestroyed():void");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        if (this.f15658g != null) {
            NearbyLiveSquareTabFragment d3 = mo3605d3();
            if (d3 != null) {
                d3.onRequestPermissionsResult(i, strArr, iArr);
                return;
            }
            return;
        }
        C87412m.m108603p("livePostHelper");
        throw null;
    }

    public void onResume() {
        FinderViewPager finderViewPager;
        super.onResume();
        C37521f.f99374d.getClass();
        boolean z = false;
        if (C37521f.f99135B6.mo60266n().intValue() == 1) {
            C37521f.f99374d.getClass();
            if (C37521f.f99578z6.mo60266n().intValue() == 1 && !C85875k4.m106157N() && !C85875k4.m106167X()) {
                z = true;
            }
        }
        if (z && (finderViewPager = this.f15655d) != null) {
            finderViewPager.setNeedInterceptFitWindow(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyLiveSquareUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        LinkedList<NearbyLiveSquareTabFragment> linkedList = new LinkedList<>();
        this.f15663o = linkedList;
        this.f15664p = new LinkedList<>();
        this.f15666r = new C3306a(this, getActivity(), linkedList);
        this.f15667s = new NearbyLiveSquareUIC$eventListener$1(this, C40008f.f107254d);
    }
}
