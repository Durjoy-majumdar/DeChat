package wg1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import rx3.C13598b0;
import x50.C15626c;

/* renamed from: wg1.i */
public final class C15303i implements C15256b {

    /* renamed from: d */
    public final View f41608d;

    /* renamed from: e */
    public final MMActivity f41609e;

    /* renamed from: f */
    public final C32226l<Integer, C13598b0> f41610f;

    /* renamed from: g */
    public FrameLayout f41611g;

    /* renamed from: h */
    public PAGView f41612h;

    /* renamed from: i */
    public C32224a<C13598b0> f41613i;

    /* renamed from: wg1.i$a */
    public static final class C15304a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15303i f41614d;

        public C15304a(C15303i iVar) {
            this.f41614d = iVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftBubbleViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f41614d.f41613i;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftBubbleViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.i$b */
    public static final class C15305b extends SimplePAGViewUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C15303i f41615d;

        public C15305b(C15303i iVar) {
            this.f41615d = iVar;
        }

        public void onAnimationCancel(PAGView pAGView) {
        }

        public void onAnimationEnd(PAGView pAGView) {
            PAGView pAGView2 = this.f41615d.f41612h;
            if (pAGView2 != null) {
                pAGView2.stop();
            }
            C15303i iVar = this.f41615d;
            PAGView pAGView3 = iVar.f41612h;
            if (pAGView3 != null) {
                pAGView3.setComposition(PAGFile.Load(iVar.f41609e.getAssets(), "finder_live_allowance_gift_bubble_icon_2.pag"));
            }
            PAGView pAGView4 = this.f41615d.f41612h;
            if (pAGView4 != null) {
                pAGView4.setRepeatCount(0);
            }
            PAGView pAGView5 = this.f41615d.f41612h;
            if (pAGView5 != null) {
                pAGView5.setProgress(0.0d);
            }
            PAGView pAGView6 = this.f41615d.f41612h;
            if (pAGView6 != null) {
                pAGView6.play();
            }
            PAGView pAGView7 = this.f41615d.f41612h;
            if (pAGView7 != null) {
                pAGView7.flush();
            }
            PAGView pAGView8 = this.f41615d.f41612h;
            if (pAGView8 != null) {
                pAGView8.removeListener(this);
            }
        }

        public void onAnimationRepeat(PAGView pAGView) {
        }

        public void onAnimationStart(PAGView pAGView) {
        }
    }

    public C15303i(View view, MMActivity mMActivity, C15253a aVar, C32226l<? super Integer, C13598b0> lVar) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(lVar, "setRootVisibleFunction");
        this.f41608d = view;
        this.f41609e = mMActivity;
        this.f41610f = lVar;
        view.setOnClickListener(new C15304a(this));
        this.f41611g = (FrameLayout) view.findViewById(C0966R.C0970id.f5793ow);
        if (this.f41612h == null) {
            Log.m105924i("FinderLiveAllowanceGiftBubbleViewCallback", "#initSmallAnim create smallAnim!");
            FrameLayout frameLayout = this.f41611g;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.f41612h = new PAGView(view.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C15626c.m14629a(mMActivity, 72.0f), C15626c.m14629a(mMActivity, 172.0f));
            PAGView pAGView = this.f41612h;
            if (pAGView != null) {
                pAGView.setLayoutParams(layoutParams);
            }
            PAGView pAGView2 = this.f41612h;
            if (pAGView2 != null) {
                pAGView2.setScaleMode(1);
            }
            FrameLayout frameLayout2 = this.f41611g;
            if (frameLayout2 != null) {
                frameLayout2.addView(this.f41612h);
            }
        }
        lVar.invoke(8);
    }

    /* renamed from: H */
    public void mo14156H() {
        Log.m105924i("FinderLiveAllowanceGiftBubbleViewCallback", "#showBubbleView");
        if (!this.f41608d.isShown()) {
            if (C62042e.f176370a.mo87027N0()) {
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.GIFT_ALLOWANCE, String.valueOf(1), (String) null, 4, (Object) null);
            } else {
                C7335d c2 = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                ((C54116w) c2).iy0(C54067f0.C0072w.ICON_EXPOSE, "");
            }
            this.f41610f.invoke(0);
            PAGView pAGView = this.f41612h;
            if (pAGView != null) {
                pAGView.stop();
            }
            PAGView pAGView2 = this.f41612h;
            if (pAGView2 != null) {
                pAGView2.setComposition(PAGFile.Load(this.f41609e.getAssets(), "finder_live_allowance_gift_bubble_icon.pag"));
            }
            PAGView pAGView3 = this.f41612h;
            if (pAGView3 != null) {
                pAGView3.setRepeatCount(1);
            }
            PAGView pAGView4 = this.f41612h;
            if (pAGView4 != null) {
                pAGView4.setProgress(0.0d);
            }
            PAGView pAGView5 = this.f41612h;
            if (pAGView5 != null) {
                pAGView5.play();
            }
            PAGView pAGView6 = this.f41612h;
            if (pAGView6 != null) {
                pAGView6.flush();
            }
            PAGView pAGView7 = this.f41612h;
            if (pAGView7 != null) {
                pAGView7.addListener(new C15305b(this));
            }
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f41609e;
    }

    /* renamed from: k */
    public void mo14157k(C32224a<C13598b0> aVar) {
        this.f41613i = aVar;
    }

    /* renamed from: s0 */
    public void mo14158s0() {
        Log.m105924i("FinderLiveAllowanceGiftBubbleViewCallback", "#hideBubbleView");
        this.f41610f.invoke(8);
    }
}
