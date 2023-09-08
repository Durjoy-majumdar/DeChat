package sd2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import j20.C117292a;
import java.util.ArrayList;
import pj3.C47511g;

/* renamed from: sd2.g */
public class C77662g extends Preference {

    /* renamed from: Q */
    public static int f226404Q;

    /* renamed from: J */
    public View f226405J = null;

    /* renamed from: K */
    public C47511g f226406K;

    /* renamed from: L */
    public String f226407L;

    /* renamed from: M */
    public String[] f226408M;

    /* renamed from: N */
    public TextUtils.TruncateAt f226409N;

    /* renamed from: P */
    public boolean f226410P = false;

    /* renamed from: sd2.g$a */
    public class C77663a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f226411d;

        /* renamed from: e */
        public final /* synthetic */ LinearLayout f226412e;

        public C77663a(TextView textView, LinearLayout linearLayout) {
            this.f226411d = textView;
            this.f226412e = linearLayout;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/preference/MallOrderDeployablePreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f226411d.setVisibility(8);
            int i = 0;
            while (true) {
                C77662g gVar = C77662g.this;
                String[] strArr = gVar.f226408M;
                if (i >= strArr.length) {
                    break;
                }
                String str = strArr[i];
                gVar.getClass();
                TextView textView = new TextView(gVar.f121274d);
                textView.setText(str);
                textView.setTextSize(16.0f);
                textView.setTextColor(C77662g.f226404Q);
                if (gVar.f226410P) {
                    textView.setSingleLine(true);
                    textView.setEllipsize(gVar.f226409N);
                } else {
                    textView.setSingleLine(false);
                }
                this.f226412e.addView(textView, new LinearLayout.LayoutParams(-2, -2));
                i++;
            }
            this.f226411d.setOnClickListener((View.OnClickListener) null);
            C47511g gVar2 = C77662g.this.f226406K;
            if (gVar2 != null) {
                gVar2.notifyDataSetChanged();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/preference/MallOrderDeployablePreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C77662g(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.baj;
        f226404Q = context.getResources().getColor(C0966R.color.a3x);
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f226405J == null) {
            this.f226405J = mo1087x(viewGroup);
        }
        mo1086w(this.f226405J);
        return this.f226405J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.gm9);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.gm8);
        ((TextView) view.findViewById(C0966R.C0970id.gm_)).setText(this.f121279i);
        String[] strArr = this.f226408M;
        if (strArr == null || strArr.length <= 1) {
            textView.setTextColor(f226404Q);
        } else {
            textView.setOnClickListener(new C77663a(textView, linearLayout));
        }
        textView.setText(this.f226407L);
    }
}
