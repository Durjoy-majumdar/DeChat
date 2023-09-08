package lg1;

import ak1.C54116w;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54219z;
import bl1.C28333v;
import bl1.C39786k;
import cl1.C28608i;
import cl1.C39975j;
import cl1.C54991o;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.box.viewpager.FinderLiveBoxViewPager;
import com.tencent.p014mm.plugin.finder.live.plugin.C41464f;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C86312j;
import eb0.C31543z5;
import er1.C45684k;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import kg1.C10075a;
import kg3.C76577a;
import ks3.C46740q;
import mg1.C10886a;
import ng1.C11162c;
import ng1.C47254b;
import ng1.C47257d;
import nk1.C47272h;
import ok1.C62042e;
import org.json.JSONObject;
import qj1.C12322e5;
import qj1.C62660c;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C50317lw0;

/* renamed from: lg1.h */
public final class C46854h extends C62660c {

    /* renamed from: A */
    public final C0120a0<C50317lw0> f126026A;

    /* renamed from: B */
    public final C0120a0<ConcurrentHashMap<String, C28333v>> f126027B;

    /* renamed from: p */
    public final MMActivity f126028p;

    /* renamed from: q */
    public final C58124b f126029q;

    /* renamed from: r */
    public final ViewGroup f126030r;

    /* renamed from: s */
    public final TabLayout f126031s;

    /* renamed from: t */
    public final FinderLiveBoxViewPager f126032t;

    /* renamed from: u */
    public C12322e5 f126033u;

    /* renamed from: v */
    public C47257d f126034v;

    /* renamed from: w */
    public C11162c f126035w;

    /* renamed from: x */
    public boolean f126036x = true;

    /* renamed from: y */
    public int f126037y;

    /* renamed from: z */
    public boolean f126038z;

    /* renamed from: lg1.h$c */
    public static final class C10512c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C10075a f31748d;

        /* renamed from: e */
        public final /* synthetic */ C46854h f31749e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10512c(C10075a aVar, C46854h hVar) {
            super(0);
            this.f31748d = aVar;
            this.f31749e = hVar;
        }

