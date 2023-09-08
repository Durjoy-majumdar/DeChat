package ye1;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import p192l4.C10461a;
import p192l4.C10462b;

/* renamed from: ye1.t */
public final class C66634t implements C10461a {

    /* renamed from: a */
    public final C66631m f191603a;

    /* renamed from: b */
    public final C66631m f191604b;

    /* renamed from: c */
    public final C66631m f191605c;

    /* renamed from: d */
    public final TextView f191606d;

    /* renamed from: e */
    public final LinearLayout f191607e;

    /* renamed from: f */
    public final TextView f191608f;

    public C66634t(LinearLayout linearLayout, C66631m mVar, C66631m mVar2, C66631m mVar3, TextView textView, LinearLayout linearLayout2, TextView textView2) {
        this.f191603a = mVar;
        this.f191604b = mVar2;
        this.f191605c = mVar3;
        this.f191606d = textView;
        this.f191607e = linearLayout2;
        this.f191608f = textView2;
    }

    /* renamed from: a */
    public static C66634t m78607a(View view) {
        int i = C0966R.C0970id.ard;
        View a = C10462b.m10395a(view, C0966R.C0970id.ard);
        if (a != null) {
            C66631m a2 = C66631m.m78605a(a);
            i = C0966R.C0970id.are;
            View a3 = C10462b.m10395a(view, C0966R.C0970id.are);
            if (a3 != null) {
                C66631m a4 = C66631m.m78605a(a3);
                i = C0966R.C0970id.arf;
                View a5 = C10462b.m10395a(view, C0966R.C0970id.arf);
                if (a5 != null) {
                    C66631m a6 = C66631m.m78605a(a5);
                    i = C0966R.C0970id.foo;
                    TextView textView = (TextView) C10462b.m10395a(view, C0966R.C0970id.foo);
                    if (textView != null) {
                        i = C0966R.C0970id.fop;
                        LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(view, C0966R.C0970id.fop);
                        if (linearLayout != null) {
                            i = C0966R.C0970id.knx;
                            TextView textView2 = (TextView) C10462b.m10395a(view, C0966R.C0970id.knx);
                            if (textView2 != null) {
                                return new C66634t((LinearLayout) view, a2, a4, a6, textView, linearLayout, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
