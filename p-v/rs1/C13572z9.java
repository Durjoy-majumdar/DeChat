package rs1;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI5;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import df1.C58259c;
import dp1.C7435f2;
import ef1.C58555d;
import ef1.C7637b;
import ef1.C7642k;
import er1.C7919x;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8785n;
import j20.C117292a;
import java.util.ArrayList;
import mu3.C109639a;
import o40.C61926c;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import os1.C11737e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64689rq2;
import x50.C15626c;
import zp3.C23564m;

/* renamed from: rs1.z9 */
public final class C13572z9 extends UIComponent {

    /* renamed from: o */
    public static int f38498o;

    /* renamed from: d */
    public final C13601g f38499d = C36568h.m40985a(new C13580h(this));

    /* renamed from: e */
    public final C13601g f38500e = C36568h.m40985a(new C13583k(this));

    /* renamed from: f */
    public final C13601g f38501f = C36568h.m40985a(new C13574b(this));

    /* renamed from: g */
    public final C13601g f38502g = C36568h.m40985a(new C13579g(this));

    /* renamed from: h */
    public RecyclerView f38503h;

    /* renamed from: i */
    public long f38504i;

    /* renamed from: j */
    public final MMHandler f38505j = new MMHandler(C109639a.m148951b());

    /* renamed from: n */
    public C13573a f38506n = C13573a.DEFAULT;

    /* renamed from: rs1.z9$a */
    public enum C13573a {
        SHOWN,
        SHOWING,
        READY,
        DEFAULT,
        DISABLE
    }

    /* renamed from: rs1.z9$b */
    public static final class C13574b extends C87413o implements C32224a<FinderHomeTabFragment> {

        /* renamed from: d */
        public final /* synthetic */ C13572z9 f38513d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13574b(C13572z9 z9Var) {
            super(0);
            this.f38513d = z9Var;
        }

        public Object invoke() {
            FinderHomeTabFragment e3 = ((FinderHomeUIC) C39818r.f106831a.mo62444c(this.f38513d.getActivity()).mo75002a(FinderHomeUIC.class)).mo5129e3(this.f38513d.mo12969j3());
            if (e3 != null) {
                return e3;
            }
            Fragment fragment = this.f38513d.getFragment();
            C87412m.m108592e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
            return (FinderHomeTabFragment) fragment;
        }
    }

    /* renamed from: rs1.z9$c */
    public static final class C13575c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13572z9 f38514d;

        /* renamed from: e */
        public final /* synthetic */ long f38515e;

        /* renamed from: f */
        public final /* synthetic */ int f38516f;

        public C13575c(C13572z9 z9Var, long j, int i) {
            this.f38514d = z9Var;
            this.f38515e = j;
            this.f38516f = i;
        }

