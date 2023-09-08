package ve1;

import android.widget.TextView;
import cm1.C55024n1;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import er1.C7878t0;
import jq3.C60905o;
import p629ny.C76979h;

/* renamed from: ve1.x5 */
public final class C65677x5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f188974d;

    /* renamed from: e */
    public final /* synthetic */ TextView f188975e;

    /* renamed from: f */
    public final /* synthetic */ String f188976f;

    /* renamed from: g */
    public final /* synthetic */ TextView f188977g;

    /* renamed from: h */
    public final /* synthetic */ C55024n1 f188978h;

    public C65677x5(C60905o oVar, TextView textView, String str, TextView textView2, C55024n1 n1Var) {
        this.f188974d = oVar;
        this.f188975e = textView;
        this.f188976f = str;
        this.f188977g = textView2;
        this.f188978h = n1Var;
    }

    public final void run() {
        Class cls = C76979h.class;
        if (((float) this.f188974d.mo85812D(C0966R.C0970id.h_7).getWidth()) > this.f188975e.getPaint().measureText(this.f188976f)) {
            this.f188977g.setVisibility(8);
            this.f188975e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f188974d.f173499A, this.f188976f));
            return;
        }
        this.f188977g.setVisibility(0);
        this.f188977g.setText(this.f188974d.f173499A.getString(C0966R.string.eds, new Object[]{C7878t0.m8035d((long) this.f188978h.f154465d.field_aggregatedContacts.f182697e)}));
        this.f188975e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f188974d.f173499A, this.f188976f));
    }
}
