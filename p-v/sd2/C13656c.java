package sd2;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import kg3.C76577a;

/* renamed from: sd2.c */
public class C13656c extends Preference {

    /* renamed from: J */
    public View f38685J = null;

    /* renamed from: K */
    public ImageView f38686K;

    /* renamed from: L */
    public TextView f38687L;

    /* renamed from: M */
    public View.OnClickListener f38688M;

    /* renamed from: N */
    public String f38689N = "";

    /* renamed from: P */
    public Bitmap f38690P = null;

    public C13656c(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.baf;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f38685J == null) {
            this.f38685J = mo1087x(viewGroup);
        }
        mo1086w(this.f38685J);
        return this.f38685J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f38687L = (TextView) view.findViewById(C0966R.C0970id.f358706gm0);
        this.f38686K = (ImageView) view.findViewById(C0966R.C0970id.glz);
        this.f38687L.setText(this.f38689N);
        this.f38686K.setImageBitmap(this.f38690P);
        this.f38686K.setOnClickListener(this.f38688M);
        String str = this.f38689N;
        if (str != null && str.length() > 48) {
            this.f38687L.setTextSize(0, (float) C76577a.m92157h(this.f121274d, C0966R.dimen.f3881hq));
        }
    }
}