        public Object invoke() {
            this.f31749e.mo72063a1(this.f31748d.f30842d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: lg1.h$a */
    public static final class C46855a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C46854h f126039d;

        public C46855a(C46854h hVar) {
            this.f126039d = hVar;
        }

        public void onChanged(Object obj) {
            C50317lw0 lw02 = (C50317lw0) obj;
            if (lw02 != null) {
                String str = lw02.f137677e;
                boolean z = false;
                if (!(str == null || str.length() == 0)) {
                    Log.m105924i("FinderLiveViewPagerComm", "liveDataLog curBoxObserver switchToBox");
                    C46854h hVar = this.f126039d;
                    TabLayout.C55061f k = hVar.f126031s.mo146907k(1);
                    C47254b bVar = null;
                    Object obj2 = k != null ? k.f154600a : null;
                    if (obj2 instanceof C47254b) {
                        bVar = (C47254b) obj2;
                    }
                    if (bVar != null) {
                        ImageView imageView = bVar.f126860d;
                        if (imageView != null && imageView.getVisibility() == 0) {
                            z = true;
                        }
                    }
                    hVar.mo72064b1(1);
                    FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin = (FinderLiveBoxCommentPlugin) hVar.mo87687E0(FinderLiveBoxCommentPlugin.class);
                    if (finderLiveBoxCommentPlugin != null) {
                        String str2 = "status FINDER_LIVE_SWITCH_BOX true, hasReddot:" + z;
                        C87412m.m108594g(str2, "str");
                        Log.m105924i("FinderLiveViewPagerComm", "mainFlowLog " + str2);
                        C58124b bVar2 = hVar.f126029q;
                        C58124b.C58125b bVar3 = C58124b.C58125b.FINDER_LIVE_SWITCH_BOX;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("isShow", true);
                        C13598b0 b0Var = C13598b0.f38549a;
                        bVar2.statusChange(bVar3, bundle);
                        Log.m105924i("FinderLiveBoxCommentPlugin", "resumeBoxComment " + finderLiveBoxCommentPlugin.hashCode() + " id:" + finderLiveBoxCommentPlugin.f111632q);
                        ViewTreeObserver viewTreeObserver = finderLiveBoxCommentPlugin.mo64542Z0().getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) ((C36570n) finderLiveBoxCommentPlugin.f111635t).getValue());
                        }
                        ViewTreeObserver viewTreeObserver2 = finderLiveBoxCommentPlugin.mo64542Z0().getViewTreeObserver();
                        if (viewTreeObserver2 != null) {
                            viewTreeObserver2.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) ((C36570n) finderLiveBoxCommentPlugin.f111635t).getValue());
                        }
                        finderLiveBoxCommentPlugin.mo64542Z0().mo17098m1((C41464f) ((C36570n) finderLiveBoxCommentPlugin.f111636u).getValue());
                        finderLiveBoxCommentPlugin.mo64542Z0().mo17043c((C41464f) ((C36570n) finderLiveBoxCommentPlugin.f111636u).getValue());
                        finderLiveBoxCommentPlugin.mo64549g1(true);
                        return;
                    }
                    return;
                }
            }
            Log.m105924i("FinderLiveViewPagerComm", "liveDataLog curBoxObserver switchToPublic");
            this.f126039d.mo72065c1();
        }
    }

    /* renamed from: lg1.h$b */
    public static final class C46856b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C46854h f126040d;

        public C46856b(C46854h hVar) {
            this.f126040d = hVar;
        }

        public void onChanged(Object obj) {
            ImageView imageView;
            ImageView imageView2;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj;
            Class cls = C39975j.class;
            String str = "redDotObserver redDotMap: " + concurrentHashMap.size();
            C87412m.m108594g(str, "str");
            Log.m105924i("FinderLiveViewPagerComm", "liveDataLog " + str);
            C10075a aVar = (C10075a) C110818d0.m150917O(this.f126040d.f126034v.f126867e, 1);
            boolean z = false;
            C47254b bVar = null;
            if (aVar != null) {
                C46854h hVar = this.f126040d;
                C28333v vVar = (C28333v) concurrentHashMap.get(aVar.f30842d);
                if (vVar != null && vVar.f77956a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("observed, show reddot:");
                    sb.append(!((C39975j) hVar.mo87696x0(cls)).mo62578e3());
                    String sb4 = sb.toString();
                    C87412m.m108594g(sb4, "str");
                    Log.m105924i("FinderLiveViewPagerComm", "redDotFlowLog " + sb4);
                    if (!((C39975j) hVar.mo87696x0(cls)).mo62578e3()) {
                        TabLayout.C55061f k = hVar.f126031s.mo146907k(1);
                        Object obj2 = k != null ? k.f154600a : null;
                        C47254b bVar2 = obj2 instanceof C47254b ? (C47254b) obj2 : null;
                        if (!(bVar2 == null || (imageView2 = bVar2.f126860d) == null)) {
                            imageView2.setVisibility(0);
                        }
                        ((C39975j) hVar.mo87696x0(cls)).mo62580g3();
                        z = true;
                    } else {
                        vVar.f77956a = false;
                    }
                }
            }
            if (!z) {
                TabLayout.C55061f k2 = this.f126040d.f126031s.mo146907k(1);
                Object obj3 = k2 != null ? k2.f154600a : null;
                if (obj3 instanceof C47254b) {
                    bVar = (C47254b) obj3;
                }
                if (bVar != null && (imageView = bVar.f126860d) != null) {
                    imageView.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46854h(MMActivity mMActivity, ViewGroup viewGroup, C58124b bVar, ViewGroup viewGroup2) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f126028p = mMActivity;
        this.f126029q = bVar;
        this.f126030r = viewGroup2;
        this.f126031s = (TabLayout) viewGroup.findViewById(C0966R.C0970id.f359340kd1);
        this.f126032t = (FinderLiveBoxViewPager) viewGroup.findViewById(C0966R.C0970id.mbc);
        this.f126034v = new C47257d(mMActivity, mo87684A0(), bVar, this);
        this.f126037y = C76577a.m92151b(mMActivity, 240);
        this.f126026A = new C46855a(this);
        this.f126027B = new C46856b(this);
        mo10792g(8);
    }

    /* renamed from: Z0 */
    public final void mo72062Z0() {
        float dimension = ((float) C75044y4.m89990b(MMApplicationContext.getContext()).x) - this.f126028p.getResources().getDimension(C0966R.dimen.f3755d6);
        if (this.f126034v.f126867e.size() == 1) {
            ViewGroup.LayoutParams layoutParams = this.f126032t.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                this.f126037y = -2;
                layoutParams.width = (int) dimension;
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.f126032t.getLayoutParams();
            if (layoutParams2 != null) {
                int b = C76577a.m92151b(this.f126028p, 50);
                C12322e5 e5Var = this.f126033u;
                int i = b + (e5Var != null ? e5Var.f35512I : this.f126037y);
                StringBuilder sb = new StringBuilder();
                sb.append("adjustLayout commentHeight: ");
                sb.append(i);
                sb.append(" , commentPlugin?.getMaxHeight():");
                C12322e5 e5Var2 = this.f126033u;
                sb.append(e5Var2 != null ? Integer.valueOf(e5Var2.f35512I) : null);
                sb.append(", contentMaxHeight：");
                sb.append(this.f126037y);
                Log.m105924i("FinderLiveViewPagerComm", sb.toString());
                layoutParams2.height = i;
                this.f126037y = i;
                layoutParams2.width = (int) dimension;
            }
        }
        this.f126032t.setMaxHeight(this.f126037y);
        this.f126032t.requestLayout();
        C11162c cVar = this.f126035w;
        if (cVar != null) {
            cVar.f32948e = this.f126037y;
        }
    }

    /* renamed from: a1 */
    public final void mo72063a1(String str) {
        String str2;
        Class cls = C54116w.class;
        Class cls2 = C39975j.class;
        boolean z = true;
        if (!this.f126038z) {
            C10886a.f32497a.mo11103a(true);
        }
        this.f126038z = false;
        if (str == null || str.length() == 0) {
            C50317lw0 value = ((C39975j) mo87696x0(cls2)).f107170j.getValue();
            if (!(value == null || (str2 = value.f137677e) == null)) {
                if (str2.length() <= 0) {
                    z = false;
                }
                if (z) {
                    long j = ((C39975j) mo87696x0(cls2)).f107171n;
                    long j2 = 0;
                    if (j != 0) {
                        try {
                            j2 = C31543z5.m39453c() - j;
                        } catch (Throwable unused) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_type", 2);
                    jSONObject.put("group_box_number", str2);
                    jSONObject.put("box_stay_time", j2);
                    ((C54116w) C86312j.m106911c(cls)).Lx0(jSONObject);
                }
            }
            ((C39975j) mo87696x0(cls2)).mo62577d3();
            return;
        }
        C87412m.m108594g(str, "boxId");
        C50317lw0 lw02 = new C50317lw0();
        int i = C46740q.f125820a;
        lw02.f137676d = 1;
        lw02.f137677e = str;
        ((C39975j) mo87696x0(cls2)).mo62576c3(lw02);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_type", 1);
            jSONObject2.put("group_box_number", str);
            ((C54116w) C86312j.m106911c(cls)).Lx0(jSONObject2);
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return mo82893g0() || this.f126036x;
    }

    /* renamed from: b1 */
    public final void mo72064b1(int i) {
        Class cls = C39975j.class;
        Log.m105924i("FinderLiveViewPagerComm", "switchTabLayoutAndViewPager " + i);
        TabLayout.C55061f k = this.f126031s.mo146907k(i);
        if (k != null && !k.mo76120a()) {
            k.mo76121b();
        }
        if (this.f126032t.getCurrentItem() != i) {
            this.f126032t.setCurrentItem(i);
        }
        if (i == 1) {
            ((C39975j) mo87696x0(cls)).mo62580g3();
            Log.m105924i("FinderLiveViewPagerComm", "redDotFlowLog dismiss reddot");
            C39786k kVar = ((C39975j) mo87696x0(cls)).f107176s;
            C54219z<ConcurrentHashMap<String, C28333v>> zVar = kVar != null ? kVar.f106766e : null;
            if (zVar != null) {
                C28608i iVar = C28608i.f78500d;
                ConcurrentHashMap<String, C28333v> value = zVar.getValue();
                if (value != null) {
                    if (iVar != null) {
                        iVar.invoke(value);
                    }
                    zVar.setValue(value);
                    return;
                }
                return;
            }
            return;
        }
        Log.m105924i("Finder.LiveBoxSlice", "redDotFlowLog resumeRedDotPolling");
        C39786k kVar2 = ((C39975j) mo87696x0(cls)).f107176s;
        if (kVar2 != null) {
            kVar2.f106767f = true;
        }
    }

    /* renamed from: c1 */
    public final void mo72065c1() {
        mo72064b1(0);
        FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin = (FinderLiveBoxCommentPlugin) mo87687E0(FinderLiveBoxCommentPlugin.class);
        if (finderLiveBoxCommentPlugin != null) {
            Log.m105924i("FinderLiveViewPagerComm", "mainFlowLog " + "status FINDER_LIVE_SWITCH_BOX false");
            C58124b bVar = this.f126029q;
            C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_SWITCH_BOX;
            Bundle bundle = new Bundle();
            bundle.putBoolean("isShow", false);
            C13598b0 b0Var = C13598b0.f38549a;
            bVar.statusChange(bVar2, bundle);
            finderLiveBoxCommentPlugin.mo64546d1();
        }
    }

    /* renamed from: d1 */
    public final void mo72066d1() {
        this.f126031s.mo146910n();
        Iterator<C10075a> it = this.f126034v.f126867e.iterator();
        int i = 0;
        while (it.hasNext()) {
            C10075a next = it.next();
            int i2 = i + 1;
            Integer num = null;
            if (i >= 0) {
                C10075a aVar = next;
                TabLayout tabLayout = this.f126031s;
                TabLayout.C55061f l = tabLayout.mo146908l();
                Integer num2 = 1;
                if (num2.intValue() == 0) {
                    num = num2;
                }
                C47254b bVar = new C47254b(l, num != null ? num.intValue() : 2, new C10512c(aVar, this));
                String str = aVar.f30843e;
                C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                TextView textView = bVar.f126859c;
                if (textView != null) {
                    if ((bVar.f126858b != 0 || !C87412m.m108589b(str, textView.getContext().getString(C0966R.string.m3v))) && !C87412m.m108589b(str, textView.getContext().getString(C0966R.string.m3r))) {
                        textView.setText(textView.getContext().getString(C0966R.string.m3y, new Object[]{C47272h.f126894a.mo72300e(textView, str, 6)}));
                    } else {
                        textView.setText(str);
                    }
                }
                bVar.f126858b = i;
                tabLayout.mo146889d(bVar.f126857a, false);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (this.f126034v.f126867e.size() <= 1) {
            this.f126031s.setVisibility(8);
        } else {
            this.f126031s.setVisibility(0);
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        Bundle bundle2 = bundle;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 39) {
            if (ordinal == 216) {
                mo10792g(0);
                C12322e5 e5Var = this.f126033u;
                C54219z<ConcurrentHashMap<String, C28333v>> zVar = null;
                if (e5Var != null) {
                    C47257d dVar = this.f126034v;
                    dVar.getClass();
                    dVar.f126867e.clear();
                    ArrayList<C10075a> arrayList = dVar.f126867e;
                    String string = dVar.f126863a.getResources().getString(C0966R.string.m3v);
                    C87412m.m108593f(string, "context.resources.getStr…la_bottom_content_public)");
                    arrayList.add(0, new C10075a("", string, 0, e5Var));
                    dVar.mo72285b(bundle2);
                    Log.m105924i("FinderLiveViewPagerComm", "adjustLayout");
                    ViewParent parent = this.f166287d.getParent();
                    C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup.LayoutParams layoutParams = ((LinearLayout) ((ViewGroup) parent).findViewById(C0966R.C0970id.dn8)).getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.addRule(2, this.f166287d.getId());
                    }
                    C12322e5 e5Var2 = this.f126033u;
                    ViewGroup viewGroup = e5Var2 != null ? e5Var2.f166287d : null;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                    }
                    if (mo82893g0()) {
                        ViewGroup.LayoutParams layoutParams3 = this.f126032t.getLayoutParams();
                        if (layoutParams3 != null) {
                            int b = C76577a.m92151b(this.f126028p, 50);
                            C12322e5 e5Var3 = this.f126033u;
                            int i = b + (e5Var3 != null ? e5Var3.f35512I : this.f126037y);
                            Log.m105924i("FinderLiveViewPagerComm", "adjustLayout commentHeight: " + i);
                            layoutParams3.height = i;
                            this.f126037y = i;
                            layoutParams3.width = C12322e5.f35497W.mo12039a();
                            ViewGroup.LayoutParams layoutParams4 = this.f126031s.getLayoutParams();
                            if (layoutParams4 != null) {
                                layoutParams4.width = layoutParams3.width;
                            }
                        }
                        C62042e.f176370a.mo87074e(this, true);
                    } else {
                        ViewGroup viewGroup2 = this.f126030r;
                        View findViewById = viewGroup2 != null ? viewGroup2.findViewById(C0966R.C0970id.e17) : null;
                        if (findViewById != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view = findViewById;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/box/plugin/FinderLiveViewPagerCommentPlugin", "adjustLayout", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/box/plugin/FinderLiveViewPagerCommentPlugin", "adjustLayout", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        ViewGroup.LayoutParams layoutParams5 = this.f166287d.getLayoutParams();
                        RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams5 : null;
                        if (layoutParams6 != null) {
                            layoutParams6.removeRule(2);
                            layoutParams6.addRule(2, findViewById != null ? findViewById.getId() : 0);
                            layoutParams6.bottomMargin = -C76577a.m92151b(MMApplicationContext.getContext(), 16);
                        }
                        mo72062Z0();
                    }
                }
                C11162c cVar = new C11162c(this.f126034v.f126867e, this.f126037y);
                this.f126035w = cVar;
                this.f126032t.setAdapter(cVar);
                this.f126032t.addOnPageChangeListener(new C46858j(this));
                mo72066d1();
                this.f126031s.setTabIndicatorFullWidth(false);
                this.f126031s.mo146882a(new C46857i());
                Class cls = C39975j.class;
                String str = "status FINDER_LIVE_SWITCH_BOX " + ((C39975j) mo87696x0(cls)).mo62578e3();
                C87412m.m108594g(str, "str");
                Log.m105924i("FinderLiveViewPagerComm", "mainFlowLog " + str);
                C58124b bVar2 = this.f126029q;
                C58124b.C58125b bVar3 = C58124b.C58125b.FINDER_LIVE_SWITCH_BOX;
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("isShow", ((C39975j) mo87696x0(cls)).mo62578e3());
                C13598b0 b0Var = C13598b0.f38549a;
                bVar2.statusChange(bVar3, bundle3);
                this.f126038z = true;
                if (!((C39975j) mo87696x0(cls)).mo62578e3()) {
                    Log.m105924i("FinderLiveViewPagerComm", "liveDataLog curBoxObserver manually switchToPublic");
                    mo72065c1();
                }
                ((C39975j) mo87696x0(cls)).f107170j.observe(this, this.f126026A);
                C39786k kVar = ((C39975j) mo87696x0(cls)).f107176s;
                if (kVar != null) {
                    zVar = kVar.f106766e;
                }
                if (zVar != null) {
                    zVar.observe(this, this.f126027B);
                }
            } else if (ordinal == 217 && C45684k.f123488a.mo71181b(mo87684A0())) {
                this.f126034v.mo72285b(bundle2);
                mo72062Z0();
                C11162c cVar2 = this.f126035w;
                if (cVar2 != null) {
                    cVar2.notifyDataSetChanged();
                }
                mo72066d1();
            }
        } else if (C45684k.f123488a.mo71181b(mo87684A0())) {
            boolean z = bundle2 != null ? bundle2.getBoolean("PARAM_IS_ENTERING_COMMENT") : false;
            this.f126031s.setVisibility(z ? 4 : 0);
            if (this.f126034v.f126867e.size() <= 1) {
                this.f126031s.setVisibility(8);
            } else {
                this.f126031s.setVisibility(0);
            }
            this.f126036x = !z;
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        mo10792g(8);
        this.f126036x = true;
        C10886a.f32498b = "";
        this.f126031s.mo146910n();
        this.f126034v.f126867e.clear();
        C11162c cVar = this.f126035w;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }
}
