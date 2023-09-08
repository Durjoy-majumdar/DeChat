package ve1;

import android.widget.TextView;
import cm1.C55023m1;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import er1.C7878t0;
import jq3.C60905o;
import p629ny.C76979h;

/* renamed from: ve1.u5 */
public final class C65673u5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f188959d;

    /* renamed from: e */
    public final /* synthetic */ TextView f188960e;

    /* renamed from: f */
    public final /* synthetic */ String f188961f;

    /* renamed from: g */
    public final /* synthetic */ TextView f188962g;

    /* renamed from: h */
    public final /* synthetic */ C55023m1 f188963h;

    public C65673u5(C60905o oVar, TextView textView, String str, TextView textView2, C55023m1 m1Var) {
        this.f188959d = oVar;
        this.f188960e = textView;
        this.f188961f = str;
        this.f188962g = textView2;
        this.f188963h = m1Var;
    }

    public final void run() {
        Class cls = C76979h.class;
        if (((float) this.f188959d.mo85812D(C0966R.C0970id.h_7).getWidth()) > this.f188960e.getPaint().measureText(this.f188961f)) {
            this.f188962g.setVisibility(8);
            this.f188960e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f188959d.f173499A, this.f188961f));
            return;
        }
        this.f188962g.setVisibility(0);
        this.f188962g.setText(this.f188959d.f173499A.getString(C0966R.string.eds, new Object[]{C7878t0.m8035d((long) this.f188963h.f154465d.field_aggregatedContacts.f182697e)}));
        this.f188960e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f188959d.f173499A, this.f188961f));
    }
}
