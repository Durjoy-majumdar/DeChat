package ve1;

import android.widget.TextView;
import cm1.C55021k1;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import er1.C7878t0;
import jq3.C60905o;
import p629ny.C76979h;

/* renamed from: ve1.n5 */
public final class C65630n5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f188844d;

    /* renamed from: e */
    public final /* synthetic */ TextView f188845e;

    /* renamed from: f */
    public final /* synthetic */ String f188846f;

    /* renamed from: g */
    public final /* synthetic */ TextView f188847g;

    /* renamed from: h */
    public final /* synthetic */ C55021k1 f188848h;

    public C65630n5(C60905o oVar, TextView textView, String str, TextView textView2, C55021k1 k1Var) {
        this.f188844d = oVar;
        this.f188845e = textView;
        this.f188846f = str;
        this.f188847g = textView2;
        this.f188848h = k1Var;
    }

    public final void run() {
        Class cls = C76979h.class;
        if (((float) this.f188844d.mo85812D(C0966R.C0970id.h_7).getWidth()) > this.f188845e.getPaint().measureText(this.f188846f)) {
            this.f188847g.setVisibility(8);
            this.f188845e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f188844d.f173499A, this.f188846f));
            return;
        }
        this.f188847g.setVisibility(0);
        this.f188847g.setText(this.f188844d.f173499A.getString(C0966R.string.eds, new Object[]{C7878t0.m8035d((long) this.f188848h.f154465d.field_aggregatedContacts.f182697e)}));
        this.f188845e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f188844d.f173499A, this.f188846f));
    }
}
