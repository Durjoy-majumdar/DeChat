package q53;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import qo3.C12925w;

/* renamed from: q53.d0 */
public final class C12057d0 {

    /* renamed from: a */
    public final List<String> f35130a;

    /* renamed from: b */
    public final C12925w f35131b;

    /* renamed from: q53.d0$a */
    public static final class C12058a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12057d0 f35132d;

        public C12058a(C12057d0 d0Var) {
            this.f35132d = d0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumeTipsPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f35132d.f35131b.mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumeTipsPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C12057d0(List<String> list, Context context) {
        C87412m.m108594g(list, "wording");
        C87412m.m108594g(context, "context");
        this.f35130a = list;
        this.f35131b = new C12925w(context);
        View inflate = View.inflate(context, C0966R.C0971layout.d0m, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0966R.C0970id.bl4);
        C87412m.m108593f(findViewById, "result.findViewById(R.id.confirm_button)");
        ((Button) findViewById).setOnClickListener(new C12058a(this));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.kmz);
        for (String text : list) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = (int) context.getResources().getDimension(C0966R.dimen.f3766df);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams);
            textView.setText(text);
            linearLayout.addView(textView);
        }
        this.f35131b.mo12471k(inflate);
    }
}
