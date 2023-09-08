package il1;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58782w0;
import er1.C7919x;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: il1.s4 */
public final class C60511s4 {

    /* renamed from: a */
    public final MMActivity f172474a;

    /* renamed from: b */
    public final ViewGroup f172475b;

    /* renamed from: c */
    public C32224a<C13598b0> f172476c;

    /* renamed from: d */
    public final LiveBottomSheetPanel f172477d;

    /* renamed from: e */
    public final TextView f172478e;

    /* renamed from: f */
    public final View f172479f;

    /* renamed from: g */
    public final View f172480g;

    /* renamed from: h */
    public boolean f172481h;

    /* renamed from: il1.s4$a */
    public static final class C60512a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60511s4 f172482d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60512a(C60511s4 s4Var) {
            super(1);
            this.f172482d = s4Var;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f172482d.f172475b.setVisibility(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.s4$b */
    public static final class C60513b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60511s4 f172483d;

        public C60513b(C60511s4 s4Var) {
            this.f172483d = s4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveGameLicensePanelWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f172483d.f172477d.mo78802a();
            C32224a<C13598b0> aVar = this.f172483d.f172476c;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameLicensePanelWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.s4$c */
    public static final class C60514c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60511s4 f172484d;

        public C60514c(C60511s4 s4Var) {
            this.f172484d = s4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveGameLicensePanelWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f172484d.f172477d.mo78802a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameLicensePanelWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.s4$d */
    public static final class C60515d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60511s4 f172485d;

        public C60515d(C60511s4 s4Var) {
            this.f172485d = s4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveGameLicensePanelWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f172485d.f172477d.mo78802a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveGameLicensePanelWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C60511s4(MMActivity mMActivity, ViewGroup viewGroup, C32224a<C13598b0> aVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(viewGroup, "licenseContainer");
        this.f172474a = mMActivity;
        this.f172475b = viewGroup;
        this.f172476c = aVar;
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) viewGroup.findViewById(C0966R.C0970id.f358215dw2);
        this.f172477d = liveBottomSheetPanel;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.dw4);
        this.f172478e = textView;
        TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.f358214dw1);
        TextView textView3 = (TextView) viewGroup.findViewById(C0966R.C0970id.dw6);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.dvz);
        this.f172479f = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.f358213dw0);
        this.f172480g = findViewById2;
        liveBottomSheetPanel.setTranslationY((float) C75044y4.m89990b(mMActivity).y);
        liveBottomSheetPanel.setOnVisibilityListener(new C60512a(this));
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += C75044y4.m89991c(viewGroup.getContext());
        C87412m.m108593f(textView, "tipTv");
        mo85481a(textView);
        textView3.setOnClickListener(new C60513b(this));
        textView2.setOnClickListener(new C60514c(this));
        C7919x.m8091a(textView3);
        C7919x.m8091a(textView2);
        findViewById.setOnClickListener(new C60515d(this));
    }

    /* renamed from: a */
    public final void mo85481a(TextView textView) {
        SpannableString g = C58782w0.f168290a.mo83848g(this.f172474a, C0966R.string.dni, this.f172481h);
        textView.setHighlightColor(textView.getContext().getResources().getColor(17170445));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(g);
    }
}
