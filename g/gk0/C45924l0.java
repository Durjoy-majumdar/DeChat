package gk0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import qo3.C77389a;
import qo3.C77398g;
import te3.C52225z7;

/* renamed from: gk0.l0 */
public class C45924l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f123906d;

    /* renamed from: e */
    public final /* synthetic */ int f123907e;

    /* renamed from: f */
    public final /* synthetic */ C52225z7 f123908f;

    /* renamed from: g */
    public final /* synthetic */ int f123909g;

    /* renamed from: h */
    public final /* synthetic */ String f123910h;

    /* renamed from: i */
    public final /* synthetic */ LinkedList f123911i;

    /* renamed from: j */
    public final /* synthetic */ C45931t0 f123912j;

    public C45924l0(C45931t0 t0Var, C83780d1 d1Var, int i, C52225z7 z7Var, int i2, String str, LinkedList linkedList) {
        this.f123912j = t0Var;
        this.f123906d = d1Var;
        this.f123907e = i;
        this.f123908f = z7Var;
        this.f123909g = i2;
        this.f123910h = str;
        this.f123911i = linkedList;
    }

    public void run() {
        C45931t0 t0Var = this.f123912j;
        C83780d1 d1Var = this.f123906d;
        int i = this.f123907e;
        C52225z7 z7Var = this.f123908f;
        int i2 = this.f123909g;
        String str = this.f123910h;
        LinkedList linkedList = this.f123911i;
        t0Var.getClass();
        String string = i2 == 2 ? d1Var.getContext().getString(C0966R.string.f7609lc) : d1Var.getContext().getString(C0966R.string.f7610ld);
        String string2 = d1Var.getContext().getString(C0966R.string.f7611le);
        String string3 = d1Var.getContext().getString(C0966R.string.f7608lb);
        String string4 = d1Var.getContext().getString(C0966R.string.f7607la);
        LayoutInflater layoutInflater = (LayoutInflater) d1Var.getContext().getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.f6388dh, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f5868qw);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.f5869qx);
        ((TextView) inflate.findViewById(C0966R.C0970id.f5867qv)).setText(str);
        textView.setText(string4);
        textView.setOnClickListener(new C45927p0(t0Var, d1Var));
        linearLayout.removeAllViews();
        if (linkedList == null || linkedList.size() <= 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.leftMargin = 0;
            textView.setLayoutParams(layoutParams);
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                TextView textView2 = (TextView) layoutInflater.inflate(C0966R.C0971layout.f6382db, (ViewGroup) null);
                textView2.setText((String) it.next());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.bottomMargin = d1Var.f244552D.getResources().getDimensionPixelOffset(C0966R.dimen.f4068qe);
                textView2.setLayoutParams(layoutParams2);
                linearLayout.addView(textView2);
            }
        }
        Log.m105924i("MicroMsg.JsApiRequestAuthUserAutoFillData", "show the auto fill data protocol dialog!");
        Context context = d1Var.getContext();
        C77389a aVar = new C77389a();
        aVar.f225644a = string;
        aVar.f225627J = inflate;
        aVar.f225669z = false;
        aVar.f225668y = false;
        aVar.f225663t = string2;
        aVar.f225620C = new C45929r0(t0Var, z7Var, d1Var, i);
        aVar.f225664u = string3;
        aVar.f225621D = new C45928q0(t0Var, z7Var, d1Var, i);
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
    }
}
