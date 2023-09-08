package ye1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: ye1.w */
public final class C15982w implements C10461a {

    /* renamed from: a */
    public final CheckBox f42999a;

    /* renamed from: b */
    public final TextView f43000b;

    public C15982w(RelativeLayout relativeLayout, CheckBox checkBox, TextView textView, TextView textView2) {
        this.f42999a = checkBox;
        this.f43000b = textView;
    }

    /* renamed from: a */
    public static C15982w m14890a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0966R.C0971layout.anf, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0966R.C0970id.e48;
        CheckBox checkBox = (CheckBox) C10462b.m10395a(inflate, C0966R.C0970id.e48);
        if (checkBox != null) {
            i = C0966R.C0970id.e4a;
            TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.e4a);
            if (textView != null) {
                i = C0966R.C0970id.knx;
                TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.knx);
                if (textView2 != null) {
                    return new C15982w((RelativeLayout) inflate, checkBox, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
