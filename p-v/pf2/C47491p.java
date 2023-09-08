package pf2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nf2.C47240a;

/* renamed from: pf2.p */
public final class C47491p extends RecyclerView.C16631z {

    /* renamed from: A */
    public final String f127402A = "FeaturedMsgSinglePicViewHolder";

    /* renamed from: B */
    public final Context f127403B;

    /* renamed from: C */
    public final View f127404C;

    /* renamed from: D */
    public final View f127405D;

    /* renamed from: E */
    public final TextView f127406E;

    /* renamed from: F */
    public final TextView f127407F;

    /* renamed from: G */
    public final TextView f127408G;

    /* renamed from: H */
    public final ImageView f127409H;

    /* renamed from: I */
    public final TextView f127410I;

    /* renamed from: z */
    public final C47240a f127411z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47491p(C47240a aVar, View view) {
        super(view);
        C87412m.m108594g(aVar, "adapter");
        C87412m.m108594g(view, "itemView");
        this.f127411z = aVar;
        this.f127403B = aVar.f126805d;
        this.f127404C = view.findViewById(C0966R.C0970id.hmb);
        this.f127405D = view.findViewById(C0966R.C0970id.ikt);
        this.f127406E = (TextView) view.findViewById(C0966R.C0970id.iks);
        this.f127407F = (TextView) view.findViewById(C0966R.C0970id.oc4);
        this.f127408G = (TextView) view.findViewById(C0966R.C0970id.f357767oc2);
        this.f127409H = (ImageView) view.findViewById(C0966R.C0970id.irt);
        this.f127410I = (TextView) view.findViewById(C0966R.C0970id.iku);
    }
}
