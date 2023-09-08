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
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: il1.u4 */
public final class C9128u4 {

    /* renamed from: a */
    public final MMActivity f28755a;

    /* renamed from: b */
    public final ViewGroup f28756b;

    /* renamed from: c */
    public C32224a<C13598b0> f28757c;

    /* renamed from: d */
    public final LiveBottomSheetPanel f28758d;

    /* renamed from: e */
    public final View f28759e;

    /* renamed from: f */
    public final View f28760f;

    /* renamed from: il1.u4$a */
    public static final class C9129a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9128u4 f28761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9129a(C9128u4 u4Var) {
            super(1);
            this.f28761d = u4Var;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f28761d.f28756b.setVisibility(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.u4$b */
    public static final class C9130b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9128u4 f28762d;

        public C9130b(C9128u4 u4Var) {
            this.f28762d = u4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLicensePanelWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f28762d.f28758d.mo78802a();
            C32224a<C13598b0> aVar = this.f28762d.f28757c;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLicensePanelWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.u4$c */
    public static final class C9131c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9128u4 f28763d;

        public C9131c(C9128u4 u4Var) {
            this.f28763d = u4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLicensePanelWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f28763d.f28758d.mo78802a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLicensePanelWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.u4$d */
    public static final class C9132d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9128u4 f28764d;

        public C9132d(C9128u4 u4Var) {
            this.f28764d = u4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLicensePanelWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f28764d.f28758d.mo78802a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLicensePanelWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C9128u4(MMActivity mMActivity, ViewGroup viewGroup, C32224a<C13598b0> aVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(viewGroup, "licenseContainer");
        this.f28755a = mMActivity;
        this.f28756b = viewGroup;
        this.f28757c = aVar;
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) viewGroup.findViewById(C0966R.C0970id.f358215dw2);
        this.f28758d = liveBottomSheetPanel;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.dw4);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.dvz);
        this.f28759e = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.f358213dw0);
        this.f28760f = findViewById2;
        liveBottomSheetPanel.setTranslationY((float) C75044y4.m89990b(mMActivity).y);
        liveBottomSheetPanel.setOnVisibilityListener(new C9129a(this));
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += C75044y4.m89991c(viewGroup.getContext());
        C87412m.m108593f(textView, "tipTv");
        String string = textView.getContext().getResources().getString(C0966R.string.dfk);
        C87412m.m108593f(string, "tv.context.resources.get…inder_live_anchor_iterms)");
        String string2 = textView.getContext().getResources().getString(C0966R.string.dg8);
        C87412m.m108593f(string2, "tv.context.resources.get…der_live_anchor_standard)");
        String string3 = textView.getContext().getResources().getString(C0966R.string.dpy);
        C87412m.m108593f(string3, "tv.context.resources.get….finder_live_license_tip)");
        String format = String.format(string3, Arrays.copyOf(new Object[]{string, string2}, 2));
        C87412m.m108593f(format, "format(format, *args)");
        String str = format;
        int E = C112550d0.m153769E(str, string, 0, false, 6, (Object) null);
        int E2 = C112550d0.m153769E(str, string2, 0, false, 6, (Object) null);
        SpannableString spannableString = new SpannableString(format);
        C9148v4 v4Var = new C9148v4(this);
        C9159w4 w4Var = new C9159w4(this);
        spannableString.setSpan(v4Var, E, string.length() + E, 33);
        spannableString.setSpan(w4Var, E2, string2.length() + E2, 33);
        textView.setHighlightColor(textView.getContext().getResources().getColor(17170445));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        ((TextView) viewGroup.findViewById(C0966R.C0970id.dw6)).setOnClickListener(new C9130b(this));
        ((TextView) viewGroup.findViewById(C0966R.C0970id.f358214dw1)).setOnClickListener(new C9131c(this));
        findViewById.setOnClickListener(new C9132d(this));
    }
}
