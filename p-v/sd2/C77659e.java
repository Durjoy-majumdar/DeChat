package sd2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: sd2.e */
public class C77659e extends Preference {

    /* renamed from: J */
    public View f226393J = null;

    /* renamed from: K */
    public View.OnClickListener f226394K = null;

    /* renamed from: L */
    public String f226395L;

    public C77659e(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bah;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f226393J == null) {
            this.f226393J = mo1087x(viewGroup);
        }
        mo1086w(this.f226393J);
        return this.f226393J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.gm4);
        textView.setText(this.f226395L);
        textView.setOnClickListener(this.f226394K);
    }
}
