package ve1;

import android.widget.TextView;
import cm1.C55017i1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C7878t0;
import jq3.C60905o;
import p629ny.C76979h;

/* renamed from: ve1.i5 */
public final class C65607i5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f188784d;

    /* renamed from: e */
    public final /* synthetic */ TextView f188785e;

    /* renamed from: f */
    public final /* synthetic */ String f188786f;

    /* renamed from: g */
    public final /* synthetic */ C65625m5 f188787g;

    /* renamed from: h */
    public final /* synthetic */ C55017i1 f188788h;

    /* renamed from: i */
    public final /* synthetic */ TextView f188789i;

    public C65607i5(C60905o oVar, TextView textView, String str, C65625m5 m5Var, C55017i1 i1Var, TextView textView2) {
        this.f188784d = oVar;
        this.f188785e = textView;
        this.f188786f = str;
        this.f188787g = m5Var;
        this.f188788h = i1Var;
        this.f188789i = textView2;
    }

    public final void run() {
        Class cls = C76979h.class;
        int width = this.f188784d.mo85812D(C0966R.C0970id.h_7).getWidth();
        float measureText = this.f188785e.getPaint().measureText(this.f188786f);
        String str = this.f188787g.f188835h;
        Log.m105918d(str, "allWidth:" + width + " nicknameWidth:" + measureText + " count:" + this.f188788h.f154465d.mo90404m2());
        if (((float) width) > measureText) {
            this.f188789i.setVisibility(8);
            this.f188785e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f188784d.f173499A, this.f188786f));
            return;
        }
        this.f188789i.setVisibility(0);
        this.f188789i.setText(this.f188784d.f173499A.getString(C0966R.string.eds, new Object[]{C7878t0.m8035d((long) this.f188788h.f154465d.field_aggregatedContacts.f182697e)}));
        this.f188785e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f188784d.f173499A, this.f188786f));
    }
}
