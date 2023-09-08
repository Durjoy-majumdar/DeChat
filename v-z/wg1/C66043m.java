package wg1;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: wg1.m */
public final class C66043m implements C66034k {

    /* renamed from: d */
    public final View f189861d;

    /* renamed from: e */
    public final MMActivity f189862e;

    /* renamed from: f */
    public View f189863f;

    /* renamed from: g */
    public View f189864g;

    /* renamed from: h */
    public View f189865h;

    /* renamed from: i */
    public C32224a<C13598b0> f189866i;

    /* renamed from: wg1.m$a */
    public static final class C66044a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66043m f189867d;

        public C66044a(C66043m mVar) {
            this.f189867d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f189867d.f189866i;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C66043m(View view, MMActivity mMActivity, C66032j jVar) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f189861d = view;
        this.f189862e = mMActivity;
        this.f189863f = view.findViewById(C0966R.C0970id.fkp);
        this.f189864g = view.findViewById(C0966R.C0970id.fjz);
        this.f189865h = view.findViewById(C0966R.C0970id.flj);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.be4);
        if (imageView != null) {
            imageView.setOnClickListener(new C66044a(this));
        }
    }

    /* renamed from: B0 */
    public void mo90063B0() {
        View view = this.f189863f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f189864g;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view4 = this.f189865h;
        if (view4 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view5 = this.f189861d;
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
        aVar4.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showAnchorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: f0 */
    public void mo90064f0() {
        View view = this.f189863f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f189864g;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view4 = this.f189865h;
        if (view4 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view5 = this.f189861d;
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
        aVar4.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showFailedCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public MMFragmentActivity getActivity() {
        return this.f189862e;
    }

    /* renamed from: i0 */
    public void mo90065i0() {
        if (!MultiProcessMMKV.getDefault().getBoolean("MMKVFinderLiveAllowanceGiftCardViewCallbackAnchor", false)) {
            MultiProcessMMKV.getDefault().putBoolean("MMKVFinderLiveAllowanceGiftCardViewCallbackAnchor", true);
            View view = this.f189863f;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view3 = this.f189864g;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view5 = this.f189865h;
            if (view5 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view7 = this.f189861d;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "showVisitorGuideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
