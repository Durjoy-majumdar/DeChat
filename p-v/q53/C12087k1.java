package q53;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C87412m;
import m53.C10754b;
import p196ln.C76705f;
import qo3.C101218e0;

/* renamed from: q53.k1 */
public final class C12087k1 implements C10754b {

    /* renamed from: a */
    public final Context f35171a;

    /* renamed from: b */
    public C101218e0 f35172b;

    /* renamed from: c */
    public View f35173c;

    /* renamed from: d */
    public C10754b.C10755a f35174d;

    public C12087k1(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        this.f35171a = context;
        C101218e0 e0Var = new C101218e0(context, 2, 0, true, z);
        this.f35172b = e0Var;
        e0Var.mo140677w(context.getString(C0966R.string.ljf));
        C101218e0 e0Var2 = this.f35172b;
        if (e0Var2 != null) {
            e0Var2.f296375F = new C12079i1(this);
            e0Var2.mo140665l(new C12083j1(this));
            View inflate = View.inflate(context, C0966R.C0971layout.b5t, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(context, R.layou…ce_tutorial_dialog, null)");
            this.f35173c = inflate;
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.loq);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            View view = this.f35173c;
            if (view != null) {
                ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f359582lo1);
                View view2 = this.f35173c;
                if (view2 != null) {
                    TextView textView2 = (TextView) view2.findViewById(C0966R.C0970id.lor);
                    C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                    String s = C75592q0.m90789s();
                    String m = C75592q0.m90783m();
                    boolean z2 = true;
                    m = m == null || m.length() == 0 ? C75592q0.m90772b() : m;
                    m = m == null || m.length() == 0 ? s : m;
                    if (!(s == null || s.length() == 0)) {
                        z2 = false;
                    }
                    if (!z2 && C86709a0.m107522a()) {
                        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, s);
                    }
                    textView2.setText(m);
                    if (z) {
                        View view3 = this.f35173c;
                        if (view3 != null) {
                            view3.findViewById(C0966R.C0970id.lop).setBackgroundResource(C0966R.C0969drawable.cfn);
                            textView.setTextColor(context.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                            textView2.setTextColor(context.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                        } else {
                            C87412m.m108603p("mCustomView");
                            throw null;
                        }
                    }
                    C101218e0 e0Var3 = this.f35172b;
                    if (e0Var3 != null) {
                        View view4 = this.f35173c;
                        if (view4 != null) {
                            e0Var3.mo140663j(view4);
                            C101218e0 e0Var4 = this.f35172b;
                            if (e0Var4 != null) {
                                e0Var4.mo140655A();
                            } else {
                                C87412m.m108603p("mBottomSheet");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mCustomView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mBottomSheet");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mCustomView");
                    throw null;
                }
            } else {
                C87412m.m108603p("mCustomView");
                throw null;
            }
        } else {
            C87412m.m108603p("mBottomSheet");
            throw null;
        }
    }

    /* renamed from: a */
    public void mo10988a(C10754b.C10755a aVar) {
        this.f35174d = aVar;
    }
}
