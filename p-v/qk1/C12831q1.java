package qk1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import ig1.C8916d;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import qk1.C12814m1;
import rx3.C13598b0;
import yh1.C16011a;

/* renamed from: qk1.q1 */
public final class C12831q1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12814m1 f36721d;

    /* renamed from: e */
    public final /* synthetic */ boolean f36722e;

    /* renamed from: f */
    public final /* synthetic */ C8477a0 f36723f;

    /* renamed from: g */
    public final /* synthetic */ C8916d f36724g;

    /* renamed from: h */
    public final /* synthetic */ C12814m1.C12815a f36725h;

    /* renamed from: qk1.q1$a */
    public static final class C12832a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12814m1.C12815a f36726d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12832a(C12814m1.C12815a aVar) {
            super(1);
            this.f36726d = aVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f36726d.f36689I.performClick();
            }
            return C13598b0.f38549a;
        }
    }

    public C12831q1(C12814m1 m1Var, boolean z, C8477a0 a0Var, C8916d dVar, C12814m1.C12815a aVar) {
        this.f36721d = m1Var;
        this.f36722e = z;
        this.f36723f = a0Var;
        this.f36724g = dVar;
        this.f36725h = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C12814m1 m1Var = this.f36721d;
        if (m1Var.f36678f) {
            if (this.f36722e) {
                Context context = m1Var.f36676d;
                C76912y0.makeText(context, (CharSequence) context.getString(C0966R.string.n86), 0).show();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (this.f36723f.f27482d) {
                Context context2 = m1Var.f36676d;
                C76912y0.m92769h(context2, context2.getString(C0966R.string.n9k), C0966R.raw.icons_filled_error);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        if (!C61926c.m72696u(this.f36724g.field_flag, 256) || !C62042e.f176370a.mo87098n(this.f36721d.f36676d, "FinderLiveLegalPromot2", new C12832a(this.f36725h))) {
            C16011a aVar = this.f36721d.f36680h;
            if (aVar != null) {
                C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
                String str = this.f36724g.field_rewardProductId;
                C87412m.m108593f(str, "giftInfo.field_rewardProductId");
                aVar.mo12009e((ViewGroup) view, str, this.f36721d.f36678f);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
