package hi1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import er1.C7865r3;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import il1.C8961e;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nh1.C11165g;
import ok1.C11471u;
import p192l4.C10462b;
import rx3.C13598b0;

/* renamed from: hi1.a */
public final class C8533a extends C8961e implements View.OnClickListener {

    /* renamed from: h */
    public final C32226l<Integer, C13598b0> f27586h;

    /* renamed from: i */
    public C11165g f27587i;

    /* renamed from: j */
    public int f27588j = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8533a(Context context, C32226l<? super Integer, C13598b0> lVar) {
        super(context, false, (C11471u.C11473b) null, 6, (C8480h) null);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(lVar, "onAcceptWayChange");
        this.f27586h = lVar;
        ViewGroup.LayoutParams layoutParams = this.f28309g.f26707c.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C7865r3.f26468a.mo8968a() / 2;
        }
    }

    /* renamed from: b */
    public View mo9448b() {
        WeImageView weImageView = new WeImageView(this.f28306d);
        weImageView.setImageResource(C0966R.raw.icons_filled_close);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(C0966R.color.FG_0));
        weImageView.setLayoutParams(new ViewGroup.LayoutParams(C76577a.m92151b(weImageView.getContext(), 24), C76577a.m92151b(weImageView.getContext(), 24)));
        return weImageView;
    }

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.f7173kt;
    }

    /* renamed from: j */
    public String mo9449j() {
        String string = this.f28306d.getResources().getString(C0966R.string.f8121lz);
        C87412m.m108593f(string, "context.resources.getStr…ve_mic_select_accept_way)");
        return string;
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        C87412m.m108594g(view, "rootView");
        int i = C0966R.C0970id.f5654qg;
        WeImageView weImageView = (WeImageView) C10462b.m10395a(view, C0966R.C0970id.f5654qg);
        if (weImageView != null) {
            i = C0966R.C0970id.f5828qh;
            ConstraintLayout constraintLayout = (ConstraintLayout) C10462b.m10395a(view, C0966R.C0970id.f5828qh);
            if (constraintLayout != null) {
                i = C0966R.C0970id.bku;
                WeImageView weImageView2 = (WeImageView) C10462b.m10395a(view, C0966R.C0970id.bku);
                if (weImageView2 != null) {
                    i = C0966R.C0970id.cdi;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) C10462b.m10395a(view, C0966R.C0970id.cdi);
                    if (constraintLayout2 != null) {
                        i = C0966R.C0970id.omy;
                        TextView textView = (TextView) C10462b.m10395a(view, C0966R.C0970id.omy);
                        if (textView != null) {
                            this.f27587i = new C11165g((LinearLayout) view, weImageView, constraintLayout, weImageView2, constraintLayout2, textView);
                            constraintLayout.setOnClickListener(this);
                            C11165g gVar = this.f27587i;
                            if (gVar != null) {
                                gVar.f32956d.setOnClickListener(this);
                                return;
                            } else {
                                C87412m.m108603p("uiBinding");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: l */
    public void mo9450l() {
        this.f27586h.invoke(Integer.valueOf(this.f27588j));
    }

    /* renamed from: n */
    public void mo9451n() {
        mo9763a();
        this.f27586h.invoke(Integer.valueOf(this.f27588j));
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicAcceptWayWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        C11165g gVar = this.f27587i;
        if (gVar != null) {
            int id = gVar.f32954b.getId();
            if (valueOf != null && valueOf.intValue() == id) {
                this.f27588j = 1;
            } else {
                C11165g gVar2 = this.f27587i;
                if (gVar2 != null) {
                    int id4 = gVar2.f32956d.getId();
                    if (valueOf != null && valueOf.intValue() == id4) {
                        this.f27588j = 2;
                    }
                } else {
                    C87412m.m108603p("uiBinding");
                    throw null;
                }
            }
            this.f27586h.invoke(Integer.valueOf(this.f27588j));
            mo9763a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicAcceptWayWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("uiBinding");
        throw null;
    }
}