        public final void run() {
            if (C13572z9.m12885e3(this.f38514d, this.f38515e, this.f38516f)) {
                C13572z9.m12883c3(this.f38514d, this.f38515e);
            }
        }
    }

    /* renamed from: rs1.z9$d */
    public static final class C13576d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13572z9 f38517d;

        /* renamed from: e */
        public final /* synthetic */ long f38518e;

        /* renamed from: f */
        public final /* synthetic */ int f38519f;

        public C13576d(C13572z9 z9Var, long j, int i) {
            this.f38517d = z9Var;
            this.f38518e = j;
            this.f38519f = i;
        }

        public final void run() {
            if (C13572z9.m12885e3(this.f38517d, this.f38518e, this.f38519f)) {
                C13572z9.m12883c3(this.f38517d, this.f38518e);
            }
        }
    }

    /* renamed from: rs1.z9$e */
    public static final class C13577e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13572z9 f38520d;

        /* renamed from: e */
        public final /* synthetic */ long f38521e;

        /* renamed from: f */
        public final /* synthetic */ int f38522f;

        public C13577e(C13572z9 z9Var, long j, int i) {
            this.f38520d = z9Var;
            this.f38521e = j;
            this.f38522f = i;
        }

        public final void run() {
            if (C13572z9.m12885e3(this.f38520d, this.f38521e, this.f38522f)) {
                C13572z9.m12883c3(this.f38520d, this.f38521e);
            }
        }
    }

    /* renamed from: rs1.z9$f */
    public static final class C13578f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13572z9 f38523d;

        /* renamed from: e */
        public final /* synthetic */ long f38524e;

        /* renamed from: f */
        public final /* synthetic */ int f38525f;

        public C13578f(C13572z9 z9Var, long j, int i) {
            this.f38523d = z9Var;
            this.f38524e = j;
            this.f38525f = i;
        }

        public final void run() {
            if (C13572z9.m12885e3(this.f38523d, this.f38524e, this.f38525f)) {
                C13572z9.m12883c3(this.f38523d, this.f38524e);
            }
        }
    }

    /* renamed from: rs1.z9$g */
    public static final class C13579g extends C87413o implements C32224a<C11737e.C11738a> {

        /* renamed from: d */
        public final /* synthetic */ C13572z9 f38526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13579g(C13572z9 z9Var) {
            super(0);
            this.f38526d = z9Var;
        }

        public Object invoke() {
            C39818r rVar = C39818r.f106831a;
            return ((C11737e) rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C11737e.class)).mo11599c3(((C13442s8) rVar.mo62443b(this.f38526d.getContext()).mo75002a(C13442s8.class)).mo12853i3(this.f38526d.mo12969j3()));
        }
    }

    /* renamed from: rs1.z9$h */
    public static final class C13580h extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C13572z9 f38527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13580h(C13572z9 z9Var) {
            super(0);
            this.f38527d = z9Var;
        }

        public Object invoke() {
            LinearLayout linearLayout = new LinearLayout(this.f38527d.getActivity());
            C13572z9 z9Var = this.f38527d;
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setBackgroundResource(C0966R.color.f3575y8);
            PAGView pAGView = new PAGView(z9Var.getActivity());
            pAGView.setTag("pag");
            pAGView.setRepeatCount(0);
            pAGView.setComposition(PAGFile.Load(z9Var.getContext().getAssets(), "finder_apppush_slide_guide.pag"));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C15626c.m14629a(z9Var.getActivity(), 264.0f), C15626c.m14629a(z9Var.getActivity(), 320.0f));
            layoutParams.gravity = 49;
            layoutParams.topMargin = (int) z9Var.getActivity().getResources().getDimension(C0966R.dimen.f3740cu);
            C13598b0 b0Var = C13598b0.f38549a;
            linearLayout.addView(pAGView, layoutParams);
            TextView textView = new TextView(z9Var.getActivity());
            textView.setText(z9Var.getActivity().getResources().getString(C0966R.string.d0t));
            textView.setTextColor(-1);
            textView.setTextSize(1, 20.0f);
            C7919x.m8091a(textView);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            linearLayout.addView(textView, layoutParams2);
            return linearLayout;
        }
    }

    /* renamed from: rs1.z9$i */
    public static final class C13581i extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C13572z9 f38528d;

        /* renamed from: e */
        public final /* synthetic */ LinearLayoutManager f38529e;

        public C13581i(C13572z9 z9Var, LinearLayoutManager linearLayoutManager) {
            this.f38528d = z9Var;
            this.f38529e = linearLayoutManager;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSlideMoreGuideUIC$onCreateAfter$1$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSlideMoreGuideUIC$onCreateAfter$1$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            RecyclerView.C16631z I0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSlideMoreGuideUIC$onCreateAfter$1$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (this.f38528d.f38506n == C13573a.SHOWING && this.f38529e.mo16957C() == 0 && (I0 = recyclerView.mo17023I0(0)) != null) {
                C13572z9 z9Var = this.f38528d;
                z9Var.mo12968i3().setAlpha((((float) I0.f44854d.getBottom()) * 1.0f) / ((float) I0.f44854d.getHeight()));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSlideMoreGuideUIC$onCreateAfter$1$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: rs1.z9$j */
    public static final class C13582j extends C58555d {

        /* renamed from: g */
        public final /* synthetic */ C13572z9 f38530g;

        public C13582j(C13572z9 z9Var) {
            this.f38530g = z9Var;
        }

        /* renamed from: B1 */
        public void mo2331B1(C7637b bVar) {
            C87412m.m108594g(bVar, "ev");
            boolean z = bVar instanceof C7642k;
            boolean z2 = true;
            if (z) {
                C7642k kVar = (C7642k) bVar;
                if (kVar.f25951b == 6) {
                    FeedData feedData = kVar.f25960k;
                    if (!(feedData != null && feedData.getMediaType() == 9)) {
                        FeedData feedData2 = kVar.f25960k;
                        if (feedData2 == null || feedData2.getMediaType() != 2) {
                            z2 = false;
                        }
                        if (!z2) {
                            return;
                        }
                    }
                    long j = kVar.f25958i;
                    int i = kVar.f25959j;
                    C13572z9 z9Var = this.f38530g;
                    FeedData feedData3 = kVar.f25960k;
                    z9Var.mo12966f3(j, i, feedData3 != null ? feedData3.getMediaType() : 0, 0.0f, 0);
                    return;
                }
            }
            if (z) {
                C7642k kVar2 = (C7642k) bVar;
                if (kVar2.f25951b == 0 && kVar2.f25952c > 0) {
                    C13572z9 z9Var2 = this.f38530g;
                    C13572z9.m12884d3(z9Var2, z9Var2.f38504i, kVar2.f25959j);
                    return;
                }
            }
            if (bVar instanceof C58259c.C58260a) {
                C58259c.C58260a aVar = (C58259c.C58260a) bVar;
                float f = (((float) aVar.f166815f) * 100.0f) / ((float) aVar.f166816g);
                C13572z9 z9Var3 = this.f38530g;
                long j2 = aVar.f166817h;
                int i2 = aVar.f166820k;
                C64689rq2 rq22 = aVar.f166813d;
                z9Var3.mo12966f3(j2, i2, 4, f, rq22 != null ? rq22.f185269g : 1);
            }
        }

        /* renamed from: y1 */
        public boolean mo2424y1() {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
            r3 = ((df1.C58259c.C58260a) r4).f166811b;
         */
        /* renamed from: z1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2333z1(ef1.C58553c r3, ef1.C7637b r4) {
            /*
                r2 = this;
                java.lang.String r0 = "dispatcher"
                gy3.C87412m.m108594g(r3, r0)
                java.lang.String r3 = "event"
                gy3.C87412m.m108594g(r4, r3)
                boolean r3 = r4 instanceof ef1.C7642k
                r0 = 1
                if (r3 == 0) goto L_0x001a
                r3 = r4
                ef1.k r3 = (ef1.C7642k) r3
                int r3 = r3.f25951b
                if (r3 == 0) goto L_0x0019
                r1 = 6
                if (r3 != r1) goto L_0x001a
            L_0x0019:
                return r0
            L_0x001a:
                boolean r3 = r4 instanceof df1.C58259c.C58260a
                if (r3 == 0) goto L_0x0028
                df1.c$a r4 = (df1.C58259c.C58260a) r4
                int r3 = r4.f166811b
                if (r3 == r0) goto L_0x0029
                r4 = 3
                if (r3 != r4) goto L_0x0028
                goto L_0x0029
            L_0x0028:
                r0 = 0
            L_0x0029:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13572z9.C13582j.mo2333z1(ef1.c, ef1.b):boolean");
        }
    }

    /* renamed from: rs1.z9$k */
    public static final class C13583k extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C13572z9 f38531d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13583k(C13572z9 z9Var) {
            super(0);
            this.f38531d = z9Var;
        }

        public Object invoke() {
            Fragment fragment = this.f38531d.getFragment();
            C87412m.m108592e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
            return Integer.valueOf(((FinderHomeTabFragment) fragment).f17334o);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13572z9(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public static final void m12883c3(C13572z9 z9Var, long j) {
        if (z9Var.mo12967g3().f34354e == 2 && z9Var.f38506n == C13573a.SHOWING) {
            z9Var.f38505j.postUIDelayed(new C13116aa(z9Var, j), ((long) z9Var.mo12967g3().f34355f) * 1000);
        }
    }

    /* renamed from: d3 */
    public static final void m12884d3(C13572z9 z9Var, long j, int i) {
        Object tag = z9Var.mo12968i3().getTag();
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        int intValue = num != null ? num.intValue() : -1;
        Log.m105924i("Finder.SlideMoreGuideUIC", "[dismissGuide] tabType=" + z9Var.mo12969j3() + " feedId=" + C61926c.m72691p(j) + " showState=" + z9Var.f38506n + " showPosition=" + intValue + " currentPosition=" + i);
        if ((intValue < i || i == Integer.MAX_VALUE) && z9Var.f38506n == C13573a.SHOWING) {
            z9Var.mo12968i3().setVisibility(8);
            if (z9Var.mo12967g3().f34356g == 1) {
                z9Var.mo12970k3();
                f38498o = 0;
            }
            z9Var.f38506n = C13573a.SHOWN;
            z9Var.f38505j.removeCallbacksAndMessages((Object) null);
            C7435f2.f25626a.mo8578b(((C13442s8) C39818r.f106831a.mo62443b(z9Var.getContext()).mo75002a(C13442s8.class)).mo12853i3(z9Var.mo12969j3()), "timeline_slide_guide", false, j, C8785n.f28043b);
        }
    }

    /* renamed from: e3 */
    public static final boolean m12885e3(C13572z9 z9Var, long j, int i) {
        z9Var.getClass();
        Log.m105924i("Finder.SlideMoreGuideUIC", "[showGuide] ... tabType=" + z9Var.mo12969j3() + " showState=" + z9Var.f38506n + " feedId=" + C61926c.m72691p(j) + " position=" + i);
        if (z9Var.f38506n != C13573a.READY) {
            return false;
        }
        z9Var.f38506n = C13573a.SHOWING;
        z9Var.f38504i = j;
        if (z9Var.mo12967g3().f34356g != 1) {
            z9Var.mo12970k3();
        }
        C23564m.m28138h(z9Var.mo12968i3(), new C13128ba(z9Var, j));
        FinderHomeTabFragment finderHomeTabFragment = (FinderHomeTabFragment) ((C36570n) z9Var.f38501f).getValue();
        FrameLayout frameLayout = null;
        KeyEvent.Callback callback = finderHomeTabFragment != null ? finderHomeTabFragment.f165437h : null;
        if (callback instanceof FrameLayout) {
            frameLayout = (FrameLayout) callback;
        }
        if (frameLayout != null && frameLayout.indexOfChild(z9Var.mo12968i3()) < 0) {
            LinearLayout i3 = z9Var.mo12968i3();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            C13598b0 b0Var = C13598b0.f38549a;
            frameLayout.addView(i3, layoutParams);
        }
        if (z9Var.mo12967g3().f34354e == 3) {
            z9Var.mo12968i3().setClickable(true);
            z9Var.mo12968i3().setOnClickListener(new C13174ca(z9Var));
        } else {
            z9Var.mo12968i3().setClickable(false);
        }
        PAGView pAGView = (PAGView) z9Var.mo12968i3().findViewWithTag("pag");
        if (pAGView != null) {
            pAGView.play();
        }
        z9Var.mo12968i3().setTag(Integer.valueOf(i));
        z9Var.mo12968i3().setAlpha(0.0f);
        z9Var.mo12968i3().animate().alpha(1.0f).setDuration(300).start();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r6 = r6.getAdapter();
     */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12966f3(long r19, int r21, int r22, float r23, int r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            rs1.z9$a r4 = rs1.C13572z9.C13573a.DEFAULT
            rs1.z9$a r5 = rs1.C13572z9.C13573a.READY
            rs1.z9$a r6 = r0.f38506n
            rs1.z9$a r7 = rs1.C13572z9.C13573a.DISABLE
            r8 = 3
            if (r6 == r7) goto L_0x0127
            androidx.recyclerview.widget.RecyclerView r6 = r0.f38503h
            r10 = 0
            if (r6 == 0) goto L_0x0021
            androidx.recyclerview.widget.RecyclerView$e r6 = r6.getAdapter()
            if (r6 == 0) goto L_0x0021
            int r6 = r6.getItemCount()
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            int r11 = r6 + -1
            java.lang.String r12 = "Finder.SlideMoreGuideUIC"
            if (r11 > r3) goto L_0x004b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "[isShouldShowGuide] itemCount["
            r11.append(r13)
            r11.append(r6)
            java.lang.String r6 = "] -1 <= position["
            r11.append(r6)
            r11.append(r3)
            r6 = 93
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            goto L_0x0122
        L_0x004b:
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_SLIDE_MORE_GUIDE_INT_SYNC
            int r6 = r6.mo119689j(r11, r10)
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_SLIDE_MORE_GUIDE_TIME_LONG_SYNC
            r9 = 0
            long r9 = r13.mo119673G(r14, r9)
            os1.e$a r13 = r18.mo12967g3()
            int r13 = r13.f34356g
            if (r13 != r8) goto L_0x0094
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r9
            r15 = 604800000(0x240c8400, double:2.988109026E-315)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 < 0) goto L_0x0094
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r6.mo119677K(r11, r14)
            java.lang.String r6 = "[isShouldShowGuide] reset count."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            r6 = 0
            goto L_0x0095
        L_0x0094:
            r13 = 0
        L_0x0095:
            os1.e$a r11 = r18.mo12967g3()
            int r11 = r11.f34356g
            r14 = 1
            if (r11 != r14) goto L_0x00a1
            if (r6 > 0) goto L_0x00ab
            goto L_0x00a9
        L_0x00a1:
            os1.e$a r11 = r18.mo12967g3()
            int r11 = r11.f34357h
            if (r6 >= r11) goto L_0x00ab
        L_0x00a9:
            r11 = 1
            goto L_0x00ac
        L_0x00ab:
            r11 = 0
        L_0x00ac:
            int r14 = f38498o
            if (r14 == 0) goto L_0x00b7
            int r13 = r18.mo12969j3()
            if (r14 == r13) goto L_0x00b7
            r11 = 0
        L_0x00b7:
            rs1.z9$a r13 = r0.f38506n
            if (r13 != r4) goto L_0x0119
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "[isShouldShowGuide] result="
            r13.append(r14)
            r13.append(r11)
            java.lang.String r14 = " position="
            r13.append(r14)
            r13.append(r3)
            java.lang.String r14 = " tabType="
            r13.append(r14)
            int r14 = r18.mo12969j3()
            r13.append(r14)
            java.lang.String r14 = " countStyle="
            r13.append(r14)
            os1.e$a r14 = r18.mo12967g3()
            int r14 = r14.f34356g
            r13.append(r14)
            java.lang.String r14 = " configCount="
            r13.append(r14)
            os1.e$a r14 = r18.mo12967g3()
            int r14 = r14.f34357h
            r13.append(r14)
            java.lang.String r14 = " count="
            r13.append(r14)
            r13.append(r6)
            java.lang.String r6 = " time="
            r13.append(r6)
            r13.append(r9)
            java.lang.String r6 = " otherTabTypeShowing="
            r13.append(r6)
            int r6 = f38498o
            r13.append(r6)
            java.lang.String r6 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
        L_0x0119:
            if (r11 == 0) goto L_0x0121
            int r6 = r18.mo12969j3()
            f38498o = r6
        L_0x0121:
            r10 = r11
        L_0x0122:
            if (r10 != 0) goto L_0x0127
            r0.f38506n = r7
            return
        L_0x0127:
            rs1.z9$a r6 = r0.f38506n
            if (r6 == r4) goto L_0x012c
            return
        L_0x012c:
            os1.e$a r4 = r18.mo12967g3()
            int r4 = r4.f34351b
            r6 = 1000(0x3e8, double:4.94E-321)
            r9 = 0
            r10 = 1
            if (r4 == r10) goto L_0x01aa
            r10 = 2
            if (r4 == r10) goto L_0x015c
            if (r4 == r8) goto L_0x013f
            goto L_0x01bb
        L_0x013f:
            os1.e$a r4 = r18.mo12967g3()
            int r4 = r4.f34353d
            float r4 = (float) r4
            int r4 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x01bb
            r0.f38506n = r5
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r0.f38505j
            r4.removeCallbacksAndMessages(r9)
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r0.f38505j
            rs1.z9$f r5 = new rs1.z9$f
            r5.<init>(r0, r1, r3)
            r4.post(r5)
            goto L_0x01bb
        L_0x015c:
            os1.e$a r4 = r18.mo12967g3()
            int r4 = r4.f34352c
            long r10 = (long) r4
            long r10 = r10 * r6
            r4 = 4
            r6 = r22
            if (r6 == r4) goto L_0x017c
            r0.f38506n = r5
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r0.f38505j
            r4.removeCallbacksAndMessages(r9)
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r0.f38505j
            rs1.z9$d r5 = new rs1.z9$d
            r5.<init>(r0, r1, r3)
            r4.postUIDelayed(r5, r10)
            goto L_0x01bb
        L_0x017c:
            os1.e$a r4 = r18.mo12967g3()
            int r4 = r4.f34352c
            float r4 = (float) r4
            r6 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r6
            r7 = r24
            r8 = 1
            int r7 = java.lang.Math.max(r8, r7)
            float r7 = (float) r7
            float r4 = r4 / r7
            float r4 = java.lang.Math.min(r4, r6)
            int r4 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x01bb
            r0.f38506n = r5
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r0.f38505j
            r4.removeCallbacksAndMessages(r9)
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r0.f38505j
            rs1.z9$e r5 = new rs1.z9$e
            r5.<init>(r0, r1, r3)
            r4.post(r5)
            goto L_0x01bb
        L_0x01aa:
            r0.f38506n = r5
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r0.f38505j
            r4.removeCallbacksAndMessages(r9)
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r0.f38505j
            rs1.z9$c r5 = new rs1.z9$c
            r5.<init>(r0, r1, r3)
            r4.postUIDelayed(r5, r6)
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13572z9.mo12966f3(long, int, int, float, int):void");
    }

    /* renamed from: g3 */
    public final C11737e.C11738a mo12967g3() {
        return (C11737e.C11738a) this.f38502g.getValue();
    }

    /* renamed from: i3 */
    public final LinearLayout mo12968i3() {
        return (LinearLayout) this.f38499d.getValue();
    }

    /* renamed from: j3 */
    public final int mo12969j3() {
        return ((Number) this.f38500e.getValue()).intValue();
    }

    /* renamed from: k3 */
    public final void mo12970k3() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_SLIDE_MORE_GUIDE_INT_SYNC;
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(i.mo119689j(aVar, 0) + 1));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SLIDE_MORE_GUIDE_TIME_LONG_SYNC, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateAfter(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreateAfter(r7)
            bl3.r r7 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r0 = r7.mo62446e(r0)
            java.lang.Class<os1.f> r1 = os1.C11739f.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            os1.f r0 = (os1.C11739f) r0
            int r1 = r6.mo12969j3()
            os1.f$a r0 = r0.mo11600c3(r1)
            boolean r1 = r0.f34377j
            boolean r0 = r0.f34378k
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "config="
            r2.append(r3)
            os1.e$a r3 = r6.mo12967g3()
            java.lang.String r4 = "<this>"
            gy3.C87412m.m108594g(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[type="
            r4.append(r5)
            int r5 = r3.f34350a
            r4.append(r5)
            java.lang.String r5 = ",guide_appear_time="
            r4.append(r5)
            int r5 = r3.f34351b
            r4.append(r5)
            java.lang.String r5 = ",appear_time_second="
            r4.append(r5)
            int r5 = r3.f34352c
            r4.append(r5)
            java.lang.String r5 = ",appear_time_percent="
            r4.append(r5)
            int r5 = r3.f34353d
            r4.append(r5)
            java.lang.String r5 = ",guide_disappear_time="
            r4.append(r5)
            int r5 = r3.f34354e
            r4.append(r5)
            java.lang.String r5 = ",disappear_time_second="
            r4.append(r5)
            int r5 = r3.f34355f
            r4.append(r5)
            java.lang.String r5 = ",guide_appear_frequency="
            r4.append(r5)
            int r5 = r3.f34356g
            r4.append(r5)
            java.lang.String r5 = ",frequency_limit="
            r4.append(r5)
            int r3 = r3.f34357h
            r4.append(r3)
            r3 = 93
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Finder.SlideMoreGuideUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            os1.e$a r2 = r6.mo12967g3()
            int r2 = r2.f34350a
            if (r2 != 0) goto L_0x00bf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "just return. configScene="
            r7.append(r0)
            os1.e$a r0 = r6.mo12967g3()
            int r0 = r0.f34350a
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r7)
            return
        L_0x00bf:
            java.lang.String r2 = "just return. isInInnerAppPush configScene="
            if (r1 == 0) goto L_0x00e7
            if (r0 != 0) goto L_0x00e7
            os1.e$a r4 = r6.mo12967g3()
            int r4 = r4.f34350a
            r5 = 1
            if (r4 == r5) goto L_0x00e7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            os1.e$a r0 = r6.mo12967g3()
            int r0 = r0.f34350a
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r7)
            return
        L_0x00e7:
            if (r1 == 0) goto L_0x010d
            if (r0 == 0) goto L_0x010d
            os1.e$a r0 = r6.mo12967g3()
            int r0 = r0.f34350a
            r4 = 2
            if (r0 == r4) goto L_0x010d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            os1.e$a r0 = r6.mo12967g3()
            int r0 = r0.f34350a
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r7)
            return
        L_0x010d:
            os1.e$a r0 = r6.mo12967g3()
            int r0 = r0.f34350a
            r4 = 3
            if (r0 != r4) goto L_0x0131
            if (r1 == 0) goto L_0x0131
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            os1.e$a r0 = r6.mo12967g3()
            int r0 = r0.f34350a
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r7)
            return
        L_0x0131:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "scene="
            r0.append(r2)
            os1.e$a r2 = r6.mo12967g3()
            int r2 = r2.f34350a
            r0.append(r2)
            java.lang.String r2 = " isAppPush="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            rx3.g r0 = r6.f38501f
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r0 = (com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment) r0
            bl3.r$a r1 = r7.mo62445d(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC> r2 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC.class
            bl3.t r1 = r1.mo62449e(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC r1 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC) r1
            java.lang.String r2 = "viewCallback"
            r4 = 0
            if (r1 == 0) goto L_0x017f
            kf1.n9 r1 = r1.f18786e
            if (r1 == 0) goto L_0x017b
            kf1.nb r1 = (kf1.C9881nb) r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            goto L_0x0180
        L_0x017b:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x017f:
            r1 = r4
        L_0x0180:
            if (r1 != 0) goto L_0x019e
            bl3.r$a r0 = r7.mo62445d(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC> r1 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC.class
            bl3.t r0 = r0.mo62449e(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC r0 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC) r0
            if (r0 == 0) goto L_0x019d
            kf1.p2 r0 = r0.f18797f
            if (r0 == 0) goto L_0x0199
            androidx.recyclerview.widget.RecyclerView r1 = r0.getRecyclerView()
            goto L_0x019e
        L_0x0199:
            gy3.C87412m.m108603p(r2)
            throw r4
        L_0x019d:
            r1 = r4
        L_0x019e:
            if (r1 != 0) goto L_0x01a6
            java.lang.String r7 = "onCreateAfter: recyclerView is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            return
        L_0x01a6:
            r6.f38503h = r1
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r1.getLayoutManager()
            boolean r2 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto L_0x01b3
            r4 = r0
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
        L_0x01b3:
            if (r4 != 0) goto L_0x01bb
            java.lang.String r7 = "onCreateAfter: layoutManager is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            return
        L_0x01bb:
            rs1.z9$i r0 = new rs1.z9$i
            r0.<init>(r6, r4)
            r1.mo17043c(r0)
            android.app.Activity r0 = r6.getContext()
            bl3.r$a r7 = r7.mo62443b(r0)
            java.lang.Class<rs1.s8> r0 = rs1.C13442s8.class
            androidx.lifecycle.i0 r7 = r7.mo75002a(r0)
            rs1.s8 r7 = (rs1.C13442s8) r7
            int r0 = r6.mo12969j3()
            ef1.c r7 = r7.mo12856l3(r0)
            if (r7 == 0) goto L_0x01e5
            rs1.z9$j r0 = new rs1.z9$j
            r0.<init>(r6)
            r7.mo83450a(r0)
        L_0x01e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13572z9.onCreateAfter(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        if (!(getActivity() instanceof OccupyFinderUI5)) {
            f38498o = 0;
            this.f38505j.removeCallbacksAndMessages((Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13572z9(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
