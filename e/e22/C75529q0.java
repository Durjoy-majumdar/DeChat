package e22;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import g22.C75845k;

/* renamed from: e22.q0 */
public class C75529q0 extends RecyclerView.C16631z implements C75845k {

    /* renamed from: A */
    public TextView f221909A;

    /* renamed from: B */
    public View f221910B;

    /* renamed from: C */
    public CheckBox f221911C;

    /* renamed from: D */
    public WeImageView f221912D;

    /* renamed from: E */
    public TextView f221913E;

    /* renamed from: F */
    public Context f221914F;

    /* renamed from: z */
    public MMTextView f221915z;

    public C75529q0(View view) {
        super(view);
        this.f221914F = view.getContext();
        this.f221910B = view.findViewById(C0966R.C0970id.fme);
        this.f221915z = (MMTextView) view.findViewById(C0966R.C0970id.fgx);
        this.f221909A = (TextView) view.findViewById(C0966R.C0970id.fgw);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.fgv);
        this.f221911C = (CheckBox) view.findViewById(C0966R.C0970id.bkf);
        this.f221912D = (WeImageView) view.findViewById(C0966R.C0970id.bke);
        this.f221913E = (TextView) view.findViewById(C0966R.C0970id.fmf);
    }

    /* renamed from: a3 */
    public void mo105849a3() {
        this.f221910B.setBackgroundColor(this.f221914F.getResources().getColor(C0966R.color.f2928b));
    }

    /* renamed from: e */
    public void mo105850e() {
        this.f221910B.setBackground(this.f221914F.getResources().getDrawable(C0966R.C0969drawable.ar5));
    }

    public C75529q0(View view, int i) {
        super(view);
    }
}
