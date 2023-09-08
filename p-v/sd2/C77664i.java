package sd2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: sd2.i */
public class C77664i extends Preference {

    /* renamed from: J */
    public View f226414J = null;

    /* renamed from: K */
    public int f226415K = Integer.MAX_VALUE;

    /* renamed from: L */
    public String f226416L;

    public C77664i(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bam;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f226414J == null) {
            this.f226414J = mo1087x(viewGroup);
        }
        mo1086w(this.f226414J);
        return this.f226414J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.gmb);
        ((TextView) view.findViewById(C0966R.C0970id.gmc)).setText(this.f121279i);
        textView.setText(this.f226416L);
        int i = this.f226415K;
        if (i != Integer.MAX_VALUE) {
            textView.setTextColor(i);
        }
    }
}
