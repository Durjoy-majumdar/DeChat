package zo1;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import gy3.C87412m;
import il1.C8968f2;
import j20.C117292a;
import java.util.ArrayList;
import qj1.C12252b;
import te3.C49712hj1;

/* renamed from: zo1.i */
public final class C66923i extends C12252b {

    /* renamed from: q */
    public final C58124b f192293q;

    /* renamed from: r */
    public final String f192294r = "ReplayExceptionLazyPlugin";

    /* renamed from: s */
    public C8968f2 f192295s;

    /* renamed from: t */
    public ViewGroup f192296t;

    /* renamed from: zo1.i$a */
    public static final class C53802a implements View.OnClickListener {

        /* renamed from: d */
        public static final C53802a f150971d = new C53802a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/replay/plugin/ReplayExceptionLazyPlugin$initWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayExceptionLazyPlugin$initWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66923i(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f192293q = bVar;
    }

    /* renamed from: Z0 */
    public final void mo90913Z0(String str) {
        if (this.f192295s == null) {
            this.f166287d.removeAllViews();
            View inflate = LayoutInflater.from(this.f166287d.getContext()).inflate(C0966R.C0971layout.afy, this.f166287d, true);
            inflate.setOnClickListener(C53802a.f150971d);
            ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.dvs);
            if (viewGroup != null) {
                this.f192296t = viewGroup;
                viewGroup.setBackgroundColor(viewGroup.getContext().getResources().getColor(C0966R.color.f2949a6, (Resources.Theme) null));
                this.f192295s = new C8968f2(viewGroup, str, ((C54991o) mo87684A0().mo71262a(C54991o.class)).mo75969L3());
            }
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        ViewGroup viewGroup = this.f192296t;
        if (!(viewGroup != null && viewGroup.getVisibility() == 0)) {
            return false;
        }
        mo14484z0().finish();
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: q0 */
    public boolean mo82896q0() {
        ViewGroup viewGroup = this.f192296t;
        if (!(viewGroup != null && viewGroup.getVisibility() == 0)) {
            return false;
        }
        mo14484z0().finish();
        return true;
    }
}
