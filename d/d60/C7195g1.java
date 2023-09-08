package d60;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: d60.g1 */
public final class C7195g1 extends C58121a {

    /* renamed from: f */
    public final C58124b f25195f;

    /* renamed from: g */
    public final View f25196g;

    /* renamed from: h */
    public int f25197h;

    /* renamed from: d60.g1$a */
    public static final class C7196a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7195g1 f25198d;

        public C7196a(C7195g1 g1Var) {
            this.f25198d = g1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveVisitorClosePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f25198d.f25195f, C58124b.C58125b.CLOSE_LIVE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveVisitorClosePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7195g1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statueMonitor");
        this.f25195f = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.g0d);
        this.f25196g = findViewById;
        this.f25197h = C75044y4.m89991c(viewGroup.getContext());
        findViewById.setOnClickListener(new C7196a(this));
        if (viewGroup.getLayoutParams() != null && (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && mo82893g0()) {
            int d0 = mo82891d0();
            if (d0 == 1) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C75044y4.m89991c(viewGroup.getContext()));
            } else if (d0 == 3) {
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(C74942w4.m89784a(viewGroup.getContext(), 16));
            }
        }
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        int c = C75044y4.m89991c(this.f166287d.getContext());
        if (c == 0) {
            c = C74942w4.m89784a(this.f166287d.getContext(), 16);
        }
        this.f25197h = c;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            if (ordinal != 7) {
                boolean z = true;
                if (ordinal != 39) {
                    if (ordinal != 65) {
                        if (!(ordinal == 27 || ordinal == 28)) {
                            return;
                        }
                    } else if (this.f166287d.getLayoutParams() != null && (this.f166287d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                        int d0 = mo82891d0();
                        if (d0 == 1) {
                            ViewGroup.LayoutParams layoutParams = this.f166287d.getLayoutParams();
                            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.f25197h;
                            this.f166287d.requestLayout();
                            return;
                        } else if (d0 == 3) {
                            ViewGroup.LayoutParams layoutParams2 = this.f166287d.getLayoutParams();
                            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = C74942w4.m89784a(this.f166287d.getContext(), 16);
                            this.f166287d.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (this.f25195f.getLiveRole() == 0) {
                    if (bundle == null || !bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
                        z = false;
                    }
                    if (z) {
                        mo10792g(4);
                        return;
                    } else {
                        mo10792g(0);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                mo10792g(0);
                return;
            }
        }
        mo10792g(8);
    }
}
