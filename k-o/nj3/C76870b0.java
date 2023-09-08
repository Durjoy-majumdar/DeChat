package nj3;

import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import qo3.C101218e0;

/* renamed from: nj3.b0 */
public class C76870b0 extends C101218e0 {

    /* renamed from: L */
    public TextView f224692L = ((TextView) this.f296384g.findViewById(C0966R.C0970id.knm));

    /* renamed from: M */
    public TextView f224693M = ((TextView) this.f296384g.findViewById(C0966R.C0970id.kna));

    /* renamed from: N */
    public Button f224694N = ((Button) this.f296384g.findViewById(C0966R.C0970id.hfe));

    /* renamed from: P */
    public Button f224695P = ((Button) this.f296384g.findViewById(C0966R.C0970id.apy));

    /* renamed from: Q */
    public ImageView f224696Q = ((ImageView) this.f296384g.findViewById(C0966R.C0970id.f357942cl3));

    /* renamed from: R */
    public TextView f224697R = ((TextView) this.f296384g.findViewById(C0966R.C0970id.ckw));

    /* renamed from: S */
    public Context f224698S;

    public C76870b0(Context context) {
        super(context);
        this.f224698S = context;
        mo140662i(C0966R.C0971layout.ayu);
        this.f224696Q.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_outlined_error, context.getResources().getColor(C0966R.color.f2976b7)));
    }

    /* renamed from: c */
    public int mo8783c() {
        return C0966R.C0971layout.bcl;
    }
}
