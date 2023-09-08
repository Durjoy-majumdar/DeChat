package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import qo3.C77390c0;

/* renamed from: com.tencent.mm.plugin.remittance.ui.i0 */
public class C70896i0 extends C77390c0 implements View.OnClickListener {

    /* renamed from: g */
    public static final /* synthetic */ int f205308g = 0;

    /* renamed from: d */
    public View f205309d;

    /* renamed from: e */
    public int f205310e;

    /* renamed from: f */
    public View.OnClickListener f205311f;

    public C70896i0(Context context) {
        this(context, C0966R.style.a6_);
    }

    /* renamed from: c */
    public static C70896i0 m83416c(Context context, int i, double d, double d2, String str, double d3, double d4, String str2, View.OnClickListener onClickListener) {
        Context context2 = context;
        int i2 = i;
        View.OnClickListener onClickListener2 = onClickListener;
        Log.m105924i("RemittanceChargeDialog", "showCostDetail");
        C70896i0 i0Var = new C70896i0(context);
        i0Var.f205310e = i2;
        if (d2 == 0.0d) {
            Log.m105924i("RemittanceChargeDialog", "showCostDetail ::: remian_fee = 0");
        }
        ((TextView) i0Var.findViewById(C0966R.C0970id.f359073io1)).setText(C75228t.m90256l(d2));
        ((TextView) i0Var.findViewById(C0966R.C0970id.cls)).setText(C75228t.m90256l(d3));
        if (d4 == 0.0d) {
            Log.m105920e("RemittanceChargeDialog", "showCostDetail ::: transaction_costs = 0");
        }
        ((TextView) i0Var.findViewById(C0966R.C0970id.ktn)).setText(C75228t.m90256l(d4));
        View findViewById = i0Var.findViewById(C0966R.C0970id.f359065im1);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowCostDetail", "(Landroid/content/Context;DDLjava/lang/String;DDLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowCostDetail", "(Landroid/content/Context;DDLjava/lang/String;DDLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!Util.isNullOrNil(str2)) {
            TextView textView = (TextView) i0Var.findViewById(C0966R.C0970id.imu);
            textView.setText(str2);
            textView.setVisibility(0);
        }
        View findViewById2 = i0Var.findViewById(C0966R.C0970id.kmo);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowCostDetail", "(Landroid/content/Context;DDLjava/lang/String;DDLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowCostDetail", "(Landroid/content/Context;DDLjava/lang/String;DDLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (onClickListener2 != null) {
            i0Var.f205311f = onClickListener2;
            i0Var.findViewById(C0966R.C0970id.hll).setOnClickListener(new C70893h0(i0Var));
        }
        i0Var.show();
        C76879j.m92730a(context, i0Var);
        if (i2 == 1) {
            C115669n.INSTANCE.mo160131h(12689, 10, 1);
        } else {
            C115669n.INSTANCE.mo160131h(12689, 1, 1);
        }
        return i0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() != C0966R.C0970id.hll) {
            Log.m105924i("RemittanceChargeDialog", "click cancel");
            dismiss();
        }
        if (view.getId() == C0966R.C0970id.apy) {
            if (this.f205310e == 1) {
                C115669n.INSTANCE.mo160131h(12689, 11, 1);
            } else {
                C115669n.INSTANCE.mo160131h(12689, 2, 1);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public C70896i0(Context context, int i) {
        super(context, C0966R.style.a6_);
        this.f205310e = 0;
        View inflate = View.inflate(context, C0966R.C0971layout.brn, (ViewGroup) null);
        this.f205309d = inflate;
        setContentView(inflate);
        ((Button) this.f205309d.findViewById(C0966R.C0970id.apy)).setOnClickListener(this);
        ((Button) this.f205309d.findViewById(C0966R.C0970id.f38)).setOnClickListener(this);
    }
}
