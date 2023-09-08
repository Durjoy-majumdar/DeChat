package wi1;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import il1.C8961e;
import j20.C117292a;
import java.util.ArrayList;
import nh1.C11167v;
import ok1.C11471u;
import p192l4.C10462b;
import rx3.C13598b0;

/* renamed from: wi1.c */
public final class C15408c extends C8961e {

    /* renamed from: h */
    public final C32224a<C13598b0> f41803h;

    /* renamed from: i */
    public C11167v f41804i;

    /* renamed from: wi1.c$a */
    public static final class C15409a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15408c f41805d;

        public C15409a(C15408c cVar) {
            this.f41805d = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/micintercom/widget/LiveMicBottomGuideSheet$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f41805d.mo9763a();
            this.f41805d.f41803h.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/micintercom/widget/LiveMicBottomGuideSheet$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15408c(Context context, C32224a<C13598b0> aVar) {
        super(context, false, (C11471u.C11473b) null, 6, (C8480h) null);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "confirmBlock");
        this.f41803h = aVar;
    }

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.bcn;
    }

    /* renamed from: h */
    public int mo3426h() {
        return 8;
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        C87412m.m108594g(view, "rootView");
        int i = C0966R.C0970id.mbe;
        Button button = (Button) C10462b.m10395a(view, C0966R.C0970id.mbe);
        if (button != null) {
            i = C0966R.C0970id.iza;
            TextView textView = (TextView) C10462b.m10395a(view, C0966R.C0970id.iza);
            if (textView != null) {
                this.f41804i = new C11167v((LinearLayout) view, button, textView);
                Context context = this.f28306d;
                C32444a aVar = C32444a.f86121a;
                textView.setText(context.getString(C0966R.string.fpq, new Object[]{C32444a.f86064I.mo60266n()}));
                C11167v vVar = this.f41804i;
                if (vVar != null) {
                    vVar.f32962a.setOnClickListener(new C15409a(this));
                    return;
                } else {
                    C87412m.m108603p("layoutBinding");
                    throw null;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
