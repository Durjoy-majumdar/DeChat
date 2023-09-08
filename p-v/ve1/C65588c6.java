package ve1;

import android.widget.TextView;
import cm1.C55025o1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C7878t0;
import jq3.C60905o;
import p629ny.C76979h;

/* renamed from: ve1.c6 */
public final class C65588c6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f188726d;

    /* renamed from: e */
    public final /* synthetic */ TextView f188727e;

    /* renamed from: f */
    public final /* synthetic */ String f188728f;

    /* renamed from: g */
    public final /* synthetic */ C65597g6 f188729g;

    /* renamed from: h */
    public final /* synthetic */ C55025o1 f188730h;

    /* renamed from: i */
    public final /* synthetic */ TextView f188731i;

    public C65588c6(C60905o oVar, TextView textView, String str, C65597g6 g6Var, C55025o1 o1Var, TextView textView2) {
        this.f188726d = oVar;
        this.f188727e = textView;
        this.f188728f = str;
        this.f188729g = g6Var;
        this.f188730h = o1Var;
        this.f188731i = textView2;
    }

    public final void run() {
        Class cls = C76979h.class;
        int width = this.f188726d.mo85812D(C0966R.C0970id.h_7).getWidth();
        float measureText = this.f188727e.getPaint().measureText(this.f188728f);
        String str = this.f188729g.f188759h;
        Log.m105918d(str, "allWidth:" + width + " nicknameWidth:" + measureText + " count:" + this.f188730h.f154465d.mo90404m2());
        if (((float) width) > measureText) {
            this.f188731i.setVisibility(8);
            this.f188727e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f188726d.f173499A, this.f188728f));
            return;
        }
        this.f188731i.setVisibility(0);
        this.f188731i.setText(this.f188726d.f173499A.getString(C0966R.string.eds, new Object[]{C7878t0.m8035d((long) this.f188730h.f154465d.field_aggregatedContacts.f182697e)}));
        this.f188727e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f188726d.f173499A, this.f188728f));
    }
}
