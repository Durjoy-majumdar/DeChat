package il1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import rx3.C13598b0;
import sg1.C13677a;

/* renamed from: il1.u1 */
public final class C9122u1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9093q1 f28741d;

    /* renamed from: e */
    public final /* synthetic */ int f28742e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<String> f28743f;

    /* renamed from: g */
    public final /* synthetic */ TextView f28744g;

    /* renamed from: h */
    public final /* synthetic */ View f28745h;

    /* renamed from: i */
    public final /* synthetic */ int f28746i;

    /* renamed from: il1.u1$a */
    public static final class C9123a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextView f28747d;

        /* renamed from: e */
        public final /* synthetic */ View f28748e;

        /* renamed from: f */
        public final /* synthetic */ int f28749f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9123a(TextView textView, View view, int i) {
            super(1);
            this.f28747d = textView;
            this.f28748e = view;
            this.f28749f = i;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            this.f28747d.setTextColor(this.f28748e.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
            if (this.f28749f == 2) {
                TextView textView = this.f28747d;
                C13677a aVar = C13677a.f38723a;
                Context context = this.f28748e.getContext();
                C87412m.m108593f(context, "context");
                textView.setText(aVar.mo13061a(context, intValue, 2));
            } else {
                TextView textView2 = this.f28747d;
                C13677a aVar2 = C13677a.f38723a;
                Context context2 = this.f28748e.getContext();
                C87412m.m108593f(context2, "context");
                textView2.setText(aVar2.mo13061a(context2, intValue, 1));
            }
            return C13598b0.f38549a;
        }
    }

    public C9122u1(C9093q1 q1Var, int i, C8479f0<String> f0Var, TextView textView, View view, int i2) {
        this.f28741d = q1Var;
        this.f28742e = i;
        this.f28743f = f0Var;
        this.f28744g = textView;
        this.f28745h = view;
        this.f28746i = i2;
    }

    public final void onClick(View view) {
        Button button;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveChargeIncreaseDurationWidget$showDurationIncreasePanel$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C9093q1 q1Var = this.f28741d;
        int i = this.f28742e;
        String str = (String) this.f28743f.f27484d;
        C9123a aVar = new C9123a(this.f28744g, this.f28745h, this.f28746i);
        q1Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C62042e eVar = C62042e.f176370a;
        eVar.mo87115s0(arrayList2, C0966R.string.dzm);
        C62042e.m72806e0(eVar, arrayList3, arrayList2.size(), 0, 4, (Object) null);
        C7045j jVar = new C7045j(q1Var.f28669a, arrayList2, arrayList3);
        q1Var.f28672d = jVar;
        jVar.mo8107j(i / 3600, (i % 3600) / 60);
        C7045j jVar2 = q1Var.f28672d;
        if (jVar2 != null) {
            String string = q1Var.f28669a.getResources().getString(C0966R.string.dzc);
            Button button2 = jVar2.f24861i;
            if (button2 != null) {
                button2.setText(string);
            }
        }
        C7045j jVar3 = q1Var.f28672d;
        if (jVar3 != null) {
            jVar3.f24869t = new C9141v1(arrayList2, arrayList3, q1Var, i, aVar);
        }
        View inflate = LayoutInflater.from(q1Var.f28669a).inflate(C0966R.C0971layout.d65, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0966R.C0970id.knx)).setText(str);
        C7045j jVar4 = q1Var.f28672d;
        if (jVar4 != null) {
            int color = q1Var.f28669a.getResources().getColor(C0966R.color.f3424sc);
            Button button3 = jVar4.f24862j;
            if (button3 != null) {
                button3.setTextColor(color);
            }
        }
        C7045j jVar5 = q1Var.f28672d;
        if (jVar5 != null) {
            jVar5.mo8105h(2);
        }
        C7045j jVar6 = q1Var.f28672d;
        if (!(jVar6 == null || (button = jVar6.f24861i) == null)) {
            button.setBackgroundResource(C0966R.C0969drawable.f5153yk);
        }
        C7045j jVar7 = q1Var.f28672d;
        if (jVar7 != null) {
            jVar7.mo8104g(inflate);
        }
        C7045j jVar8 = q1Var.f28672d;
        if (jVar8 != null) {
            jVar8.mo8109l();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveChargeIncreaseDurationWidget$showDurationIncreasePanel$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
