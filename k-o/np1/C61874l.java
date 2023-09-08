package np1;

import ak1.C54108o;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import di3.C7335d;
import di3.C86312j;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import rx3.C13598b0;
import te3.C64399gj1;

/* renamed from: np1.l */
public final class C61874l implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ C64399gj1 f175939a;

    /* renamed from: b */
    public final /* synthetic */ C61817a f175940b;

    /* renamed from: c */
    public final /* synthetic */ MMSwitchBtn f175941c;

    /* renamed from: d */
    public final /* synthetic */ View f175942d;

    /* renamed from: e */
    public final /* synthetic */ View f175943e;

    /* renamed from: f */
    public final /* synthetic */ View f175944f;

    /* renamed from: np1.l$a */
    public static final class C61875a extends C87413o implements C32228q<Boolean, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMSwitchBtn f175945d;

        /* renamed from: e */
        public final /* synthetic */ View f175946e;

        /* renamed from: f */
        public final /* synthetic */ View f175947f;

        /* renamed from: g */
        public final /* synthetic */ View f175948g;

        /* renamed from: h */
        public final /* synthetic */ C64399gj1 f175949h;

        /* renamed from: i */
        public final /* synthetic */ C61817a f175950i;

        /* renamed from: j */
        public final /* synthetic */ C61874l f175951j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61875a(MMSwitchBtn mMSwitchBtn, View view, View view2, View view3, C64399gj1 gj12, C61817a aVar, C61874l lVar) {
            super(3);
            this.f175945d = mMSwitchBtn;
            this.f175946e = view;
            this.f175947f = view2;
            this.f175948g = view3;
            this.f175949h = gj12;
            this.f175950i = aVar;
            this.f175951j = lVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int intValue = ((Number) obj2).intValue();
            int intValue2 = ((Number) obj3).intValue();
            boolean z = true;
            if (booleanValue) {
                if (intValue != 1) {
                    z = false;
                }
                this.f175945d.setCheck(z);
                View view = this.f175946e;
                int i = z ? 0 : 8;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f175947f;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = this.f175948g;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$onClickReplayOptionView$1$1$1$onStatusChange$1", "invoke", "(ZII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C64399gj1 gj12 = this.f175949h;
                gj12.f183343d = intValue;
                gj12.f183344e = intValue2;
            } else {
                this.f175945d.setSwitchListener((MMSwitchBtn.C7041b) null);
                MMSwitchBtn mMSwitchBtn = this.f175945d;
                mMSwitchBtn.setCheck(!mMSwitchBtn.f220433y);
                C76912y0.m92767f(this.f175950i.f175772e.getContext(), this.f175950i.f175772e.getContext().getString(C0966R.string.e3m));
                MMSwitchBtn mMSwitchBtn2 = this.f175945d;
                mMSwitchBtn2.postDelayed(new C61873k(mMSwitchBtn2, this.f175951j), 100);
            }
            return C13598b0.f38549a;
        }
    }

    public C61874l(C64399gj1 gj12, C61817a aVar, MMSwitchBtn mMSwitchBtn, View view, View view2, View view3) {
        this.f175939a = gj12;
        this.f175940b = aVar;
        this.f175941c = mMSwitchBtn;
        this.f175942d = view;
        this.f175943e = view2;
        this.f175944f = view3;
    }

    public void onStatusChange(boolean z) {
        int i;
        Class cls = C54108o.class;
        if (!z) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C54108o.Ux0((C54108o) c, 2, this.f175939a.f183344e, 0, 0, 12, (Object) null);
            i = 2;
        } else {
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C54108o.Ux0((C54108o) c2, 1, this.f175939a.f183344e, 0, 0, 12, (Object) null);
            i = 1;
        }
        C61817a aVar = this.f175940b;
        C64399gj1 gj12 = this.f175939a;
        C61817a.m72533b(aVar, i, gj12.f183344e, new C61875a(this.f175941c, this.f175942d, this.f175943e, this.f175944f, gj12, aVar, this));
    }
}
