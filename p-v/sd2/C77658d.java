package sd2;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import f12.C7970a;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import nd2.C76853c;

/* renamed from: sd2.d */
public class C77658d extends Preference {

    /* renamed from: J */
    public View f226389J = null;

    /* renamed from: K */
    public View.OnClickListener f226390K;

    /* renamed from: L */
    public String f226391L;

    /* renamed from: M */
    public String f226392M;

    public C77658d(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bag;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f226389J == null) {
            this.f226389J = mo1087x(viewGroup);
        }
        mo1086w(this.f226389J);
        return this.f226389J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        String str;
        super.mo1086w(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f358708gm2);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.f358709gm3);
        imageView.setImageBitmap((Bitmap) null);
        if (!Util.isNullOrNil(this.f226392M)) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            C76853c.vx0().getClass();
            if (C86709a0.m107522a()) {
                str = C7970a.m8127a() + "order";
            } else {
                str = "";
            }
            bVar.f59351g = str;
            bVar.f59346b = true;
            bVar.f59363s = true;
            bVar.f59364t = true;
            C20828a.m22825b().mo32519h(this.f226392M, imageView, bVar.mo32666a());
        }
        textView.setText(this.f226391L);
        view.findViewById(C0966R.C0970id.f358707gm1).setOnClickListener(this.f226390K);
    }
}
