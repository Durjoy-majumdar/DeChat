package ve1;

import android.widget.TextView;
import cm1.C55020j1;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import er1.C7878t0;
import jq3.C60905o;
import p629ny.C76979h;

/* renamed from: ve1.q5 */
public final class C65637q5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f188861d;

    /* renamed from: e */
    public final /* synthetic */ TextView f188862e;

    /* renamed from: f */
    public final /* synthetic */ String f188863f;

    /* renamed from: g */
    public final /* synthetic */ TextView f188864g;

    /* renamed from: h */
    public final /* synthetic */ C55020j1 f188865h;

    public C65637q5(C60905o oVar, TextView textView, String str, TextView textView2, C55020j1 j1Var) {
        this.f188861d = oVar;
        this.f188862e = textView;
        this.f188863f = str;
        this.f188864g = textView2;
        this.f188865h = j1Var;
    }

    public final void run() {
        Class cls = C76979h.class;
        if (((float) this.f188861d.mo85812D(C0966R.C0970id.h_7).getWidth()) > this.f188862e.getPaint().measureText(this.f188863f)) {
            this.f188864g.setVisibility(8);
            this.f188862e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f188861d.f173499A, this.f188863f));
            return;
        }
        this.f188864g.setVisibility(0);
        this.f188864g.setText(this.f188861d.f173499A.getString(C0966R.string.eds, new Object[]{C7878t0.m8035d((long) this.f188865h.f154465d.field_aggregatedContacts.f182697e)}));
        this.f188862e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f188861d.f173499A, this.f188863f));
    }
}
