package qj1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import qn3.C77382c;

/* renamed from: qj1.x8 */
public final class C63106x8 implements C77382c.C77383a {

    /* renamed from: d */
    public final /* synthetic */ C62949r8 f179083d;

    /* renamed from: e */
    public final /* synthetic */ int f179084e;

    public C63106x8(C62949r8 r8Var, int i) {
        this.f179083d = r8Var;
        this.f179084e = i;
    }

    /* renamed from: L0 */
    public void mo4083L0(String str) {
        this.f179083d.f178650y.setText(String.valueOf(C45078p0.m49923b(this.f179084e, str)));
        C62949r8 r8Var = this.f179083d;
        r8Var.f178650y.setTextColor(r8Var.f178626F.getResources().getColor(C0966R.color.f2966ao));
        this.f179083d.f178650y.setVisibility(0);
        this.f179083d.f178648w.setEnabled(false);
    }

    /* renamed from: L3 */
    public void mo4084L3(String str) {
        this.f179083d.f178650y.setVisibility(8);
        this.f179083d.f178648w.setEnabled(true);
    }

    /* renamed from: P4 */
    public void mo4086P4(String str) {
        int b = C45078p0.m49923b(this.f179084e, str);
        if (b > 5) {
            this.f179083d.f178650y.setVisibility(8);
        } else {
            this.f179083d.f178650y.setText(String.valueOf(b));
            C62949r8 r8Var = this.f179083d;
            r8Var.f178650y.setTextColor(r8Var.f178626F.getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
            this.f179083d.f178650y.setVisibility(0);
        }
        this.f179083d.f178648w.setEnabled(true);
    }
}
